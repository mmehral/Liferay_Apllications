package com.chola.calendar.service.persistence.impl;

import java.util.List;

import com.chola.calendar.model.corporatepersonalisedparameterscontentstore;
import com.chola.calendar.service.corporateeventsdataLocalServiceUtil;
import com.chola.calendar.service.corporatepersonalisedparameterscontentstoreLocalServiceUtil;
import com.chola.calendar.service.persistence.corporateeventsdataFinder;
import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.SQLQuery;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.util.dao.orm.CustomSQLUtil;

public class corporateeventsdataFinderImpl extends corporateeventsdataFinderBaseImpl implements corporateeventsdataFinder {

	/*method to delete all events*/
public boolean deleteCorporateEvents(){
	boolean flag = false;
	Session session = null;
	try {
		session = openSession();
		String sql = CustomSQLUtil.get("DeleteCorporateEvents");
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
	
	public List<Object[]> getCorporateEventsList(){
		boolean flag = false;
		Session session = null;
		try {
			session = openSession();
			String sql = CustomSQLUtil.get("CorporateEventsList");
			SQLQuery queryObject = session.createSQLQuery(sql);
			queryObject.setCacheable(false);
			QueryPos qPos = QueryPos.getInstance(queryObject);
		
			//qPos.add(userid);
			
			return (List<Object[]>) queryObject.list();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			closeSession(session);
		}
		return null;
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
			e.printStackTrace();
			return null;
		}
		
	}
	
	public  boolean insertIntoCorporatePPContentStore(String businessId, String[] values, String gender, String age,
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

			businessVal = corporateeventsdataLocalServiceUtil.getBusinessNames(businessId);

			if (option.equalsIgnoreCase("Unit") && age.equalsIgnoreCase("all")) {

				age_typeVal = age;
				age_Val = null;

				for (int i = 0; i < values.length; i++) {
					corporatepersonalisedparameterscontentstore ppcs =corporatepersonalisedparameterscontentstoreLocalServiceUtil
							.createcorporatepersonalisedparameterscontentstore(CounterLocalServiceUtil.increment());
					ppcs.setContent_id(Long.parseLong(content_idVal));
					ppcs.setBusiness(businessVal);
					ppcs.setUnit(values[i]);
					ppcs.setGender(genderVal);
					ppcs.setAge_type(age_typeVal);
					ppcs.setAge_value(age_Val);
					ppcs.setNotification_type(notification_typeVal);
					ppcs = corporatepersonalisedparameterscontentstoreLocalServiceUtil
							.addcorporatepersonalisedparameterscontentstore(ppcs);
				}
			} else if (option.equalsIgnoreCase("Unit") && age.startsWith("Between")) {
				age_typeVal = age;
				age_Val = between_from_to_age;

				for (int i = 0; i < values.length; i++) {
					corporatepersonalisedparameterscontentstore ppcs = corporatepersonalisedparameterscontentstoreLocalServiceUtil
							.createcorporatepersonalisedparameterscontentstore(CounterLocalServiceUtil.increment());
					ppcs.setContent_id(Long.parseLong(content_idVal));
					ppcs.setBusiness(businessVal);
					ppcs.setUnit(values[i]);
					ppcs.setGender(genderVal);
					ppcs.setAge_type(age_typeVal);
					ppcs.setAge_value(age_Val);
					ppcs.setNotification_type(notification_typeVal);
					ppcs = corporatepersonalisedparameterscontentstoreLocalServiceUtil
							.addcorporatepersonalisedparameterscontentstore(ppcs);
				}
			} else if (option.equalsIgnoreCase("Unit") && age.startsWith("Greater than")) {
				age_typeVal = age;
				age_Val = greaterthan_age;

				for (int i = 0; i < values.length; i++) {
					corporatepersonalisedparameterscontentstore ppcs = corporatepersonalisedparameterscontentstoreLocalServiceUtil
							.createcorporatepersonalisedparameterscontentstore(CounterLocalServiceUtil.increment());
					ppcs.setContent_id(Long.parseLong(content_idVal));
					ppcs.setBusiness(businessVal);
					ppcs.setUnit(values[i]);
					ppcs.setGender(genderVal);
					ppcs.setAge_type(age_typeVal);
					ppcs.setAge_value(age_Val);
					ppcs.setNotification_type(notification_typeVal);
					ppcs = corporatepersonalisedparameterscontentstoreLocalServiceUtil
							.addcorporatepersonalisedparameterscontentstore(ppcs);
				}
			}

			else if (option.equalsIgnoreCase("Unit") && age.startsWith("Less than")) {

				age_typeVal = age;
				age_Val = lessthan_age;

				for (int i = 0; i < values.length; i++) {
					corporatepersonalisedparameterscontentstore ppcs = corporatepersonalisedparameterscontentstoreLocalServiceUtil
							.createcorporatepersonalisedparameterscontentstore(CounterLocalServiceUtil.increment());
					ppcs.setContent_id(Long.parseLong(content_idVal));
					ppcs.setBusiness(businessVal);
					ppcs.setUnit(values[i]);
					ppcs.setGender(genderVal);
					ppcs.setAge_type(age_typeVal);
					ppcs.setAge_value(age_Val);
					ppcs.setNotification_type(notification_typeVal);
					ppcs = corporatepersonalisedparameterscontentstoreLocalServiceUtil
							.addcorporatepersonalisedparameterscontentstore(ppcs);
				}
			}

			// Intended Logic For Department

			else if (option.equalsIgnoreCase("Department") && age.equalsIgnoreCase("all")) {

				age_typeVal = age;
				age_Val = null;

				for (int i = 0; i < values.length; i++) {
					corporatepersonalisedparameterscontentstore ppcs = corporatepersonalisedparameterscontentstoreLocalServiceUtil
							.createcorporatepersonalisedparameterscontentstore(CounterLocalServiceUtil.increment());
					ppcs.setContent_id(Long.parseLong(content_idVal));
					ppcs.setBusiness(businessVal);
					ppcs.setDepartment(values[i]);
					ppcs.setGender(genderVal);
					ppcs.setAge_type(age_typeVal);
					ppcs.setAge_value(age_Val);
					ppcs.setNotification_type(notification_typeVal);
					ppcs = corporatepersonalisedparameterscontentstoreLocalServiceUtil
							.addcorporatepersonalisedparameterscontentstore(ppcs);
				}
			} else if (option.equalsIgnoreCase("Department") && age.startsWith("Between")) {
				age_typeVal = age;
				age_Val = between_from_to_age;

				for (int i = 0; i < values.length; i++) {
					corporatepersonalisedparameterscontentstore ppcs = corporatepersonalisedparameterscontentstoreLocalServiceUtil
							.createcorporatepersonalisedparameterscontentstore(CounterLocalServiceUtil.increment());
					ppcs.setContent_id(Long.parseLong(content_idVal));
					ppcs.setBusiness(businessVal);
					ppcs.setDepartment(values[i]);
					ppcs.setGender(genderVal);
					ppcs.setAge_type(age_typeVal);
					ppcs.setAge_value(age_Val);
					ppcs.setNotification_type(notification_typeVal);
					ppcs = corporatepersonalisedparameterscontentstoreLocalServiceUtil
							.addcorporatepersonalisedparameterscontentstore(ppcs);
				}
			} else if (option.equalsIgnoreCase("Department") && age.startsWith("Greater than")) {
				age_typeVal = age;
				age_Val = greaterthan_age;

				for (int i = 0; i < values.length; i++) {
					corporatepersonalisedparameterscontentstore ppcs = corporatepersonalisedparameterscontentstoreLocalServiceUtil
							.createcorporatepersonalisedparameterscontentstore(CounterLocalServiceUtil.increment());
					ppcs.setContent_id(Long.parseLong(content_idVal));
					ppcs.setBusiness(businessVal);
					ppcs.setDepartment(values[i]);
					ppcs.setGender(genderVal);
					ppcs.setAge_type(age_typeVal);
					ppcs.setAge_value(age_Val);
					ppcs.setNotification_type(notification_typeVal);
					ppcs = corporatepersonalisedparameterscontentstoreLocalServiceUtil
							.addcorporatepersonalisedparameterscontentstore(ppcs);
				}
			}

			else if (option.equalsIgnoreCase("Department") && age.startsWith("Less than")) {

				age_typeVal = age;
				age_Val = lessthan_age;

				for (int i = 0; i < values.length; i++) {
					corporatepersonalisedparameterscontentstore ppcs = corporatepersonalisedparameterscontentstoreLocalServiceUtil
							.createcorporatepersonalisedparameterscontentstore(CounterLocalServiceUtil.increment());
					ppcs.setContent_id(Long.parseLong(content_idVal));
					ppcs.setBusiness(businessVal);
					ppcs.setDepartment(values[i]);
					ppcs.setGender(genderVal);
					ppcs.setAge_type(age_typeVal);
					ppcs.setAge_value(age_Val);
					ppcs.setNotification_type(notification_typeVal);
					ppcs = corporatepersonalisedparameterscontentstoreLocalServiceUtil
							.addcorporatepersonalisedparameterscontentstore(ppcs);
				}
			}

			// Intended Logic for Function

			else if (option.equalsIgnoreCase("Function") && age.equalsIgnoreCase("all")) {

				age_typeVal = age;
				age_Val = null;

				for (int i = 0; i < values.length; i++) {
					corporatepersonalisedparameterscontentstore ppcs = corporatepersonalisedparameterscontentstoreLocalServiceUtil
							.createcorporatepersonalisedparameterscontentstore(CounterLocalServiceUtil.increment());
					ppcs.setContent_id(Long.parseLong(content_idVal));
					ppcs.setBusiness(businessVal);
					ppcs.setFunction(values[i]);
					ppcs.setGender(genderVal);
					ppcs.setAge_type(age_typeVal);
					ppcs.setAge_value(age_Val);
					ppcs.setNotification_type(notification_typeVal);
					ppcs = corporatepersonalisedparameterscontentstoreLocalServiceUtil
							.addcorporatepersonalisedparameterscontentstore(ppcs);
				}
			} else if (option.equalsIgnoreCase("Function") && age.startsWith("Between")) {
				age_typeVal = age;
				age_Val = between_from_to_age;

				for (int i = 0; i < values.length; i++) {
					corporatepersonalisedparameterscontentstore ppcs = corporatepersonalisedparameterscontentstoreLocalServiceUtil
							.createcorporatepersonalisedparameterscontentstore(CounterLocalServiceUtil.increment());
					ppcs.setContent_id(Long.parseLong(content_idVal));
					ppcs.setBusiness(businessVal);
					ppcs.setFunction(values[i]);
					ppcs.setGender(genderVal);
					ppcs.setAge_type(age_typeVal);
					ppcs.setAge_value(age_Val);
					ppcs.setNotification_type(notification_typeVal);
					ppcs = corporatepersonalisedparameterscontentstoreLocalServiceUtil
							.addcorporatepersonalisedparameterscontentstore(ppcs);
				}
			} else if (option.equalsIgnoreCase("Function") && age.startsWith("Greater than")) {
				age_typeVal = age;
				age_Val = greaterthan_age;

				for (int i = 0; i < values.length; i++) {
					corporatepersonalisedparameterscontentstore ppcs = corporatepersonalisedparameterscontentstoreLocalServiceUtil
							.createcorporatepersonalisedparameterscontentstore(CounterLocalServiceUtil.increment());
					ppcs.setContent_id(Long.parseLong(content_idVal));
					ppcs.setBusiness(businessVal);
					ppcs.setFunction(values[i]);
					ppcs.setGender(genderVal);
					ppcs.setAge_type(age_typeVal);
					ppcs.setAge_value(age_Val);
					ppcs.setNotification_type(notification_typeVal);
					ppcs = corporatepersonalisedparameterscontentstoreLocalServiceUtil
							.addcorporatepersonalisedparameterscontentstore(ppcs);
				}
			}

			else if (option.equalsIgnoreCase("Function") && age.startsWith("Less than")) {

				age_typeVal = age;
				age_Val = lessthan_age;

				for (int i = 0; i < values.length; i++) {
					corporatepersonalisedparameterscontentstore ppcs = corporatepersonalisedparameterscontentstoreLocalServiceUtil
							.createcorporatepersonalisedparameterscontentstore(CounterLocalServiceUtil.increment());
					ppcs.setContent_id(Long.parseLong(content_idVal));
					ppcs.setBusiness(businessVal);
					ppcs.setFunction(values[i]);
					ppcs.setGender(genderVal);
					ppcs.setAge_type(age_typeVal);
					ppcs.setAge_value(age_Val);
					ppcs.setNotification_type(notification_typeVal);
					ppcs = corporatepersonalisedparameterscontentstoreLocalServiceUtil
							.addcorporatepersonalisedparameterscontentstore(ppcs);
				}
			}

			// Intended Logic for Designation

			else if (option.equalsIgnoreCase("Designation") && age.equalsIgnoreCase("all")) {

				age_typeVal = age;
				age_Val = null;

				for (int i = 0; i < values.length; i++) {
					corporatepersonalisedparameterscontentstore ppcs = corporatepersonalisedparameterscontentstoreLocalServiceUtil
							.createcorporatepersonalisedparameterscontentstore(CounterLocalServiceUtil.increment());
					ppcs.setContent_id(Long.parseLong(content_idVal));
					ppcs.setBusiness(businessVal);
					ppcs.setDesignation(values[i]);
					ppcs.setGender(genderVal);
					ppcs.setAge_type(age_typeVal);
					ppcs.setAge_value(age_Val);
					ppcs.setNotification_type(notification_typeVal);
					ppcs = corporatepersonalisedparameterscontentstoreLocalServiceUtil
							.addcorporatepersonalisedparameterscontentstore(ppcs);
				}
			} else if (option.equalsIgnoreCase("Designation") && age.startsWith("Between")) {
				age_typeVal = age;
				age_Val = between_from_to_age;

				for (int i = 0; i < values.length; i++) {
					corporatepersonalisedparameterscontentstore ppcs = corporatepersonalisedparameterscontentstoreLocalServiceUtil
							.createcorporatepersonalisedparameterscontentstore(CounterLocalServiceUtil.increment());
					ppcs.setContent_id(Long.parseLong(content_idVal));
					ppcs.setBusiness(businessVal);
					ppcs.setDesignation(values[i]);
					ppcs.setGender(genderVal);
					ppcs.setAge_type(age_typeVal);
					ppcs.setAge_value(age_Val);
					ppcs.setNotification_type(notification_typeVal);
					ppcs = corporatepersonalisedparameterscontentstoreLocalServiceUtil
							.addcorporatepersonalisedparameterscontentstore(ppcs);
				}
			} else if (option.equalsIgnoreCase("Designation") && age.startsWith("Greater than")) {
				age_typeVal = age;
				age_Val = greaterthan_age;

				for (int i = 0; i < values.length; i++) {
					corporatepersonalisedparameterscontentstore ppcs = corporatepersonalisedparameterscontentstoreLocalServiceUtil
							.createcorporatepersonalisedparameterscontentstore(CounterLocalServiceUtil.increment());
					ppcs.setContent_id(Long.parseLong(content_idVal));
					ppcs.setBusiness(businessVal);
					ppcs.setDesignation(values[i]);
					ppcs.setGender(genderVal);
					ppcs.setAge_type(age_typeVal);
					ppcs.setAge_value(age_Val);
					ppcs.setNotification_type(notification_typeVal);
					ppcs = corporatepersonalisedparameterscontentstoreLocalServiceUtil
							.addcorporatepersonalisedparameterscontentstore(ppcs);
				}
			}

			else if (option.equalsIgnoreCase("Designation") && age.startsWith("Less than")) {

				age_typeVal = age;
				age_Val = lessthan_age;

				for (int i = 0; i < values.length; i++) {
					corporatepersonalisedparameterscontentstore ppcs = corporatepersonalisedparameterscontentstoreLocalServiceUtil
							.createcorporatepersonalisedparameterscontentstore(CounterLocalServiceUtil.increment());
					ppcs.setContent_id(Long.parseLong(content_idVal));
					ppcs.setBusiness(businessVal);
					ppcs.setDesignation(values[i]);
					ppcs.setGender(genderVal);
					ppcs.setAge_type(age_typeVal);
					ppcs.setAge_value(age_Val);
					ppcs.setNotification_type(notification_typeVal);
					ppcs = corporatepersonalisedparameterscontentstoreLocalServiceUtil
							.addcorporatepersonalisedparameterscontentstore(ppcs);
				}
			}

			// Intended Logic For Product

			else if (option.equalsIgnoreCase("Product") && age.equalsIgnoreCase("all")) {

				age_typeVal = age;
				age_Val = null;

				for (int i = 0; i < values.length; i++) {
					corporatepersonalisedparameterscontentstore ppcs = corporatepersonalisedparameterscontentstoreLocalServiceUtil
							.createcorporatepersonalisedparameterscontentstore(CounterLocalServiceUtil.increment());
					ppcs.setContent_id(Long.parseLong(content_idVal));
					ppcs.setBusiness(businessVal);
					ppcs.setProduct(values[i]);
					ppcs.setGender(genderVal);
					ppcs.setAge_type(age_typeVal);
					ppcs.setAge_value(age_Val);
					ppcs.setNotification_type(notification_typeVal);
					ppcs = corporatepersonalisedparameterscontentstoreLocalServiceUtil
							.addcorporatepersonalisedparameterscontentstore(ppcs);
				}
			} else if (option.equalsIgnoreCase("Product") && age.startsWith("Between")) {
				age_typeVal = age;
				age_Val = between_from_to_age;

				for (int i = 0; i < values.length; i++) {
					corporatepersonalisedparameterscontentstore ppcs = corporatepersonalisedparameterscontentstoreLocalServiceUtil
							.createcorporatepersonalisedparameterscontentstore(CounterLocalServiceUtil.increment());
					ppcs.setContent_id(Long.parseLong(content_idVal));
					ppcs.setBusiness(businessVal);
					ppcs.setProduct(values[i]);
					ppcs.setGender(genderVal);
					ppcs.setAge_type(age_typeVal);
					ppcs.setAge_value(age_Val);
					ppcs.setNotification_type(notification_typeVal);
					ppcs = corporatepersonalisedparameterscontentstoreLocalServiceUtil
							.addcorporatepersonalisedparameterscontentstore(ppcs);
				}
			} else if (option.equalsIgnoreCase("Product") && age.startsWith("Greater than")) {
				age_typeVal = age;
				age_Val = greaterthan_age;

				for (int i = 0; i < values.length; i++) {
					corporatepersonalisedparameterscontentstore ppcs = corporatepersonalisedparameterscontentstoreLocalServiceUtil
							.createcorporatepersonalisedparameterscontentstore(CounterLocalServiceUtil.increment());
					ppcs.setContent_id(Long.parseLong(content_idVal));
					ppcs.setBusiness(businessVal);
					ppcs.setProduct(values[i]);
					ppcs.setGender(genderVal);
					ppcs.setAge_type(age_typeVal);
					ppcs.setAge_value(age_Val);
					ppcs.setNotification_type(notification_typeVal);
					ppcs = corporatepersonalisedparameterscontentstoreLocalServiceUtil
							.addcorporatepersonalisedparameterscontentstore(ppcs);
				}
			}

			else if (option.equalsIgnoreCase("Product") && age.startsWith("Less than")) {

				age_typeVal = age;
				age_Val = lessthan_age;

				for (int i = 0; i < values.length; i++) {
					corporatepersonalisedparameterscontentstore ppcs = corporatepersonalisedparameterscontentstoreLocalServiceUtil
							.createcorporatepersonalisedparameterscontentstore(CounterLocalServiceUtil.increment());
					ppcs.setContent_id(Long.parseLong(content_idVal));
					ppcs.setBusiness(businessVal);
					ppcs.setProduct(values[i]);
					ppcs.setGender(genderVal);
					ppcs.setAge_type(age_typeVal);
					ppcs.setAge_value(age_Val);
					ppcs.setNotification_type(notification_typeVal);
					ppcs = corporatepersonalisedparameterscontentstoreLocalServiceUtil
							.addcorporatepersonalisedparameterscontentstore(ppcs);
				}
			}

			// Intended Logic For Zone

			else if (option.equalsIgnoreCase("Zone") && age.equalsIgnoreCase("all")) {

				age_typeVal = age;
				age_Val = null;

				for (int i = 0; i < values.length; i++) {
					corporatepersonalisedparameterscontentstore ppcs = corporatepersonalisedparameterscontentstoreLocalServiceUtil
							.createcorporatepersonalisedparameterscontentstore(CounterLocalServiceUtil.increment());
					ppcs.setContent_id(Long.parseLong(content_idVal));
					ppcs.setBusiness(businessVal);
					ppcs.setZone(values[i]);
					ppcs.setGender(genderVal);
					ppcs.setAge_type(age_typeVal);
					ppcs.setAge_value(age_Val);
					ppcs.setNotification_type(notification_typeVal);
					ppcs = corporatepersonalisedparameterscontentstoreLocalServiceUtil
							.addcorporatepersonalisedparameterscontentstore(ppcs);
				}
			} else if (option.equalsIgnoreCase("Zone") && age.startsWith("Between")) {
				age_typeVal = age;
				age_Val = between_from_to_age;

				for (int i = 0; i < values.length; i++) {
					corporatepersonalisedparameterscontentstore ppcs = corporatepersonalisedparameterscontentstoreLocalServiceUtil
							.createcorporatepersonalisedparameterscontentstore(CounterLocalServiceUtil.increment());
					ppcs.setContent_id(Long.parseLong(content_idVal));
					ppcs.setBusiness(businessVal);
					ppcs.setZone(values[i]);
					ppcs.setGender(genderVal);
					ppcs.setAge_type(age_typeVal);
					ppcs.setAge_value(age_Val);
					ppcs.setNotification_type(notification_typeVal);
					ppcs = corporatepersonalisedparameterscontentstoreLocalServiceUtil
							.addcorporatepersonalisedparameterscontentstore(ppcs);
				}
			} else if (option.equalsIgnoreCase("Zone") && age.startsWith("Greater than")) {
				age_typeVal = age;
				age_Val = greaterthan_age;

				for (int i = 0; i < values.length; i++) {
					corporatepersonalisedparameterscontentstore ppcs = corporatepersonalisedparameterscontentstoreLocalServiceUtil
							.createcorporatepersonalisedparameterscontentstore(CounterLocalServiceUtil.increment());
					ppcs.setContent_id(Long.parseLong(content_idVal));
					ppcs.setBusiness(businessVal);
					ppcs.setZone(values[i]);
					ppcs.setGender(genderVal);
					ppcs.setAge_type(age_typeVal);
					ppcs.setAge_value(age_Val);
					ppcs.setNotification_type(notification_typeVal);
					ppcs = corporatepersonalisedparameterscontentstoreLocalServiceUtil
							.addcorporatepersonalisedparameterscontentstore(ppcs);
				}
			}

			else if (option.equalsIgnoreCase("Zone") && age.startsWith("Less than")) {

				age_typeVal = age;
				age_Val = lessthan_age;

				for (int i = 0; i < values.length; i++) {
					corporatepersonalisedparameterscontentstore ppcs = corporatepersonalisedparameterscontentstoreLocalServiceUtil
							.createcorporatepersonalisedparameterscontentstore(CounterLocalServiceUtil.increment());
					ppcs.setContent_id(Long.parseLong(content_idVal));
					ppcs.setBusiness(businessVal);
					ppcs.setZone(values[i]);
					ppcs.setGender(genderVal);
					ppcs.setAge_type(age_typeVal);
					ppcs.setAge_value(age_Val);
					ppcs.setNotification_type(notification_typeVal);
					ppcs = corporatepersonalisedparameterscontentstoreLocalServiceUtil
							.addcorporatepersonalisedparameterscontentstore(ppcs);
				}
			}

			// Intended Logic For Branch

			else if (option.equalsIgnoreCase("Branch") && age.equalsIgnoreCase("all")) {

				age_typeVal = age;
				age_Val = null;

				for (int i = 0; i < values.length; i++) {
					corporatepersonalisedparameterscontentstore ppcs = corporatepersonalisedparameterscontentstoreLocalServiceUtil
							.createcorporatepersonalisedparameterscontentstore(CounterLocalServiceUtil.increment());
					ppcs.setContent_id(Long.parseLong(content_idVal));
					ppcs.setBusiness(businessVal);
					ppcs.setBranch(values[i]);
					ppcs.setGender(genderVal);
					ppcs.setAge_type(age_typeVal);
					ppcs.setAge_value(age_Val);
					ppcs.setNotification_type(notification_typeVal);
					ppcs = corporatepersonalisedparameterscontentstoreLocalServiceUtil
							.addcorporatepersonalisedparameterscontentstore(ppcs);
				}
			} else if (option.equalsIgnoreCase("Branch") && age.startsWith("Between")) {
				age_typeVal = age;
				age_Val = between_from_to_age;

				for (int i = 0; i < values.length; i++) {
					corporatepersonalisedparameterscontentstore ppcs = corporatepersonalisedparameterscontentstoreLocalServiceUtil
							.createcorporatepersonalisedparameterscontentstore(CounterLocalServiceUtil.increment());
					ppcs.setContent_id(Long.parseLong(content_idVal));
					ppcs.setBusiness(businessVal);
					ppcs.setBranch(values[i]);
					ppcs.setGender(genderVal);
					ppcs.setAge_type(age_typeVal);
					ppcs.setAge_value(age_Val);
					ppcs.setNotification_type(notification_typeVal);
					ppcs = corporatepersonalisedparameterscontentstoreLocalServiceUtil
							.addcorporatepersonalisedparameterscontentstore(ppcs);
				}
			} else if (option.equalsIgnoreCase("Branch") && age.startsWith("Greater than")) {
				age_typeVal = age;
				age_Val = greaterthan_age;

				for (int i = 0; i < values.length; i++) {
					corporatepersonalisedparameterscontentstore ppcs = corporatepersonalisedparameterscontentstoreLocalServiceUtil
							.createcorporatepersonalisedparameterscontentstore(CounterLocalServiceUtil.increment());
					ppcs.setContent_id(Long.parseLong(content_idVal));
					ppcs.setBusiness(businessVal);
					ppcs.setBranch(values[i]);
					ppcs.setGender(genderVal);
					ppcs.setAge_type(age_typeVal);
					ppcs.setAge_value(age_Val);
					ppcs.setNotification_type(notification_typeVal);
					ppcs = corporatepersonalisedparameterscontentstoreLocalServiceUtil
							.addcorporatepersonalisedparameterscontentstore(ppcs);
				}
			}

			else if (option.equalsIgnoreCase("Branch") && age.startsWith("Less than")) {

				age_typeVal = age;
				age_Val = lessthan_age;

				for (int i = 0; i < values.length; i++) {
					corporatepersonalisedparameterscontentstore ppcs = corporatepersonalisedparameterscontentstoreLocalServiceUtil
							.createcorporatepersonalisedparameterscontentstore(CounterLocalServiceUtil.increment());
					ppcs.setContent_id(Long.parseLong(content_idVal));
					ppcs.setBusiness(businessVal);
					ppcs.setBranch(values[i]);
					ppcs.setGender(genderVal);
					ppcs.setAge_type(age_typeVal);
					ppcs.setAge_value(age_Val);
					ppcs.setNotification_type(notification_typeVal);
					ppcs = corporatepersonalisedparameterscontentstoreLocalServiceUtil
							.addcorporatepersonalisedparameterscontentstore(ppcs);
				}
			}

			// Intended Logic For Grade

			else if (option.equalsIgnoreCase("Grade") && age.equalsIgnoreCase("all")) {

				age_typeVal = age;
				age_Val = null;

				for (int i = 0; i < values.length; i++) {
					corporatepersonalisedparameterscontentstore ppcs = corporatepersonalisedparameterscontentstoreLocalServiceUtil
							.createcorporatepersonalisedparameterscontentstore(CounterLocalServiceUtil.increment());
					ppcs.setContent_id(Long.parseLong(content_idVal));
					ppcs.setBusiness(businessVal);
					ppcs.setGrade(values[i]);
					ppcs.setGender(genderVal);
					ppcs.setAge_type(age_typeVal);
					ppcs.setAge_value(age_Val);
					ppcs.setNotification_type(notification_typeVal);
					ppcs = corporatepersonalisedparameterscontentstoreLocalServiceUtil
							.addcorporatepersonalisedparameterscontentstore(ppcs);
				}
			} else if (option.equalsIgnoreCase("Grade") && age.startsWith("Between")) {
				age_typeVal = age;
				age_Val = between_from_to_age;

				for (int i = 0; i < values.length; i++) {
					corporatepersonalisedparameterscontentstore ppcs = corporatepersonalisedparameterscontentstoreLocalServiceUtil
							.createcorporatepersonalisedparameterscontentstore(CounterLocalServiceUtil.increment());
					ppcs.setContent_id(Long.parseLong(content_idVal));
					ppcs.setBusiness(businessVal);
					ppcs.setGrade(values[i]);
					ppcs.setGender(genderVal);
					ppcs.setAge_type(age_typeVal);
					ppcs.setAge_value(age_Val);
					ppcs.setNotification_type(notification_typeVal);
					ppcs = corporatepersonalisedparameterscontentstoreLocalServiceUtil
							.addcorporatepersonalisedparameterscontentstore(ppcs);
				}
			} else if (option.equalsIgnoreCase("Grade") && age.startsWith("Greater than")) {
				age_typeVal = age;
				age_Val = greaterthan_age;

				for (int i = 0; i < values.length; i++) {
					corporatepersonalisedparameterscontentstore ppcs = corporatepersonalisedparameterscontentstoreLocalServiceUtil
							.createcorporatepersonalisedparameterscontentstore(CounterLocalServiceUtil.increment());
					ppcs.setContent_id(Long.parseLong(content_idVal));
					ppcs.setBusiness(businessVal);
					ppcs.setGrade(values[i]);
					ppcs.setGender(genderVal);
					ppcs.setAge_type(age_typeVal);
					ppcs.setAge_value(age_Val);
					ppcs.setNotification_type(notification_typeVal);
					ppcs = corporatepersonalisedparameterscontentstoreLocalServiceUtil
							.addcorporatepersonalisedparameterscontentstore(ppcs);
				}
			}

			else if (option.equalsIgnoreCase("Grade") && age.startsWith("Less than")) {

				age_typeVal = age;
				age_Val = lessthan_age;

				for (int i = 0; i < values.length; i++) {
					corporatepersonalisedparameterscontentstore ppcs = corporatepersonalisedparameterscontentstoreLocalServiceUtil
							.createcorporatepersonalisedparameterscontentstore(CounterLocalServiceUtil.increment());
					ppcs.setContent_id(Long.parseLong(content_idVal));
					ppcs.setBusiness(businessVal);
					ppcs.setGrade(values[i]);
					ppcs.setGender(genderVal);
					ppcs.setAge_type(age_typeVal);
					ppcs.setAge_value(age_Val);
					ppcs.setNotification_type(notification_typeVal);
					ppcs = corporatepersonalisedparameterscontentstoreLocalServiceUtil
							.addcorporatepersonalisedparameterscontentstore(ppcs);
				}
			}

			// Intended Logic For Region

			else if (option.equalsIgnoreCase("Region") && age.equalsIgnoreCase("all")) {

				age_typeVal = age;
				age_Val = null;

				for (int i = 0; i < values.length; i++) {
					corporatepersonalisedparameterscontentstore ppcs = corporatepersonalisedparameterscontentstoreLocalServiceUtil
							.createcorporatepersonalisedparameterscontentstore(CounterLocalServiceUtil.increment());
					ppcs.setContent_id(Long.parseLong(content_idVal));
					ppcs.setBusiness(businessVal);
					ppcs.setRegion(values[i]);
					ppcs.setGender(genderVal);
					ppcs.setAge_type(age_typeVal);
					ppcs.setAge_value(age_Val);
					ppcs.setNotification_type(notification_typeVal);
					ppcs = corporatepersonalisedparameterscontentstoreLocalServiceUtil
							.addcorporatepersonalisedparameterscontentstore(ppcs);
				}
			} else if (option.equalsIgnoreCase("Region") && age.startsWith("Between")) {
				age_typeVal = age;
				age_Val = between_from_to_age;

				for (int i = 0; i < values.length; i++) {
					corporatepersonalisedparameterscontentstore ppcs = corporatepersonalisedparameterscontentstoreLocalServiceUtil
							.createcorporatepersonalisedparameterscontentstore(CounterLocalServiceUtil.increment());
					ppcs.setContent_id(Long.parseLong(content_idVal));
					ppcs.setBusiness(businessVal);
					ppcs.setRegion(values[i]);
					ppcs.setGender(genderVal);
					ppcs.setAge_type(age_typeVal);
					ppcs.setAge_value(age_Val);
					ppcs.setNotification_type(notification_typeVal);
					ppcs = corporatepersonalisedparameterscontentstoreLocalServiceUtil
							.addcorporatepersonalisedparameterscontentstore(ppcs);
				}
			} else if (option.equalsIgnoreCase("Region") && age.startsWith("Greater than")) {
				age_typeVal = age;
				age_Val = greaterthan_age;

				for (int i = 0; i < values.length; i++) {
					corporatepersonalisedparameterscontentstore ppcs = corporatepersonalisedparameterscontentstoreLocalServiceUtil
							.createcorporatepersonalisedparameterscontentstore(CounterLocalServiceUtil.increment());
					ppcs.setContent_id(Long.parseLong(content_idVal));
					ppcs.setBusiness(businessVal);
					ppcs.setRegion(values[i]);
					ppcs.setGender(genderVal);
					ppcs.setAge_type(age_typeVal);
					ppcs.setAge_value(age_Val);
					ppcs.setNotification_type(notification_typeVal);
					ppcs = corporatepersonalisedparameterscontentstoreLocalServiceUtil
							.addcorporatepersonalisedparameterscontentstore(ppcs);
				}
			}

			else if (option.equalsIgnoreCase("Region") && age.startsWith("Less than")) {

				age_typeVal = age;
				age_Val = lessthan_age;

				for (int i = 0; i < values.length; i++) {
					corporatepersonalisedparameterscontentstore ppcs = corporatepersonalisedparameterscontentstoreLocalServiceUtil
							.createcorporatepersonalisedparameterscontentstore(CounterLocalServiceUtil.increment());
					ppcs.setContent_id(Long.parseLong(content_idVal));
					ppcs.setBusiness(businessVal);
					ppcs.setRegion(values[i]);
					ppcs.setGender(genderVal);
					ppcs.setAge_type(age_typeVal);
					ppcs.setAge_value(age_Val);
					ppcs.setNotification_type(notification_typeVal);
					ppcs = corporatepersonalisedparameterscontentstoreLocalServiceUtil
							.addcorporatepersonalisedparameterscontentstore(ppcs);
				}
			}

			// Intended Logic For Location

			else if (option.equalsIgnoreCase("Location") && age.equalsIgnoreCase("all")) {

				age_typeVal = age;
				age_Val = null;

				for (int i = 0; i < values.length; i++) {
					corporatepersonalisedparameterscontentstore ppcs = corporatepersonalisedparameterscontentstoreLocalServiceUtil
							.createcorporatepersonalisedparameterscontentstore(CounterLocalServiceUtil.increment());
					ppcs.setContent_id(Long.parseLong(content_idVal));
					ppcs.setBusiness(businessVal);
					ppcs.setLocation(values[i]);
					ppcs.setGender(genderVal);
					ppcs.setAge_type(age_typeVal);
					ppcs.setAge_value(age_Val);
					ppcs.setNotification_type(notification_typeVal);
					ppcs = corporatepersonalisedparameterscontentstoreLocalServiceUtil
							.addcorporatepersonalisedparameterscontentstore(ppcs);
				}
			} else if (option.equalsIgnoreCase("Location") && age.startsWith("Between")) {
				age_typeVal = age;
				age_Val = between_from_to_age;

				for (int i = 0; i < values.length; i++) {
					corporatepersonalisedparameterscontentstore ppcs = corporatepersonalisedparameterscontentstoreLocalServiceUtil
							.createcorporatepersonalisedparameterscontentstore(CounterLocalServiceUtil.increment());
					ppcs.setContent_id(Long.parseLong(content_idVal));
					ppcs.setBusiness(businessVal);
					ppcs.setLocation(values[i]);
					ppcs.setGender(genderVal);
					ppcs.setAge_type(age_typeVal);
					ppcs.setAge_value(age_Val);
					ppcs.setNotification_type(notification_typeVal);
					ppcs = corporatepersonalisedparameterscontentstoreLocalServiceUtil
							.addcorporatepersonalisedparameterscontentstore(ppcs);
				}
			} else if (option.equalsIgnoreCase("Location") && age.startsWith("Greater than")) {
				age_typeVal = age;
				age_Val = greaterthan_age;

				for (int i = 0; i < values.length; i++) {
					corporatepersonalisedparameterscontentstore ppcs = corporatepersonalisedparameterscontentstoreLocalServiceUtil
							.createcorporatepersonalisedparameterscontentstore(CounterLocalServiceUtil.increment());
					ppcs.setContent_id(Long.parseLong(content_idVal));
					ppcs.setBusiness(businessVal);
					ppcs.setLocation(values[i]);
					ppcs.setGender(genderVal);
					ppcs.setAge_type(age_typeVal);
					ppcs.setAge_value(age_Val);
					ppcs.setNotification_type(notification_typeVal);
					ppcs = corporatepersonalisedparameterscontentstoreLocalServiceUtil
							.addcorporatepersonalisedparameterscontentstore(ppcs);
				}
			}

			else if (option.equalsIgnoreCase("Location") && age.startsWith("Less than")) {

				age_typeVal = age;
				age_Val = lessthan_age;

				for (int i = 0; i < values.length; i++) {
					corporatepersonalisedparameterscontentstore ppcs = corporatepersonalisedparameterscontentstoreLocalServiceUtil
							.createcorporatepersonalisedparameterscontentstore(CounterLocalServiceUtil.increment());
					ppcs.setContent_id(Long.parseLong(content_idVal));
					ppcs.setBusiness(businessVal);
					ppcs.setLocation(values[i]);
					ppcs.setGender(genderVal);
					ppcs.setAge_type(age_typeVal);
					ppcs.setAge_value(age_Val);
					ppcs.setNotification_type(notification_typeVal);
					ppcs = corporatepersonalisedparameterscontentstoreLocalServiceUtil
							.addcorporatepersonalisedparameterscontentstore(ppcs);
				}
			}

			// Intended Logic for UserId

			else if (option.equalsIgnoreCase("User ID")) {

				for (int i = 0; i < values.length; i++) {
					corporatepersonalisedparameterscontentstore ppcs = corporatepersonalisedparameterscontentstoreLocalServiceUtil
							.createcorporatepersonalisedparameterscontentstore(CounterLocalServiceUtil.increment());
					ppcs.setContent_id(Long.parseLong(content_idVal));
					ppcs.setBusiness(businessVal);
					ppcs.setUser_id(values[i]);
					ppcs.setGender(genderVal);
					ppcs.setAge_type(age_typeVal);
					ppcs.setAge_value(age_Val);
					ppcs.setNotification_type(notification_typeVal);
					ppcs = corporatepersonalisedparameterscontentstoreLocalServiceUtil
							.addcorporatepersonalisedparameterscontentstore(ppcs);
				}
			}

			// Inteded logic for All User

			else if (option.equalsIgnoreCase("All User") && age.equalsIgnoreCase("all")) {
				age_typeVal = age;
				age_Val = null;
				corporatepersonalisedparameterscontentstore ppcs = corporatepersonalisedparameterscontentstoreLocalServiceUtil
						.createcorporatepersonalisedparameterscontentstore(CounterLocalServiceUtil.increment());
				ppcs.setContent_id(Long.parseLong(content_idVal));
				ppcs.setBusiness(businessVal);
				ppcs.setGender(genderVal);
				ppcs.setAge_type(age_typeVal);
				ppcs.setAge_value(age_Val);
				ppcs.setNotification_type(notification_typeVal);
				ppcs = corporatepersonalisedparameterscontentstoreLocalServiceUtil
						.addcorporatepersonalisedparameterscontentstore(ppcs);

			} else if (option.equalsIgnoreCase("All User") && age.startsWith("Between")) {
				age_typeVal = age;
				age_Val = between_from_to_age;
				corporatepersonalisedparameterscontentstore ppcs = corporatepersonalisedparameterscontentstoreLocalServiceUtil
						.createcorporatepersonalisedparameterscontentstore(CounterLocalServiceUtil.increment());
				ppcs.setContent_id(Long.parseLong(content_idVal));
				ppcs.setBusiness(businessVal);
				ppcs.setGender(genderVal);
				ppcs.setAge_type(age_typeVal);
				ppcs.setAge_value(age_Val);
				ppcs.setNotification_type(notification_typeVal);
				ppcs = corporatepersonalisedparameterscontentstoreLocalServiceUtil
						.addcorporatepersonalisedparameterscontentstore(ppcs);


			} else if (option.equalsIgnoreCase("All User") && age.startsWith("Greater than")) {
				age_typeVal = age;
				age_Val = greaterthan_age;

				corporatepersonalisedparameterscontentstore ppcs = corporatepersonalisedparameterscontentstoreLocalServiceUtil
						.createcorporatepersonalisedparameterscontentstore(CounterLocalServiceUtil.increment());
				ppcs.setContent_id(Long.parseLong(content_idVal));
				ppcs.setBusiness(businessVal);
				ppcs.setGender(genderVal);
				ppcs.setAge_type(age_typeVal);
				ppcs.setAge_value(age_Val);
				ppcs.setNotification_type(notification_typeVal);
				ppcs = corporatepersonalisedparameterscontentstoreLocalServiceUtil
						.addcorporatepersonalisedparameterscontentstore(ppcs);


			} else if (option.equalsIgnoreCase("All User") && age.startsWith("Less than")) {
				age_typeVal = age;
				age_Val = lessthan_age;
				corporatepersonalisedparameterscontentstore ppcs = corporatepersonalisedparameterscontentstoreLocalServiceUtil
						.createcorporatepersonalisedparameterscontentstore(CounterLocalServiceUtil.increment());
				ppcs.setContent_id(Long.parseLong(content_idVal));
				ppcs.setBusiness(businessVal);
				ppcs.setGender(genderVal);
				ppcs.setAge_type(age_typeVal);
				ppcs.setAge_value(age_Val);
				ppcs.setNotification_type(notification_typeVal);
				ppcs = corporatepersonalisedparameterscontentstoreLocalServiceUtil
						.addcorporatepersonalisedparameterscontentstore(ppcs);

			}
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	
	
	//Training record Fetch....for a intended user	
		public Object[] getIntendedUserCorporateEventRecordList(long id){
			boolean flag = false;
			Session session = null;
			try {
				session = openSession();
				String sql = CustomSQLUtil.get("corporateEventListIntendedRecord");
				SQLQuery queryObject = session.createSQLQuery(sql);
				queryObject.setCacheable(false);
				QueryPos qPos = QueryPos.getInstance(queryObject);
			
				qPos.add(id);
				
				return (Object[]) queryObject.uniqueResult();
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				closeSession(session);
			}
			return null;
		}
	
	
	//Code Added by Mohit on 17th June 2017
			public List<Object[]> getContentBasedOnNotificationTypeAll(long notificationType,String gender,String businessName,String age) {
				boolean flag = false;
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
					e.printStackTrace();
					return null;
				} finally {
					closeSession(session);
				}
				
			}
			
			public List<Object[]> getContentBasedOnNotificationTypeUserId(long notificationType,String businessName,String userId) {
				boolean flag = false;
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
					e.printStackTrace();
					return null;
				} finally {
					closeSession(session);
				}
				
			}
			
