package com.ctg.dms.util;

import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Set;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;
import org.apache.struts.util.LabelValueBean;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;

import com.ctg.dms.dao.impl.sql.COMMON_CONSTANTS;
import com.ctg.dms.exception.DateConversionException;

public class DateUtils {
	private static final Logger log = Logger.getLogger(DateUtils.class);
	private Calendar nowCalendar = Calendar.getInstance();
	
	public static final String STANDARD_DATE_TIME_REGEX_PATTERN = "^(\\d{4}(0[1-9]|1[012])(0[1-9]|[12][0-9]|3[01])([01][0-9]|2[0-3])([0-5][0-9])([0-5][0-9])(.[0-9][0-9]*)?(Z|[\\+|\\-][0-9]{4}))$";
	
	private Timestamp timeStampNow = new Timestamp(
			nowCalendar.get(nowCalendar.YEAR),
			nowCalendar.get(nowCalendar.MONTH),
			nowCalendar.get(nowCalendar.DATE),
			nowCalendar.get(nowCalendar.HOUR_OF_DAY),
			nowCalendar.get(nowCalendar.MINUTE),
			nowCalendar.get(nowCalendar.SECOND), 0);
	private String DATE_FORMAT_NOW = "yyyy-MM-dd HH:mm:ss";

	private static final String TIME24HOURS_PATTERN = "([01]?[0-9]|2[0-3]):[0-5][0-9]";

	static Pattern pattern = Pattern.compile(TIME24HOURS_PATTERN);

	public Calendar timeNow() {
		return nowCalendar;
	}

	public void setTime(GregorianCalendar calendar1) {
		this.nowCalendar = calendar1;
	}
	
	public static String formatDateForSRQGrade(Date date) {
		Calendar c  = Calendar.getInstance();
		c.setTime(date);
		return formatDateForSRQGrade(c);
	}
	
	public static Date parseDateTimeRDHIGMT(String date) {
		
		String dateFormat = "yyyyMMddHHmmss'Z'";
		SimpleDateFormat format = new SimpleDateFormat(dateFormat);
		//format.setTimeZone(TimeZone.getTimeZone("UTC"));
		try {
			Date parsedDate = format.parse(date);
			return parsedDate;
		} catch (ParseException ex) {
			if (log.isDebugEnabled())
				log.debug("Exception occurred when formatting date: "
						+ ex.getMessage());
			return null;
		}
	}

	
	public static Date parseDateTimeRDHI(String date) {
		
		String dateFormat = "yyyyMMddHHmmss'Z'";
		SimpleDateFormat format = new SimpleDateFormat(dateFormat);
		format.setTimeZone(TimeZone.getTimeZone("UTC"));
		try {
			Date parsedDate = format.parse(date);
			return parsedDate;
		} catch (ParseException ex) {
			if (log.isDebugEnabled())
				log.debug("Exception occurred when formatting date: "
						+ ex.getMessage());
			return null;
		}
	}

	public static String formatDateTimeRDHI(Calendar date) {
		String dateFormat = "yyyyMMddHHmmss'Z'";
		SimpleDateFormat format = new SimpleDateFormat(dateFormat);
		format.setTimeZone(TimeZone.getTimeZone("UTC"));
		try {
			String formattedDate = format.format(date.getTime());
			return formattedDate;
		} catch (Exception ex) {
			if (log.isDebugEnabled())
				log.debug("Exception occurred when formatting date: "
						+ ex.getMessage());
			return null;
		}
	}

	public long getDiffInMinutes(Timestamp dateToCompare) {
		long timeNow = timeStampNow.getTime();
		dateToCompare.setYear(dateToCompare.getYear() + 1900);
		long timeDueBy = dateToCompare.getTime();
		long timeDiffInMillis = timeDueBy - timeNow;
		long diffSeconds = timeDiffInMillis / 1000;
		long diffMinutes = timeDiffInMillis / (60 * 1000);
		long diffHours = timeDiffInMillis / (60 * 60 * 1000);
		long diffDays = timeDiffInMillis / (24 * 60 * 60 * 1000);
		return diffMinutes;
	}

