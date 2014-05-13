<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Search</title>
</head>
<body>
	
	<form method="post" action="search.htm">
		<h1>${welcomeMessage}</h1>
		<br />
		<br />
		
		<div>
			<label>How many males are in the address book?</label>
			<input type="submit" value="Search" name="male">
			${nMale}
		</div>
		<div>
			<label>Who is the oldest person in the address book?</label>
			<input type="submit" value="Search" name="old">
			${oldestPerson.name} ${oldestPerson.surname} 
			<fmt:formatDate pattern="dd/MM/yyyy" value="${oldestPerson.birthday}" var="dateB" />
			${dateB}
		</div>
		<div>
			<label>How many days older is Bill than Paul?</label>
			<input type="submit" value="Search" name="diff">
			${nDiffDay}
		</div>
		
	</form>
</body>
</html>
