<%@ page  pageEncoding="UTF-8" isELIgnored="false" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
  
  <body>
  	<form action="${pageContext.request.contextPath}/user/updateUser" method="post">
  		<table >
  			<tr>
  				<td hidden><input type="text" name="id" readonly value="${sessionScope.user.id}"/></td>
  			</tr>
  			<tr>
  				<td>name:</td>
				<td><input type="text" name="userName"  value="${sessionScope.user.userName}"/></td>
  			</tr>
  			<tr>
  				<td>pwd:</td>
  				<td><input type="text" name="pwd" value="${sessionScope.user.pwd}"/></td>
  			</tr>
  			<tr>
  				<td>type:</td>
  				<td><input type="text" name="type" value="${sessionScope.user.type}"/></td>
  			</tr>
  		</table>
  		<input type="submit" value="submit"/>
  	
  	</form>
  	
  </body>
</html>
