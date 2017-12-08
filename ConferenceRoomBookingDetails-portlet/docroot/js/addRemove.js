/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
function addRow(tableID) {

    var table = document.getElementById(tableID);

    var rowCount = table.rows.length;
    var row = table.insertRow(rowCount);

    var srNoId= "srNoId"+rowCount;
    var serviceNameId = "serviceNameId"+rowCount;
    var serviceIdId = "serviceIdId"+rowCount;
    var applicapleId = "applicapleId"+rowCount;
    var amountId="amountId"+rowCount;
    var imgId ="img_rem"+rowCount;


    var newTable = document.getElementById("tableId_new");
    var roOfCell = newTable.rows.length;


    var oCells =newTable.rows[0].cells.length;
    var cells = newTable.rows[0].cells;

    for(i=0;i<oCells;i++){
        var cell1 = row.insertCell(i);

        if(cells[i].innerHTML.indexOf('img_rem')>0){
            cell1.innerHTML= cells[i].innerHTML.replace("img_rem",imgId);
        }else{
            cell1.innerHTML=cells[i].innerHTML;
        }


    }





}

function deleteRow(that) {
    try {
        var table = document.getElementById('tableId');
        var rowCount = table.rows.length;

        var imgId = that.id;
        var rowId = imgId.substring(7, imgId.length);

        table.deleteRow(rowId);
        rowCount--;
        var newImgId ="img_rem";
        for(var i=2; i<rowCount; i++){

           newImgId="img_rem"+i;
           var tCells =table.rows[0].cells.length;
           var cells = table.rows[0].cells;
           for(var k=0;k<tCells;k++){

              if(cells[k].innerHTML.indexOf('img_rem')>0){
              cells[k].innerHTML.replace("img_rem",newImgId);
              }
           }
    }}catch(e) {
        alert(e);
    }
}

function numberCells()
{
    var count=1;
    var oTable = document.getElementById('oTable');
    var RowsLength = oTable.rows.length;
    for (var i=0; i < RowsLength; i++)
    {
        var oCells = oTable.rows.item(i).cells;
        var CellsLength = oCells.length;
        for (var j=0; j < CellsLength; j++)
        {
            oCells.item(j).innerHTML = count++;
        }
    }
}*/
/*
function addTableRow(table)
{

    // clone the last row in the table
    //var $tr = $("#tableId2").find("tbody tr:last").clone();
    var $tr = $("#"+table+"").find("tbody tr:last").clone();

    // get the name attribute for the input and select fields
    $tr.find("input,select").attr("name", function()
    {
        // break the field name and it's number into two parts

        var parts = this.id.match(/(\D+)(\d+)$/);

        // create a unique name for the new field by incrementing
        // the number for the previous field by 1
        return parts[1];// + ++parts[2];
    // repeat for id attributes
    }).attr("id", function(){
        var parts = this.id.match(/(\D+)(\d+)$/);

        return parts[1] + ++parts[2];
    });
    // append the new row to the table
    //$("#tableId2").find("tbody tr:last").after($tr);
    $("#"+table+"").find("tbody tr:last").after($tr);
}

function deleteRow(that,tableID){
    try {

        var table = document.getElementById(tableID);
        var rowCount = table.rows.length;

        var imgId2 = that.id;
        var rowId = imgId2.substring(3, imgId2.length);
        if(rowCount>2){

            if(rowCount==rowId){
                table.deleteRow(rowId-1);
            }
            else
            {
                table.deleteRow(rowId);
            }

            rowCount--;

            var newImgId2 ="del";

            var row=0;
            //^[0-9]$///  /4/g /[^0-9]/g
            //var newstr= str.replace(/[0-9][0-9]/g,row);
            //var newStr=str.replace('/red/g',car );

            //alert(0);
            $("#"+tableID+" tr").each(function(){

                $(this).find('td').each(function(){

                    if(row!=0){

                        newImgId2=newImgId2+row;
                        var str=$(this).html();
                        var index=str.indexOf("id=");
                        index=index+4;
                        var index1=str.indexOf("\"",index);
                        var substr=str.substring(index,index1);
                        var newID=substr.replace(/\d/g,row)
                        var finalString=str.replace(substr,newID);
                        $(this).html(finalString);

                    }
                });
                row++;
            });
        }
        else{
            alert('First row');
        }
    }catch(e) {
        alert(e);
    }
}
 */
