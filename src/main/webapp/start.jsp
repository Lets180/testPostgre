<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
</head>
<body>
<h1>hello, servlets!</h1>
<br/>
<form method="post" action="/my-app/return-servlet">
    User name: <input name="userName">
    Password: <input name="password">
    <button type="submit">Send</button>
</form>
<br/>
<form method="post" action="/my-app/file-servlet" enctype="multipart/form-data">
    <input type="text" name="author-name">
    <input type="file" name="file-name">
    <button>Send</button>
</form>
</body>
</html>