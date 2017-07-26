<%@page import="java.sql.*"%>
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
    <h1>Add Police Station</h1>
    <form action="ajax1.jsp" method="post" enctype="multipart/form-data" name="form1" id="form1">
      <table width="739" border="0" cellspacing="0" cellpadding="5">
        <tr>
          <td height="42">State Name</td>
          <td><label for="state"></label>
             &nbsp<select name="state" id="state"  required>
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
          <td><div id="message"></div></td>
        </tr>
        <tr>
          <td height="42">City Name</td>
          <td>
              <div id="selectbox">&nbsp;
                <select name="city" id="city" required>
                <option value="">Choose State First</option>
            
              </select>
              </div>
             
          </td>
          <td>&nbsp;</td>
        </tr>
        <tr>
          <td width="217" height="42">Police Station Name</td>
          <td width="270"><label for="name"></label>
          &nbsp;<input type="text" name="name" id="name" required></td>
          <td width="222">&nbsp;</td>
        </tr>
        <tr>
          <td>Password</td>
          <td colspan="2"><label for="password"></label>            &nbsp;<input type="text" name="password" id="password"></td>
        </tr>
        <tr>
          <td>Address</td>
          <td colspan="2"><label for="address"></label>
          &nbsp;<input type="text" name="address" id="address" required></td>
        </tr>
        <tr>
          <td>Name of SHO</td>
          <td colspan="2"><label for="shoname"></label>
            <label for="shoname"></label>
            <input type="text" name="shoname" id="shoname" required></td>
        </tr>
        <tr>
          <td>Phone</td>
          <td colspan="2"><label for="phone"></label>
           &nbsp;<input type="text" name="phone" id="phone" required onKeyPress="return abc(event)" maxlength="10"></td>
        </tr>
        <tr>
          <td>Image</td>
          <td colspan="2"><label for="image2"></label>
            &nbsp;
            <input type="file" name="image2" id="image2"></td>
        </tr>
        <tr>
          <td>&nbsp;</td>
          <td colspan="2"><input type="submit" name="Submit" id="Submit" value="Add Police Station">
          <input type="reset" name="Reset" id="Reset" value="Reset"></td>
        </tr>
        <tr>
          <td>&nbsp;</td>
          <td colspan="2">
<div id="message2"></div></td>
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

        });
        
        
               $.validator.setDefaults({
		submitHandler: function() {
                
                var formData = new FormData($("#form1")[0]);
                $.ajax({
                        url:'ajax1.jsp',
                        type:'post',
                        data:formData,
                        contentType: false,
                        cache: false,
                        processData: false,
                        beforeSend: function () {
                        $("#message").html("<img src=images/preloader.gif>")
                        },
                        success:function(x) 
                        {
                        $("#message").html("")	
                        $("#message2").html(x)	
                        },
                        error: function(e) 
                        {
                        $("#message").html("error" + e);
                        }
                });
   
                        
		}
	});
        </script>
        </div>
          <%@include file="footer.jsp" %>
         
        
    </body>
</html>
