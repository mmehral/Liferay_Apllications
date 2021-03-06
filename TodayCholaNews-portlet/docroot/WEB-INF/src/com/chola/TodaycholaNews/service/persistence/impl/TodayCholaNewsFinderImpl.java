package com.chola.TodaycholaNews.service.persistence.impl;

import java.util.List;

import com.chola.TodaycholaNews.service.persistence.TodayCholaNewsFinder;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.SQLQuery;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.util.dao.orm.CustomSQLUtil;

public class TodayCholaNewsFinderImpl extends TodayCholaNewsFinderBaseImpl
implements TodayCholaNewsFinder{
	public  List<String> getContent(String createdate)
	{
		Session session = null;
		try
		{
	    session = openSession();
		String sql=CustomSQLUtil.get("contentlist");
			SQLQuery query = session.createSQLQuery(sql);
			QueryPos pos=QueryPos.getInstance(query);
			pos.add(createdate);
			//List<String> s=query.list();
			List<Object[]> list = query.list();
		System.out.println("Product List size....." + list.size());
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
	

	public  List<String> getContentNews()
	{
		System.out.println("LATEST==NEWS======");
		Session session = null;
		try
		{
	    session = openSession();
		String sql=CustomSQLUtil.get("contentnewslist");
			SQLQuery query = session.createSQLQuery(sql);
			List<Object[]> list = query.list();
		System.out.println("Product List size....." + list.size());
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
