
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<head>
    <base basePath="<%=basePath%>">
    <title>用户页面</title>
    <style>
        table,th{
            margin: 0 auto;
            border-style: outset;
            padding: 10px 10px 10px 10px;
        }
        h1{
            text-align: center;
            margin: 10px auto;
            color: navy;
            font-size: 50px;
        }
        body{
            background-color: turquoise;
        }
        a{
            text-align: right;
        }
    </style>
</head>
<body>
<div>
    <a href="load.jsp">登录</a>
</div>
<h1>所有用户信息</h1>

<table>
    <tr>
        <th>姓名</th>
        <th>密码</th>
        <th>地址</th>
        <th>电话</th>
        <th>邮件</th>
    </tr>
    <c:forEach items="${userList}" var="u">
        <tr>
        <th>${u.uname}</th>
        <th>${u.upassword}</th>
        <th>${u.uaddress}</th>
        <th>${u.unumber}</th>
        <th>${u.uemail}</th>
        </tr>
    </c:forEach>
</table>
</body>
</html>
