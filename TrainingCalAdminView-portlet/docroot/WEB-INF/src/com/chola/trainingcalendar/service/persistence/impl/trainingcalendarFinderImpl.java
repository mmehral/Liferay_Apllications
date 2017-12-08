package com.chola.trainingcalendar.service.persistence.impl;

import com.chola.trainingcalendar.model.trainingpersonalisedparameterscontentstore;
import com.chola.trainingcalendar.service.trainingcalendarLocalServiceUtil;
import com.chola.trainingcalendar.service.trainingpersonalisedparameterscontentstoreLocalServiceUtil;
import com.chola.trainingcalendar.service.persistence.trainingcalendarFinder;
import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.SQLQuery;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.util.dao.orm.CustomSQLUtil;
import java.util.List;

public class trainingcalendarFinderImpl extends trainingcalendarFinderBaseImpl implements trainingcalendarFinder {
	private static final Log logger = LogFactoryUtil.getLog(trainingcalendarFinderImpl.class);
	
	/*method to delete all Training*/
public boolean deletAllTrainings(){
	boolean flag = false;
	Session session = null;
	try {
		session = openSession();
		String sql = CustomSQLUtil.get("DeleteTrainings");
		SQLQuery queryObject = session.createSQLQuery(sql);
		queryObject.setCacheable(false);
		int result=queryObject.executeUpdate();
		if(result>0){
			flag=true;
		}
		return flag;
	} catch (Exception e) {
		e.printStackTrace();
		return flag;
	} finally {
		closeSession(session);
	}
}
	
	public String getEmpIdFromUID(String uid){
		Session session = null;
		try {
			session = openSession();
			String sql = CustomSQLUtil.get("empidfromuid");
			SQLQuery queryObject = session.createSQLQuery(sql);
			queryObject.setCacheable(false);
			QueryPos qPos = QueryPos.getInstance(queryObject);
			qPos.add(uid);
			return  (String) queryObject.uniqueResult();
		} catch (Exception e) {
			logger.error(e.getMessage());
			return null;
		} finally {
			closeSession(session);
		}
		
	}
	
	public String getTrainingName(String trainingId){
		Session session = null;
		String trainingName="";
		try{
			session = openSession();
			String sql = CustomSQLUtil.get("gettrainingname");
            SQLQuery queryObject = session.createSQLQuery(sql);
            queryObject.setCacheable(false);
            QueryPos qPos = QueryPos.getInstance(queryObject); 
            qPos.add(trainingId);
            List<Object> list = queryObject.list();
            trainingName=list.get(0).toString();
            return trainingName;
		}catch (Exception e) {
			logger.error(e.getMessage());
			return null;
		}
		
	}
	
