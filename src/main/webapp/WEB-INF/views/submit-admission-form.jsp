<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<title>Insert title here</title>
</head>
<body>
	<h3>${msg}</h3>
	<h1>Congratulation! You have successfully registered!</h1>
	<h3>Detailed Information</h3>
	<table>
		<tr>
			<td>Student Name: </td>
			<td>${student.studentName}</td>
		</tr>
		<tr>
			<td>Student ID: </td>
			<td>${student.studentID}</td>
		</tr>
	</table>
</body>
</html>