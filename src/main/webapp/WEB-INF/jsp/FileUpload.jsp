<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/1/6
  Time: 10:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page isELIgnored="false"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
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
<form action="uploadFileAction" method="post" enctype="multipart/form-data">
    文件1: <input type="file" name="myfiles"/><br/>
    文件2: <input type="file" name="myfiles"/><br/>
    文件3: <input type="file" name="myfiles"/><br/>
    <input type="submit" value="上传">
</form>u

</body>
</html>
