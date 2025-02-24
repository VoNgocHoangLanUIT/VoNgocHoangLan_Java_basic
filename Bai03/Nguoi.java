/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quanlybaibaokhcuagvvasv;

import java.util.ArrayList;

/**
 *
 * @author user
 */
abstract public class Nguoi {
    protected String maDinhDanh;
    protected String hoTen;
    protected ArrayList<BaiBaoKH> danhSachBaiBao;

    public Nguoi(String maDinhDanh, String hoTen) {
        this.maDinhDanh = maDinhDanh;
        this.hoTen = hoTen;
        this.danhSachBaiBao = new ArrayList<>();
    }
    
    public void addPaper(BaiBaoKH paper)
    {
        this.danhSachBaiBao.add(paper);
    }
    
    public abstract double calculateAverage();
    
    public int countPaper() {
        return this.danhSachBaiBao.size();
    }

    public String getMaDinhDanh() {
        return maDinhDanh;
    }

    public void setMaDinhDanh(String maDinhDanh) {
        this.maDinhDanh = maDinhDanh;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public ArrayList<BaiBaoKH> getDanhSachBaiBao() {
        return danhSachBaiBao;
    }

    public void setDanhSachBaiBao(ArrayList<BaiBaoKH> danhSachBaiBao) {
        this.danhSachBaiBao = danhSachBaiBao;
    }
}