	public long getDiffInMinutes(Calendar dateToCompare) {
		long timeNow = nowCalendar.getTimeInMillis();
		long timeDueBy = dateToCompare.getTimeInMillis();

		long timeDiffInMillis = timeDueBy - timeNow;
		// convert milliseconds to hours
		long diffSeconds = timeDiffInMillis / 1000;
		long diffMinutes = timeDiffInMillis / (60 * 1000);
		long diffHours = timeDiffInMillis / (60 * 60 * 1000);
		long diffDays = timeDiffInMillis / (24 * 60 * 60 * 1000);
		return diffMinutes;
	}

	public static void main(String[] args) {
		//System.out.println(parseDateTimeRDHI("19650601230000Z"));		
	}

	public static Date parseDate(String date) {
		String dateFormat = "dd/MM/yyyy";

		// Validate that the date is entered in correct format - more important
		// for Year part
		// as SDF does not treat yy in expected manner - ref: y2k corrections

		String yearPart = date.substring(date.lastIndexOf("/") + 1,
				date.length());

		if (yearPart == null || yearPart.length() < 4)
			return null;

		SimpleDateFormat format = new SimpleDateFormat(dateFormat);
		try {
			Date parsedDate = format.parse(date);
			return parsedDate;
		} catch (ParseException ex) {
			if (log.isDebugEnabled())
				log.debug("Exception occurred when formatting date: "
						+ ex.getMessage());
			return null;
		}
	}
	public static boolean isDateValid(String date) {
		String dateFormat = "dd/MM/yyyy";
		
		String yearPart = date.substring(date.lastIndexOf("/") + 1,
				date.length());

		if (yearPart == null || yearPart.length() != 4)
			return false;


		SimpleDateFormat format = new SimpleDateFormat(dateFormat);
		format.setLenient(false);
		try {
			format.parse(date);
			return true;
		} catch (ParseException ex) {
			if (log.isDebugEnabled())
				log.debug("Exception occurred when validating date: isDateValid "
						+ ex.getMessage());
			return false;
		}
	}
	public static boolean isDateTimeValid(String date) {
		String dateFormat = "dd/MM/yyyy HH:mm";
		
		String yearPart = date.substring(date.lastIndexOf("/") + 1,
				date.length());

		if (yearPart == null || yearPart.length() < 4)
			return false;

		SimpleDateFormat format = new SimpleDateFormat(dateFormat);
		format.setLenient(false);
		try {
			Date parsedDate = format.parse(date);
			return true;
		} catch (ParseException ex) {
			if (log.isDebugEnabled())
				log.debug("Exception occurred when formatting date/time: isDateTimeValid"
						+ ex.getMessage());
			return false;
		}
	}

	public static Date parseDateWebFormat(String date) {
		String dateFormat = "dd MMM yyyy";
		SimpleDateFormat format = new SimpleDateFormat(dateFormat);
		try {
			Date parsedDate = format.parse(date);
			return parsedDate;
		} catch (ParseException ex) {
			if (log.isDebugEnabled())
				log.debug("Exception occurred when formatting date: "
						+ ex.getMessage());
			return null;
		}
	}

	public static Date parseDateTime(String date) {
		String dateFormat = "dd MMM yyyy HH:mm:ss";
		SimpleDateFormat format = new SimpleDateFormat(dateFormat);
		try {
			Date parsedDate = format.parse(date);
			return parsedDate;
		} catch (ParseException ex) {
			if (log.isDebugEnabled())
				log.debug("Exception occurred when formatting date: "
						+ ex.getMessage());
			return null;
		}
	}

	public static Date parseDateForSRQGrade(String date) {
		// Validate that the date is entered in correct format - more important
		// for Year part
		// as SDF does not treat yy in expected manner - ref: y2k corrections

		String yearPart = date.substring(date.lastIndexOf("/") + 1,
				date.length());

		if (yearPart == null || yearPart.length() < 4)
			return null;

		String dateFormat = "dd/MM/yyyy";
		SimpleDateFormat format = new SimpleDateFormat(dateFormat);
		try {
			Date parsedDate = format.parse(date);
			return parsedDate;
		} catch (ParseException ex) {
			if (log.isDebugEnabled())
				log.debug("Exception occurred when formatting date: "
						+ ex.getMessage());
			return null;
		}
	}

