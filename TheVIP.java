/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thesangolf;

import java.time.LocalDate;

/**
 *
 * @author DELL
 */
public class TheVIP extends The{
    private int soNamVIP;

    public TheVIP(int soNamVIP, String maTV, String tenTV, LocalDate ngaySDGanNhat, double tongTien) {
        super(maTV, tenTV, ngaySDGanNhat, tongTien);
        this.soNamVIP = soNamVIP;
    }
    
    @Override
    public void suDungDV(double soTien) {
        double phanTramThuong = Math.max(soNamVIP * 0.02, 0.2);
        this.tongTien += soTien * phanTramThuong;
        this.ngaySDGanNhat = LocalDate.now();
    }
    
    public TheTV haCapThe() {
        if (LocalDate.now().getYear() - ngaySDGanNhat.getYear() >= 1) {
            return new TheTV(maTV, tenTV, ngaySDGanNhat, 0);
        }
        return this; 
    }
}
