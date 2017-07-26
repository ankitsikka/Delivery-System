<%-- 
    Document   : changepass_client.jsp
    Created on : 18 Mar, 2017, 3:05:12 PM
    Author     : sparsh
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
        <br>
        <div class="container">
            <div class="jumbotron">
                <h2>Change Password</h2> 
                <p></p> 
            </div>

            <form action="" method="post" name="change_pass">
                <table width="533" border="0" cellspacing="5" cellpadding="5">
                    <caption>
                        Change Password
                    </caption>
                    <tr>
                        <td width="254">Current password</td>
                        <td width="238"><input type="Password" name="password_curr" id="password_curr" /></td>
                    </tr>
                    <tr>
                        <td>&nbsp;</td>
                        <td>&nbsp;</td>
                    </tr>

                    <tr>
                        <td>New password</td>
                        <td><input type="Password" name="password_new" id="password_new" /></td>
                    </tr>
                    <tr>
                        <td>&nbsp;</td>
                        <td>&nbsp;</td>
                    </tr>

                    <tr>
                        <td>Retype New  password</td>
                        <td><input type="Password" name="password_renew" id="password_renew" /></td>
                    </tr>
                    <tr>
                        <td>&nbsp;</td>
                        <td>&nbsp;</td>
                    </tr>
                    <tr>
                        <td colspan="2" align="center">
                            <input type="submit" name="Change_Passsword" value ="Change Passsword" id="Change_Passsword" />

                        </td>
                    </tr>
                    <tr>
                        <td>&nbsp;</td>
                        <td>&nbsp;</td>
                    </tr>
                    <tr>
                        <td colspan="2" align="center">
                            <div id ="message"> </div>

                    
               
        <%   
            if(request.getParameter("Change_Passsword")!=null){
            String url = "jdbc:mysql://localhost/crimefiledb";
                String username2 = "root";
                String password2 = "";
                String pass_new="",pass_renew ="";
                if (request.getParameter("password_curr") != "") {
                    pass_new =   String.valueOf(request.getParameter("password_new"));
                    pass_renew = String.valueOf(request.getParameter("password_renew"));
                          //  out.println(pass_new + "   " + pass_renew);
                    if (pass_new.equals(pass_renew)) {
                        try {
                            Connection myconnection;
                            Class.forName("com.mysql.jdbc.Driver");
                            myconnection = DriverManager.getConnection(url, username2, password2);
                            try {
                                String query = "select* from adminlogin WHERE USERNAME=? AND PASSWORD=? ";
                                PreparedStatement mystatement = myconnection.prepareStatement(query);
                                mystatement.setString(1, String.valueOf(session.getAttribute("auname")));
                                mystatement.setString(2, request.getParameter("password_curr"));
                                ResultSet myres = mystatement.executeQuery();

                                query = "select* from signup WHERE USERNAME=? AND PASSWORD=? ";
                                mystatement = myconnection.prepareStatement(query);
                                mystatement.setString(1, String.valueOf(session.getAttribute("cuname")));
                                mystatement.setString(2, request.getParameter("password_curr"));
                                ResultSet myres1 = mystatement.executeQuery();

                                if (myres.next()) {
                                     query = " UPDATE `adminlogin` SET `password`= ? WHERE username = ? ";
                                mystatement = myconnection.prepareStatement(query);
                                mystatement.setString(1, request.getParameter("password_new"));
                                mystatement.setString(2, String.valueOf(session.getAttribute("auname")));
                                 mystatement.executeUpdate();
                                   out.println("Password changed Succesfully");
                                } else if (myres1.next()) {
                                     query = " UPDATE `signup` SET `password`= ? WHERE username = ? ";
                                mystatement = myconnection.prepareStatement(query);
                                mystatement.setString(1, request.getParameter("password_new"));
                                mystatement.setString(2, String.valueOf(session.getAttribute("cuname")));
                                 mystatement.executeUpdate();%>
                                 
                                 <script type="text/javascript">
                                      
                    $("#message").fadeIn(1000).html("Password changed Succesfully.").delay(2000).fadeOut(1000);
                </script>
                                    <%
                                }
                                
                                 else {%>
                                 <script type="text/javascript">
                                      
                    $("#message").fadeIn(1000).html("Wrong Password.").delay(2000).fadeOut(1000);
                
               </script>
                                    <%
                                }

                            } catch (Exception e) {
                                out.print("Error:" + e.getMessage());
                            } finally {
                                myconnection.close();
                            }
                        } catch (Exception e) {
                            out.print("Connection Error:" + e.getMessage());
                        }
                    }
                    else{%>
                     <script src="js/jquery-1.11.3.js" type="text/javascript"></script>
        <script src="js/jquery.validate.js"></script>
                <script type="text/javascript">
                    
                    $("#message").fadeIn(1000).html("The new and retyped passwords do not match. Please retype the passwords").delay(2000).fadeOut(1000);
                
               </script>
               
               <%}
                   
            }
                else{ %>
                <script type="text/javascript">
                        
                    $("#message").fadeIn(1000).html("Please enter the current password first.").delay(2000).fadeOut(1000);
                </script>
               
               <%}}


        %>
            </td>
                    </tr>
         </table>
            </form>
        </div>
        <%@include file="footer.jsp" %>

    </body>
</html>
