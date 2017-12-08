
<!DOCTYPE html>

<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>Unite Gallery - Default Theme</title>

	<script type='text/javascript' src='<%=request.getContextPath()%>/js/jquery-11.0.min.js'></script>	
	<script type='text/javascript' src='<%=request.getContextPath()%>/js/unitegallery.min.js'></script>	

	<link rel='stylesheet' href='<%=request.getContextPath()%>/css/unite-gallery.css' type='text/css' />
	
	<script type='text/javascript' src='<%=request.getContextPath()%>/js/ug-theme-default.js'></script>
	<link rel='stylesheet' href='<%=request.getContextPath()%>/css/ug-theme-default.css' type='text/css' />
	
	
</head>

<body>
	
	<h2>Default Theme</h2>
	
	<div id="gallery" style="display:none;">
	
		<img alt="Preview Image 1"
			 src="http://www.jqueryscript.net/demo/Fully-Functional-jQuery-Image-Video-Gallery-Plugin-Unite-Gallery/images/thumbs/thumb1.jpg"
			 data-image="http://www.jqueryscript.net/demo/Fully-Functional-jQuery-Image-Video-Gallery-Plugin-Unite-Gallery/images/big/image1.jpg"
			 data-description="Preview Image 1 Description">
		
		<img alt="Preview Image 2"
			 src="http://www.jqueryscript.net/demo/Fully-Functional-jQuery-Image-Video-Gallery-Plugin-Unite-Gallery/images/thumbs/thumb2.jpg"
			 data-image="http://www.jqueryscript.net/demo/Fully-Functional-jQuery-Image-Video-Gallery-Plugin-Unite-Gallery/images/big/image2.jpg"
			 data-description="Preview Image 2 Description">
			 
		<img alt="Preview Image 3"
			 src="http://www.jqueryscript.net/demo/Fully-Functional-jQuery-Image-Video-Gallery-Plugin-Unite-Gallery/images/thumbs/thumb3.jpg"
			 data-image="http://www.jqueryscript.net/demo/Fully-Functional-jQuery-Image-Video-Gallery-Plugin-Unite-Gallery/images/big/image3.jpg"
			 data-description="Preview Image 3 Description">

		<img alt="Preview Image 4"
			 src="http://www.jqueryscript.net/demo/Fully-Functional-jQuery-Image-Video-Gallery-Plugin-Unite-Gallery/images/thumbs/thumb4.jpg"
			 data-image="http://www.jqueryscript.net/demo/Fully-Functional-jQuery-Image-Video-Gallery-Plugin-Unite-Gallery/images/big/image4.jpg"
			 data-description="Preview Image 4 Description">
		
			 
	</div>
	
	<script type="text/javascript">

		jQuery(document).ready(function(){

			jQuery("#gallery").unitegallery();

		});
		
	</script>


</body>
</html>