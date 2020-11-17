<%--
  Created by IntelliJ IDEA.
  User: xuyue
  Date: 30.10.20
  Time: 21:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>



<html>
<head>
    <title>Title</title>
</head>
<body>
     <a href="user/testString"> Testing 1</a>

     <br/>
     <a href="user/testVoid"> Testing 2</a>

     <br/>
     <a href="user/redirect"> Testing 3</a>

     <br/>
     <a href="user/getWriter"> Testing 4</a>


     <br/>
     <a href="user/modelAndView"> Testing Model And View</a>

     <br/>
   <script src="js/jquery.js"></script>

     <button id="btn1">发送js请求</button>
     <br/>
     <button id="btn2">发送ajax</button>

     <script src="http://ajax.googleapis.com/ajax/libs/jquery/1.3/jquery.min.js" type="text/javascript">

         $(function(){
             $("#btn1 ").click(function(){
                 alert("hello btn");
             });
         });
     </script>



    <script>
        $(function(){
            $("#btn2 ").click(function(){
                $.ajax({
                    url:"user/testAjax",
                    contentType:"application/json;charset=UTF-8",
                    data:'{"username":"hehe","password":"123"}',
                    dataType:"json",
                    type:"post",
                    success:function (data) {
                        alert(data);
                        alert(data.username);

                    }
                })
            });
        });

    </script>

</body>
</html>
