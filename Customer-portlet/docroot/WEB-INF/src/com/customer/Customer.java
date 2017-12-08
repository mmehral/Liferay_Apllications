package com.customer;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;

import com.customer.model.customer;
import com.customer.model.impl.customerImpl;
import com.customer.service.customerLocalServiceUtil;
import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.util.ParamUtil;

/**
 * Portlet implementation class Customer
 */
public class Customer extends MVCPortlet {
	
	public void addcustomer(ActionRequest requset,ActionResponse response){
		
		long id=CounterLocalServiceUtil.increment();
		String name=ParamUtil.getString(requset, "Name"); 
		String product=ParamUtil.getString(requset, "Product");
		int phoneno=ParamUtil.getInteger(requset, "PhoneNo");
		Float price=ParamUtil.getFloat(requset, "Price");
		String email=ParamUtil.getString(requset, "Email");
		
		
		customerImpl obj=new customerImpl();
		
		obj.setName(name);
		obj.setProduct(product);
		obj.setPhoneNo(phoneno);
		obj.setPrice(price);
		obj.setEmail(email);
		
		customerLocalServiceUtil.addcustomer(obj);
		
		
	}
 

}
