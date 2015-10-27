package com.ctg.dms.dto.validator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;
import org.apache.struts.action.ActionMessage;
import org.apache.struts.action.ActionMessages;

import com.ctg.dms.config.DMSPropertiesUtil;

public class DtoValidationException extends Exception {
	
	private static final long serialVersionUID = 1L;
	private List<ValidationError> errors = new ArrayList<ValidationError>();
	private static final Logger log = Logger.getLogger(DtoValidationException.class);
	
	public DtoValidationException(List<ValidationError> errors) {
		super();
		this.errors = errors;
		StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
		log.error("Validation error occured for class : " + stackTraceElements[2].getClassName() + " method : " + stackTraceElements[2].getMethodName());
		log.info(errors);
	}

	public DtoValidationException(ValidationError error) {
		super();
		errors.add(error);
		StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
		log.error("Validation error occured for class : " + stackTraceElements[2].getClassName() + " method : " + stackTraceElements[2].getMethodName());
		log.info(errors);
	}
	public List<ValidationError> getErrors() {
		return errors;
	}

	public void setErrors(List<ValidationError> errors) {
		this.errors = errors;
	}

	@Override
	public String toString() {
		return "DtoValidationException [errors=" + errors + "]";
	}
	
	public ActionMessages toMCBErrorMessages() {
		return toActionMessages("MCB");
	}
	
	/**
	 * This method will create ActionMessages from the list of errors.
	 * The mapping of key in the error field to the corresponding element in jsp/html
	 * is done by comparing the prefix 'AuthorisationMapping' along with the key
	 * with the content of mapping file 'struts-field-mapping.properties'. 
	 * If the mapping is found then the key will be
	 * replaced by the mapping value. If not it will be replaced by a generic 'misc' value.
	 * 
	 * @param mappingPrefix
	 * @return ActionMessages
	 */
	public ActionMessages toAuthorisationErrorMessages() {
		return toActionMessages("AuthorisationMapping");
	}
	
	/**
	 * This method will create ActionMessages from the list of errors.
	 * The mapping of key in the error field to the corresponding element in jsp/html
	 * is done by comparing the prefix 'ServiceRequestMapping' along with the key
	 * with the content of mapping file 'struts-field-mapping.properties'. 
	 * If the mapping is found then the key will be
	 * replaced by the mapping value. If not it will be replaced by a generic 'misc' value.
	 * 
	 * @param mappingPrefix
	 * @return ActionMessages
	 */
	public ActionMessages toServiceRequestErrorMessages() {
		return toActionMessages("ServiceRequestMapping");
	}
	
	/**
	 * This method will create ActionMessages from the list of errors.
	 * The mapping of key in the error field to the corresponding element in jsp/html
	 * is done by comparing the prefix 'FCRMapping' along with the key
	 * with the content of mapping file 'struts-field-mapping.properties'. 
	 * If the mapping is found then the key will be
	 * replaced by the mapping value. If not it will be replaced by a generic 'misc' value.
	 * 
	 * @param mappingPrefix
	 * @return ActionMessages
	 */
	public ActionMessages toFCRErrorMessages() {
		return toActionMessages("FCRMapping");
	}
	
	/**
	 * This method will create ActionMessages from the list of errors.
	 * The mapping of key in the error field to the corresponding element in jsp/html
	 * is done by comparing the prefix 'FCRMapping' along with the key
	 * with the content of mapping file 'struts-field-mapping.properties'. 
	 * If the mapping is found then the key will be
	 * replaced by the mapping value. If not it will be replaced by a generic 'misc' value.
	 * 
	 * @param mappingPrefix
	 * @return ActionMessages
	 */
	public String toRDHIErrorMessages() {
		String errorMessages = "";
		int idx = errors.size();
		for(ValidationError error : errors) {
			if(idx == 1)
				errorMessages = errorMessages + error.getValue();
			else
				errorMessages = errorMessages + error.getValue() + ", ";
			idx--;
		}
		return errorMessages;
	}
	
	/**
	 * This method will create ActionMessages from the list of errors.
	 * The mapping of key in the error field to the corresponding element in jsp/html
	 * is done by comparing the prefix passed to the method with the content of mapping file
	 * 'struts-field-mapping.properties'. If the mapping is found then the key will be
	 * replaced by the mapping value. If not it will be replaced by a generic 'misc' value.
	 * 
	 * @param mappingPrefix
	 * @return ActionMessages
	 */
	private ActionMessages toActionMessages(String mappingPrefix) {
		ActionMessages actionMessages = new ActionMessages();
		for(ValidationError error : errors) {
			String key = error.getKey();
			String mapping = DMSPropertiesUtil.getProperty(mappingPrefix + "." + key);
			if(StringUtils.isNotBlank(mapping)) {
				if(StringUtils.isNotBlank(error.getSuffix())) {
					key = mapping + error.getSuffix();
				} else {
					key = mapping;
				}
			} else {
				if(StringUtils.isNotBlank(error.getSuffix())) {
					key = "misc" + error.getSuffix();
				}
				else {
					key = "misc";
				}
			}
			ActionMessage actionMessage = null;
			actionMessage = new ActionMessage("error.dyna.message", error.getValue());
			actionMessages.add(key, actionMessage);
		}
		return actionMessages;
	}
	
	/**
	 * This method will create ActionMessages from the list of errors.
	 * The mapping of key in the error field to the corresponding element in jsp/html
	 * is done by comparing the prefix 'AuthorisationMapping' along with the key
	 * with the content of mapping file 'struts-field-mapping.properties'. 
	 * If the mapping is found then the key will be
	 * replaced by the mapping value. If not it will be replaced by a generic 'misc' value.
	 * 
	 * @param mappingPrefix
	 * @return ActionMessages
	 */
	public ActionMessages toDataDictionaryErrorMessages() {
		return toActionMessages("DataDictionaryMapping");
	}
	
}
