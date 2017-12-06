       <#if has_navigation && is_setup_complete>
			<#include "${full_templates_path}/navigation.ftl" />
		</#if>
	<#assign usrRoles = user.getRoles()>
<!-- <#list usrRoles as usrRole>
    <#if usrRole.getName() != "Administrator">
    <style>
	.control-menu-level-1{
	  display:none;
	}
	</style>
	<#else>
	<style>
	.control-menu-level-1{
	  display:block;
	}
	</style>
	
    </#if>
</#list> --> 

<section id="content" class="container" style="padding: 0px;">
		<h1 class="hide-accessible">${the_title}</h1>
    	<#if selectable>
			<@liferay_util["include"] page=content_include />
		<#else>
			${portletDisplay.recycle()}

			${portletDisplay.setTitle(the_title)}

			<@liferay_theme["wrap-portlet"] page="portlet.ftl">
				<@liferay_util["include"] page=content_include />
			</@>
		</#if>
	</section>