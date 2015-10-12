<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="author" content="sayantan" />
<title>Welcome to Project Moonshine</title>
<script
	src="http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js"></script>
<link rel="stylesheet"
	href="http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap-theme.min.css">
<link rel="stylesheet" href="opt/css/bootStyle.css" />
<script
	src="http://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
<script
	src="https://ajax.googleapis.com/ajax/libs/angularjs/1.2.21/angular.min.js"></script>
<script src="opt/js/bootScript.js"></script>
<style type="text/css">

</style>
</head>
<body>
	<nav>
		<h6 align="right">
			<s:a href="?request_locale=en">English</s:a>
			<s:a href="?request_locale=es">Espanol</s:a>
			<s:a href="?request_locale=de">Deutsch</s:a>
		</h6>
	</nav>
	<section class="headMenu">
		<div id="loginDetails" align="right" style="font-size: 0.7em;">
			<s:if test="#session['emailId'] != null">
				<s:url var="logout" action="logout" />
				<s:a accesskey="lll" href="logout">Logout</s:a>
			</s:if>
			<s:else>
				<s:url id="register" action="fwd_index_register" />
				<s:a href="%{register}">Register</s:a>
			</s:else>
			<s:property value="#session.FName" />
			<s:property value="#session.LName" />
			&nbsp;&nbsp;<br>
			<s:property value="#session.emailId" />
			&nbsp;&nbsp;<br>
			<s:property value="#session.location" />
			&nbsp;&nbsp;<br>
		</div>
	</section>
</body>
</html>