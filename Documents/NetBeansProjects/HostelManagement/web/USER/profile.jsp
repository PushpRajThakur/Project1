

<%@page import="java.sql.ResultSet"%>
<%@page import="chitkara.dao.UserDao"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%UserDao user=(UserDao)session.getAttribute("user");%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Profile</title>
    </head>
    <style>
        body{
            background-image:url(imgg.jpg);
        }
        
.row {
  display: flex;
}
.column {
  flex: 50%;
  padding: 20px;
  height: 300px;
}
label{
    color:white;
}
.aa{
    border:none;
	background: transparent;
	border-bottom: 1px solid black;
	text-align: left;
	outline:none;
	height: 60px;
	color: yellow;
	font-size: 16px;

}
label {
    width:180px;
    clear:left;
    text-align:right;
    padding-right:30px;
}
input, label {
    float:left;
}
        
    </style>
    <jsp:useBean id="c1" class="chitkara.operation.ProfileOperation"></jsp:useBean>
    <body>
        <header class="aa"><h1>Hello ${user.getFirst_name()}</h1></header><br>
    <div>
        <form>
            <% ResultSet rs= c1.showProfile(user.getUid());
            if(rs.next()){ 
                %>
                <div class="row">
                <div class="column"><label>Name</label>
                    <input type="text" value="<%=rs.getString("First_name")+" "+rs.getString("Last_name")%>" readonly>
                    <br>
                    <br>
                
                <label>UserID</label>
                    <input type="text" value="<%=rs.getString("U_id")%>"readonly>
                
                <br>
                <br>
                  <label>FatherName</label>
                    <input type="text" value="<%=rs.getString("Father_Name")%>" readonly>
                    <br>
                    <br>
                  <label>MotherName</label>
                    <input type="text" value="<%=rs.getString("Mother_Name")%>" readonly>
                    <br>
                    <br>
                  <label>Email</label>
                    <input type="text" value="<%=rs.getString("E-mail")%>" readonly>
                    <br>
                <br>
                <label>Address</label>
                    <input type="text" value="<%=rs.getString("Address")%>" readonly>
                </div>
                
                  <div class="column"><label>MobileNo</label>
                    <input type="text" value="<%=rs.getString("Mob_No.")%>" readonly>
                    <br>
                    <br>
                  <label>Branch</label>
                    <input type="text" value="<%=rs.getString("Branch")%>" readonly>
                    <br>
                <br>
                <label>Hostel</label>
                    <input type="text" value="<%=rs.getString("Hostel")%>" readonly>
                    <br>
                    <br>
                  <label>RoomNo.</label>
                    <input type="text" value="<%=rs.getString("Room")%>" readonly>
                    <br>
                    <br>
                  <label>Rank</label>
                    <input type="text" value="<%=rs.getString("Rank")%>" readonly>
                    <br>
                <br>
                 <label>Year</label>
                    <input type="text" value="<%=rs.getString("Year")%>" readonly>
                </div>
                <br>
                <br>
               <%}%>
        </form>
    </div>
    </body>
</html>
