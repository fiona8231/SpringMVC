<%--
  Created by IntelliJ IDEA.
  User: xuyue
  Date: 29.10.20
  Time: 18:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Success</title>

    <h1>Success</h1>
    ${user1.age}

    <h1>Success 2</h1>
    ${user2.username}
    ${user2.age}
    ${user2.birthday}
</head>


<% System.out.println("suceess.jsp executiong"); %>

<%--测试ModelAttribute取值--%>
  ${requestScope.msg}
  ${sessionScope.msg}
<body>

</body>
</html>
