<%@page import="com.chola.news.service.Around_WorldLocalServiceUtil"%>
<%@page import="com.liferay.portal.kernel.util.PortalUtil"%>
<%@page import="com.liferay.portal.kernel.workflow.WorkflowConstants"%>
<%@page import="com.liferay.message.boards.kernel.service.MBMessageLocalServiceUtil"%>
<%@page import="com.chola.news.model.Around_World"%>
<%@page import="com.liferay.portal.kernel.theme.ThemeDisplay"%>
<%@page import="com.liferay.portal.kernel.util.WebKeys"%>
<%@taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet"%>
<%@ taglib uri="http://liferay.com/tld/theme" prefix="liferay-theme"%>
<%@taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>	
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>


<portlet:defineObjects />
<liferay-theme:defineObjects />

<%
ThemeDisplay display = (ThemeDisplay) request.getAttribute(WebKeys.THEME_DISPLAY);	 
%>
<script>  
		$(document).ready(function() {
			$.ajax({
				url : 'https://newsapi.org/v1/articles?source=the-hindu&sortBy=latest&apikey=a82ebc062b694a53824a480cc3b66cd2',
				type : 'GET',
				dataType : 'json',
				success : function(data) {
					//alert(JSON.stringify(data));
					var news = data.articles;
					for(var i in news)
					{
					     var title = news[i].title;
					     var description = news[i].description;
					     var url = news[i].url;
					     var urlToImage = news[i].urlToImage;
					     var publishedAt = news[i].publishedAt;
					     
					     //console.log(title+" -- "+description);
					     $("#article").append(" <div class='col-md-12 hel_bg_gradi'><span class='hel_text_inn'><strong>Headline:</strong> "+title+"</span><span class='hel_text_inn'><strong>Summary:</strong> "+description+"...<br><br><button class='con_btn_styl'><span class='con_more'><a class='all_text_link' target='_blank' href="+url+">View More</a></span></button></span></div>"); 
					}
				},
				error : function() {
					console.log("There was an error. Try again please!");
				}
			});
		});
</script>
<%
Around_World world=Around_WorldLocalServiceUtil.getAround_World(101);
%>
<portlet:actionURL var="discussURL" name="addComment"></portlet:actionURL>
<div class="col-md-12" style="text-align:justify;">
    <div class="BM_panel">
      <div class="right_panel_mid1_01">
        <div class="tabContent" id="about"> <span class="abt_text_head"> AROUND <span class="abt_text_headcol">THE WORLD</span></span>
          <div class="row con_main_panel">
           <div id="article">
            </div>
          </div>
        </div>
      </div>
    </div>
  </div>


<div class="comment">
<liferay-ui:ratings className="<%=Around_World.class.getName()%>"
		classPK="<%=world.getId() %>" type="thumbs" />
		
<%-- <liferay-ui:social-bookmarks
    displayStyle="horizontal"
    target="_blank"
    title="Around the World"
    url="<%= PortalUtil.getCanonicalURL((PortalUtil.getCurrentURL(request)), themeDisplay, layout)%>" /> --%>
		
<liferay-ui:ratings className="<%=Around_World.class.getName()%>"
		classPK="<%=world.getId() %>" numberOfStars="5" />

	<%
		int discussionMessagesCount = MBMessageLocalServiceUtil.getDiscussionMessagesCount(
					PortalUtil.getClassNameId(Around_World.class.getName()), world.getId(),
					WorkflowConstants.STATUS_APPROVED);
	%>

	<c:if test="<%= discussionMessagesCount > 0 %>">
			<liferay-ui:header
				title="comments"
			/>
		</c:if>

<liferay-ui:discussion 
classPK="<%=world.getId() %>" 
userId="<%=themeDisplay.getUserId()%>"
className="<%=Around_World.class.getName() %>" 
formAction="<%=discussURL %>"
ratingsEnabled="<%= true %>"

redirect="<%=themeDisplay.getURLCurrent() %>"

/>
</div>
