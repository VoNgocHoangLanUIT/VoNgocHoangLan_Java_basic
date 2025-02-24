/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package phanso;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class PhanSo {
    
    private int tuSo;
    
    private int mauSo;
    
    public PhanSo() {
        this.tuSo = 1;
        this.mauSo = 1;
    }

    public PhanSo(int tuSo, int mauSo) {
//        if(mauSo == 0){
//            throw new IllegalArgumentExecption("Mau so khong the bang 0");
//        }
        this.tuSo = tuSo;
        this.mauSo = mauSo;
        rutGon();
    }
    
    public void nhapPhanSo(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap tu so: ");
        this.tuSo = scanner.nextInt();
        do{
            System.out.println("Nhap mau so (khac 0): ");
            this.mauSo = scanner.nextInt();
        }while(this.mauSo == 0);
        rutGon();
    }
    
    public int timUocChung(int a, int b){
        while(b!=0){
            int du = a%b;
            a = b;
            b = du;
        }
        return Math.abs(a);
    }
    
    public void rutGon(){
        int gcd = timUocChung(this.tuSo, this.mauSo);
        this.tuSo /= gcd;
        this.mauSo /= gcd;
        if (this.mauSo < 0){
            this.tuSo = -this.tuSo;
            this.mauSo = -this.mauSo;
        }
    }
    
    public void hienThiPhanSo(){
        if (this.mauSo == 1){
            System.out.print(this.tuSo);
        }
        else {
            System.out.print(this.tuSo + "/" + this.mauSo);   
        }
    }
    public float giaTri(){
        return this.tuSo / this.mauSo;
    }
    public PhanSo congPhanSo(PhanSo p){
        int tuSoMoi = this.tuSo * p.mauSo + this.mauSo * p.tuSo;
        int mauSoMoi = this.mauSo * p.mauSo;
        return new PhanSo(tuSoMoi, mauSoMoi);
    }
    
    public PhanSo nhanPhanSo(PhanSo p){
        return new PhanSo(this.tuSo * p.tuSo, this.mauSo * p.mauSo);
    }
    
    public void soSanh(PhanSo p){
        if(this.giaTri() > p.giaTri()){
            this.hienThiPhanSo();
            System.out.print(" > ");
            p.hienThiPhanSo();
        }
        else if(this.giaTri() < p.giaTri()){
            this.hienThiPhanSo();
            System.out.print(" < ");
            p.hienThiPhanSo();
        }
        else{
            this.hienThiPhanSo();
            System.out.print(" = ");
            p.hienThiPhanSo();
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        PhanSo ps1 = new PhanSo();
        ps1.nhapPhanSo();
        PhanSo ps2 = new PhanSo();  
        ps2.nhapPhanSo();
        PhanSo pstong = ps1.congPhanSo(ps2);  
        PhanSo pstich = ps1.nhanPhanSo(ps2);
        System.out.print("Tong cua 2 phan so la: "); 
        pstong.hienThiPhanSo();
        System.out.println();
        System.out.print("Tich cua 2 phan so la: ");  
        pstich.hienThiPhanSo();
        System.out.println();
        System.out.print("So sanh 2 phan so: "); 
        ps1.soSanh(ps2);
        System.out.println();
    }
    
}
