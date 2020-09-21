<%--
  Created by IntelliJ IDEA.
  User: asus
  Date: 2020/9/21
  Time: 16:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>成员信息收集表</title>
</head>
<body>
    <form action="people/save" method="post">
        学号:<input type="text" name="studentNumber"><br>
        姓名:<input type="text" name="name"><br>
        生日:<input type="text" name="birthday"><br>
        性别:<input type="text" name="sex"><br>
        地址:<input type="text" name="address"><br>
        <input type="submit" value="保存"><br>
    </form>

</body>
</html>
