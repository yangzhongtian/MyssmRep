<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/1/9
  Time: 13:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://"
            + request.getServerName() + ":" + request.getServerPort()
            + path + "/";
%>
<!DOCTYPE html>
<html>
<head>
    <title>Title</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="<%= basePath%>js-lib\bootstrap\css\bootstrap.css">
    <link rel="stylesheet" href="<%= basePath%>js-lib\bootstrap\css\bootstrap-theme.css">

    <script src="http://cdn.bootcss.com/jquery/1.11.1/jquery.min.js"></script>
    <script type="text/javascript" src="<%= basePath%>js-lib\bootstrap\js\bootstrap.js"></script>
</head>
<body>
    <h1 >h1元素默认为36px  <small>h1中的 小元素</small> </h1>
    <h2 >h1元素默认为30px  <small>h2中的 小元素</small></h2>
    <h3 >h1元素默认为24px <small>h3中的 小元素</small></h3>
    <h4 >h1元素默认为18px <small>h4中的 小元素</small></h4>
    <h5 >h1元素默认为14px<small>h5中的 小元素</small> </h5>
    <h6 >h1元素默认为12x <small>h6中的 小元素</small></h6>

    测试mark 标签 <mark>Hello</mark>

    测试abbr 标签  <abbr title="abbr 元素">abbr</abbr>
    <br/>
    <%--应用块--%>
    <blockquote>
        hello everyone hello everybody
    </blockquote>

    <%--响应表格--%>
    响应表格  当表格小于 768px  会有水平滚动条
    <div class="table-responsive">
        <table class="table">
            <tr>
                <td>Hello everyOne</td>
                <td>Hello everyOne</td>
                <td>Hello everyOne</td>
                <td>Hello everyOne</td>
                <td>Hello everyOne</td>
                <td>Hello everyOne</td>
            </tr>

        </table>
    </div>
</body>
</html>
