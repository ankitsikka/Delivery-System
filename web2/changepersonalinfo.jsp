<%-- 
    Document   : changepersonalinfo
    Created on : 10 Apr, 2017, 4:33:30 PM
    Author     : sparsh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.io.File"%>
<%@page import="java.sql.*"%>

<%@page import="java.util.*"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Change Personal Info</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <style type="text/css">
             body {
	margin-bottom: 2cm;
	margin-left: 2cm;
}
    </style>
    </head>
    <body>
        
        <%@include file="header.jsp" %>
        <div class ="container" >
        <% 
            String url="jdbc:mysql://localhost/crimefiledb";                  
                  String username2="root";
                  String password2="";
                  
            if(request.getParameter("Update") != null) {
               
                  try
                  {
                      Connection myconnection1;
                      Class.forName("com.mysql.jdbc.Driver");
                      myconnection1=DriverManager.getConnection(url, username2, password2);
                      try
                      {
                          String q1="update signup set name=?,address=?,phone=?,gender=?"+"where username=?";
                          PreparedStatement mystatement1=myconnection1.prepareStatement(q1);
                          mystatement1.setString(1, (request.getParameter("name")));                      
                          mystatement1.setString(2, request.getParameter("address"));                      
                          mystatement1.setString(3, (request.getParameter("phone")));                      
                          mystatement1.setString(4, (request.getParameter("gender")));                      
                         mystatement1.setString(5, String.valueOf(session.getAttribute("cuname")));  
                            // mystatement1.setString(5, String.valueOf(session.getAttribute("cuname"))); 
                          if(mystatement1.executeUpdate()>0)
                          {
                              out.println("Update Successful");
                          }
                          
                      }
                      catch(Exception e)
                      {
                          out.println("Wrong Username" );
                      }
                      finally
                      {
                          myconnection1.close();
                      }
                  }
                  catch(Exception e)
                  {
                      out.println("Error in Connection " + e.getMessage());
                  }
                  
                            
              }
                            
			
              %>
        
        <% 
        
        
                  String name="",address = "",phone = "",gender= "";
                  try
                  {
                      Connection myconnection;
                      Class.forName("com.mysql.jdbc.Driver");
                      myconnection=DriverManager.getConnection(url, username2, password2);
                      try
                      {
                          String q="select *  from signup where username = ?";
                          PreparedStatement mystatement=myconnection.prepareStatement(q);
                          mystatement.setString(1, String.valueOf(session.getAttribute("cuname")));                      
                           //mystatement.setString(1, "ankit1");                      
                          ResultSet myres = mystatement.executeQuery();
                          if(myres.next())
                          {
                              name= myres.getString("name");
                              address= myres.getString("address");
                              phone= myres.getString("phone");
                              gender= myres.getString("gender");
                               
                              %>
                             
                               
         <div class="container">
              <div class="container">
            <div class="jumbotron">
                <h2>Change personal details</h2> 
                <p></p> 
            </div>
         <br>
    <form  method="get" name="form1" id="form1" action="" >
        <br>
        <br>
        
      <table width="687" border="0" cellspacing="10" cellpadding="5">
          
          
        <tr>
          <td>Name</td>
          <td colspan="2"><label for="name"></label>
              <input type="text" name="name" id="name" value = <%= name%> required></td>
        </tr>
        <tr><p></p></tr><tr><p></p></tr><tr><p></p></tr>
        <tr>
          <td>Address</td>
          <td colspan="2"><label for="address"></label>
          <textarea name="address" id="address"  required><%= address%></textarea></td>
        </tr>
        <tr><p></p></tr>
        <tr>
          <td>Phone</td>
          <td colspan="2"><label for="phone"></label>
          <input type="text" name="phone" id="phone" required value = <%= phone%> onKeyPress="return abc(event)" maxlength="10"></td>
        </tr><tr><p></p></tr>
 <% if(gender.equals("male")) { %>
        <tr>
          <td>Gender</td>
          <td colspan="2"><p>
            <label>
              <input type="radio" name="gender" value="male" id="gender_0" checked required>
              Male</label>
            <label>
              <input type="radio" name="gender" value="female" id="gender_1">
              Female</label>
<br>
          </p></td>
        </tr>
        <% } else { %>
        <tr>
          <td>Gender</td>
          <td colspan="2"><p>
            <label>
              <input type="radio" name="gender" value="male" id="gender_0" >
              Male</label>
            <label>
              <input type="radio" name="gender" value="female" id="gender_1" checked required >
              Female</label>
<br>
          </p></td>
        </tr><% } %>
        <tr><p></p></tr>
                             
                         <% }
                    }
                      catch(Exception e)
                      {
                          out.println("Wrong Username" );
                      }
                      finally
                      {
                          myconnection.close();
                      }
                  }
                  catch(Exception e)
                  {
                      out.println("Error in Connection " + e.getMessage());
                  }
                  

                            
                            
			     
        %>
        
        
       <tr><p></p></tr>
        <tr>
          <td>&nbsp;</td>
          <td colspan="2"><input type="submit" name="Update" id="Update" value="Update" >
          <input type="reset" name="Reset" id="Reset" value="Reset"></td>
        </tr><tr><p></p></tr>
        <tr>
          <td>&nbsp;</td>
          <td colspan="2">
              
              
              </td>
        </tr>
      </table>
        </form>
    

        
        <script src="js/jquery-1.11.1.js" type="text/javascript"></script>
        <script src="js/jquery.validate.js"></script>
        <script type="text/javascript">
             function abc(evt)
       {
	   	
          var charCode = (evt.which) ? evt.which : event.keyCode;
		   if (charCode >= 48 && charCode<=57 || charCode==8)
             return true;

          return false; 
          
       }
            
        </script>
        </div>
         </div>
           <%@include file="footer.jsp" %>
    </body>
</html>
