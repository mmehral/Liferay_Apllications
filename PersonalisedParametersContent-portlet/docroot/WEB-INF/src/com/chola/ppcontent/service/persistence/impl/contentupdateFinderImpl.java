package com.chola.ppcontent.service.persistence.impl;

import java.util.Iterator;
import java.util.List;

import com.chola.ppcontent.model.contentuniqueinformation;
import com.chola.ppcontent.model.personalisedparameterscontentstore;
import com.chola.ppcontent.service.contentuniqueinformationLocalServiceUtil;
import com.chola.ppcontent.service.contentupdateLocalServiceUtil;
import com.chola.ppcontent.service.personalisedparameterscontentstoreLocalServiceUtil;
import com.chola.ppcontent.service.persistence.contentupdateFinder;
import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.SQLQuery;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.util.dao.orm.CustomSQLUtil;

public class contentupdateFinderImpl extends contentupdateFinderBaseImpl implements contentupdateFinder {
	private static final Log logger = LogFactoryUtil.getLog(contentupdateFinderImpl.class);

	public  boolean insertIntoContentUniqueInfo(Object[] contentDetails) {
		try {

			contentuniqueinformation cui = contentuniqueinformationLocalServiceUtil
					.createcontentuniqueinformation(CounterLocalServiceUtil.increment());
			cui.setContent_id(Long.parseLong(contentDetails[0].toString()));
			cui.setStatus(Long.parseLong(contentDetails[1].toString()));
			cui.setUdflag(Long.parseLong(contentDetails[2].toString()));
			cui.setContent_type(contentDetails[3].toString());
			cui.setNotification_text(contentDetails[4].toString());
			cui.setPageurl(contentDetails[5].toString());
			cui = contentuniqueinformationLocalServiceUtil.addcontentuniqueinformation(cui);
			return true;
		} catch (Exception e) {
			logger.error(e.getMessage());
			return false;
		}
	}

	public static final String unit="Unit";
	public static final String both="both";
	public static final String all="all";
	public static final String between="Between";
	public static final String greaterThan="Greater than";
	public static final String lessThan="Less than";
	public static final String department="Department";
	public static final String function="Function";
	public static final String designation="Designation";
	public static final String product="Product";
	public static final String zone="Zone";
	public static final String branch="Branch";
	public static final String grade="Grade";
	public static final String region="Region";
	public static final String location="Location";
	public static final String userIdString="User ID";
	public static final String allUserString="All User";
	
