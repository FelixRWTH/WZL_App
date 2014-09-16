function xmlhttp() {
	var xhr;
	
	if (window.XMLHttpRequest) {
		xhr = new XMLHttpRequest(); // IE 7+, other browsers
	
	} else if (window.ActiveXObject) {
		xhr = new ActiveXObject("Microsoft.XMLHTTP"); // IE 5-6
	}
	
	return xhr;
}