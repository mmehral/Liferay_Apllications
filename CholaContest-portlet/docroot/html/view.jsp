<%@page import="com.chola.contest.service.cholacontestLocalServiceUtil"%>
<%@page import="java.util.List"%>
<%@page import="javax.portlet.PortletURL"%>
<%@page import="com.liferay.portal.kernel.util.WebKeys"%>
<%@page import="com.liferay.portal.kernel.theme.ThemeDisplay"%>
<%@page import="com.liferay.portal.kernel.util.ListUtil"%>

<%@page import="java.util.List"%>
<%@page import="com.liferay.portal.kernel.util.WebKeys"%>

<%@page import="javax.portlet.PortletURL"%>
<%@taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%
	/**
	 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
	 *
	 * This library is free software; you can redistribute it and/or modify it under
	 * the terms of the GNU Lesser General Public License as published by the Free
	 * Software Foundation; either version 2.1 of the License, or (at your option)
	 * any later version.
	 *
	 * This library is distributed in the hope that it will be useful, but WITHOUT
	 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
	 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
	 * details.
	 */
%>
<%@taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<portlet:defineObjects/>
<%@taglib uri="http://liferay.com/tld/ui"  prefix="liferay-ui" %>

<div class="col-md-12" style="text-align:justify;">
    <div class="BM_panel">
      <div class="right_panel_mid1_01">
        <div class="tabContent" id="about"> <span class="pht_text">CONTEST</span>
          <div class="row con_main_panel">
<%
PortletURL addURL=renderResponse.createRenderURL();
addURL.setParameter("jspPage", "/html/contestmenu.jsp");
%>

<%
		int count = cholacontestLocalServiceUtil.getcholacontestsCount();
		System.out.println("%%%%%" + count);
		List<Object[]> list =  cholacontestLocalServiceUtil.ContestList();
		System.out.println("%%%%%" + list);
	//	PortletURL backURL = renderResponse.createRenderURL();
	//	backURL.setParameter("jspPage", "/html/view.jsp");
		PortletURL iteratorURL = renderResponse.createRenderURL();
		iteratorURL.setParameter("jspPage", "/html/view.jsp");
	%>
<%
	ThemeDisplay themeDisplay = (ThemeDisplay) request.getAttribute(WebKeys.THEME_DISPLAY);
	if (themeDisplay.isSignedIn()) {
		if (request.isUserInRole("Administrator")||request.isUserInRole("L&D Admin")) {
%>
<a href="<%=addURL.toString()%>">Add</a>


<%
	}%>
	
 <%if(list.size()!=0){ %>

<%for(Object[] c : list){ %>

<portlet:renderURL var="feedURL">
<portlet:param name="id" value="<%=String.valueOf(c[0]) %>"/>
<portlet:param name="mvcPath" value="/html/feedback.jsp"/>
</portlet:renderURL>

<div class="col-md-12 hel_box_panel">
  
  <div class="col-md-2 con_paddi"><span class="con_img_cen"><img class="hel_img" src="/contestUpload/<%=c[3]%>"></span></div>
 <div class="col-md-10">
 <span class="comp_text_head"><span class="abt_text_headcol"><%=c[2] %></span></span><%=c[1] %><br> <button class="con_btn_styl"><span class="con_more">

 <span class="con_more"><a class="all_text_link" href="${feedURL}">More +</a></span>
              </div>
              </div>
<%} %>

<%}else{ %>
<div class="col-md-12 hel_box_panel">
Right Now there is no contest
</div>
<%} %>
<%}%> 
 </div>
        </div>
      </div>
    </div>
  </div>


