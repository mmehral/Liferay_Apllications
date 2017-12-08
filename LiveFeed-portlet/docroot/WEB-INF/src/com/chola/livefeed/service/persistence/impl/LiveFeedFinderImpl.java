package com.chola.livefeed.service.persistence.impl;

import java.util.List;

import com.chola.livefeed.service.persistence.LiveFeedFinder;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.SQLQuery;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.util.dao.orm.CustomSQLUtil;

public class LiveFeedFinderImpl extends LiveFeedFinderBaseImpl
implements LiveFeedFinder{
	public  List<String> getContentLiveNews()
	{
		Session session = null;
		try
		{
	    session = openSession();
		String sql=CustomSQLUtil.get("contentlivenewslist");
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
	
	public  List<String> getLiveContent(String createdate)
	{
		Session session = null;
		try
		{
	    session = openSession();
		String sql=CustomSQLUtil.get("contentlivelist");
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
	
	public  boolean getduplicate(String createdate)
	{
		boolean data = false;
		Session session = null;
		try
		{
	    session = openSession();
		String sql=CustomSQLUtil.get("duplicatelist");
			SQLQuery query = session.createSQLQuery(sql);
			QueryPos pos=QueryPos.getInstance(query);
			pos.add(createdate);
			//List<String> s=query.list();
			List<Object[]> list = query.list();
		System.out.println("Product List size....." + list.size());
			if(list.size()>=1)
			{
				data = true;
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			closeSession(session);
		}
		return data;
	}
}
