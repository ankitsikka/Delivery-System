

<%@page import="java.net.*"%>
<%@ page import="java.util.*"%>  
<%@ page import="com.sun.syndication.feed.synd.*"%>  
<%@ page import="com.sun.syndication.io.*"%>
<!--A Design by W3layouts
Author: W3layout
Author URL: http://w3layouts.com
License: Creative Commons Attribution 3.0 Unported
License URL: http://creativecommons.org/licenses/by/3.0/
-->

<!DOCTYPE html>
<html>
<head>
<title>Crime Report Online</title>
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
			<div class="hea-rgt">
				<a href="whichcomplaint.jsp">File Complaint</a>
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
						
						<li><a href="signup.jsp">Signup</a></li>
						<li><a href="login.jsp">Login</a></li>
						<li><a href="contact.jsp">Contact</a></li>
					</ul>
				</div>
				<!--/.navbar-collapse-->
			</nav>
			</div>
			<div class="clearfix"></div>
		</div>
	</div>
	<!--header-top-end-->
	<!--start-header-->
	<div class="header">
		<div class="container">
			<div class="head">
				<div class="soc">
					<ul>
						<li><a href="#"><span class="fb"> </span></a></li>
						<li><a href="#"><span class="twit"> </span></a></li>
						<li><a href="#"><span class="pin"> </span></a></li>
						<li><a href="#"><span class="rss"> </span></a></li>
						<li><a href="#"><span class="drbl"> </span></a></li>
						<div class="clearfix"></div>
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
	<!-- script-for-menu -->
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
                          // response.sendRedirect("adminpanel.jsp");}
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
				

	<!-- banner-starts -->
	<div class="banner">
		<div class="container">
			<div class="banner-top">
				
			
							
			</div>
		</div>
	</div>
	<!--banner-end-->
	<!-- welcome -->
	<div class="welcome">
		<div class="container">
			<div class="col-md-8 welcome-left">
				<h3>Welcome</h3>
				<div class="col-md-6 wel-lft">
					<img src="images/20.jpg" alt=" " class="img-responsive">
				</div>
				
				<div class="clearfix"></div>
			</div>
			<div class="col-md-4 welcome-right">
				<h3>Quick Links</h3>
					<ul>
						<li><a href="signup.jsp"><span></span> SignUp</a></li>
						<li><a href="login.jsp"><span></span>Login</a></li>
						<li><a href="viewcomplaints.jsp"><span></span>View Complaints</a></li>
						
						
					</ul>
			</div>
			<div class="clearfix"></div>
		</div>
	</div>
	<!-- welcome -->
        <div class="welcome">
		<div class="container">
			
	<h3>Latest News</h3>
        
         <%
	
			String rssFeedUrl="http://feeds.feedburner.com/ndtvnews-top-stories";
			try
			{
				URLConnection feedUrl = new URL(rssFeedUrl).openConnection();
				SyndFeedInput input = new SyndFeedInput();
				SyndFeed feed =null;
				feed=input.build(new XmlReader(feedUrl));
			
				List list = feed.getEntries();
				
				for (int i=0 ; i < 5; i++)
				{
					SyndEntry entry = (SyndEntry)list.get(i);
					StringBuilder display =new StringBuilder();
					display.append("<a href=" + entry.getLink() +">" 
                                                + entry.getTitle() +"</a><br>");
					SyndContent mycontent=entry.getDescription();
					display.append(mycontent.getValue());
					out.println(display.toString()+"<br><br>");
				}
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
	%>
        
        </div>
        </div>
	<!-- footer-starts -->
	<div class="footer">
		<div class="container">
				<div class="col-md-4 contact-left">
				<h4>Address</h4>
					<div class="cont-tp">
 						<span class="glyphicon glyphicon-map-marker" aria-hidden="true">
					</span></div>
					
					<address>
						  Jalandhar<br>
						  Punjab, India 144001<br>
						  <abbr title="Phone">P :</abbr> +91-9876543210
						</address>
				</div>
				<div class="col-md-4 contact-left">
				<h4>Phone/Fax</h4>
					<div class="cont-tp">
						<span class="glyphicon glyphicon-phone" aria-hidden="true">
					</span></div>
					
					<p>Phone : +1234567890 </p>
					<p>Mobile : +91-9876543210 </p>
					<p>Fax : +1234567890 </p>
				</div>
				<div class="col-md-4 contact-left">
				
				</div>
				<div class="clearfix"></div>
			
			<div class="footer-text">
				<p>© 2017 Crime Report Online. All Rights Reserved  </p>
			</div>
		</div>
	</div>
	<!-- footer-end -->
         <%
    response.addHeader("Cache-Control", "no-cache,no-store,private,must-revalidate,max-stale=0,post-check=0,pre-check=0"); 
   response.addHeader("Pragma", "no-cache"); 
   response.addDateHeader ("Expires", 0);
   

 
    %>
    
    
</body>
</html>