<!DOCTYPE html>

<#include init />

<html class="${root_css_class}" dir="<@liferay.language key="lang.dir" />" lang="${w3c_language_id}">

<head>
<meta content="initial-scale=1.0, width=device-width" name="viewport" />
	<title>${the_title} - ${company_name}</title>
	<link rel="shortcut icon" type='image/x-icon' href="/theme/images/index.ico">
	
	<@liferay.js file_name="${javascript_folder}/Accrodian1.js"/> 
	<@liferay.js file_name="${javascript_folder}/Accrodian2.js"/> 
	<@liferay.js file_name="${javascript_folder}/Accrodian3.js"/> 
	
	<style>
	.control-menu-level-1{opacity: 1.2;}
	</style>


	<@liferay_util["include"] page=top_head_include />
</head>

<body class="${css_class}">

<@liferay_ui["quick-access"] contentId="#main-content" />

<@liferay_util["include"] page=body_top_include />


<#if is_signed_in>
<#assign theme_display = themeDisplay />
<#assign name = theme_display.getUser().getFullName() />
<#assign screenname = theme_display.getUser().getScreenName() />
<#assign lastLogin = theme_display.getUser().getLastLoginDate() />
<#assign user_name = user.getFullName() />
<#setting time_zone=timeZone.ID />
<#setting locale=locale.toString() />
<#setting datetime_format="dd MMM yyyy, HH':'mm':'ss a" />

<@liferay.control_menu />

<#assign rService =serviceLocator.findService("com.liferay.portal.kernel.service.UserGroupRoleLocalService")/>
<#assign usrSiteRoles = rService.getUserGroupRoles(user.getUserId())/>
<#assign roleService =serviceLocator.findService("com.liferay.portal.kernel.service.RoleLocalService")/>

<#if is_signed_in>
<#if usrSiteRoles?has_content>
<#list usrSiteRoles as usrSiteRole>

<#assign pRole = roleService.getRole(usrSiteRole.getRoleId())/>

<#assign isAdminControlPanel=pRole.getExpandoBridge().getAttribute("admin") />

<#if isAdminControlPanel == true>
<style>
.control-menu-level-1{opacity: 0.2}
.product-menu sidebar sidenav-menu{
display: none;
}
</style>
<#break>
<#else>
<style>
.control-menu-level-1 {
display: none;
}
#_com_liferay_product_navigation_product_menu_web_portlet_ProductMenuPortlet_sidenavSliderId{
display: none;
}
</style>
</#if>

</#list>
<#else>
<style>
.control-menu-level-1 {
display: none;
}
#_com_liferay_product_navigation_product_menu_web_portlet_ProductMenuPortlet_sidenavSliderId{
display: none;
}
</style>
</#if>
</#if>	

<#if is_signed_in>
<script>
$(document).ready(function(){

	$(".social-relations").hide();
var lLoginDateStr="${user.getLastLoginDate()?datetime}";

console.log("Users Last Login Date in UTC format : "+lLoginDateStr);

var am = lLoginDateStr.includes("AM");
var pm= lLoginDateStr.includes("PM");



if(am==true){
lLoginDateStr=lLoginDateStr.replace("AM", "");
console.log("After Removing AM : "+lLoginDateStr)
}

if(pm==true){
lLoginDateStr=lLoginDateStr.replace("PM", "");
console.log("After Removing PM : "+lLoginDateStr)
}

var lLoginDate=new Date(lLoginDateStr);

console.log("Users Last login date in IST as per per current system : "+lLoginDate)

function timeDifference(current, previous) {

var msPerMinute = 60 * 1000;
var msPerHour = msPerMinute * 60;
var msPerDay = msPerHour * 24;
var msPerMonth = msPerDay * 30;
var msPerYear = msPerDay * 365;

var elapsed = current - previous;

if (elapsed < msPerMinute) {
return Math.round(elapsed/1000) + ' seconds ago'; 
}

else if (elapsed < msPerHour) {
return Math.round(elapsed/msPerMinute) + ' minutes ago'; 
}

else if (elapsed < msPerDay ) {
return Math.round(elapsed/msPerHour ) + ' hours ago'; 
}

else if (elapsed < msPerMonth) {
return 'approximately ' + Math.round(elapsed/msPerDay) + ' days ago'; 
}

else if (elapsed < msPerYear) {
return 'approximately ' + Math.round(elapsed/msPerMonth) + ' months ago'; 
}

else {
return 'approximately ' + Math.round(elapsed/msPerYear ) + ' years ago'; 
}
}

console.log("Time Diffference Method : "+timeDifference(new Date(), lLoginDate));
$('.last-login').text(timeDifference(new Date(), lLoginDate));
});
</script>
</#if>
<style>
/* /*added by ashish*/
.margin-top-10{margin-top: 10px;}
.img-fixed{height: 85px;width: 85px}

