<%-- 
    Document   : whichcomplaint
    Created on : 13 Mar, 2017, 7:29:34 PM
    Author     : HP
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
         <%@include file="header.jsp" %>
        <br/>
            <br/>
                <br/>
                    <br/>
                        
                        <div class ="container" >
        <h1>&nbsp;</h1>
        <table width="700"  cellpadding="5">
          <tr>
            <td align ="center"><a href="complaintform.jsp"><img src="images/add-icon.png" width="100" height="100" alt="crime complaint"></a></td>
            <td align ="center"><a href="lostfound.jsp"><img src="images/math-add-icon.png" width="100" height="100" alt="lost/found complaint"></a></td>
          </tr>
          <tr>
            <td align ="center"><p>&nbsp;</p>
            <p><a href="complaintform.jsp">Crime Complaint</a></p></td>
            <td align ="center"><p>&nbsp;</p>
            <p><a href="lostfound.jsp">Lost/Found Complaint</a></p></td>
          </tr>
        </table>
        </div>
                                                <br/>
                                                <br/>
                                                <br/>

                        <%@include file="footer.jsp" %>
    </body>
</html>
