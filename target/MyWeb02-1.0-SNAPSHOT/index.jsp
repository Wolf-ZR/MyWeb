<%--
  Created by IntelliJ IDEA.
  User: zhang
  Date: 2019/5/13
  Time: 13:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>首页</title>
  </head>
  <body>
  <a href="jsp/load.jsp" style="size: A3">登录</a>
  <%
    response.sendRedirect("jsp/load.jsp");
  %>
  </body>
</html>
