<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:useBean id="comp" class="classic.web.app.CompanyBean" scope="session"/>
<jsp:setProperty name="comp" property="*"/>
<c:if test="${empty comp.id}">
	<c:redirect url="admin.jsp"/>
</c:if>
<html>
	<head>
		<title>ClassicWebApp1</title>
	</head>
	<body>

		<h6>.......!!  THINK  LEARN  TRY  UPGRADE  REPEAT  !!......</h6>

		<h2>Department ${comp.deptId} details are<h2>

		
		<table border="1">
			<tr>
				<th>Employee Id</th>
				<th>Employee Name</th>
				<th>Employee salary</th>
				<th>Employee commission</th>
			</tr>
			<c:forEach var="entry" items="${comp.empDetails}">
				<tr>
					<td>${entry.empId}</td>
					<td>${entry.empName}</td>
					<td>${entry.empSalary}</td>
					<td>${entry.empComm}</td>
					
				</tr>
			</c:forEach>
		</table>
		<p>
			<a href="admin.jsp?signout=true">Logout</a>
		</p>
	</body>
</html>

