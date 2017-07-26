<%-- 
    Document   : contact
    Created on : 23 Apr, 2017, 2:39:19 PM
    Author     : HP
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
       
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords" content="Law Responsive web template, Bootstrap Web Templates, Flat Web Templates, Android Compatible web template, 
Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyEricsson, Motorola web design" />
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
<link href="css/bootstrap.css" rel='stylesheet' type='text/css' />
<link href="css/style.css" rel='stylesheet' type='text/css' />
<link href='//fonts.googleapis.com/css?family=Open+Sans:300italic,400italic,600italic,400,300,600,700|Six+Caps' rel='stylesheet' type='text/css' />
<link rel="stylesheet" href="css/flexslider.css" type="text/css" media="screen" />
<script src="js/jquery.min.js"></script>
<script type="text/javascript" src="js/bootstrap.js"></script>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Crime Report Online</title>
    </head>
    <body>
        
       <!--header-top-starts-->
	<div class="header-top">
		<div class="container">
			<div class="head-main">
				<h1><a href="index.jsp">CRIME REPORT ONLINE</a></h1>
			</div>
			<div class="hea-rgt" id="logt" >
                            <ul style="list-style-type:none">
				
                                     
                                 <li><a href="logout.jsp">LogOut</a><li>
                                       
                                
                            </ul>
			</div>
			<div class="hea-rgt"  >
                            <ul style="list-style-type:none">
				
                                     
                                 <li><a href="whichcomplaint.jsp">File Complaint</a><li>
                                       
                                
                            </ul>
			</div>
                                
                              
                    
                    
			<div class="navigation">
				 <nav class="navbar navbar-default" role="navigation">
				<div class="navbar-header">
					<button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
						<span class="sr-only">Toggle navigation</span>
						<span class="icon-bar"></span>
						<span class="icon-bar"></span>
						<span class="icon-bar"></span>
					</button>
				</div>
				<!--/.navbar-header-->
				<div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
					<ul class="nav navbar-nav">
					 <li class="active"><a href="index.jsp">Home</a></li>
						
						<li><a href="login.jsp">Login</a></li>
						
						<li><a href="contact.jsp">Contact</a></li>
					</ul>
				</div>
				<!--/.navbar-collapse-->
			</nav>
			</div>
			<div class="clearfix"></div>
		</div>
      
	<!--header-top-end-->
	<!--start-header-->
	<div class="header">
		<div class="container">
			<p>&nbsp;</p>
			<div class="head">
				<div class="soc">
					<ul>
						<li><a href="#"><span class="fb"> </span></a></li>
						<li><a href="#"><span class="twit"> </span></a></li>
						<li><a href="#"><span class="pin"> </span></a></li>
						<li><a href="#"><span class="rss"> </span></a></li>
						<li><a href="#"><span class="drbl"> </span></a></li>
                                                <!--<div class="clearfix"></div>-->
					</ul>
			  </div>
				<div class="header-right">
					<div class="search-bar">
						<form>
							<input type="text" value="Search" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'Search';}">
							<input type="submit" value="">
						</form>
					</div>
				</div>
				
					<div class="clearfix"></div>
		  </div>
	  </div>
	</div>	
	<!-- script-for-menu -->
	<!-- script-for-menu -->
		<script>
			$("span.menu").click(function(){
				$(" ul.navig").slideToggle("slow" , function(){
				});
			});
                       
		</script>
                
                <%
    Cookie mycookies[]=request.getCookies();
    if(mycookies!=null)
    {
        for(Cookie mycookie:mycookies)
        {
            if(mycookie.getName().equals("auname"))
            {
                String uname=mycookie.getValue();
                session.setAttribute("auname", uname);
              //if(request.getParameter("uname").equals("admin")){
                    //       response.sendRedirect("adminpanel.jsp");}
                  //      else{ response.sendRedirect("stationpanel.jsp");}
                
            }
            else if(mycookie.getName().equals("cuname"))
            {
                String uname1=mycookie.getValue();
                session.setAttribute("cuname", uname1);
                //response.sendRedirect("clientpanel.jsp");
            }
            
        }
    }
    
        
        %>
                <% 
                   if((session.getAttribute("auname"))!=null || (session.getAttribute("cuname"))!=null){
                  
	%>
           
              <script type="text/javascript">
                       $("#logt").fadeIn();               
                   
                </script>
                                    <%
                                }
                                
                                 else {%>
                                 <script type="text/javascript">
                                 $("#logt").fadeOut();       
                
               </script>
               <%}%>
                
         <div class="container">
        <form id="form1" name="form1" method="post" action="">
            <% 
                   if((session.getAttribute("auname"))!=null || (session.getAttribute("cuname"))!=null){
                  
	%>
           
              <script type="text/javascript">
                                      
                    $('#logt').removeAttr('disabled');
                </script>
                                    <%
                                }
                                
                                 else {%>
                                 <script type="text/javascript">
                                      
                   $('#logt').attr('disabled','disabled');
                
               </script>
               <%}%>
          <p>&nbsp;</p>
  <h1>Contact Details</h1>
  <p>&nbsp;</p>
  <p>Address :</p>
  <p>Jalandhar<br />
  Punjab, India 144001  </p>
  <p>&nbsp;</p>
  <p>Phone/Fax :</p>
  <p>Phone : +91-9876543210<br />
  Mobile : +91-9876543210 <br/>
  Fax :  +1234567890</p>
  <p>&nbsp;</p>
</form>
        
             </div>
           <%@include file="footer.jsp" %>
            <%response.addHeader("Cache-Control", "no-cache,no-store,private,must-revalidate,max-stale=0,post-check=0,pre-check=0"); 
   response.addHeader("Pragma", "no-cache"); 
   response.addDateHeader ("Expires", 0);%>
    
     
    </body>
</html>
