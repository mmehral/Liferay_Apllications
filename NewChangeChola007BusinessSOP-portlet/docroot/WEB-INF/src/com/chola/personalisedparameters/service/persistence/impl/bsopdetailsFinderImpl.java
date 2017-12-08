package com.chola.personalisedparameters.service.persistence.impl;

import java.util.Iterator;
import java.util.List;

import com.chola.personalisedparameters.service.persistence.bsopdetailsFinder;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.SQLQuery;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.util.dao.orm.CustomSQLUtil;

public class bsopdetailsFinderImpl extends bsopdetailsFinderBaseImpl implements bsopdetailsFinder {


	public boolean insertNotifyStts(int syscode, int val, String sysname, int stts, int sttsflag,long usernotifyId) {
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
            System.out.println("Update Value=====" + i);
            if (i != 0) {
                flag = true;
            }
            /*
             * long value = queryObject.list().size(); if (value != 0) { flag =
             * true; } System.out.println("flag set========" + flag);
             */
            return flag;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            closeSession(session);
        }

        return flag;
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
			System.out.println("List size....." + list.size());
			return (List<Object[]>) query.list();
		}
		catch(Exception e)
		{
			e.printStackTrace();
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
			System.out.println("List size....." + list.size());
			return query.list();
		}
		catch(Exception e)
		{
			e.printStackTrace();
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
			System.out.println("List size....." + list.size());
			return query.list();
		}
		catch(Exception e)
		{
			e.printStackTrace();
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
			System.out.println("List size....." + list.size());
			return query.list();
		}
		catch(Exception e)
		{
			e.printStackTrace();
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
			System.out.println("List size....." + list.size());
			return query.list();
		}
		catch(Exception e)
		{
			e.printStackTrace();
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
			System.out.println("List size....." + list.size());
			return query.list();
		}
		catch(Exception e)
		{
			e.printStackTrace();
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
			System.out.println("List size....." + list.size());
			return query.list();
		}
		catch(Exception e)
		{
			e.printStackTrace();
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
			System.out.println("List size....." + list.size());
			return query.list();
		}
		catch(Exception e)
		{
			e.printStackTrace();
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
			System.out.println("List size....." + list.size());
			return query.list();
		}
		catch(Exception e)
		{
			e.printStackTrace();
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
			System.out.println("List size....." + list.size());
			return query.list();
		}
		catch(Exception e)
		{
			e.printStackTrace();
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
			System.out.println("List size....." + list.size());
			return query.list();
		}
		catch(Exception e)
		{
			e.printStackTrace();
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
			System.out.println("List size....." + list.size());
			return query.list();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally {
			closeSession(session);
		}
		return null;
}
	
	public String getBusinessName(String businessID){
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
			e.printStackTrace();
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
		  String genderVal=gender; 
		  String age_typeVal=age; 
		  String age_Val=null;
		  long notification_typeVal=notification_type;
		  String content_type=null;
		  String notify_notificationtext=null;
		  
		  if(notificationDetails!=null){
			  content_type=notificationDetails[0].toString();
			  notify_notificationtext=notificationDetails[1].toString();
			  notify_syscdVal=notificationDetails[2].toString();
			  notify_Val=notificationDetails[3].toString();
			  notify_descVal=notificationDetails[4].toString();
			  notify_statusVal=notificationDetails[5].toString();
			  notify_flagVal=notificationDetails[6].toString();
		  }
		  
		  
		boolean flag = false;
        Session session = null;
        try {
            session = openSession();
            
            businessVal=getBusinessName(businessId);
            
            
            System.out.println("Business Name after Query :  "+businessVal);
            
            if(gender.equalsIgnoreCase("both"))
			{
            	genderVal=null;
			}

            if(option.equalsIgnoreCase("Unit") && age.equalsIgnoreCase("all"))
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
	                int res = queryObject.executeUpdate();
	                System.out.println("Update Value=====" + i);
	                if (res != 0) {
	                    flag = true;
	                }
	            }
			}
			else if(option.equalsIgnoreCase("Unit") && age.startsWith("Between")){
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
		                int res = queryObject.executeUpdate();
		                System.out.println("Update Value=====" + i);
		                if (res != 0) {
		                    flag = true;
		                }
			}
			}
			else if(option.equalsIgnoreCase("Unit") && age.startsWith("Greater than")){
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
		                int res = queryObject.executeUpdate();
		                System.out.println("Update Value=====" + i);
		                if (res != 0) {
		                    flag = true;
		                }
			}
			}
			
			else if(option.equalsIgnoreCase("Unit") && age.startsWith("Less than"))
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
		                int res = queryObject.executeUpdate();
		                System.out.println("Update Value=====" + i);
		                if (res != 0) {
		                    flag = true;
		                }
			}
			}
            
            //Intended Logic For Department
            
            else if(option.equalsIgnoreCase("Department") && age.equalsIgnoreCase("all"))
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
	                int res = queryObject.executeUpdate();
	                System.out.println("Update Value=====" + i);
	                if (res != 0) {
	                    flag = true;
	                }
	            }
			}
			else if(option.equalsIgnoreCase("Department") && age.startsWith("Between")){
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
		                int res = queryObject.executeUpdate();
		                System.out.println("Update Value=====" + i);
		                if (res != 0) {
		                    flag = true;
		                }
			}
			}
			else if(option.equalsIgnoreCase("Department") && age.startsWith("Greater than")){
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
		                int res = queryObject.executeUpdate();
		                System.out.println("Update Value=====" + i);
		                if (res != 0) {
		                    flag = true;
		                }
			}
			}
			
			else if(option.equalsIgnoreCase("Department") && age.startsWith("Less than"))
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
		                int res = queryObject.executeUpdate();
		                System.out.println("Update Value=====" + i);
		                if (res != 0) {
		                    flag = true;
		                }
			}
			}
            
            //Intended Logic for Function
            
			  else if(option.equalsIgnoreCase("Function") && age.equalsIgnoreCase("all"))
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
		                int res = queryObject.executeUpdate();
		                System.out.println("Update Value=====" + i);
		                if (res != 0) {
		                    flag = true;
		                }
		            }
				}
				else if(option.equalsIgnoreCase("Function") && age.startsWith("Between")){
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
			                int res = queryObject.executeUpdate();
			                System.out.println("Update Value=====" + i);
			                if (res != 0) {
			                    flag = true;
			                }
				}
				}
				else if(option.equalsIgnoreCase("Function") && age.startsWith("Greater than")){
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
			                int res = queryObject.executeUpdate();
			                System.out.println("Update Value=====" + i);
			                if (res != 0) {
			                    flag = true;
			                }
				}
				}
				
				else if(option.equalsIgnoreCase("Function") && age.startsWith("Less than"))
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
			                int res = queryObject.executeUpdate();
			                System.out.println("Update Value=====" + i);
			                if (res != 0) {
			                    flag = true;
			                }
				}
				}
            
            //Intended Logic for Designation
            
				 else if(option.equalsIgnoreCase("Designation") && age.equalsIgnoreCase("all"))
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
			                int res = queryObject.executeUpdate();
			                System.out.println("Update Value=====" + i);
			                if (res != 0) {
			                    flag = true;
			                }
			            }
					}
					else if(option.equalsIgnoreCase("Designation") && age.startsWith("Between")){
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
				                int res = queryObject.executeUpdate();
				                System.out.println("Update Value=====" + i);
				                if (res != 0) {
				                    flag = true;
				                }
					}
					}
					else if(option.equalsIgnoreCase("Designation") && age.startsWith("Greater than")){
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
				                int res = queryObject.executeUpdate();
				                System.out.println("Update Value=====" + i);
				                if (res != 0) {
				                    flag = true;
				                }
					}
					}
					
					else if(option.equalsIgnoreCase("Designation") && age.startsWith("Less than"))
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
				                int res = queryObject.executeUpdate();
				                System.out.println("Update Value=====" + i);
				                if (res != 0) {
				                    flag = true;
				                }
					}
					}
            
            
            //Intended Logic For Product
            
					 else if(option.equalsIgnoreCase("Product") && age.equalsIgnoreCase("all"))
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
				                int res = queryObject.executeUpdate();
				                System.out.println("Update Value=====" + i);
				                if (res != 0) {
				                    flag = true;
				                }
				            }
						}
						else if(option.equalsIgnoreCase("Product") && age.startsWith("Between")){
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
					                int res = queryObject.executeUpdate();
					                System.out.println("Update Value=====" + i);
					                if (res != 0) {
					                    flag = true;
					                }
						}
						}
						else if(option.equalsIgnoreCase("Product") && age.startsWith("Greater than")){
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
					                int res = queryObject.executeUpdate();
					                System.out.println("Update Value=====" + i);
					                if (res != 0) {
					                    flag = true;
					                }
						}
						}
						
						else if(option.equalsIgnoreCase("Product") && age.startsWith("Less than"))
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
					                int res = queryObject.executeUpdate();
					                System.out.println("Update Value=====" + i);
					                if (res != 0) {
					                    flag = true;
					                }
						}
						}
            
            
          //Intended Logic For Zone
            
						 else if(option.equalsIgnoreCase("Zone") && age.equalsIgnoreCase("all"))
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
					                int res = queryObject.executeUpdate();
					                System.out.println("Update Value=====" + i);
					                if (res != 0) {
					                    flag = true;
					                }
					            }
							}
							else if(option.equalsIgnoreCase("Zone") && age.startsWith("Between")){
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
						                int res = queryObject.executeUpdate();
						                System.out.println("Update Value=====" + i);
						                if (res != 0) {
						                    flag = true;
						                }
							}
							}
							else if(option.equalsIgnoreCase("Zone") && age.startsWith("Greater than")){
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
						                int res = queryObject.executeUpdate();
						                System.out.println("Update Value=====" + i);
						                if (res != 0) {
						                    flag = true;
						                }
							}
							}
							
							else if(option.equalsIgnoreCase("Zone") && age.startsWith("Less than"))
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
						                int res = queryObject.executeUpdate();
						                System.out.println("Update Value=====" + i);
						                if (res != 0) {
						                    flag = true;
						                }
							}
							}
	            
            
          //Intended Logic For Branch
            
							 else if(option.equalsIgnoreCase("Branch") && age.equalsIgnoreCase("all"))
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
						                int res = queryObject.executeUpdate();
						                System.out.println("Update Value=====" + i);
						                if (res != 0) {
						                    flag = true;
						                }
						            }
								}
								else if(option.equalsIgnoreCase("Branch") && age.startsWith("Between")){
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
							                int res = queryObject.executeUpdate();
							                System.out.println("Update Value=====" + i);
							                if (res != 0) {
							                    flag = true;
							                }
								}
								}
								else if(option.equalsIgnoreCase("Branch") && age.startsWith("Greater than")){
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
							                int res = queryObject.executeUpdate();
							                System.out.println("Update Value=====" + i);
							                if (res != 0) {
							                    flag = true;
							                }
								}
								}
								
								else if(option.equalsIgnoreCase("Branch") && age.startsWith("Less than"))
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
							                int res = queryObject.executeUpdate();
							                System.out.println("Update Value=====" + i);
							                if (res != 0) {
							                    flag = true;
							                }
								}
								}
		            
            
            
          //Intended Logic For Grade
            
								 else if(option.equalsIgnoreCase("Grade") && age.equalsIgnoreCase("all"))
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
							                int res = queryObject.executeUpdate();
							                System.out.println("Update Value=====" + i);
							                if (res != 0) {
							                    flag = true;
							                }
							            }
									}
									else if(option.equalsIgnoreCase("Grade") && age.startsWith("Between")){
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
								                int res = queryObject.executeUpdate();
								                System.out.println("Update Value=====" + i);
								                if (res != 0) {
								                    flag = true;
								                }
									}
									}
									else if(option.equalsIgnoreCase("Grade") && age.startsWith("Greater than")){
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
								                int res = queryObject.executeUpdate();
								                System.out.println("Update Value=====" + i);
								                if (res != 0) {
								                    flag = true;
								                }
									}
									}
									
									else if(option.equalsIgnoreCase("Grade") && age.startsWith("Less than"))
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
								                int res = queryObject.executeUpdate();
								                System.out.println("Update Value=====" + i);
								                if (res != 0) {
								                    flag = true;
								                }
									}
									}
            
          //Intended Logic For Region
            
									 else if(option.equalsIgnoreCase("Region") && age.equalsIgnoreCase("all"))
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
								                int res = queryObject.executeUpdate();
								                System.out.println("Update Value=====" + i);
								                if (res != 0) {
								                    flag = true;
								                }
								            }
										}
										else if(option.equalsIgnoreCase("Region") && age.startsWith("Between")){
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
									                int res = queryObject.executeUpdate();
									                System.out.println("Update Value=====" + i);
									                if (res != 0) {
									                    flag = true;
									                }
										}
										}
										else if(option.equalsIgnoreCase("Region") && age.startsWith("Greater than")){
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
									                int res = queryObject.executeUpdate();
									                System.out.println("Update Value=====" + i);
									                if (res != 0) {
									                    flag = true;
									                }
										}
										}
										
										else if(option.equalsIgnoreCase("Region") && age.startsWith("Less than"))
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
									                int res = queryObject.executeUpdate();
									                System.out.println("Update Value=====" + i);
									                if (res != 0) {
									                    flag = true;
									                }
										}
										}
	            
            
            //Intended Logic For Location
            
										else if(option.equalsIgnoreCase("Location") && age.equalsIgnoreCase("all"))
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
								                int res = queryObject.executeUpdate();
								                System.out.println("Update Value=====" + i);
								                if (res != 0) {
								                    flag = true;
								                }
								            }
										}
										else if(option.equalsIgnoreCase("Location") && age.startsWith("Between")){
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
									                int res = queryObject.executeUpdate();
									                System.out.println("Update Value=====" + i);
									                if (res != 0) {
									                    flag = true;
									                }
										}
										}
										else if(option.equalsIgnoreCase("Location") && age.startsWith("Greater than")){
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
									                int res = queryObject.executeUpdate();
									                System.out.println("Update Value=====" + i);
									                if (res != 0) {
									                    flag = true;
									                }
										}
										}
										
										else if(option.equalsIgnoreCase("Location") && age.startsWith("Less than"))
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
									                int res = queryObject.executeUpdate();
									                System.out.println("Update Value=====" + i);
									                if (res != 0) {
									                    flag = true;
									                }
										}
										}
            
            
            
            //Intended Logic for UserId
            
										else if(option.equalsIgnoreCase("User ID")){
											
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
								                int res = queryObject.executeUpdate();
								                System.out.println("Update Value=====" + i);
								                if (res != 0) {
								                    flag = true;
								                }
									}
										}
            
            //Inteded logic for All User
            
										else if(option.equalsIgnoreCase("All User") && age.equalsIgnoreCase("all"))
										{
											 age_typeVal=age; 
											 age_Val=null;
											 System.out.println("All");
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
								                int res = queryObject.executeUpdate();
								                if (res != 0) {
								                    flag = true;
								                }
											
										}
										else if(option.equalsIgnoreCase("All User") && age.startsWith("Between")){
											 age_typeVal=age; 
											  age_Val=between_from_to_age;
											  System.out.println("Between");
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
								                int res = queryObject.executeUpdate();
								                if (res != 0) {
								                    flag = true;
								                }
											
										}else if(option.equalsIgnoreCase("All User") && age.startsWith("Greater than")){
											age_typeVal=age; 
											  age_Val=greaterthan_age;
											  
											  System.out.println("Greater than");
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
								                int res = queryObject.executeUpdate();
								                if (res != 0) {
								                    flag = true;
								                }
											
										}else if(option.equalsIgnoreCase("All User") && age.startsWith("Less than")){
											age_typeVal=age; 
											 age_Val=lessthan_age;
											 System.out.println("Less than");
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
								                int res = queryObject.executeUpdate();
								                if (res != 0) {
								                    flag = true;
								                }
										}
            
            
            return flag;
        } catch (Exception e) {
            e.printStackTrace();
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
		
		System.out.println("New Values : "+newValue);
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
				System.out.println("intendeduserlist_Between");
				//querylist="intendeduserlist_greaterthan";
				System.out.println("Original Age : "+age);
				
				String[] ageValues = age.split(" ");
				
				
				//String ageFrom = age.substring(age.indexOf(" ") + 1);
				String ageFrom=ageValues[1];
				System.out.println("Age from : "+ageFrom);
				//String ageTo = age.substring(age.lastIndexOf(" ") + 1); ;
				String ageTo=ageValues[3];
				System.out.println("Age to :"+ageTo);
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
				System.out.println("List size....." + list.size());
				return query.list();
				//pos.add(businessId);
				//pos.add(values);
			}
			else if(option.equalsIgnoreCase("Unit") && age.equalsIgnoreCase("all"))
			{
				age=null;
				querylist="intendeduserlist_all_unit";
				System.out.println("intendeduserlist_all_unit");
				String sql=CustomSQLUtil.get(querylist);
				System.out.println("Values : " +values.toString());
				sql = StringUtil.replace(sql, "[$unitdata$]", newValue);
				query = session.createSQLQuery(sql);
				QueryPos pos = QueryPos.getInstance(query);
			
					pos.add(gender);
			
				/*pos.add(gender.toUpperCase());
				pos.add(values);*/
				List<Object[]> list = query.list();
			    Iterator it=list.iterator();
				System.out.println("List size....." + list.size());
				return query.list();

			}
			else if(option.equalsIgnoreCase("Unit") && age.startsWith("Less than"))
			{
				age=age.substring(age.lastIndexOf(" ") + 1);
				querylist="intendeduserlist_lessthan_unit";
				System.out.println("intendeduserlist_lessthan_unit");
				String sql=CustomSQLUtil.get(querylist);
				System.out.println("Values : " +values.toString());
				sql = StringUtil.replace(sql, "[$unitdata$]", newValue);
				query = session.createSQLQuery(sql);
				QueryPos pos = QueryPos.getInstance(query);
			
					pos.add(gender);
				
				
				pos.add(age);
				List<Object[]> list = query.list();
			    Iterator it=list.iterator();
				System.out.println("List size....." + list.size());
				return query.list();
				
			}
			else if(option.equalsIgnoreCase("Unit") && age.startsWith("Greater than"))
			{
				age=age.substring(age.lastIndexOf(" ") + 1);
				System.out.println("age : "+age);
				querylist="intendeduserlist_greaterthan_unit";
				System.out.println("intendeduserlist_greaterthan_unit");
				String sql=CustomSQLUtil.get(querylist);
				System.out.println("Values : " +values.toString());
				sql = StringUtil.replace(sql, "[$unitdata$]", newValue);
				query = session.createSQLQuery(sql);
				QueryPos pos = QueryPos.getInstance(query);
				
					pos.add(gender);
				
				pos.add(age);
				List<Object[]> list = query.list();
			    Iterator it=list.iterator();
				System.out.println("List size....." + list.size());
				return query.list();
			}

			else if (option.equalsIgnoreCase("Department") && age.equalsIgnoreCase("all")) {

				age=null;
				querylist="intendeduserlist_all_department";
				System.out.println("intendeduserlist_all_department");
				String sql=CustomSQLUtil.get(querylist);
				System.out.println("Values : " +values.toString());
				sql = StringUtil.replace(sql, "[$departmentdata$]", newValue);
				query = session.createSQLQuery(sql);
				QueryPos pos = QueryPos.getInstance(query);
				
					pos.add(gender);
				
				
				/*pos.add(gender.toUpperCase());
				pos.add(values);*/
				List<Object[]> list = query.list();
			    Iterator it=list.iterator();
				System.out.println("List size....." + list.size());
				return query.list();

				
				
			} else if (option.equalsIgnoreCase("Department") && age.startsWith("Between")) {
				
				System.out.println("Original Age : "+age);
				String[] ageValues = age.split(" ");
				String ageFrom=ageValues[1];
				System.out.println("Age from : "+ageFrom);
				String ageTo=ageValues[3];
				System.out.println("Age to :"+ageTo);
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
				System.out.println("List size....." + list.size());
				return query.list();
				
				
			} else if (option.equalsIgnoreCase("Department") && age.startsWith("Greater than")) {

				age=age.substring(age.lastIndexOf(" ") + 1);
				System.out.println("age : "+age);
				querylist="intendeduserlist_greaterthan_department";
				System.out.println("intendeduserlist_greaterthan_department");
				String sql=CustomSQLUtil.get(querylist);
				System.out.println("Values : " +values.toString());
				sql = StringUtil.replace(sql, "[$departmentdata$]", newValue);
				query = session.createSQLQuery(sql);
				QueryPos pos = QueryPos.getInstance(query);
			
					pos.add(gender);
				
				pos.add(age);
				List<Object[]> list = query.list();
			    Iterator it=list.iterator();
				System.out.println("List size....." + list.size());
				return query.list();
				
			} else if (option.equalsIgnoreCase("Department") && age.startsWith("Less than")) {

				
				age=age.substring(age.lastIndexOf(" ") + 1);
				querylist="intendeduserlist_lessthan_department";
				System.out.println("intendeduserlist_lessthan_department");
				String sql=CustomSQLUtil.get(querylist);
				System.out.println("Values : " +values.toString());
				sql = StringUtil.replace(sql, "[$departmentdata$]", newValue);
				query = session.createSQLQuery(sql);
				QueryPos pos = QueryPos.getInstance(query);
			
					pos.add(gender);
				
				
				pos.add(age);
				List<Object[]> list = query.list();
			    Iterator it=list.iterator();
				System.out.println("List size....." + list.size());
				return query.list();
			}
			
			
			else if (option.equalsIgnoreCase("Function") && age.equalsIgnoreCase("all")) {

				age=null;
				querylist="intendeduserlist_all_function";
				System.out.println("intendeduserlist_all_function");
				String sql=CustomSQLUtil.get(querylist);
				System.out.println("Values : " +values.toString());
				sql = StringUtil.replace(sql, "[$functiondata$]", newValue);
				query = session.createSQLQuery(sql);
				QueryPos pos = QueryPos.getInstance(query);
				
					pos.add(gender);
				
				
				/*pos.add(gender.toUpperCase());
				pos.add(values);*/
				List<Object[]> list = query.list();
			    Iterator it=list.iterator();
				System.out.println("List size....." + list.size());
				return query.list();

				
				
			} 
			else if (option.equalsIgnoreCase("Function") && age.startsWith("Between")) {
				
				System.out.println("Original Age : "+age);
				String[] ageValues = age.split(" ");
				String ageFrom=ageValues[1];
				System.out.println("Age from : "+ageFrom);
				String ageTo=ageValues[3];
				System.out.println("Age to :"+ageTo);
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
				System.out.println("List size....." + list.size());
				return query.list();
				
				
			} else if (option.equalsIgnoreCase("Function") && age.startsWith("Greater than")) {

				age=age.substring(age.lastIndexOf(" ") + 1);
				System.out.println("age : "+age);
				querylist="intendeduserlist_greaterthan_function";
				System.out.println("intendeduserlist_greaterthan_function");
				String sql=CustomSQLUtil.get(querylist);
				System.out.println("Values : " +values.toString());
				sql = StringUtil.replace(sql, "[$functiondata$]", newValue);
				query = session.createSQLQuery(sql);
				QueryPos pos = QueryPos.getInstance(query);
			
					pos.add(gender);
				
				pos.add(age);
				List<Object[]> list = query.list();
			    Iterator it=list.iterator();
				System.out.println("List size....." + list.size());
				return query.list();
				
			} else if (option.equalsIgnoreCase("Function") && age.startsWith("Less than")) {

				System.out.println("intendeduserlist_lessthan_function");
				age=age.substring(age.lastIndexOf(" ") + 1);
				querylist="intendeduserlist_lessthan_function";
				
				String sql=CustomSQLUtil.get(querylist);
				System.out.println("Values : " +values.toString());
				sql = StringUtil.replace(sql, "[$functiondata$]", newValue);
				query = session.createSQLQuery(sql);
				QueryPos pos = QueryPos.getInstance(query);
				
					pos.add(gender);
				
				
				pos.add(age);
				List<Object[]> list = query.list();
			    Iterator it=list.iterator();
				System.out.println("List size....." + list.size());
				return query.list();
			}
			
			
			
			//Intended User List for Designation From activeemployeeinfo
			
			else if (option.equalsIgnoreCase("Designation") && age.equalsIgnoreCase("all")) {
				age=null;
				querylist="intendeduserlist_all_designation";
				System.out.println("intendeduserlist_all_designation");
				String sql=CustomSQLUtil.get(querylist);
				System.out.println("Values : " +values.toString());
				sql = StringUtil.replace(sql, "[$designationdata$]", newValue);
				query = session.createSQLQuery(sql);
				QueryPos pos = QueryPos.getInstance(query);
			
					pos.add(gender);
				
				/*pos.add(gender.toUpperCase());
				pos.add(values);*/
				List<Object[]> list = query.list();
			    Iterator it=list.iterator();
				System.out.println("List size....." + list.size());
				return query.list();
				
			}
			else if (option.equalsIgnoreCase("Designation") && age.startsWith("Between")) {
				
				System.out.println("Original Age : "+age);
				String[] ageValues = age.split(" ");
				String ageFrom=ageValues[1];
				System.out.println("Age from : "+ageFrom);
				String ageTo=ageValues[3];
				System.out.println("Age to :"+ageTo);
				querylist="intendeduserlist_between_designation";
				System.out.println("intendeduserlist_between_designation");
				String sql=CustomSQLUtil.get(querylist);
				sql = StringUtil.replace(sql, "[$designationdata$]", newValue);
				query = session.createSQLQuery(sql);
				QueryPos pos = QueryPos.getInstance(query);
			
					pos.add(gender);
				
				pos.add(ageFrom);
				pos.add(ageTo);
				
				List<Object[]> list = query.list();
			    Iterator it=list.iterator();
				System.out.println("List size....." + list.size());
				return query.list();
				
			}
			else if (option.equalsIgnoreCase("Designation") && age.startsWith("Greater than")) {
				
				age=age.substring(age.lastIndexOf(" ") + 1);
				System.out.println("age : "+age);
				querylist="intendeduserlist_greaterthan_designation";
				System.out.println("intendeduserlist_greaterthan_designation");
				String sql=CustomSQLUtil.get(querylist);
				System.out.println("Values : " +values.toString());
				sql = StringUtil.replace(sql, "[$designationdata$]", newValue);
				query = session.createSQLQuery(sql);
				QueryPos pos = QueryPos.getInstance(query);
			
					pos.add(gender);
				
				pos.add(age);
				List<Object[]> list = query.list();
			    Iterator it=list.iterator();
				System.out.println("List size....." + list.size());
				return query.list();
				
			}
			else if (option.equalsIgnoreCase("Designation") && age.startsWith("Less than")) {
				System.out.println("intendeduserlist_lessthan_designation");
				age=age.substring(age.lastIndexOf(" ") + 1);
				querylist="intendeduserlist_lessthan_designation";
				
				String sql=CustomSQLUtil.get(querylist);
				System.out.println("Values : " +values.toString());
				sql = StringUtil.replace(sql, "[$designationdata$]", newValue);
				query = session.createSQLQuery(sql);
				QueryPos pos = QueryPos.getInstance(query);
				
					pos.add(gender);
				
				
				pos.add(age);
				List<Object[]> list = query.list();
			    Iterator it=list.iterator();
				System.out.println("List size....." + list.size());
				return query.list();
			}
			
			//Intended User List for Product From activeemployeeinfo
			
			else if (option.equalsIgnoreCase("Product") && age.equalsIgnoreCase("all")) {
				age=null;
				querylist="intendeduserlist_all_product";
				System.out.println("intendeduserlist_all_product");
				String sql=CustomSQLUtil.get(querylist);
				System.out.println("Values : " +values.toString());
				sql = StringUtil.replace(sql, "[$productdata$]", newValue);
				query = session.createSQLQuery(sql);
				QueryPos pos = QueryPos.getInstance(query);
				
				
					pos.add(gender);
				
				/*pos.add(gender.toUpperCase());
				pos.add(values);*/
				List<Object[]> list = query.list();
			    Iterator it=list.iterator();
				System.out.println("List size....." + list.size());
				return query.list();
			}
			else if (option.equalsIgnoreCase("Product") && age.startsWith("Between")) {
				System.out.println("Original Age : "+age);
				String[] ageValues = age.split(" ");
				String ageFrom=ageValues[1];
				System.out.println("Age from : "+ageFrom);
				String ageTo=ageValues[3];
				System.out.println("Age to :"+ageTo);
				querylist="intendeduserlist_between_product";
				System.out.println("intendeduserlist_between_product");
				String sql=CustomSQLUtil.get(querylist);
				sql = StringUtil.replace(sql, "[$productdata$]", newValue);
				query = session.createSQLQuery(sql);
				QueryPos pos = QueryPos.getInstance(query);
			
					pos.add(gender);
				
				pos.add(ageFrom);
				pos.add(ageTo);
				
				List<Object[]> list = query.list();
			    Iterator it=list.iterator();
				System.out.println("List size....." + list.size());
				return query.list();
			}
			else if (option.equalsIgnoreCase("Product") && age.startsWith("Greater than")) {
				age=age.substring(age.lastIndexOf(" ") + 1);
				System.out.println("age : "+age);
				querylist="intendeduserlist_greaterthan_product";
				System.out.println("intendeduserlist_greaterthan_product");
				String sql=CustomSQLUtil.get(querylist);
				System.out.println("Values : " +values.toString());
				sql = StringUtil.replace(sql, "[$productdata$]", newValue);
				query = session.createSQLQuery(sql);
				QueryPos pos = QueryPos.getInstance(query);
			
					pos.add(gender);
				
				pos.add(age);
				List<Object[]> list = query.list();
			    Iterator it=list.iterator();
				System.out.println("List size....." + list.size());
				return query.list();
			}
			else if (option.equalsIgnoreCase("Product") && age.startsWith("Less than")) {
				System.out.println("intendeduserlist_lessthan_product");
				age=age.substring(age.lastIndexOf(" ") + 1);
				querylist="intendeduserlist_lessthan_product";
				
				String sql=CustomSQLUtil.get(querylist);
				System.out.println("Values : " +values.toString());
				sql = StringUtil.replace(sql, "[$productdata$]", newValue);
				query = session.createSQLQuery(sql);
				QueryPos pos = QueryPos.getInstance(query);
				
					pos.add(gender);
				
				
				pos.add(age);
				List<Object[]> list = query.list();
			    Iterator it=list.iterator();
				System.out.println("List size....." + list.size());
				return query.list();
			}
			
			//Intended User List for Zone From activeemployeeinfo
			
			else if (option.equalsIgnoreCase("Zone") && age.equalsIgnoreCase("all")) {
				age=null;
				querylist="intendeduserlist_all_zone";
				System.out.println("intendeduserlist_all_zone");
				String sql=CustomSQLUtil.get(querylist);
				System.out.println("Values : " +values.toString());
				sql = StringUtil.replace(sql, "[$zonedata$]", newValue);
				query = session.createSQLQuery(sql);
				QueryPos pos = QueryPos.getInstance(query);
				
				
					pos.add(gender);
				
				/*pos.add(gender.toUpperCase());
				pos.add(values);*/
				List<Object[]> list = query.list();
			    Iterator it=list.iterator();
				System.out.println("List size....." + list.size());
				return query.list();
			}
			else if (option.equalsIgnoreCase("Zone") && age.startsWith("Between")) {
				System.out.println("Original Age : "+age);
				String[] ageValues = age.split(" ");
				String ageFrom=ageValues[1];
				System.out.println("Age from : "+ageFrom);
				String ageTo=ageValues[3];
				System.out.println("Age to :"+ageTo);
				querylist="intendeduserlist_between_zone";
				System.out.println("intendeduserlist_between_zone");
				String sql=CustomSQLUtil.get(querylist);
				sql = StringUtil.replace(sql, "[$zonedata$]", newValue);
				query = session.createSQLQuery(sql);
				QueryPos pos = QueryPos.getInstance(query);
			
					pos.add(gender);
				
				pos.add(ageFrom);
				pos.add(ageTo);
				
				List<Object[]> list = query.list();
			    Iterator it=list.iterator();
				System.out.println("List size....." + list.size());
				return query.list();
			}
			else if (option.equalsIgnoreCase("Zone") && age.startsWith("Greater than")) {
				age=age.substring(age.lastIndexOf(" ") + 1);
				System.out.println("age : "+age);
				querylist="intendeduserlist_greaterthan_zone";
				System.out.println("intendeduserlist_greaterthan_zone");
				String sql=CustomSQLUtil.get(querylist);
				System.out.println("Values : " +values.toString());
				sql = StringUtil.replace(sql, "[$zonedata$]", newValue);
				query = session.createSQLQuery(sql);
				QueryPos pos = QueryPos.getInstance(query);
			
					pos.add(gender);
				
				pos.add(age);
				List<Object[]> list = query.list();
			    Iterator it=list.iterator();
				System.out.println("List size....." + list.size());
				return query.list();
			}
			else if (option.equalsIgnoreCase("Zone") && age.startsWith("Less than")) {
				System.out.println("intendeduserlist_lessthan_zone");
				age=age.substring(age.lastIndexOf(" ") + 1);
				querylist="intendeduserlist_lessthan_zone";
				
				String sql=CustomSQLUtil.get(querylist);
				System.out.println("Values : " +values.toString());
				sql = StringUtil.replace(sql, "[$zonedata$]", newValue);
				query = session.createSQLQuery(sql);
				QueryPos pos = QueryPos.getInstance(query);
				
					pos.add(gender);
				
				
				pos.add(age);
				List<Object[]> list = query.list();
			    Iterator it=list.iterator();
				System.out.println("List size....." + list.size());
				return query.list();
			}
			
			//Intended User List for Branch From activeemployeeinfo
			
			
			else if (option.equalsIgnoreCase("Branch") && age.equalsIgnoreCase("all")) {
				age=null;
				querylist="intendeduserlist_all_branch";
				System.out.println("intendeduserlist_all_branch");
				String sql=CustomSQLUtil.get(querylist);
				System.out.println("Values : " +values.toString());
				sql = StringUtil.replace(sql, "[$branchdata$]", newValue);
				query = session.createSQLQuery(sql);
				QueryPos pos = QueryPos.getInstance(query);
				
			
					pos.add(gender);
				
				/*pos.add(gender.toUpperCase());
				pos.add(values);*/
				List<Object[]> list = query.list();
			    Iterator it=list.iterator();
				System.out.println("List size....." + list.size());
				return query.list();
			}
			else if (option.equalsIgnoreCase("Branch") && age.startsWith("Between")) {
				System.out.println("Original Age : "+age);
				String[] ageValues = age.split(" ");
				String ageFrom=ageValues[1];
				System.out.println("Age from : "+ageFrom);
				String ageTo=ageValues[3];
				System.out.println("Age to :"+ageTo);
				querylist="intendeduserlist_between_branch";
				System.out.println("intendeduserlist_between_branch");
				String sql=CustomSQLUtil.get(querylist);
				sql = StringUtil.replace(sql, "[$branchdata$]", newValue);
				query = session.createSQLQuery(sql);
				QueryPos pos = QueryPos.getInstance(query);
			
					pos.add(gender);
				
				pos.add(ageFrom);
				pos.add(ageTo);
				
				List<Object[]> list = query.list();
			    Iterator it=list.iterator();
				System.out.println("List size....." + list.size());
				return query.list();
			}
			else if (option.equalsIgnoreCase("Branch") && age.startsWith("Greater than")) {
				age=age.substring(age.lastIndexOf(" ") + 1);
				System.out.println("age : "+age);
				querylist="intendeduserlist_greaterthan_branch";
				System.out.println("intendeduserlist_greaterthan_branch");
				String sql=CustomSQLUtil.get(querylist);
				System.out.println("Values : " +values.toString());
				sql = StringUtil.replace(sql, "[$branchdata$]", newValue);
				query = session.createSQLQuery(sql);
				QueryPos pos = QueryPos.getInstance(query);
			
					pos.add(gender);
				
				pos.add(age);
				List<Object[]> list = query.list();
			    Iterator it=list.iterator();
				System.out.println("List size....." + list.size());
				return query.list();
			}
			else if (option.equalsIgnoreCase("Branch") && age.startsWith("Less than")) {
				System.out.println("intendeduserlist_lessthan_branch");
				age=age.substring(age.lastIndexOf(" ") + 1);
				querylist="intendeduserlist_lessthan_branch";
				
				String sql=CustomSQLUtil.get(querylist);
				System.out.println("Values : " +values.toString());
				sql = StringUtil.replace(sql, "[$branchdata$]", newValue);
				query = session.createSQLQuery(sql);
				QueryPos pos = QueryPos.getInstance(query);
				
					pos.add(gender);
				
				
				pos.add(age);
				List<Object[]> list = query.list();
			    Iterator it=list.iterator();
				System.out.println("List size....." + list.size());
				return query.list();	
			}
			//Intended User List for Grade From activeemployeeinfo
			
			
			else if (option.equalsIgnoreCase("Grade") && age.equalsIgnoreCase("all")) {
				age=null;
				querylist="intendeduserlist_all_grade";
				System.out.println("intendeduserlist_all_grade");
				String sql=CustomSQLUtil.get(querylist);
				System.out.println("Values : " +values.toString());
				sql = StringUtil.replace(sql, "[$gradedata$]", newValue);
				query = session.createSQLQuery(sql);
				QueryPos pos = QueryPos.getInstance(query);
				
				
					pos.add(gender);
				
				/*pos.add(gender.toUpperCase());
				pos.add(values);*/
				List<Object[]> list = query.list();
			    Iterator it=list.iterator();
				System.out.println("List size....." + list.size());
				return query.list();
			}
			else if (option.equalsIgnoreCase("Grade") && age.startsWith("Between")) {
				System.out.println("Original Age : "+age);
				String[] ageValues = age.split(" ");
				String ageFrom=ageValues[1];
				System.out.println("Age from : "+ageFrom);
				String ageTo=ageValues[3];
				System.out.println("Age to :"+ageTo);
				querylist="intendeduserlist_between_grade";
				System.out.println("intendeduserlist_between_grade");
				String sql=CustomSQLUtil.get(querylist);
				sql = StringUtil.replace(sql, "[$gradedata$]", newValue);
				query = session.createSQLQuery(sql);
				QueryPos pos = QueryPos.getInstance(query);
			
					pos.add(gender);
				
				pos.add(ageFrom);
				pos.add(ageTo);
				
				List<Object[]> list = query.list();
			    Iterator it=list.iterator();
				System.out.println("List size....." + list.size());
				return query.list();
			}
			else if (option.equalsIgnoreCase("Grade") && age.startsWith("Greater than")) {
				age=age.substring(age.lastIndexOf(" ") + 1);
				System.out.println("age : "+age);
				querylist="intendeduserlist_greaterthan_grade";
				System.out.println("intendeduserlist_greaterthan_grade");
				String sql=CustomSQLUtil.get(querylist);
				System.out.println("Values : " +values.toString());
				sql = StringUtil.replace(sql, "[$gradedata$]", newValue);
				query = session.createSQLQuery(sql);
				QueryPos pos = QueryPos.getInstance(query);
			
					pos.add(gender);
				
				pos.add(age);
				List<Object[]> list = query.list();
			    Iterator it=list.iterator();
				System.out.println("List size....." + list.size());
				return query.list();
			}
			else if (option.equalsIgnoreCase("Grade") && age.startsWith("Less than")) {
				System.out.println("intendeduserlist_lessthan_grade");
				age=age.substring(age.lastIndexOf(" ") + 1);
				querylist="intendeduserlist_lessthan_grade";
				
				String sql=CustomSQLUtil.get(querylist);
				System.out.println("Values : " +values.toString());
				sql = StringUtil.replace(sql, "[$gradedata$]", newValue);
				query = session.createSQLQuery(sql);
				QueryPos pos = QueryPos.getInstance(query);
				
					pos.add(gender);
				
				
				pos.add(age);
				List<Object[]> list = query.list();
			    Iterator it=list.iterator();
				System.out.println("List size....." + list.size());
				return query.list();
			}
			//Intended User List for Region From activeemployeeinfo
			
			
			else if (option.equalsIgnoreCase("Region") && age.equalsIgnoreCase("all")) {
				age=null;
				querylist="intendeduserlist_all_region";
				System.out.println("intendeduserlist_all_region");
				String sql=CustomSQLUtil.get(querylist);
				System.out.println("Values : " +values.toString());
				sql = StringUtil.replace(sql, "[$regiondata$]", newValue);
				query = session.createSQLQuery(sql);
				QueryPos pos = QueryPos.getInstance(query);
				
			
					pos.add(gender);
				
				/*pos.add(gender.toUpperCase());
				pos.add(values);*/
				List<Object[]> list = query.list();
			    Iterator it=list.iterator();
				System.out.println("List size....." + list.size());
				return query.list();
			}
			else if (option.equalsIgnoreCase("Region") && age.startsWith("Between")) {
				System.out.println("Original Age : "+age);
				String[] ageValues = age.split(" ");
				String ageFrom=ageValues[1];
				System.out.println("Age from : "+ageFrom);
				String ageTo=ageValues[3];
				System.out.println("Age to :"+ageTo);
				querylist="intendeduserlist_between_region";
				System.out.println("intendeduserlist_between_region");
				String sql=CustomSQLUtil.get(querylist);
				sql = StringUtil.replace(sql, "[$regiondata$]", newValue);
				query = session.createSQLQuery(sql);
				QueryPos pos = QueryPos.getInstance(query);
			
					pos.add(gender);
				
				pos.add(ageFrom);
				pos.add(ageTo);
				
				List<Object[]> list = query.list();
			    Iterator it=list.iterator();
				System.out.println("List size....." + list.size());
				return query.list();
			}
			else if (option.equalsIgnoreCase("Region") && age.startsWith("Greater than")) {
				age=age.substring(age.lastIndexOf(" ") + 1);
				System.out.println("age : "+age);
				querylist="intendeduserlist_greaterthan_region";
				System.out.println("intendeduserlist_greaterthan_region");
				String sql=CustomSQLUtil.get(querylist);
				System.out.println("Values : " +values.toString());
				sql = StringUtil.replace(sql, "[$regiondata$]", newValue);
				query = session.createSQLQuery(sql);
				QueryPos pos = QueryPos.getInstance(query);
			
					pos.add(gender);
				
				pos.add(age);
				List<Object[]> list = query.list();
			    Iterator it=list.iterator();
				System.out.println("List size....." + list.size());
				return query.list();
			}
			else if (option.equalsIgnoreCase("Region") && age.startsWith("Less than")) {
				System.out.println("intendeduserlist_lessthan_region");
				age=age.substring(age.lastIndexOf(" ") + 1);
				querylist="intendeduserlist_lessthan_region";
				
				String sql=CustomSQLUtil.get(querylist);
				System.out.println("Values : " +values.toString());
				sql = StringUtil.replace(sql, "[$regiondata$]", newValue);
				query = session.createSQLQuery(sql);
				QueryPos pos = QueryPos.getInstance(query);
				
					pos.add(gender);
				
				
				pos.add(age);
				List<Object[]> list = query.list();
			    Iterator it=list.iterator();
				System.out.println("List size....." + list.size());
				return query.list();
			}
			//Intended User List for Location From activeemployeeinfo
			
			else if (option.equalsIgnoreCase("Location") && age.equalsIgnoreCase("all")) {
				age=null;
				querylist="intendeduserlist_all_location";
				System.out.println("intendeduserlist_all_location");
				String sql=CustomSQLUtil.get(querylist);
				System.out.println("Values : " +values.toString());
				sql = StringUtil.replace(sql, "[$locationdata$]", newValue);
				query = session.createSQLQuery(sql);
				QueryPos pos = QueryPos.getInstance(query);
				
				
					pos.add(gender);
				
				/*pos.add(gender.toUpperCase());
				pos.add(values);*/
				List<Object[]> list = query.list();
			    Iterator it=list.iterator();
				System.out.println("List size....." + list.size());
				return query.list();
			}
			else if (option.equalsIgnoreCase("Location") && age.startsWith("Between")) {
				System.out.println("Original Age : "+age);
				String[] ageValues = age.split(" ");
				String ageFrom=ageValues[1];
				System.out.println("Age from : "+ageFrom);
				String ageTo=ageValues[3];
				System.out.println("Age to :"+ageTo);
				querylist="intendeduserlist_between_location";
				System.out.println("intendeduserlist_between_location");
				String sql=CustomSQLUtil.get(querylist);
				sql = StringUtil.replace(sql, "[$locationdata$]", newValue);
				query = session.createSQLQuery(sql);
				QueryPos pos = QueryPos.getInstance(query);
			
					pos.add(gender);
				
				pos.add(ageFrom);
				pos.add(ageTo);
				
				List<Object[]> list = query.list();
			    Iterator it=list.iterator();
				System.out.println("List size....." + list.size());
				return query.list();
			}
			else if (option.equalsIgnoreCase("Location") && age.startsWith("Greater than")) {
				age=age.substring(age.lastIndexOf(" ") + 1);
				System.out.println("age : "+age);
				querylist="intendeduserlist_greaterthan_location";
				System.out.println("intendeduserlist_greaterthan_location");
				String sql=CustomSQLUtil.get(querylist);
				System.out.println("Values : " +values.toString());
				sql = StringUtil.replace(sql, "[$locationdata$]", newValue);
				query = session.createSQLQuery(sql);
				QueryPos pos = QueryPos.getInstance(query);
			
					pos.add(gender);
				
				pos.add(age);
				List<Object[]> list = query.list();
			    Iterator it=list.iterator();
				System.out.println("List size....." + list.size());
				return query.list();
			}
			else if (option.equalsIgnoreCase("Location") && age.startsWith("Less than")) {
				System.out.println("intendeduserlist_lessthan_location");
				age=age.substring(age.lastIndexOf(" ") + 1);
				querylist="intendeduserlist_lessthan_location";
				
				String sql=CustomSQLUtil.get(querylist);
				System.out.println("Values : " +values.toString());
				sql = StringUtil.replace(sql, "[$locationdata$]", newValue);
				query = session.createSQLQuery(sql);
				QueryPos pos = QueryPos.getInstance(query);
				
					pos.add(gender);
				
				
				pos.add(age);
				List<Object[]> list = query.list();
			    Iterator it=list.iterator();
				System.out.println("List size....." + list.size());
				return query.list();
			}
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
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
				System.out.println("query_for_businessname");
				String sql=CustomSQLUtil.get(querylist);
				query = session.createSQLQuery(sql);
				QueryPos pos = QueryPos.getInstance(query);
			
					pos.add(businessId);
			
				/*pos.add(gender.toUpperCase());
				pos.add(values);*/
				List<String> list = query.list();	
				System.out.println("Business Name : "+list.get(0));
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
				System.out.println("alluserlist_all");
				String sql=CustomSQLUtil.get(querylist);
				query = session.createSQLQuery(sql);
				QueryPos pos = QueryPos.getInstance(query);
					pos.add(businessName);
					pos.add(gender);
			
				/*pos.add(gender.toUpperCase());
				pos.add(values);*/
				List<Object[]> list = query.list();
			    Iterator it=list.iterator();
				System.out.println("List size....." + list.size());
				return query.list();

			}
			
			else if(option.equalsIgnoreCase("All User") && age.startsWith("Between")){
			
				System.out.println("Original Age : "+age);
				String[] ageValues = age.split(" ");
				String ageFrom=ageValues[1];
				System.out.println("Age from : "+ageFrom);
				String ageTo=ageValues[3];
				System.out.println("Age to :"+ageTo);
				querylist="alluserlist_between";
				System.out.println("alluserlist_between");
				String sql=CustomSQLUtil.get(querylist);
				
				query = session.createSQLQuery(sql);
				QueryPos pos = QueryPos.getInstance(query);
				pos.add(businessName);
				pos.add(gender);
				pos.add(ageFrom);
				pos.add(ageTo);
				
				List<Object[]> list = query.list();
			    Iterator it=list.iterator();
				System.out.println("List size....." + list.size());
				return query.list();
			
			}
			
			else if(option.equalsIgnoreCase("All User") && age.startsWith("Greater than")){
				age=age.substring(age.lastIndexOf(" ") + 1);
				System.out.println("age : "+age);
				querylist="alluserlist_greaterthan";
				System.out.println("alluserlist_greaterthan");
				String sql=CustomSQLUtil.get(querylist);
				query = session.createSQLQuery(sql);
				QueryPos pos = QueryPos.getInstance(query);
				pos.add(businessName);
				pos.add(gender);
				pos.add(age);
				List<Object[]> list = query.list();
			    Iterator it=list.iterator();
				System.out.println("List size....." + list.size());
				return query.list();
			
			}
			else if(option.equalsIgnoreCase("All User") && age.startsWith("Less than")){
				age=age.substring(age.lastIndexOf(" ") + 1);
				System.out.println("age : "+age);
				querylist="alluserlist_lessthan";
				System.out.println("alluserlist_lessthan");
				String sql=CustomSQLUtil.get(querylist);
				query = session.createSQLQuery(sql);
				QueryPos pos = QueryPos.getInstance(query);
				pos.add(businessName);
				pos.add(gender);
				pos.add(age);
				List<Object[]> list = query.list();
			    Iterator it=list.iterator();
				System.out.println("List size....." + list.size());
				return query.list();
			
			}
		
		}catch(Exception e){
		e.printStackTrace();
		}
		return null;
	}
}
