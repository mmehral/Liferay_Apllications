<!DOCTYPE html>

<#include init />

<html class="${root_css_class}" dir="<@liferay.language key="lang.dir" />" lang="${w3c_language_id}">

<head>
	<#-- <title>${the_title} - ${company_name}</title> -->
	<#-- <link rel="shortcut icon" href="/theme/images/custom/index.ico">-->
	<meta content="initial-scale=1.0, width=device-width" name="viewport" />

	<@liferay_util["include"] page=top_head_include />
	
	<title>MinfoMatrix</title>

<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords" content="Andragogy Responsive web template, Bootstrap Web Templates, Flat Web Templates, Android Compatible web template, 
Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyEricsson, Motorola web design" />
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false);
		function hideURLbar(){ window.scrollTo(0,1); } </script>


<link href="/theme/MySite/css/font-awesome.css" rel="stylesheet"> 

<link href="//fonts.googleapis.com/css?family=Oswald:300,400,700&amp;subset=latin-ext" rel="stylesheet">
<link href='//fonts.googleapis.com/css?family=Open+Sans:400,300,300italic,400italic,600,600italic,700,700italic,800,800italic' rel='stylesheet' type='text/css'>
</head>

<body class="${css_class}">

<@liferay_ui["quick-access"] contentId="#main-content" />

<@liferay_util["include"] page=body_top_include />

<@liferay.control_menu />
<!-- header -->
	<div class="header_address_mail">
		<div class="container">
			<div class="agileits_w3layouts_header_address_grid">
				<ul>	
					<li><a href="mailto:mehral.mohit09@gmail.com">mehral.mohit09@gmail.com</a></li>
					<li><i class="fa fa-phone" aria-hidden="true"></i></li>
					<li>+(91) 998 735 7920</li>
				</ul>
			</div>
		</div>
	</div>
	<div class="header">
		<div class="container">
			<div class="w3_agile_logo">
				<h1><a href="/web/minfomatrix/home"><span>M</span>info<span>M</span>atrix</a></h1>
			</div>
			<div class="header-nav">
				<nav class="navbar navbar-default">
					<div class="navbar-header navbar-left">
						<button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
							<span class="sr-only">Toggle navigation</span>
							<span class="icon-bar"></span>
							<span class="icon-bar"></span>
							<span class="icon-bar"></span>
						</button>
					</div>
					<!-- Collect the nav links, forms, and other content for toggling -->
					<div class="collapse navbar-collapse navbar-right" id="bs-example-navbar-collapse-1">
						<nav class="link-effect-12">
							<ul class="nav navbar-nav w3_agile_nav">
								<li class="active"><a href="/web/minfomatrix/home"><span>Home</span></a></li>
								<li><a href="/web/minfomatrix/gallery"><span>Gallery</span></a></li>
								<li><a href="/web/minfomatrix/about-us"><span>About Us</span></a></li>
								<li class="dropdown">
									<a href="#" class="dropdown-toggle" data-toggle="dropdown"><span data-hover="Short Codes">Learn</span> <b class="caret"></b></a>
									<ul class="dropdown-menu agile_short_dropdown">
										<li><a href="/web/minfomatrix/blogs/liferay">Liferay</a></li>
										<li><a href="/web/minfomatrix/blogs/webcenter-sites">Webcenter Sites</a></li>
									</ul>
								</li>
								<li><a href="/web/minfomatrix/mail-us"><span>Mail Us</span></a></li>
							</ul>
							
						</nav>
					</div>
				</nav>
			</div>
			<div class="clearfix"> </div>
		</div>
	</div>
<!-- header -->

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

<!-- subscribe -->
	<div class="footer-top">
		<div class="container">
			<div class="col-md-4 welcome">
				<h3>MinfoMatrix</h3>
				<p>The platform to help beginners learn and grow. Come be a part of our initiative, whether as an involved engineer, a student, a community volunteer, or a partner. Pulling together, we can accomplish our goal.</p>
				
			</div>
			<div class="col-md-3 address">
				<h3>Address</h3>
					<p>Siddharth Nagar
						<span>Bapty Road,Mumbai - 400008.</span>
					</p>
					<p class="phone">Phone : +91 998 735 7920
						<span>Email : <a href="mailto:mehral.mohit09@gmail.com">mehral.mohit09@gmail.com</a></span>
					</p>
			</div>
			<div class="col-md-5 wthree-subscribe">
				<h3>Newsletter </h3>
				<p>Receive the latest useful information, daily.</p>
				<div class="w3-agileits-subscribe-form">
					<form action="#" method="post">
						<input type="text" placeholder="Email" name="Subscribe" required="">
						<button class="btn1">Subscribe</button>
					</form>
				</div>
				<div class="agile_header_social">
					<ul class="agileits_social_list">
						<li><a href="#" class="w3_agile_facebook"><i class="fa fa-facebook" aria-hidden="true"></i></a></li>
						<li><a href="#" class="agile_twitter"><i class="fa fa-twitter" aria-hidden="true"></i></a></li>
						<li><a href="#" class="w3_agile_dribble"><i class="fa fa-dribbble" aria-hidden="true"></i></a></li>
						<li><a href="#" class="w3_agile_vimeo"><i class="fa fa-vimeo" aria-hidden="true"></i></a></li>
					</ul>
				</div>
			</div>
				<div class="clearfix"></div>
		</div>
	</div>
<!-- //subscribe -->
<!-- copy-right -->
	<div class="copy-right-grids">
		<div class="container">
			<div class="copy-left">
				<p class="footer-gd">© 2017 MinfoMatrix. All Rights Reserved | Design by Mohit Mehral</p>
			</div>
				<div class="clearfix"></div>
		</div>
	</div>
<!-- //copy-right -->
<!-- start-smooth-scrolling -->
<script type="text/javascript" src="js/move-top.js"></script>
<script type="text/javascript" src="js/easing.js"></script>
<script type="text/javascript">
	jQuery(document).ready(function($) {
		$(".scroll").click(function(event){		
			event.preventDefault();
			$('html,body').animate({scrollTop:$(this.hash).offset().top},1000);
		});
	});
</script>
<!-- start-smooth-scrolling -->
<!-- for bootstrap working -->
	<script src="/theme/MySite/js/bootstrap.js"></script>
<!-- //for bootstrap working -->
<!-- here stars scrolling icon -->
	<script type="text/javascript">
		$(document).ready(function() {
			/*
				var defaults = {
				containerID: 'toTop', // fading element id
				containerHoverID: 'toTopHover', // fading element hover id
				scrollSpeed: 1200,
				easingType: 'linear' 
				};
			*/
								
			$().UItoTop({ easingType: 'easeOutQuart' });
								
			});
	</script>
<!-- //here ends scrolling icon -->

<@liferay_util["include"] page=body_bottom_include />

<@liferay_util["include"] page=bottom_include />

</body>
</html>