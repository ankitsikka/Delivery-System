<%-- 
    Document   : adminpanel
    Created on : 4 Jan, 2017, 6:13:17 PM
    Author     : HP
--%>

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
        <h1>Hello Admin !</h1>
        <p>&nbsp;</p>
        <p>&nbsp;</p>
    <table width="946"   cellpadding="5">
          <tr>
            <td width="109" height="140" align ="center"><a href="addstate.jsp"><img src="images/Data-Add-Row-icon.png" alt="Add State" width="100" height="100"></a></td>
            <td width="135" align ="center"><a href="addcity.jsp"><img src="images/Files-Add-File-icon.png" width="100" height="100" alt="Add City"></a></td>
            <td width="136" align ="center"><a href="addlocation.jsp"><img src="images/Folders-Add-Folder-icon.png" width="100" height="100" alt="Add Police Station"></a></td>
            <td width="150" align ="center"><a href="viewallcomplaints.jsp"><img src="images/Data-View-Details-icon.png" width="100" height="100" alt="View all complaints"></a></td>
            <td width="171" align ="center"><a href="viewallstations.jsp"><img src="images/Files-View-File-icon.png" width="100" height="100" alt="view all police stations"></a></td>
            <td width="169" align ="center"><a href="changepass.jsp"><img src="images/cngs.png" width="100" height="100" alt="change password"></a></td>
      </tr>
          <tr>
            <td align ="center"><a href="addstate.jsp">Add State</a></td>
            <td align ="center"><a href="addcity.jsp">Add City</a></td>
            <td align ="center"><a href="addlocation.jsp">Add Police Station</a></td>
            <td align ="center"><a href="viewallcomplaints.jsp">View All Complaints</a></td>
            <td align ="center"><a href="viewallstations.jsp">View All Police Stations</a></td>
            <td align ="center"><a href="changepass.jsp">Change Password</a></td>
          </tr>
    </table>
        
            </div>
                                                <br/>
                                                <br/>
                                                <br/>

                        <%@include file="footer.jsp" %>
    </body>
</html>
