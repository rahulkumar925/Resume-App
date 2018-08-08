<!-- View It will show the Resume. As data filled By user. -->


<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="com.cg.resume.Person"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Resume</title>
</head>
<body>
	<%
		Person person = (Person) request.getAttribute("PersonObject");
	%>
	<div align="center">
		<h1>
			<b>Resume</b>
		</h1>
	</div>
	<p>
		Name:
		<%=person.getFirstname()%>&nbsp&nbsp<%=person.getLastname()%><br>
		Gender:
		<%=person.getGender()%>
		<br> Date of Birth:
		<%=person.getDob()%>
		<br> Highest Qualification:
		<%=person.getHq()%>
		<br> Skills:<%
			for (String skills : person.getSkills()) {
		%>
		<%=skills%>&nbsp&nbsp
		<%
			}
		%>
		<br> Hobbies:
		<%
			for (String hobbies : person.getHobbies()) {
		%>
		<%=hobbies%>&nbsp&nbsp
		<%
			}
		%>
		<br> Email:
		<%=person.getEmail()%><br> Contact No:
		<%=person.getPhoneno()%><br> Address:
		<%=person.getAddress()%><br> Summary:
		<%=person.getSummary()%>
	</p>
</body>
</html>