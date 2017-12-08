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
            $("#productlist").attr("value",rowlength+1);	

           
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
			 $("#productlist").attr("value",rowlength1);
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
