<%@page import="com.organizationAnnouncement.service.organizationLocalServiceUtil"%>
<%@page import="com.organizationAnnouncement.model.organization"%>
<%@page import="com.liferay.counter.kernel.service.CounterLocalServiceUtil"%>
<%@page import="com.liferay.portal.kernel.util.WebKeys"%>
<%@page import="java.util.List"%>
<%@page import="com.liferay.portal.kernel.theme.ThemeDisplay"%>
<%@taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet"%>
<%@page import="javax.portlet.PortletURL"%>
<portlet:defineObjects/>

 <portlet:renderURL var="showjspURL">
<portlet:param name="mvcPath" value="/jsp/viewdetails.jsp" />
</portlet:renderURL> 

 

 <portlet:renderURL var="showjspURL2">
<portlet:param name="mvcPath" value="/jsp/moreorganizationdescription.jsp" />
</portlet:renderURL>

<%
ThemeDisplay themeDisplay = (ThemeDisplay) request.getAttribute(WebKeys.THEME_DISPLAY);

if (themeDisplay.isSignedIn()) {
	
	List<organization> com=organizationLocalServiceUtil.getorganizations(0,CounterLocalServiceUtil.getCountersCount());	
	
if (request.isUserInRole("Administrator")) {
%>
<a href="<%= showjspURL.toString() %>" style="float: right;">Add Organization Announcement</a><br><br>

<%
}%>

<div class="col-md-12" style="text-align:justify;">
    <div class="BM_panel">
      <div class="right_panel_mid1_01">
        <div class="tabContent" id="about"> <span class="abt_text_head"> ORGANIZAITION <span class="abt_text_headcol">ANNOUNCEMENTS</span></span>
          <div class="row con_main_panel">

<%
for(organization c:com)
{
	PortletURL editURL=renderResponse.createRenderURL();
	editURL.setParameter("organizationId", Long.toString(c.getOrganization_id()));
	
	editURL.setParameter("jspPage", "/jsp/moreorganizationdescription.jsp");
	%>
    <div class="col-md-12 hel_box_panel">
      <div class="col-md-2 con_paddi"><span class="con_img_cen"><img class="hel_img" src="/theme/images/custom/Message_Wall/imp_announcement.jpg"></span></div>
       <div class="col-md-10"><span class="comp_text_head"><%=c.getOrganization_tite() %></span><br><%=c.getOrganization_description() %><br>
        <button class="con_btn_styl"><span class="con_more"><a class="all_text_link" href="<%=editURL.toString()%>">More +</a></span></button>
      </div>
    </div>
    <%
}
}
	%>
 </div>
        </div>
      </div>
    </div>
  </div>

