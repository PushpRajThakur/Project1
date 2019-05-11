<%-- 
    Document   : addStudent
    Created on : 30 Mar, 2019, 3:42:03 PM
    Author     : PushpRajThakur
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>


<html>
<head>
    <title>AddComplaint</title>
	<link rel="stylesheet" type="text/css" href="style.css">

<style>
body
{
margin:0;
padding:0;
background:url(chitkara.jpg);
background-size:cover;
background-position:center;
font-family:sans-serif;
}
.s
{
	width: 320px;
	height: 420px;
	background: rgba(0,0,0,0.4);
	color: white;
	top: 50%;
	left:50%;
	position: absolute;
	transform: translate(-50%,-50%);
	box-sizing: border-box;
	padding: 70px 30px;

}
h1
{
	margin: 0;
	padding: 0 0 20px;
	text-align: center;
	font-size: 22px;

}
.s p
{
	margin: 0;
	padding: 0;
	font-weight:  bold;
}
.s input
{
width:100%;
margin-bottom:20px;}

.s input[type="text"],input[type="password"]
{
	border:none;
	border-bottom: 1px solid black;
	background: transparent;
	outline:none;
	height: 40px;
	color: #fff;
	font-size: 16px;
}
.s input[type="submit"]
{
	border:none;
	outline: none;
	height: 40px;
	background: skyblue;
	color: black;
	font-size: 18px;
	border-radius: 0px;

}
.s input[type="reset"]
{
	border: none;
	outline: none;
	height: 40px;
	background: lightgreen;
	color: black;
	font-size: 18px;
	border-radius: 10px;
}
.s input[type="submit"]:hover
{
	cursor: pointer;
	background: grey;
	color: black;

}
.s input[type="reset"]:hover
{
	cursor: pointer;
	background: grey;
	color: black;
}
.s a{
	text-decoration: none;
	font-size: 14px;
    color: #fff;

}
.login-box a:hover
{
	color: #39dc79;
}
</style>
<script>
function vForm() {
  

  if (document.myForm.first_name.value== "") {
    alert("Please enter the first name");
    document.myForm.fname.focus();
    return false;
  }
  if(document.myForm.last_name.value=="")
  {
  	alert("Please enter the last name");
  	document.myForm.lastname.focus();
  	return false;
  }
  if(document.myForm.uid.value="")
  {
      alert("Please enter the uid");
      document.myForm.uid.focus();
      return false;
  }
alert("Complaint added successfully.");

}
</script>
</head>

<body>
	<div class="s">
		<h1>Complaint</h1>
                <form name="myForm" action="addComplaint" onsubmit="return vForm()" method="post">
			<p>FirstName
			<input type="text" name="first_name" placeholder="Enter FirstName"></p>
			<p>LastName
			<input type="text" name="last_name" placeholder="Enter LastName"></p>
			<p>Uid
				<input type="text" name="uid" size="30" ></p>
                        <p>Complaint
                            <textarea rows="5" cols="75" name="complaint" placeholder="Enter your complaint here...">
                            </textarea></p>
			<!-- <p>Set
			<input type="Password"  name="pass" placeholder="Enter Password" ></p>-->
			<input type="submit" name="submit" value="Submit">
                   
                        	
                </form>
	</div>
</body>
</html> 
