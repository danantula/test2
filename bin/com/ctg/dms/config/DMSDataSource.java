package com.ctg.dms.config;

import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Properties;

import org.apache.commons.dbcp.BasicDataSource;

public class DMSDataSource extends BasicDataSource {
	private Properties connectionProperties;

	public void setConnectionProperties(Properties props) {
		Iterator entries = props.entrySet().iterator();
		while (entries.hasNext()) {
			Entry entry = (Entry) entries.next();
			addConnectionProperty((String)entry.getKey(), (String)entry.getValue());
		}
	}
}
