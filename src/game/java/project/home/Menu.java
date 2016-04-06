package game.java.project.home;

import java.util.Scanner;

public class Menu {
	// The options input
	protected int Choose() {
		System.out.println("1.Hinh chu nhat.");
		System.out.println("2.Hinh vuong.");
		System.out.println("3.Hinh tru.");
		System.out.println("4.Hinh tron.");
		System.out.println("5.Vo Lam Truyen Ky");

		System.out.print("Chon muc ban can: ");
		Scanner s = new Scanner(System.in);
		int i = s.nextInt();
		s.close();
		return i;
	}

	protected int nhanvatMenu() {
		System.out.println("1.Ngu Doc.");
		System.out.println("2.Thieu Lam.");
		System.out.println("3.Vo Dang.");
		System.out.println("4.Duong Mon.");

		System.out.print("Chon nhan vat ban muon: ");
		Scanner s = new Scanner(System.in);
		int i = s.nextInt();
		s.close();
		return i;
	}

	protected int nhanvatAction() {
		System.out.println("1.Doi ten.");
		System.out.println("2.Danh.");
		System.out.println("3.Buff.");
		System.out.println("4.Ep ngoc.");

		System.out.println("Chon muc ban can: ");
		Scanner s = new Scanner(System.in);
		int i = s.nextInt();
		s.close();
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
				NguDoc nv1 = new NguDoc("Tom", 100.0, 20.0, 0.0, 2.0, 1000.0);
				// Phan choi cho nhan vat phu Ngu Doc
				int tier3 = nhanvatMenu();
				switch (tier3) {
				case 1:
					NguDoc nv2 = new NguDoc("Tom", 100.0, 20.0, 0.0, 2.0, 1000.0);
					// Phan action
					int tier4 = nhanvatAction();
					switch (tier4) {
					case 1:
						System.out.println("Nhap ten ban muon: ");
						Scanner s1 = new Scanner(System.in);
						String a1 = s1.nextLine();
						nv1.setName(a1);
						System.out.println("Ten nhan vat duoc doi thanh " + nv1.getName());
						s1.close();
						break;
					case 2:
						Double randomDame = (int) (Math.random() * nv2.getMau()) - nv2.getBuff();
						nv2.setMau(nv2.getMau() - randomDame - nv1.getBuff());
						if (nv2.getMau() > 0) {
							System.out.println("Ke dich da trung don, mau hien tai con lai la " + nv2.getMau());
						} else {
							System.out.println("Ket dich da bi tieu diet.");
						}
						break;
					case 3:
						Double randombuf = (int) (Math.random() * 10) + nv1.getBuff();
						nv1.setBuff(randombuf);
						if (nv1.getBuff() > 30)
							nv1.setBuff(30.0);
						System.out.println("Nhan vat da duoc buff, chi so buff hien tai la " + nv1.getBuff());
						break;
					default:
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