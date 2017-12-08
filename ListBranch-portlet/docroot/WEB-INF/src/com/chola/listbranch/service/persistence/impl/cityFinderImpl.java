package com.chola.listbranch.service.persistence.impl;
import java.util.List;

import com.chola.listbranch.service.persistence.cityFinder;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.SQLQuery;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.util.dao.orm.CustomSQLUtil;

	public class cityFinderImpl extends cityFinderBaseImpl implements cityFinder
	{
		public List<String> getCity()
		{
		Session session = null;
		try
		{
		session = openSession();
		String sql=CustomSQLUtil.get("citylist1");
		
		SQLQuery query = session.createSQLQuery(sql);
		System.out.println(query);
		QueryPos pos=QueryPos.getInstance(query);
		System.out.println( pos);
		
		List<Object[]> list = query.list();
		System.out.println("City List size....." + list.size());
		return query.list();
		}
		catch(Exception e)
		{
		e.printStackTrace();
		}
		finally
		{
		closeSession(session);
		}
		return null;
	}
		public List<String> getCities(long stateId)
		{
		Session session = null;
		try
		{
			System.out.println("State Id :"+stateId);
		session = openSession();
		String sql=CustomSQLUtil.get("citylist");
		
		SQLQuery query = session.createSQLQuery(sql);
		System.out.println(query);
		QueryPos pos=QueryPos.getInstance(query);
		System.out.println( pos);
		pos.add(stateId);
		List<Object[]> list = query.list();
		System.out.println("City List size....." + list.size());
		return query.list();
		}
		catch(Exception e)
		{
		e.printStackTrace();
		}
		finally
		{
		closeSession(session);
		}
		return null;
	}
		
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
		finally
		{
		closeSession(session);
		}
		return null;
	}
		
		public List<String> getState()
		{
		Session session = null;
		try
		{
			System.out.println("In finder city getstate()...");
		session = openSession();
		String sql=CustomSQLUtil.get("statelist");
		SQLQuery query = session.createSQLQuery(sql);
		List<Object[]> list = query.list();
		System.out.println("State List size....." + list.size());
		return query.list();
		}
		catch(Exception e)
		{
		e.printStackTrace();
		}
		finally
		{
		closeSession(session);
		}
		return null;
		}
		
		public List  getBranchNamedetails(long cityId)
		{
		Session session = null;
		try
		{
		session = openSession();
		String sql=CustomSQLUtil.get("branchnamedetailslist");
		SQLQuery query = session.createSQLQuery(sql);
		System.out.println(query);
		QueryPos pos=QueryPos.getInstance(query);
		System.out.println( pos);
		pos.add(cityId);
		List<Object[]> list = query.list();
		System.out.println("City List size....." + list.size());
		return query.list();
		}
		catch(Exception e)
		{
		e.printStackTrace();
		}
		finally
		{
		closeSession(session);
		}
		return null;
	}
		public String getstateName(long stateId)
		{
		Session session = null;
		try
		{
			System.out.println("State Id :"+stateId);
		session = openSession();
		String sql=CustomSQLUtil.get("editstatelist");
		
		SQLQuery query = session.createSQLQuery(sql);
		System.out.println(query);
		QueryPos pos=QueryPos.getInstance(query);
		System.out.println( pos);
		pos.add(stateId);
		//List<Object[]> list = query.list();
		//System.out.println("City List size....." + list.size());
		return (String) query.uniqueResult();
		}
		catch(Exception e)
		{
		e.printStackTrace();
		}
		finally
		{
		closeSession(session);
		}
		return null;
	}
		
		public String getcityName(long cityId)
		{
		Session session = null;
		try
		{
			System.out.println("City Id :"+cityId);
		session = openSession();
		String sql=CustomSQLUtil.get("editcityname");
		
		SQLQuery query = session.createSQLQuery(sql);
		System.out.println(query);
		QueryPos pos=QueryPos.getInstance(query);
		System.out.println( pos);
		pos.add(cityId);
		//List<Object[]> list = query.list();
		//System.out.println("City List size....." + list.size());
		return (String) query.uniqueResult();
		}
		catch(Exception e)
		{
		e.printStackTrace();
		}
		finally
		{
		closeSession(session);
		}
		return null;
	}
		
		public String getproductName(long productId)
		{
		Session session = null;
		try
		{
			System.out.println("Product Id :"+productId);
		session = openSession();
		String sql=CustomSQLUtil.get("editproductname");
		
		SQLQuery query = session.createSQLQuery(sql);
		System.out.println(query);
		QueryPos pos=QueryPos.getInstance(query);
		System.out.println( pos);
		pos.add(productId);
		//List<Object[]> list = query.list();
		//System.out.println("City List size....." + list.size());
		return (String) query.uniqueResult();
		}
		catch(Exception e)
		{
		e.printStackTrace();
		}
		finally
		{
		closeSession(session);
		}
		return null;
	}
		
		public String getbranchName(long branchId)
		{
		Session session = null;
		try
		{
			System.out.println("branch Id :"+branchId);
		session = openSession();
		String sql=CustomSQLUtil.get("editbranchname");
		
		SQLQuery query = session.createSQLQuery(sql);
		System.out.println(query);
		QueryPos pos=QueryPos.getInstance(query);
		System.out.println( pos);
		pos.add(branchId);
		//List<Object[]> list = query.list();
		//System.out.println("City List size....." + list.size());
		return (String) query.uniqueResult();
		}
		catch(Exception e)
		{
		e.printStackTrace();
		}
		finally
		{
		closeSession(session);
		}
		return null;
	}
}
