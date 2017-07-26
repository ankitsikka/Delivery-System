<%@page import="java.io.File"%>
<%@page import="java.sql.*"%>
<%@page import="org.apache.commons.fileupload.FileUploadException"%>
<%@page import="org.apache.commons.fileupload.disk.DiskFileItemFactory"%>
<%@page import="org.apache.commons.fileupload.FileItemFactory"%>
<%@page import="org.apache.commons.fileupload.FileItem"%>
<%@page import="org.apache.commons.fileupload.servlet.ServletFileUpload"%>
<%@page import="java.util.*"%>
<%
             
  boolean isMultipart = ServletFileUpload.isMultipartContent(request);
  boolean flag=false;
      String stateid="",cityid="",name="",address="",shoname="",phone="",password="",path,i="", locationid="";
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
          
                    if(itemName1.equals("state")) //control's name - textbox name
                    {
                            stateid=value;//variable name                
                    }
                    else if(itemName1.equals("city")) //control's name - textbox name
                    {
                            cityid=value;//variable name                
                    }
                    else if(itemName1.equals("name")) //control's name - textbox name
                    {
                            name=value;//variable name                
                    }
                    else if(itemName1.equals("price")) //control's name - textbox name
                    {
                            address=value;//variable name                
                    }
                    else if(itemName1.equals("shoname")) //control's name - textbox name
                    {
                            shoname=value;//variable name                
                    }
                    else if(itemName1.equals("phone")) //control's name - textbox name
                    {
                            phone=value;//variable name                
                    }
                     else if(itemName1.equals("password")) //control's name - textbox name
                    {
                            password=value;//variable name                
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
		   
               
                  
                  try
                  {
                       String url="jdbc:mysql://localhost/crimefiledb";                  
                  String username2="root";
                  String password2="";
                      Connection myconnection;
                      Class.forName("com.mysql.jdbc.Driver");
                      myconnection=DriverManager.getConnection(url, username2, password2);
                      try
                      {
                          String q="insert into addlocation(stateid,cityid,pname,address,shoname,image,phone) values(?,?,?,?,?,?,?)";
                          PreparedStatement mystatement=myconnection.prepareStatement(q);
                          mystatement.setString(1, stateid);                      
                          mystatement.setString(2, cityid);                      
                          mystatement.setString(3, name);                     
                           mystatement.setString(4, address);  
                            mystatement.setString(5, shoname);  
                             mystatement.setString(6, i);  
                              mystatement.setString(7, phone);  
                          
                          if(mystatement.executeUpdate()>0)
                          {
                              
                          }
                          
                      }
                      catch(Exception e)
                      {
                          out.println("error in query" +cityid  + e.getMessage());
                      }
                      try
                      {
                          String q11="select * from addlocation where stateid=? and cityid=? and pname=?";
                      PreparedStatement mystatement11=myconnection.prepareStatement(q11);
                        mystatement11.setString(1, stateid);
                       mystatement11.setString(2, cityid);
                       mystatement11.setString(3, name);
                      ResultSet myresult11=mystatement11.executeQuery();
                      
                      if(myresult11.next())
                      {
           
                      
                     
                                   
                                     locationid= myresult11.getString("locationid");
         
                                         
                      }
                      
                          String q="insert into adminlogin(username,password,state,city,pdivno) values(?,?,?,?,?)";
                          PreparedStatement mystatement=myconnection.prepareStatement(q);
                          mystatement.setString(3, stateid);                      
                          mystatement.setString(4, cityid);                      
                          mystatement.setString(1, name);                     
                           mystatement.setString(2, password);  
                            mystatement.setString(5,locationid );  
                             
                          
                          if(mystatement.executeUpdate()>0)
                          {
                              out.println("Police Station  added Successfully");
                          }
                          
                      }
                      catch(Exception e)
                      {
                          out.println("error in query" +cityid  + e.getMessage());
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
           
              %>
              