<%--
  Created by IntelliJ IDEA.
  User: xuyue
  Date: 16.11.20
  Time: 00:18
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<script
        src="https://code.jquery.com/jquery-2.2.4.js"
        integrity="sha256-iT6Q9iMJYuQiMWNd9lDyBUStIq/8PuOW33aOqmvFpqI="
        crossorigin="anonymous"></script>
<html>
<head>
    <title>Ajax</title>
</head>
<body>

<script type="text/javascript">
   function a1(){
       $.ajax({
          url : "ajax/a1",
          data: {"name": $("#txtName").val()},
          success: function (data, status){
              alert(data);
              alert(status);
          }

       });

   }
</script>
<%--失去焦点--%>
用户名：
<input type="text" id="txtName" onblur="a1()">

</body>
</html>
