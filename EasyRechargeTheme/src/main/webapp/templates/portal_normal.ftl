<!DOCTYPE html>

<#include init />

<html class="${root_css_class}" dir="<@liferay.language key="lang.dir" />" lang="${w3c_language_id}">
<style>
.form-group > label{
    color: #0c0a0a;
}

</style>
<head>
	<#-- <title>${the_title} - ${company_name}</title> -->
	<link rel="shortcut icon" href="/theme/images/custom/index.ico">
	<meta content="initial-scale=1.0, width=device-width" name="viewport" />

	<@liferay_util["include"] page=top_head_include />
	
	
	<title>Easy Recharge a  Business Corporate Category Flat Bootstrap Responsive Website Template | Home :: w3layouts</title>

<link href="/theme/EasyRecharge/css/bootstrap.css" rel="stylesheet">
<link href="/theme/EasyRecharge/css/style.css" rel="stylesheet" type="text/css" media="all" />

<#-- for-mobile-apps -->
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords" content="Easy Recharge Responsive web template, Bootstrap Web Templates, Flat Web Templates, Android Compatible web template, 
	Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyEricsson, Motorola web design" />
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
<#-- //for-mobile-apps -->
<#--fonts-->
<link href='//fonts.googleapis.com/css?family=Varela+Round' rel='stylesheet' type='text/css'>
<link href='//fonts.googleapis.com/css?family=Open+Sans:400,300,300italic,400italic,600,600italic,700,700italic,800,800italic' rel='stylesheet' type='text/css'>
<#--//fonts-->	
<script>

$(document).ready(function() {
      $('.input-container').removeAttr('disabled');
    });
</script>
								<script>
									$(document).ready(function () {
										$('.nav-tabs > li a[title]').tooltip();
										
										$('a[data-toggle="tab"]').on('show.bs.tab', function (e) {

											var $target = $(e.target);
										
											if ($target.parent().hasClass('disabled')) {
												return false;
											}
										});

										$(".next-step").click(function (e) {

											var $active = $('.wizard .nav-tabs li.active');
											$active.next().removeClass('disabled');
											nextTab($active);

										});
										$(".prev-step").click(function (e) {

											var $active = $('.wizard .nav-tabs li.active');
											prevTab($active);

										});
									});

									function nextTab(elem) {
										$(elem).next().find('a[data-toggle="tab"]').click();
									}
									function prevTab(elem) {
										$(elem).prev().find('a[data-toggle="tab"]').click();
									}
								</script>
</head>

<body class="${css_class}">

<@liferay_ui["quick-access"] contentId="#main-content" />

<@liferay_util["include"] page=body_top_include />

<@liferay.control_menu />

	<div class="header">	
			<div class="logo">
			   <h1><a href="index.html"><i><img src="/theme/EasyRecharge/images/cell.png" alt=" " /></i>Easy Recharge</a></h1>
			</div>
			<div class="top-nav">
				<span class="menu"><img src="/theme/EasyRecharge/images/menu.png" alt=" " /></span>
				<ul class="nav1">
					<li><a href="#" data-toggle="modal" data-target="#myModal">Mobile</a></li>
					<li><a href="#" data-toggle="modal" data-target="#myModal2">datacard</a></li>
					<li><a href="#" data-toggle="modal" data-target="#myModal1">DTH</a></li>
					<li><a href="#" data-toggle="modal" data-target="#myModal3">landline</a></li>
					<#if !is_signed_in>
					<li><a href="#" data-toggle="modal" data-target="#myModal4">login</a></li>
					<li><a href="#" data-toggle="modal" data-target="#myModal5">Signup</a></li>
					</#if>
				</ul>
						<!-- script-for-menu -->
						 <script>
						   $( "span.menu" ).click(function() {
							 $( "ul.nav1" ).slideToggle( 300, function() {
							 // Animation complete.
							  });
							 });
						</script>
						<!-- /script-for-menu -->
			</div>
			<!-- start search-->
				    <div class="search-box">
					    <div id="sb-search" class="sb-search">
							<form>
								<input class="sb-search-input" placeholder="Enter your search item..." type="search" name="search" id="search">
								<input class="sb-search-submit" type="submit" value="">
								<span class="sb-icon-search"> </span>
							</form>
						</div>
				    </div>
					<#-- Search script -->
					<script src="/theme/EasyRecharge/js/classie.js"></script>
					<script src="/theme/EasyRecharge/js/uisearch.js"></script>
						<script>
							new UISearch( document.getElementById( 'sb-search' ) );
						</script>
						<#-- Search script -->
				
				
			
			<div class="clearfix"> </div>
	</div>


	<section id="content">
		<h1 class="hide-accessible">${the_title}</h1>

		<#--<nav id="breadcrumbs">
			<@liferay.breadcrumbs />
		</nav>-->

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

<footer>
     	<div class="footer">
	<div class="container">
		<h2><a href="index.html">Easy Recharge</a></h2>
		<p>© 2017 Easy Recharge. All Rights Reserved | Design by <a href="https://www.minfomatrix.com/" target="_blank">Mohit Mehral</a></p>
		<ul>
			<li><a class="face1" href="#"></a></li>
			<li><a class="face2"href="#"></a></li>
			<li><a class="face3" href="#"></a></li>
			<li><a class="face4" href="#"></a></li>
		</ul>
	</div>
</div>
        </footer>

<@liferay_util["include"] page=body_bottom_include />

<@liferay_util["include"] page=bottom_include />

<#-- login -->
			  <#-- Modal -->
  <div class="modal fade" id="myModal4" role="dialog">
    <div class="modal-dialog">
    
      <!-- Modal content-->
      <div class="modal-content">
        <div class="modal-header">
          <button type="button" class="close" data-dismiss="modal">&times;</button>
          <h2 class="modal-title" style="color:cadetblue;">Login</h2>
        </div>
        <div class="modal-body">
          		<@liferay_portlet["runtime"]
defaultPreferences=default_preferences
portletName="com_liferay_login_web_portlet_LoginPortlet"
/>
        </div>
      </div>
      
    </div>
  </div>
			
			<#-- login -->

</body>

</html>