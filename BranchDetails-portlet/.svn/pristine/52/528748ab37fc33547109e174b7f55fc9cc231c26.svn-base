package com.branchdetails.service.persistence.impl;


import java.util.List;
import com.branchdetails.service.persistence.productFinder;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.SQLQuery;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.util.dao.orm.CustomSQLUtil;

public class productFinderImpl extends productFinderBaseImpl implements productFinder{

	
	public List<String> getProducts()
	{
		Session session = null;
		try
		{
		    session = openSession();
			String sql=CustomSQLUtil.get("productlist");
			SQLQuery query = session.createSQLQuery(sql);
			List<Object[]> list = query.list();
			System.out.println("Product List size....." + list.size());
			return query.list();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally {
			closeSession(session);
		}
		return null;
	}
	
	public List<String> getState(long product_id)
	{
		Session session = null;
		try
		{
			session = openSession();
			String sql=CustomSQLUtil.get("statelist");
			SQLQuery query = session.createSQLQuery(sql);
			QueryPos pos = QueryPos.getInstance(query);
			pos.add(product_id);
			List<Object[]> list = query.list();
			System.out.println("State List size....." + list.size());
			return query.list();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally {
			closeSession(session);
		}
		return null;
	}

	
	public List<String> getCity(long product_id,long state_id)
	{
		Session session = null;
		try
		{
			session = openSession();
			String sql=CustomSQLUtil.get("citylist");
			SQLQuery query = session.createSQLQuery(sql);
			QueryPos pos = QueryPos.getInstance(query);
			pos.add(product_id);
			pos.add(state_id);
			List<Object[]> list = query.list();
			System.out.println("City List size....." + list.size());
			return query.list();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally {
			closeSession(session);
		}
		return null;
	}

	public List<String> getBranch(long product_id,long state_id,long city_id)
	{
		Session session = null;
		try
		{
			session = openSession();
			String sql=CustomSQLUtil.get("branchlist");
			SQLQuery query = session.createSQLQuery(sql);
			QueryPos pos = QueryPos.getInstance(query);
			pos.add(product_id);
			pos.add(state_id);
			pos.add(city_id);
			List<Object[]> list = query.list();
			System.out.println("Branch List size....." + list.size());
			return query.list();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally {
			closeSession(session);
		}
		return null;
	}
}