	public  boolean insertIntoPPContentStore(String businessId, String[] values, String gender, String age,
			String option, long uniqueContentId, String lessthan_age, String greaterthan_age,
			String between_from_to_age, long notification_type) {

		String content_idVal = String.valueOf(uniqueContentId);
		String businessVal = null;
		String genderVal = gender.toUpperCase();
		String age_typeVal = age;
		String age_Val = null;
		long notification_typeVal = notification_type;
		
		

		if (gender.equalsIgnoreCase(both)) {
			genderVal = null;
		}

		try {
			// session = openSession();

			businessVal = contentupdateLocalServiceUtil.getBusinessNames(businessId);

			if (option.equalsIgnoreCase(unit) && age.equalsIgnoreCase(all)) {

				age_typeVal = age;
				age_Val = null;

				for (int i = 0; i < values.length; i++) {
					personalisedparameterscontentstore ppcs = personalisedparameterscontentstoreLocalServiceUtil
							.createpersonalisedparameterscontentstore(CounterLocalServiceUtil.increment());
					ppcs.setContent_id(Long.parseLong(content_idVal));
					ppcs.setBusiness(businessVal);
					ppcs.setUnit(values[i]);
					ppcs.setGender(genderVal);
					ppcs.setAge_type(age_typeVal);
					ppcs.setAge_value(age_Val);
					ppcs.setNotification_type(notification_typeVal);
					personalisedparameterscontentstoreLocalServiceUtil
							.addpersonalisedparameterscontentstore(ppcs);
				}
			} else if (option.equalsIgnoreCase(unit) && age.startsWith(between)) {
				age_typeVal = age;
				age_Val = between_from_to_age;

				for (int i = 0; i < values.length; i++) {
					personalisedparameterscontentstore ppcs = personalisedparameterscontentstoreLocalServiceUtil
							.createpersonalisedparameterscontentstore(CounterLocalServiceUtil.increment());
					ppcs.setContent_id(Long.parseLong(content_idVal));
					ppcs.setBusiness(businessVal);
					ppcs.setUnit(values[i]);
					ppcs.setGender(genderVal);
					ppcs.setAge_type(age_typeVal);
					ppcs.setAge_value(age_Val);
					ppcs.setNotification_type(notification_typeVal);
					personalisedparameterscontentstoreLocalServiceUtil
							.addpersonalisedparameterscontentstore(ppcs);
				}
			} else if (option.equalsIgnoreCase(unit) && age.startsWith(greaterThan)) {
				age_typeVal = age;
				age_Val = greaterthan_age;

				for (int i = 0; i < values.length; i++) {
					personalisedparameterscontentstore ppcs = personalisedparameterscontentstoreLocalServiceUtil
							.createpersonalisedparameterscontentstore(CounterLocalServiceUtil.increment());
					ppcs.setContent_id(Long.parseLong(content_idVal));
					ppcs.setBusiness(businessVal);
					ppcs.setUnit(values[i]);
					ppcs.setGender(genderVal);
					ppcs.setAge_type(age_typeVal);
					ppcs.setAge_value(age_Val);
					ppcs.setNotification_type(notification_typeVal);
					personalisedparameterscontentstoreLocalServiceUtil
							.addpersonalisedparameterscontentstore(ppcs);
				}
			}

			else if (option.equalsIgnoreCase(unit) && age.startsWith(lessThan)) {

				age_typeVal = age;
				age_Val = lessthan_age;

				for (int i = 0; i < values.length; i++) {
					personalisedparameterscontentstore ppcs = personalisedparameterscontentstoreLocalServiceUtil
							.createpersonalisedparameterscontentstore(CounterLocalServiceUtil.increment());
					ppcs.setContent_id(Long.parseLong(content_idVal));
					ppcs.setBusiness(businessVal);
					ppcs.setUnit(values[i]);
					ppcs.setGender(genderVal);
					ppcs.setAge_type(age_typeVal);
					ppcs.setAge_value(age_Val);
					ppcs.setNotification_type(notification_typeVal);
					personalisedparameterscontentstoreLocalServiceUtil
							.addpersonalisedparameterscontentstore(ppcs);
				}
			}

			// Intended Logic For Department

			else if (option.equalsIgnoreCase(department) && age.equalsIgnoreCase(all)) {

				age_typeVal = age;
				age_Val = null;

				for (int i = 0; i < values.length; i++) {
					personalisedparameterscontentstore ppcs = personalisedparameterscontentstoreLocalServiceUtil
							.createpersonalisedparameterscontentstore(CounterLocalServiceUtil.increment());
					ppcs.setContent_id(Long.parseLong(content_idVal));
					ppcs.setBusiness(businessVal);
					ppcs.setDepartment(values[i]);
					ppcs.setGender(genderVal);
					ppcs.setAge_type(age_typeVal);
					ppcs.setAge_value(age_Val);
					ppcs.setNotification_type(notification_typeVal);
					personalisedparameterscontentstoreLocalServiceUtil
							.addpersonalisedparameterscontentstore(ppcs);
				}
			} else if (option.equalsIgnoreCase(department) && age.startsWith(between)) {
				age_typeVal = age;
				age_Val = between_from_to_age;

				for (int i = 0; i < values.length; i++) {
					personalisedparameterscontentstore ppcs = personalisedparameterscontentstoreLocalServiceUtil
							.createpersonalisedparameterscontentstore(CounterLocalServiceUtil.increment());
					ppcs.setContent_id(Long.parseLong(content_idVal));
					ppcs.setBusiness(businessVal);
					ppcs.setDepartment(values[i]);
					ppcs.setGender(genderVal);
					ppcs.setAge_type(age_typeVal);
					ppcs.setAge_value(age_Val);
					ppcs.setNotification_type(notification_typeVal);
					personalisedparameterscontentstoreLocalServiceUtil
							.addpersonalisedparameterscontentstore(ppcs);
				}
			} else if (option.equalsIgnoreCase(department) && age.startsWith(greaterThan)) {
				age_typeVal = age;
				age_Val = greaterthan_age;

				for (int i = 0; i < values.length; i++) {
					personalisedparameterscontentstore ppcs = personalisedparameterscontentstoreLocalServiceUtil
							.createpersonalisedparameterscontentstore(CounterLocalServiceUtil.increment());
					ppcs.setContent_id(Long.parseLong(content_idVal));
					ppcs.setBusiness(businessVal);
					ppcs.setDepartment(values[i]);
					ppcs.setGender(genderVal);
					ppcs.setAge_type(age_typeVal);
					ppcs.setAge_value(age_Val);
					ppcs.setNotification_type(notification_typeVal);
					personalisedparameterscontentstoreLocalServiceUtil
							.addpersonalisedparameterscontentstore(ppcs);
				}
			}

			else if (option.equalsIgnoreCase(department) && age.startsWith(lessThan)) {

				age_typeVal = age;
				age_Val = lessthan_age;

				for (int i = 0; i < values.length; i++) {
					personalisedparameterscontentstore ppcs = personalisedparameterscontentstoreLocalServiceUtil
							.createpersonalisedparameterscontentstore(CounterLocalServiceUtil.increment());
					ppcs.setContent_id(Long.parseLong(content_idVal));
					ppcs.setBusiness(businessVal);
					ppcs.setDepartment(values[i]);
					ppcs.setGender(genderVal);
					ppcs.setAge_type(age_typeVal);
					ppcs.setAge_value(age_Val);
					ppcs.setNotification_type(notification_typeVal);
					personalisedparameterscontentstoreLocalServiceUtil
							.addpersonalisedparameterscontentstore(ppcs);
				}
			}

			// Intended Logic for Function

			else if (option.equalsIgnoreCase(function) && age.equalsIgnoreCase(all)) {

				age_typeVal = age;
				age_Val = null;

				for (int i = 0; i < values.length; i++) {
					personalisedparameterscontentstore ppcs = personalisedparameterscontentstoreLocalServiceUtil
							.createpersonalisedparameterscontentstore(CounterLocalServiceUtil.increment());
					ppcs.setContent_id(Long.parseLong(content_idVal));
					ppcs.setBusiness(businessVal);
					ppcs.setFunction(values[i]);
					ppcs.setGender(genderVal);
					ppcs.setAge_type(age_typeVal);
					ppcs.setAge_value(age_Val);
					ppcs.setNotification_type(notification_typeVal);
					personalisedparameterscontentstoreLocalServiceUtil
							.addpersonalisedparameterscontentstore(ppcs);
				}
			} else if (option.equalsIgnoreCase(function) && age.startsWith(between)) {
				age_typeVal = age;
				age_Val = between_from_to_age;

				for (int i = 0; i < values.length; i++) {
					personalisedparameterscontentstore ppcs = personalisedparameterscontentstoreLocalServiceUtil
							.createpersonalisedparameterscontentstore(CounterLocalServiceUtil.increment());
					ppcs.setContent_id(Long.parseLong(content_idVal));
					ppcs.setBusiness(businessVal);
					ppcs.setFunction(values[i]);
					ppcs.setGender(genderVal);
					ppcs.setAge_type(age_typeVal);
					ppcs.setAge_value(age_Val);
					ppcs.setNotification_type(notification_typeVal);
					personalisedparameterscontentstoreLocalServiceUtil
							.addpersonalisedparameterscontentstore(ppcs);
				}
			} else if (option.equalsIgnoreCase(function) && age.startsWith(greaterThan)) {
				age_typeVal = age;
				age_Val = greaterthan_age;

				for (int i = 0; i < values.length; i++) {
					personalisedparameterscontentstore ppcs = personalisedparameterscontentstoreLocalServiceUtil
							.createpersonalisedparameterscontentstore(CounterLocalServiceUtil.increment());
					ppcs.setContent_id(Long.parseLong(content_idVal));
					ppcs.setBusiness(businessVal);
					ppcs.setFunction(values[i]);
					ppcs.setGender(genderVal);
					ppcs.setAge_type(age_typeVal);
					ppcs.setAge_value(age_Val);
					ppcs.setNotification_type(notification_typeVal);
					personalisedparameterscontentstoreLocalServiceUtil
							.addpersonalisedparameterscontentstore(ppcs);
				}
			}

			else if (option.equalsIgnoreCase(function) && age.startsWith(lessThan)) {

				age_typeVal = age;
				age_Val = lessthan_age;

				for (int i = 0; i < values.length; i++) {
					personalisedparameterscontentstore ppcs = personalisedparameterscontentstoreLocalServiceUtil
							.createpersonalisedparameterscontentstore(CounterLocalServiceUtil.increment());
					ppcs.setContent_id(Long.parseLong(content_idVal));
					ppcs.setBusiness(businessVal);
					ppcs.setFunction(values[i]);
					ppcs.setGender(genderVal);
					ppcs.setAge_type(age_typeVal);
					ppcs.setAge_value(age_Val);
					ppcs.setNotification_type(notification_typeVal);
					personalisedparameterscontentstoreLocalServiceUtil
							.addpersonalisedparameterscontentstore(ppcs);
				}
			}

			// Intended Logic for Designation

			else if (option.equalsIgnoreCase(designation) && age.equalsIgnoreCase(all)) {

				age_typeVal = age;
				age_Val = null;

				for (int i = 0; i < values.length; i++) {
					personalisedparameterscontentstore ppcs = personalisedparameterscontentstoreLocalServiceUtil
							.createpersonalisedparameterscontentstore(CounterLocalServiceUtil.increment());
					ppcs.setContent_id(Long.parseLong(content_idVal));
					ppcs.setBusiness(businessVal);
					ppcs.setDesignation(values[i]);
					ppcs.setGender(genderVal);
					ppcs.setAge_type(age_typeVal);
					ppcs.setAge_value(age_Val);
					ppcs.setNotification_type(notification_typeVal);
					personalisedparameterscontentstoreLocalServiceUtil
							.addpersonalisedparameterscontentstore(ppcs);
				}
			} else if (option.equalsIgnoreCase(designation) && age.startsWith(between)) {
				age_typeVal = age;
				age_Val = between_from_to_age;

				for (int i = 0; i < values.length; i++) {
					personalisedparameterscontentstore ppcs = personalisedparameterscontentstoreLocalServiceUtil
							.createpersonalisedparameterscontentstore(CounterLocalServiceUtil.increment());
					ppcs.setContent_id(Long.parseLong(content_idVal));
					ppcs.setBusiness(businessVal);
					ppcs.setDesignation(values[i]);
					ppcs.setGender(genderVal);
					ppcs.setAge_type(age_typeVal);
					ppcs.setAge_value(age_Val);
					ppcs.setNotification_type(notification_typeVal);
					personalisedparameterscontentstoreLocalServiceUtil
							.addpersonalisedparameterscontentstore(ppcs);
				}
			} else if (option.equalsIgnoreCase(designation) && age.startsWith(greaterThan)) {
				age_typeVal = age;
				age_Val = greaterthan_age;

				for (int i = 0; i < values.length; i++) {
					personalisedparameterscontentstore ppcs = personalisedparameterscontentstoreLocalServiceUtil
							.createpersonalisedparameterscontentstore(CounterLocalServiceUtil.increment());
					ppcs.setContent_id(Long.parseLong(content_idVal));
					ppcs.setBusiness(businessVal);
					ppcs.setDesignation(values[i]);
					ppcs.setGender(genderVal);
					ppcs.setAge_type(age_typeVal);
					ppcs.setAge_value(age_Val);
					ppcs.setNotification_type(notification_typeVal);
					personalisedparameterscontentstoreLocalServiceUtil
							.addpersonalisedparameterscontentstore(ppcs);
				}
			}

			else if (option.equalsIgnoreCase(designation) && age.startsWith(lessThan)) {

				age_typeVal = age;
				age_Val = lessthan_age;

				for (int i = 0; i < values.length; i++) {
					personalisedparameterscontentstore ppcs = personalisedparameterscontentstoreLocalServiceUtil
							.createpersonalisedparameterscontentstore(CounterLocalServiceUtil.increment());
					ppcs.setContent_id(Long.parseLong(content_idVal));
					ppcs.setBusiness(businessVal);
					ppcs.setDesignation(values[i]);
					ppcs.setGender(genderVal);
					ppcs.setAge_type(age_typeVal);
					ppcs.setAge_value(age_Val);
					ppcs.setNotification_type(notification_typeVal);
					personalisedparameterscontentstoreLocalServiceUtil
							.addpersonalisedparameterscontentstore(ppcs);
				}
			}

			// Intended Logic For Product

			else if (option.equalsIgnoreCase(product) && age.equalsIgnoreCase(all)) {

				age_typeVal = age;
				age_Val = null;

				for (int i = 0; i < values.length; i++) {
					personalisedparameterscontentstore ppcs = personalisedparameterscontentstoreLocalServiceUtil
							.createpersonalisedparameterscontentstore(CounterLocalServiceUtil.increment());
					ppcs.setContent_id(Long.parseLong(content_idVal));
					ppcs.setBusiness(businessVal);
					ppcs.setProduct(values[i]);
					ppcs.setGender(genderVal);
					ppcs.setAge_type(age_typeVal);
					ppcs.setAge_value(age_Val);
					ppcs.setNotification_type(notification_typeVal);
					 personalisedparameterscontentstoreLocalServiceUtil
							.addpersonalisedparameterscontentstore(ppcs);
				}
			} else if (option.equalsIgnoreCase(product) && age.startsWith(between)) {
				age_typeVal = age;
				age_Val = between_from_to_age;

				for (int i = 0; i < values.length; i++) {
					personalisedparameterscontentstore ppcs = personalisedparameterscontentstoreLocalServiceUtil
							.createpersonalisedparameterscontentstore(CounterLocalServiceUtil.increment());
					ppcs.setContent_id(Long.parseLong(content_idVal));
					ppcs.setBusiness(businessVal);
					ppcs.setProduct(values[i]);
					ppcs.setGender(genderVal);
					ppcs.setAge_type(age_typeVal);
					ppcs.setAge_value(age_Val);
					ppcs.setNotification_type(notification_typeVal);
					 personalisedparameterscontentstoreLocalServiceUtil
							.addpersonalisedparameterscontentstore(ppcs);
				}
			} else if (option.equalsIgnoreCase(product) && age.startsWith(greaterThan)) {
				age_typeVal = age;
				age_Val = greaterthan_age;

				for (int i = 0; i < values.length; i++) {
					personalisedparameterscontentstore ppcs = personalisedparameterscontentstoreLocalServiceUtil
							.createpersonalisedparameterscontentstore(CounterLocalServiceUtil.increment());
					ppcs.setContent_id(Long.parseLong(content_idVal));
					ppcs.setBusiness(businessVal);
					ppcs.setProduct(values[i]);
					ppcs.setGender(genderVal);
					ppcs.setAge_type(age_typeVal);
					ppcs.setAge_value(age_Val);
					ppcs.setNotification_type(notification_typeVal);
					 personalisedparameterscontentstoreLocalServiceUtil
							.addpersonalisedparameterscontentstore(ppcs);
				}
			}

			else if (option.equalsIgnoreCase(product) && age.startsWith(lessThan)) {

				age_typeVal = age;
				age_Val = lessthan_age;

				for (int i = 0; i < values.length; i++) {
					personalisedparameterscontentstore ppcs = personalisedparameterscontentstoreLocalServiceUtil
							.createpersonalisedparameterscontentstore(CounterLocalServiceUtil.increment());
					ppcs.setContent_id(Long.parseLong(content_idVal));
					ppcs.setBusiness(businessVal);
					ppcs.setProduct(values[i]);
					ppcs.setGender(genderVal);
					ppcs.setAge_type(age_typeVal);
					ppcs.setAge_value(age_Val);
					ppcs.setNotification_type(notification_typeVal);
					 personalisedparameterscontentstoreLocalServiceUtil
							.addpersonalisedparameterscontentstore(ppcs);
				}
			}

			// Intended Logic For Zone

			else if (option.equalsIgnoreCase(zone) && age.equalsIgnoreCase(all)) {

				age_typeVal = age;
				age_Val = null;

				for (int i = 0; i < values.length; i++) {
					personalisedparameterscontentstore ppcs = personalisedparameterscontentstoreLocalServiceUtil
							.createpersonalisedparameterscontentstore(CounterLocalServiceUtil.increment());
					ppcs.setContent_id(Long.parseLong(content_idVal));
					ppcs.setBusiness(businessVal);
					ppcs.setZone(values[i]);
					ppcs.setGender(genderVal);
					ppcs.setAge_type(age_typeVal);
					ppcs.setAge_value(age_Val);
					ppcs.setNotification_type(notification_typeVal);
					personalisedparameterscontentstoreLocalServiceUtil
							.addpersonalisedparameterscontentstore(ppcs);
				}
			} else if (option.equalsIgnoreCase(zone) && age.startsWith(between)) {
				age_typeVal = age;
				age_Val = between_from_to_age;

				for (int i = 0; i < values.length; i++) {
					personalisedparameterscontentstore ppcs = personalisedparameterscontentstoreLocalServiceUtil
							.createpersonalisedparameterscontentstore(CounterLocalServiceUtil.increment());
					ppcs.setContent_id(Long.parseLong(content_idVal));
					ppcs.setBusiness(businessVal);
					ppcs.setZone(values[i]);
					ppcs.setGender(genderVal);
					ppcs.setAge_type(age_typeVal);
					ppcs.setAge_value(age_Val);
					ppcs.setNotification_type(notification_typeVal);
					 personalisedparameterscontentstoreLocalServiceUtil
							.addpersonalisedparameterscontentstore(ppcs);
				}
			} else if (option.equalsIgnoreCase(zone) && age.startsWith(greaterThan)) {
				age_typeVal = age;
				age_Val = greaterthan_age;

				for (int i = 0; i < values.length; i++) {
					personalisedparameterscontentstore ppcs = personalisedparameterscontentstoreLocalServiceUtil
							.createpersonalisedparameterscontentstore(CounterLocalServiceUtil.increment());
					ppcs.setContent_id(Long.parseLong(content_idVal));
					ppcs.setBusiness(businessVal);
					ppcs.setZone(values[i]);
					ppcs.setGender(genderVal);
					ppcs.setAge_type(age_typeVal);
					ppcs.setAge_value(age_Val);
					ppcs.setNotification_type(notification_typeVal);
					personalisedparameterscontentstoreLocalServiceUtil
							.addpersonalisedparameterscontentstore(ppcs);
				}
			}

			else if (option.equalsIgnoreCase(zone) && age.startsWith(lessThan)) {

				age_typeVal = age;
				age_Val = lessthan_age;

				for (int i = 0; i < values.length; i++) {
					personalisedparameterscontentstore ppcs = personalisedparameterscontentstoreLocalServiceUtil
							.createpersonalisedparameterscontentstore(CounterLocalServiceUtil.increment());
					ppcs.setContent_id(Long.parseLong(content_idVal));
					ppcs.setBusiness(businessVal);
					ppcs.setZone(values[i]);
					ppcs.setGender(genderVal);
					ppcs.setAge_type(age_typeVal);
					ppcs.setAge_value(age_Val);
					ppcs.setNotification_type(notification_typeVal);
					 personalisedparameterscontentstoreLocalServiceUtil
							.addpersonalisedparameterscontentstore(ppcs);
				}
			}

			// Intended Logic For Branch

			else if (option.equalsIgnoreCase(branch) && age.equalsIgnoreCase(all)) {

				age_typeVal = age;
				age_Val = null;

				for (int i = 0; i < values.length; i++) {
					personalisedparameterscontentstore ppcs = personalisedparameterscontentstoreLocalServiceUtil
							.createpersonalisedparameterscontentstore(CounterLocalServiceUtil.increment());
					ppcs.setContent_id(Long.parseLong(content_idVal));
					ppcs.setBusiness(businessVal);
					ppcs.setBranch(values[i]);
					ppcs.setGender(genderVal);
					ppcs.setAge_type(age_typeVal);
					ppcs.setAge_value(age_Val);
					ppcs.setNotification_type(notification_typeVal);
					 personalisedparameterscontentstoreLocalServiceUtil
							.addpersonalisedparameterscontentstore(ppcs);
				}
			} else if (option.equalsIgnoreCase(branch) && age.startsWith(between)) {
				age_typeVal = age;
				age_Val = between_from_to_age;

				for (int i = 0; i < values.length; i++) {
					personalisedparameterscontentstore ppcs = personalisedparameterscontentstoreLocalServiceUtil
							.createpersonalisedparameterscontentstore(CounterLocalServiceUtil.increment());
					ppcs.setContent_id(Long.parseLong(content_idVal));
					ppcs.setBusiness(businessVal);
					ppcs.setBranch(values[i]);
					ppcs.setGender(genderVal);
					ppcs.setAge_type(age_typeVal);
					ppcs.setAge_value(age_Val);
					ppcs.setNotification_type(notification_typeVal);
					 personalisedparameterscontentstoreLocalServiceUtil
							.addpersonalisedparameterscontentstore(ppcs);
				}
			} else if (option.equalsIgnoreCase(branch) && age.startsWith(greaterThan)) {
				age_typeVal = age;
				age_Val = greaterthan_age;

				for (int i = 0; i < values.length; i++) {
					personalisedparameterscontentstore ppcs = personalisedparameterscontentstoreLocalServiceUtil
							.createpersonalisedparameterscontentstore(CounterLocalServiceUtil.increment());
					ppcs.setContent_id(Long.parseLong(content_idVal));
					ppcs.setBusiness(businessVal);
					ppcs.setBranch(values[i]);
					ppcs.setGender(genderVal);
					ppcs.setAge_type(age_typeVal);
					ppcs.setAge_value(age_Val);
					ppcs.setNotification_type(notification_typeVal);
					personalisedparameterscontentstoreLocalServiceUtil
							.addpersonalisedparameterscontentstore(ppcs);
				}
			}

			else if (option.equalsIgnoreCase(branch) && age.startsWith(lessThan)) {

				age_typeVal = age;
				age_Val = lessthan_age;

				for (int i = 0; i < values.length; i++) {
					personalisedparameterscontentstore ppcs = personalisedparameterscontentstoreLocalServiceUtil
							.createpersonalisedparameterscontentstore(CounterLocalServiceUtil.increment());
					ppcs.setContent_id(Long.parseLong(content_idVal));
					ppcs.setBusiness(businessVal);
					ppcs.setBranch(values[i]);
					ppcs.setGender(genderVal);
					ppcs.setAge_type(age_typeVal);
					ppcs.setAge_value(age_Val);
					ppcs.setNotification_type(notification_typeVal);
					 personalisedparameterscontentstoreLocalServiceUtil
							.addpersonalisedparameterscontentstore(ppcs);
				}
			}

			// Intended Logic For Grade

			else if (option.equalsIgnoreCase(grade) && age.equalsIgnoreCase(all)) {

				age_typeVal = age;
				age_Val = null;

				for (int i = 0; i < values.length; i++) {
					personalisedparameterscontentstore ppcs = personalisedparameterscontentstoreLocalServiceUtil
							.createpersonalisedparameterscontentstore(CounterLocalServiceUtil.increment());
					ppcs.setContent_id(Long.parseLong(content_idVal));
					ppcs.setBusiness(businessVal);
					ppcs.setGrade(values[i]);
					ppcs.setGender(genderVal);
					ppcs.setAge_type(age_typeVal);
					ppcs.setAge_value(age_Val);
					ppcs.setNotification_type(notification_typeVal);
					 personalisedparameterscontentstoreLocalServiceUtil
							.addpersonalisedparameterscontentstore(ppcs);
				}
			} else if (option.equalsIgnoreCase(grade) && age.startsWith(between)) {
				age_typeVal = age;
				age_Val = between_from_to_age;

				for (int i = 0; i < values.length; i++) {
					personalisedparameterscontentstore ppcs = personalisedparameterscontentstoreLocalServiceUtil
							.createpersonalisedparameterscontentstore(CounterLocalServiceUtil.increment());
					ppcs.setContent_id(Long.parseLong(content_idVal));
					ppcs.setBusiness(businessVal);
					ppcs.setGrade(values[i]);
					ppcs.setGender(genderVal);
					ppcs.setAge_type(age_typeVal);
					ppcs.setAge_value(age_Val);
					ppcs.setNotification_type(notification_typeVal);
					 personalisedparameterscontentstoreLocalServiceUtil
							.addpersonalisedparameterscontentstore(ppcs);
				}
			} else if (option.equalsIgnoreCase(grade) && age.startsWith(greaterThan)) {
				age_typeVal = age;
				age_Val = greaterthan_age;

				for (int i = 0; i < values.length; i++) {
					personalisedparameterscontentstore ppcs = personalisedparameterscontentstoreLocalServiceUtil
							.createpersonalisedparameterscontentstore(CounterLocalServiceUtil.increment());
					ppcs.setContent_id(Long.parseLong(content_idVal));
					ppcs.setBusiness(businessVal);
					ppcs.setGrade(values[i]);
					ppcs.setGender(genderVal);
					ppcs.setAge_type(age_typeVal);
					ppcs.setAge_value(age_Val);
					ppcs.setNotification_type(notification_typeVal);
					personalisedparameterscontentstoreLocalServiceUtil
							.addpersonalisedparameterscontentstore(ppcs);
				}
			}

			else if (option.equalsIgnoreCase(grade) && age.startsWith(lessThan)) {

				age_typeVal = age;
				age_Val = lessthan_age;

				for (int i = 0; i < values.length; i++) {
					personalisedparameterscontentstore ppcs = personalisedparameterscontentstoreLocalServiceUtil
							.createpersonalisedparameterscontentstore(CounterLocalServiceUtil.increment());
					ppcs.setContent_id(Long.parseLong(content_idVal));
					ppcs.setBusiness(businessVal);
					ppcs.setGrade(values[i]);
					ppcs.setGender(genderVal);
					ppcs.setAge_type(age_typeVal);
					ppcs.setAge_value(age_Val);
					ppcs.setNotification_type(notification_typeVal);
					personalisedparameterscontentstoreLocalServiceUtil
							.addpersonalisedparameterscontentstore(ppcs);
				}
			}

			// Intended Logic For Region

			else if (option.equalsIgnoreCase(region) && age.equalsIgnoreCase(all)) {

				age_typeVal = age;
				age_Val = null;

				for (int i = 0; i < values.length; i++) {
					personalisedparameterscontentstore ppcs = personalisedparameterscontentstoreLocalServiceUtil
							.createpersonalisedparameterscontentstore(CounterLocalServiceUtil.increment());
					ppcs.setContent_id(Long.parseLong(content_idVal));
					ppcs.setBusiness(businessVal);
					ppcs.setRegion(values[i]);
					ppcs.setGender(genderVal);
					ppcs.setAge_type(age_typeVal);
					ppcs.setAge_value(age_Val);
					ppcs.setNotification_type(notification_typeVal);
					 personalisedparameterscontentstoreLocalServiceUtil
							.addpersonalisedparameterscontentstore(ppcs);
				}
			} else if (option.equalsIgnoreCase(region) && age.startsWith(between)) {
				age_typeVal = age;
				age_Val = between_from_to_age;

				for (int i = 0; i < values.length; i++) {
					personalisedparameterscontentstore ppcs = personalisedparameterscontentstoreLocalServiceUtil
							.createpersonalisedparameterscontentstore(CounterLocalServiceUtil.increment());
					ppcs.setContent_id(Long.parseLong(content_idVal));
					ppcs.setBusiness(businessVal);
					ppcs.setRegion(values[i]);
					ppcs.setGender(genderVal);
					ppcs.setAge_type(age_typeVal);
					ppcs.setAge_value(age_Val);
					ppcs.setNotification_type(notification_typeVal);
					 personalisedparameterscontentstoreLocalServiceUtil
							.addpersonalisedparameterscontentstore(ppcs);
				}
			} else if (option.equalsIgnoreCase(region) && age.startsWith(greaterThan)) {
				age_typeVal = age;
				age_Val = greaterthan_age;

				for (int i = 0; i < values.length; i++) {
					personalisedparameterscontentstore ppcs = personalisedparameterscontentstoreLocalServiceUtil
							.createpersonalisedparameterscontentstore(CounterLocalServiceUtil.increment());
					ppcs.setContent_id(Long.parseLong(content_idVal));
					ppcs.setBusiness(businessVal);
					ppcs.setRegion(values[i]);
					ppcs.setGender(genderVal);
					ppcs.setAge_type(age_typeVal);
					ppcs.setAge_value(age_Val);
					ppcs.setNotification_type(notification_typeVal);
					 personalisedparameterscontentstoreLocalServiceUtil
							.addpersonalisedparameterscontentstore(ppcs);
				}
			}

			else if (option.equalsIgnoreCase(region) && age.startsWith(lessThan)) {

				age_typeVal = age;
				age_Val = lessthan_age;

				for (int i = 0; i < values.length; i++) {
					personalisedparameterscontentstore ppcs = personalisedparameterscontentstoreLocalServiceUtil
							.createpersonalisedparameterscontentstore(CounterLocalServiceUtil.increment());
					ppcs.setContent_id(Long.parseLong(content_idVal));
					ppcs.setBusiness(businessVal);
					ppcs.setRegion(values[i]);
					ppcs.setGender(genderVal);
					ppcs.setAge_type(age_typeVal);
					ppcs.setAge_value(age_Val);
					ppcs.setNotification_type(notification_typeVal);
					 personalisedparameterscontentstoreLocalServiceUtil
							.addpersonalisedparameterscontentstore(ppcs);
				}
			}

			// Intended Logic For Location

			else if (option.equalsIgnoreCase(location) && age.equalsIgnoreCase(all)) {

				age_typeVal = age;
				age_Val = null;

				for (int i = 0; i < values.length; i++) {
					personalisedparameterscontentstore ppcs = personalisedparameterscontentstoreLocalServiceUtil
							.createpersonalisedparameterscontentstore(CounterLocalServiceUtil.increment());
					ppcs.setContent_id(Long.parseLong(content_idVal));
					ppcs.setBusiness(businessVal);
					ppcs.setLocation(values[i]);
					ppcs.setGender(genderVal);
					ppcs.setAge_type(age_typeVal);
					ppcs.setAge_value(age_Val);
					ppcs.setNotification_type(notification_typeVal);
					 personalisedparameterscontentstoreLocalServiceUtil
							.addpersonalisedparameterscontentstore(ppcs);
				}
			} else if (option.equalsIgnoreCase(location) && age.startsWith(between)) {
				age_typeVal = age;
				age_Val = between_from_to_age;

				for (int i = 0; i < values.length; i++) {
					personalisedparameterscontentstore ppcs = personalisedparameterscontentstoreLocalServiceUtil
							.createpersonalisedparameterscontentstore(CounterLocalServiceUtil.increment());
					ppcs.setContent_id(Long.parseLong(content_idVal));
					ppcs.setBusiness(businessVal);
					ppcs.setLocation(values[i]);
					ppcs.setGender(genderVal);
					ppcs.setAge_type(age_typeVal);
					ppcs.setAge_value(age_Val);
					ppcs.setNotification_type(notification_typeVal);
					 personalisedparameterscontentstoreLocalServiceUtil
							.addpersonalisedparameterscontentstore(ppcs);
				}
			} else if (option.equalsIgnoreCase(location) && age.startsWith(greaterThan)) {
				age_typeVal = age;
				age_Val = greaterthan_age;

				for (int i = 0; i < values.length; i++) {
					personalisedparameterscontentstore ppcs = personalisedparameterscontentstoreLocalServiceUtil
							.createpersonalisedparameterscontentstore(CounterLocalServiceUtil.increment());
					ppcs.setContent_id(Long.parseLong(content_idVal));
					ppcs.setBusiness(businessVal);
					ppcs.setLocation(values[i]);
					ppcs.setGender(genderVal);
					ppcs.setAge_type(age_typeVal);
					ppcs.setAge_value(age_Val);
					ppcs.setNotification_type(notification_typeVal);
					 personalisedparameterscontentstoreLocalServiceUtil
							.addpersonalisedparameterscontentstore(ppcs);
				}
			}

			else if (option.equalsIgnoreCase(location) && age.startsWith(lessThan)) {

				age_typeVal = age;
				age_Val = lessthan_age;

				for (int i = 0; i < values.length; i++) {
					personalisedparameterscontentstore ppcs = personalisedparameterscontentstoreLocalServiceUtil
							.createpersonalisedparameterscontentstore(CounterLocalServiceUtil.increment());
					ppcs.setContent_id(Long.parseLong(content_idVal));
					ppcs.setBusiness(businessVal);
					ppcs.setLocation(values[i]);
					ppcs.setGender(genderVal);
					ppcs.setAge_type(age_typeVal);
					ppcs.setAge_value(age_Val);
					ppcs.setNotification_type(notification_typeVal);
					 personalisedparameterscontentstoreLocalServiceUtil
							.addpersonalisedparameterscontentstore(ppcs);
				}
			}

			// Intended Logic for UserId

			else if (option.equalsIgnoreCase(userIdString)) {

				for (int i = 0; i < values.length; i++) {
					personalisedparameterscontentstore ppcs = personalisedparameterscontentstoreLocalServiceUtil
							.createpersonalisedparameterscontentstore(CounterLocalServiceUtil.increment());
					ppcs.setContent_id(Long.parseLong(content_idVal));
					ppcs.setBusiness(businessVal);
					ppcs.setUser_id(values[i]);
					ppcs.setGender(genderVal);
					ppcs.setAge_type(age_typeVal);
					ppcs.setAge_value(age_Val);
					ppcs.setNotification_type(notification_typeVal);
					 personalisedparameterscontentstoreLocalServiceUtil
							.addpersonalisedparameterscontentstore(ppcs);
				}
			}

			// Inteded logic for All User

			else if (option.equalsIgnoreCase(allUserString) && age.equalsIgnoreCase(all)) {
				age_typeVal = age;
				age_Val = null;
				personalisedparameterscontentstore ppcs = personalisedparameterscontentstoreLocalServiceUtil
						.createpersonalisedparameterscontentstore(CounterLocalServiceUtil.increment());
				ppcs.setContent_id(Long.parseLong(content_idVal));
				ppcs.setBusiness(businessVal);
				ppcs.setGender(genderVal);
				ppcs.setAge_type(age_typeVal);
				ppcs.setAge_value(age_Val);
				ppcs.setNotification_type(notification_typeVal);
				 personalisedparameterscontentstoreLocalServiceUtil
						.addpersonalisedparameterscontentstore(ppcs);

			} else if (option.equalsIgnoreCase(allUserString) && age.startsWith(between)) {
				age_typeVal = age;
				age_Val = between_from_to_age;
				personalisedparameterscontentstore ppcs = personalisedparameterscontentstoreLocalServiceUtil
						.createpersonalisedparameterscontentstore(CounterLocalServiceUtil.increment());
				ppcs.setContent_id(Long.parseLong(content_idVal));
				ppcs.setBusiness(businessVal);
				ppcs.setGender(genderVal);
				ppcs.setAge_type(age_typeVal);
				ppcs.setAge_value(age_Val);
				ppcs.setNotification_type(notification_typeVal);
				personalisedparameterscontentstoreLocalServiceUtil
						.addpersonalisedparameterscontentstore(ppcs);


			} else if (option.equalsIgnoreCase(allUserString) && age.startsWith(greaterThan)) {
				age_typeVal = age;
				age_Val = greaterthan_age;

				personalisedparameterscontentstore ppcs = personalisedparameterscontentstoreLocalServiceUtil
						.createpersonalisedparameterscontentstore(CounterLocalServiceUtil.increment());
				ppcs.setContent_id(Long.parseLong(content_idVal));
				ppcs.setBusiness(businessVal);
				ppcs.setGender(genderVal);
				ppcs.setAge_type(age_typeVal);
				ppcs.setAge_value(age_Val);
				ppcs.setNotification_type(notification_typeVal);
				 personalisedparameterscontentstoreLocalServiceUtil
						.addpersonalisedparameterscontentstore(ppcs);


			} else if (option.equalsIgnoreCase(allUserString) && age.startsWith(lessThan)) {
				age_typeVal = age;
				age_Val = lessthan_age;
				personalisedparameterscontentstore ppcs = personalisedparameterscontentstoreLocalServiceUtil
						.createpersonalisedparameterscontentstore(CounterLocalServiceUtil.increment());
				ppcs.setContent_id(Long.parseLong(content_idVal));
				ppcs.setBusiness(businessVal);
				ppcs.setGender(genderVal);
				ppcs.setAge_type(age_typeVal);
				ppcs.setAge_value(age_Val);
				ppcs.setNotification_type(notification_typeVal);
				personalisedparameterscontentstoreLocalServiceUtil
						.addpersonalisedparameterscontentstore(ppcs);

			}
			return true;
		} catch (Exception e) {
			logger.error(e.getMessage());
			return false;
		}
	}

