<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2018/1/17
  Time: 13:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page isELIgnored="false"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table border=1>
    <tr><td>Id</td><td>Name</td><td>Age</td></tr>
    <c:forEach items="${plist}" var="plist">
    <tr>
        <td>${plist.personId}</td>
        <td>${plist.personName}</td>
        <td>${plist.personAge}</td>
    </tr>
    </c:forEach>
</body>
</html>
