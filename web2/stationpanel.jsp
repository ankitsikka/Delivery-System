<%-- 
    Document   : clientpanel
    Created on : 4 Jan, 2017, 5:24:26 PM
    Author     : HP
--%>
<%@page import="java.sql.*"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Crime Report Online</title>
    </head>
    <body>
        
      <%@include file="header.jsp" %>
        <br/>
            <br/>
                <br/>
                    <br/>
                        
                        <div class ="container" >
    <h1> Welcome <% 
                   out.println(String.valueOf(session.getAttribute("auname")));
	%>
	</h1>
    <p>&nbsp;</p>
    <p>&nbsp;</p>
    <table width="948"  cellpadding="5">
      <tr>
        <td width="220" align ="center"><a href="viewcomplaintspolice.jsp"><img src="images/viewcomplaint.jpeg" width="100" height="100" alt="view complaint"></a></td>
        <td width="220"  align ="center"><a href="statusupdate.jsp"><img src="images/addcomplaint.jpeg" width="100" height="100" alt="Add Complaint"></a></td>
        <td width="228" align ="center"><a href="changepass.jsp"><img src="images/change password.jpeg" width="100" height="100" alt="change password"></a></td>
      </tr>
      <tr>
        <td align ="center"><p>&nbsp;</p>
        <p><a href="viewcomplaintspolice.jsp">View Filed Compalints</a></p></td>
        <td align ="center"> <p>&nbsp;</p>
        <p><a href="statusupdate.jsp">Update Complaint Status</a></p></td>
        <td align ="center"><p>&nbsp;</p>
        <p><a href="changepass.jsp">Change Password</a></p></td>
      </tr>
    </table>
    <p>&nbsp;</p>
     </div>
                                                <br/>
                                                <br/>
                                                <br/>

                        <%@include file="footer.jsp" %>
    </body>
</html>
