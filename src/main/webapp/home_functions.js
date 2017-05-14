function sentAlert() {
	alert("Your message has been sent. I will get back to you as soon as possible. Thank you!");
	document.getElementById("contact").reset();
}
$(document).ready(function(){
$('img.resize, div.aboutMe').hover(function(){
	$(this).css('opacity','.7');
}, 
function() {
	$(this).css("opacity",".3");
});
});
//buttons
$(document).ready(function(){
	$('input.App, a.contactMe').hover(function(){
		$(this).css('opacity','1');
	},
	function() {
		$(this).css("opacity",".5");
	});
});
function websiteInfo() 
{
if ($('#websiteInfo').css('display') == 'none')
{
	$('#websiteInfo').css('display','block');
}
else {
	$('#websiteInfo').css('display', 'none');
}
}
function freshInfo() 
{
if ($('#freshInfo').css('display') == 'none')
{
	$('#freshInfo').css('display','block');
}
else {
	$('#freshInfo').css('display', 'none');
}
}
function emailSec() {
	if ($('#emailSec').css('display') == 'none')
	{
		$('#emailSec').css('display','block');
	}
	else {
		$('#emailSec').css('display', 'none');
	}
}
//email
function email() {
	
}