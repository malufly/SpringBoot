<%--
  Created by IntelliJ IDEA.
  User: malu
  Date: 2019/12/28
  Time: 2:40 下午
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
        在部署项目在服务器的时候注意设置 applicationContext 为/ 否则springBoot会默认的添加
        Hello jsp
        <a href="/hello">hello</a>
</body>
</html>
