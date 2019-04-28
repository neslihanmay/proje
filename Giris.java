package proje;

public class Giris extends Temelsinif {
	private String kullaniciadi;
	private int sifre;

	public String getKullaniciAdi() {
		return kullaniciadi;
	}

	public void setKullaniciAdi(String kullaniciadi) {
		this.kullaniciadi = kullaniciadi;
	}

	public int getSifre() {
		return sifre;
	}

	public void setSifre(int sifre) {
		this.sifre = sifre;
	}

	@Override
	public int getId() {
		// TODO Auto-generated method stub
		return 0;
	}
}
