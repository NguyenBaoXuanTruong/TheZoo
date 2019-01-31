package game.java.project.home;

import java.util.Scanner;

public class Menu {
    Scanner s;

    protected int Choose() {
        System.out.println("1.Hinh chu nhat.");
        System.out.println("2.Hinh vuong.");
        System.out.println("3.Hinh tru.");
        System.out.println("4.Hinh tron.");
        System.out.println("5.Vo Lam Truyen Ky");

        System.out.print("Chon muc ban can: ");
        s = new Scanner(System.in);
        int i = s.nextInt();
        return i;
    }

    protected int nhanvatMenu() {
        System.out.println("1.Ngu Doc.");
        System.out.println("2.Thieu Lam.");
        System.out.println("3.Vo Dang.");
        System.out.println("4.Duong Mon.");

        System.out.print("Chon nhan vat ban muon: ");
        s = new Scanner(System.in);
        int i = s.nextInt();
        return i;
    }

    protected int nhanvatAction() {
        System.out.println("1.Doi ten.");
        System.out.println("2.Danh.");
        System.out.println("3.Buff.");
        System.out.println("4.Ep ngoc.");

        System.out.println("Chon muc ban can: ");
        s = new Scanner(System.in);
        int i = s.nextInt();
        return i;
    }

    protected void List() {
        int tier1 = Choose();

        switch (tier1) {
            case 1:
                HinhChuNhat hcn = new HinhChuNhat();
                hcn.Process();
                break;
            case 2:
                HinhVuong hv = new HinhVuong();
                hv.Process();
                break;
            case 3:
                HinhTru ht = new HinhTru();
                ht.Process();
                break;
            case 4:
                HinhTron htr = new HinhTron();
                htr.Process();
                break;
            case 5:
                int tier2 = nhanvatMenu();
                switch (tier2) {
                    // Phan choi nhan vat chinh Nguc Doc
                    case 1:
                        Characters c1 = new Characters("Tom", 100.0, 10.0, 1.0, 1.0, 1000.0);
                        int tier3 = nhanvatMenu();
                        switch (tier3) {
                            // Phan choi cho nhan vat phu Ngu Doc
                            case 1:
                                Characters c2 = new Characters("Joker", 100.0, 10.0, 1.0, 1.0, 1000.0);
                                // Phan action
                                int tier4 = nhanvatAction();
                                switch (tier4) {
                                    case 1:
                                        System.out.print("Nhap ten ban muon: ");
                                        s = new Scanner(System.in);
                                        String n = s.nextLine();
                                        c1.setName(n);
                                        System.out.println("Ten nhan vat duoc doi thanh " + c1.getName());
                                        break;
                                    case 2:
                                        Double mauNV2;
                                        if (c2.getMau() > 0) {
                                            mauNV2 = c2.getMau() - c1.tancong() + c2.buff();
                                            c2.setMau(mauNV2);
                                            System.out.println("Ke dich tru don, mau con lai la " + c2.getMau());
                                        } else {
                                            mauNV2 = 0.0;
                                            c2.setMau(mauNV2);
                                            System.out.println("Ke dich da bi tieu diet, CHUC MUNG !!!");
                                        }
                                        break;
                                    case 3:
                                        System.out.println("Chi so Buff cua ta la: " + c1.buff());
                                        break;
                                    case 4:
                                        System.out.println("So ngoc cau ta la " + c1.epNgoc() + " va tien con lai la " + c1.getMoney());
                                        break;
                                    default:
                                        System.out.println("Option khong ton tai.");
                                        break;
                                }
                                break;
                            // Ket thuc phan cho nhan vat phu Nguc Doc
                            // Phan nhan vat phu thieu lam
                            case 2:
                                Characters c3 = new Characters("Joker", 100.0, 10.0, 1.0, 1.0, 1000.0);
                                int tier5 = nhanvatAction();
                                switch (tier5) {
                                    case 1:
                                        System.out.print("Nhap ten ban muon: ");
                                        s = new Scanner(System.in);
                                        String n = s.nextLine();
                                        c1.setName(n);
                                        System.out.println("Ten nhan vat duoc doi thanh " + c1.getName());
                                        break;
                                    case 2:
                                        Double mauNV2;
                                        if (c3.getMau() > 0) {
                                            mauNV2 = c3.getMau() - c1.tancong() + c3.buff();
                                            c3.setMau(mauNV2);
                                            System.out.println("Ke dich tru don, mau con lai la " + c3.getMau());
                                        } else {
                                            mauNV2 = 0.0;
                                            c3.setMau(mauNV2);
                                            System.out.println("Ke dich da bi tieu diet, CHUC MUNG !!!");
                                        }
                                        break;
                                    case 3:
                                        System.out.println("Chi so Buff cua ta la: " + c1.buff());
                                        break;
                                    case 4:
                                        System.out.println("So ngoc cau ta la " + c1.epNgoc() + " va tien con lai la " + c1.getMoney());
                                        break;
                                    default:
                                        System.out.println("Option khong ton tai.");
                                        break;
                                }

                                break;
                            // Ket thuc nhan vat phu thieu lam
                            // Nhan vat phu vo dang
                            case 3:
                                Characters c4 = new Characters("Joker", 100.0, 10.0, 1.0, 1.0, 1000.0);
                                int tier6 = nhanvatAction();
                                switch (tier6) {
                                    case 1:
                                        System.out.print("Nhap ten ban muon: ");
                                        s = new Scanner(System.in);
                                        String n = s.nextLine();
                                        c1.setName(n);
                                        System.out.println("Ten nhan vat duoc doi thanh " + c1.getName());
                                        break;
                                    case 2:
                                        Double mauNV2;
                                        if (c4.getMau() > 0) {
                                            mauNV2 = c4.getMau() - c1.tancong() + c4.buff();
                                            c4.setMau(mauNV2);
                                            System.out.println("Ke dich tru don, mau con lai la " + c4.getMau());
                                        } else {
                                            mauNV2 = 0.0;
                                            c4.setMau(mauNV2);
                                            System.out.println("Ke dich da bi tieu diet, CHUC MUNG !!!");
                                        }
                                        break;
                                    case 3:
                                        System.out.println("Chi so Buff cua ta la: " + c1.buff());
                                        break;
                                    case 4:
                                        System.out.println("So ngoc cau ta la " + c1.epNgoc() + " va tien con lai la " + c1.getMoney());
                                        break;
                                    default:
                                        System.out.println("Option khong ton tai.");
                                        break;
                                }

                                break;
                            // Ket thuc nhan vat phu vo dang
                            // Nhan vat phu duong mon
                            case 4:
                                Characters c5 = new Characters("Joker", 100.0, 10.0, 1.0, 1.0, 1000.0);
                                int tier7 = nhanvatAction();
                                switch (tier7) {
                                    case 1:
                                        System.out.print("Nhap ten ban muon: ");
                                        s = new Scanner(System.in);
                                        String n = s.nextLine();
                                        c1.setName(n);
                                        System.out.println("Ten nhan vat duoc doi thanh " + c1.getName());
                                        break;
                                    case 2:
                                        Double mauNV2;
                                        if (c5.getMau() > 0) {
                                            mauNV2 = c5.getMau() - c1.tancong() + c5.buff();
                                            c5.setMau(mauNV2);
                                            System.out.println("Ke dich tru don, mau con lai la " + c5.getMau());
                                        } else {
                                            mauNV2 = 0.0;
                                            c5.setMau(mauNV2);
                                            System.out.println("Ke dich da bi tieu diet, CHUC MUNG !!!");
                                        }
                                        break;
                                    case 3:
                                        System.out.println("Chi so Buff cua ta la: " + c1.buff());
                                        break;
                                    case 4:
                                        System.out.println("So ngoc cau ta la " + c1.epNgoc() + " va tien con lai la " + c1.getMoney());
                                        break;
                                    default:
                                        System.out.println("Option khong ton tai.");
                                        break;
                                }
                                break;
                            // ket thuc nhan vat phu duong mon
                            default:
                                System.out.println("Option khong ton tai.");
                                break;
                            // ket thuc phan action
                        }
                        break;
                    // Ket thuc phan cho nhan vat chinh Ngu Doc
                    // Nhan vat chinh thieu lam

                    // Ket thuc nhan vat chinh thieu lam
                    default:
                        System.out.println("Option khong ton tai.");
                        break;
                }
            default:
                System.out.println("Option khong to tai !!!");
                break;
        }
    }
}