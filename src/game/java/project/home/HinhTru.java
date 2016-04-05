package game.java.project.home;

import java.util.Scanner;

public class HinhTru extends HinhTron {
	private Double cao;
	HinhTron ht = new HinhTron();

	private HinhTru(Double r, Double h) {
		ht.setR(r);
		this.cao = h;
	}

	protected HinhTru() {
	}

	@Override
	protected Double getR() {
		return ht.getR();
	}

	protected Double getCao() {
		return cao;
	}

	@Override
	protected Double Chuvi() {
		return ht.Chuvi() * cao;
	}

	@Override
	protected Double Dientich() {
		return ht.Dientich() * cao;
	}

	@Override
	@SuppressWarnings("resource")
	protected void Process() {
		System.out.println("Nhap ban kinh: ");
		Scanner s = new Scanner(System.in);
		Double r = s.nextDouble();
		System.out.println("Nhap chieu cao: ");
		Double h = s.nextDouble();
		HinhTru ht = new HinhTru(r, h);
		Double chuvi = ht.Chuvi();
		Double thetich = ht.Dientich();
		System.out.println("Chu vi hinh tru la: " + chuvi);
		System.out.println("The tich hinh tru la: " + thetich);
	}
}