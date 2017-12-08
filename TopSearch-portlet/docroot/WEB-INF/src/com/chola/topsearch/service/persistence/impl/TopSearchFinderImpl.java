package com.chola.topsearch.service.persistence.impl;

import java.util.List;

import com.chola.topsearch.service.persistence.TopSearchFinder;
import com.liferay.portal.kernel.dao.orm.SQLQuery;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.util.dao.orm.CustomSQLUtil;

public class TopSearchFinderImpl extends TopSearchFinderBaseImpl 
implements TopSearchFinder{
	private static Log logger = LogFactoryUtil.getLog(TopSearchFinderImpl.class);
	public List<Object[]> gettoplinks() {
		boolean flag = false;
		Session session = null;
		try {
			session = openSession();
			String sql = CustomSQLUtil.get("topsearch");
			SQLQuery queryObject = session.createSQLQuery(sql);
			queryObject.setCacheable(false);
			return (List<Object[]>) queryObject.list();
		} catch (Exception e) {
			logger.error("Error : ",e);
		} finally {
			closeSession(session);
		}
		return null;
	}
}