$(document).ready(function(){

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
        buttonImage: 'images/calendar.gif',
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

function addNewRow(table)
{

    var stts=get(table);

    if(stts==false){
        alert("please enter the data before adding new rows!");
    }else{

        $("#"+table+" tr:nth(1) td:last input").removeAttr("disabled");
        var $tr=$("#"+table+" tr:last").clone();


        var rowlength=$("#"+table+" tr").length;

        $tr.attr("id",(rowlength-1));

        $tr.find("td:first span").html(rowlength);


        $tr.find("input[type='text'],input[type='hidden'],textarea,select").each(function(){


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

            var startindex=this.id.indexOf("[", 0),endindex=this.id.indexOf("]", 0);
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

    }
    //
    classValidations();
//    classValidationProjEst();

}

function addConsumableNewRow(table)
{

    var stts=get(table);

    if(stts==false){
        alert("please enter the data before adding new rows!");
    }else{

        $("#"+table+" tr:nth(1) td:last input").removeAttr("disabled");
        var $tr=$("#"+table+" tr:last").clone();


        var rowlength=$("#"+table+" tr").length;
        //alert(rowlength);

        $tr.attr("id",(rowlength-1));

        $tr.find("td:first span").html(rowlength);


        $tr.find("input[type='text'],input[type='hidden'],textarea,select").each(function(){

            // alert(this.id);
            var name=this.id;
            var newname=name.replace("["+(rowlength-2)+"]","["+(rowlength-1)+"]");
            //this.name=newname;
            this.id=newname;


            if(this.type=='select-one'){
                this.value="0";
            }else{
                this.value="";
            }



        });
        $tr.find("input[type='button']").each(function(){

            var startindex=this.id.indexOf("[", 0),endindex=this.id.indexOf("]", 0);
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

    }
    //
    classValidations();
//    classValidationProjEst();

}
//function removeRow(that,tableID){
//    //alert("Code Started For removeRow Suresh 9th June");
//
//    //$("#"+tableID+" tr[id="+that.id+"]").remove();
//    var startindex1=that.id.indexOf("[", 0),endindex1=that.id.indexOf("]", 0);
//    if(startindex1 != -1 && endindex1!= -1)
//    {
//        row=parseInt(that.id.substring(startindex1+1,endindex1));
//        length=$("#"+tableID+" tr").length;
//        if(length <= 2)
//        {
//            alert("One Row is Mandatory");
//        }
//        else
//        {
//            $("#"+tableID+" tr:nth("+(row+1)+")").remove();
//
//            var rowlength=$("#"+tableID+" tr").length;
//            //alert(rowlength);
//            for(var i=1;i<rowlength;i++)
//            {
//                var col=$("#"+tableID+" tr:nth("+i+") td").length;
//                $("#"+tableID+" tr:nth("+i+")").attr("id",(i-1));
//                for(var j=0;j<col;j++)
//                {
//                    if(j==0)
//                    {
//                        $("#"+tableID+" tr:nth("+i+") td:nth("+j+") span").html(i);
//                    }
//                    $("#"+tableID+" tr:nth("+i+") td:nth("+j+")").find("input[type='text'],textarea,select").each(function(){
//
//                        var startindex=this.name.indexOf("[", 0),endindex=this.name.indexOf("]", 0);
//                        if(startindex != -1 && endindex!= -1)
//                        {
//                            val=parseInt(this.name.substring(startindex+1,endindex));
//                            var name=this.name;
//                            var newname=name.replace("["+val+"]","["+(i-1)+"]");
//                            this.name=newname;
//                            this.id=newname;
//                        }
//                    });
//                    $("#"+tableID+" tr:nth("+i+") td:nth("+j+")").find("input[type='button']").each(function(){
//                        var startindex=this.id.indexOf("[", 0),endindex=this.id.indexOf("]", 0);
//                        if(startindex != -1 && endindex!= -1)
//                        {
//                            val="["+this.id.substring(startindex+1,endindex)+"]";
//                            var newid=this.id.replace(val,"["+(i-1)+"]");
//                            this.id=newid;
//                        }
//                    });
//                }
//            }
//        }
//    }
//    else
//    {
//// alert("Some Thing Went Wrong");
//}
//
//
//
//}

function removeRow(that,tableID,classArr,idsArr){

    // alert("Code Started For removeRow Suresh 9th June with sum"+classArr+" "+idsArr);

    //$("#"+tableID+" tr[id="+that.id+"]").remove();
    var startindex1=that.id.indexOf("[", 0),endindex1=that.id.indexOf("]", 0);
    if(startindex1 != -1 && endindex1!= -1)
    {
        row=parseInt(that.id.substring(startindex1+1,endindex1));
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
        }
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
function removeConsumableRow(that,tableID,classArr,idsArr){

    // alert("Code Started For removeRow Suresh 9th June with sum"+classArr+" "+idsArr);

    //$("#"+tableID+" tr[id="+that.id+"]").remove();
    var startindex1=that.id.indexOf("[", 0),endindex1=that.id.indexOf("]", 0);
    if(startindex1 != -1 && endindex1!= -1)
    {
        row=parseInt(that.id.substring(startindex1+1,endindex1));
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
                            var name=this.id;
                            var newname=name.replace("["+val+"]","["+(i-1)+"]");
                            // this.name=newname;
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
        }
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
function addTableRow(table)
{

    // clone the last row in the table
    //var $tr = $("#tableId2").find("tbody tr:last").clone();
    var $tr = $("#"+table+"").find("tbody tr:last").clone();

    // get the name attribute for the input and select fields
    $tr.find("input,select").attr("name", function()
    {
        //        var sub=this.name.substring(this.id.indexOf('['));
        //        var getNum=parseInt(sub.match(/(\d+)/g))+1;
        //        var newString=sub.replace(/(\d+)/g,getNum);
        //        var newName=this.name.replace(sub,newString);

        var inedex1=this.name.indexOf('[');

        var str1=this.name.substring(inedex1, inedex1+3);

        var getNum=str1.substring(1,2);

        var increment=parseInt(getNum)+1;

        var str2=str1.replace(getNum,increment);

        var newName=this.name.replace(str1,str2);

        return newName;

    }).attr("id", function(){
        //        var sub=this.id.substring(this.id.indexOf('['));
        //        var getNum=parseInt(sub.match(/(\d+)/g))+1;
        //        var newString=sub.replace(/(\d+)/g,getNum);
        //        var newID=this.id.replace(sub,newString);

        var inedex1=this.id.indexOf('[');
        var str1=this.id.substring(inedex1, inedex1+3);
        var getNum=str1.substring(1,2);
        var increment=parseInt(getNum)+1;
        var str2=str1.replace(getNum,increment);

        var newID=this.id.replace(str1,str2);
        return newID;
    });
    // append the new row to the table
    //$("#tableId2").find("tbody tr:last").after($tr);
    $tr.find("input").removeClass('hasDatepicker');
    $tr.find("img.ui-datepicker-trigger").remove();
    $("#"+table+"").find("tbody tr:last").after($tr);
    classValidations();
}

function deleteRow(that,tableID){
    try {

        var table = document.getElementById(tableID);
        var rowCount = table.rows.length;

        var imgId2 = that.id;

        var rowId = imgId2.substring(imgId2.indexOf('[')+1,imgId2.indexOf('[')+2);

        if(rowCount>2){

            if(rowCount==rowId){
                table.deleteRow(rowId-1);
            }
            else
            {
                if(rowId==0){
                    table.deleteRow(rowId+1);
                }
                else
                {
                    table.deleteRow(rowId);
                }
            }
            var b=false;
            var row=0;
            $("#"+tableID+" tr").each(function(){
                if(b){
                    $(this).find('td').each(function(){
                        var str=$(this).html();
                        var index1=str.indexOf('[');
                        var str1=str.substring(index1, index1+3);

                        var str2=str1.replace(/\d/g,row);
                        // alert(str1 + '  '+str2+' '+row);

                        //alert('got id '+str);
                        //^[0-9]$///  /4/g /[^0-9]/g
                        var newstr= str.replace(str1,str2);
                        var newstr1=newstr.replace(str1,str2);
                        //alert(newstr);
                        //var newstr= str.replace(/[\d]/g,row);
                        $(this).html(newstr1);
                    //var newStr=str.replace('/red/g',car );
                    // //alert(0);
                    });

                    row++;
                }
                b=true;

            });

        }
        else{
            alert('First row');
        }
    }catch(e) {
        alert(e);
    }



}




//function removeRow(that,tableID){
//
//    try {
//        var table = document.getElementById(tableID);
//        var rowCount = $("#"+table.id+' tbody tr').length;
//        var imgId2 = that.id;
//        var rowId = imgId2.substring(imgId2.indexOf('[')+1,imgId2.indexOf('[')+2);
//        alert(rowCount);
//        if(rowCount>2){
//            //alert($(that).parents("tr:first").html());
//            $(that).parents("tr:first").remove();
//            var b=false;
//            var row=0;
//        //            $("#"+tableID+" tr").each(function(){
//        //                if(b){
//        //                    $(this).find('td').each(function(){
//        //                        var str=$(this).html();
//        //                        var index1=str.indexOf('[');
//        //                        var str1=str.substring(index1, index1+3);
//        //
//        //                        var str2=str1.replace(/\d/g,row);
//        //
//        //                        var newstr= str.replace(str1,str2);
//        //                        var newstr1=newstr.replace(str1,str2);
//        //
//        //                        $(this).html(newstr1);
//        //
//        //                    });
//        //
//        //                    row++;
//        //                }
//        //                b=true;
//        //
//        //            });
//
//        }
//        else{
//            alert('At least one Row required');
//        }
//
//
//    }catch(e) {
//        alert(e);
//    }
//
//
//
//}

function remove_AppendixRow(that,tableID){


    try {
        var table = document.getElementById(tableID);
        var rowCount = $("#"+table.id+' tbody tr').length;
        var imgId2 = that.id;
        var rowId = imgId2.substring(imgId2.indexOf('[')+1,imgId2.indexOf('[')+2);

        //alert("RowCount="+rowCount);
        if(rowCount>1){
            //alert($(that).parents("tr:first").html());
            $(that).parents("tr:first").remove();

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
                            //alert("Before=Name:-"+this.name+" Id:-"+this.id);
                            val=parseInt(this.name.substring(startindex+1,endindex));
                            var name=this.name;
                            var newname=name.replace("["+val+"]","["+(i-1)+"]");
                            this.name=newname;
                            this.id=newname;
                        //alert("After=Name:-"+this.name+" Id:-"+this.id);
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

            var b=false;
            var row=0;
        //            $("#"+tableID+" tr").each(function(){
        //                if(b){
        //                    $(this).find('td').each(function(){
        //                        var str=$(this).html();
        //                        var index1=str.indexOf('[');
        //                        var str1=str.substring(index1, index1+3);
        //
        //                        var str2=str1.replace(/\d/g,row);
        //
        //                        var newstr= str.replace(str1,str2);
        //                        var newstr1=newstr.replace(str1,str2);
        //
        //                        $(this).html(newstr1);
        //
        //                    });
        //
        //                    row++;
        //                }
        //                b=true;
        //
        //            });

        }
        else{
            alert('At least one Row required');
        }


    }catch(e) {
        alert(e);
    }



}


//function removeRow(that,tableID,classArr,idsArr){
//
//    try {
//        var table = document.getElementById(tableID);
//        var rowCount = $("#"+table.id+' tbody tr').length;
//        //alert("second"+rowCount);
//        var imgId2 = that.id;
//        var rowId = imgId2.substring(imgId2.indexOf('[')+1,imgId2.indexOf('[')+2);
//        if(rowCount>1){
//            //alert($(that).parents("tr:first").html());
//            $(that).parents("tr:first").remove();
//            var b=false;
//            var row=0;
//        //            $("#"+tableID+" tr").each(function(){
//        //                if(b){
//        //                    $(this).find('td').each(function(){
//        //                        var str=$(this).html();
//        //                        var index1=str.indexOf('[');
//        //                        var str1=str.substring(index1, index1+3);
//        //
//        //                        var str2=str1.replace(/\d/g,row);
//        //
//        //                        var newstr= str.replace(str1,str2);
//        //                        var newstr1=newstr.replace(str1,str2);
//        //
//        //                        $(this).html(newstr1);
//        //
//        //                    });
//        //
//        //                    row++;
//        //                }
//        //                b=true;
//        //
//        //            });
//
//        }
//        else{
//            alert('At least one Row required');
//        }
//
//        reloadSum(classArr,idsArr);
//    }
//    catch(e) {
//    //  alert(e);
//    }
//
//
//
//}



//function addNewRow(table)
//{
//
//    var tableId = document.getElementById(table);
//
//    var rowCount = tableId.rows.length;
//    //var row = table.insertRow(rowCount);
//
//    var stts=get(table);
//    if(stts==false){
//        alert("please enter the data before adding new rows!");
//    }else{
//
//        // clone the last row in the table
//        //var $tr = $("#tableId2").find("tbody tr:last").clone();
//        var $tr = $("#"+table+"").find("tbody tr:last").clone();
//
//        // get the name attribute for the input and select fields
//        $tr.find("input,select,textarea").attr("name", function()
//        {
//            //        var sub=this.name.substring(this.id.indexOf('['));
//            //        var getNum=parseInt(sub.match(/(\d+)/g))+1;
//            //        var newString=sub.replace(/(\d+)/g,getNum);
//            //        var newName=this.name.replace(sub,newString);
//            // alert(this.name);
//            var inedex1=this.name.indexOf('[');
//
//            var str1=this.name.substring(inedex1, inedex1+3);
//
//            var getNum=str1.substring(1,2);
//
//            var increment=parseInt(getNum)+1;
//
//            var str2=str1.replace(getNum,increment);
//
//            var newName=this.name.replace(str1,str2);
//
//            return newName;
//
//        }).attr("id", function(){
//            //        var sub=this.id.substring(this.id.indexOf('['));
//            //        var getNum=parseInt(sub.match(/(\d+)/g))+1;
//            //        var newString=sub.replace(/(\d+)/g,getNum);
//            //        var newID=this.id.replace(sub,newString);
//
//            var inedex1=this.id.indexOf('[');
//            var str1=this.id.substring(inedex1, inedex1+3);
//            var getNum=str1.substring(1,2);
//            var increment=parseInt(getNum)+1;
//            var str2=str1.replace(getNum,increment);
//
//            var newID=this.id.replace(str1,str2);
//            ///alert(newID)
//
//            return newID;
//        }).attr("value",function(){
//            var val = this.value;
//
//
//
//
//            if(this.type=="hidden"){
//                val = "";
//            }
//            if(this.type != "button") {
//
//                val = "";
//            }
//
//            return val;
//        });
//
//        $tr.find("input").removeClass('hasDatepicker');
//        $tr.find("img.ui-datepicker-trigger").remove();
//        $tr.find("button.ui-datepicker-trigger").remove();
//
//        // append the new row to the table
//        //$("#tableId2").find("tbody tr:last").after($tr);
//        $("#"+table+"").find("tbody tr:last").after($tr);
//    }
//    classValidations();
//    classValidationProjEst();
//}




function addNewSLMRow(table)
{
    // alert("hello");
    var tableId = document.getElementById(table);

    var rowCount = tableId.rows.length;
    //var row = table.insertRow(rowCount);

    var stts=get(table);
    if(stts==false){
        alert("please enter the data before adding new rows!");
    }else{

        // clone the last row in the table
        //var $tr = $("#tableId2").find("tbody tr:last").clone();
        var $tr = $("#"+table+"").find("tbody tr:last").clone();

        // get the name attribute for the input and select fields
        $tr.find("input,select,textarea").attr("name", function()
        {
            //        var sub=this.name.substring(this.id.indexOf('['));
            //        var getNum=parseInt(sub.match(/(\d+)/g))+1;
            //        var newString=sub.replace(/(\d+)/g,getNum);
            //        var newName=this.name.replace(sub,newString);

            var inedex1=this.name.indexOf('[');

            var str1=this.name.substring(inedex1, inedex1+3);

            var getNum=str1.substring(1,2);

            var increment=parseInt(getNum)+1;

            var str2=str1.replace(getNum,increment);

            var newName=this.name.replace(str1,str2);

            return newName;

        }).attr("id", function(){
            //        var sub=this.id.substring(this.id.indexOf('['));
            //        var getNum=parseInt(sub.match(/(\d+)/g))+1;
            //        var newString=sub.replace(/(\d+)/g,getNum);
            //        var newID=this.id.replace(sub,newString);

            var inedex1=this.id.indexOf('[');
            var str1=this.id.substring(inedex1, inedex1+3);
            var getNum=str1.substring(1,2);
            var increment=parseInt(getNum)+1;
            var str2=str1.replace(getNum,increment);

            var newID=this.id.replace(str1,str2);

            return newID;
        }).attr("value",function(){
            var val = this.value;

            if(this.type=="hidden"){
                val = "";
            }
            if(this.type != "button") {

                val = "";
            }

            return val;
        });

        $tr.find("input").removeClass('hasDatepicker');
        $tr.find("img.ui-datepicker-trigger").remove();
        $tr.find("button.ui-datepicker-trigger").remove();

        // append the new row to the table
        //$("#tableId2").find("tbody tr:last").after($tr);
        $("#"+table+"").find("tbody tr:last").after($tr);
    }
    classValidations();
    classValidationProjEst();
}

function addSubsequentRow(table)
{
    var tableId = document.getElementById(table);

    var rowCount = tableId.rows.length;
    //var row = table.insertRow(rowCount);

    //var stts=get(table);

    var stts=true;
    if(stts==false){
        alert("please enter the data before adding new rows!");
    }else{

        // clone the last row in the table
        //var $tr = $("#tableId2").find("tbody tr:last").clone();
        var $tr = $("#"+table+"").find("tbody tr:last").clone();

        // get the name attribute for the input and select fields
        $tr.find("input,select").attr("name", function()
        {
            //        var sub=this.name.substring(this.id.indexOf('['));
            //        var getNum=parseInt(sub.match(/(\d+)/g))+1;
            //        var newString=sub.replace(/(\d+)/g,getNum);
            //        var newName=this.name.replace(sub,newString);

            var inedex1=this.name.indexOf('[');
            var inedex2=this.name.indexOf(']');
            //   alert(this.name+" "+inedex1+" "+inedex2);
            //  var str1=this.name.substring(inedex1, inedex1+3);
            var str1=this.name.substring(inedex1, inedex2+1);
            //   alert(str1);
            //   var getNum=str1.substring(1,2);
            var getNum=str1.substring(1,str1.length - 1);
            //      alert(getNum);
            var increment=parseInt(getNum)+1;
            var str2= "["+increment+"]"
            //      alert(str2);
            //   var str2=str1.replace(getNum,increment);

            var newName=this.name.replace(str1,str2);

            return newName;

        }).attr("id", function(){
            //        var sub=this.id.substring(this.id.indexOf('['));
            //        var getNum=parseInt(sub.match(/(\d+)/g))+1;
            //        var newString=sub.replace(/(\d+)/g,getNum);
            //        var newID=this.id.replace(sub,newString);

            var inedex1=this.id.indexOf('_');
            var str1=this.id.substring(inedex1, this.id.length);

            var getNum=str1.substring(1,3);

            var increment=parseInt(getNum)+1;

            var str2=str1.replace(getNum,increment);

            var newID=this.id.replace(str1,str2);

            return newID;
        }).attr("value",function(){
            var val = this.value;
            if(this.type != "button") {
                val = "";
            }
            return val;
        });

        $tr.find('textarea').attr("name", function()
        {

            var inedex1=this.name.indexOf('[');

            var str1=this.name.substring(inedex1, inedex1+3);

            var getNum=str1.substring(1,2);

            var increment=parseInt(getNum)+1;

            var str2=str1.replace(getNum,increment);

            var newName=this.name.replace(str1,str2);

            return newName;

        }).attr("id", function(){
            //        var sub=this.id.substring(this.id.indexOf('['));
            //        var getNum=parseInt(sub.match(/(\d+)/g))+1;
            //        var newString=sub.replace(/(\d+)/g,getNum);
            //        var newID=this.id.replace(sub,newString);

            var inedex1=this.id.indexOf('_');
            var str1=this.id.substring(inedex1, this.id.length);

            var getNum=str1.substring(1,3);

            var increment=parseInt(getNum)+1;

            var str2=str1.replace(getNum,increment);

            var newID=this.id.replace(str1,str2);

            return newID;
        }).attr("value",function(){
            var val = this.value;
            if(this.type != "button") {
                val = "";
            }
            return val;
        });



        $tr.find("input").removeClass('hasDatepicker');
        $tr.find("img.ui-datepicker-trigger").remove();

        // append the new row to the table
        //$("#tableId2").find("tbody tr:last").after($tr);
        $("#"+table+"").find("tbody tr:last").after($tr);
    }
    classValidations();
}


function addNewRows(table)
{

    var tableId = document.getElementById(table);

    var rowCount = tableId.rows.length;
    //var row = table.insertRow(rowCount);

    var stts=get(table);
    if(stts==false){
        alert("please enter the data before adding new rows!");
    }else{

        // clone the last row in the table
        //var $tr = $("#tableId2").find("tbody tr:last").clone();
        var $tr = $("#"+table+"").find("tbody tr:last").clone();

        // get the name attribute for the input and select fields
        $tr.find("input,select,hidden").attr("name", function()
        {
            //        var sub=this.name.substring(this.id.indexOf('['));
            //        var getNum=parseInt(sub.match(/(\d+)/g))+1;
            //        var newString=sub.replace(/(\d+)/g,getNum);
            //        var newName=this.name.replace(sub,newString);

            var inedex1=this.name.indexOf('[');

            var str1=this.name.substring(inedex1, inedex1+3);

            var getNum=str1.substring(1,2);

            var increment=parseInt(getNum)+1;

            var str2=str1.replace(getNum,increment);

            var newName=this.name.replace(str1,str2);

            return newName;

        }).attr("id", function(){
            //        var sub=this.id.substring(this.id.indexOf('['));
            //        var getNum=parseInt(sub.match(/(\d+)/g))+1;
            //        var newString=sub.replace(/(\d+)/g,getNum);
            //        var newID=this.id.replace(sub,newString);

            var inedex1=this.id.indexOf('[');
            var str1=this.id.substring(inedex1, inedex1+3);
            var getNum=str1.substring(1,2);
            var increment=parseInt(getNum)+1;
            var str2=str1.replace(getNum,increment);

            var newID=this.id.replace(str1,str2);

            return newID;
        }).attr("value",function(){
            var val = this.value;
            if(this.type != "button") {
                val = "";
            }
            return val;
        });
        // append the new row to the table
        //$("#tableId2").find("tbody tr:last").after($tr);
        $("#"+table+"").find("tbody tr:last").after($tr);
    }
}


function numberCell(tableid)
{

    alert("dhjdghjdghj");
    var count=1;
    var oTable = document.getElementById(tableid);
    var RowsLength = oTable.rows.length;
    var innerValue ="";
    for (var i=0; i < RowsLength; i++)
    {
        var oCells = oTable.rows.item(i).cells;

        var CellsLength = oCells.length;
        for (var j=0; j < CellsLength; j++)
        {

            var otherInputs = $(oCells[0]).parents('td').siblings().find('input');

            for(var i = 0; i < otherInputs.length; i++) {
                alert($(otherInputs[i]).val());
            }
            return false;

        }
    }
}

//Validation on Add Remove rows

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

function  getSp(tableId) {
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

                    if(document.getElementById(textIds).className=="notMandatory"){
                    //alert(inputs[i].id+"not mnd");
                    }else{
                        status="false";

                        var textId= document.getElementById(textIds);
                        textId.style.border = '1px solid red';//1px solid red
                        textId.style.backgroundColor ='#FFFFCC';


                    //document.getElementById(textIds).className="textErrBg";
                    }
                }

            }
        }
        for (var i=0; i<mySelectArray.length; i++){
            if(mySelectArray[i].value=="0"){
                var selectId = mySelectArray[i].id;
                status="false";

                var selectedId= document.getElementById(selectId);
                selectedId.style.border = '1px solid red';//1px solid red
                selectedId.style.backgroundColor ='#FFFFCC';



            // document.getElementById(selectId).className="textErrBg";
            }
        }
        for (var i=0; i<myTextArray.length; i++){
            if(myTextArray[i].value==""){
                var textArea = myTextArray[i].id;
                status="false";

                var textAreaId= document.getElementById(textArea);
                textAreaId.style.border = '1px solid red';//1px solid red
                textAreaId.style.backgroundColor ='#FFFFCC';


            //document.getElementById(textArea).className="textErrBg";

            }

        }

    }
    if(status=="false"){
        return false;
    }else{
        return true;
    }

}



function  getSpRM(tableId) {
    var t = document.getElementById(tableId);
    var status="true";
    var feildStatus= "true";
    for(var k=0;k<t.rows.length;k++){

        var r = t.rows[k];
        var inputs = r.getElementsByTagName("input");

        var mySelectArray = r.getElementsByTagName("select");
        var myTextArray = r.getElementsByTagName("textarea");


        for (var i=0; i<inputs.length; i++){

            if(inputs[i].type=='text'){
                if(inputs[i].value==""){
                    var textIds = inputs[i].id;

                    if(document.getElementById(textIds).className=="notMandatory"){
                    //alert(inputs[i].id+"not mnd");
                    }else{
                        status="false";

                        var textId= document.getElementById(textIds);
                        textId.style.border = '1px solid red';//1px solid red
                        textId.style.backgroundColor ='#FFFFCC';


                    //document.getElementById(textIds).className="textErrBg";
                    }
                }else{
                    feildStatus="false";
                }

            }
        }
        for (var i=0; i<mySelectArray.length; i++){
            if(mySelectArray[i].value=="0"){
                var selectId = mySelectArray[i].id;
                status="false";

                var selectedId= document.getElementById(selectId);
                selectedId.style.border = '1px solid red';//1px solid red
                selectedId.style.backgroundColor ='#FFFFCC';



            // document.getElementById(selectId).className="textErrBg";
            }else{
                feildStatus="false";
            }
        }
        for (var i=0; i<myTextArray.length; i++){
            if(myTextArray[i].value==""){
                var textArea = myTextArray[i].id;
                status="false";

                var textAreaId= document.getElementById(textArea);
                textAreaId.style.border = '1px solid red';//1px solid red
                textAreaId.style.backgroundColor ='#FFFFCC';


            //document.getElementById(textArea).className="textErrBg";

            }else{
                feildStatus="false";
            }

        }

    }
    if(feildStatus=="false"){
        if(status=="false"){
            return false;
        }else{
            return true;
        }
    }else{
        for (var i=0; i<inputs.length; i++){

            if(inputs[i].type=='text'){
                if(inputs[i].value==""){
                    var textIds = inputs[i].id;

                    if(document.getElementById(textIds).className=="notMandatory"){
                    //alert(inputs[i].id+"not mnd");
                    }else{
                        status="false";

                        var textId= document.getElementById(textIds);
                        textId.style.border = '';//1px solid red
                        textId.style.backgroundColor ='';


                    //document.getElementById(textIds).className="textErrBg";
                    }
                }else{
                    feildStatus="false";
                }

            }
        }
        for (var i=0; i<mySelectArray.length; i++){
            if(mySelectArray[i].value=="0"){
                var selectId = mySelectArray[i].id;
                status="false";

                var selectedId= document.getElementById(selectId);
                selectedId.style.border = '';//1px solid red
                selectedId.style.backgroundColor ='';

            // document.getElementById(selectId).className="textErrBg";
            }else{
                feildStatus="false";
            }
        }

        return true;
    }

}





function precise_round(num){
    return Math.round(num*Math.pow(10,2))/Math.pow(10,2);
}
var reloadSum = function(classArr,idsArr) {

    for(var count=0;count<classArr.length;count++){
        var classVal = classArr[count];
        classVal = "."+classVal;
        var idVal = idsArr[count];
        var sums = $(classVal); // this will need to be the class of the things you want to sum
        var sum = 0;
        if(sums.length>0){
            for (var i = 0; i < sums.length; i++) {
                var tValue=0;
                if(sums[i].value)
                    if(sums[i].value==""){
                        tValue=0;
                    }else{
                        tValue= sums[i].value;
                    }
                sum += parseFloat(precise_round(tValue));
            // or maybe parseFloat(sums[i].innerHTML)
            }
            document.getElementById(idVal).value=precise_round(sum);

        }
    }
}


//Value parameter - required. All other parameters are optional.
function isDate(value, sepVal, dayIdx, monthIdx, yearIdx) {
    alert(0);
    try {
        value = value.replace(/-/g, "/").replace(/\./g, "/");
        var SplitValue = value.split(sepVal || "/");
        if (SplitValue.length != 3) {
            alert("Invalid length");
            return false;
        }

        //Auto  detection of indexes
        if (dayIdx === undefined || monthIdx === undefined || yearIdx === undefined) {
            if (SplitValue[0] > 31) {
                yearIdx = 0;
                monthIdx = 1;
                dayIdx = 2;
            } else {
                yearIdx = 2;
                monthIdx = 1;
                dayIdx = 0;
            }
        }

        //Change the below values to determine which format of date you wish to check. It is set to dd/mm/yyyy by default.
        var DayIndex = dayIdx !== undefined ? dayIdx : 0;
        var MonthIndex = monthIdx !== undefined ? monthIdx : 1;
        var YearIndex = yearIdx !== undefined ? yearIdx : 2;

        var OK = true;
        if (!(SplitValue[DayIndex].length == 1 || SplitValue[DayIndex].length == 2)) {
            OK = false;
        }
        if (OK && !(SplitValue[MonthIndex].length == 1 || SplitValue[MonthIndex].length == 2)) {
            OK = false;
        }
        if (OK && SplitValue[YearIndex].length != 4) {
            OK = false;
        }
        if (OK) {
            var Day = parseInt(SplitValue[DayIndex], 10);
            var Month = parseInt(SplitValue[MonthIndex], 10);
            var Year = parseInt(SplitValue[YearIndex], 10);
            var MonthDays = [31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31];

            if (OK = (Month <= 12 && Month > 0)) {

                var LeapYear = (((Year % 4) == 0) && ((Year % 100) != 0) || ((Year % 400) == 0));
                MonthDays[1] = (LeapYear ? 29 : 28);

                OK = Day > 0 && Day <= MonthDays[Month - 1];
            }
        }
        if(Ok){
            alert("date is valid");
        }else{
            alert("invalid date");
        }
        return OK;
    }
    catch (e) {
        return false;
    }
}



var dminyear = 1900;
var dmaxyear = 2500;
var chsep= "-"
function checkinteger(str1){
    var x;
    for (x = 0; x < str1.length; x++){
        // verify current character is number or not !
        var cr = str1.charAt(x);
        if (((cr < "0") || (cr > "9")))
            return false;
    }
    return true;
}
function getcharacters(s, chsep1){
    var x;
    var Stringreturn = "";
    for (x = 0; x < s.length; x++){
        var cr = s.charAt(x);
        if (chsep.indexOf(cr) == -1)
            Stringreturn += cr;
    }
    return Stringreturn;
}
function februarycheck(cyear)
{
    return (((cyear % 4 == 0) && ( (!(cyear % 100 == 0)) || (cyear % 400 == 0))) ? 29 : 28 );
}
function finaldays(nr) {
    for (var x = 1; x <= nr; x++) {
        this[x] = 31
        if (x==4 || x==6 || x==9 || x==11)
        {
            this[x] = 30
        }
        if (x==2)
        {
            this[x] = 29
        }
    }
    return this
}
function dtvalid(strdate)
{
    var monthdays = finaldays(12)
    var cpos1=strdate.indexOf(chsep)

    var cpos2=strdate.indexOf(chsep,cpos1+1)

    var yearstr=strdate.substring(0,cpos1)
    var monthstr=strdate.substring(cpos1+1,cpos2)
    var daystr=strdate.substring(cpos2+1)
    strYr=yearstr
    if (strdate.charAt(0)=="0" && strdate.length>1) strdate=strdate.substring(1)
    if (monthstr.charAt(0)=="0" && monthstr.length>1) monthstr=monthstr.substring(1)
    for (var i = 1; i <= 3; i++) {
        if (strYr.charAt(0)=="0" && strYr.length>1) strYr=strYr.substring(1)
    }
    // The parseInt is used to get a numeric value from a string
    pmonth=parseInt(monthstr)
    pday=parseInt(daystr)
    pyear=parseInt(strYr)
    if (cpos1==-1 || cpos2==-1){
        alert("The date format must be : YYYY-MM-DD")
        return false
    }
    if (monthstr.length<1 || pmonth<1 || pmonth>12){
        alert("Input a valid month")
        return false
    }
    if (daystr.length<1 || pday<1 || pday>31 || (pmonth==2 && pday>februarycheck(pyear))|| pday > monthdays[pmonth])
    {
        alert("Input a valid date")
        return false
    }
    if (yearstr.length != 4 || pyear==0 || pyear<dminyear || pyear>dmaxyear)
    {
        alert("Input a valid 4 digit year between "+dminyear+" and "+dmaxyear)
        return false
    }
    if (strdate.indexOf(chsep,cpos2+1)!=-1 || checkinteger(getcharacters(strdate, chsep))==false)
    {
        alert("Input a valid date")
        return false
    }
    return true
}
function validdate(inputtxt)
{

    var dateIds =inputtxt.id;
    var crdt=inputtxt.value

    if (dtvalid(crdt)==false)
    {
        //document.raw.inputtxt.focus()
        document.getElementById(dateIds).value="";
        document.getElementById(dateIds).className="textErrBg";
        return false
    }
    return true
}


function addRawNewRow(table)
{

    var tableId = document.getElementById(table);
    var rowCount = tableId.rows.length;
    //var row = table.insertRow(rowCount);
    var stts=getSp(table);
    if(stts==false){
        alert("please enter the data before adding new rows!");
    }else{
        // clone the last row in the table
        //var $tr = $("#tableId2").find("tbody tr:last").clone();
        var $tr = $("#"+table+"").find("tbody tr:last").clone();

        // get the name attribute for the input and select fields
        $tr.find("input,select,hidden").attr("name", function()
        {
            //        var sub=this.name.substring(this.id.indexOf('['));
            //        var getNum=parseInt(sub.match(/(\d+)/g))+1;
            //        var newString=sub.replace(/(\d+)/g,getNum);
            //        var newName=this.name.replace(sub,newString);

            var inedex1=this.name.indexOf('[');

            var str1=this.name.substring(inedex1, inedex1+3);

            var getNum=str1.substring(1,2);

            var increment=parseInt(getNum)+1;

            var str2=str1.replace(getNum,increment);

            var newName=this.name.replace(str1,str2);

            return newName;

        }).attr("id", function(){
            //        var sub=this.id.substring(this.id.indexOf('['));
            //        var getNum=parseInt(sub.match(/(\d+)/g))+1;
            //        var newString=sub.replace(/(\d+)/g,getNum);
            //        var newID=this.id.replace(sub,newString);

            var inedex1=this.id.indexOf('[');
            var str1=this.id.substring(inedex1, inedex1+3);
            var getNum=str1.substring(1,2);
            var increment=parseInt(getNum)+1;
            var str2=str1.replace(getNum,increment);

            var newID=this.id.replace(str1,str2);

            return newID;
        }).attr("value",function(){
            var val = this.value;
            if(this.type != "button") {
                val = "";
            }
            return val;
        });

        $tr.find("input").removeClass('hasDatepicker');
        $tr.find("img.ui-datepicker-trigger").remove();
        $tr.find("button.ui-datepicker-trigger").remove();

        // append the new row to the table
        //$("#tableId2").find("tbody tr:last").after($tr);
        $("#"+table+"").find("tbody tr:last").after($tr);

        classValidations();
    }
}


function removeRawMaterialRow(that,tableID,classArr,idsArr){

    try {
        //        var table = document.getElementById(tableID);
        //        var rowCount = $("#"+table.id+' tbody tr').length;
        //        //alert("second"+rowCount);
        //        var imgId2 = that.id;
        //        var rowId = imgId2.substring(imgId2.indexOf('[')+1,imgId2.indexOf('[')+2);
        //        if(rowCount>1){
        //            //alert($(that).parents("tr:first").html());
        //            $(that).parents("tr:first").remove();
        //            var b=false;
        //            var row=0;
        //        //            $("#"+tableID+" tr").each(function(){
        //        //                if(b){
        //        //                    $(this).find('td').each(function(){
        //        //                        var str=$(this).html();
        //        //                        var index1=str.indexOf('[');
        //        //                        var str1=str.substring(index1, index1+3);
        //        //
        //        //                        var str2=str1.replace(/\d/g,row);
        //        //
        //        //                        var newstr= str.replace(str1,str2);
        //        //                        var newstr1=newstr.replace(str1,str2);
        //        //
        //        //                        $(this).html(newstr1);
        //        //
        //        //                    });
        //        //
        //        //                    row++;
        //        //                }
        //        //                b=true;
        //        //
        //        //            });
        //
        //        }
        //        else{
        //            alert('At least one Row required');
        //        }

        //alert("Code Started For removeRow Suresh 9th June with sum"+classArr+" "+idsArr);

        //$("#"+tableID+" tr[id="+that.id+"]").remove();
        var startindex1=that.id.indexOf("[", 0),endindex1=that.id.indexOf("]", 0);
        if(startindex1 != -1 && endindex1!= -1)
        {
            row=parseInt(that.id.substring(startindex1+1,endindex1));
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
            }
        }
        else
        {
        //  alert("Some Thing Went Wrong");
        }
        reloadSum(classArr,idsArr);
        total();
    }catch(e) {
    //  alert(e);
    }



}

function removeExtngMchnryRow(that,tableID,classArr,idsArr){

    try {
        //alert("Code Started For removeRow Suresh 9th June with sum"+classArr+" "+idsArr);

        //$("#"+tableID+" tr[id="+that.id+"]").remove();
        var startindex1=that.id.indexOf("[", 0),endindex1=that.id.indexOf("]", 0);
        if(startindex1 != -1 && endindex1!= -1)
        {
            row=parseInt(that.id.substring(startindex1+1,endindex1));
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
                        $("#"+tableID+" tr:nth("+i+") td:nth("+j+")").find("input[type='text'],textarea,select").each(function(){

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
            }
        }
        else
        {
        //  alert("Some Thing Went Wrong");
        }
        reloadSum(classArr,idsArr);
        extngtotal();

    }catch(e) {
    //  alert(e);
    }
}

function removeProposedMchnryRow(that,tableID,classArr,idsArr){

    try {
        //alert("Code Started For removeRow Suresh 9th June with sum"+classArr+" "+idsArr);

        //$("#"+tableID+" tr[id="+that.id+"]").remove();
        var startindex1=that.id.indexOf("[", 0),endindex1=that.id.indexOf("]", 0);
        if(startindex1 != -1 && endindex1!= -1)
        {
            row=parseInt(that.id.substring(startindex1+1,endindex1));
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
                        $("#"+tableID+" tr:nth("+i+") td:nth("+j+")").find("input[type='text'],textarea,select").each(function(){

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
            }
        }
        else
        {
        //  alert("Some Thing Went Wrong");
        }
        reloadSum(classArr,idsArr);

        proposedtotal();

    }catch(e) {
    //  alert(e);
    }
}

function removeCREProposedMchnryRow(that,tableID,classArr,idsArr){

    try {
        var table = document.getElementById(tableID);
        var rowCount = $("#"+table.id+' tbody tr').length;
        //alert("second"+rowCount);
        var imgId2 = that.id;
        var rowId = imgId2.substring(imgId2.indexOf('[')+1,imgId2.indexOf('[')+2);
        if(rowCount>1){
            //alert($(that).parents("tr:first").html());
            $(that).parents("tr:first").remove();
            var b=false;

        }
        else{
            alert('At least one Row required');
        }

        reloadSum(classArr,idsArr);
        //  proposedtotal();
        creproposedtotal();

    }catch(e) {
    //  alert(e);
    }
}

//function removetermloanRow(that,tableID,classArr,idsArr){

function removetermloanRow(that,tableID,classArr,idsArr){

    try {
        //alert(classArr+" = "+idsArr);
        var table = document.getElementById(tableID);
        var rowCount = $("#"+table.id+' tbody tr').length;
        //alert("second"+rowCount);
        var imgId2 = that.id;
        var rowId = imgId2.substring(imgId2.indexOf('[')+1,imgId2.indexOf('[')+2);
        if(rowCount>1){
            //alert($(that).parents("tr:first").html());
            $(that).parents("tr:first").remove();

            //Suresh Edited Code Start
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
                    $("#"+tableID+" tr:nth("+i+")").find("input[type='text'],input[type='hidden'],textarea,select").each(function(){

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
                    $("#"+tableID+" tr:nth("+i+")").find("input[type='button']").each(function(){
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
            //Suresh Edited Code End


            var b=false;

        }
        else{
            alert('At least one Row required');
        }

        reloadSum(classArr,idsArr);
        LiabilitiesGrandTotal1();
        LiabilitiesGrandTotal2();

    }catch(e) {
    //  alert(e);
    }
}

function checkAge(){

    if( $("#ar059Brrwr_ar059Age").val()>100){
        $("#ar059Brrwr_ar059Age").val("");
        return false;
    }
    if($("#ar059Brrwr_ar059Age").val()!= "" && $("#ar059Brrwr_ar059Age").val()==0){
        $("#ar059Brrwr_ar059Age").val("");
        return false;
    }
    else{
        return true;
    }


}

function addProjectRow(table)
{
    //alert("Surya Test");
    var tableId = document.getElementById(table);

    var rowCount = tableId.rows.length;
    //var row = table.insertRow(rowCount);

    var stts=get(table);
    if(stts==false){
        alert("please enter the data before adding new rows!");
    }else{

        // clone the last row in the table
        //var $tr = $("#tableId2").find("tbody tr:last").clone();
        var $tr = $("#"+table+"").find("tbody tr:last").clone();

        // get the name attribute for the input and select fields
        $tr.find("input,select,textarea").attr("name", function()
        {
            //        var sub=this.name.substring(this.id.indexOf('['));
            //        var getNum=parseInt(sub.match(/(\d+)/g))+1;
            //        var newString=sub.replace(/(\d+)/g,getNum);
            //        var newName=this.name.replace(sub,newString);
            //alert(this.name);
            var inedex1=this.name.indexOf('[');

            var str1=this.name.substring(inedex1, inedex1+3);

            var getNum=str1.substring(1,2);

            var increment=parseInt(getNum)+1;

            var str2=str1.replace(getNum,increment);

            var newName=this.name.replace(str1,str2);

            return newName;

        }).attr("id", function(){
            //        var sub=this.id.substring(this.id.indexOf('['));
            //        var getNum=parseInt(sub.match(/(\d+)/g))+1;
            //        var newString=sub.replace(/(\d+)/g,getNum);
            //        var newID=this.id.replace(sub,newString);

            var inedex1=this.id.indexOf('[');
            var str1=this.id.substring(inedex1, inedex1+3);
            var getNum=str1.substring(1,2);
            var increment=parseInt(getNum)+1;
            var str2=str1.replace(getNum,increment);

            var newID=this.id.replace(str1,str2);
            //            alert(newID)

            return newID;
        }).attr("value",function(){
            var val = this.value;
            if(this.type=="hidden"){
                val = "";
            }
            if(this.type != "button") {

                val = "";
            }

            return val;
        }).attr("selectedIndex", function(){
            return 0;
        });

        $tr.find("input").removeClass('hasDatepicker');
        $tr.find("img.ui-datepicker-trigger").remove();
        $tr.find("button.ui-datepicker-trigger").remove();

        // append the new row to the table
        //$("#tableId2").find("tbody tr:last").after($tr);
        $("#"+table+"").find("tbody tr:last").after($tr);
    }
    classValidations();

}

function addProjectRowExisting(table)
{

    var tableId = document.getElementById(table);

    var rowCount = tableId.rows.length;
    //var row = table.insertRow(rowCount);

    var stts=get(table);
    if(stts==false){
        alert("please enter the data before adding new rows!");
    }else{

        // clone the last row in the table
        //var $tr = $("#tableId2").find("tbody tr:last").clone();
        var $tr = $("#"+table+"").find("tbody tr:last").clone();

        // get the name attribute for the input and select fields
        $tr.find("input,select,textarea").attr("name", function()
        {
            //        var sub=this.name.substring(this.id.indexOf('['));
            //        var getNum=parseInt(sub.match(/(\d+)/g))+1;
            //        var newString=sub.replace(/(\d+)/g,getNum);
            //        var newName=this.name.replace(sub,newString);
            //alert(this.name);
            var inedex1=this.name.indexOf('[');

            var str1=this.name.substring(inedex1, inedex1+3);

            var getNum=str1.substring(1,2);

            var increment=parseInt(getNum)+1;

            var str2=str1.replace(getNum,increment);

            var newName=this.name.replace(str1,str2);

            return newName;

        }).attr("id", function(){
            //        var sub=this.id.substring(this.id.indexOf('['));
            //        var getNum=parseInt(sub.match(/(\d+)/g))+1;
            //        var newString=sub.replace(/(\d+)/g,getNum);
            //        var newID=this.id.replace(sub,newString);

            var inedex1=this.id.indexOf('[');
            var str1=this.id.substring(inedex1, inedex1+3);
            var getNum=str1.substring(1,2);
            var increment=parseInt(getNum)+1;
            var str2=str1.replace(getNum,increment);

            var newID=this.id.replace(str1,str2);
            //            alert(newID)

            return newID;
        }).attr("value",function(){
            var val = this.value;
            if(this.type=="hidden"){
                val = "";
            }
            if(this.type != "button") {

                val = "";
            }

            return val;
        }).attr("selectedIndex", function(){
            return 0;
        });

        $tr.find("input").removeClass('hasDatepicker');
        $tr.find("img.ui-datepicker-trigger").remove();
        $tr.find("button.ui-datepicker-trigger").remove();

        // append the new row to the table
        //$("#tableId2").find("tbody tr:last").after($tr);
        $("#"+table+"").find("tbody tr:last").after($tr);
    }
    classValidations();

}