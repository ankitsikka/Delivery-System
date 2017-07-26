<%@page import="java.sql.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
        <title>Crime Report Online</title>
    </head>

    <body>
        <%@include file="headerlogin.jsp" %>
        <br/>
            <br/>
                <br/>
                    <br/>
                        
                        <div class ="container" >
                            <form id="form1" name="form1" method="post" action="">
                           
                                <table width="330"  cellspacing="5" cellpadding="5">
                                    <tr>
                                        <td width="145">Username</td>
                                        <td width="144">
                                            <label for="username"></label>
                                            <input type="text" name="username" id="username" />
                                        </td>
                                    </tr>
                                    <tr>
                                      <td colspan="2" align="center">&nbsp;</td>
                                    </tr>
                                    <tr>
                                        <td>Password</td>
                                        <td> <input type="Password" name="password" id="password" /></td>
                                    </tr>
                                    <tr>
                                      <td colspan="2" align="center">&nbsp;</td>
                                    </tr>
                                    <tr>
                                        <td colspan="2" align="center">
                                            &nbsp;&nbsp;&nbsp;<input type="checkbox" name="rememberme" id="rememberme" />
                                            <label for="rememberme">Remember Me</label>
                                        </td>
                                    </tr>
                                    <tr>
                                      <td colspan="2" align="center">&nbsp;</td>
                                    </tr>
                                    <tr>
                                        <td colspan="2" align="center">
                                            <input type="submit" name="login" value ="Login" id="login" />

                                        </td>
                                    </tr>
                                    <tr>
                                        <td colspan="2" align="center">
                                                <%  
                                                    String url = "jdbc:mysql://localhost/crimefiledb";
                                                    String username2 = "root";
                                                    String password2 = "";
                                                    if (request.getParameter("login") != null) {
                                                        try {
                                                            Connection myconnection;
                                                            Class.forName("com.mysql.jdbc.Driver");
                                                            myconnection = DriverManager.getConnection(url, username2, password2);
                                                            try {
                                                                String query = "select* from adminlogin WHERE USERNAME=? AND PASSWORD=? ";
                                                                PreparedStatement mystatement = myconnection.prepareStatement(query);
                                                               mystatement.setString(1, request.getParameter("username"));
                                                                mystatement.setString(2, request.getParameter("password"));
                                                                ResultSet myres = mystatement.executeQuery();
                                                                
                                                                

                                                                query = "select* from signup WHERE USERNAME=? AND PASSWORD=? ";
                                                                mystatement = myconnection.prepareStatement(query);
                                                                mystatement.setString(1, request.getParameter("username"));
                                                                mystatement.setString(2, request.getParameter("password"));
                                                                ResultSet myres1 = mystatement.executeQuery();

                                                                if (myres.next()) {
                                                                    if (request.getParameter("rememberme") != null) {
                                                                        
                                                                            Cookie mycookie = new Cookie("auname", myres.getString("username"));
                                                                            mycookie.setMaxAge(60 * 60 * 24 * 31);
                                                                            response.addCookie(mycookie);
                                                                        }
                                                                            
                                                                        session.setAttribute("auname", myres.getString("username"));
                                                                        session.setAttribute("apassword", myres.getString("password"));
                                                                        if(request.getParameter("username").equals("admin")){
                                                                        RequestDispatcher mydispatcher = request.getRequestDispatcher("adminpanel.jsp");
                                                                        mydispatcher.forward(request, response);}
                                                                        else{ RequestDispatcher mydispatcher = request.getRequestDispatcher("stationpanel.jsp");
                                                                        mydispatcher.forward(request, response);}
                                                                    }
                                                                 
                                                                 
                                                                else if (myres1.next()) {
                                                                        if (request.getParameter("rememberme") != null) {
                                                                          
                                                                                Cookie mycookie = new Cookie("cuname", myres1.getString("username"));
                                                                                mycookie.setMaxAge(60 * 60 * 24 * 31);
                                                                                response.addCookie(mycookie);
                                                                            }
                                                                             
                                                                            session.setAttribute("cuname", myres1.getString("username"));
                                                                            session.setAttribute("cpassword", myres1.getString("password"));
                                                                            RequestDispatcher mydispatcher = request.getRequestDispatcher("clientpanel.jsp");
                                                                            mydispatcher.forward(request, response);
                                                                        } 
                                                                    
                                                                        else {
                                                                            out.println("Wrong Username/Password");
                                                                            }
                                                                    
                                                                
                                                            } catch (Exception e) {
                                                                out.print("Error:" + e.getMessage());
                                                            } finally {
                                                                myconnection.close();
                                                            }
                                                        } catch (Exception e) {
                                                            out.print( "Connection Error:" + e.getMessage());
                                                        }
                                                    }
                                                        %>
                                        </td>
                                    </tr>
                                    
                                </table>
                        </form>
                        </div>
                                                <br/>
                                                <br/>
                                                <br/>

                        <%@include file="footer.jsp" %>
                        </body>
                        </html>
