<%@page import="com.chola.action.MyAction"%>
<%@page import="com.liferay.portal.kernel.util.WebKeys"%>
<%@page import="com.liferay.portal.kernel.theme.PortletDisplay"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.liferay.portal.kernel.model.UserNotificationEvent"%>
<%@page import="java.util.List"%>
<%@page import="com.liferay.portal.kernel.portlet.LiferayWindowState"%>
<%@page import="com.liferay.portal.kernel.theme.ThemeDisplay"%>
<%@page import="com.liferay.portal.kernel.util.StringPool"%>
<%@page import="com.liferay.portal.kernel.model.UserNotificationDeliveryConstants"%>
<%@page import="com.liferay.portal.kernel.service.UserNotificationEventLocalServiceUtil"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui" %>
<portlet:defineObjects/>
<%

ThemeDisplay themeDisplay = (ThemeDisplay) request.getAttribute(WebKeys.THEME_DISPLAY);
boolean actionRequired = ParamUtil.getBoolean(request, "actionRequired");

int userNotificationEventsCount = UserNotificationEventLocalServiceUtil.getDeliveredUserNotificationEventsCount(themeDisplay.getUserId(), UserNotificationDeliveryConstants.TYPE_WEBSITE, true, actionRequired);


PortletDisplay portletDisplay1= themeDisplay.getPortletDisplay();
String portletId= portletDisplay1.getId();
System.out.println("Portlet Id : "+portletId);
%>
<%=portletId %>
<portlet:renderURL var="seeNotificationJspURL"
	windowState="<%=LiferayWindowState.EXCLUSIVE.toString()%>">
<portlet:param name="mvcPath"
value="/html/detailedMBNotification.jsp"/>
	</portlet:renderURL>

<aui:script>
	function seeNotification(id)
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
		width: 475
		}
		}
		).plug(
		A.Plugin.IO,
		{
		autoLoad: false
		}).render();
		popUpWindow.show();
		popUpWindow.titleNode.html("Notification");
		popUpWindow.io.set('uri','<%=seeNotificationJspURL%>');
		popUpWindow.io.start();

});
	}
</aui:script>


<!--Show Count  -->

<%
List<UserNotificationEvent> mbList= MyAction.getDeliveredMessageBoard(themeDisplay.getUserId());
%>
Hobby Club : 
			
Total Count :<%=mbList.size() %><a href="javascript:;" onclick="seeNotification(1)">More</a>

<%--			<liferay-ui:search-container
				emptyResultsMessage='<%= actionRequired ? "you-do-not-have-any-requests" : "you-do-not-have-any-notifications" %>'
				id="userNotificationEvents"
				iteratorURL="<%= currentURLObj %>"
				rowChecker="<%= new EmptyOnClickRowChecker(renderResponse) %>"
				total="<%= userNotificationEventsCount %>"
			>
			Hobby Club : 
			
			Total Count : <%= UserNotificationEventLocalServiceUtil.getDeliveredUserNotificationEvents(themeDisplay.getUserId(), UserNotificationDeliveryConstants.TYPE_WEBSITE, true, actionRequired, searchContainer.getStart(), searchContainer.getEnd()).size() %>
			<a href="javascript:;" onclick="seeNotification(1)">More</a>
			
			

			</liferay-ui:search-container> --%>
<!--Show Count  -->
<%-- 
<aui:nav-bar markupView="lexicon">
	<liferay-portlet:renderURL var="viewNotificationsURL">
		<liferay-portlet:param name="actionRequired" value="<%= StringPool.FALSE %>" />
	</liferay-portlet:renderURL>

	<aui:nav cssClass="navbar-nav">
		<aui:nav-item
			href="<%= viewNotificationsURL %>"
			label="notifications-list"
			selected="<%= !actionRequired %>"
		/>
	</aui:nav>

	<liferay-portlet:renderURL var="viewRequestsURL">
		<liferay-portlet:param name="actionRequired" value="<%= StringPool.TRUE %>" />
	</liferay-portlet:renderURL>

	<aui:nav cssClass="navbar-nav">
		<aui:nav-item
			href="<%= viewRequestsURL %>"
			label="requests-list"
			selected="<%= actionRequired %>"
		/>
	</aui:nav>
