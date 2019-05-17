<%--
  Created by IntelliJ IDEA.
  User: zhang
  Date: 2019/5/13
  Time: 13:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<head>
    <base basePath="<%=basePath%>">
    <title>登录</title>
    <style>
        body{
            background-image: url(<%=basePath%>images/back.jpg);
        }
        table{
            padding-right: 35px;
            padding-left: 35px;
            border-style: outset;
            margin:150px auto;
            text-align: left;
        }
        th,td{
            padding: 3px 3px 3px 3px;
            //border-style: outset;
        }
        .td1{
            text-align: right;
        }
        .check_img{
            width: 30px;
            height: 45px;
            float: left;
        }
        .but{
            text-align: center;
        }
        #but_sub{
            margin-left: 40px;
        }
        #check_tr{
            height: 45px;
        }
        #change{
            width: 80px;
            height: 20px;
        }
    </style>
    <%
        int[] arr=new int[4];
        String string1=null;
        String string2=null;
        String string3=null;
        String string4=null;
    %>
    <script type="text/javascript" src="<%=basePath%>jQuery/jquery-3.1.1.min.js"></script>
    <script type="text/javascript">
        $(document).ready(function(){
            $("#change").click(function(){
                <%

                    for (int i=0;i<4;i++){
                        arr[i]=(int)(Math.random()*10);
                    }
                    string1="images/"+arr[0]+".png";
                    string2="images/"+arr[1]+".png";
                    string3="images/"+arr[2]+".png";
                    string4="images/"+arr[3]+".png";
                %>
                $("#check_img1").attr("src","<%=basePath+string1%>");
                $("#check_img2").attr("src","<%=basePath+string2%>");
                $("#check_img3").attr("src","<%=basePath+string3%>");
                $("#check_img4").attr("src","<%=basePath+string4%>");
            });
            $("#but_sub").click(function () {
                <%
                    String string=""+arr[0]+arr[1]+arr[2]+arr[3];
                %>
                var str=$("#check").val();
                if (str==<%=string%>&&$("#pwd1").val()==$("#pwd2").val()) {
                    $("form").submit();
                }
            });
        });
    </script>
</head>
<body>
    <h3 style="color: red">${info}</h3>
    <form action="<%=basePath%>user/load" method="post">
        <table>
            <tr>
                <td class="td1">用户名：</td>
                <td>
                    <input type="text" name="username"/>
                </td>
            </tr>
            <tr>
                <td class="td1">密&nbsp;&nbsp;码：</td>
                <td>
                    <input type="password" id="pwd1" name="pwd"/>
                </td>
            </tr>
            <tr>
                <td class="td1">确认密码：</td>
                <td>
                    <input type="password" id="pwd2" name="pwd"/>
                </td>
            </tr>
            <tr id="check_tr">
                <td class="td1">验证码：</td>
                <td>
                    <input type="text" id="check" name="check"/>
                </td>
            </tr>
            <tr>
                <td>
                    <button id="change" type="button">点一下</button>
                </td>
                <td>
                    <img src="<%=basePath%>images/n.png" class="check_img" id="check_img1">
                    <img src="<%=basePath%>images/n.png" class="check_img" id="check_img2">
                    <img src="<%=basePath%>images/n.png" class="check_img" id="check_img3">
                    <img src="<%=basePath%>images/n.png" class="check_img" id="check_img4">
                </td>
            </tr>
            <tr>
                <td class="but">
                    <input type="button" id="but_sub" value="登录"/>
                </td>
                <td class="but">
                    <input type="reset" id="but_set" value="重置"/>
                </td>
            </tr>
        </table>
    </form>

</body>
</html>
