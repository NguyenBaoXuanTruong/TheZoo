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
			// Phan choi nhan vat chinh Nguc Doc
			int tier2 = nhanvatMenu();
			switch (tier2) {
			case 1:
				NguDoc nv1 = new NguDoc("Tom", 100.0, 10.0, 1.0, 1.0, 1000.0);
				// Phan choi cho nhan vat phu Ngu Doc
				int tier3 = nhanvatMenu();
				switch (tier3) {
				case 1:
					NguDoc nv2 = new NguDoc("Tom", 100.0, 10.0, 1.0, 1.0, 1000.0);
					// Phan action
					int tier4 = nhanvatAction();
					switch (tier4) {
					case 1:
						System.out.print("Nhap ten ban muon: ");
						s = new Scanner(System.in);
						String n = s.nextLine();
						nv1.setName(n);
						System.out.println("Ten nhan vat duoc doi thanh " + nv1.getName());
						break;
					case 2:
						Double mauNV2;
						if (nv2.getMau() > 0) {
							mauNV2 = nv2.getMau() - nv1.tancong() + nv2.buff();
							nv2.setMau(mauNV2);
							System.out.println("Ke dich tru don, mau con lai la " + nv2.getMau());
						} else {
							mauNV2 = 0.0;
							nv2.setMau(mauNV2);
							System.out.println("Ke dich da bi tieu diet, CHUC MUNG !!!");
						}
						break;
					case 3:
						System.out.println("Chi so Buff cua ta la: " + nv1.buff());
						break;
					case 4:
						System.out
								.println("So ngoc cau ta la " + nv1.epNgoc() + " va tien con lai la " + nv1.getMoney());
						break;
					default:
						System.out.println("Option khong ton tai.");
						break;
					}
					// ket thuc phan action
					break;
				default:
					break;
				}
				// Ket thuc phan cho nhan vat phu Nguc Doc
				break;
			default:
				System.out.println("Option khong ton tai.");
				break;
			}
			// Ket thuc phan cho nhan vat chinh Ngu Doc
			break;
		default:
			System.out.println("Option khong to tai !!!");
			break;
		}
	}
}