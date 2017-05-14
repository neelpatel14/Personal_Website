
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>

<link rel= "stylesheet" type= "text/css" href="exeSet.css"/>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<script type="text/javascript" src="exe_functions.js"></script>
<title>Settings</title>
<!--[if lt IE 9]>
<script src="http://html5shiv.googlecode.com/svn/trunk/html5.js">
</script>
<![endif]-->
	<body>
		<h2 class="purpose">Purpose</h2>
		<div class="purpose">
		This application will randomly alert the user with a random exercise depending on the settings below. The purpose
		of the application is to keep people alert during long hours of working in front of a computer screen.This application 
		will relieve both the mental strain from staring at a computer for long periods of time, as well as the physical strain,
		allowing you to have the opportunity to strech and casually exercise.
		</div>
		<h2 class="settings">Settings</h2>
		<div class="form">
		<form action = "/ActiveRun" method = "GET" id = "form1">
		<h3>Reminder Time</h3>
 			<input name= "timing" type= "radio" value= "15" id="timing" onclick = "checkTime()"/>15 Minutes
  			<input name = "timing" type = "radio" value= "30" id="timing" onclick = "checkTime()"/>30 Minutes
  			<input name = "timing" type = "radio" value= "60" id = "timing" onclick = "checkTime()"/>Hourly<br>
		<h3>Alert Type</h3>
			<input name = "alert" type = "radio" value = "light" id="alert" onclick = "checkType()"/>Light
			<input name = "alert" type = "radio" value = "sound" id= "alert" onclick = "checkType()"/>Sound<br><br>
			<input type= "submit" value= "Submit" id= "submit1" class="submit" disabled= "disabled"/> 
		</form>
		</div>
	</body>
	
</html>