	public String getBusinessNames(String businessID){
		Session session = null;
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
	
	public  boolean insertIntoTrainingPPContentStore(String businessId, String[] values, String gender, String age,
			String option, long uniqueContentId, String lessthan_age, String greaterthan_age,
			String between_from_to_age, long notification_type) {

		String content_idVal = String.valueOf(uniqueContentId);
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

			businessVal = trainingcalendarLocalServiceUtil.getBusinessNames(businessId);

			if (option.equalsIgnoreCase("Unit") && age.equalsIgnoreCase("all")) {

				age_typeVal = age;
				age_Val = null;

				for (int i = 0; i < values.length; i++) {
					trainingpersonalisedparameterscontentstore ppcs =trainingpersonalisedparameterscontentstoreLocalServiceUtil
							.createtrainingpersonalisedparameterscontentstore(CounterLocalServiceUtil.increment());
					ppcs.setContent_id(Long.parseLong(content_idVal));
					ppcs.setBusiness(businessVal);
					ppcs.setUnit(values[i]);
					ppcs.setGender(genderVal);
					ppcs.setAge_type(age_typeVal);
					ppcs.setAge_value(age_Val);
					ppcs.setNotification_type(notification_typeVal);
					trainingpersonalisedparameterscontentstoreLocalServiceUtil
							.addtrainingpersonalisedparameterscontentstore(ppcs);
				}
			} else if (option.equalsIgnoreCase("Unit") && age.startsWith("Between")) {
				age_typeVal = age;
				age_Val = between_from_to_age;

				for (int i = 0; i < values.length; i++) {
					trainingpersonalisedparameterscontentstore ppcs = trainingpersonalisedparameterscontentstoreLocalServiceUtil
							.createtrainingpersonalisedparameterscontentstore(CounterLocalServiceUtil.increment());
					ppcs.setContent_id(Long.parseLong(content_idVal));
					ppcs.setBusiness(businessVal);
					ppcs.setUnit(values[i]);
					ppcs.setGender(genderVal);
					ppcs.setAge_type(age_typeVal);
					ppcs.setAge_value(age_Val);
					ppcs.setNotification_type(notification_typeVal);
					trainingpersonalisedparameterscontentstoreLocalServiceUtil
							.addtrainingpersonalisedparameterscontentstore(ppcs);
				}
			} else if (option.equalsIgnoreCase("Unit") && age.startsWith("Greater than")) {
				age_typeVal = age;
				age_Val = greaterthan_age;

				for (int i = 0; i < values.length; i++) {
					trainingpersonalisedparameterscontentstore ppcs = trainingpersonalisedparameterscontentstoreLocalServiceUtil
							.createtrainingpersonalisedparameterscontentstore(CounterLocalServiceUtil.increment());
					ppcs.setContent_id(Long.parseLong(content_idVal));
					ppcs.setBusiness(businessVal);
					ppcs.setUnit(values[i]);
					ppcs.setGender(genderVal);
					ppcs.setAge_type(age_typeVal);
					ppcs.setAge_value(age_Val);
					ppcs.setNotification_type(notification_typeVal);
					 trainingpersonalisedparameterscontentstoreLocalServiceUtil
							.addtrainingpersonalisedparameterscontentstore(ppcs);
				}
			}

			else if (option.equalsIgnoreCase("Unit") && age.startsWith("Less than")) {

				age_typeVal = age;
				age_Val = lessthan_age;

				for (int i = 0; i < values.length; i++) {
					trainingpersonalisedparameterscontentstore ppcs = trainingpersonalisedparameterscontentstoreLocalServiceUtil
							.createtrainingpersonalisedparameterscontentstore(CounterLocalServiceUtil.increment());
					ppcs.setContent_id(Long.parseLong(content_idVal));
					ppcs.setBusiness(businessVal);
					ppcs.setUnit(values[i]);
					ppcs.setGender(genderVal);
					ppcs.setAge_type(age_typeVal);
					ppcs.setAge_value(age_Val);
					ppcs.setNotification_type(notification_typeVal);
					 trainingpersonalisedparameterscontentstoreLocalServiceUtil
							.addtrainingpersonalisedparameterscontentstore(ppcs);
				}
			}

			// Intended Logic For Department

			else if (option.equalsIgnoreCase("Department") && age.equalsIgnoreCase("all")) {

				age_typeVal = age;
				age_Val = null;

				for (int i = 0; i < values.length; i++) {
					trainingpersonalisedparameterscontentstore ppcs = trainingpersonalisedparameterscontentstoreLocalServiceUtil
							.createtrainingpersonalisedparameterscontentstore(CounterLocalServiceUtil.increment());
					ppcs.setContent_id(Long.parseLong(content_idVal));
					ppcs.setBusiness(businessVal);
					ppcs.setDepartment(values[i]);
					ppcs.setGender(genderVal);
					ppcs.setAge_type(age_typeVal);
					ppcs.setAge_value(age_Val);
					ppcs.setNotification_type(notification_typeVal);
					trainingpersonalisedparameterscontentstoreLocalServiceUtil
							.addtrainingpersonalisedparameterscontentstore(ppcs);
				}
			} else if (option.equalsIgnoreCase("Department") && age.startsWith("Between")) {
				age_typeVal = age;
				age_Val = between_from_to_age;

				for (int i = 0; i < values.length; i++) {
					trainingpersonalisedparameterscontentstore ppcs = trainingpersonalisedparameterscontentstoreLocalServiceUtil
							.createtrainingpersonalisedparameterscontentstore(CounterLocalServiceUtil.increment());
					ppcs.setContent_id(Long.parseLong(content_idVal));
					ppcs.setBusiness(businessVal);
					ppcs.setDepartment(values[i]);
					ppcs.setGender(genderVal);
					ppcs.setAge_type(age_typeVal);
					ppcs.setAge_value(age_Val);
					ppcs.setNotification_type(notification_typeVal);
					 trainingpersonalisedparameterscontentstoreLocalServiceUtil
							.addtrainingpersonalisedparameterscontentstore(ppcs);
				}
			} else if (option.equalsIgnoreCase("Department") && age.startsWith("Greater than")) {
				age_typeVal = age;
				age_Val = greaterthan_age;

				for (int i = 0; i < values.length; i++) {
					trainingpersonalisedparameterscontentstore ppcs = trainingpersonalisedparameterscontentstoreLocalServiceUtil
							.createtrainingpersonalisedparameterscontentstore(CounterLocalServiceUtil.increment());
					ppcs.setContent_id(Long.parseLong(content_idVal));
					ppcs.setBusiness(businessVal);
					ppcs.setDepartment(values[i]);
					ppcs.setGender(genderVal);
					ppcs.setAge_type(age_typeVal);
					ppcs.setAge_value(age_Val);
					ppcs.setNotification_type(notification_typeVal);
					 trainingpersonalisedparameterscontentstoreLocalServiceUtil
							.addtrainingpersonalisedparameterscontentstore(ppcs);
				}
			}

			else if (option.equalsIgnoreCase("Department") && age.startsWith("Less than")) {

				age_typeVal = age;
				age_Val = lessthan_age;

				for (int i = 0; i < values.length; i++) {
					trainingpersonalisedparameterscontentstore ppcs = trainingpersonalisedparameterscontentstoreLocalServiceUtil
							.createtrainingpersonalisedparameterscontentstore(CounterLocalServiceUtil.increment());
					ppcs.setContent_id(Long.parseLong(content_idVal));
					ppcs.setBusiness(businessVal);
					ppcs.setDepartment(values[i]);
					ppcs.setGender(genderVal);
					ppcs.setAge_type(age_typeVal);
					ppcs.setAge_value(age_Val);
					ppcs.setNotification_type(notification_typeVal);
					 trainingpersonalisedparameterscontentstoreLocalServiceUtil
							.addtrainingpersonalisedparameterscontentstore(ppcs);
				}
			}

			// Intended Logic for Function

			else if (option.equalsIgnoreCase("Function") && age.equalsIgnoreCase("all")) {

				age_typeVal = age;
				age_Val = null;

				for (int i = 0; i < values.length; i++) {
					trainingpersonalisedparameterscontentstore ppcs = trainingpersonalisedparameterscontentstoreLocalServiceUtil
							.createtrainingpersonalisedparameterscontentstore(CounterLocalServiceUtil.increment());
					ppcs.setContent_id(Long.parseLong(content_idVal));
					ppcs.setBusiness(businessVal);
					ppcs.setFunction(values[i]);
					ppcs.setGender(genderVal);
					ppcs.setAge_type(age_typeVal);
					ppcs.setAge_value(age_Val);
					ppcs.setNotification_type(notification_typeVal);
					 trainingpersonalisedparameterscontentstoreLocalServiceUtil
							.addtrainingpersonalisedparameterscontentstore(ppcs);
				}
			} else if (option.equalsIgnoreCase("Function") && age.startsWith("Between")) {
				age_typeVal = age;
				age_Val = between_from_to_age;

				for (int i = 0; i < values.length; i++) {
					trainingpersonalisedparameterscontentstore ppcs = trainingpersonalisedparameterscontentstoreLocalServiceUtil
							.createtrainingpersonalisedparameterscontentstore(CounterLocalServiceUtil.increment());
					ppcs.setContent_id(Long.parseLong(content_idVal));
					ppcs.setBusiness(businessVal);
					ppcs.setFunction(values[i]);
					ppcs.setGender(genderVal);
					ppcs.setAge_type(age_typeVal);
					ppcs.setAge_value(age_Val);
					ppcs.setNotification_type(notification_typeVal);
					trainingpersonalisedparameterscontentstoreLocalServiceUtil
							.addtrainingpersonalisedparameterscontentstore(ppcs);
				}
			} else if (option.equalsIgnoreCase("Function") && age.startsWith("Greater than")) {
				age_typeVal = age;
				age_Val = greaterthan_age;

				for (int i = 0; i < values.length; i++) {
					trainingpersonalisedparameterscontentstore ppcs = trainingpersonalisedparameterscontentstoreLocalServiceUtil
							.createtrainingpersonalisedparameterscontentstore(CounterLocalServiceUtil.increment());
					ppcs.setContent_id(Long.parseLong(content_idVal));
					ppcs.setBusiness(businessVal);
					ppcs.setFunction(values[i]);
					ppcs.setGender(genderVal);
					ppcs.setAge_type(age_typeVal);
					ppcs.setAge_value(age_Val);
					ppcs.setNotification_type(notification_typeVal);
					 trainingpersonalisedparameterscontentstoreLocalServiceUtil
							.addtrainingpersonalisedparameterscontentstore(ppcs);
				}
			}

			else if (option.equalsIgnoreCase("Function") && age.startsWith("Less than")) {

				age_typeVal = age;
				age_Val = lessthan_age;

				for (int i = 0; i < values.length; i++) {
					trainingpersonalisedparameterscontentstore ppcs = trainingpersonalisedparameterscontentstoreLocalServiceUtil
							.createtrainingpersonalisedparameterscontentstore(CounterLocalServiceUtil.increment());
					ppcs.setContent_id(Long.parseLong(content_idVal));
					ppcs.setBusiness(businessVal);
					ppcs.setFunction(values[i]);
					ppcs.setGender(genderVal);
					ppcs.setAge_type(age_typeVal);
					ppcs.setAge_value(age_Val);
					ppcs.setNotification_type(notification_typeVal);
					 trainingpersonalisedparameterscontentstoreLocalServiceUtil
							.addtrainingpersonalisedparameterscontentstore(ppcs);
				}
			}

			// Intended Logic for Designation

			else if (option.equalsIgnoreCase("Designation") && age.equalsIgnoreCase("all")) {

				age_typeVal = age;
				age_Val = null;

				for (int i = 0; i < values.length; i++) {
					trainingpersonalisedparameterscontentstore ppcs = trainingpersonalisedparameterscontentstoreLocalServiceUtil
							.createtrainingpersonalisedparameterscontentstore(CounterLocalServiceUtil.increment());
					ppcs.setContent_id(Long.parseLong(content_idVal));
					ppcs.setBusiness(businessVal);
					ppcs.setDesignation(values[i]);
					ppcs.setGender(genderVal);
					ppcs.setAge_type(age_typeVal);
					ppcs.setAge_value(age_Val);
					ppcs.setNotification_type(notification_typeVal);
					 trainingpersonalisedparameterscontentstoreLocalServiceUtil
							.addtrainingpersonalisedparameterscontentstore(ppcs);
				}
			} else if (option.equalsIgnoreCase("Designation") && age.startsWith("Between")) {
				age_typeVal = age;
				age_Val = between_from_to_age;

				for (int i = 0; i < values.length; i++) {
					trainingpersonalisedparameterscontentstore ppcs = trainingpersonalisedparameterscontentstoreLocalServiceUtil
							.createtrainingpersonalisedparameterscontentstore(CounterLocalServiceUtil.increment());
					ppcs.setContent_id(Long.parseLong(content_idVal));
					ppcs.setBusiness(businessVal);
					ppcs.setDesignation(values[i]);
					ppcs.setGender(genderVal);
					ppcs.setAge_type(age_typeVal);
					ppcs.setAge_value(age_Val);
					ppcs.setNotification_type(notification_typeVal);
					 trainingpersonalisedparameterscontentstoreLocalServiceUtil
							.addtrainingpersonalisedparameterscontentstore(ppcs);
				}
			} else if (option.equalsIgnoreCase("Designation") && age.startsWith("Greater than")) {
				age_typeVal = age;
				age_Val = greaterthan_age;

				for (int i = 0; i < values.length; i++) {
					trainingpersonalisedparameterscontentstore ppcs = trainingpersonalisedparameterscontentstoreLocalServiceUtil
							.createtrainingpersonalisedparameterscontentstore(CounterLocalServiceUtil.increment());
					ppcs.setContent_id(Long.parseLong(content_idVal));
					ppcs.setBusiness(businessVal);
					ppcs.setDesignation(values[i]);
					ppcs.setGender(genderVal);
					ppcs.setAge_type(age_typeVal);
					ppcs.setAge_value(age_Val);
					ppcs.setNotification_type(notification_typeVal);
					 trainingpersonalisedparameterscontentstoreLocalServiceUtil
							.addtrainingpersonalisedparameterscontentstore(ppcs);
				}
			}

			else if (option.equalsIgnoreCase("Designation") && age.startsWith("Less than")) {

				age_typeVal = age;
				age_Val = lessthan_age;

				for (int i = 0; i < values.length; i++) {
					trainingpersonalisedparameterscontentstore ppcs = trainingpersonalisedparameterscontentstoreLocalServiceUtil
							.createtrainingpersonalisedparameterscontentstore(CounterLocalServiceUtil.increment());
					ppcs.setContent_id(Long.parseLong(content_idVal));
					ppcs.setBusiness(businessVal);
					ppcs.setDesignation(values[i]);
					ppcs.setGender(genderVal);
					ppcs.setAge_type(age_typeVal);
					ppcs.setAge_value(age_Val);
					ppcs.setNotification_type(notification_typeVal);
					 trainingpersonalisedparameterscontentstoreLocalServiceUtil
							.addtrainingpersonalisedparameterscontentstore(ppcs);
				}
			}

			// Intended Logic For Product

			else if (option.equalsIgnoreCase("Product") && age.equalsIgnoreCase("all")) {

				age_typeVal = age;
				age_Val = null;

				for (int i = 0; i < values.length; i++) {
					trainingpersonalisedparameterscontentstore ppcs = trainingpersonalisedparameterscontentstoreLocalServiceUtil
							.createtrainingpersonalisedparameterscontentstore(CounterLocalServiceUtil.increment());
					ppcs.setContent_id(Long.parseLong(content_idVal));
					ppcs.setBusiness(businessVal);
					ppcs.setProduct(values[i]);
					ppcs.setGender(genderVal);
					ppcs.setAge_type(age_typeVal);
					ppcs.setAge_value(age_Val);
					ppcs.setNotification_type(notification_typeVal);
					 trainingpersonalisedparameterscontentstoreLocalServiceUtil
							.addtrainingpersonalisedparameterscontentstore(ppcs);
				}
			} else if (option.equalsIgnoreCase("Product") && age.startsWith("Between")) {
				age_typeVal = age;
				age_Val = between_from_to_age;

				for (int i = 0; i < values.length; i++) {
					trainingpersonalisedparameterscontentstore ppcs = trainingpersonalisedparameterscontentstoreLocalServiceUtil
							.createtrainingpersonalisedparameterscontentstore(CounterLocalServiceUtil.increment());
					ppcs.setContent_id(Long.parseLong(content_idVal));
					ppcs.setBusiness(businessVal);
					ppcs.setProduct(values[i]);
					ppcs.setGender(genderVal);
					ppcs.setAge_type(age_typeVal);
					ppcs.setAge_value(age_Val);
					ppcs.setNotification_type(notification_typeVal);
					 trainingpersonalisedparameterscontentstoreLocalServiceUtil
							.addtrainingpersonalisedparameterscontentstore(ppcs);
				}
			} else if (option.equalsIgnoreCase("Product") && age.startsWith("Greater than")) {
				age_typeVal = age;
				age_Val = greaterthan_age;

				for (int i = 0; i < values.length; i++) {
					trainingpersonalisedparameterscontentstore ppcs = trainingpersonalisedparameterscontentstoreLocalServiceUtil
							.createtrainingpersonalisedparameterscontentstore(CounterLocalServiceUtil.increment());
					ppcs.setContent_id(Long.parseLong(content_idVal));
					ppcs.setBusiness(businessVal);
					ppcs.setProduct(values[i]);
					ppcs.setGender(genderVal);
					ppcs.setAge_type(age_typeVal);
					ppcs.setAge_value(age_Val);
					ppcs.setNotification_type(notification_typeVal);
					 trainingpersonalisedparameterscontentstoreLocalServiceUtil
							.addtrainingpersonalisedparameterscontentstore(ppcs);
				}
			}

			else if (option.equalsIgnoreCase("Product") && age.startsWith("Less than")) {

				age_typeVal = age;
				age_Val = lessthan_age;

				for (int i = 0; i < values.length; i++) {
					trainingpersonalisedparameterscontentstore ppcs = trainingpersonalisedparameterscontentstoreLocalServiceUtil
							.createtrainingpersonalisedparameterscontentstore(CounterLocalServiceUtil.increment());
					ppcs.setContent_id(Long.parseLong(content_idVal));
					ppcs.setBusiness(businessVal);
					ppcs.setProduct(values[i]);
					ppcs.setGender(genderVal);
					ppcs.setAge_type(age_typeVal);
					ppcs.setAge_value(age_Val);
					ppcs.setNotification_type(notification_typeVal);
					 trainingpersonalisedparameterscontentstoreLocalServiceUtil
							.addtrainingpersonalisedparameterscontentstore(ppcs);
				}
			}

			// Intended Logic For Zone

			else if (option.equalsIgnoreCase("Zone") && age.equalsIgnoreCase("all")) {

				age_typeVal = age;
				age_Val = null;

				for (int i = 0; i < values.length; i++) {
					trainingpersonalisedparameterscontentstore ppcs = trainingpersonalisedparameterscontentstoreLocalServiceUtil
							.createtrainingpersonalisedparameterscontentstore(CounterLocalServiceUtil.increment());
					ppcs.setContent_id(Long.parseLong(content_idVal));
					ppcs.setBusiness(businessVal);
					ppcs.setZone(values[i]);
					ppcs.setGender(genderVal);
					ppcs.setAge_type(age_typeVal);
					ppcs.setAge_value(age_Val);
					ppcs.setNotification_type(notification_typeVal);
					 trainingpersonalisedparameterscontentstoreLocalServiceUtil
							.addtrainingpersonalisedparameterscontentstore(ppcs);
				}
			} else if (option.equalsIgnoreCase("Zone") && age.startsWith("Between")) {
				age_typeVal = age;
				age_Val = between_from_to_age;

				for (int i = 0; i < values.length; i++) {
					trainingpersonalisedparameterscontentstore ppcs = trainingpersonalisedparameterscontentstoreLocalServiceUtil
							.createtrainingpersonalisedparameterscontentstore(CounterLocalServiceUtil.increment());
					ppcs.setContent_id(Long.parseLong(content_idVal));
					ppcs.setBusiness(businessVal);
					ppcs.setZone(values[i]);
					ppcs.setGender(genderVal);
					ppcs.setAge_type(age_typeVal);
					ppcs.setAge_value(age_Val);
					ppcs.setNotification_type(notification_typeVal);
					 trainingpersonalisedparameterscontentstoreLocalServiceUtil
							.addtrainingpersonalisedparameterscontentstore(ppcs);
				}
			} else if (option.equalsIgnoreCase("Zone") && age.startsWith("Greater than")) {
				age_typeVal = age;
				age_Val = greaterthan_age;

				for (int i = 0; i < values.length; i++) {
					trainingpersonalisedparameterscontentstore ppcs = trainingpersonalisedparameterscontentstoreLocalServiceUtil
							.createtrainingpersonalisedparameterscontentstore(CounterLocalServiceUtil.increment());
					ppcs.setContent_id(Long.parseLong(content_idVal));
					ppcs.setBusiness(businessVal);
					ppcs.setZone(values[i]);
					ppcs.setGender(genderVal);
					ppcs.setAge_type(age_typeVal);
					ppcs.setAge_value(age_Val);
					ppcs.setNotification_type(notification_typeVal);
					 trainingpersonalisedparameterscontentstoreLocalServiceUtil
							.addtrainingpersonalisedparameterscontentstore(ppcs);
				}
			}

			else if (option.equalsIgnoreCase("Zone") && age.startsWith("Less than")) {

				age_typeVal = age;
				age_Val = lessthan_age;

				for (int i = 0; i < values.length; i++) {
					trainingpersonalisedparameterscontentstore ppcs = trainingpersonalisedparameterscontentstoreLocalServiceUtil
							.createtrainingpersonalisedparameterscontentstore(CounterLocalServiceUtil.increment());
					ppcs.setContent_id(Long.parseLong(content_idVal));
					ppcs.setBusiness(businessVal);
					ppcs.setZone(values[i]);
					ppcs.setGender(genderVal);
					ppcs.setAge_type(age_typeVal);
					ppcs.setAge_value(age_Val);
					ppcs.setNotification_type(notification_typeVal);
					 trainingpersonalisedparameterscontentstoreLocalServiceUtil
							.addtrainingpersonalisedparameterscontentstore(ppcs);
				}
			}

			// Intended Logic For Branch

			else if (option.equalsIgnoreCase("Branch") && age.equalsIgnoreCase("all")) {

				age_typeVal = age;
				age_Val = null;

				for (int i = 0; i < values.length; i++) {
					trainingpersonalisedparameterscontentstore ppcs = trainingpersonalisedparameterscontentstoreLocalServiceUtil
							.createtrainingpersonalisedparameterscontentstore(CounterLocalServiceUtil.increment());
					ppcs.setContent_id(Long.parseLong(content_idVal));
					ppcs.setBusiness(businessVal);
					ppcs.setBranch(values[i]);
					ppcs.setGender(genderVal);
					ppcs.setAge_type(age_typeVal);
					ppcs.setAge_value(age_Val);
					ppcs.setNotification_type(notification_typeVal);
					 trainingpersonalisedparameterscontentstoreLocalServiceUtil
							.addtrainingpersonalisedparameterscontentstore(ppcs);
				}
			} else if (option.equalsIgnoreCase("Branch") && age.startsWith("Between")) {
				age_typeVal = age;
				age_Val = between_from_to_age;

				for (int i = 0; i < values.length; i++) {
					trainingpersonalisedparameterscontentstore ppcs = trainingpersonalisedparameterscontentstoreLocalServiceUtil
							.createtrainingpersonalisedparameterscontentstore(CounterLocalServiceUtil.increment());
					ppcs.setContent_id(Long.parseLong(content_idVal));
					ppcs.setBusiness(businessVal);
					ppcs.setBranch(values[i]);
					ppcs.setGender(genderVal);
					ppcs.setAge_type(age_typeVal);
					ppcs.setAge_value(age_Val);
					ppcs.setNotification_type(notification_typeVal);
					 trainingpersonalisedparameterscontentstoreLocalServiceUtil
							.addtrainingpersonalisedparameterscontentstore(ppcs);
				}
			} else if (option.equalsIgnoreCase("Branch") && age.startsWith("Greater than")) {
				age_typeVal = age;
				age_Val = greaterthan_age;

				for (int i = 0; i < values.length; i++) {
					trainingpersonalisedparameterscontentstore ppcs = trainingpersonalisedparameterscontentstoreLocalServiceUtil
							.createtrainingpersonalisedparameterscontentstore(CounterLocalServiceUtil.increment());
					ppcs.setContent_id(Long.parseLong(content_idVal));
					ppcs.setBusiness(businessVal);
					ppcs.setBranch(values[i]);
					ppcs.setGender(genderVal);
					ppcs.setAge_type(age_typeVal);
					ppcs.setAge_value(age_Val);
					ppcs.setNotification_type(notification_typeVal);
					 trainingpersonalisedparameterscontentstoreLocalServiceUtil
							.addtrainingpersonalisedparameterscontentstore(ppcs);
				}
			}

			else if (option.equalsIgnoreCase("Branch") && age.startsWith("Less than")) {

				age_typeVal = age;
				age_Val = lessthan_age;

				for (int i = 0; i < values.length; i++) {
					trainingpersonalisedparameterscontentstore ppcs = trainingpersonalisedparameterscontentstoreLocalServiceUtil
							.createtrainingpersonalisedparameterscontentstore(CounterLocalServiceUtil.increment());
					ppcs.setContent_id(Long.parseLong(content_idVal));
					ppcs.setBusiness(businessVal);
					ppcs.setBranch(values[i]);
					ppcs.setGender(genderVal);
					ppcs.setAge_type(age_typeVal);
					ppcs.setAge_value(age_Val);
					ppcs.setNotification_type(notification_typeVal);
					 trainingpersonalisedparameterscontentstoreLocalServiceUtil
							.addtrainingpersonalisedparameterscontentstore(ppcs);
				}
			}

			// Intended Logic For Grade

			else if (option.equalsIgnoreCase("Grade") && age.equalsIgnoreCase("all")) {

				age_typeVal = age;
				age_Val = null;

				for (int i = 0; i < values.length; i++) {
					trainingpersonalisedparameterscontentstore ppcs = trainingpersonalisedparameterscontentstoreLocalServiceUtil
							.createtrainingpersonalisedparameterscontentstore(CounterLocalServiceUtil.increment());
					ppcs.setContent_id(Long.parseLong(content_idVal));
					ppcs.setBusiness(businessVal);
					ppcs.setGrade(values[i]);
					ppcs.setGender(genderVal);
					ppcs.setAge_type(age_typeVal);
					ppcs.setAge_value(age_Val);
					ppcs.setNotification_type(notification_typeVal);
					 trainingpersonalisedparameterscontentstoreLocalServiceUtil
							.addtrainingpersonalisedparameterscontentstore(ppcs);
				}
			} else if (option.equalsIgnoreCase("Grade") && age.startsWith("Between")) {
				age_typeVal = age;
				age_Val = between_from_to_age;

				for (int i = 0; i < values.length; i++) {
					trainingpersonalisedparameterscontentstore ppcs = trainingpersonalisedparameterscontentstoreLocalServiceUtil
							.createtrainingpersonalisedparameterscontentstore(CounterLocalServiceUtil.increment());
					ppcs.setContent_id(Long.parseLong(content_idVal));
					ppcs.setBusiness(businessVal);
					ppcs.setGrade(values[i]);
					ppcs.setGender(genderVal);
					ppcs.setAge_type(age_typeVal);
					ppcs.setAge_value(age_Val);
					ppcs.setNotification_type(notification_typeVal);
					 trainingpersonalisedparameterscontentstoreLocalServiceUtil
							.addtrainingpersonalisedparameterscontentstore(ppcs);
				}
			} else if (option.equalsIgnoreCase("Grade") && age.startsWith("Greater than")) {
				age_typeVal = age;
				age_Val = greaterthan_age;

				for (int i = 0; i < values.length; i++) {
					trainingpersonalisedparameterscontentstore ppcs = trainingpersonalisedparameterscontentstoreLocalServiceUtil
							.createtrainingpersonalisedparameterscontentstore(CounterLocalServiceUtil.increment());
					ppcs.setContent_id(Long.parseLong(content_idVal));
					ppcs.setBusiness(businessVal);
					ppcs.setGrade(values[i]);
					ppcs.setGender(genderVal);
					ppcs.setAge_type(age_typeVal);
					ppcs.setAge_value(age_Val);
					ppcs.setNotification_type(notification_typeVal);
					 trainingpersonalisedparameterscontentstoreLocalServiceUtil
							.addtrainingpersonalisedparameterscontentstore(ppcs);
				}
			}

			else if (option.equalsIgnoreCase("Grade") && age.startsWith("Less than")) {

				age_typeVal = age;
				age_Val = lessthan_age;

				for (int i = 0; i < values.length; i++) {
					trainingpersonalisedparameterscontentstore ppcs = trainingpersonalisedparameterscontentstoreLocalServiceUtil
							.createtrainingpersonalisedparameterscontentstore(CounterLocalServiceUtil.increment());
					ppcs.setContent_id(Long.parseLong(content_idVal));
					ppcs.setBusiness(businessVal);
					ppcs.setGrade(values[i]);
					ppcs.setGender(genderVal);
					ppcs.setAge_type(age_typeVal);
					ppcs.setAge_value(age_Val);
					ppcs.setNotification_type(notification_typeVal);
					 trainingpersonalisedparameterscontentstoreLocalServiceUtil
							.addtrainingpersonalisedparameterscontentstore(ppcs);
				}
			}

			// Intended Logic For Region

			else if (option.equalsIgnoreCase("Region") && age.equalsIgnoreCase("all")) {

				age_typeVal = age;
				age_Val = null;

				for (int i = 0; i < values.length; i++) {
					trainingpersonalisedparameterscontentstore ppcs = trainingpersonalisedparameterscontentstoreLocalServiceUtil
							.createtrainingpersonalisedparameterscontentstore(CounterLocalServiceUtil.increment());
					ppcs.setContent_id(Long.parseLong(content_idVal));
					ppcs.setBusiness(businessVal);
					ppcs.setRegion(values[i]);
					ppcs.setGender(genderVal);
					ppcs.setAge_type(age_typeVal);
					ppcs.setAge_value(age_Val);
					ppcs.setNotification_type(notification_typeVal);
					 trainingpersonalisedparameterscontentstoreLocalServiceUtil
							.addtrainingpersonalisedparameterscontentstore(ppcs);
				}
			} else if (option.equalsIgnoreCase("Region") && age.startsWith("Between")) {
				age_typeVal = age;
				age_Val = between_from_to_age;

				for (int i = 0; i < values.length; i++) {
					trainingpersonalisedparameterscontentstore ppcs = trainingpersonalisedparameterscontentstoreLocalServiceUtil
							.createtrainingpersonalisedparameterscontentstore(CounterLocalServiceUtil.increment());
					ppcs.setContent_id(Long.parseLong(content_idVal));
					ppcs.setBusiness(businessVal);
					ppcs.setRegion(values[i]);
					ppcs.setGender(genderVal);
					ppcs.setAge_type(age_typeVal);
					ppcs.setAge_value(age_Val);
					ppcs.setNotification_type(notification_typeVal);
					 trainingpersonalisedparameterscontentstoreLocalServiceUtil
							.addtrainingpersonalisedparameterscontentstore(ppcs);
				}
			} else if (option.equalsIgnoreCase("Region") && age.startsWith("Greater than")) {
				age_typeVal = age;
				age_Val = greaterthan_age;

				for (int i = 0; i < values.length; i++) {
					trainingpersonalisedparameterscontentstore ppcs = trainingpersonalisedparameterscontentstoreLocalServiceUtil
							.createtrainingpersonalisedparameterscontentstore(CounterLocalServiceUtil.increment());
					ppcs.setContent_id(Long.parseLong(content_idVal));
					ppcs.setBusiness(businessVal);
					ppcs.setRegion(values[i]);
					ppcs.setGender(genderVal);
					ppcs.setAge_type(age_typeVal);
					ppcs.setAge_value(age_Val);
					ppcs.setNotification_type(notification_typeVal);
					 trainingpersonalisedparameterscontentstoreLocalServiceUtil
							.addtrainingpersonalisedparameterscontentstore(ppcs);
				}
			}

			else if (option.equalsIgnoreCase("Region") && age.startsWith("Less than")) {

				age_typeVal = age;
				age_Val = lessthan_age;

				for (int i = 0; i < values.length; i++) {
					trainingpersonalisedparameterscontentstore ppcs = trainingpersonalisedparameterscontentstoreLocalServiceUtil
							.createtrainingpersonalisedparameterscontentstore(CounterLocalServiceUtil.increment());
					ppcs.setContent_id(Long.parseLong(content_idVal));
					ppcs.setBusiness(businessVal);
					ppcs.setRegion(values[i]);
					ppcs.setGender(genderVal);
					ppcs.setAge_type(age_typeVal);
					ppcs.setAge_value(age_Val);
					ppcs.setNotification_type(notification_typeVal);
					 trainingpersonalisedparameterscontentstoreLocalServiceUtil
							.addtrainingpersonalisedparameterscontentstore(ppcs);
				}
			}

			// Intended Logic For Location

			else if (option.equalsIgnoreCase("Location") && age.equalsIgnoreCase("all")) {

				age_typeVal = age;
				age_Val = null;

				for (int i = 0; i < values.length; i++) {
					trainingpersonalisedparameterscontentstore ppcs = trainingpersonalisedparameterscontentstoreLocalServiceUtil
							.createtrainingpersonalisedparameterscontentstore(CounterLocalServiceUtil.increment());
					ppcs.setContent_id(Long.parseLong(content_idVal));
					ppcs.setBusiness(businessVal);
					ppcs.setLocation(values[i]);
					ppcs.setGender(genderVal);
					ppcs.setAge_type(age_typeVal);
					ppcs.setAge_value(age_Val);
					ppcs.setNotification_type(notification_typeVal);
					 trainingpersonalisedparameterscontentstoreLocalServiceUtil
							.addtrainingpersonalisedparameterscontentstore(ppcs);
				}
			} else if (option.equalsIgnoreCase("Location") && age.startsWith("Between")) {
				age_typeVal = age;
				age_Val = between_from_to_age;

				for (int i = 0; i < values.length; i++) {
					trainingpersonalisedparameterscontentstore ppcs = trainingpersonalisedparameterscontentstoreLocalServiceUtil
							.createtrainingpersonalisedparameterscontentstore(CounterLocalServiceUtil.increment());
					ppcs.setContent_id(Long.parseLong(content_idVal));
					ppcs.setBusiness(businessVal);
					ppcs.setLocation(values[i]);
					ppcs.setGender(genderVal);
					ppcs.setAge_type(age_typeVal);
					ppcs.setAge_value(age_Val);
					ppcs.setNotification_type(notification_typeVal);
					 trainingpersonalisedparameterscontentstoreLocalServiceUtil
							.addtrainingpersonalisedparameterscontentstore(ppcs);
				}
			} else if (option.equalsIgnoreCase("Location") && age.startsWith("Greater than")) {
				age_typeVal = age;
				age_Val = greaterthan_age;

				for (int i = 0; i < values.length; i++) {
					trainingpersonalisedparameterscontentstore ppcs = trainingpersonalisedparameterscontentstoreLocalServiceUtil
							.createtrainingpersonalisedparameterscontentstore(CounterLocalServiceUtil.increment());
					ppcs.setContent_id(Long.parseLong(content_idVal));
					ppcs.setBusiness(businessVal);
					ppcs.setLocation(values[i]);
					ppcs.setGender(genderVal);
					ppcs.setAge_type(age_typeVal);
					ppcs.setAge_value(age_Val);
					ppcs.setNotification_type(notification_typeVal);
					 trainingpersonalisedparameterscontentstoreLocalServiceUtil
							.addtrainingpersonalisedparameterscontentstore(ppcs);
				}
			}

			else if (option.equalsIgnoreCase("Location") && age.startsWith("Less than")) {

				age_typeVal = age;
				age_Val = lessthan_age;

				for (int i = 0; i < values.length; i++) {
					trainingpersonalisedparameterscontentstore ppcs = trainingpersonalisedparameterscontentstoreLocalServiceUtil
							.createtrainingpersonalisedparameterscontentstore(CounterLocalServiceUtil.increment());
					ppcs.setContent_id(Long.parseLong(content_idVal));
					ppcs.setBusiness(businessVal);
					ppcs.setLocation(values[i]);
					ppcs.setGender(genderVal);
					ppcs.setAge_type(age_typeVal);
					ppcs.setAge_value(age_Val);
					ppcs.setNotification_type(notification_typeVal);
					 trainingpersonalisedparameterscontentstoreLocalServiceUtil
							.addtrainingpersonalisedparameterscontentstore(ppcs);
				}
			}

			// Intended Logic for UserId

			else if (option.equalsIgnoreCase("User ID")) {

				for (int i = 0; i < values.length; i++) {
					trainingpersonalisedparameterscontentstore ppcs = trainingpersonalisedparameterscontentstoreLocalServiceUtil
							.createtrainingpersonalisedparameterscontentstore(CounterLocalServiceUtil.increment());
					ppcs.setContent_id(Long.parseLong(content_idVal));
					ppcs.setBusiness(businessVal);
					ppcs.setUser_id(values[i]);
					ppcs.setGender(genderVal);
					ppcs.setAge_type(age_typeVal);
					ppcs.setAge_value(age_Val);
					ppcs.setNotification_type(notification_typeVal);
					 trainingpersonalisedparameterscontentstoreLocalServiceUtil
							.addtrainingpersonalisedparameterscontentstore(ppcs);
				}
			}

			// Inteded logic for All User

			else if (option.equalsIgnoreCase("All User") && age.equalsIgnoreCase("all")) {
				age_typeVal = age;
				age_Val = null;
				trainingpersonalisedparameterscontentstore ppcs = trainingpersonalisedparameterscontentstoreLocalServiceUtil
						.createtrainingpersonalisedparameterscontentstore(CounterLocalServiceUtil.increment());
				ppcs.setContent_id(Long.parseLong(content_idVal));
				ppcs.setBusiness(businessVal);
				ppcs.setGender(genderVal);
				ppcs.setAge_type(age_typeVal);
				ppcs.setAge_value(age_Val);
				ppcs.setNotification_type(notification_typeVal);
				 trainingpersonalisedparameterscontentstoreLocalServiceUtil
						.addtrainingpersonalisedparameterscontentstore(ppcs);

			} else if (option.equalsIgnoreCase("All User") && age.startsWith("Between")) {
				age_typeVal = age;
				age_Val = between_from_to_age;
				trainingpersonalisedparameterscontentstore ppcs = trainingpersonalisedparameterscontentstoreLocalServiceUtil
						.createtrainingpersonalisedparameterscontentstore(CounterLocalServiceUtil.increment());
				ppcs.setContent_id(Long.parseLong(content_idVal));
				ppcs.setBusiness(businessVal);
				ppcs.setGender(genderVal);
				ppcs.setAge_type(age_typeVal);
				ppcs.setAge_value(age_Val);
				ppcs.setNotification_type(notification_typeVal);
				 trainingpersonalisedparameterscontentstoreLocalServiceUtil
						.addtrainingpersonalisedparameterscontentstore(ppcs);


			} else if (option.equalsIgnoreCase("All User") && age.startsWith("Greater than")) {
				age_typeVal = age;
				age_Val = greaterthan_age;

				trainingpersonalisedparameterscontentstore ppcs = trainingpersonalisedparameterscontentstoreLocalServiceUtil
						.createtrainingpersonalisedparameterscontentstore(CounterLocalServiceUtil.increment());
				ppcs.setContent_id(Long.parseLong(content_idVal));
				ppcs.setBusiness(businessVal);
				ppcs.setGender(genderVal);
				ppcs.setAge_type(age_typeVal);
				ppcs.setAge_value(age_Val);
				ppcs.setNotification_type(notification_typeVal);
				 trainingpersonalisedparameterscontentstoreLocalServiceUtil
						.addtrainingpersonalisedparameterscontentstore(ppcs);


			} else if (option.equalsIgnoreCase("All User") && age.startsWith("Less than")) {
				age_typeVal = age;
				age_Val = lessthan_age;
				trainingpersonalisedparameterscontentstore ppcs = trainingpersonalisedparameterscontentstoreLocalServiceUtil
						.createtrainingpersonalisedparameterscontentstore(CounterLocalServiceUtil.increment());
				ppcs.setContent_id(Long.parseLong(content_idVal));
				ppcs.setBusiness(businessVal);
				ppcs.setGender(genderVal);
				ppcs.setAge_type(age_typeVal);
				ppcs.setAge_value(age_Val);
				ppcs.setNotification_type(notification_typeVal);
				 trainingpersonalisedparameterscontentstoreLocalServiceUtil
						.addtrainingpersonalisedparameterscontentstore(ppcs);

			}
			return true;
		} catch (Exception e) {
			logger.info(e.getMessage());
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
	
	
	public List<Object[]> getTrainingList(){
		boolean flag = false;
		Session session = null;
		try {
			session = openSession();
			String sql = CustomSQLUtil.get("trainingList");
			SQLQuery queryObject = session.createSQLQuery(sql);
			queryObject.setCacheable(false);
			QueryPos qPos = QueryPos.getInstance(queryObject);
		
			
			return (List<Object[]>) queryObject.list();
		} catch (Exception e) {
			logger.error(e.getMessage());
		} finally {
			closeSession(session);
		}
		return null;
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
			
			if(gender.equalsIgnoreCase("both"))
			{
				gender=null;
			}
			
			if(option.equalsIgnoreCase("Unit") && age.startsWith("Between"))
			{
				logger.info("intendeduserlist_Between");
				
				
				String[] ageValues = age.split(" ");
				
				
				String ageFrom=ageValues[1];
				
				String ageTo=ageValues[3];
				
				querylist="intendeduserlist_between_unit";
				String sql=CustomSQLUtil.get(querylist);
				sql = StringUtil.replace(sql, "[$unitdata$]", newValue);
				query = session.createSQLQuery(sql);
				QueryPos pos = QueryPos.getInstance(query);
				
					pos.add(gender);
				
				pos.add(ageFrom);
				pos.add(ageTo);
				
				List<Object[]> list = query.list();
			    
				logger.info("List size....." + list.size());
				return query.list();
				
			}
			else if(option.equalsIgnoreCase("Unit") && age.equalsIgnoreCase("all"))
			{
				age=null;
				querylist="intendeduserlist_all_unit";
				logger.info("intendeduserlist_all_unit");
				String sql=CustomSQLUtil.get(querylist);
				
				sql = StringUtil.replace(sql, "[$unitdata$]", newValue);
				query = session.createSQLQuery(sql);
				QueryPos pos = QueryPos.getInstance(query);
			
					pos.add(gender);
			
				
				List<Object[]> list = query.list();
			    
				logger.info("List size....." + list.size());
				return query.list();

			}
			else if(option.equalsIgnoreCase("Unit") && age.startsWith("Less than"))
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
			    
				logger.info("List size....." + list.size());
				return query.list();
				
			}
			else if(option.equalsIgnoreCase("Unit") && age.startsWith("Greater than"))
			{
				age=age.substring(age.lastIndexOf(" ") + 1);
				logger.info("age : "+age);
				querylist="intendeduserlist_greaterthan_unit";
				logger.info("intendeduserlist_greaterthan_unit");
				String sql=CustomSQLUtil.get(querylist);
				
				sql = StringUtil.replace(sql, "[$unitdata$]", newValue);
				query = session.createSQLQuery(sql);
				QueryPos pos = QueryPos.getInstance(query);
				
					pos.add(gender);
				
				pos.add(age);
				List<Object[]> list = query.list();
			    
				logger.info("List size....." + list.size());
				return query.list();
			}

			else if (option.equalsIgnoreCase("Department") && age.equalsIgnoreCase("all")) {

				age=null;
				querylist="intendeduserlist_all_department";
				logger.info("intendeduserlist_all_department");
				String sql=CustomSQLUtil.get(querylist);
				
				sql = StringUtil.replace(sql, "[$departmentdata$]", newValue);
				query = session.createSQLQuery(sql);
				QueryPos pos = QueryPos.getInstance(query);
				
					pos.add(gender);
				
				
				
				List<Object[]> list = query.list();
			    
				logger.info("List size....." + list.size());
				return query.list();

				
				
			} else if (option.equalsIgnoreCase("Department") && age.startsWith("Between")) {
				
				
				String[] ageValues = age.split(" ");
				String ageFrom=ageValues[1];
				
				String ageTo=ageValues[3];
				
				querylist="intendeduserlist_between_department";
				String sql=CustomSQLUtil.get(querylist);
				sql = StringUtil.replace(sql, "[$departmentdata$]", newValue);
				query = session.createSQLQuery(sql);
				QueryPos pos = QueryPos.getInstance(query);
				
					pos.add(gender);
				
				pos.add(ageFrom);
				pos.add(ageTo);
				
				List<Object[]> list = query.list();
			    
				logger.info("List size....." + list.size());
				return query.list();
				
				
			} else if (option.equalsIgnoreCase("Department") && age.startsWith("Greater than")) {

				age=age.substring(age.lastIndexOf(" ") + 1);
				logger.info("age : "+age);
				querylist="intendeduserlist_greaterthan_department";
				logger.info("intendeduserlist_greaterthan_department");
				String sql=CustomSQLUtil.get(querylist);
				
				sql = StringUtil.replace(sql, "[$departmentdata$]", newValue);
				query = session.createSQLQuery(sql);
				QueryPos pos = QueryPos.getInstance(query);
			
					pos.add(gender);
				
				pos.add(age);
				List<Object[]> list = query.list();
			    
				logger.info("List size....." + list.size());
				return query.list();
				
			} else if (option.equalsIgnoreCase("Department") && age.startsWith("Less than")) {

				
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
			    
				logger.info("List size....." + list.size());
				return query.list();
			}
			
			
			else if (option.equalsIgnoreCase("Function") && age.equalsIgnoreCase("all")) {

				age=null;
				querylist="intendeduserlist_all_function";
				logger.info("intendeduserlist_all_function");
				String sql=CustomSQLUtil.get(querylist);
				
				sql = StringUtil.replace(sql, "[$functiondata$]", newValue);
				query = session.createSQLQuery(sql);
				QueryPos pos = QueryPos.getInstance(query);
				
					pos.add(gender);
				
				
				
				List<Object[]> list = query.list();
			    
				logger.info("List size....." + list.size());
				return query.list();

				
				
			} 
			else if (option.equalsIgnoreCase("Function") && age.startsWith("Between")) {
				
				
				String[] ageValues = age.split(" ");
				String ageFrom=ageValues[1];
				
				String ageTo=ageValues[3];
				
				querylist="intendeduserlist_between_function";
				String sql=CustomSQLUtil.get(querylist);
				sql = StringUtil.replace(sql, "[$functiondata$]", newValue);
				query = session.createSQLQuery(sql);
				QueryPos pos = QueryPos.getInstance(query);
			
					pos.add(gender);
				
				pos.add(ageFrom);
				pos.add(ageTo);
				
				List<Object[]> list = query.list();
			    
				logger.info("List size....." + list.size());
				return query.list();
				
				
			} else if (option.equalsIgnoreCase("Function") && age.startsWith("Greater than")) {

				age=age.substring(age.lastIndexOf(" ") + 1);
				logger.info("age : "+age);
				querylist="intendeduserlist_greaterthan_function";
				logger.info("intendeduserlist_greaterthan_function");
				String sql=CustomSQLUtil.get(querylist);
				
				sql = StringUtil.replace(sql, "[$functiondata$]", newValue);
				query = session.createSQLQuery(sql);
				QueryPos pos = QueryPos.getInstance(query);
			
					pos.add(gender);
				
				pos.add(age);
				List<Object[]> list = query.list();
			    
				logger.info("List size....." + list.size());
				return query.list();
				
			} else if (option.equalsIgnoreCase("Function") && age.startsWith("Less than")) {

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
			    
				logger.info("List size....." + list.size());
				return query.list();
			}
			
			
			
			//Intended User List for Designation From activeemployeeinfo
			
			else if (option.equalsIgnoreCase("Designation") && age.equalsIgnoreCase("all")) {
				age=null;
				querylist="intendeduserlist_all_designation";
				logger.info("intendeduserlist_all_designation");
				String sql=CustomSQLUtil.get(querylist);
				
				sql = StringUtil.replace(sql, "[$designationdata$]", newValue);
				query = session.createSQLQuery(sql);
				QueryPos pos = QueryPos.getInstance(query);
			
					pos.add(gender);
				
				
				List<Object[]> list = query.list();
			    
				logger.info("List size....." + list.size());
				return query.list();
				
			}
			else if (option.equalsIgnoreCase("Designation") && age.startsWith("Between")) {
				
				
				String[] ageValues = age.split(" ");
				String ageFrom=ageValues[1];
				
				String ageTo=ageValues[3];
				
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
			else if (option.equalsIgnoreCase("Designation") && age.startsWith("Greater than")) {
				
				age=age.substring(age.lastIndexOf(" ") + 1);
				logger.info("age : "+age);
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
			else if (option.equalsIgnoreCase("Designation") && age.startsWith("Less than")) {
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
			
			else if (option.equalsIgnoreCase("Product") && age.equalsIgnoreCase("all")) {
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
			else if (option.equalsIgnoreCase("Product") && age.startsWith("Between")) {
				
				String[] ageValues = age.split(" ");
				String ageFrom=ageValues[1];
				
				String ageTo=ageValues[3];
				
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
			else if (option.equalsIgnoreCase("Product") && age.startsWith("Greater than")) {
				age=age.substring(age.lastIndexOf(" ") + 1);
				logger.info("age : "+age);
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
			else if (option.equalsIgnoreCase("Product") && age.startsWith("Less than")) {
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
			    
				logger.info("List size....." + list.size());
				return query.list();
			}
			
			//Intended User List for Zone From activeemployeeinfo
			
			else if (option.equalsIgnoreCase("Zone") && age.equalsIgnoreCase("all")) {
				age=null;
				querylist="intendeduserlist_all_zone";
				logger.info("intendeduserlist_all_zone");
				String sql=CustomSQLUtil.get(querylist);
				
				sql = StringUtil.replace(sql, "[$zonedata$]", newValue);
				query = session.createSQLQuery(sql);
				QueryPos pos = QueryPos.getInstance(query);
				
				
					pos.add(gender);
				
				
				List<Object[]> list = query.list();
			    
				logger.info("List size....." + list.size());
				return query.list();
			}
			else if (option.equalsIgnoreCase("Zone") && age.startsWith("Between")) {
				
				String[] ageValues = age.split(" ");
				String ageFrom=ageValues[1];
				
				String ageTo=ageValues[3];
				
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
			else if (option.equalsIgnoreCase("Zone") && age.startsWith("Greater than")) {
				age=age.substring(age.lastIndexOf(" ") + 1);
				logger.info("age : "+age);
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
			else if (option.equalsIgnoreCase("Zone") && age.startsWith("Less than")) {
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
			
			
			else if (option.equalsIgnoreCase("Branch") && age.equalsIgnoreCase("all")) {
				age=null;
				querylist="intendeduserlist_all_branch";
				logger.info("intendeduserlist_all_branch");
				String sql=CustomSQLUtil.get(querylist);
				
				sql = StringUtil.replace(sql, "[$branchdata$]", newValue);
				query = session.createSQLQuery(sql);
				QueryPos pos = QueryPos.getInstance(query);
				
			
					pos.add(gender);
				
				
				List<Object[]> list = query.list();
			    
				logger.info("List size....." + list.size());
				return query.list();
			}
			else if (option.equalsIgnoreCase("Branch") && age.startsWith("Between")) {
				
				String[] ageValues = age.split(" ");
				String ageFrom=ageValues[1];
				
				String ageTo=ageValues[3];
				
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
			    
				logger.info("List size....." + list.size());
				return query.list();
			}
			else if (option.equalsIgnoreCase("Branch") && age.startsWith("Greater than")) {
				age=age.substring(age.lastIndexOf(" ") + 1);
				logger.info("age : "+age);
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
			else if (option.equalsIgnoreCase("Branch") && age.startsWith("Less than")) {
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
			
			
			else if (option.equalsIgnoreCase("Grade") && age.equalsIgnoreCase("all")) {
				age=null;
				querylist="intendeduserlist_all_grade";
				logger.info("intendeduserlist_all_grade");
				String sql=CustomSQLUtil.get(querylist);
				
				sql = StringUtil.replace(sql, "[$gradedata$]", newValue);
				query = session.createSQLQuery(sql);
				QueryPos pos = QueryPos.getInstance(query);
				
				
					pos.add(gender);
				
				
				List<Object[]> list = query.list();
			    
				logger.info("List size....." + list.size());
				return query.list();
			}
			else if (option.equalsIgnoreCase("Grade") && age.startsWith("Between")) {
				
				String[] ageValues = age.split(" ");
				String ageFrom=ageValues[1];
				
				String ageTo=ageValues[3];
				
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
			else if (option.equalsIgnoreCase("Grade") && age.startsWith("Greater than")) {
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
			else if (option.equalsIgnoreCase("Grade") && age.startsWith("Less than")) {
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
			
			
			else if (option.equalsIgnoreCase("Region") && age.equalsIgnoreCase("all")) {
				age=null;
				querylist="intendeduserlist_all_region";
				logger.info("intendeduserlist_all_region");
				String sql=CustomSQLUtil.get(querylist);
				
				sql = StringUtil.replace(sql, "[$regiondata$]", newValue);
				query = session.createSQLQuery(sql);
				QueryPos pos = QueryPos.getInstance(query);
				
			
					pos.add(gender);
				
				
				List<Object[]> list = query.list();
			    
				logger.info("List size....." + list.size());
				return query.list();
			}
			else if (option.equalsIgnoreCase("Region") && age.startsWith("Between")) {
				
				String[] ageValues = age.split(" ");
				String ageFrom=ageValues[1];
				
				String ageTo=ageValues[3];
				
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
			else if (option.equalsIgnoreCase("Region") && age.startsWith("Greater than")) {
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
			else if (option.equalsIgnoreCase("Region") && age.startsWith("Less than")) {
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
			
			else if (option.equalsIgnoreCase("Location") && age.equalsIgnoreCase("all")) {
				age=null;
				querylist="intendeduserlist_all_location";
				logger.info("intendeduserlist_all_location");
				String sql=CustomSQLUtil.get(querylist);
				
				sql = StringUtil.replace(sql, "[$locationdata$]", newValue);
				query = session.createSQLQuery(sql);
				QueryPos pos = QueryPos.getInstance(query);
				
				
					pos.add(gender);
				
				
				List<Object[]> list = query.list();
			    
				logger.info("List size....." + list.size());
				return query.list();
			}
			else if (option.equalsIgnoreCase("Location") && age.startsWith("Between")) {
				
				String[] ageValues = age.split(" ");
				String ageFrom=ageValues[1];
				
				String ageTo=ageValues[3];
				
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
			else if (option.equalsIgnoreCase("Location") && age.startsWith("Greater than")) {
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
			else if (option.equalsIgnoreCase("Location") && age.startsWith("Less than")) {
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
	
	
	
	public List<Object[]> getIntendedUserList(String location,String companyName){
		boolean flag = false;
		Session session = null;
		try {
			session = openSession();
			String sql = CustomSQLUtil.get("intendedUserList");
			SQLQuery queryObject = session.createSQLQuery(sql);
			queryObject.setCacheable(false);
			QueryPos qPos = QueryPos.getInstance(queryObject);
		
			qPos.add(location);
			qPos.add(companyName);
			return (List<Object[]>) queryObject.list();
		} catch (Exception e) {
			logger.error(e.getMessage());
		} finally {
			closeSession(session);
		}
		return null;
	}
	
	public boolean insertExtraNotifyStts(int syscode, int val, String sysname, int stts, int sttsflag,long usernotifyId) {
		boolean flag = false;
		Session session = null;
		try {
			session = openSession();
			String sql = CustomSQLUtil.get("notifycat");
			SQLQuery queryObject = session.createSQLQuery(sql);
			queryObject.setCacheable(false);
			QueryPos qPos = QueryPos.getInstance(queryObject);
			qPos.add(syscode);
			qPos.add(val);
			qPos.add(sysname);
			qPos.add(stts);
			qPos.add(sttsflag);
			qPos.add(usernotifyId);
			int i = queryObject.executeUpdate();
			
			if (i != 0) {
				flag = true;
			}
			
			return flag;
		} catch (Exception e) {
			logger.error(e.getMessage());
		} finally {
			closeSession(session);
		}
		return flag;
	}
	
	
	public List<Object[]> getIntendedUserTrainingList(String screenName){
		Session session = null;
		try {
			session = openSession();
			String sql = CustomSQLUtil.get("intendedUserTrainingList");
			SQLQuery queryObject = session.createSQLQuery(sql);
			queryObject.setCacheable(false);
			QueryPos qPos = QueryPos.getInstance(queryObject);
		
			qPos.add(screenName);
			qPos.add(0);
			
			return (List<Object[]>) queryObject.list();
		} catch (Exception e) {
			logger.error(e.getMessage());
		} finally {
			closeSession(session);
		}
		return null;
	}
	
 //Training record Fetch....for a intended user	
	public Object[] getIntendedUserTrainingRecordList(long id){
		Session session = null;
		try {
			session = openSession();
			String sql = CustomSQLUtil.get("trainingListintendedRecord");
			SQLQuery queryObject = session.createSQLQuery(sql);
			queryObject.setCacheable(false);
			QueryPos qPos = QueryPos.getInstance(queryObject);
		
			qPos.add(id);
			
			return (Object[]) queryObject.uniqueResult();
		} catch (Exception e) {
			logger.error(e.getMessage());
		} finally {
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
			
				List<String> list = query.list();	
				logger.info("Business Name : "+list.get(0));
				businessName=list.get(0).toString().trim();
			}
			
			if(gender.equalsIgnoreCase("both"))
			{
				gender=null;
			}
		
		if(option.equalsIgnoreCase("All User") && age.equalsIgnoreCase("all"))
			{
				age=null;
				querylist="alluserlist_all";
				logger.info("alluserlist_all");
				String sql=CustomSQLUtil.get(querylist);
				query = session.createSQLQuery(sql);
				QueryPos pos = QueryPos.getInstance(query);
					pos.add(businessName);
					pos.add(gender);
			
				List<Object[]> list = query.list();
				logger.info("List size....." + list.size());
				return query.list();

			}
			
			else if(option.equalsIgnoreCase("All User") && age.startsWith("Between")){
			
				
				String[] ageValues = age.split(" ");
				String ageFrom=ageValues[1];
				
				String ageTo=ageValues[3];
				
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
			
			else if(option.equalsIgnoreCase("All User") && age.startsWith("Greater than")){
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
			else if(option.equalsIgnoreCase("All User") && age.startsWith("Less than")){
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
	
	public boolean getExistingintendedUserTrainingList(long trainingId, String userId, String screenName) {
		boolean flag = false;
		Session session = null;
		try {
			session = openSession();
			String sql = CustomSQLUtil.get("getExistingintendedUserTrainingList");
			SQLQuery queryObject = session.createSQLQuery(sql);
			queryObject.setCacheable(false);
			QueryPos qPos = QueryPos.getInstance(queryObject);
			qPos.add(trainingId);
			qPos.add(userId);
			qPos.add(screenName);
			qPos.add(0);
			List lt =queryObject.list();
			logger.info(lt.toString());

			if (lt.size() != 0) {
				flag = true;
			}
			
			return flag;
		} catch (Exception e) {
			logger.error(e.getMessage());
		} finally {
			closeSession(session);
		}

		return flag;
	}
	
	public boolean addAcceptRejectResponse(int trainingId,String screenName,long contentId,int statusFlag){
		boolean flag = false;
		Session session = null;
		try {
			session = openSession();
			String sql = CustomSQLUtil.get("updateFlagForIntendedUserConfirmOrReject");
			SQLQuery queryObject = session.createSQLQuery(sql);
			queryObject.setCacheable(false);
			QueryPos qPos = QueryPos.getInstance(queryObject);
			qPos.add(trainingId);
			qPos.add(screenName);
			qPos.add(contentId);
			qPos.add(statusFlag);
			qPos.add(trainingId);
			qPos.add(screenName);
			qPos.add(contentId);
			qPos.add(statusFlag);
			
			int i = queryObject.executeUpdate();
			
			if (i != 0) {
				flag = true;
			}
			
			return flag;
		} catch (Exception e) {
			logger.error(e.getMessage());
			return flag;
		} finally {
			closeSession(session);
		}
	}
	
	public boolean updateFlag(int trainingId,String screenName,int statusFlag) {
		boolean flag = false;
		Session session = null;
		try {
			session = openSession();
			String sql = CustomSQLUtil.get("updateFlagForIntendedUserConfirmOrReject");
			SQLQuery queryObject = session.createSQLQuery(sql);
			queryObject.setCacheable(false);
			QueryPos qPos = QueryPos.getInstance(queryObject);
			qPos.add(statusFlag);
			qPos.add(trainingId);
			qPos.add(screenName);
			
			int i = queryObject.executeUpdate();
			
			if (i != 0) {
				flag = true;
			}
			
			return flag;
		} catch (Exception e) {
			logger.error(e.getMessage());
		} finally {
			closeSession(session);
		}

		return flag;
	}
	
	//Code Added by Mohit on 14th May 2017
		public List<Object[]> getContentBasedOnNotificationTypeAll(long notificationType,String gender,String businessName,String age) {
			Session session = null;
			try {
				session = openSession();
				String sql = CustomSQLUtil.get("getcontentbasedonnotificationtypeall");
				SQLQuery queryObject = session.createSQLQuery(sql);
				queryObject.setCacheable(false);
				QueryPos qPos = QueryPos.getInstance(queryObject);
				qPos.add(notificationType);
				qPos.add(gender);
				qPos.add(businessName);
				qPos.add(age);
				qPos.add(age);
				qPos.add(age);
				
				return (List<Object[]>) queryObject.list();
			} catch (Exception e) {
				logger.error(e.getMessage());
				return null;
			} finally {
				closeSession(session);
			}
			
		}
		
		public List<Object[]> getContentBasedOnNotificationTypeUserId(long notificationType,String businessName,String userId) {
			Session session = null;
			try {
				session = openSession();
				String sql = CustomSQLUtil.get("getcontentbasedonnotificationtypeuserid");
				SQLQuery queryObject = session.createSQLQuery(sql);
				queryObject.setCacheable(false);
				QueryPos qPos = QueryPos.getInstance(queryObject);
				qPos.add(notificationType);
				qPos.add(businessName);
				qPos.add(userId);
				
				
				return (List<Object[]>) queryObject.list();
			} catch (Exception e) {
				logger.error(e.getMessage());
				return null;
			} finally {
				closeSession(session);
			}
			
		}
		
		public List<Object[]> getContentBasedOnNotificationTypeUnit(long notificationType,String gender,String businessName,String unit,String age) {
			Session session = null;
			try {
				session = openSession();
				String sql = CustomSQLUtil.get("getcontentbasedonnotificationtypeunit");
				SQLQuery queryObject = session.createSQLQuery(sql);
				queryObject.setCacheable(false);
				QueryPos qPos = QueryPos.getInstance(queryObject);
				qPos.add(notificationType);
				qPos.add(gender);
				qPos.add(businessName);
				qPos.add(unit);
				qPos.add(age);
				qPos.add(age);
				qPos.add(age);
				
				return (List<Object[]>) queryObject.list();
			} catch (Exception e) {
				logger.error(e.getMessage());
				return null;
			} finally {
				closeSession(session);
			}
			
		}
		
		public List<Object[]> getContentBasedOnNotificationTypeFunction(long notificationType,String gender,String businessName,String function,String age) {
			Session session = null;
			try {
				session = openSession();
				String sql = CustomSQLUtil.get("getcontentbasedonnotificationtypefunction");
				SQLQuery queryObject = session.createSQLQuery(sql);
				queryObject.setCacheable(false);
				System.out.println("Query for Training Function : "+notificationType+"  " +gender+ " : "+businessName+ " : "+function+" : "+age);
				QueryPos qPos = QueryPos.getInstance(queryObject);
				qPos.add(notificationType);
				qPos.add(gender);
				qPos.add(businessName);
				qPos.add(function);
				qPos.add(age);
				qPos.add(age);
				qPos.add(age);
				
				return (List<Object[]>) queryObject.list();
			} catch (Exception e) {
				logger.error(e.getMessage());
				return null;
			} finally {
				closeSession(session);
			}
			
		}
		
		public List<Object[]> getContentBasedOnNotificationTypeDepartment(long notificationType,String gender,String businessName,String department,String age) {
			Session session = null;
			try {
				session = openSession();
				String sql = CustomSQLUtil.get("getcontentbasedonnotificationtypedepartment");
				SQLQuery queryObject = session.createSQLQuery(sql);
				queryObject.setCacheable(false);
				QueryPos qPos = QueryPos.getInstance(queryObject);
				qPos.add(notificationType);
				qPos.add(gender);
				qPos.add(businessName);
				qPos.add(department);
				qPos.add(age);
				qPos.add(age);
				qPos.add(age);
				
				return (List<Object[]>) queryObject.list();
			} catch (Exception e) {
				logger.error(e.getMessage());
				return null;
			} finally {
				closeSession(session);
			}
			
		}
		
		public List<Object[]> getContentBasedOnNotificationTypeDesignation(long notificationType,String gender,String businessName,String designation,String age) {
			Session session = null;
			try {
				session = openSession();
				String sql = CustomSQLUtil.get("getcontentbasedonnotificationtypedesignation");
				SQLQuery queryObject = session.createSQLQuery(sql);
				queryObject.setCacheable(false);
				QueryPos qPos = QueryPos.getInstance(queryObject);
				qPos.add(notificationType);
				qPos.add(gender);
				qPos.add(businessName);
				qPos.add(designation);
				qPos.add(age);
				qPos.add(age);
				qPos.add(age);
				
				return (List<Object[]>) queryObject.list();
			} catch (Exception e) {
				logger.error(e.getMessage());
				return null;
			} finally {
				closeSession(session);
			}
			
		}
		
		public List<Object[]> getContentBasedOnNotificationTypeProduct(long notificationType,String gender,String businessName,String product,String age) {
			Session session = null;
			try {
				session = openSession();
				String sql = CustomSQLUtil.get("getcontentbasedonnotificationtypeproduct");
				SQLQuery queryObject = session.createSQLQuery(sql);
				queryObject.setCacheable(false);
				QueryPos qPos = QueryPos.getInstance(queryObject);
				qPos.add(notificationType);
				qPos.add(gender);
				qPos.add(businessName);
				qPos.add(product);
				qPos.add(age);
				qPos.add(age);
				qPos.add(age);
				
				return (List<Object[]>) queryObject.list();
			} catch (Exception e) {
				logger.error(e.getMessage());
				return null;
			} finally {
				closeSession(session);
			}
			
		}
		public List<Object[]> getContentBasedOnNotificationTypeZone(long notificationType,String gender,String businessName,String zone,String age) {
			Session session = null;
			try {
				session = openSession();
				String sql = CustomSQLUtil.get("getcontentbasedonnotificationtypezone");
				SQLQuery queryObject = session.createSQLQuery(sql);
				queryObject.setCacheable(false);
				QueryPos qPos = QueryPos.getInstance(queryObject);
				qPos.add(notificationType);
				qPos.add(gender);
				qPos.add(businessName);
				qPos.add(zone);
				qPos.add(age);
				qPos.add(age);
				qPos.add(age);
				
				return (List<Object[]>) queryObject.list();
			} catch (Exception e) {
				logger.error(e.getMessage());
				return null;
			} finally {
				closeSession(session);
			}
			
		}
		
		public List<Object[]> getContentBasedOnNotificationTypeGrade(long notificationType,String gender,String businessName,String grade,String age) {
			Session session = null;
			try {
				session = openSession();
				String sql = CustomSQLUtil.get("getcontentbasedonnotificationtypegrade");
				SQLQuery queryObject = session.createSQLQuery(sql);
				queryObject.setCacheable(false);
				QueryPos qPos = QueryPos.getInstance(queryObject);
				qPos.add(notificationType);
				qPos.add(gender);
				qPos.add(businessName);
				qPos.add(grade);
				qPos.add(age);
				qPos.add(age);
				qPos.add(age);
				
				return (List<Object[]>) queryObject.list();
			} catch (Exception e) {
				logger.error(e.getMessage());
				return null;
			} finally {
				closeSession(session);
			}
			
		}
		
		public List<Object[]> getContentBasedOnNotificationTypeRegion(long notificationType,String gender,String businessName,String region,String age) {
			Session session = null;
			try {
				session = openSession();
				String sql = CustomSQLUtil.get("getcontentbasedonnotificationtyperegion");
				SQLQuery queryObject = session.createSQLQuery(sql);
				queryObject.setCacheable(false);
				QueryPos qPos = QueryPos.getInstance(queryObject);
				qPos.add(notificationType);
				qPos.add(gender);
				qPos.add(businessName);
				qPos.add(region);
				qPos.add(age);
				qPos.add(age);
				qPos.add(age);
				
				return (List<Object[]>) queryObject.list();
			} catch (Exception e) {
				logger.error(e.getMessage());
				return null;
			} finally {
				closeSession(session);
			}
			
		}
		
		
		public List<Object[]> getContentBasedOnNotificationTypeBranch(long notificationType,String gender,String businessName,String branch,String age) {
			Session session = null;
			try {
				session = openSession();
				String sql = CustomSQLUtil.get("getcontentbasedonnotificationtypebranch");
				SQLQuery queryObject = session.createSQLQuery(sql);
				queryObject.setCacheable(false);
				QueryPos qPos = QueryPos.getInstance(queryObject);
				qPos.add(notificationType);
				qPos.add(gender);
				qPos.add(businessName);
				qPos.add(branch);
				qPos.add(age);
				qPos.add(age);
				qPos.add(age);
				
				return (List<Object[]>) queryObject.list();
			} catch (Exception e) {
				logger.error(e.getMessage());
				return null;
			} finally {
				closeSession(session);
			}
			
		}
		
		public List<Object[]> getContentBasedOnNotificationTypeLocation(long notificationType,String gender,String businessName,String location,String age) {
			Session session = null;
			try {
				session = openSession();
				String sql = CustomSQLUtil.get("getcontentbasedonnotificationtypelocation");
				SQLQuery queryObject = session.createSQLQuery(sql);
				queryObject.setCacheable(false);
				QueryPos qPos = QueryPos.getInstance(queryObject);
				qPos.add(notificationType);
				qPos.add(gender);
				qPos.add(businessName);
				qPos.add(location);
				qPos.add(age);
				qPos.add(age);
				qPos.add(age);
				
				return (List<Object[]>) queryObject.list();
			} catch (Exception e) {
				logger.error(e.getMessage());
				return null;
			} finally {
				closeSession(session);
			}
			
		}
		
		
		public List<Object[]> gettrainingresponses() {
			Session session = null;
			try {
				session = openSession();
				String sql = CustomSQLUtil.get("trainingresponses");
				SQLQuery queryObject = session.createSQLQuery(sql);
				queryObject.setCacheable(false);
				
				return (List<Object[]>) queryObject.list();
			} catch (Exception e) {
				logger.error(e.getMessage());
				return null;
			} finally {
				closeSession(session);
			}
			
		}
	
}