	public List<Object[]> getUsers()
	{
		Session session = null;
		try
		{		
			session = openSession();
			String sql=CustomSQLUtil.get("userlist");
			SQLQuery query = session.createSQLQuery(sql);
			QueryPos pos = QueryPos.getInstance(query);
			List<Object[]> list = query.list();
		    Iterator it=list.iterator();
			logger.info("List size....." + list.size());
			return (List<Object[]>) query.list();
		}
		catch(Exception e)
		{
			logger.error(e.getMessage());
		}
		finally {
			closeSession(session);
		}
		return null;
}
	
	
	public List<String> getCompany()
	{
		Session session = null;
		try
		{		
			session = openSession();
			String sql=CustomSQLUtil.get("complist");
			SQLQuery query = session.createSQLQuery(sql);
			QueryPos pos = QueryPos.getInstance(query);
			List<Object[]> list = query.list();
		    Iterator it=list.iterator();
			logger.info("List size....." + list.size());
			return query.list();
		}
		catch(Exception e)
		{
			logger.error(e.getMessage());
		}
		finally {
			closeSession(session);
		}
		return null;
}
	
	
	public List<String> getUnit(String businessId)
	{
		Session session = null;
		try
		{		
			session = openSession();
			String sql=CustomSQLUtil.get("unitlist");
			SQLQuery query = session.createSQLQuery(sql);
			QueryPos pos = QueryPos.getInstance(query);
			pos.add(businessId);
			List<Object[]> list = query.list();
		    Iterator it=list.iterator();
			logger.info("List size....." + list.size());
			return query.list();
		}
		catch(Exception e)
		{
			logger.error(e.getMessage());
		}
		finally {
			closeSession(session);
		}
		return null;
}
	
	public List<String> getFunction(String businessId)
	{
		Session session = null;
		try
		{		
			session = openSession();
			String sql=CustomSQLUtil.get("functionlist");
			SQLQuery query = session.createSQLQuery(sql);
			QueryPos pos = QueryPos.getInstance(query);
			pos.add(businessId);
			List<Object[]> list = query.list();
		    Iterator it=list.iterator();
			logger.info("List size....." + list.size());
			return query.list();
		}
		catch(Exception e)
		{
			logger.error(e.getMessage());
		}
		finally {
			closeSession(session);
		}
		return null;
}
	
	public List<String> getDepart(String businessId)
	{
		Session session = null;
		try
		{		
			session = openSession();
			String sql=CustomSQLUtil.get("departlist");
			SQLQuery query = session.createSQLQuery(sql);
			QueryPos pos = QueryPos.getInstance(query);
			pos.add(businessId);
			List<Object[]> list = query.list();
		    Iterator it=list.iterator();
			logger.info("List size....." + list.size());
			return query.list();
		}
		catch(Exception e)
		{
			logger.error(e.getMessage());
		}
		finally {
			closeSession(session);
		}
		return null;
}
	
	public List<String> getDesignation(String businessId)
	{
		Session session = null;
		try
		{		
			session = openSession();
			String sql=CustomSQLUtil.get("designationlist");
			SQLQuery query = session.createSQLQuery(sql);
			QueryPos pos = QueryPos.getInstance(query);
			pos.add(businessId);
			List<Object[]> list = query.list();
		    Iterator it=list.iterator();
			logger.info("List size....." + list.size());
			return query.list();
		}
		catch(Exception e)
		{
			logger.error(e.getMessage());
		}
		finally {
			closeSession(session);
		}
		return null;
}
	
	public List<String> getProduct(String businessId)
	{
		Session session = null;
		try
		{		
			session = openSession();
			String sql=CustomSQLUtil.get("productlist");
			SQLQuery query = session.createSQLQuery(sql);
			QueryPos pos = QueryPos.getInstance(query);
			pos.add(businessId);
			List<Object[]> list = query.list();
		    Iterator it=list.iterator();
			logger.info("List size....." + list.size());
			return query.list();
		}
		catch(Exception e)
		{
			logger.error(e.getMessage());
		}
		finally {
			closeSession(session);
		}
		return null;
}
	
	public List<String> getZone(String businessId)
	{
		Session session = null;
		try
		{		
			session = openSession();
			String sql=CustomSQLUtil.get("zonelist");
			SQLQuery query = session.createSQLQuery(sql);
			QueryPos pos = QueryPos.getInstance(query);
			pos.add(businessId);
			List<Object[]> list = query.list();
		    Iterator it=list.iterator();
			logger.info("List size....." + list.size());
			return query.list();
		}
		catch(Exception e)
		{
			logger.error(e.getMessage());
		}
		finally {
			closeSession(session);
		}
		return null;
}
	
	public List<String> getBranch(String businessId)
	{
		Session session = null;
		try
		{		
			session = openSession();
			String sql=CustomSQLUtil.get("branchlist");
			SQLQuery query = session.createSQLQuery(sql);
			QueryPos pos = QueryPos.getInstance(query);
			pos.add(businessId);
			List<Object[]> list = query.list();
		    Iterator it=list.iterator();
			logger.info("List size....." + list.size());
			return query.list();
		}
		catch(Exception e)
		{
			logger.error(e.getMessage());
		}
		finally {
			closeSession(session);
		}
		return null;
}
	
	public List<String> getGrade(String businessId)
	{
		Session session = null;
		try
		{		
			session = openSession();
			String sql=CustomSQLUtil.get("gradelist");
			SQLQuery query = session.createSQLQuery(sql);
			QueryPos pos = QueryPos.getInstance(query);
			pos.add(businessId);
			List<Object[]> list = query.list();
		    Iterator it=list.iterator();
			logger.info("List size....." + list.size());
			return query.list();
		}
		catch(Exception e)
		{
			logger.error(e.getMessage());
		}
		finally {
			closeSession(session);
		}
		return null;
}
	
	public List<String> getRegion(String businessId)
	{
		Session session = null;
		try
		{		
			session = openSession();
			String sql=CustomSQLUtil.get("regionlist");
			SQLQuery query = session.createSQLQuery(sql);
			QueryPos pos = QueryPos.getInstance(query);
			pos.add(businessId);
			List<Object[]> list = query.list();
		    Iterator it=list.iterator();
			logger.info("List size....." + list.size());
			return query.list();
		}
		catch(Exception e)
		{
			logger.error(e.getMessage());
		}
		finally {
			closeSession(session);
		}
		return null;
}
	
	public List<String> getLocation(String businessId)
	{
		Session session = null;
		try
		{		
			session = openSession();
			String sql=CustomSQLUtil.get("locationlist");
			SQLQuery query = session.createSQLQuery(sql);
			QueryPos pos = QueryPos.getInstance(query);
			pos.add(businessId);
			List<Object[]> list = query.list();
		    Iterator it=list.iterator();
			logger.info("List size....." + list.size());
			return query.list();
		}
		catch(Exception e)
		{
			logger.error(e.getMessage());
		}
		finally {
			closeSession(session);
		}
		return null;
}
	
	public String getBusinessNames(String businessID){
		Session session = null;
		SQLQuery query =null;
		String businessName="";
		try{
			session = openSession();
			String sql = CustomSQLUtil.get("getbusinessname");
            SQLQuery queryObject = session.createSQLQuery(sql);
            queryObject.setCacheable(false);
            QueryPos qPos = QueryPos.getInstance(queryObject);
            qPos.add(businessID);
            List<Object> list = queryObject.list();
            businessName=list.get(0).toString();
            return businessName;
		}catch (Exception e) {
			logger.error(e.getMessage());
			return null;
		}
		
	}
	