/*added by ashish*/
body {width: 100%;    margin: 0 auto; overflow-x:hidden;}
.outersearch{float: left;   width: 88%;}


.outersearch .input-text-wrapper {
    margin-right: -5px;
    width: 100%;
}


.padding-0{padding: 0px;}
.navbar-inverse {    background-color: #fff; border-bottom:3px solid; border-top:3px solid;   border-color:  #0f9ddb;border-left: 0px;    border-right: 0px;    border-radius: 0px;font-weight: bold;}
	.content-center{width: 100%; margin: 0 auto;}
.header-background{background-color: #2e4c84;
    height: 40px;
    border-bottom: 4px solid red;}
    .container-fluid{padding: 0px; }
    .padding-0{padding-left: 0px;}
    .control-menu-nav{margin-right: 40px;}
    .padding-left-0{padding-left: 0px;}
    .padd_desk{padding-left: 10px; line-height: 15px;}
	.usere-heading{width: 50%; display: block;}
	.user-profile{font-size: 11px;font-weight: bold;line-height: 16px}
	section{width: 100%!important;}
	.morgappa-footer-logo{position: relative;    left: 90%;}
	.bd_img_wishbtn{padding: 0px 5px;}
	.yellow_panel_bg{text-align:center; background:#244082; height:35px; font-size:20px; color:#fff; padding-top:7px;margin-top: -4px;width: 100%; border-right:none !important;}
	.slder-p-text {margin-bottom: 10px; margin-top: 11px;} 
	.birthday-scroll{overflow-y: scroll;    height: 300px;}
	 .noti_panel_inn{height: 270px;    overflow-y: scroll;} 
	.height-slider .item>a>img{min-height: 264px;} 
	.margin-top-5{margin-top: 5px;}
	.b-day-btn li{display: inline-block;width: 50%;}
	.b-day-btn{padding-left: 0px;}
	.footer {
	margin-top : 29px;
	height: auto;
	
	position: relative;
	width: 100%;
	
}
	.plus-sign{ float: right;    margin: 2px 21px 0px -13px;    font-size: 20px;    font-weight: 600;} 
	@media only screen and (min-width: 1024px){
	
	
	.outersearch{float: left;   width: 91%;}


.outersearch .input-text-wrapper {
    margin-right: -5px;
    width: 100%;
}
	
	
	.birthday-scroll{overflow-y: scroll;    height: 300px;}
	
	
	.noti_panel_inn{    height: 204px;    overflow-y: scroll;} 
	.yellow_panel_bg{width: 100%;} 
	.noti_sub {    top: -3em;    margin-left: 20px;
}
			.CholaExpress1 {
    background: url(/theme/images/Chola_Express.png) no-repeat;
    width: 125px; 
    height: 102px;
    position: absolute;
    z-index: 0;
    background-size: 108px;
    left: 78%;
    }
    .bd_img_wishbtn{padding: 0px 5px;}
	.margin-left-15{    margin-left: -15px;}
	} 
	
	@media only screen and (min-width:321px) and (max-width:800px){
	
	.morgappa-footer-logo{position: relative;    left: 83%;}
	
	.outersearch{float: left;   width: 94%;}
	.outersearch .search-input{
	width: 100%;
	}


.outersearch .input-text-wrapper {
    margin-right: -5px;
    width: 100%;
}
	
	.birthday-scroll{overflow-y: scroll; height: 300px; margin-top: 10px;
    margin-bottom: 30px;}
	
	sup {
    top: -2em;
}
	

	.CholaExpress1{z-index: 999; top: -6px; left: 82%;}
	 
	.noti_panel_inn {    min-height: 152px;  height: 250px;     overflow-y: scroll;} 
	.b-day-btn li {    display: inline-block;    width: 49%;}
	.plus-sign{    font-size: 33px;    font-weight: bold;    float: right;    margin: -3px 21px 0px -14px;} 
	.noti_sub{background: red;    padding: 0px 4px 4px 4px;    margin-left: 1.2em;    border-radius: 5px;}
	.padding-left-right{padding-left: 0px;    padding-right: 0px;}
	.input-search .form-group{width: 100%;}
	.monthly-day:before {
    padding-top: calc(96% - 4.2em);
}
				.padding-left-0{padding-left: 0px;}
				.padd_desk{padding-left: 0px; line-height: 15px;}
				.bd_img_wishbtn{padding: 0px 5px;}
				/* .navbar-header{    background: #fecb29;} */
				.yellow_panel_bg{margin-top: 3px;}  
	.navbar-toggle {    float: right;    background: #202020;    border: 1px solid #0C0C0C;    padding: 8px;    border-radius: 5px;    cursor: pointer;   margin: 5px 15px;}
	
	} */

</style>
  
<div class="container-fluid">
<div class="header-background">
	<div class="row">
		<div class="col-md-6">
			<button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
                    <span class="icon-bar"></span><span class="icon-bar"></span><span class="icon-bar">
                    </span>
             </button>
		</div>
		<div class="col-md-6">
			<div class="CholaExpress1"> 
               
            </div>
		
		</div>
	</div>
</div>
<div class="row content-center">
		<div class="col-xs-4 col-sm-6 col-md-6 margin-top-10">
			<a  href="/group/cholamandalam-investment-and-finance"> 
			<img class="img-responsive" src="/theme/images/Chola-Logo.png" alt="Chola Logo"></a>
		</div>
		<div class="col-xs-8 col-sm-6 col-md-6">
			<div class="row">
				<div class="col-xs-3 col-sm-6 col-md-6 img-padd">
				<a href="/web/${screenname}"><img src="${user.getPortraitURL(theme_display)}" class="img-responsive pull-right img-fixed"></a>
				</div>
				<div class="col-xs-9 col-sm-6 col-md-6 padding-left-0">
				<h5 class="usere-heading"><b>Welcome  <a href="/web/${screenname}" style="color: #000;">${user_name}</a></b></h5>
				<ul class="padding-0 user-profile">
					<li><span class="glyphicon glyphicon-time" style="color:#da1b1c;">
                    </span>&nbsp;Last login :  <span class="last-login"></span>
                    </li>
					<li><a href="/user/${screenname}" style="color: #000;">My Dashboard</a>&nbsp;&nbsp;
					
					<span class="glyphicon glyphicon-off" style="color:#da1b1c;"></span>&nbsp;<a href="/c/portal/logout" style="color:#000;">Logout</a> 
					</li>
				</ul>
				</div>
               
            </div>
		</div>
		</div>
	<div class="row content-center">
	<div class="col-sm-12">
		 <#if !is_signed_in>
		<#include "${full_templates_path}/sign.ftl" />
		<#else>
		<#include "${full_templates_path}/signout.ftl" />
		</#if>

		<@liferay_util["include"] page=body_bottom_include />
		
		<@liferay_util["include"] page=bottom_include />
	
	</div>
	</div>
	
<footer>
 <div class="footer" id="footer">
        <div class="container-fluid">
            <div class="row">
<img src="/theme/images/murugappa.jpg" alt="Murugappa" class="morgappa-footer-logo">
<p style="border-top:2px solid #b24a4b; margin-top:3px; margin-bottom:20px;"></p>
</div>
</div>
</div>
</footer>

</div>
</#if>
<script>
/* jQuery(document).ready(function ($) {
	  $("li.dropdown").click(function() {
	    $("nav.navbar" ).toggleClass( "open");
	  });
	  $(".cust-nav.navbar .nav  > li > a").click(function () {
          $('ul.dropdown-menu').not($(this).siblings()).slideUp();
          $(this).siblings("ul.dropdown-menu").slideToggle();
          $(this).toggleClass('active');
          // $('span.dwn').toggleClass('transform-class');
      });

	  
	  
	}); */

</script>
</body>

</html>