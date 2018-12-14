<%@page pageEncoding="utf-8" isELIgnored="false"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
</head>
<body>
<c:forEach var="list" items="${sessionScope.list}">
    <tr>
        <td>${list.id}</td>
        <td>${list.userName}</td>
        <td>${list.pwd}</td>
        <td>${list.type}</td>
        <td><a href="${pageContext.request.contextPath}/user/deleteUser?id=${list.id}">delete</a>&nbsp;<a href="${pageContext.request.contextPath}/user/queryById?id=${list.id}">update</a></td>
    </tr>
    <br/>
</c:forEach>
<a href="${pageContext.request.contextPath}/add.jsp"><input type="button" class="button" value="Add" /></a>
</body>
</html>
