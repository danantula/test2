package com.ctg.dms.util;


public class ValidationConstants {

	public final static String CV_DYNA_MESSAGE = "error.dyna.message";
	
	//Validation Key
	public final static String CV_AUTHORISATION_OTHER_REF = "CV_AUTHORISATION_OTHER_REF";
	public final static String CV_AUTHORISATION_MISC = "CV_AUTHORISATION_MISC";
	public final static String CV_AUTHORISATION_AUTHORISED_DATE = "CV_AUTHORISATION_AUTHORISED_DATE";
	public final static String CV_AUTHORISATION_URN = "CV_AUTHORISATION_URN";
	public final static String CV_AUTHORISATION_FROM = "CV_AUTHORISATION_FROM";
	public final static String CV_AUTHORISATION_TO = "CV_AUTHORISATION_TO";
	public final static String CV_AUTHORISATION_DESIGNATED_PERSON = "CV_AUTHORISATION_DESIGNATED_PERSON";
	public final static String CV_AUTHORISATION_RANK = "CV_AUTHORISATION_RANK";
	public final static String CV_AUTHORISATION_PURPOSE = "CV_AUTHORISATION_PURPOSE";
	public final static String CV_AUTHORISATION_RECEIVED_DATE = "CV_AUTHORISATION_RECEIVED_DATE";
	public final static String CV_AUTHORISATION_DELIVERY_METHOD = "CV_AUTHORISATION_DELIVERY_METHOD";
	public final static String CV_AUTHORISATION_COURT_DATE = "CV_AUTHORISATION_COURT_DATE";
	public final static String CV_AUTHORISATION_SUPPORTING_DETAILS = "CV_AUTHORISATION_SUPPORTING_DETAILS";
	public final static String CV_AUTHORISATION_SPOC_OFFICER = "CV_AUTHORISATION_SPOC_OFFICER";
	public final static String CV_SERVICE_REQUEST_GRADE = "CV_SERVICE_REQUEST_GRADE";
	public final static String CV_SERVICE_REQUEST_DETAIL_PARAMETER = "CV_SERVICE_REQUEST_DETAIL_PARAMETER";
	public final static String CV_SERVICE_REQUEST_SPOC_SRQ_REF = "CV_SERVICE_REQUEST_SPOC_SRQ_REF";
	public final static String CV_SERVICE_REQUEST_RESTRICTION_LIST = "CV_SERVICE_REQUEST_RESTRICTION_LIST";
	public final static String CV_SERVICE_REQUEST_STARTDATE="CV_SERVICE_REQUEST_STARTDATE";
	public final static String CV_SERVICE_REQUEST_ENDDATE="CV_SERVICE_REQUEST_ENDDATE";
	public final static String CV_SERVICE_REQUEST_DUEBYDATE="CV_SERVICE_REQUEST_DUEBYDATE";
	public final static String CV_SERVICE_REQUEST_RETENTION_PERIOD = "CV_SERVICE_REQUEST_RETENTION_PERIOD";
	public final static String CV_SERVICE_REQUEST_FUTURE_DATE = "CV_SERVICE_REQUEST_FUTURE_DATE";		
	public final static String CV_SERVICE_REQUEST_SUPPORTING_DETAILS = "CV_SERVICE_REQUEST_SUPPORTING_DETAILS";
	public final static String CV_SERVICE_REQUEST_EXCEEDED_MAX_PERMITTED_TIME = "CV_SERVICE_REQUEST_EXCEEDED_MAX_PERMITTED_TIME";
	public final static String CV_SERVICE_REQUEST_OBJECTS_NULL = "CV_SERVICE_REQUEST_OBJECTS_NULL";
	public final static String CV_SERVICE_REQUEST_MISC = "CV_SERVICE_REQUEST_MISC";
	public static final String CV_SERVICE_RETENTION_PERIOD_ERROR = "CV_SERVICE_RETENTION_PERIOD_ERROR";
	public static final String CV_FORM_REGEX_ERROR = "CV_FORM_REGEX_ERROR";
	public static final String CV_AUTHORISATION_DATETO_BEFORE_DATEFROM = "CV_AUTHORISATION_DATETO_BEFORE_DATEFROM";
	public static final String CV_AUTHORISATION_DATEFROM_DATETO_GREATERTHAN_MONTH = "CV_AUTHORISATION_DATEFROM_DATETO_GREATERTHAN_MONTH";
	public static final String CV_AUTHORISATION_REASON = "CV_AUTHORISATION_REASON";
	public static final String CV_AUTHORISATION_SOURCE = "CV_AUTHORISATION_SOURCE";
	public static final String CV_DATA_DICTIONARY_ATTRIBUTE = "CV_DATA_DICTIONARY_ATTRIBUTE";
	public static final String CV_DATA_DICTIONARY_XMLCOLUMN = "CV_DATA_DICTIONARY_XMLCOLUMN";
	public static final String CV_DATA_DICTIONARY_DESCRIPTION = "CV_DATA_DICTIONARY_DESCRIPTION";
	public static final String CV_DATA_DICTIONARY_ID_DATA_TYPE = "CV_DATA_DICTIONARY_ID_DATA_TYPE";
	public static final String CV_DATA_DICTIONARY_ID_GROUP_TYPE = "CV_DATA_DICTIONARY_ID_GROUP_TYPE";
	public static final String CV_DATA_DICTIONARY_ITEM_CANNOT_DELETE = "CV_DATA_DICTIONARY_ITEM_CANNOT_DELETE";
	public final static String CV_SERVICE_REQUEST_FILE_FORMAT = "CV_SERVICE_REQUEST_FILE_FORMAT";
	public final static String  CV_SERVICE_REQUEST_SPOC_REF_NOT_UNIQUE = "CV_SERVICE_REQUEST_SPOC_REF_NOT_UNIQUE";
	public final static String  CV_SERVICE_REQUEST_UTC_OFFSET = "CV_SERVICE_REQUEST_UTC_OFFSET";
	
