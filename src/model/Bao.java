package model;

import utils.Validator;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Bao extends TaiLieu{
    int ngayPhatHanh;

    public Bao() {}

    public Bao(String maTaiLieu, String tenNhaXuatBan, int soBanXuatHanh, int ngayPhatHanh) {
        super(maTaiLieu, tenNhaXuatBan, soBanXuatHanh);
        this.ngayPhatHanh = ngayPhatHanh;
    }

    @Override
    public void input() {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        super.input();
        this.ngayPhatHanh = Validator.getInt(bf," ngay phat hanh: ");
    }
}
