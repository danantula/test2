package com.ctg.dms.config;

import com.ctg.dms.dao.impl.sql.COMMON_CONSTANTS;

public class EnvironmentPropertyPlaceholderConfigurer {
	private static String stack;

	private static String application;

	public void setStack(String stack) {
		this.stack = stack;
	}

	public String getStack() {
		return stack;
	}

	public boolean isPrimary() {
		if (getStack().equalsIgnoreCase(COMMON_CONSTANTS.STACK_PRIMARY))
			return true;
		else
			return false;
	}

	public void setApplication(String application) {
		EnvironmentPropertyPlaceholderConfigurer.application = application;
	}

	public String getApplication() {
		return application;
	}

	public boolean isDMS() {
		if (getApplication().equalsIgnoreCase(COMMON_CONSTANTS.APPLICATION_DMS) || isBoth())
			return true;
		else
			return false;
	}

	public boolean isRDHI() {
		if (getApplication().equalsIgnoreCase(COMMON_CONSTANTS.APPLICATION_RDHI) || isBoth())
			return true;
		else
			return false;
	}

	public boolean isBoth() {
		if (getApplication().equalsIgnoreCase(COMMON_CONSTANTS.APPLICATION_BOTH))
			return true;
		if (!getApplication().equalsIgnoreCase(COMMON_CONSTANTS.APPLICATION_DMS)
				&& !getApplication().equalsIgnoreCase(COMMON_CONSTANTS.APPLICATION_RDHI))
			return true;
		return false;
	}

}
