<%@page import="com.liferay.portal.kernel.model.User"%>
<%@page import="com.liferay.portal.kernel.service.UserLocalServiceUtil"%>
<%@page import="com.chola.action.KnowledgeBitesAction"%>
<%@page import="com.chola.knowledgebites.service.kbusersLocalServiceUtil"%>
<%@page import="com.chola.knowledgebites.model.kbusers"%>
<%@page import="com.chola.knowledgebites.service.kbdetailsLocalServiceUtil"%>
<%@page import="com.chola.knowledgebites.model.kbdetails"%>
<%@page import="java.util.List"%>
<%@page import="com.liferay.portal.kernel.util.WebKeys"%>
<%@page import="com.liferay.portal.kernel.theme.ThemeDisplay"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="com.liferay.portal.kernel.portlet.LiferayWindowState"%>
<%@taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet"%>
<%@taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui"%>
<%@taglib uri="http://liferay.com/tld/aui" prefix="aui"%>
<portlet:defineObjects />
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

</head>
<body>
<portlet:renderURL var="addKnowledgeBites">
   <portlet:param name="jspPage" value="/html/addknowledgebites.jsp" />
</portlet:renderURL>
<portlet:renderURL var="updateKnowledgeBites">
   <portlet:param name="jspPage" value="/html/updateknowledgebites.jsp" />
</portlet:renderURL>
<portlet:renderURL var="viewGallery">
   <portlet:param name="jspPage" value="/html/viewdetailedkb.jsp" />
</portlet:renderURL>

<div class="col-md-12" style="text-align:justify;">
    <div class="BM_panel">
      <div class="right_panel_mid1_01">
        <div class="tabContent" id="about"> <span class="abt_text_head"> KNOWLEDGE <span class="abt_text_headcol">BITES</span></span>
          <div class="row con_main_panel">
<%
ThemeDisplay themeDisplay = (ThemeDisplay)request.getAttribute(WebKeys.THEME_DISPLAY);

if(themeDisplay.isSignedIn())
{
	if(request.isUserInRole("Administrator")||request.isUserInRole("L&D Admin"))
	{
%>
<a href="<%=addKnowledgeBites%>">Add a new Knowledge Bite</a><br>
<a href="<%=updateKnowledgeBites%>">Update or Delete a Knowledge Bite</a><br>
<%

List<kbdetails> bookDetails = kbdetailsLocalServiceUtil.getkbdetailses(0, kbdetailsLocalServiceUtil.getkbdetailsesCount());
if(!bookDetails.isEmpty()){

for(kbdetails details : bookDetails)
{
	if(details.getFlag().equalsIgnoreCase("1"))
	{
	%>
	 <div class="col-md-12 hel_box_panel">
               <div class="col-md-12"><span class="comp_text_head"><span class="abt_text_headcol"><%=details.getKbtitle()%></span></span><%=details.getKbdesc()%><br>
                <button class="con_btn_styl"><span class="con_more"><a class="all_text_link" href="<%=viewGallery %>&id=<%=details.getId()%>">More +</a></span></button>
              </div>
            </div>
	<%
	}
	}
}
else{
	%>
	No Knowledge Bites uploaded
	<%
	
}

	}else{
%>
<%
User pUser=UserLocalServiceUtil.getUser(themeDisplay.getUserId());
List<Long> contentIds=KnowledgeBitesAction.getUniqueContentIdBasedOnLoggedInUser(pUser.getScreenName());
int i=0;	
if(!contentIds.isEmpty()){
	for(Long contentId:contentIds){
	List<kbdetails> bookDetails = kbdetailsLocalServiceUtil.getkbdetail(contentId);
	
	if(!bookDetails.isEmpty()){
		i++;
	for(kbdetails details : bookDetails)
	{
		if(details.getFlag().equalsIgnoreCase("1"))
		{ 
		%>	
		 <div class="col-md-12 hel_box_panel">
               <div class="col-md-12"><span class="comp_text_head"><span class="abt_text_headcol"><%=details.getKbtitle()%></span></span><%=details.getKbdesc()%><br>
                <button class="con_btn_styl"><span class="con_more"><a class="all_text_link" href="<%=viewGallery %>&id=<%=details.getId()%>">More +</a></span></button>
              </div>
            </div>

		<%
		}
		}
	}
	}
	}else{
		%>
		<div class="col-md-12 hel_box_panel">
		No Knowledge Bites For you
		</div>
		<%
		
	}
	
	if(i==0){
		%>
		<div class="col-md-12 hel_box_panel">
		No Knowledge Bites For you
		</div>
		<%
	}
	}
}
%>
</div>
        </div>
      </div>
    </div>
  </div>

</body>
</html>