<%@page import="com.chola.notificationchannel.service.NoticationCategoryCountLocalServiceUtil"%>
<%@page import="com.liferay.portal.kernel.workflow.WorkflowConstants"%>
<%@page import="com.liferay.portal.kernel.util.PortalUtil"%>
<%@page import="com.liferay.message.boards.kernel.service.MBMessageLocalServiceUtil"%>
<%@page import="com.chola.birthday.BirthdayWish"%>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui"%>
<%@page import="org.json.simple.JSONObject"%>
<%@page import="org.json.simple.JSONArray"%>
<%@page import="java.util.Iterator"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@page import="com.liferay.portal.kernel.service.UserLocalServiceUtil"%>
<%@page import="com.liferay.portal.kernel.model.User"%>
<%@page import="com.liferay.portal.kernel.service.ContactLocalServiceUtil"%>
<%@page import="com.liferay.portal.kernel.model.Contact"%>
<%@page import="com.chola.birthday.service.birthdaywishLocalServiceUtil"%>
<%@page import="com.chola.birthday.model.birthdaywish"%>
<%@page import="com.liferay.portal.kernel.util.WebKeys"%>
<%@page import="com.liferay.portal.kernel.theme.ThemeDisplay"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.text.DateFormat"%>
<%@page import="java.util.List"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<portlet:defineObjects />

<portlet:actionURL var="discussURL" name="addComment"></portlet:actionURL>

<style>

.Messa_dash_bg_gradi {
    background: linear-gradient(#f8f8f9, #dee1e3);
    padding: 5px;
    float: left;
    border-radius: 4px;
    line-height: 18px;
    margin: 4px;
    width: 99%;
    padding: 18px;
}

.code{font-weight: bold; font-size: 18px; border-bottom: 1px solid #d1d1d1; padding-bottom: 7px;}
.message{font-style: italic; font-size: 18px; margin-top: 13px;}
.postedby{text-align: right; width: 100%;  float: right; border-radius: 5px;  color: #0c0c0c; margin-top: 20px;  font-weight: bold;}

.wall_panel {overflow: auto; height: 780px; float: left; margin: 0 auto; width: 100%;}

</style>

<div class="wall_panel">
 <%

ThemeDisplay themeDisplay = (ThemeDisplay)request.getAttribute(WebKeys.THEME_DISPLAY);

if(themeDisplay.isSignedIn()){
	
	//Long userId = themeDisplay.getUserId();
	System.out.println("Logged In User EMP ID : "+themeDisplay.getUser().getScreenName());
	
	String postedBy = NoticationCategoryCountLocalServiceUtil.getEmpIdFromUID(themeDisplay.getUser().getScreenName());
	
	List wish = birthdaywishLocalServiceUtil.customFinder(postedBy);
	
	System.out.println("Data : "+wish);
	
	Iterator it = wish.iterator();
	
	if(wish!=null || !(wish.isEmpty())){
		while (it.hasNext()) 
		 {
		 Object[] object = (Object[]) it.next();
		 JSONObject obj1 = new JSONObject();
		 String wishedBy = object[2].toString();	
		 long id = Long.parseLong(object[0].toString());
		// User user = UserLocalServiceUtil.getUserByScreenName(themeDisplay.getCompanyId(), wishedBy);
		 %>
		 <div class="Messa_dash_bg_gradi">
		 	<div class="code"><%=object[4].toString().replace("_", " ")%></div>
			<div class="message"><%=object[3].toString()%></div>
			<%
			String name="";
			System.out.println("Wished by : "+wishedBy);
			  List data =  birthdaywishLocalServiceUtil.getEmpInfo(wishedBy);
			  System.out.println("Data Records : "+data);
	    	Iterator iter=data.iterator();
	    	while (iter.hasNext()) {
	    	Object[] result= (Object[]) iter.next();
	    	name = result[3].toString();
	    	System.out.println("Name : "+result[3].toString());  
	    	}
			
			%>
			<div class="postedby" style="text-align: right;">-By <%=name %>(<%=wishedBy %>) at <%=object[5].toString()%></div>
			</div>
			<%-- <div class="comment">
		<liferay-ui:ratings className="<%=birthdaywish.class.getName()%>"
		classPK="<%=id %>" type="thumbs" />
		
		<liferay-ui:ratings className="<%=birthdaywish.class.getName()%>"
		classPK="<%=id %>" numberOfStars="5" />


		<liferay-ui:discussion 
		classPK="<%=id%>" 
		userId="<%=themeDisplay.getUserId()%>"
		className="<%=com.chola.birthday.model.birthdaywish.class.getName() %>" 
		formAction="<%=discussURL %>"
		ratingsEnabled="<%= true %>"
		redirect="<%=themeDisplay.getURLCurrent() %>"
		/> 
		</div> --%>
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
</div>

