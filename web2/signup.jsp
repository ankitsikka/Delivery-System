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
        <style type="text/css">
    body {
	margin-bottom: 2cm;
	margin-left: 2cm;
}
    </style>
    </head>
    <body>
        
        
        
         <%@include file="headerlogin.jsp" %>
         <div class="container">
         <h1>Signup</h1><br>
    <form action="" method="post" enctype="multipart/form-data" name="form1" id="form1">
      <table width="687" border="0" cellspacing="10" cellpadding="5">
        <tr>
          <td width="191" height="42">Username (Emailid)</td>
         <td width="190"><label for="username"></label>
             <input type="text" name="username" id="username" required ></td>
          <td width="236"><div id="message"></div></td>
        </tr>
        <tr>
          <td>Password</td>
          <td colspan="2"><label for="password"></label>
          <input type="password" name="password" id="password" required></td>
        </tr>
        <tr>
          <td>Confirm Password</td>
        <td colspan="2">&nbsp<input type="password" name="password2" id="password2" required></td>
        </tr>
        <tr>
          <td>Name</td>
          <td colspan="2"><label for="name"></label>
          <input type="text" name="name" id="name" required></td>
        </tr>
        <tr>
          <td>Address</td>
          <td colspan="2"><label for="address"></label>
          <textarea name="address" id="address" required></textarea></td>
        </tr>
        <tr>
          <td>Phone</td>
          <td colspan="2"><label for="phone"></label>
          <input type="text" name="phone" id="phone" required onKeyPress="return abc(event)" maxlength="10"></td>
        </tr>
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
        <tr>
          <td>Image</td>
          <td colspan="2"><label for="userimage"></label>
          <input type="file" name="userimage" id="userimage"></td>
        </tr>
        <tr>
          <td>&nbsp;</td>
          <td colspan="2"><input type="submit" name="Submit" id="Submit" value="Signup" onclick="return Validate()">
          <input type="reset" name="Reset" id="Reset" value="Reset"></td>
        </tr>
        <tr>
          <td>&nbsp;</td>
          <td colspan="2"><%
             
  boolean isMultipart = ServletFileUpload.isMultipartContent(request);
  boolean flag=false;
      String username="",password="",name="",address="",phone="",gender="",path,i="";
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
          
                    if(itemName1.equals("username")) //control's name - textbox name
                    {
                            username=value;//variable name                
                    }
                     else if(itemName1.equals("password")) //control's name - textbox name
                    {
                            password=value;//variable name               
                    }
                      else if(itemName1.equals("name")) //control's name - textbox name
                    {
                            name=value;//variable name               
                    }
                       else if(itemName1.equals("address")) //control's name - textbox name
                    {
                            address=value;//variable name               
                    }
                        else if(itemName1.equals("phone")) //control's name - textbox name
                    {
                            phone=value;//variable name               
                    }
                    else if(itemName1.equals("gender")) //control's name - textbox name
                    {
                            gender=value;//variable name               
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
                          String q="insert into signup values(?,?,?,?,?,?,?)";
                          PreparedStatement mystatement=myconnection.prepareStatement(q);
                          mystatement.setString(1, username);                      
                          mystatement.setString(2, password);                      
                          mystatement.setString(3, name);                      
                          mystatement.setString(4, address);                      
                          mystatement.setString(5, phone);                      
                          mystatement.setString(6, gender); 
                          mystatement.setString(7, i);
                          if(mystatement.executeUpdate()>0)
                          {
                              out.println("Signup Successful");
                          }
                          
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
            function Validate() {
        var password = document.getElementById("password").value;
        var confirmPassword = document.getElementById("password2").value;
        if (password != confirmPassword) {
            alert("Passwords do not match.");
            return false;
        }
        return true;
    }
        $(document).ready(function(){
            $("#form1").validate();
             $("#username").blur(function(){
                var a=$(this).val();
                $.ajax({
                        url:'ajax.jsp',
                        type:'post',
                        data:{n:a},
                        beforeSend: function () {
                        $("#message").html("<img src=images/preloader.gif>")
                        },
                        success:function(x) 
                        {
                        $("#message").html(x)	
                        },
                        error: function(e) 
                        {
                        $("#message").html("error" + e);
                        }
                });
             });   
        });
        </script>
        </div>
           <%@include file="footer.jsp" %>
    </body>
</html>
