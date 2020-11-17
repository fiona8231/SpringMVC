<%--
  Created by IntelliJ IDEA.
  User: xuyue
  Date: 14.11.20
  Time: 15:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>

<%--   常用注解--%>
     <a href="anno/testRequestParam?name=thisisfiona"> Test Request Param </a>
     <br>
</head>
<body>
     <a href="anno/testPathVariable/10">testPathVariable</a>
     <%--     test ModelAtrribute with MapParam (have return)--%>
    <br>
    <form action="anno/testModelAtrribute" method="post">
         用户姓名: <input type="text" name="username"/> <br>
         用户年龄: <input type="text" name="age"/>  <br>
         <input type="submit" value="提交">
    </form>


<%--     test ModelAtrribute without MapParam (no return)--%>
     <br>
     <form action="anno/testModelAttributeMapParam" method="post">
         用户姓名: <input type="text" name="username"/> <br>
         用户年龄: <input type="text" name="age"/>  <br>
         <input type="submit" value="提交">
     </form>

     <a href="anno/testSessionAttributes">testSessionAttributes</a>
     <br>
     <a href="anno/getSessionAttributes">getSessionAttributes</a>
     <br>
     <a href="anno/deleteSessionAttributes">deleteSessionAttributes</a>
</body>
</html>
