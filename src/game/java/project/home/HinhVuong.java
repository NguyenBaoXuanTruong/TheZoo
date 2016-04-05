package game.java.project.home;

import java.util.Scanner;

public class HinhVuong extends HinhHoc {
	private Double n;

	private HinhVuong(Double n) {
		this.n = n;
	}

	protected HinhVuong() {
	}

	protected Double getCanh() {
		return n;
	}

	protected void setCanh(Double n) {
		this.n = n;
	}

	@Override
	protected Double Chuvi() {
		return n * 2;
	}

	@Override
	protected Double Dientich() {
		return n * n;
	}

	@SuppressWarnings("resource")
	protected void Process() {
		System.out.println("Nhap chieu day cua canh: ");
		Scanner s = new Scanner(System.in);
		Double c = s.nextDouble();
		HinhVuong hv = new HinhVuong(c);
		Double chuvi = hv.Chuvi();
		System.out.println("Chu vi hinh vuong la: " + chuvi);
		Double dientich = hv.Dientich();
		System.out.println("Dien tich hinh vuong la: " + dientich);
	}
}
