<%-- 
    Document   : lostfound
    Created on : 14 Mar, 2017, 1:49:22 PM
    Author     : HP
--%>

<%@page import="java.text.SimpleDateFormat"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.io.File"%>
<%@page import="java.sql.*"%>
<%@page import="org.apache.commons.fileupload.FileUploadException"%>
<%@page import="org.apache.commons.fileupload.disk.DiskFileItemFactory"%>
<%@page import="org.apache.commons.fileupload.FileItemFactory"%>
<%@page import="org.apache.commons.fileupload.FileItem"%>
<%@page import="org.apache.commons.fileupload.servlet.ServletFileUpload"%>
<%@page import="java.util.*"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Crime Report Online</title>
    </head>
    <body>
         <%@include file="header.jsp" %>
	<div class ="container" >
      <form name="form1" id="form1" method="post" action="">
          <h1>Lost And Found Report</h1>
          <p>&nbsp;</p>
        <p>Type(Lost/Found)&nbsp;
          <label for="type"></label>
           <input type="text" name="type" id="type" required>
            </p>
        <p>&nbsp;</p>
          <table width="891"  cellspacing="5" cellpadding="5">
            <tr>
              <td> <p>Name</p>
              <p>
                <label for="name"></label>
                <input type="text" name="name" id="name" required>
              </p>
              <p>&nbsp;</p></td>
              <td><p>Father's/Mother's Name</p>
              <p>
                <label for="fmname"></label>
                <input type="text" name="fmname" id="fmname" required>
              </p>
              <p>&nbsp;</p></td>
            </tr>
            <tr>
              <td> <p>Address</p>
              <p>
                <label for="address"></label>
                <input type="text" name="address" id="address" required>
              </p>
              <p>&nbsp;</p></td>
              <td><p>Mobile No.</p>
              <p>
                <label for="phone"></label>
                <input type="text" name="phone" id="phone" required onKeyPress="return abc(event)" maxlength="10">
              </p>
              <p>&nbsp;</p></td>
            </tr>
            <tr>
              <td> <p>Email ID</p>
              <p>
                <label for="email"></label>
                <input type="text" name="email" id="email" required>
              </p>
              <p>&nbsp;</p></td>
              <td><p>Place of Loss/Found </p>
              <p>
                <label for="place"></label>
                <input type="text" name="place" id="place" required>
              </p>
              <p>&nbsp;</p></td>
            </tr>
            <tr>
              <td><p>Identity Proof</p>
              <p>
                <label for="idproof"></label>
                <input type="text" name="idproof" id="idproof" required>
              </p>
              <p>&nbsp;</p></td>
              <td><p>ID Number</p>
              <p>
                <label for="idnumber"></label>
                <input type="text" name="idnumber" id="idnumber" required>
              </p>
              <p>&nbsp;</p></td>
            </tr>
            <tr>
              <td><p>Date of Loss/Found(yyyy-MM-dd)</p>
                <p>
                  <label for="date"></label>
                  <input type="text" name="date" id="date" required>
              </p>
              <p>&nbsp;</p></td>
              <td><p>Time of Loss/Found(HH:MM)</p>
                <p>
                  <label for="time"></label>
                  <input type="text" name="time" id="time" required>
              </p>
              <p>&nbsp;</p></td>
            </tr>
            <tr>
              <td ><p>Lost/Found Article</p>
                <p>
                  <label for="article"></label>
                  <input type="text" name="article" id="article" required>
                </p>
                <p>&nbsp;</p>
                <p>State</p>
                <p>&nbsp;</p>
                <p>
                  <label for="state"></label>
                  <select name="state" size="1" id="state" required>
                    <option>Choose State</option>
                     <%
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
                          String q="select * from statetable";
                          PreparedStatement mystatement=myconnection.prepareStatement(q);
                          ResultSet myresult=mystatement.executeQuery();
                          if(myresult.next())
                          {
                              do
                              {
                                out.println("<option value=" + myresult.getString("stateid") + ">" + myresult.getString("statename") +"</option>");
                              }
                              while(myresult.next());
                                 
                          }
                          else
                          {
                              out.println("no state available");
                          }
                          
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
              %>
                  </select>
                </p>
                <p>&nbsp;</p>
              <p></p></td>
              <td ><p>Description</p>
                <p>
                  <label for="description"></label>
                  <input type="text" name="description" id="description" required>
                </p>
                <p>&nbsp;</p>
              <p></p></td>
            </tr>
            <tr>
              <td valign="top"><p> City            </p>
                <p>&nbsp;</p>
              <p>
                <label for="city"></label>
                <div id="selectbox" >
                <select name="city" id="city" required>
                  <option>Choose City</option>
                   
                </select></div>
              </p></td>
              <td valign="top"><p>Division Number</p>
                  
              <p>
                <label for="location"></label>
                <p>                
                <div id="selectbox1">
                <select name="location" id="location" required>
                  <option>Choose Division No.</option>
                </select>
              </div>
              </p>
              <p>&nbsp;</p></td>
            </tr>
            <tr>
              <td align="center"><input type="submit" name="Submit" id="Submit" value="Submit"></td>
              <td align="center"><input type="reset" name="reset" id="reset" value="Reset"></td>
            </tr>
            <tr>
                <td align="center">&nbsp;</td>
              
            </tr>
            <tr>
              <td align="center"><%
                  if(request.getParameter("Submit")!= null)
                  {
                      java.util.Date cdate1=new java.util.Date();
                 SimpleDateFormat myformat1=new SimpleDateFormat("yyyy-MM-dd");
        String date=(myformat1.format(cdate1));
                     
  try
                  {
                       Connection myconnection;
                      Class.forName("com.mysql.jdbc.Driver");
                      myconnection=DriverManager.getConnection(url, username2, password2);
                      try
                      {
                          String q="INSERT INTO `lostfound`(`username`, `status`,  `name`, `fmname`, `address`, `phone`, `email`, `place`, `idproof`, `idno`, `date`, `time`, `article`, `description`,`dateofreg`,`type`,`city`,`location`,`state`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
                           PreparedStatement mystatement=myconnection.prepareStatement(q);
                          mystatement.setString(1,String.valueOf(session.getAttribute("cuname")) );                      
                          mystatement.setString(2, "Pending");                      
                          mystatement.setString(3, request.getParameter("name"));                      
                          mystatement.setString(4, request.getParameter("fmname"));                      
                          mystatement.setString(5, request.getParameter("address"));                      
                          mystatement.setString(6, request.getParameter("phone")); 
                          mystatement.setString(7, request.getParameter("email"));
                          mystatement.setString(8, request.getParameter("place"));
                          mystatement.setString(9, request.getParameter("idproof"));
                          mystatement.setString(10, request.getParameter("idnumber"));
                          mystatement.setString(11, request.getParameter("date"));
                          mystatement.setString(12, request.getParameter("time"));
                          mystatement.setString(13, request.getParameter("article"));
                          mystatement.setString(14, request.getParameter("description"));
                          mystatement.setString(15, date);
                         mystatement.setString(16, request.getParameter("type"));
                         mystatement.setString(17, request.getParameter("city1"));
                         mystatement.setString(18, request.getParameter("location"));
                         mystatement.setString(19, request.getParameter("state"));

                          if(mystatement.executeUpdate()>0)
                          {
                              out.println("Report filed Successfully");
                          }
                          
                      }
                      catch(Exception e)
                      {
                          out.println("Error to file Report." +e);
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
            
	
                  %></td>
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
     
       $(document).ready(function(){
             $("#form1").validate();
            $("#state").change(function() {
                var b=$(this).val();
                
               
                $.ajax({
                        url:'ajax.jsp',
                        type:'post',
                        data:{stateid:b},
                        beforeSend: function () {
                        $("#message").html("<img src=images/preloader.gif>")
                        },
                        success:function(x) 
                        {
                        $("#message").html("")
                      	                        
                        $("#selectbox").html(x)	
                        },
                        error: function(e) 
                        {
                        $("#message").html("error" + e);
                        }
                });
                
            });    
             
             $("#selectbox").change(function() {
                var c=$("#city1").val();
                
               
                $.ajax({
                        url:'ajax.jsp',
                        type:'post',
                        data:{cityid:c},
                        beforeSend: function () {
                        $("#message1").html("<img src=images/preloader.gif>")
                        },
                        success:function(x) 
                        {
                        $("#message1").html("")
                      	                        
                        $("#selectbox1").html(x)	
                        },
                        error: function(e) 
                        {
                        $("#message1").html("error" + e);
                        }
                });
                
            });   });

         
          
                
        
        
	
        </script>
                            
                             </div>
                                                <br/>
                                                <br/>
                                                <br/>

                        <%@include file="footer.jsp" %>
        <h1>&nbsp;</h1>
    </body>
</html>
