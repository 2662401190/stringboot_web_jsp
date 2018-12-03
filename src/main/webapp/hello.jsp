<%--
  Created by IntelliJ IDEA.
  User: HeWei
  Date: 2018/12/2
  Time: 13:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <%
        request.setAttribute("path", request.getContextPath());
    %>
    <title>Title</title>
</head>
<body>
    <h1> Hello. jsp</h1>

    <a href="${path}/sd">asdas</a>

    <form action="/hello" method="post">
        <button type="submit" value="等"></button>
    </form>
</body>
</html>
