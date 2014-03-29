package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta charset=\"UTF-8\">\n");
      out.write("<title>CSE 336 Form</title>\n");
      out.write("<!--<link rel=\"stylesheet\" type=\"text/css\" href=\"styles.css\">-->\n");
      out.write("<style>\n");
      out.write("form    {\n");
      out.write("margin:auto;\n");
      out.write("position:relative;\n");
      out.write("width:480px;\n");
      out.write("height:500px;\n");
      out.write("font-family: Tahoma, Geneva, sans-serif;\n");
      out.write("font-size: 14px;\n");
      out.write("font-style: italic;\n");
      out.write("line-height: 30px;\n");
      out.write("font-weight: bold;\n");
      out.write("color: #09C;\n");
      out.write("border-radius: 40px;\n");
      out.write("padding:40px;\n");
      out.write("border: 1px solid #999;\n");
      out.write("box-shadow: 0px 0px 8px rgba(0, 0, 0, 0.3);\n");
      out.write("}\n");
      out.write(".errorInput{\n");
      out.write("background: #F08080;\n");
      out.write("}\n");
      out.write(".ass{\n");
      out.write("color:red;\n");
      out.write("}\n");
      out.write(".errorLabel{\n");
      out.write("color: #d00;\n");
      out.write("font-style: italic;\n");
      out.write("font-size: 10px;\n");
      out.write("}\n");
      out.write("input[type=\"submit\"]{\n");
      out.write("width:100px;\n");
      out.write("background:#09C;\n");
      out.write("color:#fff;\n");
      out.write("}\n");
      out.write("input[type=\"submit\"]:hover {\n");
      out.write("background: #fff;\n");
      out.write("color: #09C;\n");
      out.write("}\n");
      out.write("#banner{\n");
      out.write("\twidth: 18%;\n");
      out.write("\theight: auto;\n");
      out.write("\tpadding-bottom: -40px;\n");
      out.write("\tmargin-bottom: -40px;\n");
      out.write("\tposition: relative;\n");
      out.write("\tleft: -20px;\n");
      out.write("\ttop: -20px;\n");
      out.write("\t\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("<script>\n");
      out.write("var valid = true;\n");
      out.write("function validateForm(){\n");
      out.write("\tvar a = checkBoxValues();\n");
      out.write("\tvar label = document.getElementById(\"checkBoxError\");\n");
      out.write("\tif(a.length == 0){\n");
      out.write("\t\tlabel.innerHTML = \"Must check at least one\";\n");
      out.write("\t\treturn false;\n");
      out.write("\t}\n");
      out.write("\tif(valid)\n");
      out.write("\treturn true;\n");
      out.write("\telse\n");
      out.write("\treturn false;\n");
      out.write("\t/*\n");
      out.write("\tvar labelOutput = document.getElementById(\"output\");\n");
      out.write("\tfor(var i = 0;i < a.length;i++){\n");
      out.write("\t\tlabelOutput.appendChild(document.createTextNode(a[i]));\n");
      out.write("\t\tlabelOutput.appendChild(document.createElement(\"br\"));\n");
      out.write("\t}\n");
      out.write("\t*/\n");
      out.write("\t\n");
      out.write("}\n");
      out.write("function checkBoxValues(){\n");
      out.write("\tvar checkBoxValues = [];\n");
      out.write("\tvar checkedBoxes = document.getElementsByName(\"interest\");\n");
      out.write("\tfor(var i = 0;i < checkedBoxes.length;i++){\n");
      out.write("\t\tif(checkedBoxes[i].checked == true){\n");
      out.write("\t\t\tcheckBoxValues.push(checkedBoxes[i].value);\n");
      out.write("\t\t}\n");
      out.write("\t}\n");
      out.write("\treturn checkBoxValues;\n");
      out.write("}\n");
      out.write("function validateFirstName(){\n");
      out.write("\tvar label = document.getElementById(\"fNameError\");\n");
      out.write("\tif(document.getElementById(\"firstname\").value == \"\"){\n");
      out.write("\tlabel.innerHTML = \"\";\n");
      out.write("\tdocument.getElementById(\"firstname\").className = \"input_element\";\n");
      out.write("\t}else if(!document.getElementById(\"firstname\")[0].value.match(/^[a-zA-Z]+$/) ){\n");
      out.write("\tlabel.innerHTML = \"Name must only contain letters\";\n");
      out.write("\tvalid = false;\n");
      out.write("\tdocument.getElementById(\"firstname\").className = \"errorInput\";\n");
      out.write("\t}else{\n");
      out.write("\tlabel.innerHTML = \"\";\n");
      out.write("\tdocument.getElementById(\"firstname\").className = \"input_element\";\n");
      out.write("\t\tvalid = true;\n");
      out.write("\t}\n");
      out.write("}\n");
      out.write("\n");
      out.write("function validateLastName(){\n");
      out.write("\tvar label = document.getElementById(\"lNameError\");\n");
      out.write("\tif(document.getElementById(\"lastname\").value == \"\"){\n");
      out.write("\tlabel.innerHTML = \"\";\n");
      out.write("\tdocument.getElementById(\"lastname\").className = \"input_element\";\n");
      out.write("\t}else if(!document.getElementById(\"lastname\").value.match(/^[a-zA-Z]+$/) ){\n");
      out.write("\tlabel.innerHTML = \"Name must only contain letters\";\n");
      out.write("\tvalid = false;\n");
      out.write("\tdocument.getElementById(\"lastname\").className = \"errorInput\";\n");
      out.write("\t}else{\n");
      out.write("\tlabel.innerHTML = \"\";\n");
      out.write("\tdocument.getElementById(\"lastname\").className = \"input_element\";\n");
      out.write("\t\tvalid = true;\n");
      out.write("\t}\n");
      out.write("}\n");
      out.write("function validateEmail(){\n");
      out.write("\tvar label = document.getElementById(\"emailError\");\n");
      out.write("\tif(document.getElementById(\"email\").value == \"\"){\n");
      out.write("\tlabel.innerHTML = \"\";\n");
      out.write("\tdocument.getElementById(\"email\").className = \"input_element\";\n");
      out.write("\t}else if(!document.getElementById(\"email\").value.match(/^(([^<>()[\\]\\\\.,;:\\s@\\\"]+(\\.[^<>()[\\]\\\\.,;:\\s@\\\"]+)*)|(\\\".+\\\"))@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\])|(([a-zA-Z\\-0-9]+\\.)+[a-zA-Z]{2,}))$/)){\n");
      out.write("\tlabel.innerHTML = \"Invalid email address\";\n");
      out.write("\tvalid = false;\n");
      out.write("\tdocument.getElementById(\"email\").className = \"errorInput\";\n");
      out.write("\t}else{\n");
      out.write("\tlabel.innerHTML = \"\";\n");
      out.write("\tdocument.getElementById(\"email\").className = \"input_element\";\n");
      out.write("\tvalid = true;\n");
      out.write("\t}\n");
      out.write("\n");
      out.write("}\n");
      out.write("function validateTelephone(){\n");
      out.write("\tvar label = document.getElementById(\"telephoneError\");\n");
      out.write("\tvar input = document.getElementById(\"telephone\").value;\n");
      out.write("\tif(input == \"\"){\n");
      out.write("\tlabel.innerHTML = \"\";\n");
      out.write("\tdocument.getElementById(\"telephone\").className = \"input_element\";\n");
      out.write("\treturn;\n");
      out.write("\t}\n");
      out.write("\tinput = input.replace(/[^\\d]/g,\"\");\n");
      out.write("\tif(input.length != 10){\n");
      out.write("\tlabel.innerHTML = \"Number must be 10 digits\";\n");
      out.write("\tdocument.getElementById(\"telephone\").className = \"errorInput\";\n");
      out.write("\tvalid = false;\n");
      out.write("\t}else{\n");
      out.write("\tlabel.innerHTML = \"\";\n");
      out.write("\tdocument.getElementById(\"telephone\").className = \"input_element\";\n");
      out.write("\t\tvalid = true;\n");
      out.write("\t}\n");
      out.write("}\n");
      out.write("function validateCheckBox(){\n");
      out.write("\tvar boxes = document.getElementsByName(\"interest\");\n");
      out.write("\tvar label = document.getElementById(\"checkBoxError\");\n");
      out.write("\tfor(var i = 0;i < boxes.length;i++){\n");
      out.write("\t\tif(boxes[i].checked){\n");
      out.write("\t\t\tlabel.innerHTML = \"\";\n");
      out.write("\t\t\treturn;\n");
      out.write("\t\t\t}\n");
      out.write("\t}\n");
      out.write("\tlabel.innerHTML = \"Must check at least one\";\n");
      out.write("\t\n");
      out.write("}\n");
      out.write("var numNodes = 0;\n");
      out.write("function countNodes(){\n");
      out.write("\tvar x = document.getElementsByTagName(\"html\")[0];\n");
      out.write("\tnextLevel(x);\n");
      out.write("\tdocument.write(numNodes);\n");
      out.write("\t}\n");
      out.write("function nextLevel(n){\n");
      out.write("\tif(n instanceof HTMLElement && n.getAttribute(\"type\") == \"text\"){\n");
      out.write("\t\tnumNodes = numNodes + 1;\n");
      out.write("\t}\n");
      out.write("\tif(n.hasChildNodes()){\n");
      out.write("\tvar a = n.childNodes;\n");
      out.write("\t\tfor(var i = 0;i < a.length;i++){\n");
      out.write("\t\t\tnextLevel(a[i]);\n");
      out.write("\t\t}\n");
      out.write("\t}\n");
      out.write("\treturn;\n");
      out.write("}\n");
      out.write("var req;\n");
      out.write("function validateEmailS(){\n");
      out.write("    var errorMsg = document.getElementById(\"emailError\");\n");
      out.write("    var input = document.getElementById(\"email\");\n");
      out.write("    var url = \"SimpleServlet?email=\"+input.value;\n");
      out.write("    //errorMsg.innerHTML=\"validateEmailS called\";\n");
      out.write("    req = new XMLHttpRequest();\n");
      out.write("    req.onreadystatechange = emailValidation;\n");
      out.write("    req.open(\"GET\",url,true);\n");
      out.write("    req.send(null);\n");
      out.write("}\n");
      out.write("function emailValidation(){\n");
      out.write("    var errorMsg = document.getElementById(\"emailError\");\n");
      out.write("    //errorMsg.innerHTML=\"emailValidation called\";\n");
      out.write("    //errorMsg.innerHTML = (req.responseText==null) + \" \" + req.readyState + \" \" + req.status + \" \" ;\n");
      out.write("    var input = document.getElementById(\"email\");\n");
      out.write("    if(req != null && req.readyState == 4 && req.status == 200){\n");
      out.write("        if(req.responseText!='ok'){\n");
      out.write("            errorMsg.innerHTML = req.responseText;\n");
      out.write("        }else{\n");
      out.write("            errorMsg.innerHTML = \"\";\n");
      out.write("        }\n");
      out.write("    }\n");
      out.write("}\n");
      out.write("function validateFirstNameS(){\n");
      out.write("    var errorMsg = document.getElementById(\"fNameError\");\n");
      out.write("    var input = document.getElementById(\"firstname\");\n");
      out.write("    \n");
      out.write("    req = new XMLHttpRequest();\n");
      out.write("    var url = \"SimpleServlet?firstname=\"+input.value;\n");
      out.write("    req.onreadystatechange = firstNameValidation;\n");
      out.write("    req.open(\"GET\",url,true);\n");
      out.write("    req.send(null);\n");
      out.write("}\n");
      out.write("function firstNameValidation(){\n");
      out.write("    var errorMsg = document.getElementById(\"fNameError\");\n");
      out.write("    var input = document.getElementById(\"firstname\");\n");
      out.write("    \n");
      out.write("    if(req != null && req.readyState == 4 && req.status == 200){\n");
      out.write("        if(req.responseText != \"ok\"){\n");
      out.write("            errorMsg.innerHTML = req.responseText;\n");
      out.write("        }else{\n");
      out.write("            errorMsg.innerHTML = \"\";\n");
      out.write("        }\n");
      out.write("    }\n");
      out.write("}\n");
      out.write("function validateLastNameS(){\n");
      out.write("    var input = document.getElementById(\"lastname\");\n");
      out.write("    \n");
      out.write("    req = new XMLHttpRequest();\n");
      out.write("    var url = \"SimpleServlet?lastname=\"+input.value;\n");
      out.write("    req.onreadystatechange = lastNameValidation;\n");
      out.write("    req.open(\"GET\",url,true);\n");
      out.write("    req.send(null);\n");
      out.write("}\n");
      out.write("function lastNameValidation(){\n");
      out.write("   var errorMsg = document.getElementById(\"lNameError\");\n");
      out.write("    \n");
      out.write("    if(req != null && req.readyState == 4 && req.status == 200){\n");
      out.write("        if(req.responseText != \"ok\"){\n");
      out.write("            errorMsg.innerHTML = req.responseText;\n");
      out.write("        }else{\n");
      out.write("            errorMsg.innerHTML = \"\";\n");
      out.write("        }\n");
      out.write("    } \n");
      out.write("}\n");
      out.write("function validateTelephoneS(){\n");
      out.write("    var errorMsg = document.getElementById(\"telephoneError\");\n");
      out.write("    var input = document.getElementById(\"telephone\");\n");
      out.write("    req = new XMLHttpRequest();\n");
      out.write("    var url = \"SimpleServlet?telephone=\"+input.value;\n");
      out.write("    req.onreadystatechange = telephoneValidation;\n");
      out.write("    req.open(\"GET\",url,true);\n");
      out.write("    req.send(null);\n");
      out.write("}\n");
      out.write("function telephoneValidation(){\n");
      out.write("    var errorMsg = document.getElementById(\"telephoneError\");\n");
      out.write("    if(req!=null && req.readyState == 4 && req.status ==200 ){\n");
      out.write("        if(req.responseText != 'ok'){\n");
      out.write("            errorMsg.innerHTML = req.responseText;\n");
      out.write("        }else{\n");
      out.write("            errorMsg.innerHTML = \"\";\n");
      out.write("        }\n");
      out.write("    }\n");
      out.write("}\n");
      out.write("</script>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<form method=\"post\" action=\"static.html\" onsubmit=\"return validateForm()\" >\n");
      out.write("<img src=\"img/banner.png\" id=\"banner\" alt=\"banner\">\n");
      out.write("<h2>* Denotes required field</h2>\n");
      out.write("<label>\n");
      out.write("\t<span>\n");
      out.write("\t\tEmail:<span class=\"ass\">*</span>\n");
      out.write("\t</span>\n");
      out.write("<input type=\"text\" class=\"input_element\" id=\"email\" onblur=\"validateEmailS()\" placeholder=\"superman@gmail.com\" autofocus required/><span id=\"emailError\" class=\"errorLabel\"></span><br>\n");
      out.write("</label>\n");
      out.write("<label>\n");
      out.write("\t<span>\n");
      out.write("\t\tFirst Name:<span class=\"ass\">*</span>\t\n");
      out.write("\t</span>\n");
      out.write("<input type=\"text\" class=\"input_element\" id=\"firstname\" onblur=\"validateFirstNameS()\" placeholder=\"Kevin\" /><span id=\"fNameError\" class=\"errorLabel\" ></span><br>\n");
      out.write("</label>\n");
      out.write("<label>\n");
      out.write("\t<span>\n");
      out.write("\t\tLast Name:<span class=\"ass\">*</span>\n");
      out.write("\t</span>\n");
      out.write("<input type=\"text\" class=\"input_element\" id=\"lastname\" onblur=\"validateLastNameS()\" placeholder=\"Qi\" required /><span id=\"lNameError\" class=\"errorLabel\"></span><br>\n");
      out.write("</label>\n");
      out.write("\n");
      out.write("<label>\n");
      out.write("\t<span>\n");
      out.write("\t\tCompany:\n");
      out.write("\t</span>\n");
      out.write("<input type=\"text\" class=\"input_element\" id=\"company\" placeholder=\"Google\" /><br>\n");
      out.write("</label>\n");
      out.write("<label>\n");
      out.write("\t<span>\n");
      out.write("\t\tCountry:<span class=\"ass\">*</span>\n");
      out.write("\t</span>\n");
      out.write("\t<select class=\"input_element\" name=\"countries\" >\n");
      out.write("<option value=\"USA\">USA</option>\n");
      out.write("<option value=\"China\">China</option>\n");
      out.write("<option value=\"Malaysia\">Malaysia</option>\n");
      out.write("<option value=\"Norway\">Norway</option>\n");
      out.write("<option value=\"Brazil\">Brazil</option>\n");
      out.write("</select><br>\n");
      out.write("</label>\n");
      out.write("<label>Telephone:<span class=\"ass\">*</span></label>\n");
      out.write("<input type=\"text\" class=\"input_element\" id=\"telephone\" onblur=\"validateTelephoneS()\" placeholder=\"(111) 111 1111\" required /><span id=\"telephoneError\" class=\"errorLabel\"></span><br>\n");
      out.write("<label>I am interested in:<span class=\"ass\">*</span></label><span id=\"checkBoxError\" class=\"errorLabel\"></span><br>\n");
      out.write("\t\t\t\t\t<input type=\"checkbox\" name=\"interest\" value=\"movies\" onchange=\"validateCheckBox()\" />Movies<br>\n");
      out.write("\t\t\t\t\t<input type=\"checkbox\" name=\"interest\" value=\"tv\" onchange=\"validateCheckBox()\"/>TV<br>\n");
      out.write("\t\t\t\t\t<input type=\"checkbox\" name=\"interest\" value=\"soap\" onchange=\"validateCheckBox()\"/>Soap<br>\n");
      out.write("\t\t\t\t\t<input type=\"checkbox\" name=\"interest\" value=\"lions\" onchange=\"validateCheckBox()\"/>Lions<br>\n");
      out.write("\n");
      out.write("<input type=\"submit\" id=\"submit_button\"  name=\"Submit\">\n");
      out.write("<label id=\"output\" ></label>\n");
      out.write("</form>\n");
      out.write("</body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
