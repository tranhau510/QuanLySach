package model;

import utils.Validator;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Sach extends TaiLieu{
    String tenTacGia;
    int soTrang;

    public Sach() {
    }

    public Sach(String maTaiLieu, String tenNhaXuatBan, int soBanXuatHanh, String tenTacGia, int soTrang) {
        super(maTaiLieu, tenNhaXuatBan, soBanXuatHanh);
        this.tenTacGia = tenTacGia;
        this.soTrang = soTrang;
    }

    @Override
    public void input() {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        super.input();
        this.soTrang = Validator.getInt(bf,"so trang: ");
        this.tenTacGia = Validator.getString(bf, " ten tac gia: ");
    }

}
