package proje;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		anaMenuYazdir();
		System.out.println("SE��N�Z:");
		System.out.println("1-AY�E CAN");
		System.out.println("2-FATMA KOL");

		int secilenOgretmen = scanner.nextInt();
		System.out.println("�ifre:");
		int girilensifre = scanner.nextInt();
		if (secilenOgretmen == 1 && girilensifre == 12345) {
			Giris giris = new Giris();
			giris.setSifre(girilensifre);
			boolean dongu = true;

			do {
				menuYazdir();
				System.out.println("hangi i�lemi yapacaksan�z se�iniz");
				int secilenIslem = scanner.nextInt();
				switch (secilenIslem) {

				case 1:

					Veri�slemleri.notGir();

					break;
				case 2:
					Veri�slemleri.devamsizlikGir();

					break;

				case 3:
					Veri�slemleri.ogrenciListele();

					break;
				case 4:
					System.out.println("�IKI� YAPILDI");
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
				System.out.println("hangi i�lemi yapacaksan�z se�iniz");
				int secilenIslem = scanner.nextInt();
				switch (secilenIslem) {

				case 1:

					Veri�slemleri.notGir();

					break;
				case 2:
					Veri�slemleri.devamsizlikGir();

					break;

				case 3:
					Veri�slemleri.ogrenciListele();

					break;
				case 4:
					System.out.println("�IKI� YAPILDI");
					break;

				default:
					break;
				}

			} while (dongu);
		} else {

		}
	}

	static void anaMenuYazdir() {

		System.out.println("***** �ZEL MAY �LKOKULU *****");
		System.out.println(" ��RETMEN G�R�� S�STEM� ");
	}

	static void menuYazdir() {
		System.out.println("1-NOT G�R���");
		System.out.println("2-DEVAMSIZLIK G�R���");
		System.out.println("3-��RENC�LER� L�STELE");
		System.out.println("4-�IKI�");
	}

}
