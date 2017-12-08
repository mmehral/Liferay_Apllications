package com.chola.notificationchannel.service.persistence.impl;

import java.util.List;

import com.chola.notificationchannel.service.persistence.NoticationCategoryCountFinder;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.SQLQuery;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.util.dao.orm.CustomSQLUtil;

public class NoticationCategoryCountFinderImpl extends NoticationCategoryCountFinderBaseImpl implements NoticationCategoryCountFinder {

	public List<Object[]> getNotficationCategoryCount(long userid) {
		boolean flag = false;
		Session session = null;
		try {
			session = openSession();
			String sql = CustomSQLUtil.get("notificationCategoryCount");
			SQLQuery queryObject = session.createSQLQuery(sql);
			queryObject.setCacheable(false);
			QueryPos qPos = QueryPos.getInstance(queryObject);
			qPos.add(userid);
			
			return (List<Object[]>) queryObject.list();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			closeSession(session);
		}
		return null;
	}
	
	public List<Object[]> getNotficationCategoryList(long userid,String sysval) {
		boolean flag = false;
		Session session = null;
		try {
			session = openSession();
			String sql = CustomSQLUtil.get("notificationList");
			SQLQuery queryObject = session.createSQLQuery(sql);
			queryObject.setCacheable(false);
			QueryPos qPos = QueryPos.getInstance(queryObject);
			qPos.add(sysval);
			qPos.add(userid);
			System.out.println("LIIIIIIIII");
			return (List<Object[]>) queryObject.list();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			closeSession(session);
		}
		return null;
	}
	
	public boolean updatenotificationstatus(int status,long userId,long eventId,long contentId,long tableUserId ){
		boolean flag = false;
		Session session = null;
		try {
			session = openSession();
			String sql = CustomSQLUtil.get("updatenotificationstatus");
			SQLQuery queryObject = session.createSQLQuery(sql);
			queryObject.setCacheable(false);
			QueryPos qPos = QueryPos.getInstance(queryObject);
			qPos.add(status);
			qPos.add(eventId);
			qPos.add(userId);
			qPos.add(contentId);
			System.out.println("Update Flag Query : "+sql);
			int value = queryObject.executeUpdate();
			if(value!=0){
				flag=true;
			}
			return flag;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			closeSession(session);
		}
		return flag;

	}
	
	//Code Added by Mohit on 14th May 2017
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
	
	public boolean insertIntoCholaUsernotification(long userId,long contentId,int readflag){
		boolean flag = false;
		Session session = null;
		try {
			session = openSession();
			String sql = CustomSQLUtil.get("insertintocholausernotification");
			SQLQuery queryObject = session.createSQLQuery(sql);
			queryObject.setCacheable(false);
			QueryPos qPos = QueryPos.getInstance(queryObject);
			qPos.add(userId);
			qPos.add(contentId);
			qPos.add(readflag);
			qPos.add(contentId);
			qPos.add(contentId);
			qPos.add(contentId);
			int value = queryObject.executeUpdate();
			if(value!=0){
				flag=true;
			}
			return flag;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			closeSession(session);
		}
		return flag;

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
			e.printStackTrace();
			return null;
		} finally {
			closeSession(session);
		}
		
	}
	
	
	public List<Object[]> getActiveEmployeeInfoFromTable(String empId){
		Session session = null;
		try {
			session = openSession();
			String sql = CustomSQLUtil.get("getEmployeeInfoFromActiveEmployeeInfoTable");
			SQLQuery queryObject = session.createSQLQuery(sql);
			queryObject.setCacheable(false);
			QueryPos qPos = QueryPos.getInstance(queryObject);
			qPos.add(empId);
			
			return (List<Object[]>) queryObject.list();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		} finally {
			closeSession(session);
		}
		
	}
	
	
	public List<Object[]> getPeoplePowerNotificationDetails(String empId){
		Session session = null;
		try {
			session = openSession();
			String sql = CustomSQLUtil.get("getPeoplePowerNotificationDetails");
			SQLQuery queryObject = session.createSQLQuery(sql);
			queryObject.setCacheable(false);
			QueryPos qPos = QueryPos.getInstance(queryObject);
			qPos.add(empId);
			
			return (List<Object[]>) queryObject.list();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		} finally {
			closeSession(session);
		}
		
	}
	
	
	public List<Object[]> getQtracNotificationDetails(String empId){
		Session session = null;
		try {
			session = openSession();
			String sql = CustomSQLUtil.get("getQtracNotificationDetails");
			SQLQuery queryObject = session.createSQLQuery(sql);
			queryObject.setCacheable(false);
			QueryPos qPos = QueryPos.getInstance(queryObject);
			qPos.add(empId);
			
			return (List<Object[]>) queryObject.list();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		} finally {
			closeSession(session);
		}
		
	}
	
}
