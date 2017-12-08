package com.employeedirect;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.List;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import com.chola.ppcontent.service.contentupdateLocalServiceUtil;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;

public class EmployeeInfo extends MVCPortlet{
	  
	private static final Log logger = LogFactoryUtil.getLog(EmployeeInfo.class);
	
	@Override
	public void serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws IOException, PortletException {

		try {
			logger.info("Ajax ID " + resourceRequest.getResourceID());

			if ("businessCall".equalsIgnoreCase(resourceRequest.getResourceID())) {
				logger.info("Inside businessCall");
				List<String> lt = contentupdateLocalServiceUtil.getCompany();
				Iterator it = lt.iterator();
				JSONArray jArray = new JSONArray();
				PrintWriter writer = resourceResponse.getWriter();
				while (it.hasNext()) {
					Object[] object = (Object[]) it.next();
					JSONObject obj = new JSONObject();
					obj.put("business_id", object[0].toString());
					obj.put("business_name", object[1].toString());
					jArray.add(obj);
				}
				logger.info("Business : "+jArray);
				writer.print(jArray);
			} 
			
			 if ("locationCall".equalsIgnoreCase(resourceRequest.getResourceID())) 
			{
				logger.info("Inside locationCall");
				String businessId = resourceRequest.getParameter("business");
				logger.info("businessId : "+businessId);
				List<String> lt = contentupdateLocalServiceUtil.getLocation(businessId);
				JSONObject obj = new JSONObject();
				PrintWriter writer = resourceResponse.getWriter();
				obj.put("unit", lt);
				logger.info("Location : "+obj);
				writer.print(obj);
			} 
			 if ("branchCall".equalsIgnoreCase(resourceRequest.getResourceID())) 
			{
				logger.info("Inside branchCall");
				String businessId = resourceRequest.getParameter("business");
				List<String> lt = contentupdateLocalServiceUtil.getBranch(businessId);
				JSONObject obj = new JSONObject();
				PrintWriter writer = resourceResponse.getWriter();
				obj.put("unit", lt);
				logger.info("Branch : "+obj);
				writer.print(obj);
			} 
			 if ("departmentCall".equalsIgnoreCase(resourceRequest.getResourceID())) 
			{
				logger.info("Inside departmentCall");
				String businessId = resourceRequest.getParameter("business");
				List<String> lt = contentupdateLocalServiceUtil.getDepart(businessId);
				JSONObject obj = new JSONObject();
				PrintWriter writer = resourceResponse.getWriter();
				obj.put("unit", lt);
				logger.info("Department : "+obj);
				writer.print(obj);
			} 
			 if ("functionCall".equalsIgnoreCase(resourceRequest.getResourceID())) 
			{
				logger.info("Inside functionCall");
				String businessId = resourceRequest.getParameter("business");
				List<String> lt = contentupdateLocalServiceUtil.getFunction(businessId);
				JSONObject obj = new JSONObject();
				PrintWriter writer = resourceResponse.getWriter();
				obj.put("unit", lt);
				logger.info("Function : "+obj);
				writer.print(obj);
			} 
		} catch (Exception e) {
			logger.error("Error",e);
		}
	}
}
