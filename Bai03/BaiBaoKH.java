/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quanlybaibaokhcuagvvasv;

/**
 *
 * @author user
 */
public class BaiBaoKH {
    private String loaiBaiBao;
    private double diemBaiBao;

    public BaiBaoKH(String loaiBaiBao) {
        this.loaiBaiBao = loaiBaiBao;
        
        switch (loaiBaiBao) {
            case "A": this.diemBaiBao = 10.0; break;
            case "B": this.diemBaiBao= 8.0; break;
            case "C": this.diemBaiBao = 6.0; break;
            default: this.diemBaiBao = 0; break;
        }
    }

    public String getLoaiBaiBao() {
        return loaiBaiBao;
    }

    public void setLoaiBaiBao(String loaiBaiBao) {
        this.loaiBaiBao = loaiBaiBao;
    }

    public double getDiemBaiBao() {
        return diemBaiBao;
    }

    public void setDiemBaiBao(float diemBaiBao) {
        this.diemBaiBao = diemBaiBao;
    }
      
}
