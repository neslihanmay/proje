package proje;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		anaMenuYazdir();
		System.out.println("SEÇÝNÝZ:");
		System.out.println("1-AYÞE CAN");
		System.out.println("2-FATMA KOL");

		int secilenOgretmen = scanner.nextInt();
		System.out.println("þifre:");
		int girilensifre = scanner.nextInt();
		if (secilenOgretmen == 1 && girilensifre == 12345) {
			Giris giris = new Giris();
			giris.setSifre(girilensifre);
			boolean dongu = true;

			do {
				menuYazdir();
				System.out.println("hangi iþlemi yapacaksanýz seçiniz");
				int secilenIslem = scanner.nextInt();
				switch (secilenIslem) {

				case 1:

					VeriÝslemleri.notGir();

					break;
				case 2:
					VeriÝslemleri.devamsizlikGir();

					break;

				case 3:
					VeriÝslemleri.ogrenciListele();

					break;
				case 4:
					System.out.println("ÇIKIÞ YAPILDI");
					break;

				default:
					break;
				}

			} while (dongu);
		} else if (secilenOgretmen == 2 && girilensifre == 54321) {
			Giris giris = new Giris();
			giris.setSifre(girilensifre);
			boolean dongu = true;

			do {
				menuYazdir();
				System.out.println("hangi iþlemi yapacaksanýz seçiniz");
				int secilenIslem = scanner.nextInt();
				switch (secilenIslem) {

				case 1:

					VeriÝslemleri.notGir();

					break;
				case 2:
					VeriÝslemleri.devamsizlikGir();

					break;

				case 3:
					VeriÝslemleri.ogrenciListele();

					break;
				case 4:
					System.out.println("ÇIKIÞ YAPILDI");
					break;

				default:
					break;
				}

			} while (dongu);
		} else {

		}
	}

	static void anaMenuYazdir() {

		System.out.println("***** ÖZEL MAY ÝLKOKULU *****");
		System.out.println(" ÖÐRETMEN GÝRÝÞ SÝSTEMÝ ");
	}

	static void menuYazdir() {
		System.out.println("1-NOT GÝRÝÞÝ");
		System.out.println("2-DEVAMSIZLIK GÝRÝÞÝ");
		System.out.println("3-ÖÐRENCÝLERÝ LÝSTELE");
		System.out.println("4-ÇIKIÞ");
	}

}
