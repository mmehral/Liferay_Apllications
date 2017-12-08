<%@page import="com.liferay.portal.kernel.service.UserLocalServiceUtil"%>
<%@page import="com.liferay.portal.kernel.model.User"%>
<%@page import="com.chola.action.LearningBitesAction"%>
<%@page import="com.chola.learningbites.service.lbusersLocalServiceUtil"%>
<%@page import="com.chola.learningbites.service.lbdetailsLocalServiceUtil"%>
<%@page import="com.chola.learningbites.model.lbusers"%>
<%@page import="com.chola.learningbites.model.lbdetails"%>
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
<portlet:renderURL var="addLearningBites">
   <portlet:param name="jspPage" value="/html/addlearningbites.jsp" />
</portlet:renderURL>
<portlet:renderURL var="updateLearningBites">
   <portlet:param name="jspPage" value="/html/updatelearningbites.jsp" />
</portlet:renderURL>
<portlet:renderURL var="viewGallery">
   <portlet:param name="jspPage" value="/html/viewdetailedlb.jsp" />
</portlet:renderURL>

<div class="col-md-12" style="text-align:justify;">
    <div class="BM_panel">
      <div class="right_panel_mid1_01">
        <div class="tabContent" id="about"> <span class="abt_text_head"> LEARNING <span class="abt_text_headcol">BITES</span></span>
          <div class="row con_main_panel">
<%
ThemeDisplay themeDisplay = (ThemeDisplay)request.getAttribute(WebKeys.THEME_DISPLAY);

if(themeDisplay.isSignedIn())
{
	if(request.isUserInRole("Administrator")||request.isUserInRole("L&D Admin"))
	{
%>
<a href="<%=addLearningBites%>">Add a new Learning Bite</a><br>
<a href="<%=updateLearningBites%>">Update or Delete a Learning Bite</a><br>
<%

List<lbdetails> bookDetails = lbdetailsLocalServiceUtil.getlbdetailses(0, lbdetailsLocalServiceUtil.getlbdetailsesCount());
if(!bookDetails.isEmpty()){
	

for(lbdetails details : bookDetails)
{
	if(details.getFlag().equalsIgnoreCase("1"))
	{
	%>
	 <div class="col-md-12 hel_box_panel">
               <div class="col-md-12"><span class="comp_text_head"><span class="abt_text_headcol"><%=details.getLbtitle()%></span></span><%=details.getLbdescription() %><br>
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
List<Long> contentIds=LearningBitesAction.getUniqueContentIdBasedOnLoggedInUser(pUser.getScreenName());
int i=0;
	if(!contentIds.isEmpty()){
		for(Long contentId:contentIds){
	List<lbdetails> bookDetails = lbdetailsLocalServiceUtil.getLBDetails(contentId);
	
	if(!bookDetails.isEmpty()){
		i++;
	for(lbdetails details : bookDetails)
	{
		
	
		if(details.getFlag().equalsIgnoreCase("1"))
		{
		%>
		 <div class="col-md-12 hel_box_panel">
               <div class="col-md-12"><span class="comp_text_head"><span class="abt_text_headcol"><%=details.getLbtitle()%></span></span><%=details.getLbdescription() %><br>
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
		No Learning Bites For you
		</div>
		<%
		
	}
	
	if(i==0){
		%>
		<div class="col-md-12 hel_box_panel">
		No Learning Bites For you
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