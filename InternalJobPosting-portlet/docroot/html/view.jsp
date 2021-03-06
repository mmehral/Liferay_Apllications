<%@page import="com.liferay.portal.kernel.util.PortalUtil"%>
<%@page import="com.liferay.message.boards.kernel.service.MBMessageLocalServiceUtil"%>
<%@page import="com.chola.InternalJobRef.service.InternalReferenceLocalServiceUtil"%>
<%@page import="com.chola.InternalJobRef.model.InternalReference"%>
<%@page import="java.util.List"%>
<%@page import="com.liferay.counter.kernel.service.CounterLocalServiceUtil"%>
<%@page import="com.liferay.portal.kernel.util.WebKeys"%>
<%@page import="com.liferay.portal.kernel.theme.ThemeDisplay"%>
<%@page import="com.liferay.portal.kernel.model.User"%>
<%@page import="com.liferay.portal.kernel.util.LocaleUtil"%>
<%@taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet"%>
<%@ taglib uri="http://liferay.com/tld/theme" prefix="liferay-theme"%>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>

<portlet:defineObjects />
<liferay-theme:defineObjects />

<portlet:renderURL var="showjspURL">
<portlet:param name="mvcPath" value="/html/add.jsp" />
</portlet:renderURL>

<portlet:actionURL var="discussURL" name="addComment"></portlet:actionURL>

<div class="col-md-12" style="text-align:justify;">
    <div class="BM_panel">
      <div class="right_panel_mid1_01">
        <div class="tabContent" id="about"> <span class="abt_text_head"> INTERNAL <span class="abt_text_headcol">JOB POSTING</span></span>
          <div class="row con_main_panel">
<%
ThemeDisplay display = (ThemeDisplay) request.getAttribute(WebKeys.THEME_DISPLAY);

if (themeDisplay.isSignedIn()) {
	List<InternalReference> ref=InternalReferenceLocalServiceUtil.getInternalReferences(0, CounterLocalServiceUtil.getCountersCount());	
if (request.isUserInRole("Administrator")||request.isUserInRole("HR Admin")) {
%>

<a href="<%= showjspURL.toString() %>"  style="float: right;">Add / Edit Internal Job Posting</a><br>
<% 
}
%>
<%if(ref.size()!=0){ %>

<%
for(InternalReference r:ref)
{
%>
  <div class="col-md-12 hel_box_panel">
      <div class="col-md-2 con_paddi"><span class="con_img_cen"><img class="hel_img" src="/theme/images/custom/Message_Wall/internal_job.jpg"></span></div>
       <div class="col-md-10"><span class="comp_text_head"><%=r.getTitle() %></span><br><%=r.getBody() %><br>
        <button class="con_btn_styl"><span class="con_more"><a class="all_text_link" href="mailto:<%=r.getTo() %>?subject=<%=r.getTitle() %>&body=<%=r.getBody() %>">Apply Now</a></span></button>
      </div>
    </div>
<%}
} %>


<%} else{%>
Please Upload Any new Internal Job posting....
<%} %>
	
	</div>
        </div>
      </div>
    </div>
  </div>
  
  
	<%-- <div class="comment">
<liferay-ui:ratings className="<%=InternalReference.class.getName()%>"
		classPK="11313" type="thumbs" />
		
<div class="comment">
<liferay-ui:ratings className="<%=InternalReference.class.getName()%>"
		classPK="11313" numberOfStars="5" />

<liferay-ui:social-bookmarks
    displayStyle="horizontal"
    target="_blank"
    title="Internal Job Postings"
    url="<%= PortalUtil.getCanonicalURL((PortalUtil.getCurrentURL(request)), themeDisplay, layout)%>" />
		
		
<liferay-ui:header title="comments"/>

<liferay-ui:discussion 
classPK="11313" 
userId="<%=themeDisplay.getUserId()%>"
className="<%=InternalReference.class.getName() %>" 
formAction="<%=discussURL %>"
ratingsEnabled="<%= true %>"
redirect="<%=themeDisplay.getURLCurrent() %>"
/>
</div>
 --%>