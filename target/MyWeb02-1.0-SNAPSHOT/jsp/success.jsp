<%--
  Created by IntelliJ IDEA.
  User: zhang
  Date: 2019/5/13
  Time: 18:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<%
    String path=request.getContextPath();
    String basePath=request.getScheme()+"://"+request.getServerName()+":"+
            request.getServerPort()+path+"/";
    System.out.println(basePath);
%>
<head>
    <base basePath="<%=basePath%>">
    <title>用户页面</title>
    <style>
        table,th,tr{
            margin: 100px auto;
            border-style: outset;
        }
        body{
            background-image: url(<%=basePath%>images/back.jpg);
        }
    </style>
</head>
<body>

    <h1 style="color:green;">欢迎${username}</h1>
    <table>
        <tr>
            <th>姓名</th>
            <th>密码</th>
            <th>地址</th>
            <th>电话</th>
            <th>邮件</th>
        </tr>
        <tr>
            <th>${user.uname}</th>
            <th>${user.upassword}</th>
            <th>${user.uaddress}</th>
            <th>${user.unumber}</th>
            <th>${user.uemail}</th>
        </tr>
    </table>
</body>
</html>
