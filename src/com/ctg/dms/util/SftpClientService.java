package com.ctg.dms.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.vfs.FileObject;
import org.apache.commons.vfs.FileSystem;
import org.apache.commons.vfs.FileSystemException;
import org.apache.commons.vfs.FileSystemOptions;
import org.apache.commons.vfs.UserAuthenticator;
import org.apache.commons.vfs.auth.StaticUserAuthenticator;
import org.apache.commons.vfs.impl.DefaultFileSystemConfigBuilder;
import org.apache.commons.vfs.impl.StandardFileSystemManager;
import org.apache.commons.vfs.provider.sftp.SftpFileSystem;
import org.apache.commons.vfs.provider.sftp.SftpFileSystemConfigBuilder;
import org.apache.log4j.Logger;

import com.ctg.dms.dto.ServerDetailsDTO;

public class SftpClientService {
	private static final Logger log = Logger.getLogger(SftpClientService.class);

	public  boolean writeFile(ServerDetailsDTO conDetails, String filePath, byte[] fileContent) 
	throws IOException{
		FileObject fileObject2 = null;
		FileObject fileObject =null;
		StandardFileSystemManager manager=null;
		try{
		
		manager = new StandardFileSystemManager();
		manager.init();
		UserAuthenticator auth = new StaticUserAuthenticator(null, conDetails.getUserName(), conDetails.getPassword());
		FileSystemOptions opts = new FileSystemOptions();
		DefaultFileSystemConfigBuilder.getInstance().setUserAuthenticator(opts, auth);
		SftpFileSystemConfigBuilder.getInstance().setStrictHostKeyChecking(opts, "no");

		String fileUri = buildUri(conDetails, filePath);
		fileObject = manager.resolveFile(fileUri+".tmp", opts);
		OutputStream os = fileObject.getContent().getOutputStream();
		int size = fileContent.length;
		try{
			for(int index = 0; index < fileContent.length; index += 4000, size -= 4000){
				os.write(fileContent, index, size > 4000 ? 4000 : size);
				if(Thread.currentThread().isInterrupted()){
					fileObject.getContent().close();
					fileObject.delete();
					return false;
				}
			}
			os.flush();
		} finally {
			fileObject.getContent().close();
		}
		
		 fileObject2 = manager.resolveFile(fileUri, opts);
		fileObject.moveTo(fileObject2);
		((SftpFileSystem)fileObject2.getFileSystem()).closeCommunicationLink();
		((SftpFileSystem)fileObject.getFileSystem()).closeCommunicationLink();
	
		}catch(IOException e)
		{
			throw e;
		}
		finally
		{
				try{
					
					FileSystem fs = null;
				
					if(fileObject2!=null)
					{
						fs = fileObject2.getFileSystem(); 
						manager.closeFileSystem(fs);
					}
				
				fs=null;
					if(fileObject!=null)
					{
						fs=fileObject.getFileSystem();
						manager.closeFileSystem(fs);
					}
				}finally
				{
					//Just ignore the exception
				}
		}
		return true;
		
	}
	
	public boolean zipFiles(ServerDetailsDTO conDetails, String outputFileName, List<String> fileNames, String filePath) {
		 UserAuthenticator auth = new StaticUserAuthenticator(null, conDetails.getUserName(), conDetails.getPassword());
		 FileSystemOptions opts = new FileSystemOptions();
		 FileObject fileObject =null;
		 StandardFileSystemManager manager=null;
		 manager = new StandardFileSystemManager();
		try {
			manager.init();
		} catch (FileSystemException e1) {
			e1.printStackTrace();
			return false;
		}
		try {
			DefaultFileSystemConfigBuilder.getInstance().setUserAuthenticator(opts, auth);
			SftpFileSystemConfigBuilder.getInstance().setStrictHostKeyChecking(opts, "no");
		} catch (FileSystemException e) {
			e.printStackTrace();
			return false;
		}
	     try{
	    	System.out.println("Output to Zip : " + outputFileName);
	    	String fileUri = buildUri(conDetails, filePath+outputFileName);
			fileObject = manager.resolveFile(fileUri, opts);
			OutputStream os = fileObject.getContent().getOutputStream();
	    	ZipOutputStream zos = new ZipOutputStream(os);
	    	for(String file : fileNames){
	    		System.out.println("File Added : " + file);
	    		ZipEntry ze= new ZipEntry(file);
	        	zos.putNextEntry(ze);
	        	zos.write(readFile(conDetails, filePath+file));
	    	}
	    	zos.closeEntry();
	    	//remember close it
	    	zos.close();
	    	return true;
	    }catch(IOException ex){
	       ex.printStackTrace();   
	       return false;
	    }	
	    finally
		{
			try{
				
				FileSystem fs = null;
			
				if(fileObject!=null)
				{
					fs = fileObject.getFileSystem(); 
					manager.closeFileSystem(fs);
				}
			}finally
			{
			}
		}
			
	}
	
