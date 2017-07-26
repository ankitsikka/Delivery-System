<%-- 
    Document   : statusupdate
    Created on : 21 Apr, 2017, 10:14:38 PM
    Author     : HP
--%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.io.File"%>
<%@page import="java.sql.*"%>
<%@page import="org.apache.commons.fileupload.FileUploadException"%>
<%@page import="org.apache.commons.fileupload.disk.DiskFileItemFactory"%>
<%@page import="org.apache.commons.fileupload.FileItemFactory"%>
<%@page import="org.apache.commons.fileupload.FileItem"%>
<%@page import="org.apache.commons.fileupload.servlet.ServletFileUpload"%>
<%@page import="java.util.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
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
                    <br/>
                        
                        <div class ="container" >


                                            
                                            <h1> Complaint Status Update</h1>
                                            <br/><br/>
        <form name="form1" id="form1" method="post" action="">
          <table width="915"  cellpadding="5">
            <tr>
              <td width="166" height="110">Fir Number</td>
              <td width="721"><label for="firno"></label>
              &nbsp;<input name="firno" type="text" id="firno"  size="50" maxlength="100000000" required></td>
            </tr>
            <tr>
              <td height="131"> Status</td>
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
                          String q="INSERT INTO `statustable`(`firno`, `status`) VALUES (?,?)";
                           PreparedStatement mystatement=myconnection.prepareStatement(q);
                          mystatement.setString(1,request.getParameter("firno")) ;                      
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
        <h1>&nbsp;</h1>
        </div>
              
    <%@include  file="footer.jsp" %>
    </body>
</html>
