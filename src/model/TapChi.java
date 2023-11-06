package model;

import utils.Validator;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TapChi extends TaiLieu{
    int soPhatHanh;
    int thangPhatHanh;

    public TapChi() {}

    public TapChi(String maTaiLieu, String tenNhaXuatBan, int soBanXuatHanh, int soPhatHanh, int thangPhatHanh) {
        super(maTaiLieu, tenNhaXuatBan, soBanXuatHanh);
        this.soPhatHanh = soPhatHanh;
        this.thangPhatHanh = thangPhatHanh;
    }

    @Override
    public void input() {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        super.input();
        this.soPhatHanh = Validator.getInt(bf," so phat hanh: ");
        this.thangPhatHanh = Validator.getInt(bf, " thang phat hanh: ");
    }
}
