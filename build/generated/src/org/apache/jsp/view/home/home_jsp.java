package org.apache.jsp.view.home;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import model.Data;
import model.Product;
import java.util.ArrayList;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_out_value;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_out_value = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
    _jspx_tagPool_c_out_value.release();
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\" />\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\" />\n");
      out.write("        <meta name=\"description\" content=\"\" />\n");
      out.write("        <meta name=\"author\" content=\"\" />\n");
      out.write("        <title> Trang chủ </title>\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/simple-datatables@latest/dist/style.css\" rel=\"stylesheet\" />\n");
      out.write("        <link href=\"../CSS/styles.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"../CSS/pagger.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/js/all.min.js\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"https://www.gstatic.com/charts/loader.js\"></script>\n");
      out.write("        ");

            ArrayList<Product> productMaxQ = (ArrayList<Product>) request.getAttribute("productMaxQ");
            ArrayList<Product> productLowQ = (ArrayList<Product>) request.getAttribute("productLowQ");
            ArrayList<Product> productHHSD = (ArrayList<Product>) request.getAttribute("productHHSD");
            ArrayList<Product> productTKLN = (ArrayList<Product>) request.getAttribute("productTKLN");
            ArrayList<Product> productSHHSD = (ArrayList<Product>) request.getAttribute("productSHHSD");
            ArrayList<Data> dat = (ArrayList<Data>) request.getAttribute("data");
        
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body class=\"sb-nav-fixed\">\n");
      out.write("        <nav class=\"sb-topnav navbar navbar-expand navbar-dark bg-dark\">\n");
      out.write("            <!-- Navbar Brand-->\n");
      out.write("            <a class=\"navbar-brand ps-3\" href=\"home\">Tác Vụ</a>\n");
      out.write("            <!-- Sidebar Toggle-->\n");
      out.write("            <button class=\"btn btn-link btn-sm order-1 order-lg-0 me-4 me-lg-0\" id=\"sidebarToggle\" href=\"#!\"><i class=\"fas fa-bars\"></i></button>\n");
      out.write("            <!-- Navbar Search-->\n");
      out.write("            <form action=\"../action/search\" class=\"d-none d-md-inline-block form-inline ms-auto me-0 me-md-3 my-2 my-md-0\">\n");
      out.write("                <div class=\"input-group\">\n");
      out.write("                    <input name=\"text\"  class=\"form-control\" type=\"text\" placeholder=\"Tìm kiếm...\" aria-label=\"Tìm kiếm...\" aria-describedby=\"btnNavbarSearch\" />\n");
      out.write("                    <button class=\"btn btn-primary\" id=\"btnNavbarSearch\" type=\"submit\"><i class=\"fas fa-search\"></i></button>\n");
      out.write("                </div>\n");
      out.write("            </form>\n");
      out.write("            <!-- Navbar-->\n");
      out.write("            <ul class=\"navbar-nav ms-auto ms-md-0 me-3 me-lg-4\">\n");
      out.write("                <li class=\"nav-item dropdown\">\n");
      out.write("                    <a class=\"nav-link dropdown-toggle\" id=\"navbarDropdown\" href=\"#\" role=\"button\" data-bs-toggle=\"dropdown\" aria-expanded=\"false\"><i class=\"fas fa-user fa-fw\"></i></a>\n");
      out.write("                    <ul class=\"dropdown-menu dropdown-menu-end\" aria-labelledby=\"navbarDropdown\">\n");
      out.write("                        <li><hr class=\"dropdown-divider\" /></li>\n");
      out.write("                        <li><a class=\"dropdown-item\" href=\"../account/resetpassword\">Đổi Mật Khẩu</a></li>\n");
      out.write("                        <li><a class=\"dropdown-item\" href=\"../loginn.html\">Đăng xuất</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </li>\n");
      out.write("            </ul>\n");
      out.write("        </nav>\n");
      out.write("        <div id=\"layoutSidenav\">\n");
      out.write("            <div id=\"layoutSidenav_nav\">\n");
      out.write("                <nav class=\"sb-sidenav accordion sb-sidenav-dark\" id=\"sidenavAccordion\">\n");
      out.write("                    <div class=\"sb-sidenav-menu\">\n");
      out.write("                        <div class=\"nav\">\n");
      out.write("                            <div class=\"sb-sidenav-menu-heading\">Biểu đồ</div>\n");
      out.write("                            <a class=\"nav-link\" href=\"home\">\n");
      out.write("                                <div class=\"sb-nav-link-icon\"><i class=\"fas fa-tachometer-alt\"></i></div>\n");
      out.write("                                Báo cáo dữ liệu\n");
      out.write("                            </a>\n");
      out.write("                            <div class=\"sb-sidenav-menu-heading\">Sản phẩm</div>\n");
      out.write("                            <a class=\"nav-link collapsed\" href=\"#\" data-bs-toggle=\"collapse\" data-bs-target=\"#collapseLayouts\" aria-expanded=\"false\" aria-controls=\"collapseLayouts\">\n");
      out.write("                                <div class=\"sb-nav-link-icon\"><i class=\"fas fa-columns\"></i></div>\n");
      out.write("                                Sản phẩm\n");
      out.write("                                <div class=\"sb-sidenav-collapse-arrow\"><i class=\"fas fa-angle-down\"></i></div>\n");
      out.write("                            </a>\n");
      out.write("                            <div class=\"collapse\" id=\"collapseLayouts\" aria-labelledby=\"headingOne\" data-bs-parent=\"#sidenavAccordion\">\n");
      out.write("                                <nav class=\"sb-sidenav-menu-nested nav\">\n");
      out.write("                                    <a class=\"nav-link\" href=\"../product/search\">Danh sách sản phẩm</a>\n");
      out.write("                                    <a class=\"nav-link\" href=\"../product/insert\">Thêm sản phẩm</a>\n");
      out.write("                                </nav>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            <div class=\"sb-sidenav-menu-heading\"> Nguồn Hàng</div>\n");
      out.write("                            <a class=\"nav-link collapsed\" href=\"#\" data-bs-toggle=\"collapse\" data-bs-target=\"#collapseLayouts\" aria-expanded=\"false\" aria-controls=\"collapseLayouts\">\n");
      out.write("                                <div class=\"sb-nav-link-icon\"><i class=\"fas fa-columns\"></i></div>\n");
      out.write("                                Nguồn Hàng\n");
      out.write("                                <div class=\"sb-sidenav-collapse-arrow\"><i class=\"fas fa-angle-down\"></i></div>\n");
      out.write("                            </a>\n");
      out.write("                            <div class=\"collapse\" id=\"collapseLayouts\" aria-labelledby=\"headingOne\" data-bs-parent=\"#sidenavAccordion\">\n");
      out.write("                                <nav class=\"sb-sidenav-menu-nested nav\">\n");
      out.write("                                    <a class=\"nav-link\" href=\"../nguon/search\">Danh sách nguồn hàng</a>\n");
      out.write("                                    <a class=\"nav-link\" href=\"../nguon/insert\">Thêm nguồn hàng</a>\n");
      out.write("                                </nav>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            <div class=\"sb-sidenav-menu-heading\"> Các Loại sản phẩm </div>\n");
      out.write("                            <a class=\"nav-link collapsed\" href=\"#\" data-bs-toggle=\"collapse\" data-bs-target=\"#collapseLayouts\" aria-expanded=\"false\" aria-controls=\"collapseLayouts\">\n");
      out.write("                                <div class=\"sb-nav-link-icon\"><i class=\"fas fa-columns\"></i></div>\n");
      out.write("                                Các Loại sản phẩm trong cửa hàng\n");
      out.write("                                <div class=\"sb-sidenav-collapse-arrow\"><i class=\"fas fa-angle-down\"></i></div>\n");
      out.write("                            </a>\n");
      out.write("                            <div class=\"collapse\" id=\"collapseLayouts\" aria-labelledby=\"headingOne\" data-bs-parent=\"#sidenavAccordion\">\n");
      out.write("                                <nav class=\"sb-sidenav-menu-nested nav\">\n");
      out.write("                                    <a class=\"nav-link\" href=\"../loaisp/search\">Danh sách Các Loại sản phẩm</a>\n");
      out.write("                                    <a class=\"nav-link\" href=\"../loaisp/insert\">Thêm Loại sản phẩm</a>\n");
      out.write("                                </nav>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            <a class=\"nav-link collapsed\" href=\"#\" data-bs-toggle=\"collapse\" data-bs-target=\"#collapsePages\" aria-expanded=\"false\" aria-controls=\"collapsePages\">\n");
      out.write("                                <div class=\"sb-nav-link-icon\"><i class=\"fas fa-book-open\"></i></div>\n");
      out.write("                                Trang\n");
      out.write("                                <div class=\"sb-sidenav-collapse-arrow\"><i class=\"fas fa-angle-down\"></i></div>\n");
      out.write("                            </a>\n");
      out.write("                            <div class=\"collapse\" id=\"collapsePages\" aria-labelledby=\"headingTwo\" data-bs-parent=\"#sidenavAccordion\">\n");
      out.write("                                <nav class=\"sb-sidenav-menu-nested nav accordion\" id=\"sidenavAccordionPages\">\n");
      out.write("                                    <a class=\"nav-link collapsed\" href=\"#\" data-bs-toggle=\"collapse\" data-bs-target=\"#pagesCollapseAuth\" aria-expanded=\"false\" aria-controls=\"pagesCollapseAuth\">\n");
      out.write("                                        Tài Khoản\n");
      out.write("                                        <div class=\"sb-sidenav-collapse-arrow\"><i class=\"fas fa-angle-down\"></i></div>\n");
      out.write("                                    </a>\n");
      out.write("                                    <div class=\"collapse\" id=\"pagesCollapseAuth\" aria-labelledby=\"headingOne\" data-bs-parent=\"#sidenavAccordionPages\">\n");
      out.write("                                        <nav class=\"sb-sidenav-menu-nested nav\">\n");
      out.write("                                            <a class=\"nav-link\" href=\"../loginn.html\">Đăng nhập</a>\n");
      out.write("                                            <a class=\"nav-link\" href=\"../register.html\">Đăng Xuất</a>\n");
      out.write("                                            <a class=\"nav-link\" href=\"../password.html\">Quên Mật Khẩu</a>\n");
      out.write("                                        </nav>\n");
      out.write("                                    </div>\n");
      out.write("                                </nav>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                </nav>\n");
      out.write("            </div>\n");
      out.write("            <div id=\"layoutSidenav_content\">\n");
      out.write("                <main>\n");
      out.write("                    <div class=\"container-fluid px-4\">\n");
      out.write("                        <h1 class=\"mt-4\">Sản phẩm</h1>\n");
      out.write("                        <ol class=\"breadcrumb mb-4\">\n");
      out.write("                            <li class=\"breadcrumb-item active\">Dữ liệu về sản phẩm</li>\n");
      out.write("                        </ol>\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"col-xl-6 col-md-6\">\n");
      out.write("                                <div class=\"left\"><h4>Sản phẩm còn với số lượng lớn</h4>\n");
      out.write("                                    <button class=\"btn btn-primary\"   onclick=\"showmore(event)\"><div id=\"more1\"> Xem thêm </div> <div style=\"display: none\" id=\"hide1\"> Ẩn bớt</div></button>\n");
      out.write("                                    ");
 if (productMaxQ.size() > 0) { 
      out.write("\n");
      out.write("                                    <div id=\"table1\" style=\"display: none\"><br>\n");
      out.write("                                        <table class=\"tableshow\">\n");
      out.write("                                            <thead>\n");
      out.write("                                                <tr>\n");
      out.write("                                                    <th>Mã sản phẩn</th>\n");
      out.write("                                                    <th>Tên Sản Phẩm</th>\n");
      out.write("                                                    <th> DVT </th>\n");
      out.write("                                                    <th>Ngày sản xuất</th>\n");
      out.write("                                                    <th>Hạn sử dụng</th>\n");
      out.write("                                                    <th>Ngày Nhập Kho</th>\n");
      out.write("                                                    <th>Kệ Hàng Số</th>\n");
      out.write("                                                    <th> Số lượng</th>\n");
      out.write("                                                    <th>Giá</th>\n");
      out.write("                                                </tr>\n");
      out.write("                                            </thead>\n");
      out.write("                                            <tbody>\n");
      out.write("                                                ");
 for (Product p : productMaxQ) {
                                                
      out.write("\n");
      out.write("                                                <tr>\n");
      out.write("                                                    <td>");
      out.print(p.getMasp());
      out.write("</td>\n");
      out.write("                                                    <td>");
      out.print(p.getTensp());
      out.write("</td>\n");
      out.write("                                                    <td>");
      out.print(p.getDVT());
      out.write("</td>\n");
      out.write("                                                    <td>");
      out.print(p.getNgaySX());
      out.write("</td>\n");
      out.write("                                                    <td>");
      out.print(p.getHanSD());
      out.write("</td>\n");
      out.write("                                                    <td>");
      out.print(p.getNgayNhapKho());
      out.write("</td>\n");
      out.write("                                                    <td>");
      out.print(p.getKeHang());
      out.write("</td>\n");
      out.write("                                                    <td>");
      out.print(p.getSoLuong());
      out.write(" </td>\n");
      out.write("                                                    <td>");
      out.print(p.getGiaBan());
      out.write(" </td>\n");
      out.write("                                                </tr>\n");
      out.write("                                                ");
}
      out.write("\n");
      out.write("                                            </tbody>\n");
      out.write("                                        </table>\n");
      out.write("                                        ");
} else {
      out.write("\n");
      out.write("                                        Hiện không có sản phẩm nào!\n");
      out.write("                                        ");
}
      out.write("\n");
      out.write("                                        <br/>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-xl-6 col-md-6\">\n");
      out.write("                                <div class=\"left\"><h4>Sản phẩm có số lượng ít</h4>\n");
      out.write("                                    <button class=\"btn btn-primary\"   onclick=\"showmore2(event)\"><div id=\"more2\"> Xem thêm </div> <div style=\"display: none\" id=\"hide2\"> Ẩn bớt</div></button>\n");
      out.write("                                    ");
 if (productLowQ.size() > 0) { 
      out.write("\n");
      out.write("                                    <div id=\"table2\" style=\"display: none\"><br>\n");
      out.write("                                        <table class=\"tableshow\">\n");
      out.write("                                            <thead>\n");
      out.write("                                                <tr>\n");
      out.write("                                                    <th>Mã sản phẩn</th>\n");
      out.write("                                                    <th>Tên Sản Phẩm</th>\n");
      out.write("                                                    <th> DVT </th>\n");
      out.write("                                                    <th>Ngày sản xuất</th>\n");
      out.write("                                                    <th>Hạn sử dụng</th>\n");
      out.write("                                                    <th>Ngày nhập kho</th>\n");
      out.write("                                                    <th>Kệ Hàng Số</th>\n");
      out.write("                                                    <th> Số lượng</th>\n");
      out.write("                                                    <th>Giá</th>\n");
      out.write("                                                </tr>\n");
      out.write("                                            </thead>\n");
      out.write("                                            <tbody>\n");
      out.write("                                                ");
 for (Product p : productLowQ) {
                                                
      out.write("\n");
      out.write("                                                <tr>\n");
      out.write("                                                    <td>");
      out.print(p.getMasp());
      out.write("</td>\n");
      out.write("                                                    <td>");
      out.print(p.getTensp());
      out.write("</td>\n");
      out.write("                                                    <td>");
      out.print(p.getDVT());
      out.write("</td>\n");
      out.write("                                                    <td>");
      out.print(p.getNgaySX());
      out.write("</td>\n");
      out.write("                                                    <td>");
      out.print(p.getHanSD());
      out.write("</td>\n");
      out.write("                                                    <td>");
      out.print(p.getNgayNhapKho());
      out.write("</td>\n");
      out.write("                                                    <td>");
      out.print(p.getKeHang());
      out.write("</td>\n");
      out.write("                                                    <td>");
      out.print(p.getSoLuong());
      out.write(" </td>\n");
      out.write("                                                    <td>");
      out.print(p.getGiaBan());
      out.write(" </td>\n");
      out.write("                                                </tr>\n");
      out.write("                                                ");
}
      out.write("\n");
      out.write("                                            </tbody>\n");
      out.write("                                        </table>\n");
      out.write("                                        ");
} else {
      out.write("\n");
      out.write("                                        Hiện không có sản phẩm nào!\n");
      out.write("                                        ");
}
      out.write("\n");
      out.write("                                        <br/>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div> <br>\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"col-xl-6 col-md-6\">\n");
      out.write("                                <div class=\"left\"><h4>Sản phẩm đã quá hạn sử dụng</h4>\n");
      out.write("                                    <button class=\"btn btn-primary\"   onclick=\"showmore3(event)\"><div id=\"more3\"> Xem thêm </div> <div style=\"display: none\" id=\"hide3\"> Ẩn bớt</div></button>\n");
      out.write("                                    ");
 if (productHHSD.size() > 0) { 
      out.write("\n");
      out.write("                                    <div id=\"table3\" style=\"display: none\"><br>\n");
      out.write("                                        <table class=\"tableshow\">\n");
      out.write("                                            <thead>\n");
      out.write("                                                <tr>\n");
      out.write("                                                    <th>Mã sản phẩn</th>\n");
      out.write("                                                    <th>Tên Sản Phẩm</th>\n");
      out.write("                                                    <th> DVT </th>\n");
      out.write("                                                    <th>Ngày sản xuất</th>\n");
      out.write("                                                    <th>Hạn sử dụng</th>\n");
      out.write("                                                    <th>Ngày nhập kho</th>\n");
      out.write("                                                    <th>Kệ Hàng Số</th>\n");
      out.write("                                                    <th> Số lượng</th>\n");
      out.write("                                                    <th>Giá</th>\n");
      out.write("                                                    <th></th>\n");
      out.write("                                                </tr>\n");
      out.write("                                            </thead>\n");
      out.write("                                            <tbody>\n");
      out.write("                                                ");
 for (Product p : productHHSD) {
                                                
      out.write("\n");
      out.write("                                                <tr>\n");
      out.write("                                                    <td>");
      out.print(p.getMasp());
      out.write("</td>\n");
      out.write("                                                    <td>");
      out.print(p.getTensp());
      out.write("</td>\n");
      out.write("                                                    <td>");
      out.print(p.getDVT());
      out.write("</td>\n");
      out.write("                                                    <td>");
      out.print(p.getNgaySX());
      out.write("</td>\n");
      out.write("                                                    <td>");
      out.print(p.getHanSD());
      out.write("</td>\n");
      out.write("                                                    <td>");
      out.print(p.getNgayNhapKho());
      out.write("</td>\n");
      out.write("                                                    <td>");
      out.print(p.getKeHang());
      out.write("</td>\n");
      out.write("                                                    <td>");
      out.print(p.getSoLuong());
      out.write(" </td>\n");
      out.write("                                                    <td>");
      out.print(p.getGiaBan());
      out.write(" </td>\n");
      out.write("                                                    <td><a href=\"edit?id=");
      out.print(p.getMasp());
      out.write("\"><img style=\"width: 20px\" src=\"../img/edit.png\" alt=\"\"/></a> \n");
      out.write("                                                        <a href=\"#\" onclick=\"deleteProduct(");
      out.print(p.getMasp());
      out.write(");\" ><img style=\"width: 20px\" src=\"../img/delete.png\" alt=\"\"/></a></td>\n");
      out.write("                                                </tr>\n");
      out.write("                                                ");
}
      out.write("\n");
      out.write("                                            </tbody>\n");
      out.write("                                        </table>\n");
      out.write("                                        ");
} else {
      out.write("\n");
      out.write("                                        Hiện không có sản phẩm nào!\n");
      out.write("                                        ");
}
      out.write("\n");
      out.write("                                        <br/>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            <div class=\"col-xl-6 col-md-6\">\n");
      out.write("                                <div class=\"left\"><h4>Sản phẩm đã tồn kho lâu</h4>\n");
      out.write("                                    <button class=\"btn btn-primary\" onclick=\"showmore4(event)\"><div id=\"more\"> Xem thêm </div> <div style=\"display: none\" id=\"hide\"> Ẩn bớt</div></button>\n");
      out.write("                                    ");
 if (productTKLN.size() > 0) { 
      out.write("\n");
      out.write("                                    <div id=\"table4\" style=\"display: none\"><br>\n");
      out.write("                                        <table class=\"tableshow\">\n");
      out.write("                                            <thead>\n");
      out.write("                                                <tr>\n");
      out.write("                                                    <th>Mã sản phẩn</th>\n");
      out.write("                                                    <th>Tên Sản Phẩm</th>\n");
      out.write("                                                    <th> DVT </th>\n");
      out.write("                                                    <th>Ngày sản xuất</th>\n");
      out.write("                                                    <th>Hạn sử dụng</th>\n");
      out.write("                                                    <th>Ngày nhập kho</th>\n");
      out.write("                                                    <th>Kệ Hàng Số</th>\n");
      out.write("                                                    <th> Số lượng</th>\n");
      out.write("                                                    <th>Giá</th>\n");
      out.write("                                                </tr>\n");
      out.write("                                            </thead>\n");
      out.write("                                            <tbody>\n");
      out.write("                                                ");
 for (Product p : productTKLN) {
                                                
      out.write("\n");
      out.write("                                                <tr>\n");
      out.write("                                                    <td>");
      out.print(p.getMasp());
      out.write("</td>\n");
      out.write("                                                    <td>");
      out.print(p.getTensp());
      out.write("</td>\n");
      out.write("                                                    <td>");
      out.print(p.getDVT());
      out.write("</td>\n");
      out.write("                                                    <td>");
      out.print(p.getNgaySX());
      out.write("</td>\n");
      out.write("                                                    <td>");
      out.print(p.getHanSD());
      out.write("</td>\n");
      out.write("                                                    <td>");
      out.print(p.getNgayNhapKho());
      out.write("</td>\n");
      out.write("                                                    <td>");
      out.print(p.getKeHang());
      out.write("</td>\n");
      out.write("                                                    <td>");
      out.print(p.getSoLuong());
      out.write(" </td>\n");
      out.write("                                                    <td>");
      out.print(p.getGiaBan());
      out.write(" </td>\n");
      out.write("                                                </tr>\n");
      out.write("                                                ");
}
      out.write("\n");
      out.write("                                            </tbody>\n");
      out.write("                                        </table>\n");
      out.write("                                        ");
} else {
      out.write("\n");
      out.write("                                        Hiện không có sản phẩm nào!\n");
      out.write("                                        ");
}
      out.write("\n");
      out.write("                                        <br/>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div><br>\n");
      out.write("                                        \n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"col-xl-6 col-md-6\">\n");
      out.write("                                <div class=\"left\"><h4>Sản phẩm còn hạn sử dụng ít hơn 30 ngày</h4>\n");
      out.write("                                    <button class=\"btn btn-primary\" onclick=\"showmore5()\">\n");
      out.write("                                        <div id=\"more5\"> Xem thêm </div> <div style=\"display: none\" id=\"hide5\"> Ẩn bớt</div></button>\n");
      out.write("                                    ");
 if (productSHHSD.size() > 0) { 
      out.write("\n");
      out.write("                                    <div id=\"table5\" style=\"display: none\"><br>\n");
      out.write("                                        <table class=\"tableshow\">\n");
      out.write("                                            <thead>\n");
      out.write("                                                <tr>\n");
      out.write("                                                    <th>Mã sản phẩn</th>\n");
      out.write("                                                    <th>Tên Sản Phẩm</th>\n");
      out.write("                                                    <th> DVT </th>\n");
      out.write("                                                    <th>Ngày sản xuất</th>\n");
      out.write("                                                    <th>Hạn sử dụng</th>\n");
      out.write("                                                    <th>Ngày nhập kho</th>\n");
      out.write("                                                    <th>Kệ Hàng Số</th>\n");
      out.write("                                                    <th>Số lượng</th>\n");
      out.write("                                                    <th>Giá</th>\n");
      out.write("                                                </tr>\n");
      out.write("                                            </thead>\n");
      out.write("                                            <tbody>\n");
      out.write("                                                ");
 for (Product p : productSHHSD) {
                                                
      out.write("\n");
      out.write("                                                <tr>\n");
      out.write("                                                    <td>");
      out.print(p.getMasp());
      out.write("</td>\n");
      out.write("                                                    <td>");
      out.print(p.getTensp());
      out.write("</td>\n");
      out.write("                                                    <td>");
      out.print(p.getDVT());
      out.write("</td>\n");
      out.write("                                                    <td>");
      out.print(p.getNgaySX());
      out.write("</td>\n");
      out.write("                                                    <td>");
      out.print(p.getHanSD());
      out.write("</td>\n");
      out.write("                                                    <td>");
      out.print(p.getNgayNhapKho());
      out.write("</td>\n");
      out.write("                                                    <td>");
      out.print(p.getKeHang());
      out.write("</td>\n");
      out.write("                                                    <td>");
      out.print(p.getSoLuong());
      out.write(" </td>\n");
      out.write("                                                    <td>");
      out.print(p.getGiaBan());
      out.write(" </td>\n");
      out.write("                                                </tr>\n");
      out.write("                                                ");
}
      out.write("\n");
      out.write("                                            </tbody>\n");
      out.write("                                        </table>\n");
      out.write("                                        ");
} else {
      out.write("\n");
      out.write("                                        Hiện không có sản phẩm nào!\n");
      out.write("                                        ");
}
      out.write("\n");
      out.write("                                        <br/>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div><br>\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-xl-6\">\n");
      out.write("                            <div id=\"myChart\" style=\"width:100%; max-width:600px; height:500px;\"></div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-xl-6\">\n");
      out.write("                            <div\n");
      out.write("                                id=\"myChart2\" style=\"width:100%; max-width:600px; height:500px;\">\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <footer class=\"py-4 bg-light mt-auto\">\n");
      out.write("                        <div class=\"container-fluid px-4\">\n");
      out.write("                            <div class=\"d-flex align-items-center justify-content-between small\">\n");
      out.write("                                <div class=\"text-muted\">Liên Hệ SDT: 0989373658 <br>\n");
      out.write("                                    Văn phòng phẩm Lan Anh, TDP Kiên Quyết,Phường Dương Nội, Quận Hà Đông, Hà Nội \n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </footer>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </main>\n");
      out.write("                                                                           \n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js\" crossorigin=\"anonymous\"></script>\n");
      out.write("    <script src=\"../js/scripts.js\" type=\"text/javascript\"></script>\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/simple-datatables@latest\" crossorigin=\"anonymous\"></script>\n");
      out.write("    <script src=\"../js/datatables-simple-demo.js\" type=\"text/javascript\"></script>\n");
      out.write("    <script src=\"../js/pagger.js\" type=\"text/javascript\"></script>\n");
      out.write("    <script>\n");
      out.write("        var list = [\n");
      out.write("            ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("        ];\n");
      out.write("        drawChart(list);\n");
      out.write("    </script>\n");
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

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.data}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("d");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                    '");
          if (_jspx_meth_c_out_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("\n");
          out.write("            ");
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

  private boolean _jspx_meth_c_out_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_0 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_0.setPageContext(_jspx_page_context);
    _jspx_th_c_out_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_out_0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${d.name}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_0 = _jspx_th_c_out_0.doStartTag();
    if (_jspx_eval_c_out_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_c_out_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_push_body_count_c_forEach_0[0]++;
        _jspx_th_c_out_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_c_out_0.doInitBody();
      }
      do {
        out.write("', ");
        int evalDoAfterBody = _jspx_th_c_out_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_c_out_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
        _jspx_push_body_count_c_forEach_0[0]--;
    }
    if (_jspx_th_c_out_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value.reuse(_jspx_th_c_out_0);
      return true;
    }
    _jspx_tagPool_c_out_value.reuse(_jspx_th_c_out_0);
    return false;
  }
}