	public static Date parseDateTimeForSRQGrade(String date) {
		String dateFormat = "dd/MM/yyyy HH:mm:ss";
		SimpleDateFormat format = new SimpleDateFormat(dateFormat);
		try {
			Date parsedDate = format.parse(date);
			return parsedDate;
		} catch (ParseException ex) {
			if (log.isDebugEnabled())
				log.debug("Exception occurred when formatting date: "
						+ ex.getMessage());
			return null;
		}
	}
	
	public static Date parseDateTimeForSRQGrade(String date, String dateFormat) {
		SimpleDateFormat format = new SimpleDateFormat(dateFormat);
		try {
			Date parsedDate = format.parse(date);
			return parsedDate;
		} catch (ParseException ex) {
			if (log.isDebugEnabled())
				log.debug("Exception occurred when formatting date: "
						+ ex.getMessage());
			return null;
		}
	}
	
	

	public static Date parseDateTimeSlashSeparated(String date) {
		String dateFormat = "dd/MM/yy HH:mm";
		SimpleDateFormat format = new SimpleDateFormat(dateFormat);
		try {
			Date parsedDate = format.parse(date);
			return parsedDate;
		} catch (ParseException ex) {
			if (log.isDebugEnabled())
				log.debug("Exception occurred when formatting date: "
						+ ex.getMessage());
			return null;
		}
	}

	/**
	 * Parses date of type string(eg: 20150801) to given dateFormat(eg : yyyyMMdd) and returns Date
	 * @param date
	 * @param dateFormat
	 * @return Date
	 * @throws DateConversionException
	 */
	public static Date parseDate(String date, String dateFormat) throws DateConversionException{
		SimpleDateFormat format = new SimpleDateFormat(dateFormat);
		try {
			Date parsedDate = format.parse(date);
			return parsedDate;
		} catch (Exception ex) {
			throw new DateConversionException("Exception occurred when formatting date: " + date + " to the format: " + dateFormat, ex);
		}
	}
	
	/**
	 * Converts calendar date to String of dateFormat
	 * 
	 * @param date
	 * @param dateFormat
	 * @return String
	 * @throws DateConversionException
	 */
	public static String formatDateTime(Calendar date, String dateFormat) throws DateConversionException{
		if(StringUtils.isBlank(dateFormat))
			dateFormat = "yyyyMMdd";
		SimpleDateFormat format = new SimpleDateFormat(dateFormat);
		try {
			String formattedDate = format.format(date.getTime());
			return formattedDate;
		} catch (Exception ex) {
			throw new DateConversionException("Exception occurred when formatting date: " + date.getTime() + " to the format: " + dateFormat, ex);
		}
	}
	
	public static String formatDateTimeSlashSeparated(Calendar date) {
		String dateFormat = "dd/MM/yyyy HH:mm";
		SimpleDateFormat format = new SimpleDateFormat(dateFormat);
		try {
			String formattedDate = format.format(date.getTime());
			return formattedDate;
		} catch (Exception ex) {
			if (log.isDebugEnabled())
				log.debug("Exception occurred when formatting date: "
						+ ex.getMessage());
			return null;
		}
	}

	public static String formatDateTimeSlashSeparated(Date date) {
		String dateFormat = "dd/MM/yyyy HH:mm";
		SimpleDateFormat format = new SimpleDateFormat(dateFormat);
		try {
			String formattedDate = format.format(date.getTime());
			return formattedDate;
		} catch (Exception ex) {
			if (log.isDebugEnabled())
				log.debug("Exception occurred when formatting date: "
						+ ex.getMessage());
			return null;
		}
	}

	public static String formatDateTimeSlashSeparated(Timestamp date) {
		String dateFormat = "dd/MM/yyyy HH:mm";
		SimpleDateFormat format = new SimpleDateFormat(dateFormat);
		try {
			String formattedDate = format.format(date.getTime());
			return formattedDate;
		} catch (Exception ex) {
			if (log.isDebugEnabled())
				log.debug("Exception occurred when formatting date: "
						+ ex.getMessage());
			return null;
		}
	}

