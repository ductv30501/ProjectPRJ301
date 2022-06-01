<%-- 
    Document   : insert
    Created on : Feb 27, 2022, 7:54:57 PM
    Author     : Admin
--%>

<%@page import="model.NguonHang"%>
<%@page import="model.DanhMuc"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge" />
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no" />
        <meta name="description" content="" />
        <meta name="author" content="" />
        <title> Thêm sản phẩm </title>
        <link href="https://cdn.jsdelivr.net/npm/simple-datatables@latest/dist/style.css" rel="stylesheet" />
        <link href="../CSS/styles.css" rel="stylesheet" type="text/css"/>
        <link href="../CSS/pagger.css" rel="stylesheet" type="text/css"/>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/js/all.min.js" crossorigin="anonymous"></script>
        <%
            ArrayList<DanhMuc> loaiSP = (ArrayList<DanhMuc>) request.getAttribute("LoaiSP");
            ArrayList<NguonHang> Nguon = (ArrayList<NguonHang>) request.getAttribute("Nguon");
        %>
    </head>
    <body>
        <nav class="sb-topnav navbar navbar-expand navbar-dark bg-dark">
            <!-- Navbar Brand-->
            <a class="navbar-brand ps-3" href="../store/home">Tác Vụ</a>
            <!-- Sidebar Toggle-->
            <button class="btn btn-link btn-sm order-1 order-lg-0 me-4 me-lg-0" id="sidebarToggle" href="#!"><i class="fas fa-bars"></i></button>
            <!-- Navbar Search-->
            <form action="../action/search" class="d-none d-md-inline-block form-inline ms-auto me-0 me-md-3 my-2 my-md-0">
                <div class="input-group">
                    <input name="text"  class="form-control" type="text" placeholder="Tìm kiếm..." aria-label="Tìm kiếm..." aria-describedby="btnNavbarSearch" />
                    <button class="btn btn-primary" id="btnNavbarSearch" type="submit"><i class="fas fa-search"></i></button>
                </div>
            </form>
            <!-- Navbar-->
            <ul class="navbar-nav ms-auto ms-md-0 me-3 me-lg-4">
                <li class="nav-item dropdown">
                    <a class="nav-link dropdown-toggle" id="navbarDropdown" href="#" role="button" data-bs-toggle="dropdown" aria-expanded="false"><i class="fas fa-user fa-fw"></i></a>
                    <ul class="dropdown-menu dropdown-menu-end" aria-labelledby="navbarDropdown">
                        <li><a class="dropdown-item" href="../account/resetpassword">Đổi Mật Khẩu</a></li>
                        <li><a class="dropdown-item" href="../loginn.html">Đăng Xuất</a></li>
                    </ul>
                </li>
            </ul>
        </nav>
        <div id="layoutSidenav">
            <div id="layoutSidenav_nav">
                <nav class="sb-sidenav accordion sb-sidenav-dark" id="sidenavAccordion">
                    <div class="sb-sidenav-menu">
                        <div class="nav">
                            <div class="sb-sidenav-menu-heading">Báo cáo dữ liệu</div>
                            <a class="nav-link" href="../store/home">
                                <div class="sb-nav-link-icon"><i class="fas fa-tachometer-alt"></i></div>
                                Dữ liệu sản phẩm
                            </a>
                            <div class="sb-sidenav-menu-heading">Sản phẩm</div>
                            <a class="nav-link collapsed" href="#" data-bs-toggle="collapse" data-bs-target="#collapseLayouts" aria-expanded="false" aria-controls="collapseLayouts">
                                <div class="sb-nav-link-icon"><i class="fas fa-columns"></i></div>
                                Sản phẩm
                                <div class="sb-sidenav-collapse-arrow"><i class="fas fa-angle-down"></i></div>
                            </a>
                            <div class="collapse" id="collapseLayouts" aria-labelledby="headingOne" data-bs-parent="#sidenavAccordion">
                                <nav class="sb-sidenav-menu-nested nav">
                                    <a class="nav-link" href="search">Sản phẩm</a>
                                    <a class="nav-link" href="insert">Thêm sản phẩm</a>
                                </nav>
                            </div>

                            <div class="sb-sidenav-menu-heading"> Nguồn Hàng</div>
                            <a class="nav-link collapsed" href="#" data-bs-toggle="collapse" data-bs-target="#collapseLayouts" aria-expanded="false" aria-controls="collapseLayouts">
                                <div class="sb-nav-link-icon"><i class="fas fa-columns"></i></div>
                                Nguồn Hàng
                                <div class="sb-sidenav-collapse-arrow"><i class="fas fa-angle-down"></i></div>
                            </a>
                            <div class="collapse" id="collapseLayouts" aria-labelledby="headingOne" data-bs-parent="#sidenavAccordion">
                                <nav class="sb-sidenav-menu-nested nav">
                                    <a class="nav-link" href="../nguon/search">Danh sách nguồn hàng</a>
                                    <a class="nav-link" href="../nguon/insert">Thêm nguồn hàng</a>
                                </nav>
                            </div>

                            <div class="sb-sidenav-menu-heading"> Các Loại sản phẩm </div>
                            <a class="nav-link collapsed" href="#" data-bs-toggle="collapse" data-bs-target="#collapseLayouts" aria-expanded="false" aria-controls="collapseLayouts">
                                <div class="sb-nav-link-icon"><i class="fas fa-columns"></i></div>
                                Các Loại sản phẩm trong cửa hàng
                                <div class="sb-sidenav-collapse-arrow"><i class="fas fa-angle-down"></i></div>
                            </a>
                            <div class="collapse" id="collapseLayouts" aria-labelledby="headingOne" data-bs-parent="#sidenavAccordion">
                                <nav class="sb-sidenav-menu-nested nav">
                                    <a class="nav-link" href="../loaisp/search">Danh sách Các Loại sản phẩm</a>
                                    <a class="nav-link" href="../loaisp/insert">Thêm Loại sản phẩm</a>
                                </nav>
                            </div>

                            <a class="nav-link collapsed" href="#" data-bs-toggle="collapse" data-bs-target="#collapsePages" aria-expanded="false" aria-controls="collapsePages">
                                <div class="sb-nav-link-icon"><i class="fas fa-book-open"></i></div>
                                Trang
                                <div class="sb-sidenav-collapse-arrow"><i class="fas fa-angle-down"></i></div>
                            </a>
                            <div class="collapse" id="collapsePages" aria-labelledby="headingTwo" data-bs-parent="#sidenavAccordion">
                                <nav class="sb-sidenav-menu-nested nav accordion" id="sidenavAccordionPages">
                                    <a class="nav-link collapsed" href="#" data-bs-toggle="collapse" data-bs-target="#pagesCollapseAuth" aria-expanded="false" aria-controls="pagesCollapseAuth">
                                        Tài Khoản
                                        <div class="sb-sidenav-collapse-arrow"><i class="fas fa-angle-down"></i></div>
                                    </a>
                                    <div class="collapse" id="pagesCollapseAuth" aria-labelledby="headingOne" data-bs-parent="#sidenavAccordionPages">
                                        <nav class="sb-sidenav-menu-nested nav">
                                            <a class="nav-link" href="../loginn.html">Đăng Nhập</a>
                                            <a class="nav-link" href="../register.html">Đăng Ký</a>
                                            <a class="nav-link" href="../password.html">Quên Mật Khẩu</a>
                                        </nav>
                                    </div>
                                </nav>
                            </div>
                        </div>
                    </div>
                </nav>
            </div>
            <div id="layoutSidenav_content">
                <main>
                    <div class="container-fluid px-4">
                        <h1 class="mt-4">Quản lý sản phẩm</h1>
                        <ol class="breadcrumb mb-4">
                            <li class="breadcrumb-item"><a href="../store/home">Trang chủ</a></li>
                            <li class="breadcrumb-item active">Quản lý sản phẩm</li>
                        </ol>
                        <div class="card mb-4">
                            <div class="card-header">
                                <i class="fas fa-table me-1"></i>
                                Thêm sản phẩm mới vào cửa hàng
                            </div>
                            <div>
                                <form action="insert" method="POST">
                                    <table class="edittable">
                                        <tr>
                                            <td>Mã sản phẩm:</td>
                                            <td><input type="text" name="masp"/> <br/></td>
                                        </tr>
                                        <tr>
                                            <td>tên sản phẩm:</td>
                                            <td><input type="name" name="tensp" /> <br/></td>
                                        </tr>
                                        <tr>
                                            <td>DVT:</td>
                                            <td><input type="text" name="DVT"/> <br/></td>
                                        </tr>
                                        <tr>
                                            <td>Ngày sản xuất:</td>
                                            <td><input type="date" name="NgaySX"/> <br/></td>
                                        </tr>
                                        <tr>
                                            <td>Hạn Sử Dụng:</td>
                                            <td><input type="date" name="HanSD"/> <br/></td>
                                        </tr>
                                        <tr>
                                            <td>Ngày Nhập Kho:</td>
                                            <td><input type="date" name="NgayNhap"/> <br/></td>
                                        </tr>
                                        <tr>
                                            <td>Số Lượng:</td>
                                            <td><input type="text" name="SoLuong"/> <br/></td>
                                        </tr>
                                        <tr>
                                            <td>Giá Nhập:</td>
                                            <td><input type="text" name="GiaNhap"/><br/></td>
                                        </tr>
                                        <tr>
                                            <td>Giá Bán:</td>
                                            <td><input type="text" name="GiaBan"/><br/></td>
                                        </tr>
                                        <tr>
                                            <td>Kệ Hàng Số:</td>
                                            <td><input type="text" name="KeHang"/><br/></td>
                                        </tr>
                                        <tr>
                                            <td>Mã Nguồn Hàng:</td>
                                            <td><select name="maNH">
                                                    <%for (NguonHang n : Nguon) {
                                                    %>
                                                    <option value="<%=n.getMaNguonHang()%>"><%=n.getTenCuaHang()%></option>
                                                    <%}%>
                                                    <option value="orther"> Khác </option>
                                                </select><br/></td>
                                        </tr>
                                        <tr>
                                            <td>Mã nguồn Hàng Mới:</td>
                                            <td><input type="text" name="maNHM"/><br/></td>
                                        </tr>
                                        <tr>
                                            <td>tên Cửa Hàng:</td>
                                            <td><input type="text" name="TenCuaHang"/><br/></td>
                                        </tr>
                                        <tr>
                                            <td>Địa chỉ:</td>
                                            <td><input type="text" name="DiaChi"><br/></td>
                                        </tr>
                                        <tr>
                                            <td>SĐT:</td>
                                            <td><input type="text" name="sdt"><br></td>
                                        </tr>
                                        <tr>
                                            <td>Loại Sản Phẩm:</td>
                                            <td><select name="maloaisp">
                                                    <% for (DanhMuc ls : loaiSP) {
                                                    %>
                                                    <option value="<%=ls.getMaLoaiSP()%>"><%=ls.getLoaiSP()%></option>
                                                    <%}%>
                                                    <option value="orther"> Khác </option>
                                                </select> <br/></td>
                                        </tr>
                                        <tr>
                                            <td>Mã Loại sản phẩm mới:</td>
                                            <td><input type="text" name="MaLoaiSPM"/><br/></td>
                                        </tr>
                                        <tr>
                                            <td>Loại sản phẩm:</td>
                                            <td><input type="text" name="LoaiSP"/><br/></td>
                                        </tr>
                                    </table>
                                    <input style="margin-left: 360px" class="btn btn-primary" type="submit" value="Lưu"/>
                                </form>
                            </div>
                        </div>
                </main>
                <footer class="py-4 bg-light mt-auto">
                    <div class="container-fluid px-4">
                        <div class="d-flex align-items-center justify-content-between small">
                            <div class="text-muted">Liên Hệ SDT: 0989373658 <br>
                                Văn phòng phẩm Lan Anh, TDP Kiên Quyết,Phường Dương Nội, Quận Hà Đông, Hà Nội 
                            </div>
                        </div>
                    </div>
                </footer>
            </div>
        </div>
    </div>
    <script src="../js/datatables-simple-demo.js" type="text/javascript"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" crossorigin="anonymous"></script>
    <script src="../js/scripts.js" type="text/javascript"></script>
    <script src="https://cdn.jsdelivr.net/npm/simple-datatables@latest" crossorigin="anonymous"></script>
</body>

</html>
