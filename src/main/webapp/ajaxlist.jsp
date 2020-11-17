<%--
  Created by IntelliJ IDEA.
  User: xuyue
  Date: 16.11.20
  Time: 03:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<script
        src="https://code.jquery.com/jquery-2.2.4.js"
        integrity="sha256-iT6Q9iMJYuQiMWNd9lDyBUStIq/8PuOW33aOqmvFpqI="
        crossorigin="anonymous"></script>
<head>
    <title>Title</title>
</head>
<body>
   <input type="button" id="btn1" value="获取数据"/>

  <table>
      <tr>
          <td>Name</td>
          <td>Age</td>
          <td>Birthday</td>
      </tr>
      <tbody id="content1">
      </tbody>
  </table>

<script>
    $(function (){
        $("#btn1").click(function (){
            $.post("ajax/a2", function (data){
                console.log(data);
                let html = "";
                for(let i = 0; i< data.length; i++){
                    html += "<tr>" +
                    "<td>" + data[i].username + "</td>" +
                    "<td>" + data[i].age + "</td>" +
                    "<td>" + data[i].birthday + "</td>"+
                    "</tr>"
                }
                $("#content1").html(html);
            })
        })
    })

</script>
</body>
</html>
