package com.chola.swagatam.service.persistence.impl;
import java.util.List;

import com.chola.swagatam.model.swagatamdata;
import com.chola.swagatam.service.persistence.swagatamdataFinder;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.SQLQuery;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.util.dao.orm.CustomSQLUtil;

public class swagatamdataFinderImpl extends swagatamdataFinderBaseImpl
implements swagatamdataFinder{
	private static Log logger = LogFactoryUtil.getLog(swagatamdataFinderImpl.class);
	
	public List<swagatamdata> getEmpData(String empId) {
		Session session = null;
		try {
			session = openSession();
			String sql = CustomSQLUtil.get("empdata");
			SQLQuery queryObject = session.createSQLQuery(sql);
			queryObject.setCacheable(false);
			QueryPos qPos = QueryPos.getInstance(queryObject);
			qPos.add(empId);
			return queryObject.list();
		} catch (Exception e) {
			logger.error("Error ",e);
		} finally {
			closeSession(session);
		}
		return null;
	}
	
}
