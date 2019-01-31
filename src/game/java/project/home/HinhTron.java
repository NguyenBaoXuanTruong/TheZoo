package game.java.project.home;

import java.util.Scanner;

public class HinhTron extends HinhHoc {
    private Double r;

    private HinhTron(Double r) {
        this.r = r;
    }

    protected HinhTron() {
    }

    protected Double getR() {
        return r;
    }

    protected void setR(Double r) {
        this.r = r;
    }

    @Override
    protected Double Chuvi() {
        return r * 2 * 3.14;
    }

    @Override
    protected Double Dientich() {
        // TODO Auto-generated method stub
        return r * r * 3.14;
    }

    @SuppressWarnings("resource")
    protected void Process() {
        System.out.println("Nhap ban kinh la: ");
        Scanner s = new Scanner(System.in);
        Double bankinh = s.nextDouble();
        HinhTron ht = new HinhTron(bankinh);
        Double chuvi = ht.Chuvi();
        Double dientich = ht.Dientich();
        System.out.println("Chu vi hinh tron la: " + chuvi);
        System.out.println("Dien tich hinh tron la: " + dientich);
    }
}