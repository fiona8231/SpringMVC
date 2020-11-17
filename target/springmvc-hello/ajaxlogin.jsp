<%--
  Created by IntelliJ IDEA.
  User: xuyue
  Date: 16.11.20
  Time: 16:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <script
            src="https://code.jquery.com/jquery-2.2.4.js"
            integrity="sha256-iT6Q9iMJYuQiMWNd9lDyBUStIq/8PuOW33aOqmvFpqI="
            crossorigin="anonymous"></script>
    <title>Title</title>
</head>
<script>

    function a1(){
        $.post({
            url:"ajax/a3",
            data: {"name":$("#myname").val()},
            success: function (data){
                if(data.toString()==='ok'){
                    $("#spanname").css("color", "green")
                }else {
                    $("#spanname").css("color", "red")
                }
                $("#spanname").html(data);
            }
        });
    }


    function a2(){
        $.post("ajax/a3", {"pwd":$("#mypwd").val()}, function (data) {
            if(data.toString()==='ok'){
                $("#spanpwd").css("color", "green")
            }else {
                $("#spanpwd").css("color", "red")
            }
            $("#spanpwd").html(data);
        } )
    }

</script>
<body>
   <p>
       用户名：
       <input type="text" id="myname" onblur="a1()"/>
       <span id="spanname"> </span>
   </p>
   <p>
       密码：
       <input type="text" id="mypwd" onblur="a2()"/>
       <span id="spanpwd"> </span>
   </p>

</body>
</html>
