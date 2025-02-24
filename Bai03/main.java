/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quanlybaibaokhcuagvvasv;

import java.nio.charset.StandardCharsets;

import java.io.PrintStream;
/**
 *
 * @author DELL
 */
public class main {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));

        QuanLyBaiBaoKH ql = new QuanLyBaiBaoKH();

        GiangVien gv1 = new GiangVien("GV01", "Nguyen Van A", "GS");
        SinhVien sv1 = new SinhVien("SV01", "Le Van B");
        SinhVien sv2 = new SinhVien("SV026", "Le D");

        gv1.addPaper(new BaiBaoKH("A"));
        gv1.addPaper(new BaiBaoKH("A"));
        sv1.addPaper(new BaiBaoKH("A"));
        sv1.addPaper(new BaiBaoKH("C"));
        
        ql.themGiangVien(gv1);
        ql.themSinhVien(sv1);
        ql.themSinhVien(sv2);
        
        // Thêm bài báo loại A cho sinh viên Lê D (SV026)
        ql.themBaiBaoChoSinhVien("SV026", "A");
        
        // Liệt kê danh sách khen thưởng
        ql.lietKeDanhSachKhenThuong();
    }
}
