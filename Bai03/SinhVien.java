/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quanlybaibaokhcuagvvasv;

/**
 *
 * @author user
 */
public class SinhVien extends Nguoi {

    public SinhVien(String maDinhDanh, String hoTen) {
        super(maDinhDanh, hoTen);
    }
    
    @Override
    public double calculateAverage() {
        double tongDiem = 0;
        for (BaiBaoKH baiBao : this.danhSachBaiBao) {
            tongDiem += baiBao.getDiemBaiBao();
        }
        return (this.danhSachBaiBao.isEmpty()) ? 0 : (tongDiem / this.danhSachBaiBao.size());
    }
}
