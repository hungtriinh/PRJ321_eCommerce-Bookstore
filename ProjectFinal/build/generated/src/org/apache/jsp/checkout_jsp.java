package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import java.util.List;
import controller.Product;
import controller.Product;
import controller.Account;
import model.AccountDAL;

public final class checkout_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_out_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_choose;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_otherwise;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_when_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_out_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_choose = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_otherwise = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_when_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
    _jspx_tagPool_c_out_value_nobody.release();
    _jspx_tagPool_c_choose.release();
    _jspx_tagPool_c_otherwise.release();
    _jspx_tagPool_c_when_test.release();
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");

    AccountDAL aDAL = new AccountDAL();
    Account currAcc = aDAL.getAccountByUsername((String) session.getAttribute("user"));
    request.setAttribute("currAcc", currAcc);
    List<Product> listTotal = (List<Product>) session.getAttribute("listCart");
    float total = 0;
    for (Product p : listTotal) {
        total += p.getTotal();
    }
    request.setAttribute("total", total);

      out.write("  \n");
      out.write("\n");
      out.write("<html lang=\"en\">\n");
      out.write("    <!-- Basic -->\n");
      out.write("\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("\n");
      out.write("        <!-- Mobile Metas -->\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("\n");
      out.write("        <!-- Site Metas -->\n");
      out.write("        <title>Checkout</title>\n");
      out.write("        <meta name=\"keywords\" content=\"\">\n");
      out.write("        <meta name=\"description\" content=\"\">\n");
      out.write("        <meta name=\"author\" content=\"\">\n");
      out.write("\n");
      out.write("        <!-- Site Icons -->\n");
      out.write("        <link rel=\"shortcut icon\" href=\"images/favicon.ico\" type=\"image/x-icon\">\n");
      out.write("        <link rel=\"apple-touch-icon\" href=\"images/apple-touch-icon.png\">\n");
      out.write("\n");
      out.write("        <!-- Bootstrap CSS -->\n");
      out.write("        <!--    <link rel=\"stylesheet\" href=\"css/bootstrap.min.css\">-->\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/css/bootstrap.min.css\" \n");
      out.write("              integrity=\"sha384-B0vP5xmATw1+K9KRQjQERJvTumQW0nPEzvF6L/Z6nronJ3oUOFUFpCjEUQouq2+l\" crossorigin=\"anonymous\">\n");
      out.write("        <!-- Site CSS -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/style.css\">\n");
      out.write("        <!-- Responsive CSS -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/responsive.css\">\n");
      out.write("        <!-- Custom CSS -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/custom.css\">\n");
      out.write("\n");
      out.write("        <!--[if lt IE 9]>\n");
      out.write("          <script src=\"https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js\"></script>\n");
      out.write("          <script src=\"https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js\"></script>\n");
      out.write("        <![endif]-->\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("        <!-- Start Main Top -->\n");
      out.write("\n");
      out.write("        <!-- End Main Top -->\n");
      out.write("\n");
      out.write("        <!-- Start Main Top -->\n");
      out.write("        <header class=\"main-header\">\n");
      out.write("            <!-- Start Navigation -->\n");
      out.write("            <nav class=\"navbar navbar-expand-lg navbar-light bg-light navbar-default bootsnav\">\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <!-- Start Header Navigation -->\n");
      out.write("                    <div class=\"navbar-header\">\n");
      out.write("                        <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbar-menu\" aria-controls=\"navbars-rs-food\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("                            <i class=\"fa fa-bars\"></i>\n");
      out.write("                        </button>\n");
      out.write("                        <a class=\"navbar-brand\" href=\"index.html\"><img src=\"images/logo.png\" class=\"logo\" alt=\"\"></a>\n");
      out.write("                    </div>\n");
      out.write("                    <!-- End Header Navigation -->\n");
      out.write("\n");
      out.write("                    <!-- Collect the nav links, forms, and other content for toggling -->\n");
      out.write("                    <div class=\"collapse navbar-collapse\" id=\"navbar-menu\">\n");
      out.write("                        <ul class=\"nav navbar-nav ml-auto\" data-in=\"fadeInDown\" data-out=\"fadeOutUp\">\n");
      out.write("                            <li class=\"nav-item\"><a class=\"nav-link\" href=\"home\">Home</a></li>\n");
      out.write("                                ");
      if (_jspx_meth_c_choose_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                    <!-- /.navbar-collapse -->\n");
      out.write("\n");
      out.write("                    <!-- Start Atribute Navigation -->\n");
      out.write("                    <div class=\"attr-nav\">\n");
      out.write("                        <ul>\n");
      out.write("\n");
      out.write("                            <li class=\"side-menu\"><a href=\"cart\">\n");
      out.write("                                    <i class=\"fa fa-shopping-bag\"></i>\n");
      out.write("                                    <span class=\"badge\"></span>\n");
      out.write("                                    <p>My Cart</p>\n");
      out.write("                                </a></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                    <!-- End Atribute Navigation -->\n");
      out.write("                </div>\n");
      out.write("                <!-- Start Side Menu -->\n");
      out.write("\n");
      out.write("                <!-- End Side Menu -->\n");
      out.write("            </nav>\n");
      out.write("            <!-- End Navigation -->\n");
      out.write("        </header>\n");
      out.write("        <!-- End Main Top -->\n");
      out.write("\n");
      out.write("        <!-- Start Top Search -->\n");
      out.write("        <div class=\"top-search\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"input-group\">\n");
      out.write("                    <span class=\"input-group-addon\"><i class=\"fa fa-search\"></i></span>\n");
      out.write("                    <input type=\"text\" class=\"form-control\" placeholder=\"Search\">\n");
      out.write("                    <span class=\"input-group-addon close-search\"><i class=\"fa fa-times\"></i></span>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <!-- End Top Search -->\n");
      out.write("\n");
      out.write("        <!-- Start All Title Box -->\n");
      out.write("        <div class=\"all-title-box\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-lg-12\">\n");
      out.write("                        <h2>Checkout</h2>\n");
      out.write("                        <ul class=\"breadcrumb\">\n");
      out.write("                            <li class=\"breadcrumb-item\"><a href=\"home\">Home</a></li>\n");
      out.write("                            <li class=\"breadcrumb-item active\">Checkout</li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <!-- End All Title Box -->\n");
      out.write("\n");
      out.write("        <!-- Start Cart  -->\n");
      out.write("        <div class=\"cart-box-main\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-sm-6 col-lg-6 mb-3\">\n");
      out.write("                        <div class=\"checkout-address\">\n");
      out.write("                            <div class=\"title-left\">\n");
      out.write("                                <h3>Billing address</h3>\n");
      out.write("                            </div>\n");
      out.write("                            <form class=\"needs-validation\" novalidate>\n");
      out.write("                                <div class=\"mb-3\">\n");
      out.write("                                    <label for=\"firstName\">Full name *</label>\n");
      out.write("                                    <input type=\"text\" class=\"form-control\" id=\"firstName\" placeholder=\"\" value=\"");
      if (_jspx_meth_c_out_0(_jspx_page_context))
        return;
      out.write("\"readonly=\"\">\n");
      out.write("                                    <div class=\"invalid-feedback\"> Valid first name is required. </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"mb-3\">\n");
      out.write("                                    <label for=\"address\">Address *</label>\n");
      out.write("                                    <input type=\"text\" class=\"form-control\" id=\"address\" placeholder=\"\" value=\"");
      if (_jspx_meth_c_out_1(_jspx_page_context))
        return;
      out.write("\" readonly=\"\">\n");
      out.write("                                    <div class=\"invalid-feedback\"> Please enter your shipping address. </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"mb-3\">\n");
      out.write("                                    <label for=\"phone\">Phone number *</label>\n");
      out.write("                                    <input type=\"text\" class=\"form-control\" id=\"phone\" placeholder=\"\" value=\"");
      if (_jspx_meth_c_out_2(_jspx_page_context))
        return;
      out.write("\" readonly=\"\">\n");
      out.write("                                    <div class=\"invalid-feedback\"> Please enter your shipping phone number. </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"mb-3\">\n");
      out.write("                                    <label for=\"email\">Email Address *</label>\n");
      out.write("                                    <input type=\"email\" class=\"form-control\" id=\"email\" placeholder=\"\" value=\"");
      if (_jspx_meth_c_out_3(_jspx_page_context))
        return;
      out.write("\" readonly=\"\">\n");
      out.write("                                    <div class=\"invalid-feedback\"> Please enter a valid email address for shipping updates. </div>\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                                <hr class=\"mb-4\">\n");
      out.write("                                <div class=\"title\"> <span>Payment</span> </div>\n");
      out.write("                                <div class=\"d-block my-3\">\n");
      out.write("                                    <div class=\"custom-control custom-radio\">\n");
      out.write("                                        <input id=\"credit\" name=\"paymentMethod\" type=\"radio\" class=\"custom-control-input\" checked required>\n");
      out.write("                                        <label class=\"custom-control-label\" for=\"credit\">Cash</label>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"custom-control custom-radio\">\n");
      out.write("                                        <input id=\"debit\" name=\"paymentMethod\" type=\"radio\" class=\"custom-control-input\" required>\n");
      out.write("                                        <label class=\"custom-control-label\" for=\"debit\">Bank Card</label>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <hr class=\"mb-1\"> </form>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"shipping-method-box\">\n");
      out.write("                            <div class=\"title-left\">\n");
      out.write("                                <h3>Shipping Method</h3>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"mb-4\">\n");
      out.write("                                <div class=\"custom-control custom-radio\">\n");
      out.write("                                    <input id=\"shippingOption1\" name=\"shipping-option\" class=\"custom-control-input\" checked=\"checked\" type=\"radio\">\n");
      out.write("                                    <label class=\"custom-control-label\" for=\"shippingOption1\">Giao Hàng Tiết Kiệm</label> <span class=\"float-right font-weight-bold\">FREE</span> \n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"ml-4 mb-2 small\">(3-7 business days)</div>\n");
      out.write("                                <div class=\"custom-control custom-radio\">\n");
      out.write("                                    <input id=\"shippingOption2\" name=\"shipping-option\" class=\"custom-control-input\" type=\"radio\">\n");
      out.write("                                    <label class=\"custom-control-label\" for=\"shippingOption2\">BEST Express</label> <span class=\"float-right font-weight-bold\">FREE</span> \n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"ml-4 mb-2 small\">(2-4 business days)</div>\n");
      out.write("                                <div class=\"custom-control custom-radio\">\n");
      out.write("                                    <input id=\"shippingOption3\" name=\"shipping-option\" class=\"custom-control-input\" type=\"radio\">\n");
      out.write("                                    <label class=\"custom-control-label\" for=\"shippingOption3\">Ninja Van</label> <span class=\"float-right font-weight-bold\">FREE</span> \n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"ml-4 mb-2 small\">(3-5 business days)</div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-sm-6 col-lg-6 mb-3\">\n");
      out.write("                        <div class=\"row\">\n");
      out.write("\n");
      out.write("                            <div class=\"col-md-12 col-lg-12\">\n");
      out.write("                                <div class=\"odr-box\">\n");
      out.write("                                    <div class=\"title-left\">\n");
      out.write("                                        <h3>Shopping cart</h3>\n");
      out.write("                                    </div>\n");
      out.write("                                    ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-md-12 col-lg-12\">\n");
      out.write("                                <div class=\"order-box\">\n");
      out.write("                                    <div class=\"title-left\">\n");
      out.write("                                        <h3>Your order</h3>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"d-flex\">\n");
      out.write("                                        <div class=\"font-weight-bold\">Product</div>\n");
      out.write("                                        <div class=\"ml-auto font-weight-bold\">Total</div>\n");
      out.write("                                    </div>\n");
      out.write("\n");
      out.write("                                    <div class=\"d-flex\">\n");
      out.write("                                        <h4>Tax</h4>\n");
      out.write("                                        <div class=\"ml-auto font-weight-bold\"> $ 0 </div>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"d-flex\">\n");
      out.write("                                        <h4>Shipping Cost</h4>\n");
      out.write("                                        <div class=\"ml-auto font-weight-bold\"> Free </div>\n");
      out.write("                                    </div>\n");
      out.write("                                    <hr>\n");
      out.write("                                    <div class=\"d-flex gr-total\">\n");
      out.write("                                        <h5>Grand Total</h5>\n");
      out.write("                                        <div class=\"ml-auto h5\"> $ ");
      if (_jspx_meth_c_out_4(_jspx_page_context))
        return;
      out.write(" </div>\n");
      out.write("                                    </div>\n");
      out.write("                                    <hr> </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-12 d-flex shopping-box\"> \n");
      out.write("                                <div class=\"col-12 d-flex shopping-box\"> \n");
      out.write("                                    <a href=\"pay\" class=\"ml-auto btn hvr-hover\">Place Order</a>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <!-- End Cart -->\n");
      out.write("\n");
      out.write("        <!-- Start Instagram Feed  -->\n");
      out.write("        <div class=\"instagram-box\">\n");
      out.write("            <div class=\"main-instagram owl-carousel owl-theme\">\n");
      out.write("                <div class=\"item\">\n");
      out.write("                    <div class=\"ins-inner-box\">\n");
      out.write("                        <img src=\"images/instagram-img-01.jpg\" alt=\"\" />\n");
      out.write("                        <div class=\"hov-in\">\n");
      out.write("                            <a href=\"#\"><i class=\"fab fa-instagram\"></i></a>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"item\">\n");
      out.write("                    <div class=\"ins-inner-box\">\n");
      out.write("                        <img src=\"images/instagram-img-02.jpg\" alt=\"\" />\n");
      out.write("                        <div class=\"hov-in\">\n");
      out.write("                            <a href=\"#\"><i class=\"fab fa-instagram\"></i></a>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"item\">\n");
      out.write("                    <div class=\"ins-inner-box\">\n");
      out.write("                        <img src=\"images/instagram-img-03.jpg\" alt=\"\" />\n");
      out.write("                        <div class=\"hov-in\">\n");
      out.write("                            <a href=\"#\"><i class=\"fab fa-instagram\"></i></a>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"item\">\n");
      out.write("                    <div class=\"ins-inner-box\">\n");
      out.write("                        <img src=\"images/instagram-img-04.jpg\" alt=\"\" />\n");
      out.write("                        <div class=\"hov-in\">\n");
      out.write("                            <a href=\"#\"><i class=\"fab fa-instagram\"></i></a>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"item\">\n");
      out.write("                    <div class=\"ins-inner-box\">\n");
      out.write("                        <img src=\"images/instagram-img-05.jpg\" alt=\"\" />\n");
      out.write("                        <div class=\"hov-in\">\n");
      out.write("                            <a href=\"#\"><i class=\"fab fa-instagram\"></i></a>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"item\">\n");
      out.write("                    <div class=\"ins-inner-box\">\n");
      out.write("                        <img src=\"images/instagram-img-06.jpg\" alt=\"\" />\n");
      out.write("                        <div class=\"hov-in\">\n");
      out.write("                            <a href=\"#\"><i class=\"fab fa-instagram\"></i></a>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"item\">\n");
      out.write("                    <div class=\"ins-inner-box\">\n");
      out.write("                        <img src=\"images/instagram-img-07.jpg\" alt=\"\" />\n");
      out.write("                        <div class=\"hov-in\">\n");
      out.write("                            <a href=\"#\"><i class=\"fab fa-instagram\"></i></a>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"item\">\n");
      out.write("                    <div class=\"ins-inner-box\">\n");
      out.write("                        <img src=\"images/instagram-img-08.jpg\" alt=\"\" />\n");
      out.write("                        <div class=\"hov-in\">\n");
      out.write("                            <a href=\"#\"><i class=\"fab fa-instagram\"></i></a>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"item\">\n");
      out.write("                    <div class=\"ins-inner-box\">\n");
      out.write("                        <img src=\"images/instagram-img-09.jpg\" alt=\"\" />\n");
      out.write("                        <div class=\"hov-in\">\n");
      out.write("                            <a href=\"#\"><i class=\"fab fa-instagram\"></i></a>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"item\">\n");
      out.write("                    <div class=\"ins-inner-box\">\n");
      out.write("                        <img src=\"images/instagram-img-05.jpg\" alt=\"\" />\n");
      out.write("                        <div class=\"hov-in\">\n");
      out.write("                            <a href=\"#\"><i class=\"fab fa-instagram\"></i></a>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <!-- End Instagram Feed  -->\n");
      out.write("\n");
      out.write("\n");
      out.write("        <!-- Start Footer  -->\n");
      out.write("        <footer>\n");
      out.write("            <div class=\"footer-main\">\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-lg-4 col-md-12 col-sm-12\">\n");
      out.write("                            <div class=\"footer-top-box\">\n");
      out.write("                                <h3>Office Address</h3>\n");
      out.write("                                <ul class=\"list-time\">\n");
      out.write("                                    <li>Trường Đại học FPT Hà Nội</li><li>Km29 - Đại lộ Thăng Long</li> <li>Khu CNC Hòa Lạc</li> <li>xã Thạch Hòa, huyện Thạch Thất</li> <li>Thành phố Hà Nội</li>\n");
      out.write("                                </ul>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-lg-4 col-md-12 col-sm-12\">\n");
      out.write("                            <div class=\"footer-top-box\">\n");
      out.write("                                <h3>News</h3>\n");
      out.write("                                <form class=\"newsletter-box\">\n");
      out.write("                                    <div class=\"form-group\">\n");
      out.write("                                        <input class=\"\" type=\"email\" name=\"Email\" placeholder=\"Email Address*\" />\n");
      out.write("                                        <i class=\"fa fa-envelope\"></i>\n");
      out.write("                                    </div>\n");
      out.write("                                    <button class=\"btn hvr-hover\" type=\"submit\">Submit</button>\n");
      out.write("                                </form>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-lg-4 col-md-12 col-sm-12\">\n");
      out.write("                            <div class=\"footer-top-box\">\n");
      out.write("                                <h3>Social Media</h3>\n");
      out.write("                                <p></p>\n");
      out.write("                                <ul>\n");
      out.write("                                    <li><a href=\"#\"><i class=\"fab fa-facebook\" aria-hidden=\"true\"></i></a></li>\n");
      out.write("                                    <li><a href=\"#\"><i class=\"fab fa-twitter\" aria-hidden=\"true\"></i></a></li>\n");
      out.write("                                    <li><a href=\"#\"><i class=\"fab fa-linkedin\" aria-hidden=\"true\"></i></a></li>\n");
      out.write("                                    <li><a href=\"#\"><i class=\"fab fa-google-plus\" aria-hidden=\"true\"></i></a></li>\n");
      out.write("                                    <li><a href=\"#\"><i class=\"fa fa-rss\" aria-hidden=\"true\"></i></a></li>\n");
      out.write("                                    <li><a href=\"#\"><i class=\"fab fa-pinterest-p\" aria-hidden=\"true\"></i></a></li>\n");
      out.write("                                    <li><a href=\"#\"><i class=\"fab fa-whatsapp\" aria-hidden=\"true\"></i></a></li>\n");
      out.write("                                </ul>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <hr>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </footer>\n");
      out.write("        <!-- End Footer  -->\n");
      out.write("\n");
      out.write("        <!-- Start copyright  -->\n");
      out.write("        <div class=\"footer-copyright\">\n");
      out.write("            <p class=\"footer-company\">2021 &copy; by <a href=\"https://www.facebook.com/HoangHung.Trijnh/\" target=\"_blank\">Trinh Hoang Hung</a> - PRJ321 Summer 2021\n");
      out.write("        </div>\n");
      out.write("        <!-- End copyright  -->\n");
      out.write("\n");
      out.write("        <a href=\"#\" id=\"back-to-top\" title=\"Back to top\" style=\"display: none;\">&uarr;</a>\n");
      out.write("\n");
      out.write("        <a href=\"#\" id=\"back-to-top\" title=\"Back to top\" style=\"display: none;\">&uarr;</a>\n");
      out.write("\n");
      out.write("        <!-- ALL JS FILES -->\n");
      out.write("        <script src=\"js/jquery-3.2.1.min.js\"></script>\n");
      out.write("        <script src=\"js/popper.min.js\"></script>\n");
      out.write("        <script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("        <!-- ALL PLUGINS -->\n");
      out.write("        <script src=\"js/jquery.superslides.min.js\"></script>\n");
      out.write("        <script src=\"js/bootstrap-select.js\"></script>\n");
      out.write("        <script src=\"js/inewsticker.js\"></script>\n");
      out.write("        <script src=\"js/bootsnav.js.\"></script>\n");
      out.write("        <script src=\"js/images-loded.min.js\"></script>\n");
      out.write("        <script src=\"js/isotope.min.js\"></script>\n");
      out.write("        <script src=\"js/owl.carousel.min.js\"></script>\n");
      out.write("        <script src=\"js/baguetteBox.min.js\"></script>\n");
      out.write("        <script src=\"js/form-validator.min.js\"></script>\n");
      out.write("        <script src=\"js/contact-form-script.js\"></script>\n");
      out.write("        <script src=\"js/custom.js\"></script>\n");
      out.write("        <script src=\"https://kit.fontawesome.com/228aa84c51.js\" crossorigin=\"anonymous\"></script>\n");
      out.write("    </body>\n");
      out.write("\n");
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

  private boolean _jspx_meth_c_choose_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:choose
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_choose_0 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _jspx_tagPool_c_choose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
    _jspx_th_c_choose_0.setPageContext(_jspx_page_context);
    _jspx_th_c_choose_0.setParent(null);
    int _jspx_eval_c_choose_0 = _jspx_th_c_choose_0.doStartTag();
    if (_jspx_eval_c_choose_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                    ");
        if (_jspx_meth_c_when_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                                    ");
        if (_jspx_meth_c_otherwise_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                                ");
        int evalDoAfterBody = _jspx_th_c_choose_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_choose_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_0);
      return true;
    }
    _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_0);
    return false;
  }

  private boolean _jspx_meth_c_when_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_0 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_when_0.setPageContext(_jspx_page_context);
    _jspx_th_c_when_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
    _jspx_th_c_when_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.user == null || sessionScope.pass == null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_when_0 = _jspx_th_c_when_0.doStartTag();
    if (_jspx_eval_c_when_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                        ");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${'<li class=\"nav-item\"><a class=\"nav-link\" href=\"signin\">Sign In <i class=\"fas fa-sign-in-alt\"></i></a></li>'}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\n");
        out.write("                                    ");
        int evalDoAfterBody = _jspx_th_c_when_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_when_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_0);
      return true;
    }
    _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_0);
    return false;
  }

  private boolean _jspx_meth_c_otherwise_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:otherwise
    org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_otherwise_0 = (org.apache.taglibs.standard.tag.common.core.OtherwiseTag) _jspx_tagPool_c_otherwise.get(org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class);
    _jspx_th_c_otherwise_0.setPageContext(_jspx_page_context);
    _jspx_th_c_otherwise_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
    int _jspx_eval_c_otherwise_0 = _jspx_th_c_otherwise_0.doStartTag();
    if (_jspx_eval_c_otherwise_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                        ");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${'<li class=\"nav-item\"><a class=\"nav-link\" href=\"account.jsp\">Account <i class=\"fas fa-user-circle\"></i></a></li>'}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\n");
        out.write("                                    ");
        int evalDoAfterBody = _jspx_th_c_otherwise_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_otherwise_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_0);
      return true;
    }
    _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_0);
    return false;
  }

  private boolean _jspx_meth_c_out_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_0 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_0.setPageContext(_jspx_page_context);
    _jspx_th_c_out_0.setParent(null);
    _jspx_th_c_out_0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${currAcc.fullname}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_0 = _jspx_th_c_out_0.doStartTag();
    if (_jspx_th_c_out_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_0);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_0);
    return false;
  }

  private boolean _jspx_meth_c_out_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_1 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_1.setPageContext(_jspx_page_context);
    _jspx_th_c_out_1.setParent(null);
    _jspx_th_c_out_1.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${currAcc.address}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_1 = _jspx_th_c_out_1.doStartTag();
    if (_jspx_th_c_out_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_1);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_1);
    return false;
  }

  private boolean _jspx_meth_c_out_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_2 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_2.setPageContext(_jspx_page_context);
    _jspx_th_c_out_2.setParent(null);
    _jspx_th_c_out_2.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${currAcc.phone}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_2 = _jspx_th_c_out_2.doStartTag();
    if (_jspx_th_c_out_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_2);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_2);
    return false;
  }

  private boolean _jspx_meth_c_out_3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_3 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_3.setPageContext(_jspx_page_context);
    _jspx_th_c_out_3.setParent(null);
    _jspx_th_c_out_3.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${currAcc.email}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_3 = _jspx_th_c_out_3.doStartTag();
    if (_jspx_th_c_out_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_3);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_3);
    return false;
  }

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listCart}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("cart");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                        <div class=\"rounded p-2 bg-light\">\n");
          out.write("                                            <div class=\"media mb-2 border-bottom\">\n");
          out.write("                                                <div class=\"media-body\"> <a href=\"detail?pid=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cart.pid}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\"> ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cart.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</a>\n");
          out.write("                                                    <div class=\"small text-muted\">Price: $");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cart.price}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(" <span class=\"mx-2\">|</span> Qty: ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cart.quantity}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(" <span class=\"mx-2\">|</span> Total: $");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cart.getTotal()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</div>\n");
          out.write("                                                </div>\n");
          out.write("                                            </div>\n");
          out.write("                                        </div>\n");
          out.write("                                    ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }

  private boolean _jspx_meth_c_out_4(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_4 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_4.setPageContext(_jspx_page_context);
    _jspx_th_c_out_4.setParent(null);
    _jspx_th_c_out_4.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${total}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_4 = _jspx_th_c_out_4.doStartTag();
    if (_jspx_th_c_out_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_4);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_4);
    return false;
  }
}
