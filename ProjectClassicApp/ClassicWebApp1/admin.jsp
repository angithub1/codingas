<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:useBean id="comp" class="classic.web.app.CompanyBean" scope="session"/>
<jsp:setProperty name="comp" property="*"/>
<c:if test="${param.signout}">
	<c:set target="${comp}" property="id"/>
</c:if>
<html>
	<head>
		<title>ClassicWebApp1</title>
	</head>
	<body>
		<h2>Hi there! Welcome to the A1 SoftTech family</h2>



		<p>Quality never goes out of style</p>

	
		<form method="POST">
			<p>
				<b>Admin UserID</b><br/>
				<input type="text" name="id"/>
			</p>
			<p>
				<b>Password</b><br/>
				<input type="password" name="password"/>
			</p>
			<p>
				<input type="submit" name="submit" value="Login"/>
			</p>
		</form>
		<c:if test="${param.submit == 'Login'}">
			<c:choose>
				<c:when test="${comp.authenticate()}">
					<c:redirect url="department.jsp"/>
				</c:when>
				<c:otherwise>
					<b>Authentication Failed</b>
				</c:otherwise>
			</c:choose>
		</c:if>
	</body>
</html>

