/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.19
 * Generated at: 2019-05-05 01:36:15 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class footer_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<title>Footer</title>\n");
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
      out.write("<body class=\"w3-content\" >\n");
      out.write("\t<div class=\"w3-main\" style=\"margin-left: 250px\">\n");
      out.write("\t\t\n");
      out.write("\n");
      out.write("\t\t<!-- Footer -->\n");
      out.write("\t\t<footer class=\"w3-padding-64 w3-light-grey w3-small w3-center\"\n");
      out.write("\t\t\tstyle=\"width: 100%\" id=\"footer\">\n");
      out.write("\t\t\t<div class=\"w3-row-padding\">\n");
      out.write("\t\t\t\t<div class=\"w3-col s4\">\n");
      out.write("\t\t\t\t\t<h4>Contact</h4>\n");
      out.write("\t\t\t\t\t<p>Questions? Go ahead.</p>\n");
      out.write("\t\t\t\t\t<form method=\"get\" action=\"Contact\">\n");
      out.write("\t\t\t\t\t\t<p>\n");
      out.write("\t\t\t\t\t\t\t<input class=\"w3-input w3-border\" type=\"text\" placeholder=\"Name\"\n");
      out.write("\t\t\t\t\t\t\t\tname=\"Name\" required style=\"width:100%\">\n");
      out.write("\t\t\t\t\t\t</p>\n");
      out.write("\t\t\t\t\t\t<p>\n");
      out.write("\t\t\t\t\t\t\t<input class=\"w3-input w3-border\" type=\"text\" placeholder=\"Email\"\n");
      out.write("\t\t\t\t\t\t\t\tname=\"Email\" required style=\"width:100%\">\n");
      out.write("\t\t\t\t\t\t</p>\n");
      out.write("\t\t\t\t\t\t<p>\n");
      out.write("\t\t\t\t\t\t\t<input class=\"w3-input w3-border\" type=\"text\"\n");
      out.write("\t\t\t\t\t\t\t\tplaceholder=\"Subject\" name=\"Subject\" required style=\"width:100%\">\n");
      out.write("\t\t\t\t\t\t</p>\n");
      out.write("\t\t\t\t\t\t<p>\n");
      out.write("\t\t\t\t\t\t\t<input class=\"w3-input w3-border\" type=\"text\"\n");
      out.write("\t\t\t\t\t\t\t\tplaceholder=\"Message\" name=\"Message\" required style=\"width:100%\">\n");
      out.write("\t\t\t\t\t\t</p>\n");
      out.write("\t\t\t\t\t\t<button type=\"submit\" class=\"w3-button w3-block w3-black\">Send</button>\n");
      out.write("\t\t\t\t\t</form>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t<div class=\"w3-col s4\">\n");
      out.write("\t\t\t\t\t<h4>About</h4>\n");
      out.write("\t\t\t\t\t<p>\n");
      out.write("\t\t\t\t\t\t<a href=\"#\">About us</a>\n");
      out.write("\t\t\t\t\t</p>\n");
      out.write("\t\t\t\t\t<p>\n");
      out.write("\t\t\t\t\t\t<a href=\"#\">We're hiring</a>\n");
      out.write("\t\t\t\t\t</p>\n");
      out.write("\t\t\t\t\t<p>\n");
      out.write("\t\t\t\t\t\t<a href=\"#\">Support</a>\n");
      out.write("\t\t\t\t\t</p>\n");
      out.write("\t\t\t\t\t<p>\n");
      out.write("\t\t\t\t\t\t<a href=\"#\">Find store</a>\n");
      out.write("\t\t\t\t\t</p>\n");
      out.write("\t\t\t\t\t<p>\n");
      out.write("\t\t\t\t\t\t<a href=\"#\">Shipment</a>\n");
      out.write("\t\t\t\t\t</p>\n");
      out.write("\t\t\t\t\t<p>\n");
      out.write("\t\t\t\t\t\t<a href=\"#\">Payment</a>\n");
      out.write("\t\t\t\t\t</p>\n");
      out.write("\t\t\t\t\t<p>\n");
      out.write("\t\t\t\t\t\t<a href=\"#\">Gift card</a>\n");
      out.write("\t\t\t\t\t</p>\n");
      out.write("\t\t\t\t\t<p>\n");
      out.write("\t\t\t\t\t\t<a href=\"#\">Return</a>\n");
      out.write("\t\t\t\t\t</p>\n");
      out.write("\t\t\t\t\t<p>\n");
      out.write("\t\t\t\t\t\t<a href=\"#\">Help</a>\n");
      out.write("\t\t\t\t\t</p>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t<div class=\"w3-col s4 w3-justify\">\n");
      out.write("\t\t\t\t\t<h4>Store</h4>\n");
      out.write("\t\t\t\t\t<p>\n");
      out.write("\t\t\t\t\t\t<i class=\"fa fa-fw fa-map-marker\"></i>Electro World, Paramaribo\n");
      out.write("\t\t\t\t\t\tSuriname\n");
      out.write("\t\t\t\t\t</p>\n");
      out.write("\n");
      out.write("\t\t\t\t\t<p>\n");
      out.write("\t\t\t\t\t\t<i class=\"fa fa-fw fa-phone\"></i> 0044123123\n");
      out.write("\t\t\t\t\t</p>\n");
      out.write("\t\t\t\t\t<p>\n");
      out.write("\t\t\t\t\t\t<i class=\"fa fa-fw fa-envelope\"></i> Electro_World@gmail.com\n");
      out.write("\t\t\t\t\t</p>\n");
      out.write("\t\t\t\t\t<h4>We accept</h4>\n");
      out.write("\t\t\t\t\t<p>\n");
      out.write("\t\t\t\t\t\t<i class=\"fa fa-fw fa-cc-amex\"></i> Paypal\n");
      out.write("\t\t\t\t\t</p>\n");
      out.write("\t\t\t\t\t<p>\n");
      out.write("\t\t\t\t\t\t<i class=\"fa fa-fw fa-credit-card\"></i> Visa /Master Card\n");
      out.write("\t\t\t\t\t</p>\n");
      out.write("\t\t\t\t\t<br> <i\n");
      out.write("\t\t\t\t\t\tclass=\"fa fa-facebook-official w3-hover-opacity w3-large\"></i> <i\n");
      out.write("\t\t\t\t\t\tclass=\"fa fa-instagram w3-hover-opacity w3-large\"></i> <i\n");
      out.write("\t\t\t\t\t\tclass=\"fa fa-snapchat w3-hover-opacity w3-large\"></i> <i\n");
      out.write("\t\t\t\t\t\tclass=\"fa fa-pinterest-p w3-hover-opacity w3-large\"></i> <i\n");
      out.write("\t\t\t\t\t\tclass=\"fa fa-twitter w3-hover-opacity w3-large\"></i> <i\n");
      out.write("\t\t\t\t\t\tclass=\"fa fa-linkedin w3-hover-opacity w3-large\"></i>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</footer>\n");
      out.write("\n");
      out.write("\t\t<div class=\"w3-black w3-center w3-padding-24\" style=\"width: 100%\">\n");
      out.write("\t\t\tPowered by <a href=\"https://www.w3schools.com/w3css/default.asp\"\n");
      out.write("\t\t\t\ttitle=\"W3.CSS\" target=\"_blank\" class=\"w3-hover-opacity\">w3.css</a>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
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
