package com.chola.anniversary.service.persistence.impl;


import com.chola.anniversary.service.persistence.anniversarywishFinder;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.SQLQuery;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.util.dao.orm.CustomSQLUtil;

import java.util.Date;
import java.util.List;


public class anniversarywishFinderImpl extends anniversarywishFinderBaseImpl
implements anniversarywishFinder{

	public boolean insertData(String message,String postedBy,String postedOn)
	{
		boolean flag=false;
		Session session = null;
		try
		{		
			session = openSession();
			String sql=CustomSQLUtil.get("insertlist");
			SQLQuery query = session.createSQLQuery(sql);
			QueryPos pos = QueryPos.getInstance(query);
			pos.add(postedOn);
			pos.add(postedBy);
			pos.add(message);
			pos.add("ANNIVERSARY");
			pos.add(new Date());
			int id = query.executeUpdate();
			if(id>=1)
			{
				flag = true;
			}
			System.out.println("ID : "+id);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally {
			closeSession(session);
		}
		return flag;
}
	
	public List getEmpData(String date) {
		Session session = null;
		try {
			session = openSession();
			String sql = CustomSQLUtil.get("empdata");
			SQLQuery queryObject = session.createSQLQuery(sql);
			queryObject.setCacheable(false);
			QueryPos qPos = QueryPos.getInstance(queryObject);
			qPos.add("%"+date+"%");
			return queryObject.list();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			closeSession(session);
		}
		return null;
	}
	
}