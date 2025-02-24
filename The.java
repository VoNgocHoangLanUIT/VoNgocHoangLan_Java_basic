/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package thesangolf;
import java.time.LocalDate;

/**
 *
 * @author DELL
 */
public class The {
    protected String maTV;
    protected String tenTV;
    protected LocalDate ngaySDGanNhat;
    protected double tongTien;

    public The(String maTV, String tenTV, LocalDate ngaySDGanNhat, double tongTien) {
        this.maTV = maTV;
        this.tenTV = tenTV;
        this.ngaySDGanNhat = ngaySDGanNhat;
        this.tongTien = tongTien;
    }
    
    public abstract void suDungDV(double soTien);
    
    public void xuatThongTin() {
        System.out.println("Ma thanh vien: " + maTV);
        System.out.println("Ten thanh vien: " + tenTV);
        System.out.println("Ngay su dung dich vu gan nhat: " + ngaySDGanNhat);
        System.out.println("Tong tien da su dung dich vu: " + tongTien);
    }
    
    public void kiemTraThoiHan() {
        if (LocalDate.now().getYear() - ngaySDGanNhat.getYear() >= 1) {
            tongTien = 0;
        }
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
