<%@page import="com.service.service.newhireLocalServiceUtil"%>
<%@page import="com.service.model.newhire"%>
<%@page import="javax.portlet.PortletURL"%>
<%@page import="com.liferay.portal.kernel.util.PortalUtil"%>
<%@page import="java.io.File"%>
<%@page import="com.liferay.portal.kernel.util.WebKeys"%>
<%@page import="com.liferay.portal.kernel.theme.ThemeDisplay"%>
<%@page import="java.util.List"%>
<%@taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet"%>
<%@taglib uri="http://liferay.com/tld/ui"  prefix="liferay-ui"%>
<%@taglib uri="http://liferay.com/tld/aui" prefix="aui" %>
<portlet:defineObjects/>

<%
PortletURL backURL = renderResponse.createRenderURL();
backURL.setParameter("jspPage", "/view.jsp");
%>
<liferay-ui:header title="Back" backLabel="&laquo; Back to search" backURL="<%=backURL.toString()%>" />
<%
System.out.println(".....in moredescription.....");
String newhireId = renderRequest.getParameter("newhireId");
newhire newh=newhireLocalServiceUtil.fetchnewhire(Long.parseLong(newhireId));
String detailedImage=newh.getNewhire_detailedimage_path();
%>

<div class="col-md-12" style="text-align:justify;">
    <div class="BM_panel">
      <div class="right_panel_mid1_01">
        <div class="tabContent" id="about"> <span class="abt_text_head">WELCOME &nbsp;<span class="abt_text_headcol">NEW HIRE</span></span>
          <div class="row con_main_panel">
<%
if (!detailedImage.isEmpty()) {
%>
<img class="pht_fixed img-responsive" src="/NewHireUpload/admin/<%=detailedImage%>"/>
<%
}
%>
</div>
</div>
</div>
</div>
</div>