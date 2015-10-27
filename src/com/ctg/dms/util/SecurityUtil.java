package com.ctg.dms.util;

public class SecurityUtil {
	private static final String[] ILLEGAL_CHARACTERS = {"<", ">", "{", "}", "$"};
	private static final String[] TEXT_AREA_ILLEGAL_CHARACTERS = {"script>","script&gt"};

	public static boolean checkForXSS(String unsafeInputString) {
    	boolean valid=false;
    	if(unsafeInputString == null){
    		return valid;
    	}
    	for(int i=0;i<ILLEGAL_CHARACTERS.length;i++){
    		if(unsafeInputString.contains(ILLEGAL_CHARACTERS[i])){
    			//log.error("Input String has illegal characters --"+unsafeInputString);
    			valid=true;
    		}
    	}
    	return valid;
}
	
	public static boolean TextAreaCheckForXSS(String unsafeInputString) {
    	boolean valid=false;
    	if(unsafeInputString == null){
    		return valid;
    	}
    	for(int i=0;i<TEXT_AREA_ILLEGAL_CHARACTERS.length;i++){
    		if(unsafeInputString.toUpperCase().contains(TEXT_AREA_ILLEGAL_CHARACTERS[i].toUpperCase())){
    			//log.error("Input String has illegal characters --"+unsafeInputString);
    			valid=true;
    		}
    	}
    	return valid;
}
}
