<%-- 
    Document   : dashboard
    Created on : 26 Mar, 2019, 1:56:50 PM
    Author     : PushpRajThakur
--%>

<%@page import="chitkara.dao.UserDao"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<%UserDao user=(UserDao)session.getAttribute("user");%>
<html lang="en">
<head>
  <title>hostel management</title>
  <meta charset="utf-8">
  <link rel="stylesheet" type="text/css" href="style.css">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
</head>
<style>
body
{padding: 0;
	margin: 0;
height: 100%;
background-image:url(imgg.jpg);
background-size:cover;
background-position:center;
}
.aa
{
	border:none;
	background: transparent;
	border-bottom: 1px solid black;
	text-align: left;
	outline:none;
	height: 60px;
	color: yellow;
	font-size: 16px;
}
.sidenav {
  height: 100%;
  width: 0;
  position: fixed;
  z-index: 1;
  top: 0;
  left: 0;
  background-color: #111;
  overflow-x: hidden;
  transition: 0.5s;
  padding-top: 60px;
}

.sidenav a {
  padding: 8px 8px 8px 32px;
  text-decoration: none;
  font-size: 25px;
  color: white;
  display: block;
  transition: 0.3s;
}

.sidenav a:hover {
  color: #f1f1f1;
}

.sidenav .closebtn {
  position: absolute;
  top: 0;
  right: 25px;
  font-size: 36px;
  margin-left: 50px;
}
h3
{
color:White;    
}

</style>
<body>

	<header class="aa"><h1>Hostels</h1></header><br>
        <h3><%=user.getFirst_name()+" "+user.getLast_name()%></h3>
<nav class="navbar navbar-expand-lg navbar-default">
  <div class="container-fluid">
    <div class="navbar-header">
    </div>
    <ul class="nav navbar-nav">
    	<li>  <span style="font-size:30px;cursor:pointer" onclick="openNav()">&#9776;</span></li>
      <li class="active"><a href = "file:///C:/Users/Dell/Desktop/assignment/hostel.html"><span class="glyphicon glyphicon-home"> Home</a></li>
      <li class="dropdown"><a class="dropdown-toggle" data-toggle="dropdown" href="#"><span class="glyphicon glyphicon-envelope"> contacts</span></a>
        <ul class="dropdown-menu">
          <li><a href="#">Developer(9882955137)</a></li>
          <li><a href="#">Co-founder(7018448849)</a></li>
          <li><a href="#">founder(7986913550)</a></li>
        </ul>
      </li>
      <li><a href = "profile.jsp"><span class="glyphicon glyphicon-user"> Profile</span></a></li>
      <li><a href="addComplaint.jsp"><span class="glyphicon glyphicon-envelope">AddComplaint</span></a></li>
    </ul>
    <ul class="nav navbar-nav navbar-right">
      <li><a href="http://localhost:8083/HostelManagement/"><span class="glyphicon glyphicon-log-in"></span> Logout</a></li>
    </ul>
  </div>
</nav>

<div id="mySidenav" class="sidenav">
  <a href="javascript:void(0)" class="closebtn" onclick="closeNav()">&times;</a>
  <a href="#">About</a>
  <a href="#">Warden Info</a>
  <a href="#">Hostel Rooms</a>
  <a href="#">Canteen</a>
  <a href="#">Hostel Fees</a>
</div>
<script>
function openNav() {
  document.getElementById("mySidenav").style.width = "250px";
  document.getElementById("main").style.marginLeft = "200px";
}

function closeNav() {
  document.getElementById("mySidenav").style.width = "0";
  document.getElementById("main").style.marginLeft= "0";
}
</script>
</body>
</html>