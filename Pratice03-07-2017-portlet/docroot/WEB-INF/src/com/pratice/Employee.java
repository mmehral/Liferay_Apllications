package com.pratice;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;

import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.util.ParamUtil;

/**
 * Portlet implementation class Employee
 */
public class Employee extends MVCPortlet {
 
	public void addEmp(ActionRequest request, ActionResponse response){
		System.out.println("In Add Emp Action");
		String id=ParamUtil.getString(request, "empId");
		String name=ParamUtil.getString(request, "empName");
		String dept=ParamUtil.getString(request, "dept");
		String salary=ParamUtil.getString(request, "salary");
		
		System.out.println(id);
		System.out.println(name);
		System.out.println(dept);
		System.out.println(salary);
		
		
		
		
	}

}
