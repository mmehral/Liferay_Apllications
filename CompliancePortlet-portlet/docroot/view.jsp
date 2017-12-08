<%@page import="com.liferay.counter.kernel.service.CounterLocalServiceUtil"%>
<%@page import="com.liferay.portal.kernel.util.WebKeys"%>
<%@page import="com.service.compliance.service.complianceLocalServiceUtil"%>
<%@page import="com.service.compliance.model.compliance"%>
<%@page import="java.util.List"%>
<%@page import="com.liferay.portal.kernel.theme.ThemeDisplay"%>
<%@taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet"%>
<%@page import="javax.portlet.PortletURL"%>
<portlet:defineObjects/>

 <portlet:renderURL var="showjspURL">
<portlet:param name="mvcPath" value="/jsp/viewdetails.jsp" />
</portlet:renderURL> 

 <portlet:renderURL var="showjspURL2">
<portlet:param name="mvcPath" value="/jsp/moredescription.jsp" />
</portlet:renderURL>

<%
ThemeDisplay themeDisplay = (ThemeDisplay) request.getAttribute(WebKeys.THEME_DISPLAY);

if (themeDisplay.isSignedIn()) {
	List<compliance> com=complianceLocalServiceUtil.getcompliances(0, CounterLocalServiceUtil.getCountersCount());	
	
if (request.isUserInRole("Administrator") || request.isUserInRole("Compliance Admin")) {
%>
<a href="<%= showjspURL.toString() %>" style="float: right;">Add / Edit Compliance</a><br><br>

<%
}%>

<div class="col-md-12" style="text-align:justify;">
    <div class="BM_panel">
      <div class="right_panel_mid1_01">
        <div class="tabContent" id="about"> <span class="abt_text_head"> COMPLIANCE <span class="abt_text_headcol">NOTICE BOARD</span></span>
          <div class="row con_main_panel">
          <%
			for(compliance c:com)
			{
				PortletURL editURL=renderResponse.createRenderURL();
				editURL.setParameter("complianceId", Long.toString(c.getCompliance_id()));
				
				editURL.setParameter("jspPage", "/jsp/moredescription.jsp");
			%>
            <div class="col-md-12 hel_box_panel">
              <div class="col-md-2 con_paddi"><span class="con_img_cen"><img class="hel_img" src="/theme/images/custom/Message_Wall/Compliance_Notice_Board.jpg"></span></div>
               <div class="col-md-10"><span class="comp_text_head"><span class="abt_text_headcol"><%=c.getCompliance_tite() %></span></span><%=c.getCompliance_shortdescription() %><br>
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

