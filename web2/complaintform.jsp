<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.io.File"%>
<%@page import="java.sql.*"%>
<%@page import="org.apache.commons.fileupload.FileUploadException"%>
<%@page import="org.apache.commons.fileupload.disk.DiskFileItemFactory"%>
<%@page import="org.apache.commons.fileupload.FileItemFactory"%>
<%@page import="org.apache.commons.fileupload.FileItem"%>
<%@page import="org.apache.commons.fileupload.servlet.ServletFileUpload"%>
<%@page import="java.util.*"%>
<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html>
<head>
<title>Crime Report Online</title>
</head>
<%@include file="header.jsp"%> 
<body>
    
    <div class ="container"><form id="form1" name="form1" method="post" action="">
  <h1>Complaint Form</h1>
  <p>&nbsp;</p>
  <h3>Personal Information:</h3>
  <table width="1034"  cellspacing="5" cellpadding="5">
    <tr>
      <td width="327">State</td>
      <td width="396"><label for="state"></label>
        <select name="state" id="state" required>
          <option value="">Choose State</option>
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
      </select></td>
      <td width="259"><div id="message"></div></td>
    </tr>
    <tr>
      <td height="37">City</td>
      <td><div id="selectbox" >
        &nbsp;<select name="city" id="city" required>
          <option value="">Choose City</option>
        </select></div></td>
        <td width="259"><div id="message1"></div></td>
    </tr>
    <tr>
      <td>Division Number</td>
      <td><div id="selectbox1">
        &nbsp;<select name="location" id="location" required>
          <option value="">Choose Division No.</option>
        </select></div></td>
    </tr>
    <tr>
      <td>Name </td>
      <td><label for="name"></label>
      <input type="text" name="name" id="name" required/></td>
    </tr>
    <tr>
      <td> Phone/Mobile</td>
      <td><label for="phone"></label>
      <input type="text" name="phone" id="phone" required onKeyPress="return abc(event)" maxlength="10" /></td>
    </tr>
    <tr>
      <td>Email Id</td>
      <td><label for="email"></label>
      <input type="text" name="email" id="email" required/></td>
    </tr>
    <tr>
      <td>Identity Proof</td>
      <td><label for="idname"></label>
      <input type="text" name="idname" id="idname" required />
      &nbsp;</td>
    </tr>
    <tr>
      <td>ID Number</td>
      <td><label for="idno"></label>
        <input type="text" name="idno" id="idno" required/> </td>
          
    </tr>
    <tr>
      <td>Complaint Details:</td>
      <td>&nbsp;<textarea name="cdetails" id="cdetails" cols="45" rows="5" required></textarea>
        <label for ="cdetails"></label></td>
      </tr>
  </table>
    <h3> Complainant Details:</h3>
  <table width="763"  cellspacing="5" cellpadding="5">
    <tr>
      <td width="251">Complainant Name</td>
      <td width="313"><label for="cname"></label>
      <input type="text" name="cname" id="cname" required /></td>
    </tr>
    <tr>
      <td>      Complainant Father's Name</td>
      <td><label for="cfname"></label>
      <input type="text" name="cfname" id="cfname" required /></td>
    </tr>
    <tr>
      <td>Complainant Phone</td>
      <td><label for="cphone"></label>
      <input type="text" name="cphone" id="cphone" required onKeyPress="return abc(event)" maxlength="10" /></td>
    </tr>
    <tr>
      <td>Complainant Address</td>
      <td><label for="caddress"></label>
      <input type="text" name="caddress" id="caddress" required/></td>
    </tr>
  </table>
  <h3>Accused Details:</h3>
  <table width="763"  cellspacing="5" cellpadding="5">
    <tr>
      <td width="251">Accused Name</td>
      <td width="313"><label for="aname"></label>
      <input type="text" name="aname" id="aname" required/></td>
    </tr>
    <tr>
      <td>Accused Father's Name</td>
      <td><label for="afname"></label>
      <input type="text" name="afname" id="afname" required /></td>
    </tr>
    <tr>
      <td>Accused Phone</td>
      <td><label for="aphone"></label>
      <input type="text" name="aphone" id="aphone" required onKeyPress="return abc(event)" maxlength="10"/></td>
    </tr>
    <tr>
      <td>Accused Address</td>
      <td><label for="aaddress"></label>
      <input type="text" name="aaddress" id="aaddress" required/></td>
    </tr>
    <tr>
      <td>&nbsp;</td>
      <td></td>
    </tr>
    <tr>
      <td>&nbsp;</td>
      <td><input type="submit" name="Submit" id="Submit" value="Submit" onclick="return Validate()"/>&nbsp;&nbsp;
      <input type="reset" name="Reset" id="Reset" value="Reset" /></td>
    </tr>
    <tr>
      <td>&nbsp;</td>
      <td>&nbsp;</td>
    </tr>
    <tr>
      <td>&nbsp;</td>
      <td><%
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
                          String q="INSERT INTO `complaintform`(`username`, `status`, `state`, `city`, `pdivno`, `name`, `phone`, `email`, `idproof`, `idno`, `cdetails`, `cname`, `cfname`, `cphone`, `caddress`, `aname`, `afname`, `aphone`, `aaddress`,`dateofreg`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
                           PreparedStatement mystatement=myconnection.prepareStatement(q);
                          mystatement.setString(1,String.valueOf(session.getAttribute("cuname")) );                      
                          mystatement.setString(2, "Pending");                      
                          mystatement.setString(3, request.getParameter("state"));                      
                          mystatement.setString(4, request.getParameter("city1"));                      
                          mystatement.setString(5, request.getParameter("location"));                      
                          mystatement.setString(6, request.getParameter("name")); 
                          mystatement.setString(7, request.getParameter("phone"));
                          mystatement.setString(8, request.getParameter("email"));
                          mystatement.setString(9, request.getParameter("idname"));
                          mystatement.setString(10, request.getParameter("idno"));
                          mystatement.setString(11, request.getParameter("cdetails"));
                          mystatement.setString(12, request.getParameter("cname"));
                          mystatement.setString(13, request.getParameter("cfname"));
                          mystatement.setString(14, request.getParameter("cphone"));
                          mystatement.setString(15, request.getParameter("caddress"));
                          mystatement.setString(16, request.getParameter("aname"));
                          mystatement.setString(17, request.getParameter("afname"));
                          mystatement.setString(18, request.getParameter("aphone"));
                          mystatement.setString(19, request.getParameter("aaddress"));
                          mystatement.setString(20, date);
                          if(mystatement.executeUpdate()>0)
                          {
                              out.println("Complaint filed Successfully");
                          }
                          
                      }
                      catch(Exception e)
                      {
                          out.println("Error to file the complaint." +e);
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
  <p>&nbsp;</p>
  <p>&nbsp;</p>
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
              
    <%@include  file="footer.jsp" %>
</body>

</html>