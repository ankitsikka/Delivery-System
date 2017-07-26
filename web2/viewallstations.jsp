
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


                                            
                                            <h1> List Of Police Divisions</h1>
                                            <br/><br/>
                                                <%
         String url="jdbc:mysql://localhost/crimefiledb";                  
                  String username2="root";
                  String password2="";
                  int counter=1;
                  String fir,statename11="",cityname11="";
                 
              try
              {
                  Connection myconnection;
                      Class.forName("com.mysql.jdbc.Driver");
                      myconnection=DriverManager.getConnection(url, username2, password2);
                  try
                  {
                      String q="select * from addlocation ";
                      PreparedStatement mystatement=myconnection.prepareStatement(q);
                       
                      ResultSet myresult=mystatement.executeQuery();
                       out.println("<td >" +"S.No."+"  &nbsp&nbsp" +"State"+"    &nbsp&nbsp&nbsp&nbsp&nbsp" + "City"+"    &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp"
                    + "Division Number" + "    &nbsp&nbsp&nbspSHO Name" + "    &nbsp&nbsp&nbspAddress" +"    &nbsp&nbsp&nbsp&nbsp&nbsp&nbspPhone" +"</td>");
                       out.println("</tr><tr>");
                       out.println("<table width=100% class='table' align='center' >");
                       
                       out.println("<tr>");
                      if(myresult.next())
                      {
           
                      
                      do
                      {
                                    
                     String q2="select * from statetable where stateid=?";
                      PreparedStatement mystatement2=myconnection.prepareStatement(q2);
                       mystatement2.setString(1, myresult.getString("stateid"));
                      ResultSet myresult2=mystatement2.executeQuery();
                      if(myresult2.next()){statename11=myresult2.getString("statename");}
                           
                      
                      String q3="select * from citytable where stateid=? and  cityid=?";
                      PreparedStatement mystatement3=myconnection.prepareStatement(q3);
                       mystatement3.setString(1, myresult.getString("stateid"));
                       mystatement3.setString(2, myresult.getString("cityid"));
                      ResultSet myresult3=mystatement3.executeQuery();
                      
                      
                       if(myresult3.next()){cityname11=myresult3.getString("cityname");}
                      
                     
                    
                           
         
                                    
            out.println("<td >" +counter+".  &nbsp&nbsp&nbsp&nbsp&nbsp" +statename11+"   &nbsp&nbsp&nbsp&nbsp" + cityname11+"    &nbsp&nbsp&nbsp&nbsp&nbsp"
                    + myresult.getString("pname") + "    &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp" + myresult.getString("shoname")+"&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp"+ myresult.getString("address")+ "    &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp"+myresult.getString("phone")+"</td>");
                            counter++;
                    
                          
                              out.println("</tr><tr>");
                          
                           
                          }
                          while(myresult.next());
                          out.println("</table>");
                      }
                      
                    
                          
                      else
                      {
                          
                          out.println("<td>No Police Division found</td>");
                          
                          
                      }

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
                                            
                                            
				
<h2>&nbsp;</h2>
<p>&nbsp;</p>
  </div>
                                                <br/>
                                                <br/>
                                                <br/>

                        <%@include file="footer.jsp" %>
</body>
</html>