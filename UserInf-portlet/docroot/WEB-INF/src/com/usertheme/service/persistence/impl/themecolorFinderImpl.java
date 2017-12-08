package com.usertheme.service.persistence.impl;

import java.util.List;

import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.SQLQuery;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.util.dao.orm.CustomSQLUtil;
import com.usertheme.service.persistence.themecolorFinder;

public class themecolorFinderImpl extends themecolorFinderBaseImpl
implements themecolorFinder{

	public List getEmpData(String empid) {
		Session session = null;
		try {
			session = openSession();
			String sql = CustomSQLUtil.get("empdata");
			SQLQuery queryObject = session.createSQLQuery(sql);
			queryObject.setCacheable(false);
			QueryPos qPos = QueryPos.getInstance(queryObject);
			qPos.add(empid);
			return queryObject.list();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			closeSession(session);
		}
		return null;
	}
	
}
