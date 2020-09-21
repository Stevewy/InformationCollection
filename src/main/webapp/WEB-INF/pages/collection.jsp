<%--
  Created by IntelliJ IDEA.
  User: asus
  Date: 2020/9/21
  Time: 16:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>收集到的信息</title>
</head>
<body>
    <h2>已经收集下面成员的信息</h2>
    <c:forEach items="${collection}" var="people">
        ${people.name} <br/>
    </c:forEach>
</body>
</html>
