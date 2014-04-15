<html>
<head>
    <style>
    <jsp:include page="WEB-INF/formStyle.css" />
    </style>
</head>
<body>
    <jsp:useBean id="formBean" class="myPackage.FormBean" />
    <form method="post" action="SimpleServlet"  >
<img src="img/banner.png" id="banner" alt="banner">
<h2>* Denotes required field</h2>
<label>
	<span>
		Email:<span class="ass">*</span>
	</span>
    <input type="text" class="input_element" id="email"  name="email" placeholder="superman@gmail.com" value="${requestScope.fname}" autofocus required/><span id="emailError" class="errorLabel"></span><br>
</label>
    <%-- <%= (String)request.getSession().getAttribute("fname") --%>
    <%-- NOT ${request["attributeName"]} INSTEAD USE ${attributeName} SO EASY RIGHT!!?--%>
<label>
	<span>
		First Name:<span class="ass">*</span>	
	</span>
<input type="text" class="input_element" id="firstname"  name="fname" value="${formBean.getfName()}"/><span id="fNameError" class="errorLabel" ></span><br>
</label>
<label>
	<span>
		Last Name:<span class="ass">*</span>
	</span>
<input type="text" class="input_element" id="lastname" name="lname" value="${formBean.getlName()}" required /><span id="lNameError" class="errorLabel"></span><br>
</label>

<label>
	<span>
		Company:
	</span>
<input type="text" class="input_element" id="company" name="company"  /><br>
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
<input type="text" class="input_element" id="telephone" name="telephone" value="${formBean.getTelephone()}"required /><span id="telephoneError" class="errorLabel"></span><br>
<label>I am interested in:<span class="ass">*</span></label><span id="checkBoxError" class="errorLabel"></span><br>
        <div id="checkboxes">
                <input type="checkbox" name="interest" value="movies"  />Movies<br>
                <input type="checkbox" name="interest" value="tv" />TV<br>
                <input type="checkbox" name="interest" value="soap" />Soap<br>
                <input type="checkbox" name="interest" value="lions" />Lions<br>
        </div>
<span class="terms"><input type="checkbox"class="terms" id="termBox" value="" name="termBox"/>Accept the terms of the Oracle offer   <span id="termErrorLabel" class="errorLabel"></span></span><br>
<input type="submit" id="submit_button"   name="Submit">
<label id="output" ></label>
</form>

</body>
</html>