</aui:nav-bar>

<liferay-frontend:management-bar
	disabled="<%= userNotificationEventsCount == 0 %>"
	includeCheckBox="<%= true %>"
	searchContainerId="userNotificationEvents"
>
	<liferay-frontend:management-bar-buttons>
		<liferay-frontend:management-bar-display-buttons
			displayViews='<%= new String[] {"descriptive"} %>'
			portletURL="<%= currentURLObj %>"
			selectedDisplayStyle="descriptive"
		/>
	</liferay-frontend:management-bar-buttons>

	<liferay-frontend:management-bar-action-buttons>
		<liferay-frontend:management-bar-button href='<%= "javascript:" + renderResponse.getNamespace() + "markAsRead();" %>' icon="times" label="mark-as-read" />
	</liferay-frontend:management-bar-action-buttons>
</liferay-frontend:management-bar>

<div class="container-fluid-1280 main-content-body">
	<aui:form action="<%= currentURL %>" cssClass="row" method="get" name="fm">
		<div class="user-notifications">
			<liferay-ui:search-container
				emptyResultsMessage='<%= actionRequired ? "you-do-not-have-any-requests" : "you-do-not-have-any-notifications" %>'
				id="userNotificationEvents"
				iteratorURL="<%= currentURLObj %>"
				rowChecker="<%= new EmptyOnClickRowChecker(renderResponse) %>"
				total="<%= userNotificationEventsCount %>"
			>
			Total Count : <%= UserNotificationEventLocalServiceUtil.getDeliveredUserNotificationEvents(themeDisplay.getUserId(), UserNotificationDeliveryConstants.TYPE_WEBSITE, true, actionRequired, searchContainer.getStart(), searchContainer.getEnd()).size() %>
				<liferay-ui:search-container-results
					results="<%= UserNotificationEventLocalServiceUtil.getDeliveredUserNotificationEvents(themeDisplay.getUserId(), UserNotificationDeliveryConstants.TYPE_WEBSITE, true, actionRequired, searchContainer.getStart(), searchContainer.getEnd()) %>"
				/>

				<liferay-ui:search-container-row
					className="com.liferay.portal.kernel.model.UserNotificationEvent"
					keyProperty="userNotificationEventId"
					modelVar="userNotificationEvent"
				>
					<%@ include file="/notifications/user_notification_entry.jspf" %>
				</liferay-ui:search-container-row>

				<liferay-ui:search-iterator displayStyle="descriptive" markupView="lexicon" />
			</liferay-ui:search-container>
		</div>
	</aui:form>
</div>

<aui:script>
	function <portlet:namespace />markAsRead() {
		var form = AUI.$(document.<portlet:namespace />fm);

		form.attr('method', 'post');

		submitForm(form, '<portlet:actionURL name="markAllAsRead" />');
	}
</aui:script>

<aui:script use="aui-base,liferay-notice">
	var form = A.one('#<portlet:namespace />fm');

	form.delegate(
		'click',
		function(event) {
			event.preventDefault();

			var currentTarget = event.currentTarget;

			A.io.request(
				currentTarget.attr('href'),
				{
					dataType: 'JSON',
					on: {
						success: function() {
							var responseData = this.get('responseData');

							if (responseData.success) {
								var notificationContainer = currentTarget.ancestor('li.list-group-item');

								if (notificationContainer) {
									var markAsReadURL = notificationContainer.one('a').attr('href');

									A.io.request(markAsReadURL);

									notificationContainer.remove();
								}
							}
							else {
								getNotice().show();
							}
						}
					}
				}
			);
		},
		'.user-notification-action'
	);

	var notice;

	function getNotice() {
		if (!notice) {
			notice = new Liferay.Notice(
				{
					closeText: false,
					content: '<liferay-ui:message key="an-unexpected-error-occurred"/><button class="close" type="button">&times;</button>',
					timeout: 5000,
					toggleText: false,
					type: 'warning',
					useAnimation: false
				}
			);
		}

		return notice;
	}
</aui:script> --%>