	public static String formatDateSlashSeparated(Date date) {
		String dateFormat = "dd/MM/yy";
		SimpleDateFormat format = new SimpleDateFormat(dateFormat);
		try {
			String formattedDate = format.format(date);
			return formattedDate;
		} catch (Exception ex) {
			if (log.isDebugEnabled())
				log.debug("Exception occurred when formatting date: "
						+ ex.getMessage());
			return null;
		}
	}

	public static String formatDate(Date date) {
		String dateFormat = "dd MMM yyyy";
		SimpleDateFormat format = new SimpleDateFormat(dateFormat);
		try {
			String formattedDate = format.format(date);
			return formattedDate;
		} catch (Exception ex) {
			if (log.isDebugEnabled())
				log.debug("Exception occurred when formatting date: "
						+ ex.getMessage());
			return null;
		}
	}

	public static String formatDateTime(Timestamp date) {
		String dateFormat = "dd MMM yyyy HH:mm:ss";
		SimpleDateFormat format = new SimpleDateFormat(dateFormat);
		try {
			String formattedDate = format.format(date);
			return formattedDate;
		} catch (Exception ex) {
			if (log.isDebugEnabled())
				log.debug("Exception occurred when formatting date: "
						+ ex.getMessage());
			return null;
		}
	}

	public static String formatTimestampToMonthYear(Timestamp date) {
		String dateFormat = "MMM-yy";
		SimpleDateFormat format = new SimpleDateFormat(dateFormat);
		try {
			String formattedDate = format.format(date);
			return formattedDate;
		} catch (Exception ex) {
			if (log.isDebugEnabled())
				log.debug("Exception occurred when formatting date: "
						+ ex.getMessage());
			return null;
		}
	}

	public static String formatDateTime(Calendar date) {
		String dateFormat = "dd MMM yyyy HH:mm:ss";
		SimpleDateFormat format = new SimpleDateFormat(dateFormat);
		try {
			String formattedDate = format.format(date.getTime());
			return formattedDate;
		} catch (Exception ex) {
			if (log.isDebugEnabled())
				log.debug("Exception occurred when formatting date: "
						+ ex.getMessage());
			return null;
		}
	}

	public static String formatDateForSRQGrade(Calendar date) {
		String dateFormat = "dd/MM/yyyy";
		SimpleDateFormat format = new SimpleDateFormat(dateFormat);
		try {
			String formattedDate = format.format(date.getTime());
			return formattedDate;
		} catch (Exception ex) {
			if (log.isDebugEnabled())
				log.debug("Exception occurred when formatting date: "
						+ ex.getMessage());
			return null;
		}
	}
	
	public static String formatDateForInvoice(Calendar date) {
		String dateFormat = "dd/MM";
		SimpleDateFormat format = new SimpleDateFormat(dateFormat);
		try {
			String formattedDate = format.format(date.getTime());
			return formattedDate;
		} catch (Exception ex) {
			if (log.isDebugEnabled())
				log.debug("Exception occurred when formatting date: "
						+ ex.getMessage());
			return null;
		}
	}
	
	public static String formatDate(Calendar date) {
		String dateFormat = "dd MMM yyyy";
		SimpleDateFormat format = new SimpleDateFormat(dateFormat);
		try {
			String formattedDate = format.format(date.getTime());
			return formattedDate;
		} catch (Exception ex) {
			if (log.isDebugEnabled())
				log.debug("Exception occurred when formatting date: "
						+ ex.getMessage());
			return null;
		}
	}

	public static Calendar convertToCalendar(Timestamp dateToConvert) {
		Calendar convertedCal = Calendar.getInstance();

		if (dateToConvert != null)
			convertedCal.setTimeInMillis(dateToConvert.getTime());
		else
			return null;

		return convertedCal;
	}

	public static Calendar getBeginningofMonthAsCal(Date dateToConvert) {
		Calendar convertedCal = Calendar.getInstance();

		if (dateToConvert != null)
			convertedCal.setTimeInMillis(dateToConvert.getTime());
		else
			return null;

		convertedCal.set(Calendar.DAY_OF_MONTH, 1);
		convertedCal.set(Calendar.HOUR_OF_DAY, 0);
		convertedCal.set(Calendar.MINUTE, 0);
		convertedCal.set(Calendar.SECOND, 0);
		convertedCal.set(Calendar.MILLISECOND, 0);

		return convertedCal;
	}

