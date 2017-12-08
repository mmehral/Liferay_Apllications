<%@page import="java.util.Iterator"%>
<%@page import="com.liferay.portal.kernel.util.WebKeys"%>
<%@page import="com.liferay.portal.kernel.theme.ThemeDisplay"%>
<%@page import="com.liferay.portal.kernel.portlet.LiferayWindowState"%>
<%@page import="com.chola.halloffame.service.usersLocalServiceUtil"%>
<%@page import="com.liferay.counter.kernel.service.CounterLocalServiceUtil"%>
<%@page import="com.liferay.portal.kernel.service.UserLocalServiceUtil"%>
<%@page import="com.chola.halloffame.model.users"%>
<%@page import="java.util.List"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@taglib uri="http://liferay.com/tld/aui" prefix="aui"%>

<html>
<head>
<style>
.hf_btn_styl{border:none; background:none;}
.hf_text{background: rgb(30, 89, 119) none repeat scroll 0% 0%; color: rgb(255, 255, 255); padding: 2px; font-size: 12px;}

table.formtable2 
{
	margin:0px;
	padding:0px;
	border-top:1px solid #b1aeae;
	border-left:1px solid #b1aeae;
	font-size:11px;
}


.formtable2 tr
{
	height:10px;
	
	}

.formtable2 a
{
	color:#333 !important;
	text-decoration:underline;
}
.formtable2 td
{
	margin:0px;
	padding:0px 6px 0px 6px;
	line-height:25px;
	
	border-bottom:1px solid #b1aeae;
	border-right:1px solid #b1aeae;
}
.formtable2 img
{
	margin:0px 0px 0px ;
	padding:0px;
}

.formtable2 a
{
	color:#666666;
}
.formtable2 th
{
	margin:0px;
	padding:0px 6px 0px 6px;
	line-height:21px;
	font-weight:bold;
	background:#ed2028;
	color:#fff;
	font-weight:bold; font-size:13px;
	border-bottom:1px solid #ddd;
	border-right:1px solid #b1aeae;
}


.imgwid{height: 112px !important; width: 112px !important;}
.textwid{word-break: break-word; font-size: 14px;}

</style>
<portlet:defineObjects />
<portlet:renderURL var="simpleDialogExample"
windowState="<%=LiferayWindowState.EXCLUSIVE.toString()%>">
<portlet:param name="mvcPath"
value="/jsp/detail.jsp"/>

</portlet:renderURL>

<aui:script>
	function sendId(id)
	{
	console.log(id);
	
		AUI().use('aui-base',
		'aui-io-plugin-deprecated',
		'liferay-util-window',
		function(A) {
		var popUpWindow=Liferay.Util.Window.getWindow(
		{
		dialog: {
		centered: true,
		constrain2view: true,
		//cssClass: 'yourCSSclassName',
		modal: true,
		resizable: false,
		width: 475,
		height:800
		}
		}
		).plug(
		A.Plugin.IO,
		{
		autoLoad: false
		}).render();
		popUpWindow.show();
		popUpWindow.titleNode.html("Hall of Fame");
		popUpWindow.io.set('uri','<%=simpleDialogExample%>&id='+id);
		popUpWindow.io.start();
		
		});
	}
</aui:script>
</head>
<portlet:renderURL var="upload">
<portlet:param name="jspPage" value="/jsp/upload.jsp" />
</portlet:renderURL>
<body>
<%
ThemeDisplay themeDisplay = (ThemeDisplay)request.getAttribute(WebKeys.THEME_DISPLAY);
if(themeDisplay.isSignedIn())
{
	if(request.isUserInRole("Administrator")||request.isUserInRole("L&D Admin"))
	{
		%>
		<a href="<%=upload%>">Upload List</a><hr>
		<a target="_blank" href="/BusinessSopUpload/admin/Promotion.xlsx">Download Sample Excel</a>
		
		<%
	}
 %>
 <div class="col-md-12" style="text-align:justify;">
    <div class="BM_panel">
      <div class="right_panel_mid1_01">
        <div class="tabContent" id="about"> <span class="abt_text_head"> HALL OF FAME</span>
      		<div class="row" style="overflow:auto; height:550px; float:left; margin:0 auto; width:100%;">
      		<%List<users> userList = usersLocalServiceUtil.getuserses(0, usersLocalServiceUtil.getusersesCount());
			for(users user : userList)
			{
			 %>
            <div class="col-lg-3 col-sm-6 text-center">
            <%
            System.out.println("Emp id  : "+user.getEmpId());
            List birthdayData =  usersLocalServiceUtil.getEmpData(user.getEmpId());
        	Iterator iter=birthdayData.iterator();
        	while (iter.hasNext()) {
        	Object[] result= (Object[]) iter.next();
        	System.out.println("Data : "+result[6]);  
        	if(result[6].toString().equalsIgnoreCase("") || result[6]==null)
				{
				%>
                <center><img class="img-circle img-responsive img-center"  src="/theme/images/custom/person.png"  alt="Chola"></center>
                <%
                }
                else
                {
                %>
                <center><img class="img-circle img-responsive img-center imgwid"  src="/ProfileImages/<%=result[6].toString()%>"  alt="Chola"></center>
              <%
              }
              }
              %>
                <h4 class="textwid"><%=user.getEmpName()%></h4>
                <p><button onclick="sendId(<%=user.getId()%>)" class="hf_btn_styl"><span class="hf_text">Congratulate</span></button></p>
            </div>
             <%
			}

             %>
        </div>
        </div>
     
    
          <br>
          <br>
          <br>
          <br>
        </div>
     
      
    </div>
  </div>
  <%
}
  %>
 </body>
 </html>