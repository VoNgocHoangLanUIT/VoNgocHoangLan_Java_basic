/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quanlybaibaokhcuagvvasv;

/**
 *
 * @author user
 */
public class GiangVien extends Nguoi {
    private String hocHam;
    private double heSo;

    public GiangVien(String maDinhDanh, String hoTen, String hocHam) {
        super(maDinhDanh, hoTen);
        this.hocHam = hocHam;
        
        switch (hocHam) {
            case "GS": this.heSo = 0.1; break;
            case "PGS": this.heSo = 0.15; break;
            case "GVC": this.heSo = 0.2; break;
            case "TS": this.heSo = 0.25; break;
            case "ThS": this.heSo = 0.3; break;
            default: this.heSo = 0; break;
        }
    }
    
    @Override
    public double calculateAverage() {
        double tongDiem = 0;
        for (BaiBaoKH baiBao : this.danhSachBaiBao) {
            tongDiem += baiBao.getDiemBaiBao();
        }
 
        return (this.danhSachBaiBao.isEmpty()) ? 0 : (tongDiem / this.danhSachBaiBao.size()) * heSo;
    }

    public String getHocHam() {
        return hocHam;
    }

    public void setHocHam(String hocHam) {
        this.hocHam = hocHam;
    }

    public double getHeSo() {
        return heSo;
    }

    public void setHeSo(int heSo) {
        this.heSo = heSo;
    }
    
    
}
