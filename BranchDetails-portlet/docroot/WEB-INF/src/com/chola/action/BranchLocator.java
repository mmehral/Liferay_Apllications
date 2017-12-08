package com.chola.action;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.List;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import com.branchdetails.service.productLocalServiceUtil;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;


public class BranchLocator extends MVCPortlet {
	private static Log logger = LogFactoryUtil.getLog(BranchLocator.class);
	@Override
	public void serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws IOException, PortletException {

		logger.info("Chola Branch Locator.....");  

		logger.info("ID : " + resourceRequest.getResourceID());
		try {

			if ("ProductCall".equalsIgnoreCase(resourceRequest.getResourceID())) {
				List<String> lt = productLocalServiceUtil.getProducts();
				Iterator it = lt.iterator();
				JSONArray jArray = new JSONArray();
				PrintWriter writer = resourceResponse.getWriter();

				while (it.hasNext()) {
					Object[] object = (Object[]) it.next();
					JSONObject obj = new JSONObject();
					obj.put("product_id", object[0].toString());
					obj.put("product_name", object[1].toString());
					jArray.add(obj);
				}

				logger.info(jArray);
				writer.print(jArray);
			}

			if ("StateCall".equalsIgnoreCase(resourceRequest.getResourceID())) {
				String product_id = resourceRequest.getParameter("product_id");

				logger.info("Product Id StateCall : " + product_id);

				List<String> lt = productLocalServiceUtil.getState(Long.parseLong(product_id));
				Iterator it = lt.iterator();
				JSONArray jArray = new JSONArray();
				PrintWriter writer = resourceResponse.getWriter();
				
				while (it.hasNext()) {
					Object[] object = (Object[]) it.next();
					JSONObject obj = new JSONObject();
					obj.put("state_id", object[0].toString());
					obj.put("state_name", object[1].toString());
					jArray.add(obj);
				}

				writer.print(jArray);
			}

			if ("CityCall".equalsIgnoreCase(resourceRequest.getResourceID())) {
				String product_id = resourceRequest.getParameter("product_id");

				String state_id = resourceRequest.getParameter("state_id");

				logger.info("Product Id : " + product_id + " State Id : " + state_id);

				List<String> lt = productLocalServiceUtil.getCity(Long.parseLong(product_id), Long.parseLong(state_id));
				Iterator it = lt.iterator();
				JSONArray jArray = new JSONArray();
				PrintWriter writer = resourceResponse.getWriter();

				while (it.hasNext()) {
					Object[] object = (Object[]) it.next();
					JSONObject obj = new JSONObject();
					obj.put("city_id", object[0].toString());
					obj.put("city_name", object[1].toString());
					
					jArray.add(obj);
				}

				logger.info(jArray);
				writer.print(jArray);
			}

			if ("BranchCall".equalsIgnoreCase(resourceRequest.getResourceID())) {
				String product_id = resourceRequest.getParameter("product_id");

				String state_id = resourceRequest.getParameter("state_id");

				String city_id = resourceRequest.getParameter("city_id");

				logger.info("Product Id : " + product_id + " State Id : " + state_id + " City Id : " + city_id);

				List<String> lt = productLocalServiceUtil.getBranch(Long.parseLong(product_id),
						Long.parseLong(state_id), Long.parseLong(city_id));
				Iterator it = lt.iterator();
				JSONArray jArray = new JSONArray();
				PrintWriter writer = resourceResponse.getWriter();

				while (it.hasNext()) {
					Object[] object = (Object[]) it.next();
					JSONObject obj = new JSONObject();
					obj.put("branch_id", object[0].toString());
					obj.put("branch_address", object[1].toString());
					jArray.add(obj);
				}

				logger.info(jArray);
				writer.print(jArray);
			}

		} catch (Exception e) {
			
			logger.error("Error",e);
		}
	}

}
