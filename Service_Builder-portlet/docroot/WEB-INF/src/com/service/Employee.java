package com.service;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;

import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.util.ParamUtil;
import com.service.model.employee;
import com.service.model.impl.employeeImpl;
import com.service.service.employeeLocalServiceUtil;

/**
 * Portlet implementation class Employee
 */
public class Employee extends MVCPortlet {
 
 public void addEmployee(ActionRequest request, ActionResponse response){
	 
	// long id=CounterLocalServiceUtil.increment();
	 String name=ParamUtil.getString(request, "Name");
	 String email=ParamUtil.getString(request, "Email");
	 String dept=ParamUtil.getString(request, "Dept");
     int mobile=ParamUtil.getInteger(request, "Mobile No");
	 
	 employee emp=new employeeImpl();
	 
	 emp.setName(name);
	 emp.setEmail(email);
	 emp.setDept(dept);
     emp.setMobileNo(mobile);
     
     employeeLocalServiceUtil.addemployee(emp);
     
	 
 }
}
