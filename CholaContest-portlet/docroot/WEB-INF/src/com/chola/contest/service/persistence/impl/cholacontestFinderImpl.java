package com.chola.contest.service.persistence.impl;

import java.util.List;

import com.chola.contest.service.persistence.cholacontestFinder;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.SQLQuery;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.util.dao.orm.CustomSQLUtil;

public class cholacontestFinderImpl extends cholacontestFinderBaseImpl implements cholacontestFinder {

	
	public List<Object[]> ContestList(){
		Session session = null;
		try {
			session = openSession();
			String sql = CustomSQLUtil.get("contestlist");
			SQLQuery queryObject = session.createSQLQuery(sql);
			queryObject.setCacheable(false);
			QueryPos qPos = QueryPos.getInstance(queryObject);
			return (List<Object[]>) queryObject.list();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			closeSession(session);
		}
		return null;
	}
	
	public Integer getContestType(String id){
		Session session = null;
		try {
			session = openSession();
			String sql = CustomSQLUtil.get("contestval");
			SQLQuery queryObject = session.createSQLQuery(sql);
			queryObject.setCacheable(false);
			QueryPos qPos = QueryPos.getInstance(queryObject);
			qPos.add(id);
			return (Integer) queryObject.uniqueResult();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			closeSession(session);
		}
		return null;	
	}
	
	public String getEmpIdFromUID(String uid){
		Session session = null;
		try {
			session = openSession();
			String sql = CustomSQLUtil.get("empidfromuid");
			SQLQuery queryObject = session.createSQLQuery(sql);
			queryObject.setCacheable(false);
			QueryPos qPos = QueryPos.getInstance(queryObject);
			qPos.add(uid);
			return  (String) queryObject.uniqueResult();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		} finally {
			closeSession(session);
		}
		
	}
}
