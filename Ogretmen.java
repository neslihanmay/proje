package proje;

public class Ogretmen extends Temelsinif {

	private String adi;
	private String soyadi;
	private String sube;

	public String getSube() {
		return sube;
	}

	public void setSube(String sube) {
		this.sube = sube;
	}

	public String getAdi() {
		return adi;
	}

	public void setAdi(String adi) {
		this.adi = adi;
	}

	public String getSoyadi() {
		return soyadi;
	}

	public void setSoyadi(String soyadi) {
		this.soyadi = soyadi;
	}

	public int getId() {
		// TODO Auto-generated method stub
		return 0;
	}

	public String toString() {
		// 1 - ABCDEF
		return adi + "  " + soyadi + "   " + sube;
	}
}
