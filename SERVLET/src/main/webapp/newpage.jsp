<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Welcome to sumit WEB SECONDPAGE</title>

<link rel="stylesheet" href=" <%= application.getContextPath()  %>/css/style.css" />

</head>
<body>
    <div class="container">
    
    <%@include file="menu.jsp" %>
    <h1>
    welcome to servlet chapter 2
    </h1>
    <p>this is my first servlet page2</p>
    </div>
     <script src="<%= application.getContextPath() %>/js/script.js"> </script>  
</body>
</html>