	//Validation messages
	public static final String ENTER_MANDATORY_FIELD_VALUES = "Please enter values in mandatory fields (marked with *).";
	public static final String AUTHORISATION_OTHERREF_EXCEEDS_MAX_ALLOWED = "Other Ref length exceeds max allowed";
	public static final String INVALID_CHARACTER_ENTERED = "The entered text contains one or more restricted characters $ < > { }. These are not allowed. ";
	public static final String URN_BLANK_MESSAGE = "URN can't be blank.";
	public static final String USERNOTE_EXCEEDS_MAX_ALLOWED = "User note length exceeds max allowed";
	public final static String DELIVERY_METHOD_BLANK_MESSAGE = "Delivery method cannot be null";
	public final static String ENTER_VALID_EMAIL_ADDRESS = "Please enter a valid email address";
	public final static String ENTER_VALID_FAX_NUMBER = "Please enter a valid fax number";
	public final static String ENTER_VALID_POSTAL_ADDRESS = "Please enter a valid postal address";
	public final static String URN_IS_NOT_UNIQUE_MESSAGE = "Urn is not unique";
	public static final String CREATED_BY_IS_BLANK_MESSAGE = "CreatedBy is null";
	public static final String PERIOD_START_BEFORE_RETENTION_PERIOD = "Period start earlier than retention period";
	public static final String AUTHORISATION_DATE_IN_FUTURE = "Authorised Date can't be in future.";
	public static final String TO_DATE_BEFORE_FROM_DATE = "Authorised Date TO must not be before Date FROM.";
	public static final String SELECT_UTC_OFFSET = "Please select a UTC Offset";
	public static final String AUTHORISATION_VALID_FOR_CALENDAR_MONTH = "Authorisation can be valid only for a calendar month.";
	public static final String DUEBY_DATE_BLANK_MESSAGE = "Please enter DueBy Date";
	public static final String MAX_PERMITTED_TIME_PERIOD = "The maximum permitted time period in hours for this request is ";
	public static final String DATE_TIME_IS_BLANK_MESSAGE = "Please enter Date Time";
	public static final String START_DATE_IS_BLANK_MESSAGE = "Please enter Start Date";
	public static final String END_DATE_IS_BLANK_MESSAGE = "Please enter End Date";
	public static final String END_DATE_BEFORE_START_DATE = "End Date must not be before Start Date";
	public static final String SRQ_END_DATE_BEYOND_AUTHORISATION_TO_DATE = "Service Request 'Period End' date cannot go beyond the Authorisation's 'Authorised To' Date";
	public static final String SRQ_DATE_BEYOND_AUTHORISATION_TO_DATE = "Service Request date cannot go beyond the Authorisation's 'Authorised To' Date";
	public static final String SRQ_FUTURE_FINISH_NOT_ALLOWED = "This Service Request Type does not allow period end date in future.";
	public static final String DUEBY_DATE_BEFORE_PERIODEND_DATE = "DueBy Date must not be before Period End Date";
	public static final String TO_DATE_AFTER_TODAY = "Period Start Date must not be after now";
	public static final String DUEBY_DATE_BEFORE_NOW = "DueBy Date must not be before now";
	public static final String DUEBY_DATE_WITHIN_4_MONTHS_FROM_TODAY = "Due by date must be within 4 months from today's date.";
	public static final String SUPPORTING_DETAILS_EXCEEDS_MAX_ALLOWED = "Please enter Supporting Details not exceeding ";
	public static final String ENTER_AT_LEAST_ONE_VALUE = "Enter at least one value for detail parameter ";
	public static final String DEFAULT_VALUE_NOT_ALLOWED = "Default value is not allowed";
	public static final String SPOC_REF_VALIDATION_MESSAGE = "The 'Optional Spoc Reference' must be less than 25 characters with no spaces or special characters.";
	public static final String REQUIRED_DTO_OBJECTS_ARE_NULL = "Required DTO objects are null";
	public static final String SPOC_REFERENCE_IS_BLANK = "SPOC Reference missing";
	public static final String INVALID_VALUE_ENTERED = "Invalid value entered for the above field ";
	public static final String VALIDATION_SOURCE_NOT_SET = "Validation Source not set";
	public static final String SELECT_AT_LEAST_ONE_FILE_FORMAT = "Select at least one file format.";
	public static final String AUTHORISED_DATE_BLANK_MESSAGE = "Authorised date cannot be blank.";
	public static final String AUTHORISED_FROM_BLANK_MESSAGE = "Authorised from cannot be blank.";
	public static final String AUTHORISED_TO_BLANK_MESSAGE = "Authorised to cannot be blank.";
	public static final String COURT_DATE_BLANK_MESSAGE = "Court date cannot be blank.";
	public static final String DESIGNATED_PERSON_BLANK_MESSAGE = "Designated person cannot be blank.";
	public static final String OTHER_REF_BLANK_MESSAGE = "Other Ref cannot be blank.";
	public static final String RANK_BLANK_MESSAGE = "Rank cannot be blank.";
	public static final String REASON_BLANK_MESSAGE = "Reason cannot be blank.";
	public static final String RECEIVED_DATE_BLANK_MESSAGE = "Received date cannot be blank.";
	public static final String PURPOSE_BLANK_MESSAGE = "Purpose cannot be blank.";
	public static final String SOURCE_BLANK_MESSAGE = "Source cannot be blank.";
	public static final String SPOC_OFFICER_BLANK_MESSAGE = "Spoc officer cannot be blank.";
	public static final String SUPPORTING_DETAILS_BLANK_MESSAGE = "Supporting details cannot be blank.";
	public static final String SRQ_TYPE_AUTH_TYPE_NOT_MAPPED = "The service request type is not mapped to the authorisation type received in mango request";
	public static final String TEMP_URN_NOT_ALLOWED = "Setting temp URN not permitted for this authorisation type";
	public static final String AUTH_FROM_NOT_ALLOWED = "Setting authorised from date not permitted for this authorisation type";
	public static final String AUTH_TO_NOT_ALLOWED = "Setting authorised to date not permitted for this authorisation type";
	public static final String DATE_AUTHORISED_NOT_ALLOWED = "Setting date authorised not permitted for this authorisation type";
	public static final String COURT_DATE_NOT_ALLOWED = "Setting court date not permitted for this authorisation type";
	public static final String DESIGNATED_PERSON_NOT_ALLOWED = "Setting designated person not permitted for this authorisation type";
	public static final String OTHER_REF_NOT_ALLOWED = "Setting other ref not permitted for this authorisation type";
	public static final String RANK_NOT_ALLOWED = "Setting rank not permitted for this authorisation type";
	public static final String REASON_NOT_ALLOWED = "Setting reason not permitted for this authorisation type";
	public static final String RECEIVED_DATE_NOT_ALLOWED = "Setting received date not permitted for this authorisation type";
	public static final String PURPOSE_NOT_ALLOWED = "Setting purpose not permitted for this authorisation type";
	public static final String SOURCE_NOT_ALLOWED = "Setting source not permitted for this authorisation type";
	public static final String SPOC_OFFICER_NOT_ALLOWED = "Setting spoc officer not permitted for this authorisation type";
	public static final String SUPPORTING_DETAILS_NOT_ALLOWED = "Setting supporting details not permitted for this authorisation type";
	public static final String URN_NOT_ALLOWED = "Setting URN not permitted for this authorisation type";
	public static final String ENTER_AUTH_TO_FROM_DATES_TOGETHER = "Enter both authorisation to and from dates";
	public static final String FUTURE_DATES_NOT_ALLOWED_VIA_THIS_PROCESS = "Future dates cannot be entered via this process";
	public static final String SELECT_ATLEAST_ONE_SRQ_TYPE = "Please select at least one Service Request Type";
	public static final String EXCEEDED_MAX_NO_OF_SRQ = "You have exceeded the maximum number of Service Request can be raised via this screen. Max 50 requests can be raised via this screen.";
	
	
	public static final String CV_DATA_DICTIONARY_ATTRIBUTE_REQUIRED = "Please enter attribute";
	public static final String CV_DATA_DICTIONARY_XMLCOLUMN_REQUIRED = "Please enter xml column";
	public static final String CV_DATA_DICTIONARY_DESCRIPTION_REQUIRED = "Please enter description";
	public static final String CV_DATA_DICTIONARY_ID_DATA_TYPE_REQUIRED = "Please select a Data type";
	public static final String CV_DATA_DICTIONARY_ID_GROUP_TYPE_REQUIRED = "Please select a Group type";
	public static final String CV_DATA_DICTIONARY_ITEM_NOT_UNIQUE = "Data Dictionary item is already defined in the system.";
	public static final String CV_DATA_DICTIONARY_ITEM_CANNOT_DELETE_MSG_1 = "The data dictionary item cannot be deleted as it is associated with Service Request Template: ";
	public static final String CV_DATA_DICTIONARY_ITEM_CANNOT_DELETE_MSG_2 = ". Please remove the association and then delete.";
	
	
}
