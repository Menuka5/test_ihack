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
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en-us\">\n");
      out.write("    <head>\n");
      out.write("        <title>Sign in form</title>\n");
      out.write("        <meta charset=\"utf-8\" />\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <style>\n");
      out.write("            @import url(\"http://maxcdn.bootstrapcdn.com/font-awesome/4.3.0/css/font-awesome.min.css\");\n");
      out.write("            @import url(\"http://fonts.googleapis.com/css?family=Source+Sans+Pro:400,700\");\n");
      out.write("            *{margin:0; padding:0}\n");
      out.write("\n");
      out.write("            body{\n");
      out.write("                background:#DEB887; \n");
      out.write("                font-family: 'Source Sans Pro', sans-serif\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .form{\n");
      out.write("                width:400px; \n");
      out.write("                margin:0 auto; \n");
      out.write("                background:#1C2B4A; \n");
      out.write("                margin-top:150px\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .header{\n");
      out.write("                height:44px; \n");
      out.write("                background:#17233B\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .header h2{\n");
      out.write("                height:44px; \n");
      out.write("                line-height:44px; \n");
      out.write("                color:#fff; \n");
      out.write("                text-align:center\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .login{\n");
      out.write("                padding:0 20px\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .login span.un{\n");
      out.write("                width:10%; \n");
      out.write("                text-align:center; \n");
      out.write("                color:#0C6; \n");
      out.write("                border-radius:3px 0 0 3px\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .text{\n");
      out.write("                background:#12192C; \n");
      out.write("                width:90%; \n");
      out.write("                border-radius:0 3px 3px 0; \n");
      out.write("                border:none; \n");
      out.write("                outline:none; \n");
      out.write("                color:#999; \n");
      out.write("                font-family: 'Source Sans Pro', sans-serif\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .text,.login span.un{\n");
      out.write("                display:inline-block; \n");
      out.write("                vertical-align:top; \n");
      out.write("                height:40px; \n");
      out.write("                line-height:40px; \n");
      out.write("                background:#12192C;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .btn{\n");
      out.write("                height:40px; \n");
      out.write("                border:none; \n");
      out.write("                background:#0C6; \n");
      out.write("                width:100%; \n");
      out.write("                outline:none; \n");
      out.write("                font-family: 'Source Sans Pro', sans-serif; \n");
      out.write("                font-size:20px; \n");
      out.write("                font-weight:bold; \n");
      out.write("                color:#eee; \n");
      out.write("                border-bottom:solid 3px #093;\n");
      out.write("                border-radius:3px; \n");
      out.write("                cursor:pointer\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            ul li{\n");
      out.write("                height:40px; \n");
      out.write("                margin:15px 0; \n");
      out.write("                list-style:none\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .span{\n");
      out.write("                display:table; \n");
      out.write("                width:100%; \n");
      out.write("                font-size:14px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .ch{\n");
      out.write("                display:inline-block; \n");
      out.write("                width:50%; \n");
      out.write("                color:#CCC\n");
      out.write("            }\n");
      out.write("            .ch a{\n");
      out.write("                color:#CCC; \n");
      out.write("                text-decoration:none\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .ch:nth-child(2){text-align:right}\n");
      out.write("\n");
      out.write("            /*bottom*/\n");
      out.write("            .sign{\n");
      out.write("                width:90%; \n");
      out.write("                padding:0 5%; \n");
      out.write("                height:40px; \n");
      out.write("                display:table; \n");
      out.write("                background:#16233B\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .sign div{\n");
      out.write("                display:inline-block; \n");
      out.write("                width:50%; \n");
      out.write("                line-height:50px; \n");
      out.write("                color:#ccc; \n");
      out.write("                font-size:14px\n");
      out.write("            }\n");
      out.write("            .up{\n");
      out.write("                text-align:right\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .up a{\n");
      out.write("                display:block; \n");
      out.write("                background:#096; \n");
      out.write("                text-align:center; \n");
      out.write("                height:35px; \n");
      out.write("                line-height:35px; \n");
      out.write("                width:50%; \n");
      out.write("                font-size:16px; \n");
      out.write("                text-decoration:none; \n");
      out.write("                color:#eee; \n");
      out.write("                border-bottom:solid 3px #006633; \n");
      out.write("                border-radius:3px; \n");
      out.write("                font-weight:bold; \n");
      out.write("                margin-left:50%\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            @media(max-width:480px){ .form{width:100%}}\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"form\">\n");
      out.write("            <div class=\"header\"><h2>Sign In</h2></div>\n");
      out.write("            <div class=\"login\">\n");
      out.write("                <form action=\"ValidateLoginServlet\" method=\"post\">\n");
      out.write("                    <ul>\n");
      out.write("                        <li>\n");
      out.write("                            <span class=\"un\"><i class=\"fa fa-user\"></i></span><input name=\"username\" type=\"text\" required class=\"text\" placeholder=\"User Name Or Email\"/></li>\n");
      out.write("                        <li>\n");
      out.write("                            <span class=\"un\"><i class=\"fa fa-lock\"></i></span><input name=\"password\" type=\"password\" required class=\"text\" placeholder=\"User Password\"/></li>\n");
      out.write("                        <li>\n");
      out.write("                            <input type=\"submit\" value=\"LOGIN\" class=\"btn\">\n");
      out.write("                        </li>\n");
      out.write("                        <li><div class=\"span\"><span class=\"ch\"><input type=\"checkbox\" id=\"r\"> <label for=\"r\">Remember Me</label> </span> <span class=\"ch\" style=\"float: right\"><a href=\"#\">Forgot Password?</a></span></div></li>\n");
      out.write("                    </ul>\n");
      out.write("                </form>\n");
      out.write("                <div class=\"social\">\n");
      out.write("\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("            </div><br/>\n");
      out.write("            <div class=\"sign\">\n");
      out.write("                <div class=\"need\">Need new account ?</div>\n");
      out.write("                <div class=\"up\" style=\"float: right\"><a href=\"\">Sign Up</a></div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
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
