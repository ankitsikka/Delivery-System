
<%@page import="java.sql.*"%>
<html>
<head>

<title>Crime Report Online</title>

</head>

<body>
    
<%@include file="header.jsp" %>
        <br/>
            <br/>
                <br/>
                    <br/>
                        
                        <div class ="container" >


                                            
                                            <h1> List Of Complaints</h1>
                                            <br/><br/>
                                                <%
         String url="jdbc:mysql://localhost/crimefiledb";                  
                  String username2="root";
                  String password2="";
                  int counter=1;
                  String fir;
                  String state11="",city11="",location11="";
                 
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
                      
                      String q="select * from complaintform where state=? and city=? and pdivno=?";
                      PreparedStatement mystatement=myconnection.prepareStatement(q);
                       mystatement.setString(1, state11);
                       mystatement.setString(2, city11);
                       mystatement.setString(3, location11);
                      ResultSet myresult=mystatement.executeQuery();
                       out.println("<table width=100% class='table' align='center' >");
                       out.println("<tr><td >" +"S.No."+"</td>"+"<td>" +"Complaint No."+"</td>" +"<td>"+ "Name"+"</td>"
                    +"<td>"+ "Date of Complaint" +"</td>"+"<td>"+ "Type" + "</td></tr>");
                       out.println("</tr><tr>");
                      
                       
                       out.println("<tr>");
                      if(myresult.next())
                      {
           
                      
                      do
                      {
                                     fir= myresult.getString("firno");
         
                                   out.println("<td >" +counter+"</td>"+"<td>"+"<a href='viewdetailspolice.jsp?id="+fir+"'>" +myresult.getString("firno")+"</a>"+ "</td>"  +"<td>"+ myresult.getString("name")
                    +"</td>"+"<td>"+ myresult.getString("dateofreg") + "</td>"+"<td>"+"Crime" + "</td>");  
                            counter++;
                    
                          
                              out.println("</tr><tr>");
                          
                           
                          }
                          while(myresult.next());
                          
                      }
                       String q1="select * from lostfound where state=? and city=? and location=?";
                      PreparedStatement mystatement1=myconnection.prepareStatement(q1);
                     mystatement1.setString(1, state11);
                       mystatement1.setString(2, city11);
                       mystatement1.setString(3, location11);
                      ResultSet myresult1=mystatement1.executeQuery();
                      if(myresult1.next())
                      {
            
                      do
                      {
                                    fir= myresult1.getString("firno");            
            out.println("<td >" +counter+"</td>"+"<td>"+"<a href='viewdetailspolice.jsp?id="+fir+"'>" +myresult1.getString("firno")+"</a>"+ "</td>"  +"<td>"+ myresult1.getString("name")
                    +"</td>"+"<td>"+ myresult1.getString("dateofreg") + "</td>"+"<td>"+myresult1.getString("type") + "</td>");
                            counter++;
                    
                          
                              out.println("</tr><tr>");
                          
                           
                          }
                          while(myresult1.next());
                          
                      }
                      else
                      {
                          
                          out.println("<td>No complaint found</td>");
                          
                          
                      }

                  }
                  catch(Exception e)
                  {
                      out.println("Error in query " + e.getMessage());
                  }
                  finally
                  {
                     
                      out.println("</table>");myconnection.close();
                  }
                  
              }
              catch(Exception e)
              {
                  out.println("Error in connection " + e.getMessage());
              }
              

              
          
          
                                                                    
                                                                    
                                                                    
                                                                    
                                                                    
                                                                    
                                                                    
                                                                    
                                                                    
                                                                    
                                                                    
                                                                    
                                                                    %>
                                            
                                            
				
<h2>&nbsp;</h2>
<p>&nbsp;</p>
  </div>
                                                <br/>
                                                <br/>
                                                <br/>

                        <%@include file="footer.jsp" %>
</body>
</html>