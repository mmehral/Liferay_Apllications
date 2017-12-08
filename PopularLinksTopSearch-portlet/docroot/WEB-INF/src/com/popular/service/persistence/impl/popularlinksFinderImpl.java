package com.popular.service.persistence.impl;

import java.util.List;

import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.SQLQuery;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.util.dao.orm.CustomSQLUtil;
import com.popular.service.persistence.popularlinksFinder;

public class popularlinksFinderImpl extends popularlinksFinderBaseImpl
implements popularlinksFinder{
	private static Log logger = LogFactoryUtil.getLog(popularlinksFinderImpl.class);
	
	public boolean findurl(String url,long userid) {
		boolean flag = false;
		Session session = null;
		try {
			session = openSession();
			String sql = CustomSQLUtil.get("urlcheck");
			SQLQuery queryObject = session.createSQLQuery(sql);
			queryObject.setCacheable(false);
			QueryPos qPos = QueryPos.getInstance(queryObject);
			qPos.add(url);
			qPos.add(userid);
			long value = queryObject.list().size();
			if (value != 0) {
				flag = true;
			}
			logger.info("flag set========" + flag);

			return flag;
		} catch (Exception e) {
			logger.error("Error : ",e);
		} finally {
			closeSession(session);
		}
		return flag;
	}
	
	public Object[] fetchvalue(String url, long userid) {
		Session session = null;
		try {
			session = openSession();
			String sql = CustomSQLUtil.get("countval");
			SQLQuery queryObject = session.createSQLQuery(sql);
			queryObject.setCacheable(false);
			QueryPos qPos = QueryPos.getInstance(queryObject);
			qPos.add(url);
			qPos.add(userid);
			return (Object[]) queryObject.uniqueResult();
		} catch (Exception e) {
			logger.error("Error : ",e);
		} finally {
			closeSession(session);
		}

		return null;
	}

	//External Link Method
	public boolean findexternalurl(String url,long userid) {
		boolean flag = false;
		Session session = null;
		try {
			session = openSession();
			String sql = CustomSQLUtil.get("externalurlcheck");
			SQLQuery queryObject = session.createSQLQuery(sql);
			queryObject.setCacheable(false);
			QueryPos qPos = QueryPos.getInstance(queryObject);
			qPos.add(url);
			qPos.add(userid);
			long value = queryObject.list().size();
			if (value != 0) {
				flag = true;
			}
			logger.info("flag set========" + flag);

			return flag;
		} catch (Exception e) {
			logger.error("Error : ",e);
		} finally {
			closeSession(session);
		}
		return flag;
	}
	
	//Fetch Internal Links 
	
	public List<Object[]> getinternallinks(long userid) {
		boolean flag = false;
		Session session = null;
		try {
			session = openSession();
			String sql = CustomSQLUtil.get("internalurlfetch");
			SQLQuery queryObject = session.createSQLQuery(sql);
			queryObject.setCacheable(false);
			QueryPos qPos = QueryPos.getInstance(queryObject);
			qPos.add(userid);
			
			return (List<Object[]>) queryObject.list();
		} catch (Exception e) {
			logger.error("Error : ",e);
		} finally {
			closeSession(session);
		}
		return null;
	}
	
	public List<Object[]> getExternallinks(long userid) {
		boolean flag = false;
		Session session = null;
		try {
			session = openSession();
			String sql = CustomSQLUtil.get("externalurlfetch");
			SQLQuery queryObject = session.createSQLQuery(sql);
			queryObject.setCacheable(false);
			QueryPos qPos = QueryPos.getInstance(queryObject);
			qPos.add(userid);
			
			return (List<Object[]>) queryObject.list();
		} catch (Exception e) {
			logger.error("Error : ",e);
		} finally {
			closeSession(session);
		}
		return null;
	}
	
	
	public List<Object[]> getExtLinks() {
		boolean flag = false;
		Session session = null;
		try {
			session = openSession();
			String sql = CustomSQLUtil.get("presearch");
			SQLQuery queryObject = session.createSQLQuery(sql);
			//queryObject.setCacheable(false);
			logger.info(queryObject.list().size());
			return queryObject.list();
		} catch (Exception e) {
			logger.error("Error : ",e);
		} finally {
			closeSession(session);
		}
		return null;
	} 
	
	public String externalurl(String url) {
	
		Session session = null;
		try {
			session = openSession();
			String sql = CustomSQLUtil.get("exturlft");
			SQLQuery queryObject = session.createSQLQuery(sql);
			queryObject.setCacheable(false);
			QueryPos qPos = QueryPos.getInstance(queryObject);
			qPos.add(url);		

			return (String) queryObject.uniqueResult();
		} catch (Exception e) {
			logger.error("Error : ",e);
		} finally {
			closeSession(session);
		}
		return null;
	}
}
