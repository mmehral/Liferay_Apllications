package com.chola.calendar.service.persistence.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.chola.calendar.model.EmpInfoEntity;
import com.chola.calendar.service.EmpInfoEntityLocalServiceUtil;
import com.chola.calendar.service.persistence.eventcalendarFinder;
import com.liferay.portal.kernel.dao.orm.Criterion;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.RestrictionsFactoryUtil;
import com.liferay.portal.kernel.dao.orm.SQLQuery;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.portlet.PortletClassLoaderUtil;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.util.dao.orm.CustomSQLUtil;

public class eventcalendarFinderImpl extends eventcalendarFinderBaseImpl implements eventcalendarFinder{

	public List twoParams(String[] gender, String[] age)
	{
		Session session = null;
		try
		{	
			List list = new ArrayList();
			SQLQuery query;
			for(int i=0; i<gender.length ; i++)
			{
			age[0]="0";
			System.out.println( i+ " - "+gender[i].toUpperCase());
			session = openSession();
			String sql=CustomSQLUtil.get("twoParamsGreater");
			query = session.createSQLQuery(sql);
			QueryPos pos = QueryPos.getInstance(query);
			pos.add(gender[i].toUpperCase());
			pos.add(Integer.parseInt(age[0]));
			list.add(query.list());
			}
			System.out.println("Data : "+list.toString());
			return list;
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
	
	public List threeParams(String[] first, String[] second,String[] third)
	{
		Session session = null;
		try
		{	
			List list = new ArrayList();
			SQLQuery query;
			for(int i=0; i<first.length ; i++)
			{
			System.out.println( i+ " - "+first[i].toUpperCase());
			for(int j=0; j<second.length ; j++)
			{
				System.out.println( j+ " - "+second[j].toUpperCase());
				for(int k=0; k<third.length ; k++)
				{
					System.out.println( k+ " - "+third[k].toUpperCase());
				session = openSession();
				String sql=CustomSQLUtil.get("threeParams");
				query = session.createSQLQuery(sql);
				QueryPos pos = QueryPos.getInstance(query);
				pos.add(first[i].toUpperCase().replace("\"", ""));
				pos.add(second[j].toUpperCase().replace("\"", ""));
				pos.add(third[k].toUpperCase().replace("\"", ""));
				System.out.println("Val : "+query.list().toString());
				list.add(query.list());
				}
			}
			}
			System.out.println("Data : "+list.toString());
			return list;
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
	
	public List<String> getEvents(long userId)
	{
		Session session = null;
		try
		{		
			session = openSession();
			String sql=CustomSQLUtil.get("callist");
			SQLQuery query = session.createSQLQuery(sql);
			QueryPos pos = QueryPos.getInstance(query);
			pos.add(userId);
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
	
	public List<String> getLocation()
	{
		Session session = null;
		try
		{		
			session = openSession();
			String sql=CustomSQLUtil.get("loclist");
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
	
	public List<String> getDept()
	{
		Session session = null;
		try
		{		
			session = openSession();
			SQLQuery query = null;
			String sql=CustomSQLUtil.get("deptlist");
			query = session.createSQLQuery(sql);
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
	
	public List<String> getSubDept()
	{
		Session session = null;
		try
		{		
			session = openSession();
			String sql=CustomSQLUtil.get("subdeptlist");
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
	
	
	public List<String> getIntendedUser(String businessId, String[] values, String gender,String age, String option)
	{
		Session session = null;
		SQLQuery query =null;
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
				System.out.println("intendeduserlist_greaterthan");
				querylist="intendeduserlist_greaterthan";
				String ageFrom = age.substring(age.indexOf(" ") + 1);
				System.out.println("Age from : "+ageFrom);
				String ageTo = age.substring(age.lastIndexOf(" ") + 1); ;
				System.out.println("Age to :"+ageTo);
				querylist="intendeduserlist_between_unit";
				String sql=CustomSQLUtil.get(querylist);
				query = session.createSQLQuery(sql);
				QueryPos pos = QueryPos.getInstance(query);
				pos.add(gender.toUpperCase());
				pos.add(ageFrom);
				pos.add(ageTo);
				//pos.add(businessId);
				pos.add(values);
			}
			else if(option.equalsIgnoreCase("Unit") && age.equalsIgnoreCase("all"))
			{
				String value="'CLOVER','CHOLA'";
				System.out.println("Values : " +value);
				age=null;
				querylist="intendeduserlist_all_unit";
				System.out.println("intendeduserlist_all_unit");
				String sql=CustomSQLUtil.get(querylist);
				query = session.createSQLQuery(sql);
				QueryPos pos = QueryPos.getInstance(query);
				pos.add(gender);
				pos.add(values);
				List<Object[]> list = query.list();
			    Iterator it=list.iterator();
				System.out.println("List size....." + list.size());
				/*DynamicQuery dynamicQuery= DynamicQueryFactoryUtil.forClass(
						EmpInfoEntity.class).add(RestrictionsFactoryUtil.in("unit",values));
						//studentINOperator.add(RestrictionsFactoryUtil.eq("gender", gender));
						List<String> list = new ArrayList<String>();
						List<EmpInfoEntity> empList=EmpInfoEntityLocalServiceUtil.dynamicQuery(dynamicQuery);
						for(EmpInfoEntity emp:empList){
						System.out.println(emp.getUserid());
						list.add(emp.getUserid());
						}
						System.out.println(list.toString());
						return list;*/
			}
			else
			{
			if(option.equalsIgnoreCase("Unit") && age.startsWith("Less than"))
			{
				age=age.substring(age.lastIndexOf(" ") + 1);
				querylist="intendeduserlist_lessthan_unit";
				System.out.println("intendeduserlist_lessthan_unit");
			}
			else if(option.equalsIgnoreCase("Unit") && age.startsWith("Greater than"))
			{
				age=age.substring(age.lastIndexOf(" ") + 1);
				System.out.println("age : "+age);
				querylist="intendeduserlist_greaterthan_unit";
				System.out.println("intendeduserlist_greaterthan_unit");
			}
			
			String sql=CustomSQLUtil.get(querylist);
			query = session.createSQLQuery(sql);
			QueryPos pos = QueryPos.getInstance(query);
			//System.out.println("Gender : "+gender.toUpperCase()+" Age : "+age+" Values : "+values);
			pos.add(gender);
			pos.add(age);
			//pos.add(businessId);
			pos.add(values);
			}
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
	//On 15 April Ashish is addded by Notification code
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

public List<Object[]> SyscodeCustomMsg(int syscode) {
        boolean flag = false;
        Session session = null;
        try {
            session = openSession();
            String sql = CustomSQLUtil.get("syscode");
            SQLQuery queryObject = session.createSQLQuery(sql);
            queryObject.setCacheable(false);
            QueryPos qPos = QueryPos.getInstance(queryObject);
            qPos.add(syscode);
            
            return (List<Object[]>) queryObject.list();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            closeSession(session);
        }
        return null;
    }

	
}
