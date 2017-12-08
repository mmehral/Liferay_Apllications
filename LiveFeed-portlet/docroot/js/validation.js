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
