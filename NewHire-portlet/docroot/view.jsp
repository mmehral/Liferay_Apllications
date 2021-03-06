<%@page import="java.time.Period"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.time.LocalDate"%>
<%@page import="java.time.format.DateTimeFormatter"%>
<%@page import="com.service.service.newhireLocalServiceUtil"%>
<%@page import="com.service.model.newhire"%>
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
	List<newhire> newh=newhireLocalServiceUtil.getnewhires(0,CounterLocalServiceUtil.getCountersCount());
	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MMM-yyyy");
	LocalDate today = LocalDate.now(); 
	SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-yyyy");
if (request.isUserInRole("Administrator") || request.isUserInRole("HR Admin")) {
%>
<a href="<%= showjspURL.toString() %>" style="float: right;">Add/Edit New Hire Details</a><br><br>

<%
}%>

<div class="col-md-12" style="text-align:justify;">
    <div class="BM_panel">
      <div class="right_panel_mid1_01">
        <div class="tabContent" id="about"> <span class="abt_text_head"> WELCOME <span class="abt_text_headcol">NEW HIRE</span></span>
          <div class="row con_main_panel">

<%
for(newhire n:newh)
{
	PortletURL editURL=renderResponse.createRenderURL();
	editURL.setParameter("newhireId", Long.toString(n.getNewhire_id()));
	
	editURL.setParameter("jspPage", "/jsp/morenewhiredescription.jsp");
	String promotedDate = sdf.format(n.getNewhire_createdate());
	LocalDate doj = LocalDate.parse(promotedDate, formatter);
	Period age = Period.between(doj, today); 
	int months = age.getMonths();  
	//System.out.println("number of months: " + months);
	if(months<=6)
	{
%>
<%
String profileImage=n.getNewhire_profileimage_path();
%>
<div class="col-md-12 hel_box_panel">
      <div class="col-md-2 con_paddi"><span class="con_img_cen"><img class="hel_img" src="/NewHireUpload/admin/<%=profileImage%>"/></span></div>
       <div class="col-md-10"><span class="comp_text_head"><%=n.getNewhire_name() %></span><br><%=n.getNewhire_designation() %><br>
        <button class="con_btn_styl"><span class="con_more"><a class="all_text_link" href="<%=editURL.toString()%>">More +</a></span></button>
      </div>
    </div>
<%}
}
} %>

 </div>
        </div>
      </div>
    </div>
  </div>

