
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
                 
              try
              {
                  Connection myconnection;
                      Class.forName("com.mysql.jdbc.Driver");
                      myconnection=DriverManager.getConnection(url, username2, password2);
                  try
                  {
                      String q="select * from complaintform ";
                      PreparedStatement mystatement=myconnection.prepareStatement(q);
                       
                      ResultSet myresult=mystatement.executeQuery();
                       out.println("<td >" +"S.No."+"  &nbsp&nbsp" +"Complaint No."+"    &nbsp&nbsp&nbsp" + "Status"+"    &nbsp&nbsp&nbsp&nbsp&nbsp"
                    + "Date of Complaint" + "    &nbsp&nbsp&nbspType" + "</td>");
                       out.println("</tr><tr>");
                       out.println("<table width=100% class='table' align='center' >");
                       
                       out.println("<tr>");
                      if(myresult.next())
                      {
           
                      
                      do
                      {
                                     fir= myresult.getString("firno");
         
                                    
            out.println("<td >" +counter+".  &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp<a href='viewdetailsadmin.jsp?id="+fir+"'>" +myresult.getString("firno")+"</a>    &nbsp&nbsp&nbsp&nbsp" + myresult.getString("status")+"    &nbsp&nbsp&nbsp&nbsp&nbsp"
                    + myresult.getString("dateofreg") + "    &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbspCrime" + "</td>");
                            counter++;
                    
                          
                              out.println("</tr><tr>");
                          
                           
                          }
                          while(myresult.next());
                          
                      }
                       String q1="select * from lostfound ";
                      PreparedStatement mystatement1=myconnection.prepareStatement(q1);
                       
                      ResultSet myresult1=mystatement1.executeQuery();
                      if(myresult1.next())
                      {
            
                      do
                      {
                                    fir= myresult1.getString("firno");            
            out.println("<td >" +counter+".  &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp<a href='viewdetailsadmin.jsp?id="+fir+"'>" +myresult1.getString("firno")+"</a>    &nbsp&nbsp&nbsp&nbsp" + myresult1.getString("status")+"    &nbsp&nbsp&nbsp&nbsp&nbsp"
                    + myresult1.getString("dateofreg") + "    &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp"+myresult1.getString("type") + "</td>");
                            counter++;
                    
                          
                              out.println("</tr><tr>");
                          
                           
                          }
                          while(myresult1.next());
                          out.println("</table>");
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