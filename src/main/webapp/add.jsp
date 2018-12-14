<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false" %>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
</head>

<body>

	<form action="${pageContext.request.contextPath}/user/insertUser" method="post">
		<table>
			<tr>
				<td>姓名:</td>
				<td><input type="text" name="userName" /></td>
			</tr>
			<tr>
				<td>密码:</td>
				<td><input type="text" name="pwd" /></td>
			</tr>
			<tr>
				<td>类型:</td>
				<td><input type="text" name="type" /></td>
			</tr>
		</table>
		<p>
			<input type="submit" class="button" value="Confirm" />
		</p>
	</form>
</body>
</html>
