package game.java.project.home;

import java.util.Scanner;

public class Menu {
	// The options input
	@SuppressWarnings("resource")
	protected int Choose() {
		System.out.println("1.Hinh chu nhat.");
		System.out.println("2.Hinh vuong.");
		System.out.println("3.Hinh tru.");
		System.out.println("4.Hinh tron.");

		System.out.print("Chon muc ban can: ");
		Scanner s = new Scanner(System.in);
		int i = s.nextInt();
		return i;
	}

	protected void List() {
		int i = Choose();

		switch (i) {
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
		default:
			System.out.println("Option khong to tai !!!");
			break;
		}
	}
}