	public boolean moveFile(ServerDetailsDTO conDetails, String filePath1, String filePath2) 
	throws IOException{
		FileObject fileObject2 = null;
		FileObject fileObject1 =null;
		StandardFileSystemManager manager=null;
		try{
		
		manager = new StandardFileSystemManager();
		manager.init();
		UserAuthenticator auth = new StaticUserAuthenticator(null, conDetails.getUserName(), conDetails.getPassword());
		FileSystemOptions opts = new FileSystemOptions();
		DefaultFileSystemConfigBuilder.getInstance().setUserAuthenticator(opts, auth);
		SftpFileSystemConfigBuilder.getInstance().setStrictHostKeyChecking(opts, "no");

		String fileUri1 = buildUri(conDetails, filePath1);
		 fileObject1 = manager.resolveFile(fileUri1, opts);
		String fileUri2 = buildUri(conDetails, filePath2);
		fileObject2 = manager.resolveFile(fileUri2, opts);		
		fileObject1.moveTo(fileObject2);
		
		((SftpFileSystem)fileObject2.getFileSystem()).closeCommunicationLink();
		((SftpFileSystem)fileObject1.getFileSystem()).closeCommunicationLink();

		}catch(IOException e)
		{
			throw e;
		}
		finally
		{
				try{
						FileSystem fs = null;
							if(fileObject2!=null)
							{
						        fs = fileObject2.getFileSystem(); 
						        manager.closeFileSystem(fs);
							}
							
						fs=null;
						if(fileObject1!=null)
							{
								fs=fileObject1.getFileSystem();
								manager.closeFileSystem(fs);
							}
				}finally{}
		}
		
		return true;
	}

	public byte[] readFile(ServerDetailsDTO conDetails, String filePath) 
	throws IOException{
		
		FileObject fileObject =null;
		StandardFileSystemManager manager=null;
		try{
		
		manager = new StandardFileSystemManager();
		manager.init();

		UserAuthenticator auth = new StaticUserAuthenticator(null, conDetails.getUserName(), conDetails.getPassword());
		FileSystemOptions opts = new FileSystemOptions();

		DefaultFileSystemConfigBuilder.getInstance().setUserAuthenticator(opts, auth);
		SftpFileSystemConfigBuilder.getInstance().setStrictHostKeyChecking(opts, "no");

		String fileUri = buildUri(conDetails, filePath);
		
			fileObject = manager.resolveFile(fileUri, opts);
			if(fileObject.isReadable()){
				InputStream is = fileObject.getContent().getInputStream();
				int size = (int)fileObject.getContent().getSize();
				byte[] fileContent = new byte[size];
				for(int index = 0; size > 0; index += 4000, size -= 4000 ){
					is.read(fileContent, index, size < 4000 ? size : 4000);
					if(Thread.currentThread().isInterrupted()){
						return null;
					}
				}
				return fileContent;
			} 		    
			return null;
		} finally {
			try{
					if(fileObject != null){
						fileObject.getContent().close();
						((SftpFileSystem)fileObject.getFileSystem()).closeCommunicationLink();
						FileSystem fs = null;
					       fs = fileObject.getFileSystem(); 
					        manager.closeFileSystem(fs);
					
					}
				}finally{}
		}
		

	}

	public Boolean fileExists(ServerDetailsDTO conDetails, String filePath){
		
		FileObject fileObject =null;
		StandardFileSystemManager manager=null;
		try{
		
		manager = new StandardFileSystemManager();
		manager.init();
		UserAuthenticator auth = new StaticUserAuthenticator(null, conDetails.getUserName(), conDetails.getPassword());
		FileSystemOptions opts = new FileSystemOptions();

			DefaultFileSystemConfigBuilder.getInstance().setUserAuthenticator(opts, auth);
			SftpFileSystemConfigBuilder.getInstance().setStrictHostKeyChecking(opts, "no");

			String fileUri = buildUri(conDetails, filePath);
			fileObject = manager.resolveFile(fileUri, opts);
			return fileObject.exists() && fileObject.isReadable();
		} catch (FileSystemException e) {
			log.error("cannot access the server", e);
		} finally{
			try{
				if(fileObject != null){
					((SftpFileSystem)fileObject.getFileSystem()).closeCommunicationLink();
					FileSystem fs = null;
				        fs = fileObject.getFileSystem(); 
				        manager.closeFileSystem(fs);
				}
			}finally{}
		}
		
	
		return null;
	}

