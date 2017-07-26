<%-- 
    Document   : viewdetailsclient
    Created on : 15 Mar, 2017, 8:33:58 PM
    Author     : HP
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@page import="java.sql.*"%>
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
                    
                        
                        <div class ="container" >
        <h1>Report Details</h1>
        <br/>
                <br/>
        
     <%
         String url="jdbc:mysql://localhost/crimefiledb";                  
                  String username2="root";
                  String password2="";
                 String fir= request.getParameter("id");
                 String state11="",city11="",location11="";
                 out.println("Report No. : "+fir+"<br><br/>");
                  
                 
              try
              {
                  Connection myconnection;
                      Class.forName("com.mysql.jdbc.Driver");
                      myconnection=DriverManager.getConnection(url, username2, password2);
                  try
                  {    
                      String q11="select * from adminlogin where username=?";
                      PreparedStatement mystatement11=myconnection.prepareStatement(q11);
                       mystatement11.setString(1, String.valueOf(session.getAttribute("auname")));
                      ResultSet myresult11=mystatement11.executeQuery();
                      
                      if(myresult11.next())
                      {
           
                      
                     
                                     state11= myresult11.getString("state");
                                     city11= myresult11.getString("city");
                                     location11= myresult11.getString("pdivno");
         
                                         
                      }
                      
                      String q="select * from complaintform where state=? and city=? and pdivno=? ";
                      PreparedStatement mystatement=myconnection.prepareStatement(q);
                       
                       mystatement.setString(1, state11);
                       mystatement.setString(2, city11);
                       mystatement.setString(3, location11);
                      ResultSet myresult=mystatement.executeQuery();
                      
                       
                      if(myresult.next())
                      {
                           
                           out.println("Name : "+myresult.getString("name")+"<br><br/>");
                           out.println("Phone : "+myresult.getString("phone")+"<br><br/>");
                           String q2="select * from statetable where stateid=?";
                      PreparedStatement mystatement2=myconnection.prepareStatement(q2);
                       mystatement2.setString(1, myresult.getString("state"));
                      ResultSet myresult2=mystatement2.executeQuery();
                      
                       
                      if(myresult2.next()){out.println("State : "+myresult2.getString("statename")+"<br><br/>");}
                      String q3="select * from citytable where stateid=? and  cityid=?";
                      PreparedStatement mystatement3=myconnection.prepareStatement(q3);
                       mystatement3.setString(1, myresult.getString("state"));
                       mystatement3.setString(2, myresult.getString("city"));
                      ResultSet myresult3=mystatement3.executeQuery();
                      
                       
                      if(myresult3.next()){out.println("City : "+myresult3.getString("cityname")+"<br><br/>");}
                     
                    
                           String q4="select * from addlocation where stateid=? AND  cityid=? AND locationid=?";
                      PreparedStatement mystatement4=myconnection.prepareStatement(q4);
                       mystatement4.setString(1, myresult.getString("state"));
                       mystatement4.setString(2, myresult.getString("city"));
                        mystatement4.setString(3, myresult.getString("pdivno"));
                      ResultSet myresult4=mystatement4.executeQuery();
                      
                       
                      if(myresult4.next()){out.println("Division Name : "+myresult4.getString("pname")+"<br><br/>");}
                    
                          
                          
                           out.println("Email ID : "+myresult.getString("email")+"<br><br/>");
                           out.println("Identity Proof : "+myresult.getString("idproof")+"<br><br/>");
                           out.println("ID Number : "+myresult.getString("idno")+"<br><br/>");
                           out.println("Complaint Details : "+myresult.getString("cdetails")+"<br><br/>");
                           out.println("Complainant Name : "+myresult.getString("cname")+"<br><br/>");
                           out.println("Complainant Father's Name : "+myresult.getString("cfname")+"<br><br/>");
                           out.println("Complainant Phone : "+myresult.getString("cphone")+"<br><br/>");
                           out.println("Complainant Address : "+myresult.getString("caddress")+"<br><br/>");
                           out.println("Accused Name : "+myresult.getString("aname")+"<br><br/>");
                           out.println("Accused Father's Name : "+myresult.getString("afname")+"<br><br/>");
                           out.println("Accused Phone : "+myresult.getString("aphone")+"<br><br/>");
                           out.println("Accused Address : "+myresult.getString("aaddress")+"<br><br/>");
                           out.println("Date of Report : "+myresult.getString("dateofreg")+"<br><br/>");
                           
                           
                           String q22="select * from statustable where firno=?";
                      PreparedStatement mystatement22=myconnection.prepareStatement(q22);
                       mystatement22.setString(1, fir);
                      ResultSet myresult22=mystatement22.executeQuery();
                      
                           
                      if(myresult22.next()){out.println("Status : "+myresult22.getString("status")+"<br><br/>");}
                      
                    
                          
                      }
                      else{
                       String q1="select * from lostfound where state=? and city=? and location=?";
                      PreparedStatement mystatement1=myconnection.prepareStatement(q1);
                     
                       mystatement1.setString(1, state11);
                       mystatement1.setString(2, city11);
                       mystatement1.setString(3, location11);
                      ResultSet myresult1=mystatement1.executeQuery();
                      if(myresult1.next())
                      {
                          out.println("Type : "+myresult1.getString("type")+"<br><br/>");
                           
                           out.println("Name : "+myresult1.getString("name")+"<br><br/>");
                           out.println("Father/Mother Name : "+myresult1.getString("fmname")+"<br><br/>");
                           out.println("Phone : "+myresult1.getString("phone")+"<br><br/>");
                            out.println("Email ID : "+myresult1.getString("email")+"<br><br/>");
                           out.println("Identity Proof : "+myresult1.getString("idproof")+"<br><br/>");
                           out.println("ID Number : "+myresult1.getString("idno")+"<br><br/>");
                           out.println("Address : "+myresult1.getString("address")+"<br><br/>");
                           out.println("Place of Loss/Found : "+myresult1.getString("place")+"<br><br/>");
                           out.println("Date of Loss/Found : "+myresult1.getString("date")+"<br><br/>");
                           out.println("Time of Loss/Found : "+myresult1.getString("time")+"<br><br/>");
                           out.println("Lost/Found Article : "+myresult1.getString("article")+"<br><br/>");
                           out.println("Description : "+myresult1.getString("description")+"<br><br/>");
                           out.println("Date of Report : "+myresult1.getString("dateofreg")+"<br><br/>");
                           
                            String q2="select * from statetable where stateid=?";
                      PreparedStatement mystatement2=myconnection.prepareStatement(q2);
                       mystatement2.setString(1, myresult1.getString("state"));
                      ResultSet myresult2=mystatement2.executeQuery();
                      
                           
                      if(myresult2.next()){out.println("State : "+myresult2.getString("statename")+"<br><br/>");}
                      String q3="select * from citytable where stateid=? and  cityid=?";
                      PreparedStatement mystatement3=myconnection.prepareStatement(q3);
                       mystatement3.setString(1, myresult1.getString("state"));
                       mystatement3.setString(2, myresult1.getString("city"));
                      ResultSet myresult3=mystatement3.executeQuery();
                      
                       
                      if(myresult3.next()){out.println("City : "+myresult3.getString("cityname")+"<br><br/>");}
                     
                    
                           String q4="select * from addlocation where stateid=? AND  cityid=? AND locationid=?";
                      PreparedStatement mystatement4=myconnection.prepareStatement(q4);
                       mystatement4.setString(1, myresult1.getString("state"));
                       mystatement4.setString(2, myresult1.getString("city"));
                        mystatement4.setString(3, myresult1.getString("location"));
                      ResultSet myresult4=mystatement4.executeQuery();
                      
                       
                      if(myresult4.next()){out.println("Division Name : "+myresult4.getString("pname")+"<br><br/>");}
                      
                      String q22="select * from statustable where firno=?";
                      PreparedStatement mystatement22=myconnection.prepareStatement(q22);
                       mystatement22.setString(1, fir);
                      ResultSet myresult22=mystatement22.executeQuery();
                      
                           
                      if(myresult22.next()){out.println("Status : "+myresult22.getString("status")+"<br><br/>");}
                      
                    
                      }
                      else
                      {
                          
                          out.println("No Details found");
                          
                          
                      }}
                     
                  }
                  catch(Exception e)
                  {
                      out.println("Error in query " + e.getMessage());
                  }
                  finally
                  {
                      myconnection.close();
                  }
                  
              }
              catch(Exception e)
              {
                  out.println("Error in connection " + e.getMessage());
              }
              

              
          
          
                                                                    
                                                                    
                                                                    
                                                                    
                                                                    
                                                                    
                                                                    
                                                                    
                                                                    
                                                                    
                                                                    
                                                                    
                                                                    %>
                                                                     </div>
                                                <br/>
                                                <br/>
                                                <br/>
