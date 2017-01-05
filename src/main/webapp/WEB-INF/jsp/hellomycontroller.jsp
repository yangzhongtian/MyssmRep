<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/1/5
  Time: 14:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page isELIgnored="false"%>
<html>
<head>
    <title>Hello My Controller jsp</title>
    <meta charset="utf-8">
    <style type="text/css">
        #mydiv{
            text-align: center;
            color:steelblue;
            font-size: 40px;
            margin: 60px;
        }

    </style>
</head>
<body>
    <div id="mydiv">
        Hello my Controller jsp ${user.userName}
    </div>
</body>
</html>
