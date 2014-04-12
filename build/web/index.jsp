<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>CSE 336 Form</title>
<!--<link rel="stylesheet" type="text/css" href="styles.css">-->
<style>
form    {
margin:auto;
position:relative;
width:480px;
height:500px;
font-family: Tahoma, Geneva, sans-serif;
font-size: 14px;
font-style: italic;
line-height: 30px;
font-weight: bold;
color: #09C;
border-radius: 40px;
padding:40px;
border: 1px solid #999;
box-shadow: 0px 0px 8px rgba(0, 0, 0, 0.3);
}
.errorInput{
background: #F08080;
}
.ass{
color:red;
}
.terms{
font-size: 8px;
color: black;
}
#checkboxes{
    padding-left:5em;
}
.errorLabel{
color: #d00;
font-style: italic;
font-size: 10px;
}
input[type="submit"]{
width:100px;
background:#09C;
color:#fff;
}
input[type="submit"]:hover {
background: #fff;
color: #09C;
}
#banner{
	width: 18%;
	height: auto;
	padding-bottom: -40px;
	margin-bottom: -40px;
	position: relative;
	left: -20px;
	top: -20px;
	
}
</style>
<script>
var valid = true;
function validateTermBox(){
    	var label = document.getElementById("termErrorLabel");
        var v = document.getElementById("termBox");
        if(v.checked){
            label.innerHTML = "";
        }
}
function validateForm(){
	var label = document.getElementById("termErrorLabel");
        var v = document.getElementById("termBox");
        if(v.checked){
            return true;
        }else{
            label.innerHTML = "Please accept the terms and agreements.";
            return false;
        }
	
}
function checkBoxValues(){
	var checkBoxValues = [];
	var checkedBoxes = document.getElementsByName("interest");
	for(var i = 0;i < checkedBoxes.length;i++){
		if(checkedBoxes[i].checked == true){
			checkBoxValues.push(checkedBoxes[i].value);
		}
	}
	return checkBoxValues;
}
function validateFirstName(){
	var label = document.getElementById("fNameError");
	if(document.getElementById("firstname").value == ""){
	label.innerHTML = "";
	document.getElementById("firstname").className = "input_element";
	}else if(!document.getElementById("firstname")[0].value.match(/^[a-zA-Z]+$/) ){
	label.innerHTML = "Name must only contain letters";
	valid = false;
	document.getElementById("firstname").className = "errorInput";
	}else{
	label.innerHTML = "";
	document.getElementById("firstname").className = "input_element";
		valid = true;
	}
}

