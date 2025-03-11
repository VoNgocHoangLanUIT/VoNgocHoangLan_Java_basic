/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quanlynhanvien;

/**
 *
 * @author DELL
 */
public class NhanVienGianTiep extends NhanVien {
    public NhanVienGianTiep(String maNV, String tenNV, String tenDV, double mucLuong) {
        super(maNV, tenNV, tenDV, mucLuong);
    }
    @Override
    public void chamCong(String lyDo){
        switch (lyDo) {
            case "di lam":
                themChamCong(1.0);
                break;
            case "nghi co ly do":
                themChamCong(0.5);
                break;
            default:
                themChamCong(0);
                break;
        }
    }
}