			public List<Object[]> getContentBasedOnNotificationTypeUnit(long notificationType,String gender,String businessName,String unit,String age) {
				boolean flag = false;
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
					e.printStackTrace();
					return null;
				} finally {
					closeSession(session);
				}
				
			}
			
			public List<Object[]> getContentBasedOnNotificationTypeFunction(long notificationType,String gender,String businessName,String function,String age) {
				boolean flag = false;
				Session session = null;
				try {
					session = openSession();
					String sql = CustomSQLUtil.get("getcontentbasedonnotificationtypefunction");
					SQLQuery queryObject = session.createSQLQuery(sql);
					queryObject.setCacheable(false);
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
					e.printStackTrace();
					return null;
				} finally {
					closeSession(session);
				}
				
			}
			
			public List<Object[]> getContentBasedOnNotificationTypeDepartment(long notificationType,String gender,String businessName,String department,String age) {
				boolean flag = false;
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
					e.printStackTrace();
					return null;
				} finally {
					closeSession(session);
				}
				
			}
			
			public List<Object[]> getContentBasedOnNotificationTypeDesignation(long notificationType,String gender,String businessName,String designation,String age) {
				boolean flag = false;
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
					e.printStackTrace();
					return null;
				} finally {
					closeSession(session);
				}
				
			}
			
			public List<Object[]> getContentBasedOnNotificationTypeProduct(long notificationType,String gender,String businessName,String product,String age) {
				boolean flag = false;
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
					e.printStackTrace();
					return null;
				} finally {
					closeSession(session);
				}
				
			}
			public List<Object[]> getContentBasedOnNotificationTypeZone(long notificationType,String gender,String businessName,String zone,String age) {
				boolean flag = false;
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
					e.printStackTrace();
					return null;
				} finally {
					closeSession(session);
				}
				
			}
			
			public List<Object[]> getContentBasedOnNotificationTypeGrade(long notificationType,String gender,String businessName,String grade,String age) {
				boolean flag = false;
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
					e.printStackTrace();
					return null;
				} finally {
					closeSession(session);
				}
				
			}
			
			public List<Object[]> getContentBasedOnNotificationTypeRegion(long notificationType,String gender,String businessName,String region,String age) {
				boolean flag = false;
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
					e.printStackTrace();
					return null;
				} finally {
					closeSession(session);
				}
				
			}
			
			
			public List<Object[]> getContentBasedOnNotificationTypeBranch(long notificationType,String gender,String businessName,String branch,String age) {
				boolean flag = false;
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
					e.printStackTrace();
					return null;
				} finally {
					closeSession(session);
				}
				
			}
			
			public List<Object[]> getContentBasedOnNotificationTypeLocation(long notificationType,String gender,String businessName,String location,String age) {
				boolean flag = false;
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
					e.printStackTrace();
					return null;
				} finally {
					closeSession(session);
				}
				
			}

	
}