<form name="form1" id="form1" method="post" action="">
          <table width="915"  cellpadding="5">
            
            <tr>
              <td height="131"> &nbsp;Status</td>
              <td><label for="status"></label>
              &nbsp;&nbsp&nbsp;&nbsp&nbsp;&nbsp<textarea name="status" cols="100" rows="22" id="status" required></textarea></td>
            </tr>
            <tr>
              <td height="76">&nbsp;</td>
              <td align="center"><input type="submit" name="Submit" id="Submit" value="Submit">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
               
<input name="reset" type="reset" id="reset" value="Reset"></td>
            </tr>
            <tr>
              <td height="76">&nbsp;</td>
              <td><%
                  if(request.getParameter("Submit")!= null)
                  {
                      
        
  try
                  {
                       Connection myconnection;
                      Class.forName("com.mysql.jdbc.Driver");
                      myconnection=DriverManager.getConnection(url, username2, password2);
                      try
                      {
                          String q="INSERT INTO `statustable`(`firno`, `status`) VALUES (?,?)";
                           PreparedStatement mystatement=myconnection.prepareStatement(q);
                          mystatement.setString(1,fir) ;                      
                          mystatement.setString(2, request.getParameter("status"));                      
                          
                          if(mystatement.executeUpdate()>0)
                          {
                              out.println("Complaint Updated Successfully");
                          }
                          
                      }
                      catch(Exception e)
                      {
                          out.println("Error in updating the complaint." +e);
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
                  
                            
                            
                            
		
					
             }
            
	
                  %>&nbsp;</td>
            </tr>
          </table>
    </form>
            
            <script src="js/jquery-1.11.1.js" type="text/javascript"></script>
       <script src="js/jquery.validate.js"></script>
        <script type="text/javascript">
           
        $(document).ready(function(){
             $("#form1").validate();
            
                      	                        
              
                
            });    
                        <%@include file="footer.jsp" %>
</div> 
</body>
</html>
