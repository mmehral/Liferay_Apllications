<%@page import="org.json.JSONObject"%>
<%@page import="peoplepowerapi.PeoplePowerAPI"%>
<%@page import="com.chola.notificationchannel.service.NoticationCategoryCountLocalServiceUtil"%>
<%@page import="com.liferay.portal.kernel.util.WebKeys"%>
<%@page import="com.liferay.portal.kernel.theme.ThemeDisplay"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>

<portlet:defineObjects />
<div>
<%

String screenname=request.getParameter("id");
//String screenname="visuks";
System.out.println("Screenname : "+screenname);

String empid = "test";
 
 if(!(screenname.equalsIgnoreCase("test")))
 {
 	 empid = NoticationCategoryCountLocalServiceUtil.getEmpIdFromUID(screenname);
 	  System.out.println("empid : "+empid);
 	  if(empid!=null)
 	  {
 		Object image = PeoplePowerAPI.GetEmpImage(empid);
			
			if(image.equals("ERROR"))
				{
				%>
				<img id="profileImage" src="/theme/images/custom/person.png" class="img-responsive">
				<%
				}else
				{
				%>
				<img id="profileImage" class="img-responsive" src="data:image/jpg;base64,<%=image.toString()%>">
				<%
				}
				
			JSONObject object = PeoplePowerAPI.getEmployeeInfo(empid);
			System.out.println(object);
			if(!(object.has("ERROR")))
			{
				%>
				<div>
				Name : <%=object.get("Name") %> <br>
				Birthday : <%=object.get("Birthday") %> <br>
				Product : <%=object.get("Product") %> <br>
				Unit : <%=object.get("Unit") %> <br>
				JVBranch : <%=object.get("JVBranch") %> <br>
				FunctionName : <%=object.get("FunctionName") %> <br>
				Department : <%=object.get("Department") %> <br>
				Costcenter : <%=object.get("Costcenter") %> <br>
				GradeGroup : <%=object.get("GradeGroup") %> <br>
				EmpId : <%=object.get("EmpId") %> <br>
				Grade : <%=object.get("Grade") %> <br>
				Location : <%=object.get("Location") %> <br>
				Business : <%=object.get("Business") %> <br>
				Region : <%=object.get("Region") %> <br>
				Anniversary : <%=object.get("Anniversary") %> <br>
				DOJ : <%=object.get("DOJ") %> <br>
				</div>
				<%	
			}
			else
		 	  {
		 		 %>
		 		 Employee Info doesn't exist in People Power
		 		 <%
		 	  }
 	  }
 	  else
 	  {
 		 %>
 		 Employee ID doesn't exist in People Power
 		 <%
 	  }
 }else
 {
	%>
		You are logged in as Test <br>
		Cannot View Profile	
<%
	}
%>
</div> 