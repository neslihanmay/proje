package proje;

import java.awt.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Veri›slemleri {
	static Scanner klavyedenOku = new Scanner(System.in);

	public static void notGir() {
		for (int i = 0; i < 5; i++) {
			System.out.print("notu giriniz ");
			int girilennot = klavyedenOku.nextInt();

			Connection con = null;
			try {

				con = anabaglanti.getConnection();
				String sorgu = "insert into Ogrenci (ogrencinot) values (?)";
				PreparedStatement prepareStatement = con.prepareStatement(sorgu);
				prepareStatement.setInt(4, girilennot);

				prepareStatement.execute();

			} catch (Exception e) {

				System.out.println(e);
			} finally {
				try {
					con.close();
				} catch (SQLException e) {
					System.out.println("Hata olu˛tu. Balant˝ bile kapat˝lamad˝.");
				}
			}
			System.out.println("Not bilgisi girildi");
		}
	}

	public static void ogrenciListele() {
		Connection con = null;
		try {

			con = anabaglanti.getConnection();
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select * from ogrenciler");
			while (rs.next()) {
				int numara = rs.getInt(1);
				String ad = rs.getString(2);
				String ˛ube = rs.getString(3);

				int not = rs.getInt(4);
				int devamsizlik = rs.getInt(5);
				System.out.println(ad + "---" + ˛ube + "---" + not + "---" + devamsizlik);
			}

		} catch (Exception e) {
			System.out.println(e);
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				System.out.println("Hata olu˛tu. Balant˝ bile kapat˝lamad˝.");
			}
		}
	}

	public static void devamsizlikGir() {
		System.out.print("notu giriniz ");
		int girilendevamsizlik = klavyedenOku.nextInt();

		Connection con = null;
		try {
			con = anabaglanti.getConnection();
			String sorgu = "insert into Ogrenci (devamsizlik) values (?)";
			PreparedStatement prepareStatement = con.prepareStatement(sorgu);
			prepareStatement.setInt(5, girilendevamsizlik);
			prepareStatement.execute();

		} catch (Exception e) {

			System.out.println(e);
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				System.out.println("Hata olu˛tu. Balant˝ bile kapat˝lamad˝.");
			}
		}
		System.out.println("Devams˝zl˝k bilgisi girildi");
	}

}
