package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class signUp_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html lang=\"en\">\n");
      out.write("    <head>\n");
      out.write("        <!-- Required meta tags -->\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css?family=Roboto:300,400&display=swap\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("<!--        <link rel=\"stylesheet\" href=\"fonts/icomoon/style.css\">-->\n");
      out.write("\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/owl.carousel.min.css\">\n");
      out.write("\n");
      out.write("        <!-- Bootstrap CSS -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/css/bootstrap.min.css\" \n");
      out.write("              integrity=\"sha384-B0vP5xmATw1+K9KRQjQERJvTumQW0nPEzvF6L/Z6nronJ3oUOFUFpCjEUQouq2+l\" crossorigin=\"anonymous\">\n");
      out.write("\n");
      out.write("        <!-- Style -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/signIn.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/signUp.css\">\n");
      out.write("\n");
      out.write("        <title>Register</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <div class=\"half\">\n");
      out.write("            <div class=\"bg order-1 order-md-2\" style=\"background-image: url('images/banner-01.jpg');\"></div>\n");
      out.write("            <div class=\"contents order-2 order-md-1\">\n");
      out.write("\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <div class=\"row align-items-center justify-content-center\">\n");
      out.write("                        <div class=\"col-md-6\">\n");
      out.write("                            <div class=\"form-block\">\n");
      out.write("                                <div class=\"text-center mb-5\">\n");
      out.write("                                    <h3>Login to <strong>Shop</strong></h3>\n");
      out.write("                                    <!-- <p class=\"mb-4\">Lorem ipsum dolor sit amet elit. Sapiente sit aut eos consectetur adipisicing.</p> -->\n");
      out.write("                                </div>\n");
      out.write("                                <form class=\"register-form\" name=\"register-form\" action=\"signup\" method=\"post\" onsubmit=\"return validateForm()\">\n");
      out.write("                                    <div class=\"form-group\">\n");
      out.write("                                        <input type=\"text\" class=\"form-control\" name=\"username\" id=\"username\" placeholder=\"Username\" required=\"\">\n");
      out.write("                                        <div class=\"badge badge-danger\" id=\"userFail\"></div>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"form-group\">\n");
      out.write("                                        <input type=\"text\" class=\"form-control\" name=\"fullname\" id=\"fullname\" placeholder=\"Fullname\" required=\"\">\n");
      out.write("                                        <div class=\"badge badge-danger\" id=\"fullnameFail\"></div>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"form-group\">\n");
      out.write("                                        <input type=\"email\" class=\"form-control\" name=\"email\" id=\"email\" placeholder=\"Email\" required=\"\">\n");
      out.write("                                        \n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"form-group\">\n");
      out.write("                                        <input type=\"text\" class=\"form-control\" name=\"phone\" id=\"phone\" placeholder=\"Phone number\" required=\"\">\n");
      out.write("                                        <div class=\"badge badge-danger\" id=\"phoneFail\"></div>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"form-group\">\n");
      out.write("                                        <input type=\"text\" class=\"form-control\" name=\"address\" id=\"address\" placeholder=\"Address\" required=\"\">\n");
      out.write("                                        \n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"row md-12\">\n");
      out.write("                                        <div class=\"form-group col-md-6\">\n");
      out.write("                                            <input type=\"password\" class=\"form-control\" name=\"password\" id=\"password\" placeholder=\"Password\" required=\"\">\n");
      out.write("                                            <div class=\"help-block with-errors\"></div>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"form-group col-md-6\">\n");
      out.write("                                            <input type=\"password\" class=\"form-control\" name=\"repassword\" id=\"repassword\" placeholder=\"Re-password\" required=\"\">\n");
      out.write("                                            <div class=\"badge badge-danger\" id=\"repassFail\"></div>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                    <button type=\"submit\" class=\"btn btn-block btn-primary submit\"> Register </button>\n");
      out.write("                                    <span class=\"ml-auto\"><a href=\"signIn.jsp\" class=\"forgot-pass\">Login</a></span> \n");
      out.write("                                </form>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <script src=\"js/jquery-3.2.1.min.js\"></script>\n");
      out.write("        <script src=\"js/popper.min.js\"></script>\n");
      out.write("        <script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("<!--        <script src=\"js/main.js\"></script>-->\n");
      out.write("        <script src=\"js/signupValidate.js\"></script>\n");
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
