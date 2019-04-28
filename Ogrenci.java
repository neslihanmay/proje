package proje;

public class Ogrenci extends Temelsinif {
	private String ogrencininadi;
	private String ogrencininsoyadi;
	private String ogrencininsubesi;
	private int ogrencininnumarasi;
	private int not;
	private int devamsizlik;

	public String getOgrencininAdi() {
		return ogrencininadi;
	}

	public void setOgrencininAdi(String ogrencininAdi) {
		this.ogrencininadi = ogrencininAdi;
	}

	public String getOgrenciniSoyadi() {
		return ogrencininsoyadi;
	}

	public void setOgrencininSoyadi(String ogrencininsoyadi) {
		this.ogrencininsoyadi = ogrencininsoyadi;
	}

	public String getOgrencininSubesi() {
		return ogrencininsubesi;
	}

	public void setOgrencininSubesi(String ogrencininsubesi) {
		this.ogrencininsubesi = ogrencininsubesi;
	}

	public int getOgrenciNumarasi() {
		return ogrencininnumarasi;
	}

	public void setOgrenciNumarasi(int ogrencininnumarasi) {
		this.ogrencininnumarasi = ogrencininnumarasi;
	}

	public int getNot() {
		return not;
	}

	public void setNot(int not) {
		this.not = not;
	}

	public int getDevamsizlik() {
		return devamsizlik;
	}

	public void setDevamsizlik(int devamsizlik) {
		this.devamsizlik = devamsizlik;
	}

	public int getId() {
		// TODO Auto-generated method stub
		return 0;
	}
}