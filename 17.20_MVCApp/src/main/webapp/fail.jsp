<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Fail</title>
</head>
<body>

 <h1>Failed to Register</h1>
 <h1><% String  name = (String)session.getAttribute("name"); %></h1>
  <h2> Hey <%=name %> you have failed to registered to this app </h2>

</body>
</html>