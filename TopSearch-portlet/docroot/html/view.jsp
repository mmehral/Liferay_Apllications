<%@page import="java.net.URL"%>
<%@page import="java.util.List"%>
<%@page import="com.chola.topsearch.service.TopSearchLocalServiceUtil"%>
<%@page import="java.util.ArrayList"%>

<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet"%>
<portlet:defineObjects />
<div class="tabContent"> <span class="abt_text_head">TOP&nbsp;<span class="abt_text_headcol">SEARCH</span></span> <span class="abt_text_head_sub"></span> <span class="abt_pr_dashed"></span>
          <div class="col-md-12 abt_pr_panel">
<%
	List<Object[]> topsearch = TopSearchLocalServiceUtil.gettoplinks();
	URL serverURL = new URL(request.getScheme(),request.getServerName(),request.getServerPort(),"");         
%>
<%
	if (topsearch != null) {
%>
<%
	for (Object[] obj : topsearch) {
%>
  <div class="col-md-12 abt_pr_gradient">
              <div class="col-md-12 abt_pr_lh"><a href="<%=serverURL %><%=obj[0]%>"><%=obj[1] %></a></div>
 </div>

<%
	}
%>
<%
	} else {
%>
No Record Found
<%
	}
%>
</div>
</div>