/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Date;

/**
 *
 * @author Admin
 */
public class ProductForAdmin {
    private int Masp;
    private String Tensp, DVT;
    private Date NgaySX,HanSD,NgayNhapKho;
    private int SoLuong;
    private int GiaNhap,GiaBan;
    private int KeHang;
    private NguonHang Nguon;
    private DanhMuc LoaiSp;

    public Date getNgayNhapKho() {
        return NgayNhapKho;
    }

    public void setNgayNhapKho(Date NgayNhapKho) {
        this.NgayNhapKho = NgayNhapKho;
    }

    
    
    public int getMasp() {
        return Masp;
    }

    public void setMasp(int Masp) {
        this.Masp = Masp;
    }

    public String getTensp() {
        return Tensp;
    }

    public void setTensp(String Tensp) {
        this.Tensp = Tensp;
    }

    public String getDVT() {
        return DVT;
    }

    public void setDVT(String DVT) {
        this.DVT = DVT;
    }

    public Date getNgaySX() {
        return NgaySX;
    }

    public void setNgaySX(Date NgaySX) {
        this.NgaySX = NgaySX;
    }

    public Date getHanSD() {
        return HanSD;
    }

    public void setHanSD(Date HanSD) {
        this.HanSD = HanSD;
    }

    public int getSoLuong() {
        return SoLuong;
    }

    public void setSoLuong(int SoLuong) {
        this.SoLuong = SoLuong;
    }

    public int getGiaNhap() {
        return GiaNhap;
    }

    public void setGiaNhap(int GiaNhap) {
        this.GiaNhap = GiaNhap;
    }

    public int getGiaBan() {
        return GiaBan;
    }

    public void setGiaBan(int GiaBan) {
        this.GiaBan = GiaBan;
    }

    public int getKeHang() {
        return KeHang;
    }

    public void setKeHang(int KeHang) {
        this.KeHang = KeHang;
    }

    public NguonHang getNguon() {
        return Nguon;
    }

    public void setNguon(NguonHang Nguon) {
        this.Nguon = Nguon;
    }

    public DanhMuc getLoaiSp() {
        return LoaiSp;
    }

    public void setLoaiSp(DanhMuc LoaiSp) {
        this.LoaiSp = LoaiSp;
    }
    
    
}