	public static Calendar getEndofMonthAsCal(Date dateToConvert) {
		Calendar convertedCal = Calendar.getInstance();

		if (dateToConvert != null)
			convertedCal.setTimeInMillis(dateToConvert.getTime());
		else
			return null;
		int maxDay = convertedCal.getActualMaximum(Calendar.DAY_OF_MONTH);
		convertedCal.set(Calendar.DAY_OF_MONTH, maxDay);
		convertedCal.set(Calendar.HOUR_OF_DAY, 23);
		convertedCal.set(Calendar.MINUTE, 59);
		convertedCal.set(Calendar.SECOND, 59);
		convertedCal.set(Calendar.MILLISECOND, 99);

		return convertedCal;
	}

	public static Date getBeginningofMonth(Date dateToConvert) {
		Calendar convertedCal = Calendar.getInstance();

		if (dateToConvert != null)
			convertedCal.setTimeInMillis(dateToConvert.getTime());
		else
			return null;

		convertedCal.set(Calendar.DAY_OF_MONTH, 1);
		convertedCal.set(Calendar.HOUR_OF_DAY, 0);
		convertedCal.set(Calendar.MINUTE, 0);
		convertedCal.set(Calendar.SECOND, 0);
		convertedCal.set(Calendar.MILLISECOND, 0);

		return convertedCal.getTime();
	}

	public static Date getEndofMonth(Date dateToConvert) {
		Calendar convertedCal = Calendar.getInstance();

		if (dateToConvert != null)
			convertedCal.setTimeInMillis(dateToConvert.getTime());
		else
			return null;
		int maxDay = convertedCal.getActualMaximum(Calendar.DAY_OF_MONTH);
		convertedCal.set(Calendar.DAY_OF_MONTH, maxDay);
		convertedCal.set(Calendar.HOUR_OF_DAY, 23);
		convertedCal.set(Calendar.MINUTE, 59);
		convertedCal.set(Calendar.SECOND, 59);
		convertedCal.set(Calendar.MILLISECOND, 99);

		return convertedCal.getTime();
	}

	public static long getDifferenceInSeconds(Calendar date1, Calendar date2) {

		long diff = date1.getTimeInMillis() - date2.getTimeInMillis();

		if (diff < 0) {
			diff = diff * -1;
		}

		return diff / 1000;
	}

	/**
	 * Returns a new date after adding the provided number of working days to
	 * the original date. Working days considered are only Mon-Fri, Bank
	 * holidays are not taken into account.
	 * 
	 * @param startDate
	 *            The start date to which the working days are to be added.
	 * @param strNumberOfHours
	 *            The String number of hours, since the SLA hours are stored as
	 *            String.
	 * @return The new date with working days added.
	 */
	public static Calendar getDateExcludingWeekends(Calendar startDate,
			String strNumberToadd, String hoursOrDays) {

		int numOfDays = Integer.parseInt(strNumberToadd);
		Calendar newDate = Calendar.getInstance();
		newDate.setTime(startDate.getTime());

		if (hoursOrDays.equals("HOUR")) {
			newDate.add(Calendar.HOUR, numOfDays);
		} else {
			newDate.add(Calendar.DATE, numOfDays);
		}
		int dayOfWeek = 0;

		while (newDate.after(startDate)) {

			dayOfWeek = startDate.get(Calendar.DAY_OF_WEEK);

			if (dayOfWeek == 7) {
				newDate.add(Calendar.HOUR, 48);
				startDate.add(Calendar.HOUR, 48);
			} else if (dayOfWeek == 1) {
				newDate.add(Calendar.HOUR, 24);
				startDate.add(Calendar.HOUR, 24);
			} else {
				startDate.add(Calendar.HOUR, 24);
			}

			if (startDate.get(Calendar.DAY_OF_YEAR) == newDate
					.get(Calendar.DAY_OF_YEAR)) {
				dayOfWeek = startDate.get(Calendar.DAY_OF_WEEK);
				if (dayOfWeek == 7) {
					newDate.add(Calendar.HOUR, 48);
					startDate.add(Calendar.HOUR, 48);
				} else if (dayOfWeek == 1) {
					newDate.add(Calendar.HOUR, 24);
					startDate.add(Calendar.HOUR, 24);
				}
			}
		}
		return newDate;
	}

