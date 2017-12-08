<%@page import="java.util.Iterator"%>
<%@page import="com.usertheme.service.themecolorLocalServiceUtil"%>
<%@page import="java.util.List"%>
<%@page import="org.json.JSONObject"%>
<%@page import="com.chola.notificationchannel.service.NoticationCategoryCountLocalServiceUtil"%>
<%@page import="com.liferay.portal.kernel.util.WebKeys"%>
<%@page import="com.liferay.portal.kernel.theme.ThemeDisplay"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>

<style>

.emp_main_panel_01{text-align:center; padding:0px;}
.emp_text_format{font-size:14px; font-weight:bold;}

.emp_grad {
  background: #bfc3c3; /* For browsers that do not support gradients */
  background: -webkit-linear-gradient(left bottom, #bfc3c3, #fff); /* For Safari 5.1 to 6.0 */
  background: -o-linear-gradient(to top right, #bfc3c3, #bfc3c3, #eee, #fff); /* For Opera 11.1 to 12.0 */
  background: -moz-linear-gradient(to top right, #bfc3c3, #bfc3c3, #eee, #fff); /* For Firefox 3.6 to 15 */
  background: linear-gradient(to top right, #bfc3c3, #bfc3c3, #eee, #fff); /* Standard syntax */
}

.emp_grad_text{padding: 3px 3px 3px 10px; font-weight: bold !important; font-size: 16px; color: #000; margin-top:20px;}
.emp_paddi{padding:0px;}

.emp_ddot{padding:0px 5px; 0px 0px}
</style>

<portlet:defineObjects />
 <div class="BM_panel">
      <div class="right_panel_mid1_01">
        <div class="tabContent" id="about">
        <span class="abt_text_head"> EMPLOYEE <span class="abt_text_headcol">PROFILE</span></span>
          <div class="col-md-12" style="padding:0px;">
            <div class="row seven-cols">
            
              <div class="col-md-12" style="padding:0px;">           
<%
ThemeDisplay themeDisplay = (ThemeDisplay) request.getAttribute(WebKeys.THEME_DISPLAY);
String url=themeDisplay.getURLCurrent();

String screenname = "";
/* if(url.endsWith("/profile/"))
{
	screenname = url.substring(url.lastIndexOf("/") + 1);
} */
screenname=themeDisplay.getUser().getScreenName();
//String screenname = "visuks";

System.out.println("Screenname : "+screenname);

 String empid = "test";
 
 if(!(screenname.equalsIgnoreCase("test")))
 {
 	 empid = NoticationCategoryCountLocalServiceUtil.getEmpIdFromUID(screenname);
 
 	List data =  themecolorLocalServiceUtil.getEmpData(empid);
	Iterator iter=data.iterator();
	while (iter.hasNext()) {
	Object[] result= (Object[]) iter.next();
	if(result[6].toString().equalsIgnoreCase("") || result[6]==null)
				{
				%>
				<div class="col-md-3"><center>
				<img id="profileImage" src="/theme/images/custom/person.png" class="img-responsive">
				</center></div>
				<%
				}else
				{
				%>
				<div class="col-md-3"><center>
				<img id="profileImage" class="img-responsive" src="/ProfileImages/<%=result[6].toString()%>">
				</center></div>
				<%
				}
				
			
				%>
				<div class="col-md-9">
				<div class="col-md-12 emp_name_set"><%=result[3].toString()%> </div>
				<div class="col-md-12 emp_left_panel">
				
				    	<div class="col-md-3 emp_main_panel_01">
                        <div class="col-md-12"><img src="/theme/images/custom/About_us/BIRTHDAY.png"></div>
                        <div class="col-md-12 emp_text_format">BIRTHDAY</div>
                        <div class="col-md-12"><%=result[9].toString()%></div>
                        </div>
				
				
				 <div class="col-md-3 emp_main_panel_01">
                        <div class="col-md-12"><img src="/theme/images/custom/About_us/BIRTHDAY.png"></div>
                        <div class="col-md-12 emp_text_format">ANNIVERSARY</div>
                        <div class="col-md-12"><%=result[10].toString()%></div>
                        </div>
				
				 <div class="col-md-3 emp_main_panel_01">
                        <div class="col-md-12"><img src="/theme/images/custom/About_us/BIRTHDAY.png"></div>
                        <div class="col-md-12 emp_text_format">DATE OF JOINING</div>
                        <div class="col-md-12"><%=result[7].toString() %></div>
                        </div>
				</div>
				</div>
				</div>
				
				
				  <div class="col-md-12 emp_grad emp_grad_text">EMPLOYEE  INFORMATION</div>
				
				 <div class="col-md-12 emp_paddi">
              <div class="col-xs-4 emp_text"> Product </div>
              <div class="col-xs-8"><span class="emp_ddot">:</span><%=result[21].toString() %></div>
             </div>
             
             
       		  <div class="col-md-12 emp_paddi">
              <div class="col-xs-4 emp_text">Unit</div> 
              <div class="col-xs-8"><span class="emp_ddot">:</span><%=result[12].toString()%></div>
             </div>
             
             <div class="col-md-12 emp_paddi">             
              <div class="col-xs-4 emp_text"> JVBranch</div>
              <div class="col-xs-8"><span class="emp_ddot">:</span><%=result[22].toString()%> </div>
             </div>
             
             <div class="col-md-12 emp_paddi">             
              <div class="col-xs-4 emp_text"> FunctionName</div>
              <div class="col-xs-8"><span class="emp_ddot">:</span><%=result[15].toString() %> </div>
             </div>
             
             <div class="col-md-12 emp_paddi">             
              <div class="col-xs-4 emp_text"> Department</div>
              <div class="col-xs-8"><span class="emp_ddot">:</span><%=result[16].toString() %>  </div>
             </div>
             
             <div class="col-md-12 emp_paddi">             
              <div class="col-xs-4 emp_text"> Costcenter</div>
              <div class="col-xs-8"><span class="emp_ddot">:</span><%=result[24].toString()%> </div>
             </div>
             
             <div class="col-md-12 emp_paddi">             
              <div class="col-xs-4 emp_text"> GradeGroup</div>
              <div class="col-xs-8"><span class="emp_ddot">:</span><%=result[13].toString() %> </div>
             </div>
             
             <div class="col-md-12 emp_paddi">             
              <div class="col-xs-4 emp_text"> EmpId   </div>
              <div class="col-xs-8"><span class="emp_ddot">:</span><%=result[2].toString()%> </div>
              
             </div>
             
             <div class="col-md-12 emp_paddi">             
              <div class="col-xs-4 emp_text"> Grade</div>
              <div class="col-xs-8"><span class="emp_ddot">:</span><%=result[14].toString() %>  </div>
             </div>
             
             <div class="col-md-12 emp_paddi">             
              <div class="col-xs-4 emp_text"> Location</div>
              <div class="col-xs-8"><span class="emp_ddot">:</span><%=result[20].toString()%>  </div>
             </div>
             
              <div class="col-md-12 emp_paddi">             
              <div class="col-xs-4 emp_text">Business</div>
              <div class="col-xs-8"><span class="emp_ddot">:</span><%=result[11].toString()%> </div>              
              </div>
             
              <div class="col-md-12 emp_paddi">             
              <div class="col-xs-4 emp_text">Region </div>
              <div class="col-xs-8"><span class="emp_ddot">:</span><%=result[19].toString()%></div>
              </div>
				
				
				
				<%	
	}
 }else
 {
	%>
		You are logged in as Test. <br>
		Cannot View Profile	
<%
	}
%>
            </div>
           </div>
          <div class="col-md-12" style="padding:10px; background:#1c5a79;">&nbsp;</div>
          <br>
        </div>
      </div>
    </div>