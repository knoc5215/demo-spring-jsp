<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>events list</h1>
<h2>${message}</h2>
<table>
    <tr>
        <th>name</th>
        <th>start</th>
    </tr>
    <c:forEach items="${events}" var="event">
        <tr>
            <td>${event.name}</td>
            <td>${event.start}</td>
        </tr>
    </c:forEach>
</table>

</body>

</html>