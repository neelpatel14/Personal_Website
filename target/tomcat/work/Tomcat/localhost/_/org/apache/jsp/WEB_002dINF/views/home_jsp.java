/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2017-01-25 04:58:55 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\">\r\n");
      out.write("<script type=\"text/javascript\" src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"home_functions.js\"></script>\r\n");
      out.write("<link rel= \"stylesheet\" type= \"text/css\" href=\"home.css\"/>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("<title>homePage</title>\r\n");
      out.write("<body>\r\n");
      out.write("\t<h1>Neel Patel</h1>\r\n");
      out.write("\t<h2 class=\"sub\">Student, Software Engineer</h2>\r\n");
      out.write("\t<div class=\"icons\">\r\n");
      out.write("\t\t<div class=\"icon\">\r\n");
      out.write("\t\t<a class = \"about\" href=\"#aboutMe\">\r\n");
      out.write("\t\tAbout\r\n");
      out.write("\t\t</a>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"icon\">\r\n");
      out.write("\t\t<a class = \"personal\" href=\"#personal\">\r\n");
      out.write("\t\tInfo\r\n");
      out.write("\t\t</a>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"icon\">\r\n");
      out.write("\t\t<a class = \"projects\" href=\"#projects\">\r\n");
      out.write("\t\tProjects\r\n");
      out.write("\t\t</a>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"icon\">\r\n");
      out.write("\t\t<a class = \"contact\" href=\"#contact\">\r\n");
      out.write("\t\tContact Info\r\n");
      out.write("\t\t</a>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<h2 class=\"about\" id=\"aboutMe\">About</h2>\r\n");
      out.write("\t<div class=\"aboutMe\">\r\n");
      out.write("\t<div class=\"mypic\">\r\n");
      out.write("\t <img class=\"mypic\" src=images/Neel_Patel.jpg></img>\r\n");
      out.write("\t </div>\r\n");
      out.write("\t<div class=\"aboutText\">\r\n");
      out.write("\tNeel is a current Rodman Scholar at the University of Virginia,\r\n");
      out.write("\tpursuing a double major in Computer Science and Financial Economics.\r\n");
      out.write("\tIn terms of software development, he is most skilled in Java, C++ and web development languages such as \r\n");
      out.write("\tHTML, CSS, and JavaScript. Currently, Neel is working towards his degrees\r\n");
      out.write("\tand on his own independent projects.\r\n");
      out.write("\t </div>\r\n");
      out.write("\t\r\n");
      out.write("\t </div>\r\n");
      out.write("\t <div class =\"picture\">\r\n");
      out.write("\t \r\n");
      out.write("\t </div>\r\n");
      out.write("\t<h2 class=\"info\" id=\"personal\">Personal Information</h2>\r\n");
      out.write("\t<div class= \"personal\" id=\"personal\">\r\n");
      out.write("\t\t<div class=\"aboutImage\" id= \"education\">\r\n");
      out.write("\t\t<img id=\"educationOne\" class= \"resize\" src=\"Info/Education.png\">\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"aboutImage\" id= \"skills\"> \r\n");
      out.write("\t\t<img id=\"skills\" class= \"resize\" src=\"Info/Skills.png\">\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<h2 class=\"projects\">Projects</h2>\r\n");
      out.write("\t<div class=\"projects\" id=\"projects\">\r\n");
      out.write("\t<div class=\"project\" id=\"projectOne\">\r\n");
      out.write("\t\t<form action = \"/ActiveSettings\" method= \"GET\">\r\n");
      out.write("\t\t\t<input class= \"App\" type=\"submit\" value= \"Active Mind App\" />\r\n");
      out.write("\t\t</form>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div class=\"project\" id=\"projectTwo\">\r\n");
      out.write("\t\t<input type=\"button\" class=\"App\" onclick=\"websiteInfo()\" value=\"This Website\"/>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div class=\"project\" id=\"projectThree\">\r\n");
      out.write("\t\t<input type=\"button\" class=\"App\" onclick=\"freshInfo()\" value=\"FreSh Mobile App\"/>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div id=\"websiteInfo\" class=\"websiteInfo\" style=\"display: none\">\r\n");
      out.write("\t This website was created mainly as a means of conveying professional information, but also as an educational tool for myself.\r\n");
      out.write("\t I include this website  among my coding projects because I coded it from scratch, \r\n");
      out.write("\twithout the use of any external templates or startups. (Re-click button to close) </div>\r\n");
      out.write("\t<div id=\"freshInfo\" class=\"freshInfo\" style=\"display:none\">\r\n");
      out.write("\tApplication that crowdsources information about Free giveaways around campuses. It will then use \r\n");
      out.write("\tthis information to give alerts about locations, times etc. Currently in development stages. (Re-click button to close)\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<h2 id=\"contact\" class=\"contact\">Contact Me</h2>\r\n");
      out.write("\t<div class=\"contact\" id=\"contactDiv\">\r\n");
      out.write("\t<a href = \"https://www.linkedin.com/in/npatel14\" class =\"contactMe\">LinkedIn</a>\r\n");
      out.write("\t<a href = \"https://github.com/neelpatel14\" class = \"contactMe\">Github</a>\r\n");
      out.write("\t<a class = \"contactMe\" onclick = \"emailSec()\">Email</a>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div id =\"emailSec\" class =\"emailSec\" style= \"display:none\">\r\n");
      out.write("\tPlease email me at np2ch@virginia.edu, and I will get back to you as soon as possible.\r\n");
      out.write("\t</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
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
