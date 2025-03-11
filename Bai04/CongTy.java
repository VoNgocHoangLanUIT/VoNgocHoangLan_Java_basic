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
public class CongTy {
    private ArrayList<NhanVien> dsNhanVien;

    public CongTy() {
        this.dsNhanVien = new ArrayList<>();
    }
    
    public void themNhanVien(NhanVien nhanVien){
        dsNhanVien.add(nhanVien);
    }
    
    public void chamCong(String maNV, String loaiChamCong){
        for(NhanVien nv : dsNhanVien){
            if(nv.getMaNV().equals(maNV)){
                nv.chamCong(loaiChamCong);
            }
        }
    }
    
    public void lietKeDSChamCong(){
        for(NhanVien nv : dsNhanVien){
            System.out.println("Ma NV: " + nv.getMaNV() + "\n" + "Ten NV: " + nv.getTenNV() + "\n" + "So ngay lam viec: " + nv.soNgayLamViec() + "\n" + "Luong thang: " + nv.tinhLuongThang());
            System.out.println("------------------------------------------------------------------------");
        }
    }
}
