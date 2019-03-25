<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" type="text/css" href="resources/css/main.css">
<title>View</title>
</head>
<body>
	<div class="grandParentContainer">
	<div class="parentContainer">
	<form action="entry" class="form-style-4">
	<h2 style="color:white;font-style: bold;text-align:center;">Data Karyawan</h2>
	<table>
	<tr>
		<td><label>Id </label></td>
		<td><label>: ${id}</label></td>
	</tr>
	<tr>
		<td><label>Nama </label></td>
		<td><label>: ${nama}</label></td>
	</tr>
	<tr>
		<td><label>Alamat </label></td>
		<td><label>: ${alamat}</label></td>
	</tr>
	<tr>
		<td><label>Gender </label></td>
		<td><label>: ${gender}</label></td>
	</tr>
	<tr>
		<td><label>Tahun Masuk </label></td>
		<td><label>: ${tahunmasuk}</label></td>
	</tr>
	<tr>
		<td><label>Gaji </label></td> 
		<td><label>: ${gaji}</label></td>
	</tr>
	<tr>
		<td><label></label></td>
		<td align="right"><input type="submit" value="Tambah Karyawan"/></td>
	</tr>
	</table>
	</form>
	</div>
	</div>
</body>
</html>