package model;

import utils.Validator;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TaiLieu {
    private String maTaiLieu;
    private String tenNhaXuatBan;
    private  int soBanXuatHanh;
    public TaiLieu(){}
    public TaiLieu(String maTaiLieu, String tenNhaXuatBan, int soBanXuatHanh){
        this.maTaiLieu = maTaiLieu;
        this.tenNhaXuatBan = tenNhaXuatBan;
        this.soBanXuatHanh = soBanXuatHanh;
    }

    public String getMaTaiLieu() {
        return maTaiLieu;
    }

    public void setMaTaiLieu(String maTaiLieu) {
        this.maTaiLieu = maTaiLieu;
    }

    public String getTenNhaXuatBan() {
        return tenNhaXuatBan;
    }

    public void setTenNhaXuatBan(String tenNhaXuatBan) {
        this.tenNhaXuatBan = tenNhaXuatBan;
    }

    public int getSoBanXuatHanh() {
        return soBanXuatHanh;
    }

    public void setSoBanXuatHanh(int soBanXuatHanh) {
        this.soBanXuatHanh = soBanXuatHanh;
    }
    public void input(){
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        this.maTaiLieu = Validator.getString(bf," ma tai lieu: ");
        this.tenNhaXuatBan = Validator.getString(bf,"ten nha xuat ban: ");
        this.soBanXuatHanh = Validator.getInt(bf,"so ban xuat hanh: ");
    }
    public void show(){
        System.out.println("ma tai lieu " + this.maTaiLieu +" ten nha xuat ban "
                + this.tenNhaXuatBan + " so ban xuat hanh " + this.soBanXuatHanh);
    }

    @Override
    public String toString() {
        return "TaiLieu{" +
                "maTaiLieu=" + maTaiLieu +
                ", tenNhaXuatBan='" + tenNhaXuatBan + '\'' +
                ", soBanXuatHanh=" + soBanXuatHanh +
                '}';
    }
}
