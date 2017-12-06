package com.chola.msappointment.service.persistence.impl;

import java.util.Iterator;
import java.util.List;

import com.chola.msappointment.service.persistence.calendarmsappointmentFinder;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.SQLQuery;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.util.dao.orm.CustomSQLUtil;

public class calendarmsappointmentFinderImpl extends calendarmsappointmentFinderBaseImpl implements calendarmsappointmentFinder {

	
	public List<String> getEmailIdsFromUserTable()
	{
		Session session = null;
		try
		{		
			session = openSession();
			String sql=CustomSQLUtil.get("getEmailIdsFromRHDSUserTable");
			SQLQuery query = session.createSQLQuery(sql);
			QueryPos pos = QueryPos.getInstance(query);
			List<Object[]> list = query.list();
		    Iterator it=list.iterator();
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
	
	public String getScreenNameFromTable(String empId)
	{
		Session session = null;
		try
		{		
			session = openSession();
			String sql=CustomSQLUtil.get("getScreenNameFromTable");
			SQLQuery query = session.createSQLQuery(sql);
			QueryPos pos = QueryPos.getInstance(query);
			pos.add(empId);
			return (String) query.uniqueResult();
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return null;
		}
		finally {
			closeSession(session);
		}
		
}
	
}
