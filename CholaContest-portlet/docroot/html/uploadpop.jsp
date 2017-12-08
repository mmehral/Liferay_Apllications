<%@taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<portlet:defineObjects/>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js"></script>

<script type="text/javascript">
    $(document).ready(function(){
    	document.getElementById("contesttable[0].srno").value=1;
  classValidations();

    });
	   // a.style.border = '1px solid red';

    function classValidations(){

        $(".onlynumber").keyup(function (){

            $(this).val($(this).val().replace(/[^0-9]/g,''));

        });
        $(".notMandatory").keyup(function (){

            $(this).val($(this).val().replace(/[^0-9]/g,''));

        });
        $(".onlyAmt").keyup(function (){

            $(this).val($(this).val().replace(/[^0-9\.]/g,''));

        });

        $(".onlyAmtRate9_2").keyup(function (){
            var vint = 7;
            var vdec = 2;
            var val = $(this).val();


            var no_decimal = val.split('.');
            //alert(no_decimal.length);
            if(no_decimal.length >= (vdec+1)){
                val= val.substr(0,val.length-1);
            }

            if(no_decimal.length == vdec){

                var x = no_decimal[0];
                var y = no_decimal[1];

                if(y.length > vdec){
                    y = y.substring(0,y.length-1);
                }

                val = x+"."+y;
            }

            var index1 = val.indexOf('.',0)
            if(index1 == 0 && (val.length==1)){
                val= '0.0';
            }


            if(index1<0 && (val.length > vint)){
                // alert("ok");
                val = val.substr(0,val.length-1);
            }

            $(this).val(val.replace(/[^0-9\.]/g,''));

        });


        $(".onlyAmtRate9_2").blur(function (){
            // alert("ok");
            var vdecmlpostn = 8;
            var val = $(this).val();
            var index = val.substr(length-1, 1);

            if(index == '.' && val.length == vdecmlpostn){
                //alert("index.lengthooo");
                val = val.substr(0,(val.length-1));
                $(this).val(val);
            }
        });


        $(".onlyAmt12_2").keyup(function (){
            var vint = 10;
            var vdec = 2;
            var val = $(this).val();


            var no_decimal = val.split('.');
            //alert(no_decimal.length);
            if(no_decimal.length >= (vdec+1)){
                val= val.substr(0,val.length-1);
            }//remove second decimal on key up

            if(no_decimal.length == vdec){

                var x = no_decimal[0];
                var y = no_decimal[1];
                if(x.length==9){
                    if(y.length > vdec){
                        y = y.substring(0,y.length-1);
                    }

                    val = x+"."+y;
                }

                if(x.length==10){
                    // alert("10000")
                    if(y.length > 1){
                        y = y.substring(0,y.length-1);
                    }

                    val = x+"."+y;
                }

            }

            var index1 = val.indexOf('.',0)
            if(index1 == 0 && (val.length==1)){
                val= '0.0';
            }


            if(index1<0 && (val.length > vint)){
                // alert("ok");
                val = val.substr(0,val.length-1);
            }

            $(this).val(val.replace(/[^0-9\.]/g,''));

        });


        $(".onlyAmt12_2").blur(function (){
            // alert("ok");
            var vdecmlpostn = 11;
            var val = $(this).val();
            var index = val.substr(length-1, 1);

            if(index == '.' && val.length == vdecmlpostn){
                //alert("index.lengthooo");
                val = val.substr(0,(val.length-1));
                $(this).val(val);
            }
        });

        $(".onlyAmtRate7_2").keyup(function (){
            var vint = 5;
            var vdec = 2;
            var val = $(this).val();
            var no_decimal = val.split('.');
            if(no_decimal.length >= (vdec+1)){
                val= val.substr(0,val.length-1);
            }

            if(no_decimal.length == vdec){

                var x = no_decimal[0];
                var y = no_decimal[1];

                if(y.length > vdec){
                    y = y.substring(0,y.length-1);
                }
                val = x+"."+y;
            }

            var index1 = val.indexOf('.',0)
            if(index1 == 0 && (val.length==1)){
                val= '0.0';
            }

            if(index1<0 && (val.length > vint)){
                // alert("ok");
                val = val.substr(0,val.length-1);
            }

            $(this).val(val.replace(/[^0-9\.]/g,''));

        });

        $(".onlyAmtRate7_2").blur(function (){
            // alert("ok");
            var vdecmlpostn = 6;
            var val = $(this).val();
            var index = val.substr(val.length-1, 1);
            if(index == '.' && val.length == vdecmlpostn){
                val = val.substr(0,(val.length-1));
                $(this).val(val);
            }
        });

        //    $(".onlyAmt7_2").keyup(function (){
        //
        //        $(this).val($(this).val().replace(/^-?\d{1,10}$/,''));
        //
        //    });
        //    $(".onlyAmt").blur(function (){
        //
        //        if($(this).val()!=""){
        //            if(isNaN($(this).val())){
        //                $(this).val("");
        //            }else{
        //                var v = Math.round(parseFloat($(this).val())*100)/100;
        //                if(v.indexOf('.')<0)
        //                {
        //                    v = v+'.0';
        //                }
        //                alert("ok");
        //                $(this).val(v);
        //            }
        //        }
        //
        //    });

        $(".onlyAmt").blur(function (){

            if($(this).val()!=""){
                if(isNaN($(this).val())){
                    $(this).val("");
                }else{
                    //alert("ok");
                    $(this).val(Math.round(parseFloat($(this).val())*100)/100);
                }
            }

        });

        $(".toBeSum12,.toBeSum11").keyup(function (){

            $(this).val($(this).val().replace(/[^0-9\.]/g,''));

        });
        $(".toBeSum12,.toBeSum11").blur(function (){

            if($(this).val()!=""){
                if(isNaN($(this).val())){
                    $(this).val("");
                }else{
                    $(this).val(Math.round(parseFloat($(this).val())*100)/100);
                }
            }

        });

        $(".toBeSum12,.toBeSum11").blur(function (){

            if($(this).val()!=""){
                if(isNaN($(this).val())){
                    $(this).val("");
                }else{
                    $(this).val(Math.round(parseFloat($(this).val())*100)/100);
                }
            }

        });

        $(".toBeSum3").keyup(function (){

            $(this).val($(this).val().replace(/[^0-9\.]/g,''));

        });
        $(".toBeSum3").blur(function (){

            if($(this).val()!=""){
                if(isNaN($(this).val())){
                    $(this).val("");
                }else{
                    $(this).val(Math.round(parseFloat($(this).val())*100)/100);
                }
            }

        });

        $(".toBeSum3").blur(function (){

            if($(this).val()!=""){
                if(isNaN($(this).val())){
                    $(this).val("");
                }else{
                    $(this).val(Math.round(parseFloat($(this).val())*100)/100);
                }
            }

        });

        $(".toBeSum5").keyup(function (){

            $(this).val($(this).val().replace(/[^0-9\.]/g,''));

        });
        $(".toBeSum5").blur(function (){

            if($(this).val()!=""){
                if(isNaN($(this).val())){
                    $(this).val("");
                }else{
                    $(this).val(Math.round(parseFloat($(this).val())*100)/100);
                }
            }

        });

        $(".toBeSum5").blur(function (){

            if($(this).val()!=""){
                if(isNaN($(this).val())){
                    $(this).val("");
                }else{
                    $(this).val(Math.round(parseFloat($(this).val())*100)/100);
                }
            }

        });


        //    $(".toBeSum_nt1,.toBeSum_nt2,.toBeSum_1,.toBeSum_2,.toBeSum_3,.toBeSum_4,.toBeSum_s,.toBeSum_t,.toBeSum_crnl1,.toBeSum_crnl2,.toBeSum_ncrntass1,.toBeSum_ncrntass2,.toBeSum_crntass1,.toBeSum_crntass2").keyup(function (){
        //
        //        $(this).val($(this).val().replace(/[^0-9\.]/g,''));
        //
        //    });
        //    $(".toBeSum_nt1,.toBeSum_nt2,.toBeSum_1,.toBeSum_2,.toBeSum_3,.toBeSum_4,.toBeSum_s,.toBeSum_t,.toBeSum_crnl1,.toBeSum_crnl2,.toBeSum_ncrntass1,.toBeSum_ncrntass2,.toBeSum_crntass1,.toBeSum_crntass2").blur(function (){
        //    alert("dtgdfg");
        //        if($(this).val()!=""){
        //            alert("hi" + $(this).val());
        //            if((isNaN($(this).val()))){
        //                $(this).val("");
        //            }
        //            else if(($(this).val()< 0)){
        //                alert("Amount Should be Greater than Zero");
        //                $(this).val("");
        //            }
        //            else{
        //                //alert("ok");
        //                $(this).val(Math.round(parseFloat($(this).val())*100)/100);
        //            }
        //        }
        //
        //    });



        $(".onlyYear").keyup(function (){


            $(this).val($(this).val().replace(/[^0-9]/g,''));

        });
        $(".onlyYear").blur(function (){


            if($(this).val().length >0 && $(this).val().length !=4){
                alert("Please Enter Valid Year");
                $(this).val("");
            }

            else if($(this).val().length ==4 && ($(this).val()<1800)){
                alert("Please Enter Valid Year");
                $(this).val("");
            }

            else if($(this).val().length ==4 && ($(this).val()>2050)){
                alert("Please Enter Valid Year");
                $(this).val("");
            }


        });

        $(".toBeSum_nt1,.toBeSum_nt2,.toBeSum_1,.toBeSum_2,.toBeSum_3,.toBeSum_4,.toBeSum_s,.toBeSum_t,.toBeSum_crnl1,.toBeSum_crnl2,.toBeSum_ncrntass1,.toBeSum_ncrntass2,.toBeSum_crntass1,.toBeSum_crntass2").keyup(function (){

            $(this).val($(this).val().replace(/[^0-9\.]/g,''));

        });
        $(".toBeSum_nt1,.toBeSum_nt2,.toBeSum_1,.toBeSum_2,.toBeSum_3,.toBeSum_4,.toBeSum_s,.toBeSum_t,.toBeSum_crnl1,.toBeSum_crnl2,.toBeSum_ncrntass1,.toBeSum_ncrntass2,.toBeSum_crntass1,.toBeSum_crntass2").blur(function (){
            // alert("addremove");
            if($(this).val()!=""){
                if((isNaN($(this).val()))){
                    $(this).val("");
                }
                else if(($(this).val()< 0)){
                    alert("Amount Should be Greater than Zero 0000");
                    $(this).val("");
                }
                else{
                    //alert("ok");
                    $(this).val(Math.round(parseFloat($(this).val())*100)/100);
                }
            }
        });


        $(".checkPercentage").keyup(function (){

            $(this).val($(this).val().replace(/[^0-9\.]/g,''));

        });

        $(".checkPercentage").blur(function (){
            if($(this).val()!=""){
                if(isNaN($(this).val())){
                    $(this).val("");
                }else{
                    if($(this).val()> 0 && $(this).val()<=100){
                        $(this).val(Math.round(parseFloat($(this).val())*100)/100);
                    }else{
                        $(this).val("");
                    }
                }
            }

        });

        $(".toBeUnit").keyup(function (){

            $(this).val($(this).val().replace(/[^0-9]/g,''));

        });


        $(".toBePlot,.toBearea,.toBesaleReal").keyup(function (){

            $(this).val($(this).val().replace(/[^0-9\.]/g,''));

        });
        $(".toBePlot,.toBearea,.toBesaleReal").blur(function (){

            if($(this).val()!=""){
                if(isNaN($(this).val())){
                    $(this).val("");
                }else{
                    $(this).val(Math.round(parseFloat($(this).val())*100)/100);
                }
            }

        });

        $(".toBePlot,.toBearea,.toBesaleReal").blur(function (){

            if($(this).val()!=""){
                if(isNaN($(this).val())){
                    $(this).val("");
                }else{
                    $(this).val(Math.round(parseFloat($(this).val())*100)/100);
                }
            }

        });



        $(".dateClass").datepicker({
            showOn: 'button',
            buttonImage: '/html/icons/calendar.gif',
            buttonImageOnly: true,
            changeMonth: true,
            changeYear: true,
            dateFormat: "dd-mm-yy"
        });
        $(".dateClass").attr({
            'readOnly': true,
            'size': 8
        });
        $(".lod").datepicker({
            showOn: 'both',
            buttonImage: 'images/calendar.gif',
            buttonImageOnly: true,
            changeMonth: true,
            changeYear: true,
            minDate: new Date(),
            maxDate: "45",
            dateFormat: "dd-mm-yy"
        });
        $(".lod").attr({
            'readOnly': true,
            'size': 8
        });

        $(".prev30Date").datepicker({
            showOn: 'both',
            buttonImage: 'images/calendar.gif',
            buttonImageOnly: true,
            changeMonth: true,
            changeYear: true,
            minDate: '-30',
            maxDate: '0',
            dateFormat: "dd-mm-yy"
        });
        $(".prev30Date").attr({
            'readOnly': true,
            'size': 8
        });

        $(".dateClass5").datepicker({
            showOn: 'button',
            buttonImage: 'images/calendar.gif',
            buttonImageOnly: true,
            changeMonth: true,
            changeYear: true,
            dateFormat: "dd-mm-yy"
        });
        $(".dateClass5").attr({
            'readOnly': false,
            'size': 8
        });

        $(".dateClass_month_year").datepicker({
            changeMonth: true,
            changeYear: true,
            dateFormat: 'MM yy',
            showOn: 'button',
            buttonImage: 'images/calendar.gif',
            buttonImageOnly: true,

            onClose: function() {
                var iMonth = $("#ui-datepicker-div .ui-datepicker-month :selected").val();
                var iYear = $("#ui-datepicker-div .ui-datepicker-year :selected").val();
                $(this).datepicker('setDate', new Date(iYear, iMonth, 1));
            },

            beforeShow: function() {
                if ((selDate = $(this).val()).length > 0)
                {
                    iYear = selDate.substring(selDate.length - 4, selDate.length);
                    iMonth = jQuery.inArray(selDate.substring(0, selDate.length - 5),
                    $(this).datepicker('option', 'monthNames'));
                    $(this).datepicker('option', 'defaultDate', new Date(iYear, iMonth, 1));
                    $(this).datepicker('setDate', new Date(iYear, iMonth, 1));
                }
            }
        });



        $(".dateClass_month_year").attr({
            'readOnly': true,
            'size': 14
        });


        $(".onlyAlpha").keyup(function(){
            $(this).val($(this).val().replace(/[^A-Za-z\s]/g,''));
        });
        $(".alphaNumeric").keyup(function(){
            $(this).val($(this).val().replace(/[^A-Za-z0-9]/g,''));
        });
        $(".alphaNumericwithslash").keyup(function(){
            $(this).val($(this).val().replace(/[^A-Za-z0-9-/]/g,''));
        });

        //                $('input[type="text"]').keyup(function(){
        //                    this.value=this.value.toUpperCase();
        //                });
        //


    }




