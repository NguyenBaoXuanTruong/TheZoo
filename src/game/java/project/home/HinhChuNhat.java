package game.java.project.home;

import java.util.Scanner;

public class HinhChuNhat extends HinhVuong {
	private Double m;
	HinhVuong hv = new HinhVuong();

	private HinhChuNhat(Double n, Double m) {
		hv.setCanh(n);
		this.m = m;
	}

	protected HinhChuNhat() {
		// TODO Auto-generated constructor stub
	}

	@Override
	protected Double getCanh() {
		return hv.getCanh();
	}

	protected Double getCanh2() {
		return m;
	}

	@Override
	protected Double Chuvi() {
		return 2 * (hv.getCanh() + getCanh2());
	}

	@Override
	protected Double Dientich() {
		return hv.getCanh() * getCanh2();
	}

	@Override
	@SuppressWarnings("resource")
	protected void Process() {
		Scanner s = new Scanner(System.in);
		System.out.print("Nhap chieu day: ");
		Double day = s.nextDouble();
		System.out.print("Nhap chieu rong: ");
		Double rong = s.nextDouble();
		HinhChuNhat hcn = new HinhChuNhat(day, rong);
		Double chuvi = hcn.Chuvi();
		System.out.println("Chu vi hinh chu nhat la: " + chuvi);
		Double dientich = hcn.Dientich();
		System.out.println("Dien tich hinh chu nhat la: " + dientich);
	}
}