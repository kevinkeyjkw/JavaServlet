package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class formJSP_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<html>\n");
      out.write("<head>\n");
      out.write("    <style>\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "WEB-INF/formStyle.css", out, false);
      out.write("\n");
      out.write("    </style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    ");
      myPackage.FormBean formBean = null;
      synchronized (_jspx_page_context) {
        formBean = (myPackage.FormBean) _jspx_page_context.getAttribute("formBean", PageContext.PAGE_SCOPE);
        if (formBean == null){
          formBean = new myPackage.FormBean();
          _jspx_page_context.setAttribute("formBean", formBean, PageContext.PAGE_SCOPE);
        }
      }
      out.write("\n");
      out.write("    <form method=\"post\" action=\"SimpleServlet\"  >\n");
      out.write("<img src=\"img/banner.png\" id=\"banner\" alt=\"banner\">\n");
      out.write("<h2>* Denotes required field</h2>\n");
      out.write("<label>\n");
      out.write("\t<span>\n");
      out.write("\t\tEmail:<span class=\"ass\">*</span>\n");
      out.write("\t</span>\n");
      out.write("    <input type=\"text\" class=\"input_element\" id=\"email\"  name=\"email\" placeholder=\"superman@gmail.com\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.fname}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" autofocus required/><span id=\"emailError\" class=\"errorLabel\"></span><br>\n");
      out.write("</label>\n");
      out.write("    ");
      out.write("\n");
      out.write("    ");
      out.write("\n");
      out.write("<label>\n");
      out.write("\t<span>\n");
      out.write("\t\tFirst Name:<span class=\"ass\">*</span>\t\n");
      out.write("\t</span>\n");
      out.write("<input type=\"text\" class=\"input_element\" id=\"firstname\"  name=\"fname\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${formBean.getfName()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"/><span id=\"fNameError\" class=\"errorLabel\" ></span><br>\n");
      out.write("</label>\n");
      out.write("<label>\n");
      out.write("\t<span>\n");
      out.write("\t\tLast Name:<span class=\"ass\">*</span>\n");
      out.write("\t</span>\n");
      out.write("<input type=\"text\" class=\"input_element\" id=\"lastname\" name=\"lname\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${formBean.getlName()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" required /><span id=\"lNameError\" class=\"errorLabel\"></span><br>\n");
      out.write("</label>\n");
      out.write("\n");
      out.write("<label>\n");
      out.write("\t<span>\n");
      out.write("\t\tCompany:\n");
      out.write("\t</span>\n");
      out.write("<input type=\"text\" class=\"input_element\" id=\"company\" name=\"company\"  /><br>\n");
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
      out.write("<input type=\"text\" class=\"input_element\" id=\"telephone\" name=\"telephone\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${formBean.getTelephone()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"required /><span id=\"telephoneError\" class=\"errorLabel\"></span><br>\n");
      out.write("<label>I am interested in:<span class=\"ass\">*</span></label><span id=\"checkBoxError\" class=\"errorLabel\"></span><br>\n");
      out.write("        <div id=\"checkboxes\">\n");
      out.write("                <input type=\"checkbox\" name=\"interest\" value=\"movies\"  />Movies<br>\n");
      out.write("                <input type=\"checkbox\" name=\"interest\" value=\"tv\" />TV<br>\n");
      out.write("                <input type=\"checkbox\" name=\"interest\" value=\"soap\" />Soap<br>\n");
      out.write("                <input type=\"checkbox\" name=\"interest\" value=\"lions\" />Lions<br>\n");
      out.write("        </div>\n");
      out.write("<span class=\"terms\"><input type=\"checkbox\"class=\"terms\" id=\"termBox\" value=\"\" name=\"termBox\"/>Accept the terms of the Oracle offer   <span id=\"termErrorLabel\" class=\"errorLabel\"></span></span><br>\n");
      out.write("<input type=\"submit\" id=\"submit_button\"   name=\"Submit\">\n");
      out.write("<label id=\"output\" ></label>\n");
      out.write("</form>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>");
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