</script>
<script type="text/javascript">
    function addNewRow(table)
    {
        var flag = true;
        //  alert(table);
        var stts=get(table);
        // alert(stts);
        if(stts==false){
            alert("please enter the data before adding new rows!");
        }else{
            $("#"+table+" tr:nth(1) td:last input").removeAttr("disabled");
            var rowlength=$("#"+table+" tr").length;
            if(rowlength >2){
              
                flag=checkdetails(table);
                //alert(flag);
            }
            
           if(flag==true){
        	   var d=$("#"+table+" tr").length;
               
           	   var rw=parseInt(d)-2;
          // 	   var receipt=document.getElementById("contesttable["+rw+"].receipt1").value;
          // 	if(receipt!=""){
        	   var $tr=$("#"+table+" tr:last").clone();
            $("#contestlist").attr("value",rowlength+1);	

           
            // alert("rowlength"+rowlength);

            $tr.attr("id",(rowlength-1));

            $tr.find("td:first span").html(rowlength);


            $tr.find("input[type='text'],input[type='hidden'],textarea,select,input[type='file']").each(function(){


                var name=this.name;
               
                var newname=name.replace("["+(rowlength-2)+"]","["+(rowlength-1)+"]");
                this.name=newname;
                this.id=newname;
               


                if(this.type=='select-one'){
                    this.value="0";
                }else{
                    this.value="";
                }



            });
            $tr.find("input[type='button']").each(function(){
                //alert(this.id);
                var startindex=this.id.indexOf("[", 0),endindex=this.id.indexOf("]", 0);
                //   alert("start"+startindex);
                //   alert("endindex"+endindex)
                if(startindex != -1 && endindex!= -1)
                {
                    val="["+this.id.substring(startindex+1,endindex)+"]";
                   
                    var newid=this.id.replace(val,"["+(rowlength-1)+"]");
                    this.id=newid;
                }

            });
            $tr.find("input").removeClass('hasDatepicker');
            $tr.find("img.ui-datepicker-trigger").remove();
            $tr.find("button.ui-datepicker-trigger").remove();
            $("#"+table+" tr:last").after($tr);
            var d=$("#"+table+" tr").length;
            
       	   var rw=parseInt(d)-2;
       	 document.getElementById("contesttable["+rw+"].srno").value=rw+1;
       //    }else{
       // 	   alert("please Select Receipt 1");
        	   
        //   }
        }
        }    
        //
        // classValidations();
        //    classValidationProjEst();

    }


    function  get(tableId) {
        var t = document.getElementById(tableId);
        var status="true";
        for(var k=0;k<t.rows.length;k++){

            var r = t.rows[k];
            var inputs = r.getElementsByTagName("input");

            var mySelectArray = r.getElementsByTagName("select");
            var myTextArray = r.getElementsByTagName("textarea");
            for (var i=0; i<inputs.length; i++){

                if(inputs[i].type=='text'){
                    if(inputs[i].value==""){
                        var textIds = inputs[i].id;
                        status="false";
                        var textId= document.getElementById(textIds);
                        textId.style.border = '1px solid red';//1px solid red
                        textId.style.backgroundColor ='#FFFFCC';

                    }
                }
				if(inputs[i].type=='file'){
                    if(inputs[i].value==""){
                        var textIds = inputs[i].id;
                        status="false";
                        var textId= document.getElementById(textIds);
                        textId.style.border = '1px solid red';//1px solid red
                        textId.style.backgroundColor ='#FFFFCC';

                    }
                }
            }
            for (var i=0; i<mySelectArray.length; i++){
                if(mySelectArray[i].value=="0"){
                    var selectId = mySelectArray[i].id;
                    status="false";
                    var selectI= document.getElementById(selectId);
                    selectI.style.border = '1px solid red';//1px solid red
                    selectI.style.backgroundColor ='#FFFFCC';
                    //document.getElementById(selectId).className="textErrBg";
                }
            }
            for (var i=0; i<myTextArray.length; i++){
                if(myTextArray[i].value==""){
                    var textArea = myTextArray[i].id;
                    status="false";

                    var textAreaId= document.getElementById(textArea);
                    textAreaId.style.border = '1px solid red';//1px solid red
                    textAreaId.style.backgroundColor ='#FFFFCC';

                    //  document.getElementById(textArea).className="textErrBg";

                }

            }

        }
        if(status=="false"){
            return false;
        }else{
            return true;
        }


    }


    function removeRow(that,tableID,classArr,idsArr){

        // alert("Code Started For removeRow Suresh 9th June with sum"+classArr+" "+idsArr);

        //$("#"+tableID+" tr[id="+that.id+"]").remove();
        var startindex1=that.id.indexOf("[", 0),endindex1=that.id.indexOf("]", 0);
      //  alert(startindex1);
        if(startindex1 != -1 && endindex1!= -1)
        {
            row=parseInt(that.id.substring(startindex1+1,endindex1));
         //   alert(row);
            length=$("#"+tableID+" tr").length;
            if(length <= 2)
            {
                alert("One Row is Mandatory");
            }
            else
            {
                $("#"+tableID+" tr:nth("+(row+1)+")").remove();

                var rowlength=$("#"+tableID+" tr").length;
                //alert(rowlength);
                for(var i=1;i<rowlength;i++)
                {
                    var col=$("#"+tableID+" tr:nth("+i+") td").length;
                    $("#"+tableID+" tr:nth("+i+")").attr("id",(i-1));
                    for(var j=0;j<col;j++)
                    {
                        if(j==0)
                        {
                            $("#"+tableID+" tr:nth("+i+") td:nth("+j+") span").html(i);
                        }
                        $("#"+tableID+" tr:nth("+i+") td:nth("+j+")").find("input[type='text'],input[type='hidden'],textarea,select").each(function(){

                            var startindex=this.name.indexOf("[", 0),endindex=this.name.indexOf("]", 0);
                            if(startindex != -1 && endindex!= -1)
                            {
                                val=parseInt(this.name.substring(startindex+1,endindex));
                                var name=this.name;
                                var newname=name.replace("["+val+"]","["+(i-1)+"]");
                                this.name=newname;
                                this.id=newname;
                            }
                        });
                        $("#"+tableID+" tr:nth("+i+") td:nth("+j+")").find("input[type='button']").each(function(){
                            var startindex=this.id.indexOf("[", 0),endindex=this.id.indexOf("]", 0);
                            if(startindex != -1 && endindex!= -1)
                            {
                                val="["+this.id.substring(startindex+1,endindex)+"]";
                                var newid=this.id.replace(val,"["+(i-1)+"]");
                                this.id=newid;
                            }
                        });
                    }
                }
                var rowlength1=$("#"+tableID+" tr").length;
                for(var i=0;i<rowlength1-1;i++){
                	document.getElementById("contesttable["+i+"].srno").value=i+1;
                 
                }
            }
			 $("#contestlist").attr("value",rowlength1);
        }
        else
        {
            //  alert("Some Thing Went Wrong");
        }
        if(arguments.length==4)
        {
            reloadSum(classArr,idsArr);
        }

    }


    function checkdetails(that){
        var flag=true;
        var table=document.getElementById(that);
        var chequeRows=table.rows.length;
       // alert(chequeRows);
         for(var i=0;i<chequeRows-1;i++){
            for(var j=i+1;j<chequeRows-1;j++){
                var nm="contesttable["+i+"].srno";
                var nm1="contesttable["+j+"].srno";
                var county="contesttable["+i+"].upload";
                var county1="contesttable["+j+"].upload";
                
             
                var nmId=document.getElementById(nm).value;
                var nmId1=document.getElementById(nm1).value;
                var countyId=document.getElementById(county).value;
                var countyId1=document.getElementById(county1).value;
               
                if(countyId==countyId1){
                    alert("Already Selected Same Product Name");
                  //  document.getElementById("contesttable["+j+"].srno").value="";
                    document.getElementById("contesttable["+j+"].upload").value="";
                    flag= false;
                }

            }
        } 
        
        return flag;
    }

	</script>
	<portlet:actionURL var="uploadURL" name="getFeedBackUpload"></portlet:actionURL>
	<form id="myForm" action="${uploadURL}" method="post"
	enctype="multipart/form-data">
	<input type="text" id="contestlist" name="<portlet:namespace/>contestlist" value="0">
	<table width="50%" border="1" id="contesttable" class="contesttable"
		style="border: 1px solid #000; width: 50%;">
		<thead style="border: 1px solid #000;">
			<tr style="border: 1px solid #000;">
				<td nowrap="nowrap" style="border: 1px solid #000;">Sr No</td>
				<td style="border: 1px solid #000;">Upload</td>
				<td style="border: 1px solid #000;"><input type="button"
					value="Add" onclick="addNewRow('contesttable')" /></td>
			</tr>

		</thead>
		<tbody style="border: 1px solid #000;">
			<tr style="border: 1px solid #000;">
				<td style="border: 1px solid #000;"><input type="text"
					id="contesttable[0].srno" name="contesttable[0].srno"
					readonly="readonly" style="max-width: 34px;" size="25"
					class="validate[required]" maxlength="3"/></td>

				<td style="border: 1px solid #000;"><input type="file"
					id="contesttable[0].upload" 
					name="contesttable[0].upload" 
					onchange="return receipt2upload(this)" /></td>
				<td style="border: 1px solid #000;"><input type="button"
					name="del[1]" id="del1[1]" value="Delete"
					onclick="removeRow(this,'contesttable')" /></td>
			</tr>


		</tbody>

	</table>
	<input type="submit" value="Submit">
	</form>