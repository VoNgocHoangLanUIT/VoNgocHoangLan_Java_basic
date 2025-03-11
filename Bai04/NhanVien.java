/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quanlynhanvien;

import java.util.ArrayList;

/**
 *
 * @author DELL
 */
public abstract class NhanVien {
    protected String maNV;
    protected String tenNV;
    protected String tenDV;
    protected double mucLuong;
    protected ArrayList<Double> dsChamCong;

    public NhanVien() {
        this.dsChamCong = new ArrayList<>();
    }

    public NhanVien(String maNV, String tenNV, String tenDV, double mucLuong) {
        this.maNV = maNV;
        this.tenNV = tenNV;
        this.tenDV = tenDV;
        this.mucLuong = mucLuong;
        this.dsChamCong = new ArrayList<>();
    }
    
    public void themChamCong(double heSo){
        dsChamCong.add(heSo);
    }
    
    abstract public void chamCong(String lyDo);
    
    public double tinhLuongThang(){
        double tongLuong = 0;
        for(double heSo : dsChamCong){
            tongLuong += mucLuong * heSo;
        }
        return tongLuong;
    }
    
    public int soNgayLamViec(){
        int soNgayLamViec = 0;
        for(double heSo : dsChamCong){
            if(heSo >= 1){
                soNgayLamViec++;
            }
        }
        return soNgayLamViec;
    }

    public String getMaNV() {
        return maNV;
    }

    public String getTenNV() {
        return tenNV;
    }

    public String getTenDV() {
        return tenDV;
    }

    public double getMucLuong() {
        return mucLuong;
    }
    
}