function validateLastName(){
	var label = document.getElementById("lNameError");
	if(document.getElementById("lastname").value == ""){
	label.innerHTML = "";
	document.getElementById("lastname").className = "input_element";
	}else if(!document.getElementById("lastname").value.match(/^[a-zA-Z]+$/) ){
	label.innerHTML = "Name must only contain letters";
	valid = false;
	document.getElementById("lastname").className = "errorInput";
	}else{
	label.innerHTML = "";
	document.getElementById("lastname").className = "input_element";
		valid = true;
	}
}
function validateEmail(){
	var label = document.getElementById("emailError");
	if(document.getElementById("email").value == ""){
	label.innerHTML = "";
	document.getElementById("email").className = "input_element";
	}else if(!document.getElementById("email").value.match(/^(([^<>()[\]\\.,;:\s@\"]+(\.[^<>()[\]\\.,;:\s@\"]+)*)|(\".+\"))@((\[[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\])|(([a-zA-Z\-0-9]+\.)+[a-zA-Z]{2,}))$/)){
	label.innerHTML = "Invalid email address";
	valid = false;
	document.getElementById("email").className = "errorInput";
	}else{
	label.innerHTML = "";
	document.getElementById("email").className = "input_element";
	valid = true;
	}

}
function validateTelephone(){
	var label = document.getElementById("telephoneError");
	var input = document.getElementById("telephone").value;
	if(input == ""){
	label.innerHTML = "";
	document.getElementById("telephone").className = "input_element";
	return;
	}
	input = input.replace(/[^\d]/g,"");
	if(input.length != 10){
	label.innerHTML = "Number must be 10 digits";
	document.getElementById("telephone").className = "errorInput";
	valid = false;
	}else{
	label.innerHTML = "";
	document.getElementById("telephone").className = "input_element";
		valid = true;
	}
}
function validateCheckBox(){
	var boxes = document.getElementsByName("interest");
	var label = document.getElementById("checkBoxError");
	for(var i = 0;i < boxes.length;i++){
		if(boxes[i].checked){
			label.innerHTML = "";
			return;
			}
	}
	label.innerHTML = "Must check at least one";
	
}
var numNodes = 0;
function countNodes(){
	var x = document.getElementsByTagName("html")[0];
	nextLevel(x);
	document.write(numNodes);
	}
function nextLevel(n){
	if(n instanceof HTMLElement && n.getAttribute("type") == "text"){
		numNodes = numNodes + 1;
	}
	if(n.hasChildNodes()){
	var a = n.childNodes;
		for(var i = 0;i < a.length;i++){
			nextLevel(a[i]);
		}
	}
	return;
}
var req;
function validateEmailS(){
    var errorMsg = document.getElementById("emailError");
    var input = document.getElementById("email");
    var url = "SimpleServlet?email="+input.value;
    //errorMsg.innerHTML = "validateEmailS called";
    req = new XMLHttpRequest();
    req.onreadystatechange = emailValidation;
    req.open("GET",url,true);
    req.send(null);
    
}
function t(){
    var em = document.getElementById("emailError");
    em.innerHTML = "blah";
}
function emailValidation(){
    var errorMsg = document.getElementById("emailError");
    
    //errorMsg.innerHTML="emailValidation called";
    //errorMsg.innerHTML = (req.responseText==null) + " " + req.readyState + " " + req.status + " " ;
    var inputEmail = document.getElementById("email");
    var inputFName = document.getElementById("firstname");
    var inputLName = document.getElementById("lastname");
    var inputPhone = document.getElementById("telephone");
    var inputCompany = document.getElementById("company");
    var inputTerm = document.getElementById("termBox");
    if(req != null && req.readyState == 4 && req.status == 200){
        /*String response = req.responseText.substring(1,req.responseText.length()-1);
        String [] a = response.split(":");
        errorMsg.innerHTML = req.responseText + " " + a[0];
            */
        if(req.responseText!='ok'){
        
        var r = JSON.parse(req.responseText);
        
        for (var key in r){
            if(r.hasOwnProperty(key)){
                var v = r[key];
                if(key.toString()==="firstname"){
                    inputFName.value = v;
                }else if(key.toString() === "lastname"){
                    inputLName.value = v;
                }else if(key.toString() === "telephone"){
                    inputPhone.value = v;
                }else if(key.toString()==="company"){
                    inputCompany.value = v;
                }else if(key.toString()==="termBox"){
                    errorMsg.innerHTML=v;
                    if(v)
                        inputTerm.checked = true;
                }
            }
        }
        }else{
            //errorMsg.innerHTML="";
        }
    }
}
function validateFirstNameS(){
    var errorMsg = document.getElementById("fNameError");
    var input = document.getElementById("firstname");
    
    req = new XMLHttpRequest();
    var url = "SimpleServlet?firstname="+input.value;
    req.onreadystatechange = firstNameValidation;
    req.open("GET",url,true);
    req.send(null);
    
}
function firstNameValidation(){
    var errorMsg = document.getElementById("fNameError");
    var input = document.getElementById("firstname");
    
    if(req != null && req.readyState == 4 && req.status == 200){
        if(req.responseText != "ok"){
            errorMsg.innerHTML = req.responseText;
        }else{
            errorMsg.innerHTML = "";
        }
    }
}
function validateLastNameS(){
    var input = document.getElementById("lastname");
    
    req = new XMLHttpRequest();
    var url = "SimpleServlet?lastname="+input.value;
    req.onreadystatechange = lastNameValidation;
    req.open("GET",url,true);
    req.send(null);
}
function lastNameValidation(){
   var errorMsg = document.getElementById("lNameError");
    
    if(req != null && req.readyState == 4 && req.status == 200){
        if(req.responseText != "ok"){
            errorMsg.innerHTML = req.responseText;
        }else{
            errorMsg.innerHTML = "";
        }
    } 
}
function validateTelephoneS(){
    var errorMsg = document.getElementById("telephoneError");
    var input = document.getElementById("telephone");
    req = new XMLHttpRequest();
    var url = "SimpleServlet?telephone="+input.value;
    req.onreadystatechange = telephoneValidation;
    req.open("GET",url,true);
    req.send(null);
}
function telephoneValidation(){
    var errorMsg = document.getElementById("telephoneError");
    if(req!=null && req.readyState == 4 && req.status ==200 ){
        if(req.responseText != 'ok'){
            errorMsg.innerHTML = req.responseText;
        }else{
            errorMsg.innerHTML = "";
        }
    }
}
</script>
</head>
<body>
<form method="post" action="SimpleServlet" onsubmit="return validateForm()" >
<img src="img/banner.png" id="banner" alt="banner">
<h2>* Denotes required field</h2>
<label>
	<span>
		Email:<span class="ass">*</span>
	</span>
<input type="text" class="input_element" id="email" onblur="validateEmailS()" name="email" placeholder="superman@gmail.com" autofocus required/><span id="emailError" class="errorLabel"></span><br>
</label>
<label>
	<span>
		First Name:<span class="ass">*</span>	
	</span>
<input type="text" class="input_element" id="firstname" onblur="validateFirstNameS()" name="fname" placeholder="Kevin" /><span id="fNameError" class="errorLabel" ></span><br>
</label>
<label>
	<span>
		Last Name:<span class="ass">*</span>
	</span>
<input type="text" class="input_element" id="lastname" onblur="validateLastNameS()" name="lname" placeholder="Qi" required /><span id="lNameError" class="errorLabel"></span><br>
</label>

<label>
	<span>
		Company:
	</span>
<input type="text" class="input_element" id="company" name="company" placeholder="Google" /><br>
</label>
<label>
	<span>
		Country:<span class="ass">*</span>
	</span>
	<select class="input_element" name="countries" >
<option value="USA">USA</option>
<option value="China">China</option>
<option value="Malaysia">Malaysia</option>
<option value="Norway">Norway</option>
<option value="Brazil">Brazil</option>
</select><br>
</label>
<label>Telephone:<span class="ass">*</span></label>
<input type="text" class="input_element" id="telephone" onblur="validateTelephoneS()" name="telephone" placeholder="(111) 111 1111" required /><span id="telephoneError" class="errorLabel"></span><br>
<label>I am interested in:<span class="ass">*</span></label><span id="checkBoxError" class="errorLabel"></span><br>
        <div id="checkboxes">
                <input type="checkbox" name="interest" value="movies" onchange="validateCheckBox()" />Movies<br>
                <input type="checkbox" name="interest" value="tv" onchange="validateCheckBox()"/>TV<br>
                <input type="checkbox" name="interest" value="soap" onchange="validateCheckBox()"/>Soap<br>
                <input type="checkbox" name="interest" value="lions" onchange="validateCheckBox()"/>Lions<br>
        </div>
<span class="terms"><input type="checkbox"class="terms" id="termBox" value="" name="termBox" onchange="validateTermBox()"/>Accept the terms of the Oracle offer   <span id="termErrorLabel" class="errorLabel"></span></span><br>
<input type="submit" id="submit_button"   name="Submit">
<label id="output" ></label>
</form>
</body>
</html>