	/**
	 * Date validation function
	 * 
	 * @param date
	 * @param format
	 * @return
	 */
	public static boolean isValidDate(String date, String format) {
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		@SuppressWarnings("deprecation")
		Date eventDate = new Date(date);

		/*
		 * if(!validate(date.substring(9))){
		 * log.error("Invalid Time 24 Hours Provided.."+date); return false; }
		 */

		if (!sdf.format(eventDate).equals(date)) {
			log.error("The date that you provided is invalid.");
			return false;
		}

		return true;
	}

	/**
	 * @param time
	 * @return boolean
	 */
	public static boolean validate(final String time) {

		Matcher matcher = pattern.matcher(time);
		return matcher.matches();

	}
	
	public static String getSystemTimeZone() {
		return DateTimeZone.getDefault().getID();
	}
	
	/**
	 * Util method to return the time zone list
	 * @return time zone list
	 */
	@SuppressWarnings("unchecked")
	public static List<LabelValueBean> getTimeZones(){
		List<LabelValueBean> timeZoneList = new ArrayList<LabelValueBean>();
		Set<String> zoneIds = DateTimeZone.getAvailableIDs();
		for(String zone : zoneIds){
			TimeZone tz = TimeZone.getTimeZone(zone);
		    String shortName = tz.getDisplayName(tz.inDaylightTime(Calendar.getInstance().getTime()), TimeZone.SHORT);
			timeZoneList.add(new LabelValueBean(shortName + " - " + zone, zone.trim()));
		}
		Collections.sort(timeZoneList);
		return timeZoneList;
	}
	
	/**
	 * Util method to get the time in required time zone in specified format
	 * @param date
	 * @param fromTZ
	 * @param toTZ
	 * @param dateFormat
	 */
	public static String convertTimeZone(Calendar cal, String timeZone, String dateFormat){
		//time entered
		//timezone - convert the entered time at the given timezone
		DateFormat format = new SimpleDateFormat(dateFormat);
		format.setTimeZone(TimeZone.getTimeZone(timeZone));
		return format.format(cal.getTime());
	}
	
	public static String convertTime(Calendar cal, String fromTZ, String toTZ, String dateFormat){
		SimpleDateFormat format = new SimpleDateFormat(COMMON_CONSTANTS.TZ_CONV_FORMAT);
		String formattedDate = null;
		try {
			formattedDate = format.format(cal.getTime());
			format.setTimeZone(TimeZone.getTimeZone(fromTZ));
		} catch (Exception ex) {
			if (log.isDebugEnabled())
				log.debug("Exception occurred when formatting date: "
						+ ex.getMessage());
			return null;
		}
		
		// Parses the value and assumes it represents a date and time in the toTZ timezone  
		Date d = null;
		try {
			d = format.parse(formattedDate);
		} catch (ParseException e) {
			if (log.isDebugEnabled())
				log.debug("Exception occurred when formatting date: "
						+ e.getMessage());
			return null;
		}  
		DateFormat df2 = new SimpleDateFormat(dateFormat);
		df2.setTimeZone(TimeZone.getTimeZone(toTZ));  
		return df2.format(d);
	}
	
	/**
	 * Method to convert inputed time and offset to time in destination timezone.  
	 * 
	 * @param input time
	 * @param offset
	 * @param destination time zone
	 * @param required dateFormat
	 * @return String
	 */
	public static String convertOffset(Calendar cal, String offset, String toTZ, String dateFormat){
		SimpleDateFormat format = new SimpleDateFormat(COMMON_CONSTANTS.TZ_CONV_FORMAT);
			try {
				DateTimeZone dt = DateTimeZone.forOffsetHoursMinutes(Integer.parseInt(offset.substring(0, 3)), Integer.parseInt(offset.substring(3)));
				String formattedDate = format.format(cal.getTime());
				format.setTimeZone(dt.toTimeZone());
				Date d = format.parse(formattedDate);
				DateFormat df2 = new SimpleDateFormat(dateFormat);
				df2.setTimeZone(TimeZone.getTimeZone(toTZ));  
				return df2.format(d);
			} catch (ParseException e) {
				if (log.isDebugEnabled())
					log.debug("Exception occurred when formatting date: "
							+ e.getMessage());
				return null;
			}
	}
	
