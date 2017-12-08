
<%@page import="com.chola.productbuysell.service.BuySellLocalServiceUtil"%>
<%@page import="com.chola.productbuysell.service.BuySellProductsLocalServiceUtil"%>
<%@page import="com.chola.productbuysell.model.BuySellProducts"%>
<%@page import="com.liferay.portal.kernel.dao.orm.RestrictionsFactoryUtil"%>
<%@page import="com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil"%>
<%@page import="com.liferay.portal.kernel.dao.orm.DynamicQuery"%>
<%@page import="com.liferay.portal.kernel.util.ListUtil"%>
<%@page import="javax.portlet.RenderResponse"%>
<%@page import="com.liferay.portal.kernel.util.WebKeys"%>
<%@page import="com.liferay.portal.kernel.theme.ThemeDisplay"%>
<%@page import="javax.portlet.PortletURL"%>
<%@page import="java.util.List"%>
<%@taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet"%>
<%@taglib uri="http://liferay.com/tld/ui"  prefix="liferay-ui"%>

<portlet:defineObjects/>
<portlet:renderURL var="back">
   <portlet:param name="jspPage" value="/view.jsp" />
</portlet:renderURL>
<liferay-ui:header title="Home"
	backLabel="Back" backURL="<%=back%>" />
<%
 PortletURL iteratorURL = renderResponse.createRenderURL();
	iteratorURL.setParameter("jspPage", "/html/updatesop.jsp");
 
 ClassLoader cl = BuySellProducts.class.getClassLoader();
 long status=1;
 DynamicQuery dynamicQuery= DynamicQueryFactoryUtil.forClass(BuySellProducts.class,cl).add(RestrictionsFactoryUtil.eq("status",status));
	List<BuySellProducts> bussDetails = BuySellProductsLocalServiceUtil.dynamicQuery(dynamicQuery);
 %>
 

<liferay-ui:search-container delta="5" deltaConfigurable="true" total="<%=bussDetails.size()%>" emptyResultsMessage="No Records Found !!!" iteratorURL="<%=iteratorURL%>">
    <liferay-ui:search-container-results  results="<%= ListUtil.subList(bussDetails, searchContainer.getStart(), searchContainer.getEnd()) %>" />
    <liferay-ui:search-container-row className="com.chola.productbuysell.model.BuySellProducts" keyProperty="sopId" modelVar="sop">
        
         <liferay-ui:search-container-column-text name="Id" value="${sop.id}" />
        <%
        List<Object[]> categoryList=BuySellLocalServiceUtil.getProductCategoryList();
        for(Object[] obj:categoryList){
        	
        	String categoryId=obj[0].toString();
    if(categoryId.equals(String.valueOf(sop.getCategory_id()))){
    	%>
    	  <liferay-ui:search-container-column-text name="Category" value="<%=obj[1].toString() %>" />
    	<%
    	
    }
	
        }
        %>
      
        <liferay-ui:search-container-column-text name="Title" value="${sop.title}" />
        <liferay-ui:search-container-column-text name="Description" value="${sop.description}" />
        
        <%
        List<Object[]> lt = BuySellLocalServiceUtil.getLocationList();
        for(Object[] obj1:lt){
        	String locationId=obj1[0].toString();
        	 if(locationId.equals(String.valueOf(sop.getLocation()))){
        	    	%>
        	    	 <liferay-ui:search-container-column-text name="Location" value="<%=obj1[1].toString() %>" />
        	    	<%
        	    	
        	    }
        }
        %>
         <liferay-ui:search-container-column-text name="Added By" value="${sop.userScreenName}" />
        <liferay-ui:search-container-column-jsp name="Actions" path="/html/editDetails.jsp"/>
    </liferay-ui:search-container-row>
    <liferay-ui:search-iterator />
</liferay-ui:search-container> 

