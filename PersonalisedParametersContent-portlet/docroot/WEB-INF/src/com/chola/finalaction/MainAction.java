package com.chola.finalaction;

import com.chola.ppcontent.model.contentuniqueinformation;
import com.chola.ppcontent.model.personalisedparameterscontentstore;
import com.chola.ppcontent.service.contentuniqueinformationLocalServiceUtil;
import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.chola.ppcontent.service.contentupdateLocalServiceUtil;
import com.chola.ppcontent.service.personalisedparameterscontentstoreLocalServiceUtil;

public class MainAction {
	private static final Log logger = LogFactoryUtil.getLog(MainAction.class);
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

	public  boolean insertIntoPPContentStore(String businessId, String[] values, String gender, String age,
			String option, long uniqueContentId, String lessthan_age, String greaterthan_age,
			String between_from_to_age, long notification_type) {

		String content_idVal = null;
		String businessVal = null;
		String genderVal = gender.toUpperCase();
		String age_typeVal = age;
		String age_Val = null;
		long notification_typeVal = notification_type;

		if (gender.equalsIgnoreCase("both")) {
			genderVal = null;
		}

		try {
			// session = openSession();

			businessVal = contentupdateLocalServiceUtil.getBusinessNames(businessId);

			if (option.equalsIgnoreCase("Unit") && age.equalsIgnoreCase("all")) {

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
					ppcs = personalisedparameterscontentstoreLocalServiceUtil
							.addpersonalisedparameterscontentstore(ppcs);
				}
			} else if (option.equalsIgnoreCase("Unit") && age.startsWith("Between")) {
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
					ppcs = personalisedparameterscontentstoreLocalServiceUtil
							.addpersonalisedparameterscontentstore(ppcs);
				}
			} else if (option.equalsIgnoreCase("Unit") && age.startsWith("Greater than")) {
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
					ppcs = personalisedparameterscontentstoreLocalServiceUtil
							.addpersonalisedparameterscontentstore(ppcs);
				}
			}

			else if (option.equalsIgnoreCase("Unit") && age.startsWith("Less than")) {

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
					ppcs = personalisedparameterscontentstoreLocalServiceUtil
							.addpersonalisedparameterscontentstore(ppcs);
				}
			}

			// Intended Logic For Department

			else if (option.equalsIgnoreCase("Department") && age.equalsIgnoreCase("all")) {

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
					ppcs = personalisedparameterscontentstoreLocalServiceUtil
							.addpersonalisedparameterscontentstore(ppcs);
				}
			} else if (option.equalsIgnoreCase("Department") && age.startsWith("Between")) {
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
					ppcs = personalisedparameterscontentstoreLocalServiceUtil
							.addpersonalisedparameterscontentstore(ppcs);
				}
			} else if (option.equalsIgnoreCase("Department") && age.startsWith("Greater than")) {
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
					ppcs = personalisedparameterscontentstoreLocalServiceUtil
							.addpersonalisedparameterscontentstore(ppcs);
				}
			}

			else if (option.equalsIgnoreCase("Department") && age.startsWith("Less than")) {

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
					ppcs = personalisedparameterscontentstoreLocalServiceUtil
							.addpersonalisedparameterscontentstore(ppcs);
				}
			}

			// Intended Logic for Function

			else if (option.equalsIgnoreCase("Function") && age.equalsIgnoreCase("all")) {

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
					ppcs = personalisedparameterscontentstoreLocalServiceUtil
							.addpersonalisedparameterscontentstore(ppcs);
				}
			} else if (option.equalsIgnoreCase("Function") && age.startsWith("Between")) {
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
					ppcs = personalisedparameterscontentstoreLocalServiceUtil
							.addpersonalisedparameterscontentstore(ppcs);
				}
			} else if (option.equalsIgnoreCase("Function") && age.startsWith("Greater than")) {
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
					ppcs = personalisedparameterscontentstoreLocalServiceUtil
							.addpersonalisedparameterscontentstore(ppcs);
				}
			}

			else if (option.equalsIgnoreCase("Function") && age.startsWith("Less than")) {

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
					ppcs = personalisedparameterscontentstoreLocalServiceUtil
							.addpersonalisedparameterscontentstore(ppcs);
				}
			}

			// Intended Logic for Designation

			else if (option.equalsIgnoreCase("Designation") && age.equalsIgnoreCase("all")) {

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
					ppcs = personalisedparameterscontentstoreLocalServiceUtil
							.addpersonalisedparameterscontentstore(ppcs);
				}
			} else if (option.equalsIgnoreCase("Designation") && age.startsWith("Between")) {
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
					ppcs = personalisedparameterscontentstoreLocalServiceUtil
							.addpersonalisedparameterscontentstore(ppcs);
				}
			} else if (option.equalsIgnoreCase("Designation") && age.startsWith("Greater than")) {
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
					ppcs = personalisedparameterscontentstoreLocalServiceUtil
							.addpersonalisedparameterscontentstore(ppcs);
				}
			}

			else if (option.equalsIgnoreCase("Designation") && age.startsWith("Less than")) {

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
					ppcs = personalisedparameterscontentstoreLocalServiceUtil
							.addpersonalisedparameterscontentstore(ppcs);
				}
			}

			// Intended Logic For Product

			else if (option.equalsIgnoreCase("Product") && age.equalsIgnoreCase("all")) {

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
					ppcs = personalisedparameterscontentstoreLocalServiceUtil
							.addpersonalisedparameterscontentstore(ppcs);
				}
			} else if (option.equalsIgnoreCase("Product") && age.startsWith("Between")) {
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
					ppcs = personalisedparameterscontentstoreLocalServiceUtil
							.addpersonalisedparameterscontentstore(ppcs);
				}
			} else if (option.equalsIgnoreCase("Product") && age.startsWith("Greater than")) {
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
					ppcs = personalisedparameterscontentstoreLocalServiceUtil
							.addpersonalisedparameterscontentstore(ppcs);
				}
			}

			else if (option.equalsIgnoreCase("Product") && age.startsWith("Less than")) {

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
					ppcs = personalisedparameterscontentstoreLocalServiceUtil
							.addpersonalisedparameterscontentstore(ppcs);
				}
			}

			// Intended Logic For Zone

			else if (option.equalsIgnoreCase("Zone") && age.equalsIgnoreCase("all")) {

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
					ppcs = personalisedparameterscontentstoreLocalServiceUtil
							.addpersonalisedparameterscontentstore(ppcs);
				}
			} else if (option.equalsIgnoreCase("Zone") && age.startsWith("Between")) {
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
					ppcs = personalisedparameterscontentstoreLocalServiceUtil
							.addpersonalisedparameterscontentstore(ppcs);
				}
			} else if (option.equalsIgnoreCase("Zone") && age.startsWith("Greater than")) {
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
					ppcs = personalisedparameterscontentstoreLocalServiceUtil
							.addpersonalisedparameterscontentstore(ppcs);
				}
			}

			else if (option.equalsIgnoreCase("Zone") && age.startsWith("Less than")) {

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
					ppcs = personalisedparameterscontentstoreLocalServiceUtil
							.addpersonalisedparameterscontentstore(ppcs);
				}
			}

			// Intended Logic For Branch

			else if (option.equalsIgnoreCase("Branch") && age.equalsIgnoreCase("all")) {

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
					ppcs = personalisedparameterscontentstoreLocalServiceUtil
							.addpersonalisedparameterscontentstore(ppcs);
				}
			} else if (option.equalsIgnoreCase("Branch") && age.startsWith("Between")) {
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
					ppcs = personalisedparameterscontentstoreLocalServiceUtil
							.addpersonalisedparameterscontentstore(ppcs);
				}
			} else if (option.equalsIgnoreCase("Branch") && age.startsWith("Greater than")) {
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
					ppcs = personalisedparameterscontentstoreLocalServiceUtil
							.addpersonalisedparameterscontentstore(ppcs);
				}
			}

			else if (option.equalsIgnoreCase("Branch") && age.startsWith("Less than")) {

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
					ppcs = personalisedparameterscontentstoreLocalServiceUtil
							.addpersonalisedparameterscontentstore(ppcs);
				}
			}

			// Intended Logic For Grade

			else if (option.equalsIgnoreCase("Grade") && age.equalsIgnoreCase("all")) {

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
					ppcs = personalisedparameterscontentstoreLocalServiceUtil
							.addpersonalisedparameterscontentstore(ppcs);
				}
			} else if (option.equalsIgnoreCase("Grade") && age.startsWith("Between")) {
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
					ppcs = personalisedparameterscontentstoreLocalServiceUtil
							.addpersonalisedparameterscontentstore(ppcs);
				}
			} else if (option.equalsIgnoreCase("Grade") && age.startsWith("Greater than")) {
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
					ppcs = personalisedparameterscontentstoreLocalServiceUtil
							.addpersonalisedparameterscontentstore(ppcs);
				}
			}

			else if (option.equalsIgnoreCase("Grade") && age.startsWith("Less than")) {

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
					ppcs = personalisedparameterscontentstoreLocalServiceUtil
							.addpersonalisedparameterscontentstore(ppcs);
				}
			}

			// Intended Logic For Region

			else if (option.equalsIgnoreCase("Region") && age.equalsIgnoreCase("all")) {

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
					ppcs = personalisedparameterscontentstoreLocalServiceUtil
							.addpersonalisedparameterscontentstore(ppcs);
				}
			} else if (option.equalsIgnoreCase("Region") && age.startsWith("Between")) {
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
					ppcs = personalisedparameterscontentstoreLocalServiceUtil
							.addpersonalisedparameterscontentstore(ppcs);
				}
			} else if (option.equalsIgnoreCase("Region") && age.startsWith("Greater than")) {
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
					ppcs = personalisedparameterscontentstoreLocalServiceUtil
							.addpersonalisedparameterscontentstore(ppcs);
				}
			}

			else if (option.equalsIgnoreCase("Region") && age.startsWith("Less than")) {

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
					ppcs = personalisedparameterscontentstoreLocalServiceUtil
							.addpersonalisedparameterscontentstore(ppcs);
				}
			}

			// Intended Logic For Location

			else if (option.equalsIgnoreCase("Location") && age.equalsIgnoreCase("all")) {

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
					ppcs = personalisedparameterscontentstoreLocalServiceUtil
							.addpersonalisedparameterscontentstore(ppcs);
				}
			} else if (option.equalsIgnoreCase("Location") && age.startsWith("Between")) {
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
					ppcs = personalisedparameterscontentstoreLocalServiceUtil
							.addpersonalisedparameterscontentstore(ppcs);
				}
			} else if (option.equalsIgnoreCase("Location") && age.startsWith("Greater than")) {
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
					ppcs = personalisedparameterscontentstoreLocalServiceUtil
							.addpersonalisedparameterscontentstore(ppcs);
				}
			}

			else if (option.equalsIgnoreCase("Location") && age.startsWith("Less than")) {

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
					ppcs = personalisedparameterscontentstoreLocalServiceUtil
							.addpersonalisedparameterscontentstore(ppcs);
				}
			}

			// Intended Logic for UserId

			else if (option.equalsIgnoreCase("User ID")) {

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
					ppcs = personalisedparameterscontentstoreLocalServiceUtil
							.addpersonalisedparameterscontentstore(ppcs);
				}
			}

			// Inteded logic for All User

			else if (option.equalsIgnoreCase("All User") && age.equalsIgnoreCase("all")) {
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
				ppcs = personalisedparameterscontentstoreLocalServiceUtil
						.addpersonalisedparameterscontentstore(ppcs);

			} else if (option.equalsIgnoreCase("All User") && age.startsWith("Between")) {
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
				ppcs = personalisedparameterscontentstoreLocalServiceUtil
						.addpersonalisedparameterscontentstore(ppcs);


			} else if (option.equalsIgnoreCase("All User") && age.startsWith("Greater than")) {
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
				ppcs = personalisedparameterscontentstoreLocalServiceUtil
						.addpersonalisedparameterscontentstore(ppcs);


			} else if (option.equalsIgnoreCase("All User") && age.startsWith("Less than")) {
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
				ppcs = personalisedparameterscontentstoreLocalServiceUtil
						.addpersonalisedparameterscontentstore(ppcs);

			}
			return true;
		} catch (Exception e) {
			logger.error(e.getMessage());
			return false;
		}
	}

}
