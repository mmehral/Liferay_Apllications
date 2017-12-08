<%@page import="com.liferay.portal.kernel.service.UserLocalServiceUtil"%>
<%@page import="com.liferay.portal.kernel.model.User"%>
<%@page import="com.chola.action.SuccessStoriesAction"%>
<%@page import="com.chola.successstories.service.ssusersLocalServiceUtil"%>
<%@page import="com.chola.successstories.model.ssusers"%>
<%@page import="com.chola.successstories.service.ssdetailsLocalServiceUtil"%>
<%@page import="com.chola.successstories.model.ssdetails"%>
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
<style>
div.gallery {
    margin: 5px;
    border: 1px solid #ccc;
    float: left;
    width: 180px;
}

div.gallery:hover {
    border: 1px solid #777;
}

div.gallery img {
    width: 100%;
    height: auto;
}

div.desc {
    padding: 15px;
    text-align: center;
}
</style>
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
        <div class="tabContent" id="about"> <span class="abt_text_head"> SUCCESS <span class="abt_text_headcol">STORIES</span></span>
          <div class="row con_main_panel">
<%
ThemeDisplay themeDisplay = (ThemeDisplay)request.getAttribute(WebKeys.THEME_DISPLAY);

if(themeDisplay.isSignedIn())
{
	if(request.isUserInRole("Administrator")||request.isUserInRole("L&D Admin"))
	{
%>
<a href="<%=addKnowledgeBites%>">Add a new Success Story</a><br>
<a href="<%=updateKnowledgeBites%>">Update or Delete a Success Story</a><br>
<%

List<ssdetails> bookDetails = ssdetailsLocalServiceUtil.getssdetailses(0, ssdetailsLocalServiceUtil.getssdetailsesCount());
if(!bookDetails.isEmpty()){
	
for(ssdetails details : bookDetails)
{
	if(details.getFlag().equalsIgnoreCase("1"))
	{
	%>
 <div class="col-md-12 hel_box_panel">
               <div class="col-md-12"><span class="comp_text_head"><span class="abt_text_headcol"><%=details.getSstitle()%></span></span><br>
                <button class="con_btn_styl"><span class="con_more"><a class="all_text_link" href="<%=viewGallery %>&id=<%=details.getId()%>">More +</a></span></button>
              </div>
            </div>
	<%
	}
	}
}else{
	%>
	<div class="col-md-12 hel_box_panel">
			No Success Stories uploaded
		</div>

	<%
}
	}else{
%>
<%
User pUser=UserLocalServiceUtil.getUser(themeDisplay.getUserId());
List<Long> contentIds=SuccessStoriesAction.getUniqueContentIdBasedOnLoggedInUser(pUser.getScreenName());
int i=0;
if(!contentIds.isEmpty()){
for(Long contentId:contentIds){
	List<ssdetails> bookDetails = ssdetailsLocalServiceUtil.getSuccessStoriesDetails(contentId);
	if(!bookDetails.isEmpty()){
		i++;
	for(ssdetails details : bookDetails)
	{
		
	
		if(details.getFlag().equalsIgnoreCase("1") )
		{ 
		%>
		<div class="col-md-12 hel_box_panel">
               <div class="col-md-12"><span class="comp_text_head"><span class="abt_text_headcol"><%=details.getSstitle()%></span></span><br>
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
	No Success Stories For you
	</div>
	<%
}

if(i==0){
	%>
	<div class="col-md-12 hel_box_panel">
	No Success Stories For you
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