/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quanlybaibaokhcuagvvasv;

import java.util.ArrayList;

/**
 *
 * @author user
 */
public class QuanLyBaiBaoKH {
    private ArrayList<GiangVien> danhSachGiangVien;
    private ArrayList<SinhVien> danhSachSinhVien;

    public QuanLyBaiBaoKH() {
        this.danhSachGiangVien = new ArrayList<>();
        this.danhSachSinhVien = new ArrayList<>();
    }
    
       public void themGiangVien(GiangVien gv) {
        danhSachGiangVien.add(gv);
    }

    public void themSinhVien(SinhVien sv) {
        danhSachSinhVien.add(sv);
    }

    //Question 2a
    public void themBaiBaoChoSinhVien(String maSV, String loaiBaiBao) {
        for (SinhVien sv : danhSachSinhVien) {
            if (sv.maDinhDanh.equals(maSV)) {
                sv.addPaper(new BaiBaoKH(loaiBaiBao));
                return;
            }
        }
    }

    //Question 2b
    public void lietKeDanhSachKhenThuong() {
        System.out.println("Danh sách khen thưởng:");
        for (SinhVien sv : danhSachSinhVien) {
            if (sv.calculateAverage() > 7.0) {
                System.out.println("Sinh viên: " + sv.getMaDinhDanh()+ " - " + sv.getHoTen() + " - Số bài báo: " + sv.countPaper()+ " - Điểm: " + sv.calculateAverage());
            }
        }
        for (GiangVien gv : danhSachGiangVien) {
            if (gv.calculateAverage() > 0.85) {
                System.out.println("Giảng viên: " + gv.getMaDinhDanh() + " - " + gv.getHoTen() + " - Số bài báo: " + gv.countPaper() + " - Điểm: " + gv.calculateAverage());
            }
        }
    }
}
