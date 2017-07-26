<%@page import="java.sql.*"%>
<%
    if(request.getParameter("n")!=null)  
{
String name=request.getParameter("n");


    String url="jdbc:mysql://localhost/";
        String place="crimefiledb";
        String username1="root";
        String password1="";
              try
              { Connection myconnection;
                  Class.forName("com.mysql.jdbc.Driver");
                  myconnection=DriverManager.getConnection(url+place,username1,password1);
                  try
                  {
                      String q="select * from  signup where username=?";
                      PreparedStatement mystatement=myconnection.prepareStatement(q);
                      mystatement.setString(1, name);
                      ResultSet myresult= mystatement.executeQuery();
                      
                      
                      if(myresult.next())
                      {
                          out.println("Username not available");
                      }
                      else{
                      String q1="select * from  admintable where username=?";
                      PreparedStatement mystatement1=myconnection.prepareStatement(q1);
                      mystatement1.setString(1, name);
                      ResultSet myresult1= mystatement1.executeQuery();
                      
                      
                      if(myresult1.next())
                      {
                          out.println("Username not available");
                      }
                      else
                      {
                          out.println("Username  available");
                      }
                      
                      } 
                  }
                  catch(Exception e)
                  {
                      out.println("Error in query " + e.getMessage());
                  }
                  
                  
              }
              catch(Exception e)
              {
                  out.println("Error in connection " + e.getMessage());
              }





}
    else if(request.getParameter("stateid")!=null)
{   
    String state1id=request.getParameter("stateid");
         String url="jdbc:mysql://localhost/crimefiledb";                  
                  String username2="root";
                  String password2="";
                  
                  try
                  {
                      Connection myconnection;
                      Class.forName("com.mysql.jdbc.Driver");
                      myconnection=DriverManager.getConnection(url, username2, password2);
                      try
                      {
                          String q="select * from citytable where stateid=?";
                          PreparedStatement mystatement=myconnection.prepareStatement(q);
                          mystatement.setString(1, state1id);                      
                          
                          ResultSet myresult=mystatement.executeQuery();
                          out.println("&nbsp;<select name='city' id='city'>");
                          if(myresult.next())
                          {
                              
                              out.println("<option>Choose City Now</option>");
                              do
                              {
                                out.println("<option value=" + myresult.getString("cityid") + ">" + myresult.getString("cityname") +"</option>");
                              }
                              while(myresult.next());
                              
                          }
                          else
                          {
                              out.println("<option>No Cities added yet</option>");
                          }
                          out.println("</select>");
                      }
                      catch(Exception e)
                      {
                          out.println("error in query" + e.getMessage());
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
   else if(request.getParameter("cityid")!=null)
{   
    String city1id=request.getParameter("cityid");
    
         String url="jdbc:mysql://localhost/crimefiledb";                  
                  String username2="root";
                  String password2="";
                  
                  try
                  {
                      Connection myconnection;
                      Class.forName("com.mysql.jdbc.Driver");
                      myconnection=DriverManager.getConnection(url, username2, password2);
                      try
                      {
                          String q="select * from addlocation where cityid=?";
                          PreparedStatement mystatement=myconnection.prepareStatement(q);
                          mystatement.setString(1, city1id);                      
                          
                          ResultSet myresult=mystatement.executeQuery();
                          out.println("&nbsp;<select name='location' id='location'>");
                          if(myresult.next())
                          {
                              
                              out.println("<option>Choose Division Now</option>");
                              do
                              {
                                out.println("<option value=" + myresult.getString("locationid") + ">" + myresult.getString("pname") +"</option>");
                              }
                              while(myresult.next());
                              
                          }
                          else
                          {
                              out.println("<option>No divisions added yet</option>");
                          }
                          out.println("</select>");
                      }
                      catch(Exception e)
                      {
                          out.println("error in query" + e.getMessage());
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

%>