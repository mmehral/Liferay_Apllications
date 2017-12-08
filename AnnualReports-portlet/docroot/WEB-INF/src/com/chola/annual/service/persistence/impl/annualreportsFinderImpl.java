package com.chola.annual.service.persistence.impl;

import java.util.List;

import com.chola.annual.service.persistence.annualreportsFinder;
import com.liferay.portal.kernel.dao.orm.SQLQuery;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.util.dao.orm.CustomSQLUtil;

public class annualreportsFinderImpl extends annualreportsFinderBaseImpl implements annualreportsFinder
{
	public  List<String> getdata()
	{
		Session session = null;
		try
		{
	    session = openSession();
		String sql=CustomSQLUtil.get("getdatalist");
			SQLQuery query = session.createSQLQuery(sql);
			List<Object[]> list = query.list();
		System.out.println("data size....." + list.size());
		return query.list();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			closeSession(session);
		}
		return null;
	}
	
}
