package elifozkanhomework;


public class Urun {
	
	private int numara;
	private String ad;
	private int fiyat;
	private final Tarif tarif;
	
	public Urun(int numara, String ad, int fiyat, Tarif tarif) {
		this.numara = numara;
		this.ad = ad;
		this.fiyat = fiyat;
		this.tarif = tarif;
	}
	
	
	public int getNumara() {
		return numara;
	}
	public void setNumara(int numara) {
		this.numara = numara;
	}
	
	public String getAd() {
		return ad;
	}
	public void setAd(String ad) {
		this.ad = ad;
	}
	
	public int getFiyat() {
		return fiyat;
	}
	public void setFiyat(int fiyat) {
		this.fiyat = fiyat;
	}
	
	public Tarif getTarif() {
		return tarif;
	}
	
	
	@Override
	public String toString() {
		return this.getAd() + " seçtiniz. " + this.tarif.toString();
	}
	
	
}