	/**
	 * 
	 * @param xmlDate of format 20140925000001-0500
	 * @param toTZ
	 * @return Calendar
	 */
	public static Calendar convertXmlDate(String xmlDate, String toTZ) throws DateConversionException{
		
		if(xmlDate == null || (xmlDate != null && !xmlDate.matches(STANDARD_DATE_TIME_REGEX_PATTERN))){
			throw new DateConversionException(xmlDate + " is not of format YYYYMMDDHH[MM[SS[.fff]]]+-HHMM ");
		}
		if(toTZ == null) {
			throw new DateConversionException("Exception occurred when formatting date - no timezone specified");
		}
		String offset = xmlDate.substring(xmlDate.length()-5);
		String dateTime = xmlDate.substring(0, xmlDate.length()-5);
		
		Date date = parseDateTimeForSRQGrade(dateTime, "yyyyMMddHHmmss");
		if(date == null){
			throw new DateConversionException("Exception occurred when formatting date: " + dateTime + " to the format: yyyyMMddHHmmss");
		}
		String convertedDateTime = convertOffset(DateToCalendar(date), offset, toTZ, COMMON_CONSTANTS.TZ_CONV_FORMAT);
		Date d1 = parseDateTimeForSRQGrade(convertedDateTime, COMMON_CONSTANTS.TZ_CONV_FORMAT);
		if(d1 == null){
			throw new DateConversionException("Exception occurred when formatting date: " + convertedDateTime + " to the format: " + COMMON_CONSTANTS.TZ_CONV_FORMAT);
		}
		
		return DateToCalendar(d1);
	}
	
	/**
	 * 
	 * @param xmlDate of format 20140925000001-0500
	 * @param toTZ
	 * @return Calendar
	 */
	public static String getOffsetFromMangoString(String xmlDate) throws DateConversionException{
		
		if(xmlDate == null || (xmlDate != null && !xmlDate.matches(STANDARD_DATE_TIME_REGEX_PATTERN))){
			throw new DateConversionException(xmlDate + " is not of format YYYYMMDDHH[MM[SS[.fff]]] ");
		}
		String offset = xmlDate.substring(xmlDate.length()-5);
		return offset;
	}
	
	/**
	 * 
	 * @param xmlDate of format 20140925000001-0500
	 * @param toTZ
	 * @return Calendar
	 */
	public static Calendar convertMangoStringToCal(String xmlDate) throws DateConversionException{
		
		if(xmlDate == null || (xmlDate != null && !xmlDate.matches(STANDARD_DATE_TIME_REGEX_PATTERN))){
			throw new DateConversionException(xmlDate + " is not of format YYYYMMDDHH[MM[SS[.fff]]] ");
		}
		String dateTime = xmlDate.substring(0, xmlDate.length()-5);
		
		Date date = parseDateTimeForSRQGrade(dateTime, "yyyyMMddHHmmss");
		return DateToCalendar(date);
	}
	
	/**
	 * 
	 * @param dateTime
	 * @param dateFormat
	 * @param fromTZ
	 * @param toTZ
	 * @return xmlDate of format 20140925000001-0500
	 */
	public static String convertToXMLDate(String dateTime, String dateFormat, String fromTZ, String toTZ) throws DateConversionException{
		
		Date date = parseDateTimeForSRQGrade(dateTime, dateFormat);
		if(date == null){
			throw new DateConversionException("Exception occurred when formatting date: " + dateTime + " to the format: " + dateFormat);
		}
		String convertedTime = convertTime(date, fromTZ, toTZ);
		
		Date d1 = parseDateTimeForSRQGrade(convertedTime, COMMON_CONSTANTS.TZ_CONV_FORMAT);
		if(d1 == null){
			throw new DateConversionException("Exception occurred when formatting date: " + convertedTime + " to the format: " + COMMON_CONSTANTS.TZ_CONV_FORMAT);
		}
		DateFormat df2 = new SimpleDateFormat("yyyyMMddHHmmss");

		int offsetInMillis =  DateTimeZone.forID(toTZ).getOffset(DateToCalendar(d1).getTimeInMillis());
		String offsetDst = String.format("%02d%02d", Math.abs(offsetInMillis / 3600000), Math.abs((offsetInMillis / 60000) % 60));
		offsetDst = (offsetInMillis >= 0 ? "+" : "-") + offsetDst;
		
		return df2.format(d1)+offsetDst;
	}
	
