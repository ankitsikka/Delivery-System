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
                    String url="jdbc:mysql://localhost/crimefiledb";                  
                  String username2="root";
                  String password2="";
                  
                    
        
                                                         try {
                                                            Connection myconnection;
                                                            Class.forName("com.mysql.jdbc.Driver");
                                                            myconnection = DriverManager.getConnection(url, username2, password2);
                                                            try {
                                                                String query = "select* from signup WHERE USERNAME=?  ";
                                                                PreparedStatement mystatement = myconnection.prepareStatement(query);
                                                                mystatement.setString(1,String.valueOf(session.getAttribute("cuname")));
                                                                ResultSet myres = mystatement.executeQuery();
                                                                    if (myres.next()) {
                                                                    
                                                                             out.println(myres.getString("name"));
                                                                      
                                                                    }
                                                                    
                                                            }catch (Exception e) {
                                                                out.print("Error:" + e.getMessage());
                                                            } finally {
                                                                myconnection.close();
                                                            }
                                                        } catch (Exception e) {
                                                            out.print( "Connection Error:" + e.getMessage());
                                                        }
	%>
	</h1>
    <p>&nbsp;</p>
    <p>&nbsp;</p>
    <table width="948"  cellpadding="5">
      <tr>
        <td width="220" align ="center"><a href="whichcomplaint.jsp"><img src="images/addcomplaint.jpeg" width="100" height="100" alt="Add Complaint"></a></td>
        <td width="220" align ="center"><a href="viewcomplaints.jsp"><img src="images/viewcomplaint.jpeg" width="100" height="100" alt="view complaint"></a></td>
        <td width="220"  align ="center"><a href="changepersonalinfo.jsp"><img src="images/edit-user.png" width="100" height="100" alt="edit info"></a></td>
        <td width="228" align ="center"><a href="changepass.jsp"><img src="images/change password.jpeg" width="100" height="100" alt="change password"></a></td>
      </tr>
      <tr>
        <td align ="center"><p>&nbsp;</p>
        <p><a href="whichcomplaint.jsp">File  New Complaint</a></p></td>
        <td align ="center"><p>&nbsp;</p>
        <p><a href="viewcomplaints.jsp">View Filed Compalints</a></p></td>
        <td align ="center"> <p>&nbsp;</p>
        <p><a href="changepersonalinfo.jsp">Change Personal Information</a></p></td>
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