	public Long getfileSize(ServerDetailsDTO conDetails, String filePath){

		FileObject fileObject = null;
		StandardFileSystemManager manager=null;
		try {

		manager = new StandardFileSystemManager();
		manager.init();

		UserAuthenticator auth = new StaticUserAuthenticator(null, conDetails.getUserName(), conDetails.getPassword());
		FileSystemOptions opts = new FileSystemOptions();

			DefaultFileSystemConfigBuilder.getInstance().setUserAuthenticator(opts, auth);
			SftpFileSystemConfigBuilder.getInstance().setStrictHostKeyChecking(opts, "no");

			String fileUri = buildUri(conDetails, filePath);
			fileObject = manager.resolveFile(fileUri, opts);
			if(fileObject.exists()){
				return fileObject.getContent().getSize();
			}
		} catch (FileSystemException e) {
			log.error("cannot access the server", e);
		} finally {
			try{
				if(fileObject != null){
					((SftpFileSystem)fileObject.getFileSystem()).closeCommunicationLink();
					FileSystem fs = null;
			        fs = fileObject.getFileSystem(); 
			        manager.closeFileSystem(fs);
				}
			}finally{}
		}
		return null;
	}


	public List<String> getDirContent(ServerDetailsDTO conDetails, String filePath, String...extentions)
	throws IOException{
		FileObject fileObject = null;
		StandardFileSystemManager manager=null;
		try{
		
			manager = new StandardFileSystemManager();
			manager.init();

		UserAuthenticator auth = new StaticUserAuthenticator(null, conDetails.getUserName(), conDetails.getPassword());
		FileSystemOptions opts = new FileSystemOptions();

		DefaultFileSystemConfigBuilder.getInstance().setUserAuthenticator(opts, auth);
		SftpFileSystemConfigBuilder.getInstance().setStrictHostKeyChecking(opts, "no");

		String fileUri = buildUri(conDetails, filePath);
		
			fileObject = manager.resolveFile(fileUri, opts);
			if(!fileObject.exists()){
				return null;
			}
			List<String> fileNames = new ArrayList<String>();
			FileObject[] children = fileObject.getChildren();
			if(children != null){
				for (FileObject child : children) {
					String fileName = child.getName().getBaseName();
					if(extentions.length > 0){
						for (String extention : extentions) {
							if(fileName.endsWith(extention)){
								fileNames.add(fileName);
							}
						}
					} else {
						fileNames.add(fileName);
					}
				}
			}
			return fileNames;
		} finally {
			try{
				if(fileObject != null){
					((SftpFileSystem)fileObject.getFileSystem()).closeCommunicationLink();
					FileSystem fs = null;
			        fs = fileObject.getFileSystem(); 
			        manager.closeFileSystem(fs);
				}
			}finally{}
		}
	}

	public boolean deleteFile(ServerDetailsDTO conDetails, String filePath)
	throws IOException{

		FileObject fileObject = null;
		StandardFileSystemManager manager=null;
		try{
			manager = new StandardFileSystemManager();
			manager.init();
	
		UserAuthenticator auth = new StaticUserAuthenticator(null, conDetails.getUserName(), conDetails.getPassword());
		FileSystemOptions opts = new FileSystemOptions();

		DefaultFileSystemConfigBuilder.getInstance().setUserAuthenticator(opts, auth);
		SftpFileSystemConfigBuilder.getInstance().setStrictHostKeyChecking(opts, "no");

		String fileUri = buildUri(conDetails, filePath);
			fileObject = manager.resolveFile(fileUri, opts);
			return fileObject.delete();
		} finally {
			try{
		
				if(fileObject != null){
					((SftpFileSystem)fileObject.getFileSystem()).closeCommunicationLink();
					FileSystem fs = null;
			        fs = fileObject.getFileSystem(); 
			        manager.closeFileSystem(fs);
	
				}
			}finally{}
		}
	}

	private String buildUri(ServerDetailsDTO conDetails, String filePath){
		filePath = StringUtils.replaceChars(filePath, '\\', '/');

		StringBuilder sftpUri = new StringBuilder("sftp://").append(conDetails.getIp());
		if(conDetails.getPort() > 0){
			sftpUri.append(':').append(conDetails.getPort());
		}

		if(!filePath.startsWith("/")){
			sftpUri.append('/');
		}
		sftpUri.append(filePath);
		return sftpUri.toString();
	}
}
