//for application page
var script = document.createElement('script');
script.src = 'http://code.jquery.com/jquery-1.11.0.min.js';
script.type = 'text/javascript';
document.getElementsByTagName('head')[0].appendChild(script);
var timer;
var alarmSound = new Audio("images/sound.wav");
function clearDisplay() {
	document.getElementById("image").innerHTML= "";
	document.getElementById("amount").innerHTML = "";
	$("body").removeClass("animation");
	document.getElementById("try").removeAttribute("disabled");
	if(queryString[1] == "sound") {
		alarmSound.pause();
		alarmSound.currentTime = 0;
	}
}

function start() {
clearDisplay();
timer = setInterval(displayAlert ,queryString[0] * 60000);
document.getElementById("start").setAttribute("disabled","disabled");
document.getElementById("try").setAttribute("disabled","disabled");
document.getElementById("para").innerHTML = "Application currently running";
document.getElementById("stop").removeAttribute("disabled");
}

function displayAlert() {
clearInterval(timer);
document.getElementById("para").innerHTML = "";
if(queryString[1] == "light") {
	$("body").addClass("animation");
}
if(queryString[1] == "sound") {
	alarmSound.play();
}
clearButton();
var dismiss = document.createElement("button");
dismiss.setAttribute("class","dismiss");
dismiss.innerHTML = "Done!";
document.getElementById("image").appendChild(dismiss);
dismiss.addEventListener("click", function(){
	$("body").removeClass("animation");
	start();
});
chooseAlert();
}

function repetitions(num) {
	var timeExercise;
	if (num>5) {
	timeExercise = Math.floor((Math.random() * 26) +20)+ " secs-";
	}
	else {
		timeExercise = Math.floor((Math.random() * 16)+10);
	}
	return timeExercise;
	
}


function chooseAlert() {
	//choose exercise
	var number = Math.floor((Math.random() * 7) +1);
	var totalAmount = repetitions(number);
	var name;
	//choose pic
	var pic = document.createElement("img");
	if(number==1) {
		name="Sit-Ups!";
		pic.src="images/Sit-ups.jpg";
	}
	if(number==2) {
		name="Push-ups!";
		pic.src="images/Push_Up.jpg";
	}
	if(number==3) {
		name="Crunches!";
		pic.src="images/crunch.jpg";
	}
	if(number ==4) {
		name="Jumping Jacks!";
		pic.src="images/jumping_jacks.jpg";
	}
	if(number ==5){
		name="Squats!";
		pic.src="images/squat.jpg";
	}
	if(number==6) {
		name="Wall-Sits!";
		pic.src="images/wall-sit.png";
	}
	if(number==7) {
		name="Plank!";
		pic.src="images/plank.jpg";
	}
	pic.setAttribute("height", "468");
	pic.setAttribute("width", "1024");
	pic.setAttribute("class", "exercise");
	document.getElementById("image").appendChild(pic);
	//create button
	/*var dismiss = document.createElement("button");
	dismiss.setAttribute("class","dismiss");
	dismiss.innerHTML = "Dismiss";
	document.getElementById("image").appendChild(dismiss);
	dismiss.addEventListener("click", function(){
		$("body").removeClass("animation");
		start();
	});*/
	// add amount
	document.getElementById("amount").innerHTML = totalAmount + " " + name;
}

function tryMe() {
	document.getElementById("try").setAttribute("disabled","disabled");
	document.getElementById("para").innerHTML = "";
	document.getElementById("stop").removeAttribute("disabled");
	if(queryString[1] == "light") {
		$("body").addClass("animation");
	}
	if(queryString[1] == "sound") {
		alarmSound.play();
	}
	clearButton();
	var dismiss = document.createElement("button");
	dismiss.setAttribute("class","dismiss");
	dismiss.innerHTML = "Done!";
	document.getElementById("image").appendChild(dismiss);
	dismiss.addEventListener("click", function(){
		clearDisplay();
		alarmSound.pause();
		alarmSound.currentTime = 0;
		
	});
	chooseAlert();
}

function clearButton() {
	var clearNoti = document.createElement("button");
	clearNoti.setAttribute("class","clearNoti");
	clearNoti.innerHTML = "Stop Alarm";
	document.getElementById("image").appendChild(clearNoti);
	clearNoti.addEventListener("click", function() {
	if(queryString[1] == "sound") {
		alarmSound.pause();
		alarmSound.currentTime = 0;
	}
	else {
	$("body").removeClass("animation");
	}
	});
}
function stop() {
clearDisplay();
clearInterval(timer);
document.getElementById("para").innerHTML = "Appplication is stopped";
document.getElementById("stop").setAttribute("disabled","disabled");
document.getElementById("start").removeAttribute("disabled");
}

//for Settings
var time = false;
var type = false;
function checkTime() {
	time = true;
	if(time == true && type == true)
		{
	document.getElementById("form1").elements[5].removeAttribute("disabled");
		}
}
function checkType () {
	type = true;
	if(time == true && type == true)
	{
		document.getElementById("form1").elements[5].removeAttribute("disabled");
	}
}

//to get string parameters
var queryString = function () {
	  // This function is anonymous, is executed immediately and 
	  // the return value is assigned to QueryString!
	  var query_string = [];
	  var query = window.location.search.substring(1);
	  var splitVer = query.split("&");
	  var xx = splitVer[0].substring(splitVer[0].indexOf("=") + 1,splitVer[0].length);
	  var yy = splitVer[1].substring(splitVer[1].indexOf("=") + 1,splitVer[1].length);
	  query_string.push(xx);
 	  query_string.push(yy);
	  return query_string;
	}();

	
