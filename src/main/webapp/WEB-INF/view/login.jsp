<%--
  Created by IntelliJ IDEA.
  User: Fookey
  Date: 2017/7/1
  Time: 11:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <div>
        <form action='<c:url value="/login/userLogin.do"/> ' method="POST">
            用户名：<input type="text" name="userName"><br/>
            密码：<input type="password" name="password"><br/>
            <input type="submit" value="登录">
            <input type="reset" value="取消">
        </form>
    </div>

</body>
</html>
