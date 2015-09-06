package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import gms.controller.Person_details_controller;
import gms.model.Person_details_model;

public final class creategroup_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta charset=\"utf-8\">\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("<title>Dashboard</title>\n");
      out.write("\n");
      out.write("<link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("<link href=\"css/datepicker3.css\" rel=\"stylesheet\">\n");
      out.write("<link href=\"css/styles.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!--[if lt IE 9]>\n");
      out.write("<script src=\"js/html5shiv.js\"></script>\n");
      out.write("<script src=\"js/respond.min.js\"></script>\n");
      out.write("<![endif]-->\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("\t<nav class=\"navbar navbar-inverse navbar-fixed-top\" role=\"navigation\">\n");
      out.write("\t\t<div class=\"container-fluid\">\n");
      out.write("\t\t\t\n");
      out.write("            <div class=\"navbar-header\">\n");
      out.write("\t\t\t\t<button type=\"button\" class=\"navbar-toggle collapsed\" data-toggle=\"collapse\" data-target=\"#sidebar-collapse\">\n");
      out.write("\t\t\t\t\t<span class=\"sr-only\">Toggle navigation</span>\n");
      out.write("\t\t\t\t\t<span class=\"icon-bar\"></span>\n");
      out.write("\t\t\t\t\t<span class=\"icon-bar\"></span>\n");
      out.write("\t\t\t\t\t<span class=\"icon-bar\"></span>\n");
      out.write("\t\t\t\t</button>\n");
      out.write("\t\t\t\t<a class=\"navbar-brand\" href=\"#\"><span>iHack</span>Admin</a>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\n");
      out.write("\t\t</div>\n");
      out.write("        \n");
      out.write("\t</nav>\n");
      out.write("\t\t\n");
      out.write("\t<div id=\"sidebar-collapse\" class=\"col-sm-3 col-lg-2 sidebar\">\n");
      out.write("\t\t\n");
      out.write("\t\t<ul class=\"nav menu\">\n");
      out.write("\t\t\t<li class=\"\"><a href=\"adminpanel.html\"><span class=\"glyphicon glyphicon-dashboard\"></span> My Profile</a></li>\n");
      out.write("            <li class=\"parent \">\n");
      out.write("\n");
      out.write("\t\t\t\t<a href=\"#\">\n");
      out.write("\t\t\t\t\t<span class=\"glyphicon glyphicon-list\"></span><span href=\"#sub-item-1\"> <span data-toggle=\"collapse\" href=\"#sub-item-1\"> Moderator </span></span><span data-toggle=\"collapse\" href=\"#sub-item-1\" class=\"icon pull-right\"><em class=\"glyphicon glyphicon-s glyphicon-plus\"></em></span> \n");
      out.write("\t\t\t\t</a>\n");
      out.write("\t\t\t\t<ul class=\"children collapse\" id=\"sub-item-1\">\n");
      out.write("\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t\t<a class=\"\" href=\"addmoderate.html\">\n");
      out.write("\t\t\t\t\t\t\t<span class=\"glyphicon glyphicon-share-alt\"></span>  Add Moderator\n");
      out.write("\t\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t\t<a class=\"\" href=\"deletemoderate.html\">\n");
      out.write("\t\t\t\t\t\t\t<font color=\"white\" ><span class=\"glyphicon glyphicon-share-alt\"></span> Remove Moderator\n");
      out.write("\t\t\t\t\t\t</a></font>\n");
      out.write("\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t\t<a class=\"\" href=\"showmoderate.htm\">\n");
      out.write("\t\t\t\t\t\t\t<span class=\"glyphicon glyphicon-share-alt\"></span> Show Moderator\n");
      out.write("\t\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t</ul>\n");
      out.write("\t\t\t</li>\n");
      out.write("            \n");
      out.write("            \n");
      out.write("\t\t\t\n");
      out.write("\t\t\t<li class=\"parent active\">\n");
      out.write("\t\t\t\t<a href=\"#\">\n");
      out.write("\t\t\t\t\t<span class=\"glyphicon glyphicon-list\"></span> <span data-toggle=\"collapse\" href=\"#sub-item-2\"> Groups </span><span data-toggle=\"collapse\" href=\"#sub-item-2\" class=\"icon pull-right\"><em class=\"glyphicon glyphicon-s glyphicon-plus\"></em></span> \n");
      out.write("\t\t\t\t</a>\n");
      out.write("\t\t\t\t<ul class=\"children collapse\" id=\"sub-item-2\">\n");
      out.write("\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t\t<a class=\"\" href=\"#\">\n");
      out.write("\t\t\t\t\t\t\t<span class=\"glyphicon glyphicon-share-alt\"></span> Show Groups\n");
      out.write("\t\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t\t<a class=\"active\" href=\"#\">\n");
      out.write("\t\t\t\t\t\t\t<font color=\"white\" ><span class=\"glyphicon glyphicon-share-alt\"></span> Create Group\n");
      out.write("\t\t\t\t\t\t</a></font>\n");
      out.write("\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t\t<a class=\"\" href=\"#\">\n");
      out.write("\t\t\t\t\t\t\t<span class=\"glyphicon glyphicon-share-alt\"></span> Delete Group\n");
      out.write("\t\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t</ul>\n");
      out.write("\t\t\t</li>\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t<li role=\"presentation\" class=\"divider\"></li>\n");
      out.write("\t\t\t\n");
      out.write("\t\t</ul>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("\t</div><!--/.sidebar-->\n");
      out.write("\t\t\n");
      out.write("\t<div class=\"col-sm-9 col-sm-offset-3 col-lg-10 col-lg-offset-2 main\">\t\t\t\n");
      out.write("\t\t<div class=\"row\">\n");
      out.write("\t\t\t<ol class=\"breadcrumb\">\n");
      out.write("\t\t\t\t<li><a href=\"#\"><span class=\"glyphicon glyphicon-home\"></span></a></li>\n");
      out.write("\t\t\t\t<li class=\"active\">Create Group</li>\n");
      out.write("\t\t\t</ol>\n");
      out.write("            \n");
      out.write("            \n");
      out.write("\t\t</div><!--/.row-->\n");
      out.write("\t\t<div class=\"row\">\n");
      out.write("\t\t\t<div class=\"col-lg-12\">\n");
      out.write("\t\t\t\t<h2 class=\"page-header\">Create Group</h2>\n");
      out.write("            \n");
      out.write("        <form action=\"createGroupServlet\" method=\"post\">  \n");
      out.write("<div id=\"details\"><table>\n");
      out.write("<tr><td>Group Name</td><td><input type=\"text\" class=\"form-control\" name=\"gname\" placeholder=\"Enter group name\" size=\"50px\"></td></tr>\n");
      out.write("<tr><td>Description</td>\n");
      out.write("<td><textarea id=\"border\" class=\"form-control\"  rows=\"1\" cols=\"17\" placeholder=\"Add group description\"></textarea></td>\n");
      out.write("</tr>\n");
      out.write("<tr><td>Add Members</td>\n");
      out.write("<td><input type=\"text\" class=\"form-control\" placeholder=\"Select Members\" size=\"30px\"></td><td><input class=\"btn btn-info\" type=\"button\" value=\"Add\"></td>\n");
      out.write("</tr>\n");

    ArrayList<Person_details_model> rmlist = Person_details_controller.getAllMembers();

    out.println("<div>"+rmlist.get(1).getFname()+"</div>");

      out.write("\n");
      out.write("<tr><td rowspan=\"6\">Privacy</td>\n");
      out.write("<td><br><input type=\"radio\" name=\"privacy\" value = \"0\">&nbsp;<icon class=\"glyphicon glyphicon-globe\">&nbsp;<b>Public</b></td></tr>\n");
      out.write("<tr><td>Anyone can see the group, its members and their posts.</td></tr>\n");
      out.write("<tr><td><input type=\"radio\" name=\"privacy\" checked=\"checked\" value = \"1\">&nbsp;<icon class=\"glyphicon glyphicon-eye-close\" >&nbsp;<b>Closed</b></td></tr>\n");
      out.write("<tr><td>Anyone can find the group and see who's in it. Only members can see posts.</td></tr>\n");
      out.write("<tr><td><input type=\"radio\" name=\"privacy\" value = \"2\">&nbsp;<icon class=\"glyphicon glyphicon-lock\">&nbsp;<b>Secret</b></td></tr>\n");
      out.write("<tr><td>Only members can find the group and see posts.</td></tr>\n");
      out.write("</tr>\n");
      out.write("<tr><td><input type=\"submit\" name=\"submit\" value=\"Create\"></td>\n");
      out.write("<td><input type=\"reset\" name=\"cancel\" value=\"cancel\"></td></tr>\n");
      out.write("</table>\n");
      out.write("</form>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t</div><!--/.row-->\n");
      out.write("<!--/.main-->\n");
      out.write("\n");
      out.write("\t<script src=\"js/jquery-1.11.1.min.js\"></script>\n");
      out.write("\t<script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("\t<script src=\"js/chart.min.js\"></script>\n");
      out.write("\t<script src=\"js/chart-data.js\"></script>\n");
      out.write("\t<script src=\"js/easypiechart.js\"></script>\n");
      out.write("\t<script src=\"js/easypiechart-data.js\"></script>\n");
      out.write("\t<script src=\"js/bootstrap-datepicker.js\"></script>\n");
      out.write("\t<script>\n");
      out.write("\t\t$('#calendar').datepicker({\n");
      out.write("\t\t});\n");
      out.write("\n");
      out.write("\t\t!function ($) {\n");
      out.write("\t\t    $(document).on(\"click\",\"ul.nav li.parent > a > span.icon\", function(){          \n");
      out.write("\t\t        $(this).find('em:first').toggleClass(\"glyphicon-minus\");      \n");
      out.write("\t\t    }); \n");
      out.write("\t\t    $(\".sidebar span.icon\").find('em:first').addClass(\"glyphicon-plus\");\n");
      out.write("\t\t}(window.jQuery);\n");
      out.write("\n");
      out.write("\t\t$(window).on('resize', function () {\n");
      out.write("\t\t  if ($(window).width() > 768) $('#sidebar-collapse').collapse('show')\n");
      out.write("\t\t})\n");
      out.write("\t\t$(window).on('resize', function () {\n");
      out.write("\t\t  if ($(window).width() <= 767) $('#sidebar-collapse').collapse('hide')\n");
      out.write("\t\t})\n");
      out.write("\t</script>\t\n");
      out.write("</body>\n");
      out.write("\n");
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
