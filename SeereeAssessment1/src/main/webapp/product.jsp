<!DOCTYPE html>
<html>
<head>
    <title>Product Page</title>
    <script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
    <script type="text/javascript">
        $(document).ready(function() {
            $("#prodName").blur(function() {
                $.ajax({
                    url : "/products",  // Assuming this is the correct endpoint
                    type : "post",
                    dataType : "json",
                    data : {
                        prodName : $(this).val(),
                        ProdID: $("#ProdID").val(),
                        _csrf: $('meta[name="_csrf"]').attr('content')
                    },
                    success : function(res) {
                        console.log(res);
                        $("#prodRate").val(res[0].ProdRate);
                        $("#oprodQty").val(res[0].ProdQty);
                        $("#ProdID").val(res[0].ProdID);
                    }
                });
            });
        });
		function chk(){
            oprodQty=parseInt(document.getElementById("oprodQty").value);
            prodQty=parseInt(document.getElementById("prodQty").value);
            if(oprodQty >= prodQty){
                document.getElementById("sms").innerHTML="";
                return true;
            }else{
                document.getElementById("sms").innerHTML="qty not available";
                return false;
            }
        }
    </script>
</head>
<body>
    <form method="post" action="save_product" onsubmit="return chk()">
        prod Name: <input type="text" id="prodName" name="prodName"> <br>
        prod Rate: <input type="text" id="prodRate" name="prodRate" readonly>
        <input type="hidden" name="ProdID" id="ProdID">
        <br>  <input type="hidden" id="oprodQty" name="oprodQty">
        prod Qty: <input  id="prodQty" name="prodQty"><span id="sms"></span>
        <br>
        <input type="submit" value="place order">
    </form>
</body>
</html>
${sms}