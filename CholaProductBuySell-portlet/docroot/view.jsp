<%@page import="com.liferay.portal.kernel.util.WebKeys"%>
<%@page import="com.liferay.portal.kernel.theme.ThemeDisplay"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui" %>
<portlet:defineObjects />
<portlet:renderURL var="viewGallery">
   <portlet:param name="jspPage" value="/html/viewdetailedproduct.jsp" />
</portlet:renderURL>
<portlet:renderURL var="admindeletedroduct">
   <portlet:param name="jspPage" value="/html/admindeleteproduct.jsp" />
</portlet:renderURL>

<style>
.img_buy_size{width:133px; height:90px;}

.img_buy_size2{width:770px; height:300px;}
.btn_sty {background: #0b6c9e;border: medium none; padding: 3px 11px; width: auto; color: #fff;  border-radius: 5px}

</style>
<%
ThemeDisplay themeDisplay = (ThemeDisplay)request.getAttribute(WebKeys.THEME_DISPLAY);

if((themeDisplay.isSignedIn() && request.isUserInRole("Administrator"))||(themeDisplay.isSignedIn() && request.isUserInRole("TBD")))
{
	%>
	<a href="<%=admindeletedroduct%>">Delete Products</a>
	<%
}
%>

	<script type="text/javascript"
	src="<%=request.getContextPath()%>/js/jquery-ui.js"></script>
	
	<link type="text/css" href="<%=request.getContextPath()%>/js/jquery-ui.css" rel="stylesheet" />
	
	
	<script type="text/javascript">
	
	function SearchProducts(){
		var productUrl='<%=viewGallery%>';
		$("#products").html('');
		var categoryVal=$("#categories option:selected").val();
		var locationVal=$("#location option:selected").val();
		var searchKeyword=$("#searchField").val();
		var categoryId=$("#categories").val();
		var locid=$("#location").val();
		//alert("Category Val : "+categoryVal+" Location : "+locationVal+" SearchKey : "+searchKeyword);
		
		if((categoryVal==""||categoryVal==null)&&(locationVal==""||locationVal==null)&&(searchKeyword==""||searchKeyword==null)){
			$("#products").append(' <div class="col-md-12 swagtam_box_panel" style="margin-bottom:10px;margin-top:20px;">'
					+'<strong>Please select above options for products</strong>'
	                +'</div>');
		}
		else if((locationVal==""||locationVal==null)&&(searchKeyword==""||searchKeyword==null)&&(categoryVal!=""||categoryVal!=null)){
			//alert("Category is selected");
			
		 	$.ajax({
				url : '<portlet:resourceURL id="categoryWiseProductsList"/>',
				type : 'POST',
				dataType : 'json',
				data:{categoryId:categoryId},
				success : function(data) {
					//alert(JSON.stringify(data));
					if (!$.trim(data)){   
						$("#products").append(' <div class="col-md-12 swagtam_box_panel" style="margin-bottom:10px;margin-top:20px;">'
								+'<strong>No products found for selected category</strong>'
				                +'</div>');
					}
					else{   
						
						//alert(productUrl);
						for ( var i in data) {
							
							if(data[i].image_list){
								//alert("In Image List")
							/* 	$("#products").append("<div id='slider'><a href='#' class='control_next'></a><a href='#' class='control_prev'></a><ul id='"+data[i].title+"'>"
								+"</ul></div>"		
								); */
								
								var imgObj=data[i].image_list;
								
								for(var j in imgObj){
									//alert(imgObj[j].image_path);
									/* $("#"+data[i].title).append("<li><img src='/BuySellUpload/admin/"+imgObj[j].image_path+"'></li>"); */
								}
							}
							
							$("#products").append(' <div class="col-md-12 swagtam_box_panel" style="margin-bottom:10px;margin-top:20px;">'
									+' <div class="col-md-3 con_paddi"><span class="con_img_cen"><a href=""><img class="img_buy_size" src="/BuySellUpload/admin/'+imgObj[0].image_path+'"></a></span></div>'
									+' <div class="col-md-9" style="padding-top:10px;"><strong>Title : '+data[i].title+'</strong></div>'
									+'<div class="col-md-9"><strong>Description : '+data[i].description+'</strong></div>'
									
									+' <div class="col-md-12">'
					                +'<button class="con_btn_styl"><span class="con_more"><a  class="con_more" href="'+productUrl+'&productId='+data[i].id+'"> View More +</a></span></button>'
					                +'</div>'
									+'</div>'
									+'<div class="col-md-12" style="border-bottom:2px solid #dde0e1; padding-top:15px;"></div>');
										
								}	
					}
					
				
				},
				error : function() {
					console.log("There was an error. Try again please!");
				}
			});
			
		}
		else if((categoryVal==""||categoryVal==null)&&(searchKeyword==""||searchKeyword==null)&&(locationVal!=null||locationVal!="")){
			//alert("location is selected");
			
		 	$.ajax({
				url : '<portlet:resourceURL id="locationBasedProductsList"/>',
				type : 'POST',
				dataType : 'json',
				data:{locId:locid},
				success : function(data) {
					
					if (!$.trim(data)){   
						$("#products").append(' <div class="col-md-12 swagtam_box_panel" style="margin-bottom:10px;margin-top:20px;">'
								+'<strong>No products found for selected location</strong>'
				                +'</div>');
					}
					else{   
						for ( var i in data) {
							
							if(data[i].image_list){
								//alert("In Image List")
							/* 	$("#products").append("<div id='slider'><a href='#' class='control_next'></a><a href='#' class='control_prev'></a><ul id='"+data[i].title+"'>"
								+"</ul></div>"		
								); */
								
								var imgObj=data[i].image_list;
								
								for(var j in imgObj){
									//alert(imgObj[j].image_path);
									/* $("#"+data[i].title).append("<li><img src='/BuySellUpload/admin/"+imgObj[j].image_path+"'></li>"); */
								}
							}
							
							$("#products").append(' <div class="col-md-12 swagtam_box_panel" style="margin-bottom:10px;margin-top:20px;">'
									+' <div class="col-md-3 con_paddi"><span class="con_img_cen"><a href=""><img class="img_buy_size" src="/BuySellUpload/admin/'+imgObj[0].image_path+'"></a></span></div>'
									+' <div class="col-md-9" style="padding-top:10px;"><strong>Title : '+data[i].title+'</strong></div>'
									+'<div class="col-md-9"><strong>Description : '+data[i].description+'</strong></div>'
									
									+' <div class="col-md-12">'
									 +'<button class="con_btn_styl"><span class="con_more"><a  class="con_more" href="'+productUrl+'&productId='+data[i].id+'"> View More +</a></span></button>'
					                +'</div>'
									+'</div>'
									+'<div class="col-md-12" style="border-bottom:2px solid #dde0e1; padding-top:15px;"></div>');
										
								}	
					}
				},
				error : function() {
					console.log("There was an error. Try again please!");
				}
			});
		}
		else if((categoryVal==""||categoryVal==null)&&(locationVal==""||locationVal==null)&&(searchKeyword!=null||searchKeyword!="")){
			//alert("Search text is entered");
			
			$.ajax({
				url : '<portlet:resourceURL id="searchResults"/>',
				type : 'POST',
				dataType : 'json',
				data:{searchKeyword:searchKeyword},
				success : function(data) {
					$("#products").html('');
					//alert(JSON.stringify(data));
					if (!$.trim(data)){   
						$("#products").append(' <div class="col-md-12 swagtam_box_panel" style="margin-bottom:10px;margin-top:20px;">'
								+'<strong>No Products found for keyword : '+searchKeyword+'</strong>'
				                +'</div>');
					}
					else{   
						//$("#products").append("Search Results For : "+searchKeyword);
						for ( var i in data) {
							
							if(data[i].image_list){
								//alert("In Image List")
							/* 	$("#products").append("<div id='slider'><a href='#' class='control_next'></a><a href='#' class='control_prev'></a><ul id='"+data[i].title+"'>"
								+"</ul></div>"		
								); */
								
								var imgObj=data[i].image_list;
								
								for(var j in imgObj){
									//alert(imgObj[j].image_path);
									/* $("#"+data[i].title).append("<li><img src='/BuySellUpload/admin/"+imgObj[j].image_path+"'></li>"); */
								}
							}
							
							$("#products").append(' <div class="col-md-12 swagtam_box_panel" style="margin-bottom:10px;margin-top:20px;">'
							+' <div class="col-md-3 con_paddi"><span class="con_img_cen"><a href=""><img class="img_buy_size" src="/BuySellUpload/admin/'+imgObj[0].image_path+'"></a></span></div>'
							+' <div class="col-md-9" style="padding-top:10px;"><strong>Title : '+data[i].title+'</strong></div>'
							+'<div class="col-md-9"><strong>Description : '+data[i].description+'</strong></div>'
							
							+' <div class="col-md-12">'
							 +'<button class="con_btn_styl"><span class="con_more"><a  class="con_more" href="'+productUrl+'&productId='+data[i].id+'"> View More +</a></span></button>'
			                +'</div>'
							+'</div>'
							+'<div class="col-md-12" style="border-bottom:2px solid #dde0e1; padding-top:15px;"></div>');
								}	
					}
					
				
				},
				error : function() {
					console.log("There was an error. Try again please!");
				}
			});
		}
	 	
		else if((categoryVal!=""||categoryVal!=null)&&(locationVal!=""||locationVal!=null)&&(searchKeyword==null||searchKeyword=="")){
			//alert("Category and location is selected");
		 	$.ajax({
				url : '<portlet:resourceURL id="categoryAndLocaionWiseProductsList"/>',
				type : 'POST',
				dataType : 'json',
				data:{categoryId:categoryId,locId:locid},
				success : function(data) {
					
					if (!$.trim(data)){   
						$("#products").append(' <div class="col-md-12 swagtam_box_panel" style="margin-bottom:10px;margin-top:20px;">'
								+'<strong>No Products found for selected options</strong>'
				                +'</div>');
					}
					else{   
for ( var i in data) {
							
							if(data[i].image_list){
								//alert("In Image List")
							/* 	$("#products").append("<div id='slider'><a href='#' class='control_next'></a><a href='#' class='control_prev'></a><ul id='"+data[i].title+"'>"
								+"</ul></div>"		
								); */
								
								var imgObj=data[i].image_list;
								
								for(var j in imgObj){
									//alert(imgObj[j].image_path);
									/* $("#"+data[i].title).append("<li><img src='/BuySellUpload/admin/"+imgObj[j].image_path+"'></li>"); */
								}
							}
							
							$("#products").append(' <div class="col-md-12 swagtam_box_panel" style="margin-bottom:10px;margin-top:20px;">'
							+' <div class="col-md-3 con_paddi"><span class="con_img_cen"><a href=""><img class="img_buy_size" src="/BuySellUpload/admin/'+imgObj[0].image_path+'"></a></span></div>'
							+' <div class="col-md-9" style="padding-top:10px;"><strong>Title : '+data[i].title+'</strong></div>'
							+'<div class="col-md-9"><strong>Description : '+data[i].description+'</strong></div>'
							
							+' <div class="col-md-12">'
							 +'<button class="con_btn_styl"><span class="con_more"><a  class="con_more" href="'+productUrl+'&productId='+data[i].id+'"> View More +</a></span></button>'
			                +'</div>'
							+'</div>'
							+'<div class="col-md-12" style="border-bottom:2px solid #dde0e1; padding-top:15px;"></div>');
								}
					}
					
				
				},
				error : function() {
					console.log("There was an error. Try again please!");
				}
			});
			
		}
		else if((categoryVal==""||categoryVal==null)&&(locationVal!=""||locationVal!=null)&&(searchKeyword!=null||searchKeyword!="")){
			//alert("location and search is selected");
			
		 	$.ajax({
				url : '<portlet:resourceURL id="LocationAndSearchWiseProductsList"/>',
				type : 'POST',
				dataType : 'json',
				data:{locId:locid,searchKeyword:searchKeyword},
				success : function(data) {
					
					if (!$.trim(data)){   
						$("#products").append(' <div class="col-md-12 swagtam_box_panel" style="margin-bottom:10px;margin-top:20px;">'
								+'<strong>No Products found for selected options</strong>'
				                +'</div>');
					}
					else{   
							for ( var i in data) {
							
							if(data[i].image_list){
								//alert("In Image List")
							/* 	$("#products").append("<div id='slider'><a href='#' class='control_next'></a><a href='#' class='control_prev'></a><ul id='"+data[i].title+"'>"
								+"</ul></div>"		
								); */
								
								var imgObj=data[i].image_list;
								
								for(var j in imgObj){
									//alert(imgObj[j].image_path);
									/* $("#"+data[i].title).append("<li><img src='/BuySellUpload/admin/"+imgObj[j].image_path+"'></li>"); */
								}
							}
							
							$("#products").append(' <div class="col-md-12 swagtam_box_panel" style="margin-bottom:10px;margin-top:20px;">'
							+' <div class="col-md-3 con_paddi"><span class="con_img_cen"><a href=""><img class="img_buy_size" src="/BuySellUpload/admin/'+imgObj[0].image_path+'"></a></span></div>'
							+' <div class="col-md-9" style="padding-top:10px;"><strong>Title : '+data[i].title+'</strong></div>'
							+'<div class="col-md-9"><strong>Description : '+data[i].description+'</strong></div>'
							
							+' <div class="col-md-12">'
							 +'<button class="con_btn_styl"><span class="con_more"><a  class="con_more" href="'+productUrl+'&productId='+data[i].id+'"> View More +</a></span></button>'
			                +'</div>'
							+'</div>'
							+'<div class="col-md-12" style="border-bottom:2px solid #dde0e1; padding-top:15px;"></div>');
								}
					}
					
				
				},
				error : function() {
					console.log("There was an error. Try again please!");
				}
			});
			
			
		}
		else if((categoryVal!=""||categoryVal!=null)&&(locationVal==""||locationVal==null)&&(searchKeyword!=null||searchKeyword!="")){
			//alert("category and search is selected");
			
			
		 	$.ajax({
				url : '<portlet:resourceURL id="categoryAndSearchWiseProductsList"/>',
				type : 'POST',
				dataType : 'json',
				data:{categoryId:categoryId,searchKeyword:searchKeyword},
				success : function(data) {
					
					if (!$.trim(data)){   
						$("#products").append(' <div class="col-md-12 swagtam_box_panel" style="margin-bottom:10px;margin-top:20px;">'
								+'<strong>No Products found for selected options</strong>'
				                +'</div>');
					}
					else{   
						for ( var i in data) {
							
							if(data[i].image_list){
								//alert("In Image List")
							/* 	$("#products").append("<div id='slider'><a href='#' class='control_next'></a><a href='#' class='control_prev'></a><ul id='"+data[i].title+"'>"
								+"</ul></div>"		
								); */
								
								var imgObj=data[i].image_list;
								
								for(var j in imgObj){
									//alert(imgObj[j].image_path);
									/* $("#"+data[i].title).append("<li><img src='/BuySellUpload/admin/"+imgObj[j].image_path+"'></li>"); */
								}
							}
							
							$("#products").append(' <div class="col-md-12 swagtam_box_panel" style="margin-bottom:10px;margin-top:20px;">'
							+' <div class="col-md-3 con_paddi"><span class="con_img_cen"><a href=""><img class="img_buy_size" src="/BuySellUpload/admin/'+imgObj[0].image_path+'"></a></span></div>'
							+' <div class="col-md-9" style="padding-top:10px;"><strong>Title : '+data[i].title+'</strong></div>'
							+'<div class="col-md-9"><strong>Description : '+data[i].description+'</strong></div>'
							
							+' <div class="col-md-12">'
							 +'<button class="con_btn_styl"><span class="con_more"><a  class="con_more" href="'+productUrl+'&productId='+data[i].id+'"> View More +</a></span></button>'
			                +'</div>'
							+'</div>'
							+'<div class="col-md-12" style="border-bottom:2px solid #dde0e1; padding-top:15px;"></div>');
								}
					}
					
				
				},
				error : function() {
					console.log("There was an error. Try again please!");
				}
			});
		} 
		else if((categoryVal!=""||categoryVal!=null)&&(locationVal!=""||locationVal!=null)&&(searchKeyword!=null||searchKeyword!="")){
			//alert("location, category and search is selected");
			
		 	$.ajax({
				url : '<portlet:resourceURL id="categoryLocationAndSearchWiseProductsList"/>',
				type : 'POST',
				dataType : 'json',
				data:{categoryId:categoryId,locId:locid,searchKeyword:searchKeyword},
				success : function(data) {
					
					if (!$.trim(data)){   
						$("#products").append(' <div class="col-md-12 swagtam_box_panel" style="margin-bottom:10px;margin-top:20px;">'
								+'<strong>No Products found for selected options</strong>'
				                +'</div>');
					}
					else{   
						for ( var i in data) {
							
							if(data[i].image_list){
								//alert("In Image List")
							/* 	$("#products").append("<div id='slider'><a href='#' class='control_next'></a><a href='#' class='control_prev'></a><ul id='"+data[i].title+"'>"
								+"</ul></div>"		
								); */
								
								var imgObj=data[i].image_list;
								
								for(var j in imgObj){
									//alert(imgObj[j].image_path);
									/* $("#"+data[i].title).append("<li><img src='/BuySellUpload/admin/"+imgObj[j].image_path+"'></li>"); */
								}
							}
							
							$("#products").append(' <div class="col-md-12 swagtam_box_panel" style="margin-bottom:10px;margin-top:20px;">'
							+' <div class="col-md-3 con_paddi"><span class="con_img_cen"><a href=""><img class="img_buy_size" src="/BuySellUpload/admin/'+imgObj[0].image_path+'"></a></span></div>'
							+' <div class="col-md-9" style="padding-top:10px;"><strong>Title : '+data[i].title+'</strong></div>'
							+'<div class="col-md-9"><strong>Description : '+data[i].description+'</strong></div>'
							
							+' <div class="col-md-12">'
							 +'<button class="con_btn_styl"><span class="con_more"><a  class="con_more" href="'+productUrl+'&productId='+data[i].id+'"> View More +</a></span></button>'
			                +'</div>'
							+'</div>'
							+'<div class="col-md-12" style="border-bottom:2px solid #dde0e1; padding-top:15px;"></div>');
								}
					}
					
				
				},
				error : function() {
					console.log("There was an error. Try again please!");
				}
			});
			
			
		} 
		
		
		
		
	}
	
	
/* 	function searchResults(that) {
		$("#products").html('');
		var searchKeyword=$("#searchField").val();
		//alert("Search Keyword : "+searchKeyword);
		if(searchKeyword==null){
			searchKeyword='';
		}
		
		$.ajax({
			url : '<portlet:resourceURL id="searchResults"/>',
			type : 'POST',
			dataType : 'json',
			data:{searchKeyword:searchKeyword},
			success : function(data) {
				//alert(JSON.stringify(data));
				if (!$.trim(data)){   
					$("#products").append("No Products found for keyword : "+searchKeyword);
				}
				else{   
					$("#products").append("Search Results For : "+searchKeyword);
					for ( var i in data) {
						$("#products").append("<div>Title : "+data[i].title+"<br>"
						+"Description : "+data[i].description+"<br>"
						+"View User's Profle : <a href='/web/"+data[i].user_id+"' target='_blank'>Contact User</a>"
						+"</div>");
							}	
				}
				
			
			},
			error : function() {
				console.log("There was an error. Try again please!");
			}
		});
	} */
	
	
/* function locationBasedProducts(that){
		$("#products").html('');
	//alert("Location Based search");
	var locname=$('#locationFilter').val();
	
	var locid=$("#"+locname).val();
	//alert(locid);
	if(locid==null){
		locid='';
	}
 	$.ajax({
		url : '<portlet:resourceURL id="locationBasedProductsList"/>',
		type : 'POST',
		dataType : 'json',
		data:{locId:locid},
		success : function(data) {
			
			if (!$.trim(data)){   
				$("#products").append("No Products for particular Location")
			}
			else{   
				for ( var i in data) {
					$("#products").append("<div>Title : "+data[i].title+"<br>"
					+"Description : "+data[i].description+"<br>"
					+"View User's Profle : <a href='/web/"+data[i].user_id+"' target='_blank'>Contact User</a>"
					+"</div>");
						}	
			}
		},
		error : function() {
			console.log("There was an error. Try again please!");
		}
	});
	
} */
	
	



$(document).ready(function(){

 	$.ajax({
		url : '<portlet:resourceURL id="getLocationList"/>',
		type : 'POST',
		dataType : 'json',
		<%--data:{scName: '<%=screenName%>',trainingId:id}, --%>
		success : function(data) {
			//alert(JSON.stringify(data));
			
			var values = new Array();

			for (var i in data) 
			{
			$("#DataForUse").append("<input type='hidden' id='"+data[i].name+"'  value='"+data[i].id+"' />")
			values.push(data[i].name);
			
			$("#location").append("<option value='" + data[i].id + "'>"
					+data[i].name
					+ "</option>"
							);
			}
			$( "#locationFilter" ).autocomplete({
			source: values
			});
			
			
		/* 	for ( var i in data) {
				$("#productLocation").append("<option value='"+data[i].id+"''>"+data[i].name+"</option>");
				}	 */
		},
		error : function() {
			console.log("There was an error. Try again please!");
		}
	});	
	
	
 	$.ajax({
		url : '<portlet:resourceURL id="productCategoryList"/>',
		type : 'POST',
		dataType : 'json',
		<%--data:{scName: '<%=screenName%>',trainingId:id}, --%>
		success : function(data) {
			//alert(JSON.stringify(data));
			
			for ( var i in data) {
				$("#category").append("<div><a href='javascript:;' onclick='fetchProducts(this)'>"+data[i].name+"</a>"
						
				+"<input type='hidden' id='categoryId' value='"+data[i].id+"'></div>"
				);
				
				$("#categories").append("<option value='" + data[i].id + "'>"
				+ data[i].name
				+ "</option>"
						);
				
				}	
		},
		error : function() {
			console.log("There was an error. Try again please!");
		}
	});	
});



<%-- function fetchProducts(that){
	$('#products').html('');
	
	//alert(that);
	var isLocation=$.trim($('#locationFilter').val());
	//alert("Location ame : "+isLocation+".");
	
	var categoryId=$(that).siblings("#categoryId").val();
	if(categoryId==null){
		categoryId=0;
	}
	
	if(isLocation){
		//alert("IF");
		var locid=$("#"+isLocation).val();
		//alert("Location ame : "+isLocation+".");
		//alert("If Location Id: "+locid);
		
	 	$.ajax({
			url : '<portlet:resourceURL id="categoryAndLocaionWiseProductsList"/>',
			type : 'POST',
			dataType : 'json',
			data:{categoryId:categoryId,locId:locid},
			success : function(data) {
				
				if (!$.trim(data)){   
					$("#products").append("No Products for particular Category")
				}
				else{   
					for ( var i in data) {
						$("#products").append("<div>Title : "+data[i].title+"<br>"
						+"Description : "+data[i].description+"<br>"
						+"View User's Profle : <a href='/web/"+data[i].user_id+"' target='_blank'>Contact User</a>"
						+"</div>");
							}	
				}
				
			
			},
			error : function() {
				console.log("There was an error. Try again please!");
			}
		});
		
	}else{
		//alert("else");
	 	$.ajax({
			url : '<portlet:resourceURL id="categoryWiseProductsList"/>',
			type : 'POST',
			dataType : 'json',
			data:{categoryId:categoryId},
			success : function(data) {
				//alert(JSON.stringify(data));
				if (!$.trim(data)){   
					$("#products").append("No Products for particular Category")
				}
				else{   
					
					var productUrl='<%=viewGallery%>';
					
					//alert(productUrl);
					for ( var i in data) {
						
						/* if(data[i].image_list){
							alert("In Image List")
							$("#products").append("<div id='slider'><a href='#' class='control_next'></a><a href='#' class='control_prev'></a><ul id='"+data[i].title+"'>"
							+"</ul></div>"		
							);
							
							var imgObj=data[i].image_list;
							
							for(var j in imgObj){
								alert(imgObj[j].image_path);
								$("#"+data[i].title).append("<li><img src='/BuySellUpload/admin/"+imgObj[j].image_path+"'></li>");
							}
						} */
						
						$("#products").append("<div>Title : "+data[i].title+"<br>"
						+"Description : "+data[i].description+"<br>"
						+"View User's Profle : <a href='/web/"+data[i].user_id+"' target='_blank'>Contact User</a><br><a href='"+productUrl+"&productId="+data[i].id+"'>View More</a>"
						+"</div>");
							}	
				}
				
			
			},
			error : function() {
				console.log("There was an error. Try again please!");
			}
		});
	}
} --%>
</script>	
<portlet:renderURL var="selljspURL">
<portlet:param name="jspPage" value="/html/SellProduct.jsp" />
</portlet:renderURL>

<portlet:renderURL var="buyjspURL">
<portlet:param name="jspPage" value="/html/BuyProduct.jsp" />
</portlet:renderURL>

<aui:button
type="submit"
value="Sell"
onClick="<%= selljspURL.toString() %>"
/>

<%-- <aui:button
type="submit"
value="Buy"
onClick="<%= buyjspURL.toString() %>"
/> --%>

<br>
<br>
<!-- Search Products : <input type="text" id="searchField" name="searchField"/>
<input type="button" name="SearchBtn" value="Search" id="SearchBtn" onclick="searchResults(this)"><br>


Location Wise Filter : 

<input type="text" value="" name="locationFilter" id="locationFilter">
<input type="button" value="Location Based Filter" onclick="locationBasedProducts(this)"/>

<div id="category">
</div>
<div id="DataForUse">
</div>
 -->

<!-- <div id="products">
</div> -->

<!--   <div class="col-md-6" style="text-align:justify;"> -->
    <div class="BM_panel">
      <div class="right_panel_mid1_01">
        <div class="tabContent" id="about"><span class="abt_text_head abt_text_headcol">Buy / Sell</span>
          <div class="row con_main_panel">
            
            
          <div class="col-md-12">
            <div class="col-md-3" style="padding-left:0px;">
                    <center>
             <label>Browse Categories</label>
             </center>
             <select class="form-control input-sm" id="categories" style="background:#d8dde0;">
		<option value="">-- Category --</option>
	      </select>
            </div>
            
            <div class="col-md-4" style="padding-left:0px;">
	      <center>
             <label>Select Your City</label>
             </center>
             <select class="form-control input-sm" id="location" style="background:#d8dde0;">
		<option value="">-- City --</option>
	      </select>
	      
	      
            </div>
            <div class="col-md-4" style="padding-left:0px;">
            <center>
             <label>Search For a Specific Product</label>
             </center>

	      <input type="text" class="form-control input-sm"  style="background:#d8dde0;" id="searchField" name="searchField"/>
<!-- <input type="button" name="SearchBtn" value="Search" id="SearchBtn" onclick="searchResults(this)"><br> -->


            </div>
            
            <div class="col-md-1" style="padding-left:0px;">
            <center>
             <label>&nbsp;</label>
             </center>
            <input type="button" class="btn_sty" name="SearchBtn" value="Search" id="SearchBtn" onclick="SearchProducts()"></div>
            
          </div>
          
       <div id="products">
          
          </div>
          <br>
          <br>
          <br>
          <br>
        </div>
      </div>
    </div>




