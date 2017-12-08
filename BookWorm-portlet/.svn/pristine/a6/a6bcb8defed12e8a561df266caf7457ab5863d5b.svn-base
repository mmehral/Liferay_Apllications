<%@page import="com.liferay.portal.kernel.model.User"%>
<%@page import="com.liferay.portal.kernel.service.UserLocalServiceUtil"%>
<%@page import="com.chola.books.BookAction"%>
<%@page import="com.chola.book.service.bookusersLocalServiceUtil"%>
<%@page import="com.chola.book.model.bookusers"%>
<%@page import="com.chola.book.service.bookdetailsLocalServiceUtil"%>
<%@page import="com.chola.book.model.bookdetails"%>
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
<portlet:renderURL var="addbooks">
   <portlet:param name="jspPage" value="/html/addbooks.jsp" />
</portlet:renderURL>
<portlet:renderURL var="updatebooks">
   <portlet:param name="jspPage" value="/html/updatebooks.jsp" />
</portlet:renderURL>

<div class="col-md-12" style="text-align:justify;">
    <div class="BM_panel">
      <div class="right_panel_mid1_01">
        <div class="tabContent" id="about"> <span class="abt_text_head"> BOOK <span class="abt_text_headcol">WORM</span></span>
          <div class="row con_main_panel">
<%
ThemeDisplay themeDisplay = (ThemeDisplay)request.getAttribute(WebKeys.THEME_DISPLAY);

if(themeDisplay.isSignedIn())
{
	if(request.isUserInRole("Administrator"))
	{
%>
<a href="<%=addbooks%>">Add a new E-Book</a><br>
<a href="<%=updatebooks%>">Update or Delete a E-Book</a><br>
<%
List<bookdetails> bookDetails = bookdetailsLocalServiceUtil.getbookdetailses(0, bookdetailsLocalServiceUtil.getbookdetailsesCount());
if(!bookDetails.isEmpty())
{
for(bookdetails details : bookDetails)
{
	if(details.getFlag().equalsIgnoreCase("1"))
	{
	%>
	 <div class="col-md-12 hel_box_panel">
               <div class="col-md-12"><span class="comp_text_head"><span class="abt_text_headcol"><%=details.getBooktitle() %></span></span><br>
                <button class="con_btn_styl"><span class="con_more"><a class="all_text_link" target="_blank" href="<%=details.getBookpath() %>"><%=details.getBookname() %></a></span></button>
              </div>
            </div>
	<%
	}
}
}
else{
	%>
	<div class="col-md-12 hel_box_panel">
	No Book Worms Uploaded
	</div>
	<%
	
}
	
	}else{
%>
<%
User pUser=UserLocalServiceUtil.getUser(themeDisplay.getUserId());
List<Long> contentIds=BookAction.getUniqueContentIdBasedOnLoggedInUser(pUser.getScreenName());
int i=0;
if(!contentIds.isEmpty()){
for(Long contentId:contentIds){
List<bookdetails> bookDetails = bookdetailsLocalServiceUtil.getBookDetail(contentId);

if(!bookDetails.isEmpty()){
	
	for(bookdetails details : bookDetails)
	{
		if(details.getFlag().equalsIgnoreCase("1"))
		{
			i++;
		%>
		 <div class="col-md-12 hel_box_panel">
               <div class="col-md-12"><span class="comp_text_head"><span class="abt_text_headcol"><%=details.getBooktitle() %></span></span><br>
                <button class="con_btn_styl"><span class="con_more"><a class="all_text_link" target="_blank" href="<%=details.getBookpath() %>"><%=details.getBookname() %></a></span></button>
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
	No Book Worms For you
	</div>
	<%
	
}

if(i==0){
	%>
	<div class="col-md-12 hel_box_panel">
	No Book Worms For you
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