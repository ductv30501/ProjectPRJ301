/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dal;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Data;

/**
 *
 * @author Admin
 */
public class DataDBContext extends DBContext{
    public ArrayList<Data> getData(){
        ArrayList<Data> data = new ArrayList<>();
        try {
            String sql ="select LoaiSP,SUM(SoLuong*GiaBan) as GiaTri from SanPham as s inner join DanhMuc as d on s.MaLoaiSP=d.MaLoaiSP\n" +
                        "group by s.MaLoaiSP,LoaiSP\n" +
                        "order by GiaTri ASC" ;
            PreparedStatement stm = connection.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {                
                Data d = new Data();
                d.setName(rs.getString("LoaiSP"));
                d.setTotal(rs.getInt("GiaTri"));
                data.add(d);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DataDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return data;
    }
}
