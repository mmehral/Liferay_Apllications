package com.chola.productbuysell.service.persistence.impl;

import java.util.List;

import com.chola.productbuysell.service.persistence.BuySellFinder;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.SQLQuery;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.util.dao.orm.CustomSQLUtil;

public class BuySellFinderImpl extends BuySellFinderBaseImpl implements BuySellFinder {
	public List<Object[]> getLocationList(){
		boolean flag = false;
		Session session = null;
		try {
			session = openSession();
			String sql = CustomSQLUtil.get("locationList");
			SQLQuery queryObject = session.createSQLQuery(sql);
			queryObject.setCacheable(false);
			QueryPos qPos = QueryPos.getInstance(queryObject);
			//qPos.add(userid);
			return (List<Object[]>) queryObject.list();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			closeSession(session);
		}
		return null;
	}

	public List<Object[]> getProductCategoryList(){
		boolean flag = false;
		Session session = null;
		try {
			session = openSession();
			String sql = CustomSQLUtil.get("productCategoryList");
			SQLQuery queryObject = session.createSQLQuery(sql);
			queryObject.setCacheable(false);
			QueryPos qPos = QueryPos.getInstance(queryObject);
			//qPos.add(userid);
			return (List<Object[]>) queryObject.list();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			closeSession(session);
		}
		return null;
	}
	
/*	public List<Object> insertProductData(long category_id,String title,String description,long user_id,long location){
	
		
		boolean flag = false;
		Session session = null;
		try {
			session = openSession();
			String sql = CustomSQLUtil.get("insertProduct");
			SQLQuery queryObject = session.createSQLQuery(sql);
			queryObject.setCacheable(false);
			QueryPos qPos = QueryPos.getInstance(queryObject);
		//Timestamp createDated=new Timestamp();
			qPos.add(category_id);
			qPos.add(title);
			qPos.add(description);
			qPos.add(user_id);
			qPos.add(location);
			qPos.add(1);
			qPos.add(new Date());
			int id=queryObject.executeUpdate();
			System.out.println("Returned Id :  : : : "+id);
			return null;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			closeSession(session);
		}
		return null;
	}*/
}
