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
public class TheTV extends The {

    public TheTV(String maTV, String tenTV, LocalDate ngaySDGanNhat, double tongTien) {
        super(maTV, tenTV, ngaySDGanNhat, tongTien);
    }
    
    @Override
    public void suDungDV(double soTien) {
        this.tongTien += soTien;
        this.ngaySDGanNhat = LocalDate.now();
        this.nangCapThe();
    }
    
    public TheVIP nangCapThe() {
        if (tongTien > 500) {
            return new TheVIP(maTV, tenTV, ngaySDGanNhat, tongTien, 0);
        }
        return this; 
    }
    
}
