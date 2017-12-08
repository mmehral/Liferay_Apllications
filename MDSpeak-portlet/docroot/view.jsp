<%@page import="com.chola.mdspeak.service.MdSpeaksLocalServiceUtil"%>
<%@page import="com.chola.mdspeak.model.MdSpeaks"%>
<%@page import="java.util.List"%>
<%@page import="com.liferay.portal.kernel.theme.ThemeDisplay"%>
<%@page import="com.liferay.portal.kernel.util.WebKeys"%>
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

<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet"%>

<portlet:defineObjects />


<%
	String url = null;
	ThemeDisplay themeDisplay = (ThemeDisplay) renderRequest.getAttribute(WebKeys.THEME_DISPLAY);
	if (themeDisplay.isSignedIn()) {
/* 		 System.out.println(themeDisplay.getURLCurrent());
		if (themeDisplay.getURLCurrent().indexOf("?") != -1) {
			int count = themeDisplay.getURLCurrent().indexOf("?");
			url = themeDisplay.getURLCurrent().substring(0, count);
			System.out.println(url);
		} else {
			url = themeDisplay.getURLCurrent();
		}
		int urlength = url.length();
		int urlcount = url.lastIndexOf("/");
		String tag = url.substring(urlcount, urlength); */
    	List<Object[]> list = MdSpeaksLocalServiceUtil.mdblog("/md-speaks");
		System.out.println("List=====" + list.size());
%>
<%
	if (list.size() != 0) {
		int i=0;
			for (Object[] str : list) {
				if(i!=0){
%>
<div class="col-sm-12 yellow_panel_bg"><a href="/group/cholamandalam-investment-and-finance/md-speaks/-/blogs/<%=str[1]%>"><%=str[0]%></a></div>
<%
				}
			i++;	
			}
		}
%>
<%
	}
%>