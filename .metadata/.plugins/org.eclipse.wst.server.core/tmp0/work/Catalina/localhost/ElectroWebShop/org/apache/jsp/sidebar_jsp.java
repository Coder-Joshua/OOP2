/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.19
 * Generated at: 2019-05-05 01:36:13 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class sidebar_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("\n");
      out.write("<title>Sidebar</title>\n");
      out.write("<meta charset=\"ISO-8859-1\">\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("<link rel=\"stylesheet\" href=\"https://www.w3schools.com/w3css/4/w3.css\">\n");
      out.write("<link rel=\"stylesheet\"\n");
      out.write("\thref=\"https://fonts.googleapis.com/css?family=Roboto\">\n");
      out.write("<link rel=\"stylesheet\"\n");
      out.write("\thref=\"https://fonts.googleapis.com/css?family=Montserrat\">\n");
      out.write("<link rel=\"stylesheet\"\n");
      out.write("\thref=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<style>\n");
      out.write(".w3-sidebar a {\n");
      out.write("\tfont-family: \"Roboto\", sans-serif\n");
      out.write("}\n");
      out.write("\n");
      out.write("body, h1, h2, h3, h4, h5, h6, .w3-wide {\n");
      out.write("\tfont-family: \"Montserrat\", sans-serif;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("\n");
      out.write("<body class=\"w3-content\" style=\"max-width: 250px\">\n");
      out.write("\t<!-- Sidebar/menu -->\n");
      out.write("\t<nav class=\"w3-sidebar w3-bar-block w3-white w3-collapse w3-top\"\n");
      out.write("\t\tstyle=\"z-index: 3; width: 250px\" id=\"mySidebar\">\n");
      out.write("\n");
      out.write("\t\t<div class=\"w3-container w3-display-container w3-padding-16\">\n");
      out.write("\t\t\t<i onclick=\"w3_close()\"\n");
      out.write("\t\t\t\tclass=\"fa fa-remove w3-hide-large w3-button w3-display-topright\"></i>\n");
      out.write("\t\t\t<h3 class=\"w3-container\">\n");
      out.write("\t\t\t\t<img src=\"Images/Logo.jpeg\" style=\"width: 25px; height: 25px\">\n");
      out.write("\t\t\t\t<b>ELECTRO-WORLD</b>\n");
      out.write("\t\t\t</h3>\n");
      out.write("\t\t</div>\n");
      out.write("\n");
      out.write("\t\t<div class=\"w3-padding-64 w3-large w3-text-grey\"\n");
      out.write("\t\t\tstyle=\"font-weight: bold\">\n");
      out.write("\t\t\t<a onclick=\"myAccFunc()\" href=\"javascript:void(0)\"\n");
      out.write("\t\t\t\tclass=\"w3-button w3-block w3-white w3-left-align w3-text-grey\">\n");
      out.write("\t\t\t\tPhones & Accessories<i class=\"fa fa-caret-down\"></i>\n");
      out.write("\t\t\t</a>\n");
      out.write("\n");
      out.write("\t\t\t<div id=\"demoAcc\"\n");
      out.write("\t\t\t\tclass=\"w3-bar-block w3-hide w3-padding-large w3-medium\">\n");
      out.write("\t\t\t\t<a class=\"w3-bar-item w3-button w3-light-grey\"\n");
      out.write("\t\t\t\t\thref=\"/ElectroWebShop/ListPhones\"> <i\n");
      out.write("\t\t\t\t\tclass=\"fa fa-caret-right w3-margin-right\"></i>Phone's\n");
      out.write("\t\t\t\t</a> <a class=\"w3-bar-item w3-button\"\n");
      out.write("\t\t\t\t\thref=\"/ElectroWebShop/ListAccessories\">Accessories</a>\n");
      out.write("\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t<a onclick=\"myAccFunc1()\" href=\"javascript:void(0)\"\n");
      out.write("\t\t\t\tclass=\"w3-block w3-white w3-left-align w3-button w3-text-grey\">\n");
      out.write("\t\t\t\tVideo Games & Consoles<i class=\"fa fa-caret-down\"></i>\n");
      out.write("\t\t\t</a>\n");
      out.write("\n");
      out.write("\t\t\t<div id=\"demoAcc1\"\n");
      out.write("\t\t\t\tclass=\"w3-bar-block w3-hide w3-padding-large w3-medium\">\n");
      out.write("\t\t\t\t<a href=\"/ElectroWebShop/ListVideoGames\"\n");
      out.write("\t\t\t\t\tclass=\"w3-bar-item w3-button w3-light-grey\"> <i\n");
      out.write("\t\t\t\t\tclass=\"fa fa-caret-right w3-margin-right\"></i>Video Games\n");
      out.write("\t\t\t\t</a> <a href=\"/ElectroWebShop/ListConsoles\"\n");
      out.write("\t\t\t\t\tclass=\"w3-bar-item w3-button\">Consoles</a>\n");
      out.write("\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t<a onclick=\"myAccFunc2()\" href=\"javascript:void(0)\"\n");
      out.write("\t\t\t\tclass=\"w3-button w3-block w3-white w3-left-align w3-text-grey\">\n");
      out.write("\t\t\t\tComputer Parts<i class=\"fa fa-caret-down\"></i>\n");
      out.write("\t\t\t</a>\n");
      out.write("\n");
      out.write("\t\t\t<div id=\"demoAcc2\"\n");
      out.write("\t\t\t\tclass=\"w3-bar-block w3-hide w3-padding-large w3-medium\">\n");
      out.write("\t\t\t\t<a href=\"/ElectroWebShop/ListPowerSupply\"\n");
      out.write("\t\t\t\t\tclass=\"w3-bar-item w3-button w3-light-grey\"><i\n");
      out.write("\t\t\t\t\tclass=\"fa fa-caret-right w3-margin-right\"></i>Power Supply</a> <a\n");
      out.write("\t\t\t\t\thref=\"/ElectroWebShop/ListMotherboards\"\n");
      out.write("\t\t\t\t\tclass=\"w3-bar-item w3-button\">Motherboards</a> <a\n");
      out.write("\t\t\t\t\thref=\"/ElectroWebShop/ListCPUs\" class=\"w3-bar-item w3-button\">CPU's</a>\n");
      out.write("\t\t\t\t<a href=\"/ElectroWebShop/ListGPUs\" class=\"w3-bar-item w3-button\">GPU's</a>\n");
      out.write("\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t<a onclick=\"myAccFunc3()\" href=\"javascript:void(0)\"\n");
      out.write("\t\t\t\tclass=\"w3-button w3-block w3-white w3-left-align w3-text-grey\">\n");
      out.write("\t\t\t\tLaptops & PC's<i class=\"fa fa-caret-down\"></i>\n");
      out.write("\t\t\t</a>\n");
      out.write("\n");
      out.write("\t\t\t<div id=\"demoAcc3\"\n");
      out.write("\t\t\t\tclass=\"w3-bar-block w3-hide w3-padding-large w3-medium\">\n");
      out.write("\t\t\t\t<a href=\"/ElectroWebShop/ListLaptops\"\n");
      out.write("\t\t\t\t\tclass=\"w3-bar-item w3-button w3-light-grey\"> <i\n");
      out.write("\t\t\t\t\tclass=\"fa fa-caret-right w3-margin-right\"></i>Laptops\n");
      out.write("\t\t\t\t</a> <a href=\"/ElectroWebShop/ListPCs\" class=\"w3-bar-item w3-button\">PC's</a>\n");
      out.write("\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t<a href=\"/ElectroWebShop/ListIcChips\" class=\"w3-bar-item w3-button\">IC-chips</a>\n");
      out.write("\t\t\t<a href=\"/ElectroWebShop/ListTools\" class=\"w3-bar-item w3-button\">Tools</a>\n");
      out.write("\t\t\t<a href=\"repairs.jsp\" class=\"w3-bar-item w3-button\">Repairs</a>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<a href=\"#footer\" class=\"w3-bar-item w3-button w3-padding\">Contact</a>\n");
      out.write("\t\t<a href=\"javascript:void(0)\" class=\"w3-bar-item w3-button w3-padding\"\n");
      out.write("\t\t\tonclick=\"document.getElementById('newsletter').style.display='block'\">Newsletter</a>\n");
      out.write("\t\t<a href=\"#footer\" class=\"w3-bar-item w3-button w3-padding\">Subscribe</a>\n");
      out.write("\t</nav>\n");
      out.write("\n");
      out.write("\t<!-- Overlay effect when opening sidebar on small screens -->\n");
      out.write("\t<div class=\"w3-overlay w3-hide-large\" onclick=\"w3_close()\"\n");
      out.write("\t\tstyle=\"cursor: pointer\" title=\"close side menu\" id=\"myOverlay\"></div>\n");
      out.write("\n");
      out.write("\t<!-- Newsletter Modal -->\n");
      out.write("\t<div id=\"newsletter\" class=\"w3-modal\">\n");
      out.write("\t\t<div class=\"w3-modal-content w3-animate-zoom\" style=\"padding: 32px\">\n");
      out.write("\t\t\t<div class=\"w3-container w3-white w3-center\">\n");
      out.write("\t\t\t\t<i\n");
      out.write("\t\t\t\t\tonclick=\"document.getElementById('newsletter').style.display='none'\"\n");
      out.write("\t\t\t\t\tclass=\"fa fa-remove w3-right w3-button w3-transparent w3-xxlarge\"></i>\n");
      out.write("\t\t\t\t<h2 class=\"w3-wide\">NEWSLETTER</h2>\n");
      out.write("\t\t\t\t<p>Join our mailing list to receive updates on new arrivals and\n");
      out.write("\t\t\t\t\tspecial offers.</p>\n");
      out.write("\t\t\t\t<form method=\"get\" action=\"Subscribe\">\n");
      out.write("\t\t\t\t\t<p>\n");
      out.write("\t\t\t\t\t\t<input class=\"w3-input w3-border\" type=\"text\" name=\"email\" required\n");
      out.write("\t\t\t\t\t\t\tplaceholder=\"Enter e-mail\" style=\"width: 100%\" >\n");
      out.write("\t\t\t\t\t</p>\n");
      out.write("\t\t\t\t\t<input class=\"w3-round w3-red w3-large\" type=\"submit\"\n");
      out.write("\t\t\t\t\t\tvalue=\"Subscribe\">\n");
      out.write("\t\t\t\t</form>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\t<script>\n");
      out.write("\t\t// Accordion \n");
      out.write("\t\tfunction myAccFunc() {\n");
      out.write("\t\t\tvar x = document.getElementById(\"demoAcc\");\n");
      out.write("\t\t\tif (x.className.indexOf(\"w3-show\") == -1) {\n");
      out.write("\t\t\t\tx.className += \" w3-show\";\n");
      out.write("\t\t\t} else {\n");
      out.write("\t\t\t\tx.className = x.className.replace(\" w3-show\", \"\");\n");
      out.write("\t\t\t}\n");
      out.write("\t\t}\n");
      out.write("\t\tfunction myAccFunc1() {\n");
      out.write("\t\t\tvar x = document.getElementById(\"demoAcc1\");\n");
      out.write("\t\t\tif (x.className.indexOf(\"w3-show\") == -1) {\n");
      out.write("\t\t\t\tx.className += \" w3-show\";\n");
      out.write("\t\t\t} else {\n");
      out.write("\t\t\t\tx.className = x.className.replace(\" w3-show\", \"\");\n");
      out.write("\t\t\t}\n");
      out.write("\t\t}\n");
      out.write("\t\tfunction myAccFunc2() {\n");
      out.write("\t\t\tvar x = document.getElementById(\"demoAcc2\");\n");
      out.write("\t\t\tif (x.className.indexOf(\"w3-show\") == -1) {\n");
      out.write("\t\t\t\tx.className += \" w3-show\";\n");
      out.write("\t\t\t} else {\n");
      out.write("\t\t\t\tx.className = x.className.replace(\" w3-show\", \"\");\n");
      out.write("\t\t\t}\n");
      out.write("\t\t}\n");
      out.write("\t\tfunction myAccFunc3() {\n");
      out.write("\t\t\tvar x = document.getElementById(\"demoAcc3\");\n");
      out.write("\t\t\tif (x.className.indexOf(\"w3-show\") == -1) {\n");
      out.write("\t\t\t\tx.className += \" w3-show\";\n");
      out.write("\t\t\t} else {\n");
      out.write("\t\t\t\tx.className = x.className.replace(\" w3-show\", \"\");\n");
      out.write("\t\t\t}\n");
      out.write("\t\t}\n");
      out.write("\n");
      out.write("\t\t// Click on the \"Jeans\" link on page load to open the accordion for demo purposes\n");
      out.write("\t\tdocument.getElementById(\"myBtn\").click();\n");
      out.write("\n");
      out.write("\t\t// Open and close sidebar\n");
      out.write("\t\tfunction w3_open() {\n");
      out.write("\t\t\tdocument.getElementById(\"mySidebar\").style.display = \"block\";\n");
      out.write("\t\t\tdocument.getElementById(\"myOverlay\").style.display = \"block\";\n");
      out.write("\t\t}\n");
      out.write("\n");
      out.write("\t\tfunction w3_close() {\n");
      out.write("\t\t\tdocument.getElementById(\"mySidebar\").style.display = \"none\";\n");
      out.write("\t\t\tdocument.getElementById(\"myOverlay\").style.display = \"none\";\n");
      out.write("\t\t}\n");
      out.write("\t</script>\n");
      out.write("</body>\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
