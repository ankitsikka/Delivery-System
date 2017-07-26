<%-- 
    Document   : logout
    Created on : 23 Apr, 2017, 2:08:30 PM
    Author     : HP
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Crime Report Online</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <%response.addHeader("Cache-Control", "no-cache,no-store,private,must-revalidate,max-stale=0,post-check=0,pre-check=0"); 
   response.addHeader("Pragma", "no-cache"); 
   response.addDateHeader ("Expires", 0);%>
        <%
            session.invalidate();
            request.getSession().setAttribute("auname", null);
            request.getSession().setAttribute("cuname", null);
    Cookie mycookie=new Cookie("auname","0");
    mycookie.setMaxAge(0);
    response.addCookie(mycookie);
    Cookie mycookie2=new Cookie("cuname","0");
    mycookie2.setMaxAge(0);
    response.addCookie(mycookie2);
    
    
   

 
    
    response.sendRedirect("login.jsp");
    %>
    
    
    </body>
</html>
