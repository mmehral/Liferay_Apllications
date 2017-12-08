package com.chola.business.service.persistence.impl;

import java.util.Iterator;
import java.util.List;

import com.chola.business.service.persistence.businesssopDetailsFinder;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.SQLQuery;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.util.dao.orm.CustomSQLUtil;

public class businesssopDetailsFinderImpl extends businesssopDetailsFinderBaseImpl implements businesssopDetailsFinder {

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