	public boolean insertPersonalisedParameters(String businessId,String[] values,String gender,String age,String option,long uniqueContentId,String lessthan_age,String greaterthan_age,String between_from_to_age,Object[] notificationDetails,long notification_type){
		  String content_idVal=null; 
		  String businessVal=null; 
		  String unitVal=null; 
		  String functionVal=null; 
		  String departmentVal=null; 
		  String designationVal=null; 
		  String productVal=null; 
		  String zoneVal=null; 
		  String branchVal=null; 
		  String gradeVal=null; 
		  String regionVal=null; 
		  String locationVal=null; 
		  String user_idVal=null; 
		  String notify_syscdVal=null; 
		  String notify_Val=null;
		  String notify_descVal=null; 
		  String notify_statusVal=null; 
		  String notify_flagVal=null; 
		  String status_update_dateVal=null; 
		  String genderVal=gender.toUpperCase(); 
		  String age_typeVal=age; 
		  String age_Val=null;
		  long notification_typeVal=notification_type;
		  String content_type=null;
		  String notify_notificationtext=null;
		  String page_urlVal=null;
		  
		  if(notificationDetails!=null){
			  content_type=notificationDetails[0].toString();
			  notify_notificationtext=notificationDetails[1].toString();
			  notify_syscdVal=notificationDetails[2].toString();
			  notify_Val=notificationDetails[3].toString();
			  notify_descVal=notificationDetails[4].toString();
			  notify_statusVal=notificationDetails[5].toString();
			  notify_flagVal=notificationDetails[6].toString();
			  page_urlVal=notificationDetails[7].toString();
		  }
		  
		  
		boolean flag = false;
        Session session = null;
        try {
            session = openSession();
            
            businessVal=getBusinessNames(businessId);
            
            
            logger.info("Business Name after Query :  "+businessVal);
            
            if(gender.equalsIgnoreCase(both))
			{
            	genderVal=null;
			}

            if(option.equalsIgnoreCase(unit) && age.equalsIgnoreCase(all))
			{
		
			  age_typeVal=age; 
			  age_Val=null;
			  
			  
	            for(int i=0;i<values.length;i++){
	            	String sql = CustomSQLUtil.get("insertpersonalisedparameters");
	                SQLQuery queryObject = session.createSQLQuery(sql);
	                queryObject.setCacheable(false);
	                QueryPos qPos = QueryPos.getInstance(queryObject);
	                qPos.add(uniqueContentId);
	                qPos.add(businessVal);
	                qPos.add(values[i]);
	                qPos.add(functionVal);
	                qPos.add(departmentVal);
	                qPos.add(designationVal);
	                qPos.add(productVal);
	                qPos.add(zoneVal);
	                qPos.add(branchVal);
	                qPos.add(gradeVal);
	                qPos.add(regionVal);
	                qPos.add(locationVal);
	                qPos.add(user_idVal);
	                qPos.add(notify_syscdVal);
	                qPos.add(notify_Val);
	                qPos.add(notify_descVal);
	                qPos.add(notify_statusVal);
	                qPos.add(notify_flagVal);
	                qPos.add(status_update_dateVal);
	                qPos.add(genderVal);
	                qPos.add(age_typeVal);
	                qPos.add(age_Val);
	                qPos.add(notification_typeVal);
	                qPos.add(content_type);
	                qPos.add(notify_notificationtext);
	                qPos.add(page_urlVal);
	                int res = queryObject.executeUpdate();
	               
	                if (res != 0) {
	                    flag = true;
	                }
	            }
			}
			else if(option.equalsIgnoreCase(unit) && age.startsWith(between)){
				  age_typeVal=age; 
				  age_Val=between_from_to_age;
				  
		            for(int i=0;i<values.length;i++){
		            	String sql = CustomSQLUtil.get("insertpersonalisedparameters");
		                SQLQuery queryObject = session.createSQLQuery(sql);
		                queryObject.setCacheable(false);
		                QueryPos qPos = QueryPos.getInstance(queryObject);
		                qPos.add(uniqueContentId);
		                qPos.add(businessVal);
		                qPos.add(values[i]);
		                qPos.add(functionVal);
		                qPos.add(departmentVal);
		                qPos.add(designationVal);
		                qPos.add(productVal);
		                qPos.add(zoneVal);
		                qPos.add(branchVal);
		                qPos.add(gradeVal);
		                qPos.add(regionVal);
		                qPos.add(locationVal);
		                qPos.add(user_idVal);
		                qPos.add(notify_syscdVal);
		                qPos.add(notify_Val);
		                qPos.add(notify_descVal);
		                qPos.add(notify_statusVal);
		                qPos.add(notify_flagVal);
		                qPos.add(status_update_dateVal);
		                qPos.add(genderVal);
		                qPos.add(age_typeVal);
		                qPos.add(age_Val);
		                qPos.add(notification_typeVal);
		                qPos.add(content_type);
		                qPos.add(notify_notificationtext);
		                qPos.add(page_urlVal);
		                int res = queryObject.executeUpdate();
		               
		                if (res != 0) {
		                    flag = true;
		                }
			}
			}
			else if(option.equalsIgnoreCase(unit) && age.startsWith(greaterThan)){
				  age_typeVal=age; 
				  age_Val=greaterthan_age;
				
				  
		            for(int i=0;i<values.length;i++){
		            	String sql = CustomSQLUtil.get("insertpersonalisedparameters");
		                SQLQuery queryObject = session.createSQLQuery(sql);
		                queryObject.setCacheable(false);
		                QueryPos qPos = QueryPos.getInstance(queryObject);
		                qPos.add(uniqueContentId);
		                qPos.add(businessVal);
		                qPos.add(values[i]);
		                qPos.add(functionVal);
		                qPos.add(departmentVal);
		                qPos.add(designationVal);
		                qPos.add(productVal);
		                qPos.add(zoneVal);
		                qPos.add(branchVal);
		                qPos.add(gradeVal);
		                qPos.add(regionVal);
		                qPos.add(locationVal);
		                qPos.add(user_idVal);
		                qPos.add(notify_syscdVal);
		                qPos.add(notify_Val);
		                qPos.add(notify_descVal);
		                qPos.add(notify_statusVal);
		                qPos.add(notify_flagVal);
		                qPos.add(status_update_dateVal);
		                qPos.add(genderVal);
		                qPos.add(age_typeVal);
		                qPos.add(age_Val);
		                qPos.add(notification_typeVal);
		                qPos.add(content_type);
		                qPos.add(notify_notificationtext);
		                qPos.add(page_urlVal);
		                int res = queryObject.executeUpdate();
		               
		                if (res != 0) {
		                    flag = true;
		                }
			}
			}
			
			else if(option.equalsIgnoreCase(unit) && age.startsWith(lessThan))
			{
				 
				 age_typeVal=age; 
				 age_Val=lessthan_age;
				 
				  
		            for(int i=0;i<values.length;i++){
		            	String sql = CustomSQLUtil.get("insertpersonalisedparameters");
		                SQLQuery queryObject = session.createSQLQuery(sql);
		                queryObject.setCacheable(false);
		                QueryPos qPos = QueryPos.getInstance(queryObject);
		                qPos.add(uniqueContentId);
		                qPos.add(businessVal);
		                qPos.add(values[i]);
		                qPos.add(functionVal);
		                qPos.add(departmentVal);
		                qPos.add(designationVal);
		                qPos.add(productVal);
		                qPos.add(zoneVal);
		                qPos.add(branchVal);
		                qPos.add(gradeVal);
		                qPos.add(regionVal);
		                qPos.add(locationVal);
		                qPos.add(user_idVal);
		                qPos.add(notify_syscdVal);
		                qPos.add(notify_Val);
		                qPos.add(notify_descVal);
		                qPos.add(notify_statusVal);
		                qPos.add(notify_flagVal);
		                qPos.add(status_update_dateVal);
		                qPos.add(genderVal);
		                qPos.add(age_typeVal);
		                qPos.add(age_Val);
		                qPos.add(notification_typeVal);
		                qPos.add(content_type);
		                qPos.add(notify_notificationtext);
		                qPos.add(page_urlVal);
		                int res = queryObject.executeUpdate();
		               
		                if (res != 0) {
		                    flag = true;
		                }
			}
			}
            
            //Intended Logic For Department
            
            else if(option.equalsIgnoreCase(department) && age.equalsIgnoreCase(all))
			{
		
			  age_typeVal=age; 
			  age_Val=null;
			  
			  
	            for(int i=0;i<values.length;i++){
	            	String sql = CustomSQLUtil.get("insertpersonalisedparameters");
	                SQLQuery queryObject = session.createSQLQuery(sql);
	                queryObject.setCacheable(false);
	                QueryPos qPos = QueryPos.getInstance(queryObject);
	                qPos.add(uniqueContentId);
	                qPos.add(businessVal);
	                qPos.add(unitVal);
	                qPos.add(functionVal);
	                qPos.add(values[i]);
	                qPos.add(designationVal);
	                qPos.add(productVal);
	                qPos.add(zoneVal);
	                qPos.add(branchVal);
	                qPos.add(gradeVal);
	                qPos.add(regionVal);
	                qPos.add(locationVal);
	                qPos.add(user_idVal);
	                qPos.add(notify_syscdVal);
	                qPos.add(notify_Val);
	                qPos.add(notify_descVal);
	                qPos.add(notify_statusVal);
	                qPos.add(notify_flagVal);
	                qPos.add(status_update_dateVal);
	                qPos.add(genderVal);
	                qPos.add(age_typeVal);
	                qPos.add(age_Val);
	                qPos.add(notification_typeVal);
	                qPos.add(content_type);
	                qPos.add(notify_notificationtext);
	                qPos.add(page_urlVal);
	                int res = queryObject.executeUpdate();
	               
	                if (res != 0) {
	                    flag = true;
	                }
	            }
			}
			else if(option.equalsIgnoreCase(department) && age.startsWith(between)){
				  age_typeVal=age; 
				  age_Val=between_from_to_age;
				  
		            for(int i=0;i<values.length;i++){
		            	String sql = CustomSQLUtil.get("insertpersonalisedparameters");
		                SQLQuery queryObject = session.createSQLQuery(sql);
		                queryObject.setCacheable(false);
		                QueryPos qPos = QueryPos.getInstance(queryObject);
		                qPos.add(uniqueContentId);
		                qPos.add(businessVal);
		                qPos.add(unitVal);
		                qPos.add(functionVal);
		                qPos.add(values[i]);
		                qPos.add(designationVal);
		                qPos.add(productVal);
		                qPos.add(zoneVal);
		                qPos.add(branchVal);
		                qPos.add(gradeVal);
		                qPos.add(regionVal);
		                qPos.add(locationVal);
		                qPos.add(user_idVal);
		                qPos.add(notify_syscdVal);
		                qPos.add(notify_Val);
		                qPos.add(notify_descVal);
		                qPos.add(notify_statusVal);
		                qPos.add(notify_flagVal);
		                qPos.add(status_update_dateVal);
		                qPos.add(genderVal);
		                qPos.add(age_typeVal);
		                qPos.add(age_Val);
		                qPos.add(notification_typeVal);
		                qPos.add(content_type);
		                qPos.add(notify_notificationtext);
		                qPos.add(page_urlVal);
		                int res = queryObject.executeUpdate();
		               
		                if (res != 0) {
		                    flag = true;
		                }
			}
			}
			else if(option.equalsIgnoreCase(department) && age.startsWith(greaterThan)){
				  age_typeVal=age; 
				  age_Val=greaterthan_age;
				
				  
		            for(int i=0;i<values.length;i++){
		            	String sql = CustomSQLUtil.get("insertpersonalisedparameters");
		                SQLQuery queryObject = session.createSQLQuery(sql);
		                queryObject.setCacheable(false);
		                QueryPos qPos = QueryPos.getInstance(queryObject);
		                qPos.add(uniqueContentId);
		                qPos.add(businessVal);
		                qPos.add(unitVal);
		                qPos.add(functionVal);
		                qPos.add(values[i]);
		                qPos.add(designationVal);
		                qPos.add(productVal);
		                qPos.add(zoneVal);
		                qPos.add(branchVal);
		                qPos.add(gradeVal);
		                qPos.add(regionVal);
		                qPos.add(locationVal);
		                qPos.add(user_idVal);
		                qPos.add(notify_syscdVal);
		                qPos.add(notify_Val);
		                qPos.add(notify_descVal);
		                qPos.add(notify_statusVal);
		                qPos.add(notify_flagVal);
		                qPos.add(status_update_dateVal);
		                qPos.add(genderVal);
		                qPos.add(age_typeVal);
		                qPos.add(age_Val);
		                qPos.add(notification_typeVal);
		                qPos.add(content_type);
		                qPos.add(notify_notificationtext);
		                qPos.add(page_urlVal);
		                int res = queryObject.executeUpdate();
		               
		                if (res != 0) {
		                    flag = true;
		                }
			}
			}
			
			else if(option.equalsIgnoreCase(department) && age.startsWith(lessThan))
			{
				 
				 age_typeVal=age; 
				 age_Val=lessthan_age;
				 
				  
		            for(int i=0;i<values.length;i++){
		            	String sql = CustomSQLUtil.get("insertpersonalisedparameters");
		                SQLQuery queryObject = session.createSQLQuery(sql);
		                queryObject.setCacheable(false);
		                QueryPos qPos = QueryPos.getInstance(queryObject);
		                qPos.add(uniqueContentId);
		                qPos.add(businessVal);
		                qPos.add(unitVal);
		                qPos.add(functionVal);
		                qPos.add(values[i]);
		                qPos.add(designationVal);
		                qPos.add(productVal);
		                qPos.add(zoneVal);
		                qPos.add(branchVal);
		                qPos.add(gradeVal);
		                qPos.add(regionVal);
		                qPos.add(locationVal);
		                qPos.add(user_idVal);
		                qPos.add(notify_syscdVal);
		                qPos.add(notify_Val);
		                qPos.add(notify_descVal);
		                qPos.add(notify_statusVal);
		                qPos.add(notify_flagVal);
		                qPos.add(status_update_dateVal);
		                qPos.add(genderVal);
		                qPos.add(age_typeVal);
		                qPos.add(age_Val);
		                qPos.add(notification_typeVal);
		                qPos.add(content_type);
		                qPos.add(notify_notificationtext);
		                qPos.add(page_urlVal);
		                int res = queryObject.executeUpdate();
		               
		                if (res != 0) {
		                    flag = true;
		                }
			}
			}
            
            //Intended Logic for Function
            
			  else if(option.equalsIgnoreCase(function) && age.equalsIgnoreCase(all))
				{
			
				  age_typeVal=age; 
				  age_Val=null;
				  
				  
		            for(int i=0;i<values.length;i++){
		            	String sql = CustomSQLUtil.get("insertpersonalisedparameters");
		                SQLQuery queryObject = session.createSQLQuery(sql);
		                queryObject.setCacheable(false);
		                QueryPos qPos = QueryPos.getInstance(queryObject);
		                qPos.add(uniqueContentId);
		                qPos.add(businessVal);
		                qPos.add(unitVal);
		                qPos.add(values[i]);
		                qPos.add(departmentVal);
		                qPos.add(designationVal);
		                qPos.add(productVal);
		                qPos.add(zoneVal);
		                qPos.add(branchVal);
		                qPos.add(gradeVal);
		                qPos.add(regionVal);
		                qPos.add(locationVal);
		                qPos.add(user_idVal);
		                qPos.add(notify_syscdVal);
		                qPos.add(notify_Val);
		                qPos.add(notify_descVal);
		                qPos.add(notify_statusVal);
		                qPos.add(notify_flagVal);
		                qPos.add(status_update_dateVal);
		                qPos.add(genderVal);
		                qPos.add(age_typeVal);
		                qPos.add(age_Val);
		                qPos.add(notification_typeVal);
		                qPos.add(content_type);
		                qPos.add(notify_notificationtext);
		                qPos.add(page_urlVal);
		                int res = queryObject.executeUpdate();
		               
		                if (res != 0) {
		                    flag = true;
		                }
		            }
				}
				else if(option.equalsIgnoreCase(function) && age.startsWith(between)){
					  age_typeVal=age; 
					  age_Val=between_from_to_age;
					  
			            for(int i=0;i<values.length;i++){
			            	String sql = CustomSQLUtil.get("insertpersonalisedparameters");
			                SQLQuery queryObject = session.createSQLQuery(sql);
			                queryObject.setCacheable(false);
			                QueryPos qPos = QueryPos.getInstance(queryObject);
			                qPos.add(uniqueContentId);
			                qPos.add(businessVal);
			                qPos.add(unitVal);
			                qPos.add(values[i]);
			                qPos.add(departmentVal);
			                qPos.add(designationVal);
			                qPos.add(productVal);
			                qPos.add(zoneVal);
			                qPos.add(branchVal);
			                qPos.add(gradeVal);
			                qPos.add(regionVal);
			                qPos.add(locationVal);
			                qPos.add(user_idVal);
			                qPos.add(notify_syscdVal);
			                qPos.add(notify_Val);
			                qPos.add(notify_descVal);
			                qPos.add(notify_statusVal);
			                qPos.add(notify_flagVal);
			                qPos.add(status_update_dateVal);
			                qPos.add(genderVal);
			                qPos.add(age_typeVal);
			                qPos.add(age_Val);
			                qPos.add(notification_typeVal);
			                qPos.add(content_type);
			                qPos.add(notify_notificationtext);
			                qPos.add(page_urlVal);
			                int res = queryObject.executeUpdate();
			               
			                if (res != 0) {
			                    flag = true;
			                }
				}
				}
				else if(option.equalsIgnoreCase(function) && age.startsWith(greaterThan)){
					  age_typeVal=age; 
					  age_Val=greaterthan_age;
					
					  
			            for(int i=0;i<values.length;i++){
			            	String sql = CustomSQLUtil.get("insertpersonalisedparameters");
			                SQLQuery queryObject = session.createSQLQuery(sql);
			                queryObject.setCacheable(false);
			                QueryPos qPos = QueryPos.getInstance(queryObject);
			                qPos.add(uniqueContentId);
			                qPos.add(businessVal);
			                qPos.add(unitVal);
			                qPos.add(values[i]);
			                qPos.add(departmentVal);
			                qPos.add(designationVal);
			                qPos.add(productVal);
			                qPos.add(zoneVal);
			                qPos.add(branchVal);
			                qPos.add(gradeVal);
			                qPos.add(regionVal);
			                qPos.add(locationVal);
			                qPos.add(user_idVal);
			                qPos.add(notify_syscdVal);
			                qPos.add(notify_Val);
			                qPos.add(notify_descVal);
			                qPos.add(notify_statusVal);
			                qPos.add(notify_flagVal);
			                qPos.add(status_update_dateVal);
			                qPos.add(genderVal);
			                qPos.add(age_typeVal);
			                qPos.add(age_Val);
			                qPos.add(notification_typeVal);
			                qPos.add(content_type);
			                qPos.add(notify_notificationtext);
			                qPos.add(page_urlVal);
			                int res = queryObject.executeUpdate();
			               
			                if (res != 0) {
			                    flag = true;
			                }
				}
				}
				
				else if(option.equalsIgnoreCase(function) && age.startsWith(lessThan))
				{
					 
					 age_typeVal=age; 
					 age_Val=lessthan_age;
					 
					  
			            for(int i=0;i<values.length;i++){
			            	String sql = CustomSQLUtil.get("insertpersonalisedparameters");
			                SQLQuery queryObject = session.createSQLQuery(sql);
			                queryObject.setCacheable(false);
			                QueryPos qPos = QueryPos.getInstance(queryObject);
			                qPos.add(uniqueContentId);
			                qPos.add(businessVal);
			                qPos.add(unitVal);
			                qPos.add(values[i]);
			                qPos.add(departmentVal);
			                qPos.add(designationVal);
			                qPos.add(productVal);
			                qPos.add(zoneVal);
			                qPos.add(branchVal);
			                qPos.add(gradeVal);
			                qPos.add(regionVal);
			                qPos.add(locationVal);
			                qPos.add(user_idVal);
			                qPos.add(notify_syscdVal);
			                qPos.add(notify_Val);
			                qPos.add(notify_descVal);
			                qPos.add(notify_statusVal);
			                qPos.add(notify_flagVal);
			                qPos.add(status_update_dateVal);
			                qPos.add(genderVal);
			                qPos.add(age_typeVal);
			                qPos.add(age_Val);
			                qPos.add(notification_typeVal);
			                qPos.add(content_type);
			                qPos.add(notify_notificationtext);
			                qPos.add(page_urlVal);
			                int res = queryObject.executeUpdate();
			               
			                if (res != 0) {
			                    flag = true;
			                }
				}
				}
            
            //Intended Logic for Designation
            
				 else if(option.equalsIgnoreCase(designation) && age.equalsIgnoreCase(all))
					{
				
					  age_typeVal=age; 
					  age_Val=null;
					  
					  
			            for(int i=0;i<values.length;i++){
			            	String sql = CustomSQLUtil.get("insertpersonalisedparameters");
			                SQLQuery queryObject = session.createSQLQuery(sql);
			                queryObject.setCacheable(false);
			                QueryPos qPos = QueryPos.getInstance(queryObject);
			                qPos.add(uniqueContentId);
			                qPos.add(businessVal);
			                qPos.add(unitVal);
			                qPos.add(functionVal);
			                qPos.add(departmentVal);
			                qPos.add(values[i]);
			                qPos.add(productVal);
			                qPos.add(zoneVal);
			                qPos.add(branchVal);
			                qPos.add(gradeVal);
			                qPos.add(regionVal);
			                qPos.add(locationVal);
			                qPos.add(user_idVal);
			                qPos.add(notify_syscdVal);
			                qPos.add(notify_Val);
			                qPos.add(notify_descVal);
			                qPos.add(notify_statusVal);
			                qPos.add(notify_flagVal);
			                qPos.add(status_update_dateVal);
			                qPos.add(genderVal);
			                qPos.add(age_typeVal);
			                qPos.add(age_Val);
			                qPos.add(notification_typeVal);
			                qPos.add(content_type);
			                qPos.add(notify_notificationtext);
			                qPos.add(page_urlVal);
			                int res = queryObject.executeUpdate();
			               
			                if (res != 0) {
			                    flag = true;
			                }
			            }
					}
					else if(option.equalsIgnoreCase(designation) && age.startsWith(between)){
						  age_typeVal=age; 
						  age_Val=between_from_to_age;
						  
				            for(int i=0;i<values.length;i++){
				            	String sql = CustomSQLUtil.get("insertpersonalisedparameters");
				                SQLQuery queryObject = session.createSQLQuery(sql);
				                queryObject.setCacheable(false);
				                QueryPos qPos = QueryPos.getInstance(queryObject);
				                qPos.add(uniqueContentId);
				                qPos.add(businessVal);
				                qPos.add(unitVal);
				                qPos.add(functionVal);
				                qPos.add(departmentVal);
				                qPos.add(values[i]);
				                qPos.add(productVal);
				                qPos.add(zoneVal);
				                qPos.add(branchVal);
				                qPos.add(gradeVal);
				                qPos.add(regionVal);
				                qPos.add(locationVal);
				                qPos.add(user_idVal);
				                qPos.add(notify_syscdVal);
				                qPos.add(notify_Val);
				                qPos.add(notify_descVal);
				                qPos.add(notify_statusVal);
				                qPos.add(notify_flagVal);
				                qPos.add(status_update_dateVal);
				                qPos.add(genderVal);
				                qPos.add(age_typeVal);
				                qPos.add(age_Val);
				                qPos.add(notification_typeVal);
				                qPos.add(content_type);
				                qPos.add(notify_notificationtext);
				                qPos.add(page_urlVal);
				                int res = queryObject.executeUpdate();
				               
				                if (res != 0) {
				                    flag = true;
				                }
					}
					}
					else if(option.equalsIgnoreCase(designation) && age.startsWith(greaterThan)){
						  age_typeVal=age; 
						  age_Val=greaterthan_age;
						
						  
				            for(int i=0;i<values.length;i++){
				            	String sql = CustomSQLUtil.get("insertpersonalisedparameters");
				                SQLQuery queryObject = session.createSQLQuery(sql);
				                queryObject.setCacheable(false);
				                QueryPos qPos = QueryPos.getInstance(queryObject);
				                qPos.add(uniqueContentId);
				                qPos.add(businessVal);
				                qPos.add(unitVal);
				                qPos.add(functionVal);
				                qPos.add(departmentVal);
				                qPos.add(values[i]);
				                qPos.add(productVal);
				                qPos.add(zoneVal);
				                qPos.add(branchVal);
				                qPos.add(gradeVal);
				                qPos.add(regionVal);
				                qPos.add(locationVal);
				                qPos.add(user_idVal);
				                qPos.add(notify_syscdVal);
				                qPos.add(notify_Val);
				                qPos.add(notify_descVal);
				                qPos.add(notify_statusVal);
				                qPos.add(notify_flagVal);
				                qPos.add(status_update_dateVal);
				                qPos.add(genderVal);
				                qPos.add(age_typeVal);
				                qPos.add(age_Val);
				                qPos.add(notification_typeVal);
				                qPos.add(content_type);
				                qPos.add(notify_notificationtext);
				                qPos.add(page_urlVal);
				                int res = queryObject.executeUpdate();
				               
				                if (res != 0) {
				                    flag = true;
				                }
					}
					}
					
					else if(option.equalsIgnoreCase(designation) && age.startsWith(lessThan))
					{
						 
						 age_typeVal=age; 
						 age_Val=lessthan_age;
						 
						  
				            for(int i=0;i<values.length;i++){
				            	String sql = CustomSQLUtil.get("insertpersonalisedparameters");
				                SQLQuery queryObject = session.createSQLQuery(sql);
				                queryObject.setCacheable(false);
				                QueryPos qPos = QueryPos.getInstance(queryObject);
				                qPos.add(uniqueContentId);
				                qPos.add(businessVal);
				                qPos.add(unitVal);
				                qPos.add(functionVal);
				                qPos.add(departmentVal);
				                qPos.add(values[i]);
				                qPos.add(productVal);
				                qPos.add(zoneVal);
				                qPos.add(branchVal);
				                qPos.add(gradeVal);
				                qPos.add(regionVal);
				                qPos.add(locationVal);
				                qPos.add(user_idVal);
				                qPos.add(notify_syscdVal);
				                qPos.add(notify_Val);
				                qPos.add(notify_descVal);
				                qPos.add(notify_statusVal);
				                qPos.add(notify_flagVal);
				                qPos.add(status_update_dateVal);
				                qPos.add(genderVal);
				                qPos.add(age_typeVal);
				                qPos.add(age_Val);
				                qPos.add(notification_typeVal);
				                qPos.add(content_type);
				                qPos.add(notify_notificationtext);
				                qPos.add(page_urlVal);
				                int res = queryObject.executeUpdate();
				               
				                if (res != 0) {
				                    flag = true;
				                }
					}
					}
            
            
            //Intended Logic For Product
            
					 else if(option.equalsIgnoreCase(product) && age.equalsIgnoreCase(all))
						{
					
						  age_typeVal=age; 
						  age_Val=null;
						  
						  
				            for(int i=0;i<values.length;i++){
				            	String sql = CustomSQLUtil.get("insertpersonalisedparameters");
				                SQLQuery queryObject = session.createSQLQuery(sql);
				                queryObject.setCacheable(false);
				                QueryPos qPos = QueryPos.getInstance(queryObject);
				                qPos.add(uniqueContentId);
				                qPos.add(businessVal);
				                qPos.add(unitVal);
				                qPos.add(functionVal);
				                qPos.add(departmentVal);
				                qPos.add(designationVal);
				                qPos.add(values[i]);
				                qPos.add(zoneVal);
				                qPos.add(branchVal);
				                qPos.add(gradeVal);
				                qPos.add(regionVal);
				                qPos.add(locationVal);
				                qPos.add(user_idVal);
				                qPos.add(notify_syscdVal);
				                qPos.add(notify_Val);
				                qPos.add(notify_descVal);
				                qPos.add(notify_statusVal);
				                qPos.add(notify_flagVal);
				                qPos.add(status_update_dateVal);
				                qPos.add(genderVal);
				                qPos.add(age_typeVal);
				                qPos.add(age_Val);
				                qPos.add(notification_typeVal);
				                qPos.add(content_type);
				                qPos.add(notify_notificationtext);
				                qPos.add(page_urlVal);
				                int res = queryObject.executeUpdate();
				               
				                if (res != 0) {
				                    flag = true;
				                }
				            }
						}
						else if(option.equalsIgnoreCase(product) && age.startsWith(between)){
							  age_typeVal=age; 
							  age_Val=between_from_to_age;
							  
					            for(int i=0;i<values.length;i++){
					            	String sql = CustomSQLUtil.get("insertpersonalisedparameters");
					                SQLQuery queryObject = session.createSQLQuery(sql);
					                queryObject.setCacheable(false);
					                QueryPos qPos = QueryPos.getInstance(queryObject);
					                qPos.add(uniqueContentId);
					                qPos.add(businessVal);
					                qPos.add(unitVal);
					                qPos.add(functionVal);
					                qPos.add(departmentVal);
					                qPos.add(designationVal);
					                qPos.add(values[i]);
					                qPos.add(zoneVal);
					                qPos.add(branchVal);
					                qPos.add(gradeVal);
					                qPos.add(regionVal);
					                qPos.add(locationVal);
					                qPos.add(user_idVal);
					                qPos.add(notify_syscdVal);
					                qPos.add(notify_Val);
					                qPos.add(notify_descVal);
					                qPos.add(notify_statusVal);
					                qPos.add(notify_flagVal);
					                qPos.add(status_update_dateVal);
					                qPos.add(genderVal);
					                qPos.add(age_typeVal);
					                qPos.add(age_Val);
					                qPos.add(notification_typeVal);
					                qPos.add(content_type);
					                qPos.add(notify_notificationtext);
					                qPos.add(page_urlVal);
					                int res = queryObject.executeUpdate();
					               
					                if (res != 0) {
					                    flag = true;
					                }
						}
						}
						else if(option.equalsIgnoreCase(product) && age.startsWith(greaterThan)){
							  age_typeVal=age; 
							  age_Val=greaterthan_age;
							
							  
					            for(int i=0;i<values.length;i++){
					            	String sql = CustomSQLUtil.get("insertpersonalisedparameters");
					                SQLQuery queryObject = session.createSQLQuery(sql);
					                queryObject.setCacheable(false);
					                QueryPos qPos = QueryPos.getInstance(queryObject);
					                qPos.add(uniqueContentId);
					                qPos.add(businessVal);
					                qPos.add(unitVal);
					                qPos.add(functionVal);
					                qPos.add(departmentVal);
					                qPos.add(designationVal);
					                qPos.add(values[i]);
					                qPos.add(zoneVal);
					                qPos.add(branchVal);
					                qPos.add(gradeVal);
					                qPos.add(regionVal);
					                qPos.add(locationVal);
					                qPos.add(user_idVal);
					                qPos.add(notify_syscdVal);
					                qPos.add(notify_Val);
					                qPos.add(notify_descVal);
					                qPos.add(notify_statusVal);
					                qPos.add(notify_flagVal);
					                qPos.add(status_update_dateVal);
					                qPos.add(genderVal);
					                qPos.add(age_typeVal);
					                qPos.add(age_Val);
					                qPos.add(notification_typeVal);
					                qPos.add(content_type);
					                qPos.add(notify_notificationtext);
					                qPos.add(page_urlVal);
					                int res = queryObject.executeUpdate();
					               
					                if (res != 0) {
					                    flag = true;
					                }
						}
						}
						
						else if(option.equalsIgnoreCase(product) && age.startsWith(lessThan))
						{
							 
							 age_typeVal=age; 
							 age_Val=lessthan_age;
							 
							  
					            for(int i=0;i<values.length;i++){
					            	String sql = CustomSQLUtil.get("insertpersonalisedparameters");
					                SQLQuery queryObject = session.createSQLQuery(sql);
					                queryObject.setCacheable(false);
					                QueryPos qPos = QueryPos.getInstance(queryObject);
					                qPos.add(uniqueContentId);
					                qPos.add(businessVal);
					                qPos.add(unitVal);
					                qPos.add(functionVal);
					                qPos.add(departmentVal);
					                qPos.add(designationVal);
					                qPos.add(values[i]);
					                qPos.add(zoneVal);
					                qPos.add(branchVal);
					                qPos.add(gradeVal);
					                qPos.add(regionVal);
					                qPos.add(locationVal);
					                qPos.add(user_idVal);
					                qPos.add(notify_syscdVal);
					                qPos.add(notify_Val);
					                qPos.add(notify_descVal);
					                qPos.add(notify_statusVal);
					                qPos.add(notify_flagVal);
					                qPos.add(status_update_dateVal);
					                qPos.add(genderVal);
					                qPos.add(age_typeVal);
					                qPos.add(age_Val);
					                qPos.add(notification_typeVal);
					                qPos.add(content_type);
					                qPos.add(notify_notificationtext);
					                qPos.add(page_urlVal);
					                int res = queryObject.executeUpdate();
					               
					                if (res != 0) {
					                    flag = true;
					                }
						}
						}
            
            
          //Intended Logic For Zone
            
						 else if(option.equalsIgnoreCase(zone) && age.equalsIgnoreCase(all))
							{
						
							  age_typeVal=age; 
							  age_Val=null;
							  
							  
					            for(int i=0;i<values.length;i++){
					            	String sql = CustomSQLUtil.get("insertpersonalisedparameters");
					                SQLQuery queryObject = session.createSQLQuery(sql);
					                queryObject.setCacheable(false);
					                QueryPos qPos = QueryPos.getInstance(queryObject);
					                qPos.add(uniqueContentId);
					                qPos.add(businessVal);
					                qPos.add(unitVal);
					                qPos.add(functionVal);
					                qPos.add(departmentVal);
					                qPos.add(designationVal);
					                qPos.add(productVal);
					                qPos.add(values[i]);
					                qPos.add(branchVal);
					                qPos.add(gradeVal);
					                qPos.add(regionVal);
					                qPos.add(locationVal);
					                qPos.add(user_idVal);
					                qPos.add(notify_syscdVal);
					                qPos.add(notify_Val);
					                qPos.add(notify_descVal);
					                qPos.add(notify_statusVal);
					                qPos.add(notify_flagVal);
					                qPos.add(status_update_dateVal);
					                qPos.add(genderVal);
					                qPos.add(age_typeVal);
					                qPos.add(age_Val);
					                qPos.add(notification_typeVal);
					                qPos.add(content_type);
					                qPos.add(notify_notificationtext);
					                qPos.add(page_urlVal);
					                int res = queryObject.executeUpdate();
					               
					                if (res != 0) {
					                    flag = true;
					                }
					            }
							}
							else if(option.equalsIgnoreCase(zone) && age.startsWith(between)){
								  age_typeVal=age; 
								  age_Val=between_from_to_age;
								  
						            for(int i=0;i<values.length;i++){
						            	String sql = CustomSQLUtil.get("insertpersonalisedparameters");
						                SQLQuery queryObject = session.createSQLQuery(sql);
						                queryObject.setCacheable(false);
						                QueryPos qPos = QueryPos.getInstance(queryObject);
						                qPos.add(uniqueContentId);
						                qPos.add(businessVal);
						                qPos.add(unitVal);
						                qPos.add(functionVal);
						                qPos.add(departmentVal);
						                qPos.add(designationVal);
						                qPos.add(productVal);
						                qPos.add(values[i]);
						                qPos.add(branchVal);
						                qPos.add(gradeVal);
						                qPos.add(regionVal);
						                qPos.add(locationVal);
						                qPos.add(user_idVal);
						                qPos.add(notify_syscdVal);
						                qPos.add(notify_Val);
						                qPos.add(notify_descVal);
						                qPos.add(notify_statusVal);
						                qPos.add(notify_flagVal);
						                qPos.add(status_update_dateVal);
						                qPos.add(genderVal);
						                qPos.add(age_typeVal);
						                qPos.add(age_Val);
						                qPos.add(notification_typeVal);
						                qPos.add(content_type);
						                qPos.add(notify_notificationtext);
						                qPos.add(page_urlVal);
						                int res = queryObject.executeUpdate();
						               
						                if (res != 0) {
						                    flag = true;
						                }
							}
							}
							else if(option.equalsIgnoreCase(zone) && age.startsWith(greaterThan)){
								  age_typeVal=age; 
								  age_Val=greaterthan_age;
								
								  
						            for(int i=0;i<values.length;i++){
						            	String sql = CustomSQLUtil.get("insertpersonalisedparameters");
						                SQLQuery queryObject = session.createSQLQuery(sql);
						                queryObject.setCacheable(false);
						                QueryPos qPos = QueryPos.getInstance(queryObject);
						                qPos.add(uniqueContentId);
						                qPos.add(businessVal);
						                qPos.add(unitVal);
						                qPos.add(functionVal);
						                qPos.add(departmentVal);
						                qPos.add(designationVal);
						                qPos.add(productVal);
						                qPos.add(values[i]);
						                qPos.add(branchVal);
						                qPos.add(gradeVal);
						                qPos.add(regionVal);
						                qPos.add(locationVal);
						                qPos.add(user_idVal);
						                qPos.add(notify_syscdVal);
						                qPos.add(notify_Val);
						                qPos.add(notify_descVal);
						                qPos.add(notify_statusVal);
						                qPos.add(notify_flagVal);
						                qPos.add(status_update_dateVal);
						                qPos.add(genderVal);
						                qPos.add(age_typeVal);
						                qPos.add(age_Val);
						                qPos.add(notification_typeVal);
						                qPos.add(content_type);
						                qPos.add(notify_notificationtext);
						                qPos.add(page_urlVal);
						                int res = queryObject.executeUpdate();
						               
						                if (res != 0) {
						                    flag = true;
						                }
							}
							}
							
							else if(option.equalsIgnoreCase(zone) && age.startsWith(lessThan))
							{
								 
								 age_typeVal=age; 
								 age_Val=lessthan_age;
								 
								  
						            for(int i=0;i<values.length;i++){
						            	String sql = CustomSQLUtil.get("insertpersonalisedparameters");
						                SQLQuery queryObject = session.createSQLQuery(sql);
						                queryObject.setCacheable(false);
						                QueryPos qPos = QueryPos.getInstance(queryObject);
						                qPos.add(uniqueContentId);
						                qPos.add(businessVal);
						                qPos.add(unitVal);
						                qPos.add(functionVal);
						                qPos.add(departmentVal);
						                qPos.add(designationVal);
						                qPos.add(productVal);
						                qPos.add(values[i]);
						                qPos.add(branchVal);
						                qPos.add(gradeVal);
						                qPos.add(regionVal);
						                qPos.add(locationVal);
						                qPos.add(user_idVal);
						                qPos.add(notify_syscdVal);
						                qPos.add(notify_Val);
						                qPos.add(notify_descVal);
						                qPos.add(notify_statusVal);
						                qPos.add(notify_flagVal);
						                qPos.add(status_update_dateVal);
						                qPos.add(genderVal);
						                qPos.add(age_typeVal);
						                qPos.add(age_Val);
						                qPos.add(notification_typeVal);
						                qPos.add(content_type);
						                qPos.add(notify_notificationtext);
						                qPos.add(page_urlVal);
						                int res = queryObject.executeUpdate();
						               
						                if (res != 0) {
						                    flag = true;
						                }
							}
							}
	            
            
          //Intended Logic For Branch
            
							 else if(option.equalsIgnoreCase(branch) && age.equalsIgnoreCase(all))
								{
							
								  age_typeVal=age; 
								  age_Val=null;
								  
								  
						            for(int i=0;i<values.length;i++){
						            	String sql = CustomSQLUtil.get("insertpersonalisedparameters");
						                SQLQuery queryObject = session.createSQLQuery(sql);
						                queryObject.setCacheable(false);
						                QueryPos qPos = QueryPos.getInstance(queryObject);
						                qPos.add(uniqueContentId);
						                qPos.add(businessVal);
						                qPos.add(unitVal);
						                qPos.add(functionVal);
						                qPos.add(departmentVal);
						                qPos.add(designationVal);
						                qPos.add(productVal);
						                qPos.add(zoneVal);
						                qPos.add(values[i]);
						                qPos.add(gradeVal);
						                qPos.add(regionVal);
						                qPos.add(locationVal);
						                qPos.add(user_idVal);
						                qPos.add(notify_syscdVal);
						                qPos.add(notify_Val);
						                qPos.add(notify_descVal);
						                qPos.add(notify_statusVal);
						                qPos.add(notify_flagVal);
						                qPos.add(status_update_dateVal);
						                qPos.add(genderVal);
						                qPos.add(age_typeVal);
						                qPos.add(age_Val);
						                qPos.add(notification_typeVal);
						                qPos.add(content_type);
						                qPos.add(notify_notificationtext);
						                qPos.add(page_urlVal);
						                int res = queryObject.executeUpdate();
						               
						                if (res != 0) {
						                    flag = true;
						                }
						            }
								}
								else if(option.equalsIgnoreCase(branch) && age.startsWith(between)){
									  age_typeVal=age; 
									  age_Val=between_from_to_age;
									  
							            for(int i=0;i<values.length;i++){
							            	String sql = CustomSQLUtil.get("insertpersonalisedparameters");
							                SQLQuery queryObject = session.createSQLQuery(sql);
							                queryObject.setCacheable(false);
							                QueryPos qPos = QueryPos.getInstance(queryObject);
							                qPos.add(uniqueContentId);
							                qPos.add(businessVal);
							                qPos.add(unitVal);
							                qPos.add(functionVal);
							                qPos.add(departmentVal);
							                qPos.add(designationVal);
							                qPos.add(productVal);
							                qPos.add(zoneVal);
							                qPos.add(values[i]);
							                qPos.add(gradeVal);
							                qPos.add(regionVal);
							                qPos.add(locationVal);
							                qPos.add(user_idVal);
							                qPos.add(notify_syscdVal);
							                qPos.add(notify_Val);
							                qPos.add(notify_descVal);
							                qPos.add(notify_statusVal);
							                qPos.add(notify_flagVal);
							                qPos.add(status_update_dateVal);
							                qPos.add(genderVal);
							                qPos.add(age_typeVal);
							                qPos.add(age_Val);
							                qPos.add(notification_typeVal);
							                qPos.add(content_type);
							                qPos.add(notify_notificationtext);
							                qPos.add(page_urlVal);
							                int res = queryObject.executeUpdate();
							               
							                if (res != 0) {
							                    flag = true;
							                }
								}
								}
								else if(option.equalsIgnoreCase(branch) && age.startsWith(greaterThan)){
									  age_typeVal=age; 
									  age_Val=greaterthan_age;
									
									  
							            for(int i=0;i<values.length;i++){
							            	String sql = CustomSQLUtil.get("insertpersonalisedparameters");
							                SQLQuery queryObject = session.createSQLQuery(sql);
							                queryObject.setCacheable(false);
							                QueryPos qPos = QueryPos.getInstance(queryObject);
							                qPos.add(uniqueContentId);
							                qPos.add(businessVal);
							                qPos.add(unitVal);
							                qPos.add(functionVal);
							                qPos.add(departmentVal);
							                qPos.add(designationVal);
							                qPos.add(productVal);
							                qPos.add(zoneVal);
							                qPos.add(values[i]);
							                qPos.add(gradeVal);
							                qPos.add(regionVal);
							                qPos.add(locationVal);
							                qPos.add(user_idVal);
							                qPos.add(notify_syscdVal);
							                qPos.add(notify_Val);
							                qPos.add(notify_descVal);
							                qPos.add(notify_statusVal);
							                qPos.add(notify_flagVal);
							                qPos.add(status_update_dateVal);
							                qPos.add(genderVal);
							                qPos.add(age_typeVal);
							                qPos.add(age_Val);
							                qPos.add(notification_typeVal);
							                qPos.add(content_type);
							                qPos.add(notify_notificationtext);
							                qPos.add(page_urlVal);
							                int res = queryObject.executeUpdate();
							               
							                if (res != 0) {
							                    flag = true;
							                }
								}
								}
								
								else if(option.equalsIgnoreCase(branch) && age.startsWith(lessThan))
								{
									 
									 age_typeVal=age; 
									 age_Val=lessthan_age;
									 
									  
							            for(int i=0;i<values.length;i++){
							            	String sql = CustomSQLUtil.get("insertpersonalisedparameters");
							                SQLQuery queryObject = session.createSQLQuery(sql);
							                queryObject.setCacheable(false);
							                QueryPos qPos = QueryPos.getInstance(queryObject);
							                qPos.add(uniqueContentId);
							                qPos.add(businessVal);
							                qPos.add(unitVal);
							                qPos.add(functionVal);
							                qPos.add(departmentVal);
							                qPos.add(designationVal);
							                qPos.add(productVal);
							                qPos.add(zoneVal);
							                qPos.add(values[i]);
							                qPos.add(gradeVal);
							                qPos.add(regionVal);
							                qPos.add(locationVal);
							                qPos.add(user_idVal);
							                qPos.add(notify_syscdVal);
							                qPos.add(notify_Val);
							                qPos.add(notify_descVal);
							                qPos.add(notify_statusVal);
							                qPos.add(notify_flagVal);
							                qPos.add(status_update_dateVal);
							                qPos.add(genderVal);
							                qPos.add(age_typeVal);
							                qPos.add(age_Val);
							                qPos.add(notification_typeVal);
							                qPos.add(content_type);
							                qPos.add(notify_notificationtext);
							                qPos.add(page_urlVal);
							                int res = queryObject.executeUpdate();
							               
							                if (res != 0) {
							                    flag = true;
							                }
								}
								}
		            
            
            
          //Intended Logic For Grade
            
								 else if(option.equalsIgnoreCase(grade) && age.equalsIgnoreCase(all))
									{
								
									  age_typeVal=age; 
									  age_Val=null;
									  
									  
							            for(int i=0;i<values.length;i++){
							            	String sql = CustomSQLUtil.get("insertpersonalisedparameters");
							                SQLQuery queryObject = session.createSQLQuery(sql);
							                queryObject.setCacheable(false);
							                QueryPos qPos = QueryPos.getInstance(queryObject);
							                qPos.add(uniqueContentId);
							                qPos.add(businessVal);
							                qPos.add(unitVal);
							                qPos.add(functionVal);
							                qPos.add(departmentVal);
							                qPos.add(designationVal);
							                qPos.add(productVal);
							                qPos.add(zoneVal);
							                qPos.add(branchVal);
							                qPos.add(values[i]);
							                qPos.add(regionVal);
							                qPos.add(locationVal);
							                qPos.add(user_idVal);
							                qPos.add(notify_syscdVal);
							                qPos.add(notify_Val);
							                qPos.add(notify_descVal);
							                qPos.add(notify_statusVal);
							                qPos.add(notify_flagVal);
							                qPos.add(status_update_dateVal);
							                qPos.add(genderVal);
							                qPos.add(age_typeVal);
							                qPos.add(age_Val);
							                qPos.add(notification_typeVal);
							                qPos.add(content_type);
							                qPos.add(notify_notificationtext);
							                qPos.add(page_urlVal);
							                int res = queryObject.executeUpdate();
							               
							                if (res != 0) {
							                    flag = true;
							                }
							            }
									}
									else if(option.equalsIgnoreCase(grade) && age.startsWith(between)){
										  age_typeVal=age; 
										  age_Val=between_from_to_age;
										  
								            for(int i=0;i<values.length;i++){
								            	String sql = CustomSQLUtil.get("insertpersonalisedparameters");
								                SQLQuery queryObject = session.createSQLQuery(sql);
								                queryObject.setCacheable(false);
								                QueryPos qPos = QueryPos.getInstance(queryObject);
								                qPos.add(uniqueContentId);
								                qPos.add(businessVal);
								                qPos.add(unitVal);
								                qPos.add(functionVal);
								                qPos.add(departmentVal);
								                qPos.add(designationVal);
								                qPos.add(productVal);
								                qPos.add(zoneVal);
								                qPos.add(branchVal);
								                qPos.add(values[i]);
								                qPos.add(regionVal);
								                qPos.add(locationVal);
								                qPos.add(user_idVal);
								                qPos.add(notify_syscdVal);
								                qPos.add(notify_Val);
								                qPos.add(notify_descVal);
								                qPos.add(notify_statusVal);
								                qPos.add(notify_flagVal);
								                qPos.add(status_update_dateVal);
								                qPos.add(genderVal);
								                qPos.add(age_typeVal);
								                qPos.add(age_Val);
								                qPos.add(notification_typeVal);
								                qPos.add(content_type);
								                qPos.add(notify_notificationtext);
								                qPos.add(page_urlVal);
								                int res = queryObject.executeUpdate();
								               
								                if (res != 0) {
								                    flag = true;
								                }
									}
									}
									else if(option.equalsIgnoreCase(grade) && age.startsWith(greaterThan)){
										  age_typeVal=age; 
										  age_Val=greaterthan_age;
										
										  
								            for(int i=0;i<values.length;i++){
								            	String sql = CustomSQLUtil.get("insertpersonalisedparameters");
								                SQLQuery queryObject = session.createSQLQuery(sql);
								                queryObject.setCacheable(false);
								                QueryPos qPos = QueryPos.getInstance(queryObject);
								                qPos.add(uniqueContentId);
								                qPos.add(businessVal);
								                qPos.add(unitVal);
								                qPos.add(functionVal);
								                qPos.add(departmentVal);
								                qPos.add(designationVal);
								                qPos.add(productVal);
								                qPos.add(zoneVal);
								                qPos.add(branchVal);
								                qPos.add(values[i]);
								                qPos.add(regionVal);
								                qPos.add(locationVal);
								                qPos.add(user_idVal);
								                qPos.add(notify_syscdVal);
								                qPos.add(notify_Val);
								                qPos.add(notify_descVal);
								                qPos.add(notify_statusVal);
								                qPos.add(notify_flagVal);
								                qPos.add(status_update_dateVal);
								                qPos.add(genderVal);
								                qPos.add(age_typeVal);
								                qPos.add(age_Val);
								                qPos.add(notification_typeVal);
								                qPos.add(content_type);
								                qPos.add(notify_notificationtext);
								                qPos.add(page_urlVal);
								                int res = queryObject.executeUpdate();
								               
								                if (res != 0) {
								                    flag = true;
								                }
									}
									}
									
									else if(option.equalsIgnoreCase(grade) && age.startsWith(lessThan))
									{
										 
										 age_typeVal=age; 
										 age_Val=lessthan_age;
										 
										  
								            for(int i=0;i<values.length;i++){
								            	String sql = CustomSQLUtil.get("insertpersonalisedparameters");
								                SQLQuery queryObject = session.createSQLQuery(sql);
								                queryObject.setCacheable(false);
								                QueryPos qPos = QueryPos.getInstance(queryObject);
								                qPos.add(uniqueContentId);
								                qPos.add(businessVal);
								                qPos.add(unitVal);
								                qPos.add(functionVal);
								                qPos.add(departmentVal);
								                qPos.add(designationVal);
								                qPos.add(productVal);
								                qPos.add(zoneVal);
								                qPos.add(branchVal);
								                qPos.add(values[i]);
								                qPos.add(regionVal);
								                qPos.add(locationVal);
								                qPos.add(user_idVal);
								                qPos.add(notify_syscdVal);
								                qPos.add(notify_Val);
								                qPos.add(notify_descVal);
								                qPos.add(notify_statusVal);
								                qPos.add(notify_flagVal);
								                qPos.add(status_update_dateVal);
								                qPos.add(genderVal);
								                qPos.add(age_typeVal);
								                qPos.add(age_Val);
								                qPos.add(notification_typeVal);
								                qPos.add(content_type);
								                qPos.add(notify_notificationtext);
								                qPos.add(page_urlVal);
								                int res = queryObject.executeUpdate();
								               
								                if (res != 0) {
								                    flag = true;
								                }
									}
									}
            
          //Intended Logic For Region
            
									 else if(option.equalsIgnoreCase(region) && age.equalsIgnoreCase(all))
										{
									
										  age_typeVal=age; 
										  age_Val=null;
										  
										  
								            for(int i=0;i<values.length;i++){
								            	String sql = CustomSQLUtil.get("insertpersonalisedparameters");
								                SQLQuery queryObject = session.createSQLQuery(sql);
								                queryObject.setCacheable(false);
								                QueryPos qPos = QueryPos.getInstance(queryObject);
								                qPos.add(uniqueContentId);
								                qPos.add(businessVal);
								                qPos.add(unitVal);
								                qPos.add(functionVal);
								                qPos.add(departmentVal);
								                qPos.add(designationVal);
								                qPos.add(productVal);
								                qPos.add(zoneVal);
								                qPos.add(branchVal);
								                qPos.add(gradeVal);
								                qPos.add(values[i]);
								                qPos.add(locationVal);
								                qPos.add(user_idVal);
								                qPos.add(notify_syscdVal);
								                qPos.add(notify_Val);
								                qPos.add(notify_descVal);
								                qPos.add(notify_statusVal);
								                qPos.add(notify_flagVal);
								                qPos.add(status_update_dateVal);
								                qPos.add(genderVal);
								                qPos.add(age_typeVal);
								                qPos.add(age_Val);
								                qPos.add(notification_typeVal);
								                qPos.add(content_type);
								                qPos.add(notify_notificationtext);
								                qPos.add(page_urlVal);
								                int res = queryObject.executeUpdate();
								               
								                if (res != 0) {
								                    flag = true;
								                }
								            }
										}
										else if(option.equalsIgnoreCase(region) && age.startsWith(between)){
											  age_typeVal=age; 
											  age_Val=between_from_to_age;
											  
									            for(int i=0;i<values.length;i++){
									            	String sql = CustomSQLUtil.get("insertpersonalisedparameters");
									                SQLQuery queryObject = session.createSQLQuery(sql);
									                queryObject.setCacheable(false);
									                QueryPos qPos = QueryPos.getInstance(queryObject);
									                qPos.add(uniqueContentId);
									                qPos.add(businessVal);
									                qPos.add(unitVal);
									                qPos.add(functionVal);
									                qPos.add(departmentVal);
									                qPos.add(designationVal);
									                qPos.add(productVal);
									                qPos.add(zoneVal);
									                qPos.add(branchVal);
									                qPos.add(gradeVal);
									                qPos.add(values[i]);
									                qPos.add(locationVal);
									                qPos.add(user_idVal);
									                qPos.add(notify_syscdVal);
									                qPos.add(notify_Val);
									                qPos.add(notify_descVal);
									                qPos.add(notify_statusVal);
									                qPos.add(notify_flagVal);
									                qPos.add(status_update_dateVal);
									                qPos.add(genderVal);
									                qPos.add(age_typeVal);
									                qPos.add(age_Val);
									                qPos.add(notification_typeVal);
									                qPos.add(content_type);
									                qPos.add(notify_notificationtext);
									                qPos.add(page_urlVal);
									                int res = queryObject.executeUpdate();
									               
									                if (res != 0) {
									                    flag = true;
									                }
										}
										}
										else if(option.equalsIgnoreCase(region) && age.startsWith(greaterThan)){
											  age_typeVal=age; 
											  age_Val=greaterthan_age;
											
											  
									            for(int i=0;i<values.length;i++){
									            	String sql = CustomSQLUtil.get("insertpersonalisedparameters");
									                SQLQuery queryObject = session.createSQLQuery(sql);
									                queryObject.setCacheable(false);
									                QueryPos qPos = QueryPos.getInstance(queryObject);
									                qPos.add(uniqueContentId);
									                qPos.add(businessVal);
									                qPos.add(unitVal);
									                qPos.add(functionVal);
									                qPos.add(departmentVal);
									                qPos.add(designationVal);
									                qPos.add(productVal);
									                qPos.add(zoneVal);
									                qPos.add(branchVal);
									                qPos.add(gradeVal);
									                qPos.add(values[i]);
									                qPos.add(locationVal);
									                qPos.add(user_idVal);
									                qPos.add(notify_syscdVal);
									                qPos.add(notify_Val);
									                qPos.add(notify_descVal);
									                qPos.add(notify_statusVal);
									                qPos.add(notify_flagVal);
									                qPos.add(status_update_dateVal);
									                qPos.add(genderVal);
									                qPos.add(age_typeVal);
									                qPos.add(age_Val);
									                qPos.add(notification_typeVal);
									                qPos.add(content_type);
									                qPos.add(notify_notificationtext);
									                qPos.add(page_urlVal);
									                int res = queryObject.executeUpdate();
									               
									                if (res != 0) {
									                    flag = true;
									                }
										}
										}
										
										else if(option.equalsIgnoreCase(region) && age.startsWith(lessThan))
										{
											 
											 age_typeVal=age; 
											 age_Val=lessthan_age;
											 
											  
									            for(int i=0;i<values.length;i++){
									            	String sql = CustomSQLUtil.get("insertpersonalisedparameters");
									                SQLQuery queryObject = session.createSQLQuery(sql);
									                queryObject.setCacheable(false);
									                QueryPos qPos = QueryPos.getInstance(queryObject);
									                qPos.add(uniqueContentId);
									                qPos.add(businessVal);
									                qPos.add(unitVal);
									                qPos.add(functionVal);
									                qPos.add(departmentVal);
									                qPos.add(designationVal);
									                qPos.add(productVal);
									                qPos.add(zoneVal);
									                qPos.add(branchVal);
									                qPos.add(gradeVal);
									                qPos.add(values[i]);
									                qPos.add(locationVal);
									                qPos.add(user_idVal);
									                qPos.add(notify_syscdVal);
									                qPos.add(notify_Val);
									                qPos.add(notify_descVal);
									                qPos.add(notify_statusVal);
									                qPos.add(notify_flagVal);
									                qPos.add(status_update_dateVal);
									                qPos.add(genderVal);
									                qPos.add(age_typeVal);
									                qPos.add(age_Val);
									                qPos.add(notification_typeVal);
									                qPos.add(content_type);
									                qPos.add(notify_notificationtext);
									                qPos.add(page_urlVal);
									                int res = queryObject.executeUpdate();
									               
									                if (res != 0) {
									                    flag = true;
									                }
										}
										}
	            
            
            //Intended Logic For Location
            
										else if(option.equalsIgnoreCase(location) && age.equalsIgnoreCase(all))
										{
									
										  age_typeVal=age; 
										  age_Val=null;
										  
										  
								            for(int i=0;i<values.length;i++){
								            	String sql = CustomSQLUtil.get("insertpersonalisedparameters");
								                SQLQuery queryObject = session.createSQLQuery(sql);
								                queryObject.setCacheable(false);
								                QueryPos qPos = QueryPos.getInstance(queryObject);
								                qPos.add(uniqueContentId);
								                qPos.add(businessVal);
								                qPos.add(unitVal);
								                qPos.add(functionVal);
								                qPos.add(departmentVal);
								                qPos.add(designationVal);
								                qPos.add(productVal);
								                qPos.add(zoneVal);
								                qPos.add(branchVal);
								                qPos.add(gradeVal);
								                qPos.add(regionVal);
								                qPos.add(values[i]);
								                qPos.add(user_idVal);
								                qPos.add(notify_syscdVal);
								                qPos.add(notify_Val);
								                qPos.add(notify_descVal);
								                qPos.add(notify_statusVal);
								                qPos.add(notify_flagVal);
								                qPos.add(status_update_dateVal);
								                qPos.add(genderVal);
								                qPos.add(age_typeVal);
								                qPos.add(age_Val);
								                qPos.add(notification_typeVal);
								                qPos.add(content_type);
								                qPos.add(notify_notificationtext);
								                qPos.add(page_urlVal);
								                int res = queryObject.executeUpdate();
								               
								                if (res != 0) {
								                    flag = true;
								                }
								            }
										}
										else if(option.equalsIgnoreCase(location) && age.startsWith(between)){
											  age_typeVal=age; 
											  age_Val=between_from_to_age;
											  
									            for(int i=0;i<values.length;i++){
									            	String sql = CustomSQLUtil.get("insertpersonalisedparameters");
									                SQLQuery queryObject = session.createSQLQuery(sql);
									                queryObject.setCacheable(false);
									                QueryPos qPos = QueryPos.getInstance(queryObject);
									                qPos.add(uniqueContentId);
									                qPos.add(businessVal);
									                qPos.add(unitVal);
									                qPos.add(functionVal);
									                qPos.add(departmentVal);
									                qPos.add(designationVal);
									                qPos.add(productVal);
									                qPos.add(zoneVal);
									                qPos.add(branchVal);
									                qPos.add(gradeVal);
									                qPos.add(regionVal);
									                qPos.add(values[i]);
									                qPos.add(user_idVal);
									                qPos.add(notify_syscdVal);
									                qPos.add(notify_Val);
									                qPos.add(notify_descVal);
									                qPos.add(notify_statusVal);
									                qPos.add(notify_flagVal);
									                qPos.add(status_update_dateVal);
									                qPos.add(genderVal);
									                qPos.add(age_typeVal);
									                qPos.add(age_Val);
									                qPos.add(notification_typeVal);
									                qPos.add(content_type);
									                qPos.add(notify_notificationtext);
									                qPos.add(page_urlVal);
									                int res = queryObject.executeUpdate();
									               
									                if (res != 0) {
									                    flag = true;
									                }
										}
										}
										else if(option.equalsIgnoreCase(location) && age.startsWith(greaterThan)){
											  age_typeVal=age; 
											  age_Val=greaterthan_age;
											
											  
									            for(int i=0;i<values.length;i++){
									            	String sql = CustomSQLUtil.get("insertpersonalisedparameters");
									                SQLQuery queryObject = session.createSQLQuery(sql);
									                queryObject.setCacheable(false);
									                QueryPos qPos = QueryPos.getInstance(queryObject);
									                qPos.add(uniqueContentId);
									                qPos.add(businessVal);
									                qPos.add(unitVal);
									                qPos.add(functionVal);
									                qPos.add(departmentVal);
									                qPos.add(designationVal);
									                qPos.add(productVal);
									                qPos.add(zoneVal);
									                qPos.add(branchVal);
									                qPos.add(gradeVal);
									                qPos.add(regionVal);
									                qPos.add(values[i]);
									                qPos.add(user_idVal);
									                qPos.add(notify_syscdVal);
									                qPos.add(notify_Val);
									                qPos.add(notify_descVal);
									                qPos.add(notify_statusVal);
									                qPos.add(notify_flagVal);
									                qPos.add(status_update_dateVal);
									                qPos.add(genderVal);
									                qPos.add(age_typeVal);
									                qPos.add(age_Val);
									                qPos.add(notification_typeVal);
									                qPos.add(content_type);
									                qPos.add(notify_notificationtext);
									                qPos.add(page_urlVal);
									                int res = queryObject.executeUpdate();
									               
									                if (res != 0) {
									                    flag = true;
									                }
										}
										}
										
										else if(option.equalsIgnoreCase(location) && age.startsWith(lessThan))
										{
											 
											 age_typeVal=age; 
											 age_Val=lessthan_age;
											 
											  
									            for(int i=0;i<values.length;i++){
									            	String sql = CustomSQLUtil.get("insertpersonalisedparameters");
									                SQLQuery queryObject = session.createSQLQuery(sql);
									                queryObject.setCacheable(false);
									                QueryPos qPos = QueryPos.getInstance(queryObject);
									                qPos.add(uniqueContentId);
									                qPos.add(businessVal);
									                qPos.add(unitVal);
									                qPos.add(functionVal);
									                qPos.add(departmentVal);
									                qPos.add(designationVal);
									                qPos.add(productVal);
									                qPos.add(zoneVal);
									                qPos.add(branchVal);
									                qPos.add(gradeVal);
									                qPos.add(regionVal);
									                qPos.add(values[i]);
									                qPos.add(user_idVal);
									                qPos.add(notify_syscdVal);
									                qPos.add(notify_Val);
									                qPos.add(notify_descVal);
									                qPos.add(notify_statusVal);
									                qPos.add(notify_flagVal);
									                qPos.add(status_update_dateVal);
									                qPos.add(genderVal);
									                qPos.add(age_typeVal);
									                qPos.add(age_Val);
									                qPos.add(notification_typeVal);
									                qPos.add(content_type);
									                qPos.add(notify_notificationtext);
									                qPos.add(page_urlVal);
									                int res = queryObject.executeUpdate();
									               
									                if (res != 0) {
									                    flag = true;
									                }
										}
										}
            
            
            
            //Intended Logic for UserId
            
										else if(option.equalsIgnoreCase(userIdString)){
											
								            for(int i=0;i<values.length;i++){
								            	String sql = CustomSQLUtil.get("insertpersonalisedparameters");
								                SQLQuery queryObject = session.createSQLQuery(sql);
								                queryObject.setCacheable(false);
								                QueryPos qPos = QueryPos.getInstance(queryObject);
								                qPos.add(uniqueContentId);
								                qPos.add(businessVal);
								                qPos.add(unitVal);
								                qPos.add(functionVal);
								                qPos.add(departmentVal);
								                qPos.add(designationVal);
								                qPos.add(productVal);
								                qPos.add(zoneVal);
								                qPos.add(branchVal);
								                qPos.add(gradeVal);
								                qPos.add(regionVal);
								                qPos.add(locationVal);
								                qPos.add(values[i]);
								                qPos.add(notify_syscdVal);
								                qPos.add(notify_Val);
								                qPos.add(notify_descVal);
								                qPos.add(notify_statusVal);
								                qPos.add(notify_flagVal);
								                qPos.add(status_update_dateVal);
								                qPos.add(genderVal);
								                qPos.add(age_typeVal);
								                qPos.add(age_Val);
								                qPos.add(notification_typeVal);
								                qPos.add(content_type);
								                qPos.add(notify_notificationtext);
								                qPos.add(page_urlVal);
								                int res = queryObject.executeUpdate();
								               
								                if (res != 0) {
								                    flag = true;
								                }
									}
										}
            
            //Inteded logic for All User
            
										else if(option.equalsIgnoreCase(allUserString) && age.equalsIgnoreCase(all))
										{
											 age_typeVal=age; 
											 age_Val=null;
											 logger.info(all);
											 String sql = CustomSQLUtil.get("insertpersonalisedparameters");
								                SQLQuery queryObject = session.createSQLQuery(sql);
								                queryObject.setCacheable(false);
								                QueryPos qPos = QueryPos.getInstance(queryObject);
								                qPos.add(uniqueContentId);
								                qPos.add(businessVal);
								                qPos.add(unitVal);
								                qPos.add(functionVal);
								                qPos.add(departmentVal);
								                qPos.add(designationVal);
								                qPos.add(productVal);
								                qPos.add(zoneVal);
								                qPos.add(branchVal);
								                qPos.add(gradeVal);
								                qPos.add(regionVal);
								                qPos.add(locationVal);
								                qPos.add(user_idVal);
								                qPos.add(notify_syscdVal);
								                qPos.add(notify_Val);
								                qPos.add(notify_descVal);
								                qPos.add(notify_statusVal);
								                qPos.add(notify_flagVal);
								                qPos.add(status_update_dateVal);
								                qPos.add(genderVal);
								                qPos.add(age_typeVal);
								                qPos.add(age_Val);
								                qPos.add(notification_typeVal);
								                qPos.add(content_type);
								                qPos.add(notify_notificationtext);
								                qPos.add(page_urlVal);
								                int res = queryObject.executeUpdate();
								                if (res != 0) {
								                    flag = true;
								                }
											
										}
										else if(option.equalsIgnoreCase(allUserString) && age.startsWith(between)){
											 age_typeVal=age; 
											  age_Val=between_from_to_age;
											  logger.info(between);
											  String sql = CustomSQLUtil.get("insertpersonalisedparameters");
								                SQLQuery queryObject = session.createSQLQuery(sql);
								                queryObject.setCacheable(false);
								                QueryPos qPos = QueryPos.getInstance(queryObject);
								                qPos.add(uniqueContentId);
								                qPos.add(businessVal);
								                qPos.add(unitVal);
								                qPos.add(functionVal);
								                qPos.add(departmentVal);
								                qPos.add(designationVal);
								                qPos.add(productVal);
								                qPos.add(zoneVal);
								                qPos.add(branchVal);
								                qPos.add(gradeVal);
								                qPos.add(regionVal);
								                qPos.add(locationVal);
								                qPos.add(user_idVal);
								                qPos.add(notify_syscdVal);
								                qPos.add(notify_Val);
								                qPos.add(notify_descVal);
								                qPos.add(notify_statusVal);
								                qPos.add(notify_flagVal);
								                qPos.add(status_update_dateVal);
								                qPos.add(genderVal);
								                qPos.add(age_typeVal);
								                qPos.add(age_Val);
								                qPos.add(notification_typeVal);
								                qPos.add(content_type);
								                qPos.add(notify_notificationtext);
								                qPos.add(page_urlVal);
								                int res = queryObject.executeUpdate();
								                if (res != 0) {
								                    flag = true;
								                }
											
										}else if(option.equalsIgnoreCase(allUserString) && age.startsWith(greaterThan)){
											age_typeVal=age; 
											  age_Val=greaterthan_age;
											  
											  logger.info(greaterThan);
											  String sql = CustomSQLUtil.get("insertpersonalisedparameters");
								                SQLQuery queryObject = session.createSQLQuery(sql);
								                queryObject.setCacheable(false);
								                QueryPos qPos = QueryPos.getInstance(queryObject);
								                qPos.add(uniqueContentId);
								                qPos.add(businessVal);
								                qPos.add(unitVal);
								                qPos.add(functionVal);
								                qPos.add(departmentVal);
								                qPos.add(designationVal);
								                qPos.add(productVal);
								                qPos.add(zoneVal);
								                qPos.add(branchVal);
								                qPos.add(gradeVal);
								                qPos.add(regionVal);
								                qPos.add(locationVal);
								                qPos.add(user_idVal);
								                qPos.add(notify_syscdVal);
								                qPos.add(notify_Val);
								                qPos.add(notify_descVal);
								                qPos.add(notify_statusVal);
								                qPos.add(notify_flagVal);
								                qPos.add(status_update_dateVal);
								                qPos.add(genderVal);
								                qPos.add(age_typeVal);
								                qPos.add(age_Val);
								                qPos.add(notification_typeVal);
								                qPos.add(content_type);
								                qPos.add(notify_notificationtext);
								                qPos.add(page_urlVal);
								                int res = queryObject.executeUpdate();
								                if (res != 0) {
								                    flag = true;
								                }
											
										}else if(option.equalsIgnoreCase(allUserString) && age.startsWith(lessThan)){
											age_typeVal=age; 
											 age_Val=lessthan_age;
											 logger.info(lessThan);
											 String sql = CustomSQLUtil.get("insertpersonalisedparameters");
								                SQLQuery queryObject = session.createSQLQuery(sql);
								                queryObject.setCacheable(false);
								                QueryPos qPos = QueryPos.getInstance(queryObject);
								                qPos.add(uniqueContentId);
								                qPos.add(businessVal);
								                qPos.add(unitVal);
								                qPos.add(functionVal);
								                qPos.add(departmentVal);
								                qPos.add(designationVal);
								                qPos.add(productVal);
								                qPos.add(zoneVal);
								                qPos.add(branchVal);
								                qPos.add(gradeVal);
								                qPos.add(regionVal);
								                qPos.add(locationVal);
								                qPos.add(user_idVal);
								                qPos.add(notify_syscdVal);
								                qPos.add(notify_Val);
								                qPos.add(notify_descVal);
								                qPos.add(notify_statusVal);
								                qPos.add(notify_flagVal);
								                qPos.add(status_update_dateVal);
								                qPos.add(genderVal);
								                qPos.add(age_typeVal);
								                qPos.add(age_Val);
								                qPos.add(notification_typeVal);
								                qPos.add(content_type);
								                qPos.add(notify_notificationtext);
								                qPos.add(page_urlVal);
								                int res = queryObject.executeUpdate();
								                if (res != 0) {
								                    flag = true;
								                }
										}
            
            
            return flag;
        } catch (Exception e) {
            logger.error(e.getMessage());
        } finally {
            closeSession(session);
        }

        return flag;
	}
	
	
 	public List<String> getIntendedUser(String businessId, String[] values, String gender,String age, String option)
	{
		Session session = null;
		SQLQuery query =null;
		String newValue="";
		for(int i=0;i<values.length;i++)
		{
			newValue=newValue+"'"+values[i]+"',";
		}
		newValue = newValue.substring(0, newValue.length()-1);
		
		logger.info("New Values : "+newValue);
		try
		{	
			session = openSession();
			String querylist="";
			
			if(gender.equalsIgnoreCase(both))
			{
				gender=null;
			}
			
			if(option.equalsIgnoreCase(unit) && age.startsWith(between))
			{
				logger.info("intendeduserlist_Between");
				//querylist="intendeduserlist_greaterthan";
				
				String[] ageValues = age.split(" ");
				
				
				//String ageFrom = age.substring(age.indexOf(" ") + 1);
				String ageFrom=ageValues[1];
				logger.info("Age from : "+ageFrom);
				//String ageTo = age.substring(age.lastIndexOf(" ") + 1); ;
				String ageTo=ageValues[3];
				logger.info("Age to :"+ageTo);
				querylist="intendeduserlist_between_unit";
				String sql=CustomSQLUtil.get(querylist);
				sql = StringUtil.replace(sql, "[$unitdata$]", newValue);
				query = session.createSQLQuery(sql);
				QueryPos pos = QueryPos.getInstance(query);
				
					pos.add(gender);
				
				pos.add(ageFrom);
				pos.add(ageTo);
				
				List<Object[]> list = query.list();
			    Iterator it=list.iterator();
				logger.info("List size....." + list.size());
				return query.list();
				//pos.add(businessId);
				//pos.add(values);
			}
			else if(option.equalsIgnoreCase(unit) && age.equalsIgnoreCase(all))
			{
				age=null;
				querylist="intendeduserlist_all_unit";
				logger.info("intendeduserlist_all_unit");
				String sql=CustomSQLUtil.get(querylist);
				sql = StringUtil.replace(sql, "[$unitdata$]", newValue);
				query = session.createSQLQuery(sql);
				QueryPos pos = QueryPos.getInstance(query);
			
					pos.add(gender);
			
				/*pos.add(gender.toUpperCase());
				pos.add(values);*/
				List<Object[]> list = query.list();
			    Iterator it=list.iterator();
				logger.info("List size....." + list.size());
				return query.list();

			}
			else if(option.equalsIgnoreCase(unit) && age.startsWith(lessThan))
			{
				age=age.substring(age.lastIndexOf(" ") + 1);
				querylist="intendeduserlist_lessthan_unit";
				logger.info("intendeduserlist_lessthan_unit");
				String sql=CustomSQLUtil.get(querylist);
				sql = StringUtil.replace(sql, "[$unitdata$]", newValue);
				query = session.createSQLQuery(sql);
				QueryPos pos = QueryPos.getInstance(query);
			
					pos.add(gender);
				
				
				pos.add(age);
				List<Object[]> list = query.list();
			    Iterator it=list.iterator();
				logger.info("List size....." + list.size());
				return query.list();
				
			}
			else if(option.equalsIgnoreCase(unit) && age.startsWith(greaterThan))
			{
				age=age.substring(age.lastIndexOf(" ") + 1);
				querylist="intendeduserlist_greaterthan_unit";
				logger.info("intendeduserlist_greaterthan_unit");
				String sql=CustomSQLUtil.get(querylist);
				sql = StringUtil.replace(sql, "[$unitdata$]", newValue);
				query = session.createSQLQuery(sql);
				QueryPos pos = QueryPos.getInstance(query);
				
					pos.add(gender);
				
				pos.add(age);
				List<Object[]> list = query.list();
			    Iterator it=list.iterator();
				logger.info("List size....." + list.size());
				return query.list();
			}

			else if (option.equalsIgnoreCase(department) && age.equalsIgnoreCase(all)) {

				age=null;
				querylist="intendeduserlist_all_department";
				logger.info("intendeduserlist_all_department");
				String sql=CustomSQLUtil.get(querylist);
				sql = StringUtil.replace(sql, "[$departmentdata$]", newValue);
				query = session.createSQLQuery(sql);
				QueryPos pos = QueryPos.getInstance(query);
				
					pos.add(gender);
				
				
				/*pos.add(gender.toUpperCase());
				pos.add(values);*/
				List<Object[]> list = query.list();
			    Iterator it=list.iterator();
				logger.info("List size....." + list.size());
				return query.list();

				
				
			} else if (option.equalsIgnoreCase(department) && age.startsWith(between)) {
				
				String[] ageValues = age.split(" ");
				String ageFrom=ageValues[1];
				logger.info("Age from : "+ageFrom);
				String ageTo=ageValues[3];
				logger.info("Age to :"+ageTo);
				querylist="intendeduserlist_between_department";
				String sql=CustomSQLUtil.get(querylist);
				sql = StringUtil.replace(sql, "[$departmentdata$]", newValue);
				query = session.createSQLQuery(sql);
				QueryPos pos = QueryPos.getInstance(query);
				
					pos.add(gender);
				
				pos.add(ageFrom);
				pos.add(ageTo);
				
				List<Object[]> list = query.list();
			    Iterator it=list.iterator();
				logger.info("List size....." + list.size());
				return query.list();
				
				
			} else if (option.equalsIgnoreCase(department) && age.startsWith(greaterThan)) {

				age=age.substring(age.lastIndexOf(" ") + 1);
				querylist="intendeduserlist_greaterthan_department";
				logger.info("intendeduserlist_greaterthan_department");
				String sql=CustomSQLUtil.get(querylist);
				sql = StringUtil.replace(sql, "[$departmentdata$]", newValue);
				query = session.createSQLQuery(sql);
				QueryPos pos = QueryPos.getInstance(query);
			
					pos.add(gender);
				
				pos.add(age);
				List<Object[]> list = query.list();
			    Iterator it=list.iterator();
				logger.info("List size....." + list.size());
				return query.list();
				
			} else if (option.equalsIgnoreCase(department) && age.startsWith(lessThan)) {

				
				age=age.substring(age.lastIndexOf(" ") + 1);
				querylist="intendeduserlist_lessthan_department";
				logger.info("intendeduserlist_lessthan_department");
				String sql=CustomSQLUtil.get(querylist);
				sql = StringUtil.replace(sql, "[$departmentdata$]", newValue);
				query = session.createSQLQuery(sql);
				QueryPos pos = QueryPos.getInstance(query);
			
					pos.add(gender);
				
				
				pos.add(age);
				List<Object[]> list = query.list();
			    Iterator it=list.iterator();
				logger.info("List size....." + list.size());
				return query.list();
			}
			
			
			else if (option.equalsIgnoreCase(function) && age.equalsIgnoreCase(all)) {

				age=null;
				querylist="intendeduserlist_all_function";
				logger.info("intendeduserlist_all_function");
				String sql=CustomSQLUtil.get(querylist);
				sql = StringUtil.replace(sql, "[$functiondata$]", newValue);
				query = session.createSQLQuery(sql);
				QueryPos pos = QueryPos.getInstance(query);
				
					pos.add(gender);
				
				
				/*pos.add(gender.toUpperCase());
				pos.add(values);*/
				List<Object[]> list = query.list();
			    Iterator it=list.iterator();
				logger.info("List size....." + list.size());
				return query.list();

				
				
			} 
			else if (option.equalsIgnoreCase(function) && age.startsWith(between)) {
				
				String[] ageValues = age.split(" ");
				String ageFrom=ageValues[1];
				logger.info("Age from : "+ageFrom);
				String ageTo=ageValues[3];
				logger.info("Age to :"+ageTo);
				querylist="intendeduserlist_between_function";
				String sql=CustomSQLUtil.get(querylist);
				sql = StringUtil.replace(sql, "[$functiondata$]", newValue);
				query = session.createSQLQuery(sql);
				QueryPos pos = QueryPos.getInstance(query);
			
					pos.add(gender);
				
				pos.add(ageFrom);
				pos.add(ageTo);
				
				List<Object[]> list = query.list();
			    Iterator it=list.iterator();
				logger.info("List size....." + list.size());
				return query.list();
				
				
			} else if (option.equalsIgnoreCase(function) && age.startsWith(greaterThan)) {

				age=age.substring(age.lastIndexOf(" ") + 1);
				querylist="intendeduserlist_greaterthan_function";
				logger.info("intendeduserlist_greaterthan_function");
				String sql=CustomSQLUtil.get(querylist);
				sql = StringUtil.replace(sql, "[$functiondata$]", newValue);
				query = session.createSQLQuery(sql);
				QueryPos pos = QueryPos.getInstance(query);
			
					pos.add(gender);
				
				pos.add(age);
				List<Object[]> list = query.list();
			    Iterator it=list.iterator();
				logger.info("List size....." + list.size());
				return query.list();
				
			} else if (option.equalsIgnoreCase(function) && age.startsWith(lessThan)) {

				logger.info("intendeduserlist_lessthan_function");
				age=age.substring(age.lastIndexOf(" ") + 1);
				querylist="intendeduserlist_lessthan_function";
				
				String sql=CustomSQLUtil.get(querylist);
				sql = StringUtil.replace(sql, "[$functiondata$]", newValue);
				query = session.createSQLQuery(sql);
				QueryPos pos = QueryPos.getInstance(query);
				
					pos.add(gender);
				
				
				pos.add(age);
				List<Object[]> list = query.list();
			    Iterator it=list.iterator();
				logger.info("List size....." + list.size());
				return query.list();
			}
			
			
			
			//Intended User List for Designation From activeemployeeinfo
			
			else if (option.equalsIgnoreCase(designation) && age.equalsIgnoreCase(all)) {
				age=null;
				querylist="intendeduserlist_all_designation";
				logger.info("intendeduserlist_all_designation");
				String sql=CustomSQLUtil.get(querylist);
				sql = StringUtil.replace(sql, "[$designationdata$]", newValue);
				query = session.createSQLQuery(sql);
				QueryPos pos = QueryPos.getInstance(query);
			
					pos.add(gender);
				
				/*pos.add(gender.toUpperCase());
				pos.add(values);*/
				List<Object[]> list = query.list();
				logger.info("List size....." + list.size());
				return query.list();
				
			}
			else if (option.equalsIgnoreCase(designation) && age.startsWith(between)) {
				
				logger.info("Original Age : "+age);
				String[] ageValues = age.split(" ");
				String ageFrom=ageValues[1];
				logger.info("Age from : "+ageFrom);
				String ageTo=ageValues[3];
				logger.info("Age to :"+ageTo);
				querylist="intendeduserlist_between_designation";
				logger.info("intendeduserlist_between_designation");
				String sql=CustomSQLUtil.get(querylist);
				sql = StringUtil.replace(sql, "[$designationdata$]", newValue);
				query = session.createSQLQuery(sql);
				QueryPos pos = QueryPos.getInstance(query);
			
					pos.add(gender);
				
				pos.add(ageFrom);
				pos.add(ageTo);
				
				List<Object[]> list = query.list();
				logger.info("List size....." + list.size());
				return query.list();
				
			}
			else if (option.equalsIgnoreCase(designation) && age.startsWith(greaterThan)) {
				
				age=age.substring(age.lastIndexOf(" ") + 1);
				querylist="intendeduserlist_greaterthan_designation";
				logger.info("intendeduserlist_greaterthan_designation");
				String sql=CustomSQLUtil.get(querylist);
				sql = StringUtil.replace(sql, "[$designationdata$]", newValue);
				query = session.createSQLQuery(sql);
				QueryPos pos = QueryPos.getInstance(query);
			
					pos.add(gender);
				
				pos.add(age);
				List<Object[]> list = query.list();
				logger.info("List size....." + list.size());
				return query.list();
				
			}
			else if (option.equalsIgnoreCase(designation) && age.startsWith(lessThan)) {
				logger.info("intendeduserlist_lessthan_designation");
				age=age.substring(age.lastIndexOf(" ") + 1);
				querylist="intendeduserlist_lessthan_designation";
				
				String sql=CustomSQLUtil.get(querylist);
				sql = StringUtil.replace(sql, "[$designationdata$]", newValue);
				query = session.createSQLQuery(sql);
				QueryPos pos = QueryPos.getInstance(query);
				
					pos.add(gender);
				
				
				pos.add(age);
				List<Object[]> list = query.list();
				logger.info("List size....." + list.size());
				return query.list();
			}
			
			//Intended User List for Product From activeemployeeinfo
			
			else if (option.equalsIgnoreCase(product) && age.equalsIgnoreCase(all)) {
				age=null;
				querylist="intendeduserlist_all_product";
				logger.info("intendeduserlist_all_product");
				String sql=CustomSQLUtil.get(querylist);
				sql = StringUtil.replace(sql, "[$productdata$]", newValue);
				query = session.createSQLQuery(sql);
				QueryPos pos = QueryPos.getInstance(query);
					pos.add(gender);
				
				List<Object[]> list = query.list();
				logger.info("List size....." + list.size());
				return query.list();
			}
			else if (option.equalsIgnoreCase(product) && age.startsWith(between)) {
				logger.info("Original Age : "+age);
				String[] ageValues = age.split(" ");
				String ageFrom=ageValues[1];
				logger.info("Age from : "+ageFrom);
				String ageTo=ageValues[3];
				logger.info("Age to :"+ageTo);
				querylist="intendeduserlist_between_product";
				logger.info("intendeduserlist_between_product");
				String sql=CustomSQLUtil.get(querylist);
				sql = StringUtil.replace(sql, "[$productdata$]", newValue);
				query = session.createSQLQuery(sql);
				QueryPos pos = QueryPos.getInstance(query);
			
					pos.add(gender);
				
				pos.add(ageFrom);
				pos.add(ageTo);
				
				List<Object[]> list = query.list();
				logger.info("List size....." + list.size());
				return query.list();
			}
			else if (option.equalsIgnoreCase(product) && age.startsWith(greaterThan)) {
				age=age.substring(age.lastIndexOf(" ") + 1);
				querylist="intendeduserlist_greaterthan_product";
				logger.info("intendeduserlist_greaterthan_product");
				String sql=CustomSQLUtil.get(querylist);
				sql = StringUtil.replace(sql, "[$productdata$]", newValue);
				query = session.createSQLQuery(sql);
				QueryPos pos = QueryPos.getInstance(query);
			
					pos.add(gender);
				
				pos.add(age);
				List<Object[]> list = query.list();
				logger.info("List size....." + list.size());
				return query.list();
			}
			else if (option.equalsIgnoreCase(product) && age.startsWith(lessThan)) {
				logger.info("intendeduserlist_lessthan_product");
				age=age.substring(age.lastIndexOf(" ") + 1);
				querylist="intendeduserlist_lessthan_product";
				
				String sql=CustomSQLUtil.get(querylist);
				sql = StringUtil.replace(sql, "[$productdata$]", newValue);
				query = session.createSQLQuery(sql);
				QueryPos pos = QueryPos.getInstance(query);
				
					pos.add(gender);
				
				
				pos.add(age);
				List<Object[]> list = query.list();
				return query.list();
			}
			
			//Intended User List for Zone From activeemployeeinfo
			
			else if (option.equalsIgnoreCase(zone) && age.equalsIgnoreCase(all)) {
				age=null;
				querylist="intendeduserlist_all_zone";
				logger.info("intendeduserlist_all_zone");
				String sql=CustomSQLUtil.get(querylist);
				sql = StringUtil.replace(sql, "[$zonedata$]", newValue);
				query = session.createSQLQuery(sql);
				QueryPos pos = QueryPos.getInstance(query);
				
				
					pos.add(gender);
				
				/*pos.add(gender.toUpperCase());
				pos.add(values);*/
				List<Object[]> list = query.list();
				logger.info("List size....." + list.size());
				return query.list();
			}
			else if (option.equalsIgnoreCase(zone) && age.startsWith(between)) {
				logger.info("Original Age : "+age);
				String[] ageValues = age.split(" ");
				String ageFrom=ageValues[1];
				logger.info("Age from : "+ageFrom);
				String ageTo=ageValues[3];
				logger.info("Age to :"+ageTo);
				querylist="intendeduserlist_between_zone";
				logger.info("intendeduserlist_between_zone");
				String sql=CustomSQLUtil.get(querylist);
				sql = StringUtil.replace(sql, "[$zonedata$]", newValue);
				query = session.createSQLQuery(sql);
				QueryPos pos = QueryPos.getInstance(query);
			
					pos.add(gender);
				
				pos.add(ageFrom);
				pos.add(ageTo);
				
				List<Object[]> list = query.list();
				logger.info("List size....." + list.size());
				return query.list();
			}
			else if (option.equalsIgnoreCase(zone) && age.startsWith(greaterThan)) {
				age=age.substring(age.lastIndexOf(" ") + 1);
				querylist="intendeduserlist_greaterthan_zone";
				logger.info("intendeduserlist_greaterthan_zone");
				String sql=CustomSQLUtil.get(querylist);
				sql = StringUtil.replace(sql, "[$zonedata$]", newValue);
				query = session.createSQLQuery(sql);
				QueryPos pos = QueryPos.getInstance(query);
			
					pos.add(gender);
				
				pos.add(age);
				List<Object[]> list = query.list();
				logger.info("List size....." + list.size());
				return query.list();
			}
			else if (option.equalsIgnoreCase(zone) && age.startsWith(lessThan)) {
				logger.info("intendeduserlist_lessthan_zone");
				age=age.substring(age.lastIndexOf(" ") + 1);
				querylist="intendeduserlist_lessthan_zone";
				
				String sql=CustomSQLUtil.get(querylist);
				sql = StringUtil.replace(sql, "[$zonedata$]", newValue);
				query = session.createSQLQuery(sql);
				QueryPos pos = QueryPos.getInstance(query);
				
					pos.add(gender);
				
				
				pos.add(age);
				List<Object[]> list = query.list();
				logger.info("List size....." + list.size());
				return query.list();
			}
			
			//Intended User List for Branch From activeemployeeinfo
			
			
			else if (option.equalsIgnoreCase(branch) && age.equalsIgnoreCase(all)) {
				age=null;
				querylist="intendeduserlist_all_branch";
				logger.info("intendeduserlist_all_branch");
				String sql=CustomSQLUtil.get(querylist);
				sql = StringUtil.replace(sql, "[$branchdata$]", newValue);
				query = session.createSQLQuery(sql);
				QueryPos pos = QueryPos.getInstance(query);
				
			
					pos.add(gender);
				
				/*pos.add(gender.toUpperCase());
				pos.add(values);*/
				List<Object[]> list = query.list();
				logger.info("List size....." + list.size());
				return query.list();
			}
			else if (option.equalsIgnoreCase(branch) && age.startsWith(between)) {
				logger.info("Original Age : "+age);
				String[] ageValues = age.split(" ");
				String ageFrom=ageValues[1];
				logger.info("Age from : "+ageFrom);
				String ageTo=ageValues[3];
				logger.info("Age to :"+ageTo);
				querylist="intendeduserlist_between_branch";
				logger.info("intendeduserlist_between_branch");
				String sql=CustomSQLUtil.get(querylist);
				sql = StringUtil.replace(sql, "[$branchdata$]", newValue);
				query = session.createSQLQuery(sql);
				QueryPos pos = QueryPos.getInstance(query);
			
					pos.add(gender);
				
				pos.add(ageFrom);
				pos.add(ageTo);
				
				List<Object[]> list = query.list();
				return query.list();
			}
			else if (option.equalsIgnoreCase(branch) && age.startsWith(greaterThan)) {
				age=age.substring(age.lastIndexOf(" ") + 1);
				querylist="intendeduserlist_greaterthan_branch";
				logger.info("intendeduserlist_greaterthan_branch");
				String sql=CustomSQLUtil.get(querylist);
				sql = StringUtil.replace(sql, "[$branchdata$]", newValue);
				query = session.createSQLQuery(sql);
				QueryPos pos = QueryPos.getInstance(query);
			
					pos.add(gender);
				
				pos.add(age);
				List<Object[]> list = query.list();
				logger.info("List size....." + list.size());
				return query.list();
			}
			else if (option.equalsIgnoreCase(branch) && age.startsWith(lessThan)) {
				logger.info("intendeduserlist_lessthan_branch");
				age=age.substring(age.lastIndexOf(" ") + 1);
				querylist="intendeduserlist_lessthan_branch";
				
				String sql=CustomSQLUtil.get(querylist);
				
				sql = StringUtil.replace(sql, "[$branchdata$]", newValue);
				query = session.createSQLQuery(sql);
				QueryPos pos = QueryPos.getInstance(query);
				
					pos.add(gender);
				
				
				pos.add(age);
				List<Object[]> list = query.list();
				logger.info("List size....." + list.size());
				return query.list();	
			}
			//Intended User List for Grade From activeemployeeinfo
			
			
			else if (option.equalsIgnoreCase(grade) && age.equalsIgnoreCase(all)) {
				age=null;
				querylist="intendeduserlist_all_grade";
				logger.info("intendeduserlist_all_grade");
				String sql=CustomSQLUtil.get(querylist);
				sql = StringUtil.replace(sql, "[$gradedata$]", newValue);
				query = session.createSQLQuery(sql);
				QueryPos pos = QueryPos.getInstance(query);
				
				
					pos.add(gender);
				
				/*pos.add(gender.toUpperCase());
				pos.add(values);*/
				List<Object[]> list = query.list();
				logger.info("List size....." + list.size());
				return query.list();
			}
			else if (option.equalsIgnoreCase(grade) && age.startsWith(between)) {
				logger.info("Original Age : "+age);
				String[] ageValues = age.split(" ");
				String ageFrom=ageValues[1];
				logger.info("Age from : "+ageFrom);
				String ageTo=ageValues[3];
				logger.info("Age to :"+ageTo);
				querylist="intendeduserlist_between_grade";
				logger.info("intendeduserlist_between_grade");
				String sql=CustomSQLUtil.get(querylist);
				sql = StringUtil.replace(sql, "[$gradedata$]", newValue);
				query = session.createSQLQuery(sql);
				QueryPos pos = QueryPos.getInstance(query);
			
					pos.add(gender);
				
				pos.add(ageFrom);
				pos.add(ageTo);
				
				List<Object[]> list = query.list();
				logger.info("List size....." + list.size());
				return query.list();
			}
			else if (option.equalsIgnoreCase(grade) && age.startsWith(greaterThan)) {
				age=age.substring(age.lastIndexOf(" ") + 1);
				logger.info("age : "+age);
				querylist="intendeduserlist_greaterthan_grade";
				logger.info("intendeduserlist_greaterthan_grade");
				String sql=CustomSQLUtil.get(querylist);
				
				sql = StringUtil.replace(sql, "[$gradedata$]", newValue);
				query = session.createSQLQuery(sql);
				QueryPos pos = QueryPos.getInstance(query);
			
					pos.add(gender);
				
				pos.add(age);
				List<Object[]> list = query.list();
				logger.info("List size....." + list.size());
				return query.list();
			}
			else if (option.equalsIgnoreCase(grade) && age.startsWith(lessThan)) {
				logger.info("intendeduserlist_lessthan_grade");
				age=age.substring(age.lastIndexOf(" ") + 1);
				querylist="intendeduserlist_lessthan_grade";
				
				String sql=CustomSQLUtil.get(querylist);
				sql = StringUtil.replace(sql, "[$gradedata$]", newValue);
				query = session.createSQLQuery(sql);
				QueryPos pos = QueryPos.getInstance(query);
				
					pos.add(gender);
				
				
				pos.add(age);
				List<Object[]> list = query.list();
				logger.info("List size....." + list.size());
				return query.list();
			}
			//Intended User List for Region From activeemployeeinfo
			
			
			else if (option.equalsIgnoreCase(region) && age.equalsIgnoreCase(all)) {
				age=null;
				querylist="intendeduserlist_all_region";
				logger.info("intendeduserlist_all_region");
				String sql=CustomSQLUtil.get(querylist);
				sql = StringUtil.replace(sql, "[$regiondata$]", newValue);
				query = session.createSQLQuery(sql);
				QueryPos pos = QueryPos.getInstance(query);
				
			
					pos.add(gender);
				
				/*pos.add(gender.toUpperCase());
				pos.add(values);*/
				List<Object[]> list = query.list();
				logger.info("List size....." + list.size());
				return query.list();
			}
			else if (option.equalsIgnoreCase(region) && age.startsWith(between)) {
				logger.info("Original Age : "+age);
				String[] ageValues = age.split(" ");
				String ageFrom=ageValues[1];
				logger.info("Age from : "+ageFrom);
				String ageTo=ageValues[3];
				logger.info("Age to :"+ageTo);
				querylist="intendeduserlist_between_region";
				logger.info("intendeduserlist_between_region");
				String sql=CustomSQLUtil.get(querylist);
				sql = StringUtil.replace(sql, "[$regiondata$]", newValue);
				query = session.createSQLQuery(sql);
				QueryPos pos = QueryPos.getInstance(query);
			
					pos.add(gender);
				
				pos.add(ageFrom);
				pos.add(ageTo);
				
				List<Object[]> list = query.list();
				logger.info("List size....." + list.size());
				return query.list();
			}
			else if (option.equalsIgnoreCase(region) && age.startsWith(greaterThan)) {
				age=age.substring(age.lastIndexOf(" ") + 1);
				logger.info("age : "+age);
				querylist="intendeduserlist_greaterthan_region";
				logger.info("intendeduserlist_greaterthan_region");
				String sql=CustomSQLUtil.get(querylist);
				sql = StringUtil.replace(sql, "[$regiondata$]", newValue);
				query = session.createSQLQuery(sql);
				QueryPos pos = QueryPos.getInstance(query);
			
					pos.add(gender);
				
				pos.add(age);
				List<Object[]> list = query.list();
				logger.info("List size....." + list.size());
				return query.list();
			}
			else if (option.equalsIgnoreCase(region) && age.startsWith(lessThan)) {
				logger.info("intendeduserlist_lessthan_region");
				age=age.substring(age.lastIndexOf(" ") + 1);
				querylist="intendeduserlist_lessthan_region";
				
				String sql=CustomSQLUtil.get(querylist);
				sql = StringUtil.replace(sql, "[$regiondata$]", newValue);
				query = session.createSQLQuery(sql);
				QueryPos pos = QueryPos.getInstance(query);
				
					pos.add(gender);
				
				
				pos.add(age);
				List<Object[]> list = query.list();
				logger.info("List size....." + list.size());
				return query.list();
			}
			//Intended User List for Location From activeemployeeinfo
			
			else if (option.equalsIgnoreCase(location) && age.equalsIgnoreCase(all)) {
				age=null;
				querylist="intendeduserlist_all_location";
				logger.info("intendeduserlist_all_location");
				String sql=CustomSQLUtil.get(querylist);
				sql = StringUtil.replace(sql, "[$locationdata$]", newValue);
				query = session.createSQLQuery(sql);
				QueryPos pos = QueryPos.getInstance(query);
				
				
					pos.add(gender);
				
				/*pos.add(gender.toUpperCase());
				pos.add(values);*/
				List<Object[]> list = query.list();
				logger.info("List size....." + list.size());
				return query.list();
			}
			else if (option.equalsIgnoreCase(location) && age.startsWith(between)) {
				logger.info("Original Age : "+age);
				String[] ageValues = age.split(" ");
				String ageFrom=ageValues[1];
				logger.info("Age from : "+ageFrom);
				String ageTo=ageValues[3];
				logger.info("Age to :"+ageTo);
				querylist="intendeduserlist_between_location";
				logger.info("intendeduserlist_between_location");
				String sql=CustomSQLUtil.get(querylist);
				sql = StringUtil.replace(sql, "[$locationdata$]", newValue);
				query = session.createSQLQuery(sql);
				QueryPos pos = QueryPos.getInstance(query);
			
					pos.add(gender);
				
				pos.add(ageFrom);
				pos.add(ageTo);
				
				List<Object[]> list = query.list();
				logger.info("List size....." + list.size());
				return query.list();
			}
			else if (option.equalsIgnoreCase(location) && age.startsWith(greaterThan)) {
				age=age.substring(age.lastIndexOf(" ") + 1);
				logger.info("age : "+age);
				querylist="intendeduserlist_greaterthan_location";
				logger.info("intendeduserlist_greaterthan_location");
				String sql=CustomSQLUtil.get(querylist);
				sql = StringUtil.replace(sql, "[$locationdata$]", newValue);
				query = session.createSQLQuery(sql);
				QueryPos pos = QueryPos.getInstance(query);
			
					pos.add(gender);
				
				pos.add(age);
				List<Object[]> list = query.list();
				logger.info("List size....." + list.size());
				return query.list();
			}
			else if (option.equalsIgnoreCase(location) && age.startsWith(lessThan)) {
				logger.info("intendeduserlist_lessthan_location");
				age=age.substring(age.lastIndexOf(" ") + 1);
				querylist="intendeduserlist_lessthan_location";
				
				String sql=CustomSQLUtil.get(querylist);
				sql = StringUtil.replace(sql, "[$locationdata$]", newValue);
				query = session.createSQLQuery(sql);
				QueryPos pos = QueryPos.getInstance(query);
				
					pos.add(gender);
				
				
				pos.add(age);
				List<Object[]> list = query.list();
				logger.info("List size....." + list.size());
				return query.list();
			}
			
		}
		catch(Exception e)
		{
			logger.error(e.getMessage());
		}
		finally {
			closeSession(session);
		}
		return null;
}

	
	public List<String> getAllUser(String businessId, String gender,String age, String option)
	{
		
		Session session = null;
		SQLQuery query =null;
		
		try{
		session = openSession();
			String querylist="";
			
			//Get Business name based on its ID
			String businessName="";
			{
				querylist="query_for_businessname";
				logger.info("query_for_businessname");
				String sql=CustomSQLUtil.get(querylist);
				query = session.createSQLQuery(sql);
				QueryPos pos = QueryPos.getInstance(query);
			
					pos.add(businessId);
			
				/*pos.add(gender.toUpperCase());
				pos.add(values);*/
				List<String> list = query.list();	
				logger.info("Business Name : "+list.get(0));
				businessName=list.get(0).toString().trim();
			}
			
			if(gender.equalsIgnoreCase(both))
			{
				gender=null;
			}
		
		if(option.equalsIgnoreCase(allUserString) && age.equalsIgnoreCase(all))
			{
				age=null;
				querylist="alluserlist_all";
				logger.info("alluserlist_all");
				String sql=CustomSQLUtil.get(querylist);
				query = session.createSQLQuery(sql);
				QueryPos pos = QueryPos.getInstance(query);
					pos.add(businessName);
					pos.add(gender);
			
				/*pos.add(gender.toUpperCase());
				pos.add(values);*/
				List<Object[]> list = query.list();
				logger.info("List size....." + list.size());
				return query.list();

			}
			
			else if(option.equalsIgnoreCase(allUserString) && age.startsWith(between)){
			
				logger.info("Original Age : "+age);
				String[] ageValues = age.split(" ");
				String ageFrom=ageValues[1];
				logger.info("Age from : "+ageFrom);
				String ageTo=ageValues[3];
				logger.info("Age to :"+ageTo);
				querylist="alluserlist_between";
				logger.info("alluserlist_between");
				String sql=CustomSQLUtil.get(querylist);
				
				query = session.createSQLQuery(sql);
				QueryPos pos = QueryPos.getInstance(query);
				pos.add(businessName);
				pos.add(gender);
				pos.add(ageFrom);
				pos.add(ageTo);
				
				List<Object[]> list = query.list();
				logger.info("List size....." + list.size());
				return query.list();
			
			}
			
			else if(option.equalsIgnoreCase(allUserString) && age.startsWith(greaterThan)){
				age=age.substring(age.lastIndexOf(" ") + 1);
				logger.info("age : "+age);
				querylist="alluserlist_greaterthan";
				logger.info("alluserlist_greaterthan");
				String sql=CustomSQLUtil.get(querylist);
				query = session.createSQLQuery(sql);
				QueryPos pos = QueryPos.getInstance(query);
				pos.add(businessName);
				pos.add(gender);
				pos.add(age);
				List<Object[]> list = query.list();
				logger.info("List size....." + list.size());
				return query.list();
			
			}
			else if(option.equalsIgnoreCase(allUserString) && age.startsWith(lessThan)){
				age=age.substring(age.lastIndexOf(" ") + 1);
				logger.info("age : "+age);
				querylist="alluserlist_lessthan";
				logger.info("alluserlist_lessthan");
				String sql=CustomSQLUtil.get(querylist);
				query = session.createSQLQuery(sql);
				QueryPos pos = QueryPos.getInstance(query);
				pos.add(businessName);
				pos.add(gender);
				pos.add(age);
				List<Object[]> list = query.list();
				logger.info("List size....." + list.size());
				return query.list();
			
			}
		
		}catch(Exception e){
		logger.error(e.getMessage());
		}
		return null;
	}

	public boolean changesContentFlagForUpdateDelete(long udflag,String notificationText,long contentId){
		try {
			List<contentuniqueinformation> cui=contentuniqueinformationLocalServiceUtil.getUniqueContentInfo(contentId);
			
			for(contentuniqueinformation contentInfo:cui){
				contentInfo.setUdflag(udflag);
				contentInfo.setNotification_text(notificationText);
				contentInfo=contentuniqueinformationLocalServiceUtil.updatecontentuniqueinformation(contentInfo);
			}
			
			 return true;
		} catch (Exception e) {
			
			logger.error(e.getMessage());
			return false;
		} 
	}
}
