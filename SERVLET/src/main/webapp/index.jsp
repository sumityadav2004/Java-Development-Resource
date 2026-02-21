<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Welcome to sumit WEB PAGE</title>

<!-- yaha pe me css ko add kar raha hu -->
  <link rel="stylesheet" href=" <%= application.getContextPath()  %>/css/style.css" />

</head>
<body>
    <div class="container">  
    <%@include file="menu.jsp" %>
    <h1>
    welcome to servlet chapter  
    </h1> 
    <p>this is my first servlet</p>
    
    <form action="<%= application.getContextPath() %>/third" method="post" >
    <input name="message" type="text" placeholder="enter the text here"/>
    <button type="submit">Submit </button>
    
        </form>
        
</div> 
<script src="<%= application.getContextPath() %>/js/script.js"> </script>
</body>
</html> 