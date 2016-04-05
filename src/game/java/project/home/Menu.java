package game.java.project.home;

import java.util.Scanner;

public class Menu {
	// The options input
	@SuppressWarnings("resource")
	protected int Choose() {
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

		default:
			break;
		}
	}
}
