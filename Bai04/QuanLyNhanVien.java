/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package quanlynhanvien;

/**
 *
 * @author DELL
 */
public class QuanLyNhanVien {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        CongTy congTy = new CongTy();
        
        NhanVienTrucTiep nv1 = new NhanVienTrucTiep("NV01", "Vo Ngoc Hoang Lan", "Data Engineer", 500000, 0.15);
        NhanVienGianTiep nv2 = new NhanVienGianTiep("NV02", "Le Mai Hai Duong", "Database Management", 600000);
        
        congTy.themNhanVien(nv1);
        congTy.themNhanVien(nv2);
        
        congTy.chamCong("NV01", "di lam ca 1");
        congTy.chamCong("NV01", "di lam ca 2");
        congTy.chamCong("NV01", "nghi khong ly do");
        congTy.chamCong("NV01", "nghi co ly do");
        
        congTy.chamCong("NV02", "di lam");
        congTy.chamCong("NV02", "di lam");
        congTy.chamCong("NV02", "di lam");
        congTy.chamCong("NV02", "di lam");
        congTy.chamCong("NV02", "nghi co ly do");
        
        congTy.lietKeDSChamCong();
    }
    
}
