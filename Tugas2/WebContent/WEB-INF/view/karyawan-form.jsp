<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" type="text/css" href="resources/css/main.css">
<title>Hello World Form</title>
</head>
<body>
	<div class="grandParentContainer">
	<div class="parentContainer">
	<form:form class="form-style-4"  method="POST" action="/Tugas2/processForm" modelAttribute="karyawan">
	<h2 style="color:white;font-style: bold;text-align:center;">Enter your message here</h2>
	<table>
	<tr>
		<td><form:label path="id">Id</form:label></td>
		<td><form:input path="id"/></td>
	</tr>
	<tr>
		<td><form:label path="nama">Nama</form:label></td>
		<td><form:input path="nama"/></td>
	</tr>
	<tr>
		<td><form:label path="alamat">Alamat</form:label></td>
		<td><form:input path="alamat"/></td>
	</tr>
	<tr>
		<td><form:label path="gender">Gender</form:label></td>
		<td><form:input path="gender"/></td>
	</tr>
	<tr>
		<td><form:label path="tahunmasuk">Tahun Masuk</form:label></td>
		<td><form:input path="tahunmasuk"/></td>
	</tr>
	<tr>
		<td><form:label path="gaji">Gaji</form:label></td>
		<td><form:input path="gaji"/></td>
	</tr>
	<tr>
		<td><label></label></td>
		<td align="right"><input type="submit" value="Submit"/></td>
	</tr>
	</table>
	</form:form>
	
	</div>
	</div>
</body>
</html>