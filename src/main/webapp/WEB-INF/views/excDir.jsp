<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<link rel= "stylesheet" type= "text/css" href="exeDir.css"/>
<script type="text/javascript" src="exe_functions.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Directions</title>
<body id="body">
<h1>
EXERCISE REMINDERS
</h1>
<p class="main">
Settings: Reminders every <span style= "color: blue">${timing} </span> minutes and 
<span style="color: blue">${alertType}</span> alerts.
</p>
<p class ="dir">
The screen will display the exercise you must do with ${alertType} alerts, every ${timing } minutes.<br>
A picture will appear on the screen with the exercise to complete and number of repetitions. Press the Start button to begin.
</p>
<button class ="start" id="start" onclick="start()">Start</button>
<button class ="stop" id="stop" onclick="stop()" disabled = "disabled">Stop</button>
<button class="try" id="try" onclick="tryMe()">Try Me!</button>
<p class="para" id="para"></p>
<p class="amount" id="amount"></p>
<div class ="image" id="image">
</div>
<p><a href="images/sources.txt">Picture Sources</a></p>
</body>
</html>