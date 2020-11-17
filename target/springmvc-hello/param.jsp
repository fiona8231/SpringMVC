<%--
  Created by IntelliJ IDEA.
  User: xuyue
  Date: 30.10.20
  Time: 02:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Params</title>

    <a href="param/testParam?username=fiona&&password=1234"> 请求绑定参数 </a>
</head>

  <form action="param/saveAccount" method="post">

      name: <input type="text" name="username" /> <br>
      pass: <input type="text" name="password" /> <br>
      money: <input type="text" name="money" /> <br>
      userName: <input type="text" name="user.username"/> <br>
      userName: <input type="text" name="user.age"/> <br>

      <input type="submit" value="submit" />

  </form>




<form action="param/saveAccount" method="post">

    name: <input type="text" name="username" /> <br>
    pass: <input type="text" name="password" /> <br>
    money: <input type="text" name="money" /> <br>
    Birthday: <input type="text" name="birthday" /> <br>

    userName: <input type="text" name="list[0].username"/> <br>
    Age: <input type="text" name="list[0].age"/> <br>

    userName: <input type="text" name="map['one'].username"/> <br>
    Age: <input type="text" name="map['one'].age"/> <br>

    <input type="submit" value="submit" />

</form>


<body>

</body>
</html>
