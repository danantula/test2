package com.ctg.dms.dto;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.apache.struts.action.ActionMessage;

import com.ctg.dms.config.DMSPropertiesUtil;
import com.ctg.dms.dto.validator.DtoValidationException;
import com.ctg.dms.dto.validator.DtoValidationSource;
import com.ctg.dms.dto.validator.ValidationError;
import com.ctg.dms.util.SecurityUtil;
import com.ctg.dms.util.ValidationConstants;

public abstract class BaseDTO implements Serializable {

	private static final long serialVersionUID = 1L;
	private DtoValidationSource src;
	
	public final void validate()	throws DtoValidationException {
		if(this.src == null) {
			throw new DtoValidationException(new ValidationError("SOURCE_NOT_SET", ValidationConstants.VALIDATION_SOURCE_NOT_SET));
		}
		validateRegEx();
		validateCommons();
		validateBusiness();
		validateSourceSpecific();
	}
	
	public final void validateRegEx() throws DtoValidationException {
		List<ValidationError> errors = new ArrayList<ValidationError>();
		for(Field field : getClass().getDeclaredFields()) {
			field.setAccessible(true); 
			try {
				Object value = field.get(this);
				String regProperty = DMSPropertiesUtil.getProperty(getClass().getSimpleName() + "." + field.getName());
				if(value != null && StringUtils.isNotBlank(value.toString()) && StringUtils.isNotBlank(regProperty)) {
					if(SecurityUtil.checkForXSS(value.toString())) {
						String regMessage = DMSPropertiesUtil.getProperty(getClass().getSimpleName() + "Message." + field.getName());
						 if(StringUtils.isBlank(regMessage))
							 regMessage = ValidationConstants.INVALID_CHARACTER_ENTERED;
						ValidationError err = new ValidationError(getClass().getSimpleName() + "." + field.getName(), regMessage);
						errors.add(err);
					 } else if(!value.toString().matches(regProperty)) {
                        String regMessage = DMSPropertiesUtil.getProperty(getClass().getSimpleName() + "Message." + field.getName());
                        if(StringUtils.isBlank(regMessage))
                        	regMessage = ValidationConstants.INVALID_VALUE_ENTERED;
                        ValidationError err = new ValidationError(getClass().getSimpleName() + "." + field.getName(), regMessage);
						errors.add(err);
					}
				}
			} catch (IllegalArgumentException e) {
				throw new DtoValidationException(new ValidationError("Regex Error", "IllegalArgumentException"));
			} catch (IllegalAccessException e) {
				throw new DtoValidationException(new ValidationError("Regex Error", "IllegalAccessException"));
			}
	    }
		if(errors.size() > 0) {
			throw new DtoValidationException(errors);
		}
	}
	
	public abstract void validateCommons() throws DtoValidationException;
	
	public abstract void validateBusiness() throws DtoValidationException;
	
	public abstract void validateSourceSpecific() throws DtoValidationException;

	
	public void setSrc(DtoValidationSource src) {
		this.src = src;
	}

	public DtoValidationSource getSrc() {
		return src;
	}
	
	
}
