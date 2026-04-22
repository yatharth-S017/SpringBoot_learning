<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP WEB APP</title>
</head>
<body>
   <h1>JSP web app to generate dynamic Response</h1>
   
   
   <!-- this is directive tag, in which we can import package and other thing -->
   <%@
     page import = "java.util.Date"
   %>
   
    <!-- this is decleartion tag-->
    <!-- in this we can write method, varible declartion  -->
   <%!
     int age = 16;
   %>
   
   
   
   <% 
     
     //whatever we write in this tag, it is considered as body of service method
	    String name = request.getParameter("uname");
		String city = request.getParameter("ucity");
		
	
		//out is reference of printwrite
		out.println("Hello " + name);
		out.println("I know you're from " + city);
		
	    out.println("\n");
		
	Date date = new Date();
    out.println(date);
		
   
   %>
   
   
   <!-- this is expression tag -->
  <h1> <%= date %> </h1> 
  <h2> <%= city %> </h2>
  <h2> Hello I know your age is  <%= age %> </h2>
   
   

</body>
</html>