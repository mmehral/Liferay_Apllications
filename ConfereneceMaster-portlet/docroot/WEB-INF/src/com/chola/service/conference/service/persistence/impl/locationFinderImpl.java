package com.chola.service.conference.service.persistence.impl;

import java.util.List;

import com.chola.service.conference.service.persistence.locationFinder;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.SQLQuery;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.util.dao.orm.CustomSQLUtil;

public class locationFinderImpl  extends locationFinderBaseImpl implements locationFinder
{
	
	public List<String> getState()
	{
	Session session = null;
	try
	{
	session = openSession();
	String sql=CustomSQLUtil.get("StateCall");
	SQLQuery query = session.createSQLQuery(sql);
	List<Object[]> list = query.list();
	System.out.println("State List size....." + list.size());
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
	
	public String getStatename(long stateId)
	{
		System.out.println("In locationfinder getStatename.."+stateId);
	Session session = null;
	try
	{
	session = openSession();
	String sql=CustomSQLUtil.get("statelist");
	
	SQLQuery query = session.createSQLQuery(sql);
	System.out.println(query);
	QueryPos pos=QueryPos.getInstance(query);
	System.out.println( pos);
	pos.add(stateId);
	List<Object[]> list = query.list();
	System.out.println("City List size....." + list.size());
	return (String) query.uniqueResult();
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
	public List<String> getlocations(long stateId)
	{
	Session session = null;
	try
	{
		System.out.println("State Id :"+stateId);
	session = openSession();
	String sql=CustomSQLUtil.get("locationlist");
	
	SQLQuery query = session.createSQLQuery(sql);
	System.out.println(query);
	QueryPos pos=QueryPos.getInstance(query);
	System.out.println( pos);
	pos.add(stateId);
	List<Object[]> list = query.list();
	System.out.println("City List size....." + list.size());
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
	
	public List<String> getfloorname()
	{
	Session session = null;
	try
	{
	session = openSession();
	String sql=CustomSQLUtil.get("floorlist");
	SQLQuery query = session.createSQLQuery(sql);
	List<Object[]> list = query.list();
	System.out.println("State List size....." + list.size());
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
	
	public String getroomvalues(long roomId)
	{
		
	Session session = null;
	try
	{
	session = openSession();
	String sql=CustomSQLUtil.get("roomvalueslist");
	
	SQLQuery query = session.createSQLQuery(sql);
	System.out.println(query);
	QueryPos pos=QueryPos.getInstance(query);
	System.out.println( pos);
	pos.add(roomId);
	List<Object[]> list = query.list();
	System.out.println("City List size....." + list.size());
	return (String) query.uniqueResult();
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
	public String getlocationname(long locationId)
	{
		System.out.println("In locationfinder getStatename.."+locationId);
	Session session = null;
	try
	{
	session = openSession();
	String sql=CustomSQLUtil.get("locationnamelist");
	
	SQLQuery query = session.createSQLQuery(sql);
	System.out.println(query);
	QueryPos pos=QueryPos.getInstance(query);
	System.out.println( pos);
	pos.add(locationId);
	List<Object[]> list = query.list();
	System.out.println("City List size....." + list.size());
	return (String) query.uniqueResult();
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
	public String getfloorname(long floorId)
	{
		System.out.println("In locationfinder getStatename.."+floorId);
	Session session = null;
	try
	{
	session = openSession();
	String sql=CustomSQLUtil.get("floornamelist");
	
	SQLQuery query = session.createSQLQuery(sql);
	System.out.println(query);
	QueryPos pos=QueryPos.getInstance(query);
	System.out.println( pos);
	pos.add(floorId);
	List<Object[]> list = query.list();
	System.out.println("City List size....." + list.size());
	return (String) query.uniqueResult();
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
