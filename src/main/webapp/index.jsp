<%--
  Created by IntelliJ IDEA.
  User: Fookey
  Date: 2017/7/1
  Time: 10:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
        <%--直接转向login页面--%>
       <% request.getRequestDispatcher("/login/init.do").forward(request,response);%>
</body>
</html>
