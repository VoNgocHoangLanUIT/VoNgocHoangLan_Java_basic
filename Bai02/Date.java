/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package date;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Date {
    private int ngay;
    private int thang;
    private int nam;
    
    public boolean kiemTraNgay() {
        if(nam < 0){
            return false;
        }
        boolean namNhuan = (nam % 4 == 0 && nam % 100 != 0) || (nam % 400 == 0);

        switch (thang) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                return ngay > 0 && ngay <= 31;
            case 2:
                return (namNhuan && ngay > 0 && ngay <= 29) || (!namNhuan && ngay > 0 && ngay <= 28);
            case 4: case 6: case 9: case 11:
                return ngay > 0 && ngay <= 30;
            default:
                return false; 
        }
        
    }
    
    public void nhapNgay(){
        Scanner scanner = new Scanner(System.in);
        do{
            System.out.print("Nhap ngay: ");
            ngay = scanner.nextInt();
            System.out.print("Nhap thang: ");
            thang = scanner.nextInt();
            System.out.print("Nhap nam: ");
            nam = scanner.nextInt();
        }while(!kiemTraNgay());
    }
    
    public void congMotNgay(){
        ngay++;
        boolean namNhuan = (nam % 4 == 0 && nam % 100 != 0) || (nam % 400 == 0);
        int soNgayTrongThang;

        switch (thang) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                soNgayTrongThang = 31;
                break;
            case 2:
                soNgayTrongThang = namNhuan ? 29 : 28;
                break;
            default:
                soNgayTrongThang = 30;
                return;
        }
        if(ngay > soNgayTrongThang){
            ngay = 1;
            thang++;
            if(thang > 12){
                thang = 1;
                nam++;
            }
        }
    }
    
    public void congNgay(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so ngay can cong: ");
        int soNgayCong = scanner.nextInt();
        for(int i=0; i<soNgayCong; i++){
            congMotNgay();
        }   
    }
    
    public void hienThiNgay(){
        System.out.println("Hien thi ngay: " + ngay + "/" + thang + "/" + nam);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Date d = new Date();
        d.nhapNgay();
        d.hienThiNgay();
        d.congNgay();
        d.hienThiNgay();
    }
    
}
