<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<script type="text/javascript" src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script type="text/javascript" src="home_functions.js"></script>
<link rel= "stylesheet" type= "text/css" href="home.css"/>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>homePage</title>
<body>
	<h1>Neel Patel</h1>
	<h2 class="sub">Student, Software Engineer</h2>
	<div class="icons">
		<div class="icon">
		<a class = "about" href="#aboutMe">
		About
		</a>
		</div>
		<div class="icon">
		<a class = "personal" href="#personal">
		Info
		</a>
		</div>
		<div class="icon">
		<a class = "projects" href="#projects">
		Projects
		</a>
		</div>
		<div class="icon">
		<a class = "contact" href="#contact">
		Contact Info
		</a>
		</div>
	</div>
	<h2 class="about" id="aboutMe">About</h2>
	<div class="aboutMe">
	<div class="mypic">
	 <img class="mypic" src=images/Neel_Patel.jpg></img>
	 </div>
	<div class="aboutText">
	Neel is a current Rodman Scholar at the University of Virginia,
	pursuing a double major in Computer Science and Financial Economics.
	In terms of software development, he is most skilled in Java, C++ and web development languages such as 
	HTML, CSS, and JavaScript. Currently, Neel is working towards his degrees
	and on his own independent projects.
	 </div>
	
	 </div>
	 <div class ="picture">
	 
	 </div>
	<h2 class="info" id="personal">Personal Information</h2>
	<div class= "personal" id="personal">
		<div class="aboutImage" id= "education">
		<img id="educationOne" class= "resize" src="Info/Education.png">
		</div>
		<div class="aboutImage" id= "skills"> 
		<img id="skills" class= "resize" src="Info/Skills.png">
		</div>
	</div>
	<h2 class="projects">Projects</h2>
	<div class="projects" id="projects">
	<div class="project" id="projectOne">
		<form action = "/ActiveSettings" method= "GET">
			<input class= "App" type="submit" value= "Active Mind App" />
		</form>
	</div>
	<div class="project" id="projectTwo">
		<input type="button" class="App" onclick="websiteInfo()" value="This Website"/>
	</div>
	<div class="project" id="projectThree">
		<input type="button" class="App" onclick="freshInfo()" value="FreSh Mobile App"/>
	</div>
	</div>
	<div id="websiteInfo" class="websiteInfo" style="display: none">
	 This website was created mainly as a means of conveying professional information, but also as an educational tool for myself.
	 I include this website  among my coding projects because I coded it from scratch, 
	without the use of any external templates or startups. (Re-click button to close) </div>
	<div id="freshInfo" class="freshInfo" style="display:none">
	Application that crowdsources information about Free giveaways around campuses. It will then use 
	this information to give alerts about locations, times etc. Currently in development stages. (Re-click button to close)
	</div>
	<h2 id="contact" class="contact">Contact Me</h2>
	<div class="contact" id="contactDiv">
	<a href = "https://www.linkedin.com/in/npatel14" class ="contactMe">LinkedIn</a>
	<a href = "https://github.com/neelpatel14" class = "contactMe">Github</a>
	<a class = "contactMe" onclick = "emailSec()">Email</a>
	</div>
	<div id ="emailSec" class ="emailSec" style= "display:none">
	Please email me at np2ch@virginia.edu, and I will get back to you as soon as possible.
	</div>
</body>
</html>

