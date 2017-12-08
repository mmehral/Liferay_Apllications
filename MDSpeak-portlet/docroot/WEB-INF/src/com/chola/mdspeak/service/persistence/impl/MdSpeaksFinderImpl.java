package com.chola.mdspeak.service.persistence.impl;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import com.chola.mdspeak.service.persistence.MdSpeaksFinder;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.SQLQuery;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.util.dao.orm.CustomSQLUtil;

public class MdSpeaksFinderImpl extends MdSpeaksFinderBaseImpl
implements MdSpeaksFinder{
	public List<Object[]> mdblog(String url) {
		boolean flag = false;
		Session session = null;
		try {
			session = openSession();
			String sql = CustomSQLUtil.get("mdspeaks");
			SQLQuery queryObject = session.createSQLQuery(sql);
			queryObject.setCacheable(false);
			QueryPos qPos = QueryPos.getInstance(queryObject);
			qPos.add(url);

			return (List<Object[]>) queryObject.list();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			closeSession(session);
		}
		return null;
	}

	
			

}
