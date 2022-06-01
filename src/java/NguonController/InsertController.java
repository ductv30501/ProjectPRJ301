/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NguonController;

import Controller.BaseAuthenticationController;
import dal.DanhMucDBContext;
import dal.NguonHangDBContext;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.DanhMuc;
import model.NguonHang;

/**
 *
 * @author Admin
 */
public class InsertController extends BaseAuthenticationController {

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void processGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.getRequestDispatcher("../view/nguon/insert.jsp").forward(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void processPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("utf-8");

        String raw_MaNH = request.getParameter("MaNH");
        String tenCH = request.getParameter("TenCH");
        String diaChi = request.getParameter("DiaChi");
        String sdt = request.getParameter("sdt");

        NguonHangDBContext db = new NguonHangDBContext();
        if (raw_MaNH ==null||raw_MaNH.length()==0) {
            response.sendRedirect("../500.html");
        }else{
            if (db.CheckDupMaNguon(raw_MaNH)) {
                response.sendRedirect("../500.html");
            } else {
                String MaNh = raw_MaNH;
                NguonHang n = new NguonHang();
                n.setMaNguonHang(MaNh);
                n.setTenCuaHang(tenCH);
                n.setDiaChi(diaChi);
                n.setSDT(sdt);
                db.insertNguonHang(n);
                response.sendRedirect("search");
            }
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
