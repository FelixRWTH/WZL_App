function updateStepName(text) {
			document.getElementById('stepName').innerHTML = text.value.toUpperCase();
}

function updateProgress(progress) {
	document.getElementById('sliderText').innerHTML = progress.value;
}



function startTime() {
    var today=new Date();
    var h=today.getHours();
    var m=today.getMinutes();
    var s=today.getSeconds();
    m = checkTime(m);
    s = checkTime(s);
    document.getElementById('deviceTime').innerHTML = h+":"+m+":"+s;
    var t = setTimeout(function(){startTime()},500);
}

function checkTime(i) {
    if (i<10) {i = "0" + i};  // add zero in front of numbers < 10
    return i;
}


function selectInput(radioButtons) {
	var elements;
	switch (radioButtons.value) {
	case "textInput":
		elements = document.getElementsByClassName("textAreaInput");
		for (var i = 0; i < elements.length; i ++) {
			elements[i].style.display = 'none';
		}
		elements = document.getElementsByClassName("sliderInput");
		for (var i = 0; i < elements.length; i ++) {
			elements[i].style.display = 'none';
		}
		elements = document.getElementsByClassName("textInput");
		for (var i = 0; i < elements.length; i ++) {
			elements[i].style.display = 'block';
		}
		elements = document.getElementsByClassName("selectOneInput");
		for (var i = 0; i < elements.length; i ++) {
			elements[i].style.display = 'none';
		}
		break;
	case "textAreaInput":
		elements = document.getElementsByClassName("textAreaInput");
		for (var i = 0; i < elements.length; i ++) {
			elements[i].style.display = 'block';
		}
		elements = document.getElementsByClassName("sliderInput");
		for (var i = 0; i < elements.length; i ++) {
			elements[i].style.display = 'none';
		}
		elements = document.getElementsByClassName("textInput");
		for (var i = 0; i < elements.length; i ++) {
			elements[i].style.display = 'none';
		}
		elements = document.getElementsByClassName("selectOneInput");
		for (var i = 0; i < elements.length; i ++) {
			elements[i].style.display = 'none';
		}
		break;
	case "sliderInput":
		elements = document.getElementsByClassName("textAreaInput");
		for (var i = 0; i < elements.length; i ++) {
			elements[i].style.display = 'none';
		}
		elements = document.getElementsByClassName("sliderInput");
		for (var i = 0; i < elements.length; i ++) {
			elements[i].style.display = 'initial';
		}
		elements = document.getElementsByClassName("textInput");
		for (var i = 0; i < elements.length; i ++) {
			elements[i].style.display = 'none';
		}
		elements = document.getElementsByClassName("selectOneInput");
		for (var i = 0; i < elements.length; i ++) {
			elements[i].style.display = 'none';
		}
		break;
	case "selectOneInput":
		elements = document.getElementsByClassName("textAreaInput");
		for (var i = 0; i < elements.length; i ++) {
			elements[i].style.display = 'none';
		}
		elements = document.getElementsByClassName("sliderInput");
		for (var i = 0; i < elements.length; i ++) {
			elements[i].style.display = 'none';
		}
		elements = document.getElementsByClassName("textInput");
		for (var i = 0; i < elements.length; i ++) {
			elements[i].style.display = 'none';
		}
		elements = document.getElementsByClassName("selectOneInput");
		for (var i = 0; i < elements.length; i ++) {
			elements[i].style.display = 'initial';
		}
		break;
	}
}