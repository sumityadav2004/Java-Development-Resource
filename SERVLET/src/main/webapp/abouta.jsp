<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>This is the About page of servlet</title>

<link rel="stylesheet" href=" <%= application.getContextPath()  %>/css/style.css" />

</head>
<body>
    <div class="container">
    <%@include file="menu.jsp" %>
<h1>
This is the About page of servlet
</h1>
<p>this is all about the servlet</p>
</div>
 <script src="<%= application.getContextPath() %>/js/script.js"> </script>
</body>
</html>