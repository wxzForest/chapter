<%@ page language="java" contentType="text/html; charset=UTF-8"
                pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>景区网站管理</title>
</head>
<body>
${user.userName},欢迎您进入景区网站后台管理！


<form action="<c:url value="/admin/changePassword.html"/>" method="post">
    用户名：
    <input type="text" name="userName" value="${user.userName}">
    <br>
    密 码：
    <input type="password" name="password">
    <br>
    <input type="submit" value="修改"/>
    <input type="reset" value="重置"/>
</form>
</body>
</html>