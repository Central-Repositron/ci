<%-- 
    Document   : errorPage
    Created on : Mar 11, 2009, 3:46:52 AM
    Author     : SAYANTAN
--%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    errorPage="errorPage.jsp" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<meta name="author" content="sayantan" />
		<title>Application Error</title>
		<script language="javascript">
		  function toggleDiv(divid){
		    if(document.getElementById(divid).style.display == 'none'){
		      document.getElementById(divid).style.display = 'block';
		    }else{
		      document.getElementById(divid).style.display = 'none';
		    }
		  }
		</script>
	</head>
	<body>
		<br><br><br><br>
		<div align="center">
			<fieldset style="width: 70%">
				<div style="color:red; font-family:Verdana; font-weight:bold; font-variant:small-caps; font-size:1.2em">
					<marquee>Oops! An Error has occured!</marquee>
				</div>
				<br>
				<%--<div style="color:white; background:blue; font-family:Verdana; font-weight:bold; font-size:1.2em">
					<s:property value="exception"/>
				</div>--%>
				<div style="text-align:right;font-family:sans; color: white; font-weight:normal; font-size:0.7em">
						<a href="javascript:;" onmousedown="toggleDiv('mydiv');" shape="circle">View Complete Report</a>
				</div>
				<br>
				<div id="mydiv" style="display: none;"> 
					<textarea cols="100%" rows="10" readonly="readonly" style="font: x-small; font-family: sans-serif;">
						<s:property value="exceptionStack"/>
						<s:property value="runtime.message"/>
	    				<s:property value="exception.message"/>
					</textarea>
				</div>
			</fieldset>
		</div>
	</body>
</html>