	public static String formatDateToMangoDateWithOffset(Calendar d1) throws DateConversionException {
		String formatDateTime = formatDateTime(d1, "yyyyMMddHHmmss");
		DateTimeZone dz = DateTimeZone.getDefault(); 
		//TimeZone timeZone = TimeZone.getTimeZone(System.getProperty("user.timezone"));
		//int offset = timeZone.getRawOffset();
		int offset = dz.getOffset(new DateTime());
		String gmtTZ = String.format("%s%02d%02d", 
		               offset < 0 ? "-" : "+", 
		               Math.abs(offset) / 3600000,
		               Math.abs(offset) / 60000 % 60);
		return formatDateTime+gmtTZ;
	}
	
	/**
	 * 
	 * @param date
	 * @param fromTZ
	 * @param toTZ
	 * @return
	 * @throws DateConversionException
	 */
	public static String convertTime(Date date, String fromTZ, String toTZ)  throws DateConversionException{
		if(toTZ == null)toTZ = "GB";
		SimpleDateFormat format = new SimpleDateFormat(COMMON_CONSTANTS.TZ_CONV_FORMAT);
		
		try {
			String formattedDate = format.format(date);
			format.setTimeZone(TimeZone.getTimeZone(fromTZ));
			Date d = format.parse(formattedDate);
			
			DateFormat df2 = new SimpleDateFormat(COMMON_CONSTANTS.TZ_CONV_FORMAT);
			df2.setTimeZone(TimeZone.getTimeZone(toTZ));  
			return df2.format(d);
		} catch (Exception e) {
			throw new DateConversionException("Exception occurred when formatting date:  " + e.getMessage());
		}
	}
	
	public static String formatDateFCR(Date date) {
		String dateFormat = "yyyyMMddHHmmss";
		SimpleDateFormat format = new SimpleDateFormat(dateFormat);
	//	format.setTimeZone(TimeZone.getTimeZone("UTC"));
		try {
			String formattedDate = format.format(date);
			return formattedDate;
		} catch (Exception ex) {
			if (log.isDebugEnabled())
				log.debug("Exception occurred when formatting date: "
						+ ex.getMessage());
			return null;
		}
	}
	
	public static Date getDateFromMangoDateString(String mangoDate) {
		Date parsedDate;
		try {
			parsedDate = parseDate(mangoDate, "yyyyMMdd");
		} catch (DateConversionException e) {
			if (log.isDebugEnabled())
				log.debug("Exception occurred when formatting mango string date into calendar date : "
						+ e.getMessage());
			return null;
		} 
		return parsedDate;
	}
	
	public static Calendar DateToCalendar(Date date){ 
	  Calendar cal = Calendar.getInstance();
	  cal.setTime(date);
	  return cal;
	}
	
	/**
	 * This method will return the Calendar Object which will only hold Date time. it will convert a given
	 * Calander object and Timezone to system Timezone
	 * @param fromCal
	 * @param fromTZ
	 * @return
	 */
	public static Calendar convertCalofTZtoSystemTZ(Calendar fromCal, String fromTZ) {
		String convertedDateTime = null;
		if(fromTZ.startsWith(COMMON_CONSTANTS.PLUS) || fromTZ.startsWith(COMMON_CONSTANTS.MINUS)){
			convertedDateTime=convertOffset(fromCal, fromTZ, getSystemTimeZone(), "dd/MM/yyyy HH:mm:ss");
		}else{
			convertedDateTime = convertTime(fromCal, fromTZ, getSystemTimeZone(), "dd/MM/yyyy HH:mm:ss");
		}
		if(convertedDateTime != null)
			return DateToCalendar(parseDateTimeForSRQGrade(convertedDateTime));
		
		return null;
	}
		

}
