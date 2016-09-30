<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<title>Student Admission Form</title>
</head>
<body>
	<h3>${msg}</h3>
	<h1>Submit the form for registration</h1>
	<form action="submitAdmissionForm.html" method="post">
		<p>Student Name: <input type="text" name="studentName"/></p>
		<p>Student ID: <input type="text" name="studentID"/></p>
		<button  type="submit">Submit</button>
	</form>
</body>
</html>