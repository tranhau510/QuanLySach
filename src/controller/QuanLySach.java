package controller;

import model.Bao;
import model.Sach;
import model.TaiLieu;
import model.TapChi;
import utils.Validator;
import view.MenuController;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class QuanLySach {
    ArrayList<TaiLieu> tl = new ArrayList<>();

    public void addTailieu(TaiLieu dc) {

        tl.add(dc);

    }

    public void menuController() {
        MenuController menu = new MenuController();
        menu.menu();
        boolean isChecked = true;
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        while (isChecked) {
            int choose = Validator.getInt(bf, "xin moi chon");
            switch (choose) {
                case 1:
                    Sach sach = new Sach();
                    sach.input();
                    addTailieu(sach);
                    break;
                case 2:
                    Bao bao = new Bao();
                    bao.input();
                    addTailieu(bao);
                    break;
                case 3:
                    TapChi tapchi = new TapChi();
                    tapchi.input();
                    addTailieu(tapchi);
                    break;
                case 4:
                    removeTaiLieubymaTaiLieu();
                    break;
                case 5:
                    showAll();
                    break;
                case 6:
                    findTaiLieu();
                    break;
                case 7:
                    isChecked = false;
            }
        }
    }

    public void removeTaiLieubymaTaiLieu() {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap ma tai lieu: ");
        String maTaiLieu = sc.nextLine();
        boolean found = false;
        for (TaiLieu dc : tl) {
            if (dc.getMaTaiLieu() == maTaiLieu) {
                tl.remove(tl);
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println("Mã tài liệu có số " + maTaiLieu + "đã được xóa");
        } else {
            System.out.println("Không tìm thấy mã tài liệu");
        }
    }

    public void showAll() {
        for(TaiLieu ql : tl){
            if(ql instanceof Sach){
                ql.show();
            } else if (ql instanceof Bao) {
                ql.show();
            }else {
                ql.show();
            }
        }
    }


    public void findTaiLieu() {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String maTaiLieu = Validator.getString(bf, "Nhap ma tai lieu: ");
        boolean isFound = false;
        for(TaiLieu ql : tl){
            if(ql instanceof Sach){
                if(ql.getMaTaiLieu().equalsIgnoreCase(maTaiLieu)){
                    ql.show();
                    isFound = true;
                }
            } else if (ql instanceof Bao) {
                if (ql.getMaTaiLieu().equalsIgnoreCase(maTaiLieu)){
                    ql.show();
                    isFound = true;
                }
            }else {
                if (ql instanceof TapChi){
                    ql.show();
                    isFound = true;
                }
            }
        }
        if (!isFound){
            System.out.println("ko tim thay ");
        }
    }
}
