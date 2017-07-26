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
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    <body>
        
        <%@include file="header.jsp" %>
         <div class="container">
    <h1>Add State</h1>
    <form action="" method="post" enctype="multipart/form-data" name="form1" id="form1">
      <table width="500" border="0" cellspacing="0" cellpadding="5">
        <tr>
          <td width="124" height="42">State Name</td>
          <td width="147"><label for="name"></label>
              <input type="text" name="name" id="name" required ></td>
          <td width="199"><div id="message"></div></td>
        </tr>
        <tr>
          <td>Image</td>
          <td colspan="2"><label for="image"></label>
          <input type="file" name="image" id="image"></td>
        </tr>
        <tr>
          <td>&nbsp;</td>
          <td colspan="2"><input type="submit" name="Submit" id="Submit" value="Add State">
          <input type="reset" name="Reset" id="Reset" value="Reset"></td>
        </tr>
        <tr>
          <td>&nbsp;</td>
          <td colspan="2"><%
             
  boolean isMultipart = ServletFileUpload.isMultipartContent(request);
  boolean flag=false;
      String statename="",path,i="";
    if(isMultipart)
    {
        FileItem item=null;
        FileItemFactory factory = new DiskFileItemFactory();
        ServletFileUpload upload = new ServletFileUpload(factory);
			
        List items = null;
        try
        {
            items = upload.parseRequest(request);
        }
        catch(FileUploadException e)
        {
            e.printStackTrace();
        }
          Iterator itr = items.iterator();
		    
		  
          while (itr.hasNext())
            {

                    item = (FileItem) itr.next();
     
                if (item.isFormField())
                {
                    String itemName1 = item.getFieldName();
                    String value=item.getString();
          
                    if(itemName1.equals("name")) //control's name - textbox name
                    {
                            statename=value;//variable name                
                    }
                    
                }
                else
                {
                    String type=item.getContentType();
                    long size=item.getSize()/1024; //bytes
                    if(size==0)
                    {
                        i="default.gif";
			flag=true;
                    }
                    else if(type.equals("image/pjpeg") || type.equals("image/jpeg")
                        || type.equals("image/png") || type.equals("image/x-png")
                        || type.equals("image/gif") && size<400)
                    {
                      
                        i=new java.util.Date().getTime()+item.getName();
 path=config.getServletContext().getRealPath("/") + "uploads\\" + i;
                        File savefile=new File(path);
                        item.write(savefile);    
			flag=true;
                    }
		    else
		    {
			out.println("Please upload image files with size less than 400 kbs");
		    }
                    
                }
              
            } 
			if(flag)
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
                          String q="insert into statetable(statename,image) values(?,?)";
                          PreparedStatement mystatement=myconnection.prepareStatement(q);
                          mystatement.setString(1, statename);                      
                          mystatement.setString(2, i);                      
                          
                          
                          if(mystatement.executeUpdate()>0)
                          {
                              out.println("State added Successfully");
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
                  
                            
                            
                            
			}
					
            } 
           
              %></td>
        </tr>
      </table>
    </form>
         <script src="js/jquery-1.11.1.js" type="text/javascript"></script>
        <script src="js/jquery.validate.js"></script>
        <script type="text/javascript">
             
            
        $(document).ready(function(){
            $("#form1").validate();
            
        });
        </script>
        
        <%@include file="footer.jsp" %>
        </div>
        
    </body>
</html>
