package com.chola.conferenceroombooking.service.persistence.impl;

import java.util.Collections;
import java.util.List;

import com.chola.conferenceroombooking.service.persistence.locationFinder;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.SQLQuery;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.util.dao.orm.CustomSQLUtil;

public class locationFinderImpl  extends locationFinderBaseImpl implements locationFinder
{
	private static Log logger = LogFactoryUtil.getLog(locationFinderImpl.class);
	public List<String> getState()
	{
	Session session = null;
	try
	{
	session = openSession();
	String sql=CustomSQLUtil.get("StateCalls");
	SQLQuery query = session.createSQLQuery(sql);
	List<Object[]> list = query.list();
	logger.info("In state call action class>>>>");
	//System.out.println("State List size....." + list.size());
	return query.list();
	}
	catch(Exception e)
	{
		logger.info("contextt",e);
	//e.printStackTrace();
	}
	finally
	{
	closeSession(session);
	}
	return Collections.emptyList();
	//return null;
	}
	
	public String getStatename(long stateId)
	{
		logger.info("In state call action class>>>>>>");
		//System.out.println("In locationfinder getStatename.."+stateId);
	Session session = null;
	try
	{
	session = openSession();
	String sql=CustomSQLUtil.get("statelist");
	
	SQLQuery query = session.createSQLQuery(sql);
	logger.info("In state call action class>>>");
	//System.out.println(query);
	QueryPos pos=QueryPos.getInstance(query);
	logger.info(" pos "+ pos);
	//System.out.println( pos);
	pos.add(stateId);
	List<Object[]> list = query.list();
	logger.info("City List size  " + list.size());
	//System.out.println("City List size....." + list.size());
	return (String) query.uniqueResult();
	}
	catch(Exception e1)
	{
		logger.info("contexttt",e1);
	//e.printStackTrace();
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
		logger.info("State Id :"+stateId);
		//System.out.println("State Id :"+stateId);
	session = openSession();
	String sql=CustomSQLUtil.get("locationlist");
	
	SQLQuery query = session.createSQLQuery(sql);
	logger.info("query "+query);
	//System.out.println(query);
	QueryPos pos=QueryPos.getInstance(query);
	logger.info("pos  "+pos);
	//System.out.println( pos);
	pos.add(stateId);
	List<Object[]> list = query.list();
	logger.info("City List size....." + list.size());
	//System.out.println("City List size....." + list.size());
	return query.list();
	}
	catch(Exception e)
	{
		logger.info("contextttt",e);
	}
	finally
	{
	closeSession(session);
	}
	//return null;
	return Collections.emptyList();
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
	logger.info("State List size....." + list.size());
	//System.out.println("State List size....." + list.size());
	return query.list();
	}
	catch(Exception e)
	{
		logger.info("contexttttt",e);
	}
	finally
	{
	closeSession(session);
	}
	return Collections.emptyList();
	}
	
	public String getroomvalues(long roomId)
	{
		
	Session session = null;
	try
	{
	session = openSession();
	String sql=CustomSQLUtil.get("roomvalueslist");
	
	SQLQuery query = session.createSQLQuery(sql);
	logger.info("query "+query);
	//System.out.println(query);
	QueryPos pos=QueryPos.getInstance(query);
	logger.info("pos....."+pos);
	//System.out.println( pos);
	pos.add(roomId);
	List<Object[]> list = query.list();
	logger.info("City List size>>" + list.size());
	//System.out.println("City List size....." + list.size());
	return (String) query.uniqueResult();
	}
	catch(Exception e)
	{
		logger.info("contextt",e);
	}
	finally
	{
	closeSession(session);
	}
	return null;
}
	public String getlocationname(long locationId)
	{
		logger.info("In locationfinder getStatename.."+locationId);
		//System.out.println("In locationfinder getStatename.."+locationId);
	Session session = null;
	try
	{
	session = openSession();
	String sql=CustomSQLUtil.get("locationnamelist");
	
	SQLQuery query = session.createSQLQuery(sql);
	logger.info("query....."+query);
	//System.out.println(query);
	QueryPos pos=QueryPos.getInstance(query);
	logger.info("pos....."+pos);
	//System.out.println( pos);
	pos.add(locationId);
	List<Object[]> list = query.list();
	logger.info("In state call action class.....");
	//System.out.println("City List size....." + list.size());
	return (String) query.uniqueResult();
	}
	catch(Exception e)
	{
		logger.info("context",e);
	}
	finally
	{
	closeSession(session);
	}
	return null;
}
	public String getfloorname(long floorId)
	{
		logger.info("In state call action class.....");
		//System.out.println("In locationfinder getStatename.."+floorId);
	Session session = null;
	try
	{
	session = openSession();
	String sql=CustomSQLUtil.get("floornamelist");
	
	SQLQuery query = session.createSQLQuery(sql);
	logger.info(query);
	//System.out.println(query);
	QueryPos pos=QueryPos.getInstance(query);
	logger.info(pos);
	//System.out.println( pos);
	pos.add(floorId);
	List<Object[]> list = query.list();
	logger.info("City List size....." + list.size());
	//System.out.println("City List size....." + list.size());
	return (String) query.uniqueResult();
	}
	catch(Exception e)
	{
		logger.info("context",e);
	}
	finally
	{
	closeSession(session);
	}
	return null;
}
}
