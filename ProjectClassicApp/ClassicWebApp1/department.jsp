<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:useBean id="comp" class="classic.web.app.CompanyBean" scope="session"/>
<c:if test="${empty comp.id}">
	<c:redirect url="admin.jsp"/>
</c:if>
<html>
	<head>
		<title>ClassicWebApp1</title>
	</head>
	<body>
		<p>Hello Admin ${comp.id} we welcomes you at A1 SoftTech</p>
		<h2>Our department details are</h2>
		
		<table border="1">
			<tr>
				<th>Department No</th>
				<th>Department Name</th>
				<th>Department Location</th>
				<th>Employee details of the department</th>
			</tr>
			<c:forEach var="entry" items="${comp.deptDetails}">
				<tr>
					<td>${entry.deptId}</td>
					<td>${entry.deptName}</td>
					<td>${entry.deptLocation}</td>
					<td><a href="details.jsp?deptId=${entry.deptId}">click here</a></td>
					
				</tr>
			</c:forEach>
		</table>
		<p>
			<a href="admin.jsp?signout=true">Logout</a>
		</p>
	</body>
</html>

