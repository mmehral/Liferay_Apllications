<%@ include file="/init.jsp" %>
<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui" %>
<p>
	<b><liferay-ui:message key="SomeAdmin.caption" /></b>
</p>

<aui:form name="form" action="" method="POST">
<aui:input type="text" name="id" placeholder="Enter your employee id">
</aui:input>
<aui:input type="password" name="pass" ></aui:input>
<aui:select name="select Company">
  <aui:option selected="true" value="ALL">All</aui:option>
  <aui:option  value="Chola">Chola</aui:option>
  <aui:option  value="Murugappa">Chola</aui:option>
</aui:select>

<aui:button type="submit" value="Login"></aui:button>
</aui:form>