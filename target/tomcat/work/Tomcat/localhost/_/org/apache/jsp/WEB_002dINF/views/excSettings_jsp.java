/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2017-02-13 05:08:30 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class excSettings_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

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

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("\r\n");
      out.write("<link rel= \"stylesheet\" type= \"text/css\" href=\"exeSet.css\"/>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\">\r\n");
      out.write("<script type=\"text/javascript\" src=\"exe_functions.js\"></script>\r\n");
      out.write("<title>Settings</title>\r\n");
      out.write("<!--[if lt IE 9]>\r\n");
      out.write("<script src=\"http://html5shiv.googlecode.com/svn/trunk/html5.js\">\r\n");
      out.write("</script>\r\n");
      out.write("<![endif]-->\r\n");
      out.write("\t<body>\r\n");
      out.write("\t\t<h2 class=\"purpose\">Purpose</h2>\r\n");
      out.write("\t\t<div class=\"purpose\">\r\n");
      out.write("\t\tThis application will randomly alert the user with a random exercise depending on the settings below. The purpose\r\n");
      out.write("\t\tof the application is to keep people alert during long hours of working in front of a computer screen.This application \r\n");
      out.write("\t\twill relieve both the mental strain from staring at a computer for long periods of time, as well as the physical strain,\r\n");
      out.write("\t\tallowing you to have the opportunity to strech and casually exercise.\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<h2 class=\"settings\">Settings</h2>\r\n");
      out.write("\t\t<div class=\"form\">\r\n");
      out.write("\t\t<form action = \"/ActiveRun\" method = \"GET\" id = \"form1\">\r\n");
      out.write("\t\t<h3>Reminder Time</h3>\r\n");
      out.write(" \t\t\t<input name= \"timing\" type= \"radio\" value= \"15\" id=\"timing\" onclick = \"checkTime()\"/>15 Minutes\r\n");
      out.write("  \t\t\t<input name = \"timing\" type = \"radio\" value= \"30\" id=\"timing\" onclick = \"checkTime()\"/>30 Minutes\r\n");
      out.write("  \t\t\t<input name = \"timing\" type = \"radio\" value= \"60\" id = \"timing\" onclick = \"checkTime()\"/>Hourly<br>\r\n");
      out.write("\t\t<h3>Alert Type</h3>\r\n");
      out.write("\t\t\t<input name = \"alert\" type = \"radio\" value = \"light\" id=\"alert\" onclick = \"checkType()\"/>Light\r\n");
      out.write("\t\t\t<input name = \"alert\" type = \"radio\" value = \"sound\" id= \"alert\" onclick = \"checkType()\"/>Sound<br><br>\r\n");
      out.write("\t\t\t<input type= \"submit\" value= \"Submit\" id= \"submit1\" class=\"submit\" disabled= \"disabled\"/> \r\n");
      out.write("\t\t</form>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</body>\r\n");
      out.write("\t\r\n");
      out.write("</html>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
