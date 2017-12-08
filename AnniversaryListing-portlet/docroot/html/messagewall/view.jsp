
<%@page import="com.chola.anniversary.service.anniversarywishLocalServiceUtil"%>
<%@page import="com.chola.anniversary.model.anniversarywish"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@page import="com.liferay.portal.kernel.service.UserLocalServiceUtil"%>
<%@page import="com.liferay.portal.kernel.model.User"%>
<%@page import="com.liferay.portal.kernel.service.ContactLocalServiceUtil"%>
<%@page import="com.liferay.portal.kernel.model.Contact"%>
<%@page import="com.liferay.portal.kernel.util.WebKeys"%>
<%@page import="com.liferay.portal.kernel.theme.ThemeDisplay"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.text.DateFormat"%>
<%@page import="java.util.List"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>

<portlet:defineObjects />

 <%

ThemeDisplay themeDisplay = (ThemeDisplay)renderRequest.getAttribute(WebKeys.THEME_DISPLAY);

if(themeDisplay.isSignedIn()){
	
	Long userId = themeDisplay.getUserId();
	System.out.println("Logged In UserID : "+userId);

	List<anniversarywish> wish = anniversarywishLocalServiceUtil.customFinder(String.valueOf(userId));
	System.out.println(""+wish);
	if(wish!=null || !(wish.isEmpty())){
		
	for(anniversarywish b : wish)
	{
	long wishedBy = Long.parseLong(b.getWishedBy());	
	User user =UserLocalServiceUtil.getUser(wishedBy); 
	
	//String wishedBy = b.getWishedBy();
	System.out.println("Message : "+b.getMessage()+" - Wished By : "+wishedBy);
	%>
	<div class="message"><%= b.getMessage() %></div>
	<div class="postedby" style="text-align: right;">-<%=user.getFirstName()+" "+ user.getLastName() %></div>
	<%
	} 
	}
	if(wish.isEmpty())
	{
		System.out.println("No walls Post");
		%>
		No Wall Post's
		<%
		
	}
	
}
else
{ 
%>
Please Login to see your wall [post]....
<%
}
%>


