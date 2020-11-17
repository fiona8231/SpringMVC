<%--
  Created by IntelliJ IDEA.
  User: xuyue
  Date: 15.11.20
  Time: 22:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>

<script type="text/javascript">
    window.onload = function (){
        var myData = new Date();
        document.getElementById('currentTime').innerText = myData.getTime();
    }

    function load(){
        //目标url
        var targetUrl = document.getElementById('url').value;
        document.getElementById('iframe').src = targetUrl;

    }

</script>
<body>
  <div>
      <p> 请输入要加载的地址：<span id="currentTime"></span></p>
      <p>
          <input type="text" id="url" value="http://www.mafengwo.cn/">
          <input type="button" value="提交" onclick="load()">
      </p>
  </div>


<div>
    <h3>加载页面的位置：</h3>
    <iframe style="width: 100%;height:500px" id="iframe">

    </iframe>
</div>

</body>
</html>
