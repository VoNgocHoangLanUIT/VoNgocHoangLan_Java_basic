/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quanlynhanvien;

/**
 *
 * @author DELL
 */
public class NhanVienTrucTiep extends NhanVien {
    private double heSoPhuCap;

    public NhanVienTrucTiep(String maNV, String tenNV, String tenDV, double mucLuong, double heSoPhuCap) {
        super(maNV, tenNV, tenDV, mucLuong);
        this.heSoPhuCap = heSoPhuCap;
    }
    
    @Override
    public void chamCong(String lyDo){
        switch (lyDo) {
            case "di lam ca 1":
                themChamCong(1);
                break;
            case "di lam ca 2":
                themChamCong(1.5);
                break;
            case "nghi co ly do":
                themChamCong(0.5);
                break;
            default:
                themChamCong(0);
                break;
        }
    }
    @Override
    public double tinhLuongThang(){
        return super.tinhLuongThang() * (1 + heSoPhuCap);
    }
}
