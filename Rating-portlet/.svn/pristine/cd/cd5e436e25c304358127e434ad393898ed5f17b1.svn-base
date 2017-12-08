 <%@page import="com.liferay.portal.kernel.util.WebKeys"%>
<%@page import="com.liferay.portal.kernel.theme.ThemeDisplay"%>
<%@page import="com.liferay.asset.kernel.model.AssetEntry"%>
<%@page import="com.liferay.asset.kernel.service.AssetEntryLocalServiceUtil"%>
<%@page import="com.chola.rating.service.RatingLocalServiceUtil"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@page import="com.chola.rating.model.Rating"%>
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

<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>
<portlet:defineObjects />
<%
Rating rating=RatingLocalServiceUtil.getRating(1);
System.out.println("Rating====="+rating);
ThemeDisplay themeDisplay = (ThemeDisplay) request.getAttribute(WebKeys.THEME_DISPLAY);

%>
<portlet:actionURL var="discussURL" name="addComment"></portlet:actionURL>
<liferay-ui:ratings
className="<%= Rating.class.getName() %>"
classPK="<%=rating.getRatingId() %>"
numberOfStars="5"
/>

<liferay-ui:discussion 
classPK="<%=rating.getRatingId() %>" 
userId="<%=themeDisplay.getUserId()%>"
className="<%=Rating.class.getName() %>" 
formAction="<%=discussURL %>"
ratingsEnabled="<%=true %>"
redirect="<%=themeDisplay.getURLCurrent() %>"
/>
<%--<%
 if(!themeDisplay.isSignedIn())
{
%>
<script>
$("#_Rating_WAR_Ratingportlet_dhec__column1__0__menu__edit").hide();
$('[id ^=_Rating_WAR_Ratingportlet][id $=__edit]').hide();
$('[id ^=_Rating_WAR_Ratingportlet][id $=__delete]').hide();
</script>
<%
}
%>

 
 --%> 