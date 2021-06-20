package elifozkanhomework;

import java.util.ArrayList;
import java.util.Scanner;

public class SiparisSistemi {

	private ArrayList<Urun> urunler;
	private final String hataMesaji = "Lütfen geçerli bir ürün giriniz.";
	
	public SiparisSistemi() {
	
		urunler = new ArrayList<Urun>() 
		{
			{
				add(new Urun(1, "Espresso", 7, new Tarif(1, 0, 0, 0, 0)));
				add(new Urun(2, "Double Espresso", 12, new Tarif(2, 0, 0, 0, 0)));
				add(new Urun(3, "Cappucino", 12, new Tarif(1, 2, 0, 2, 0)));
				add(new Urun(4, "Caffe Latte", 12, new Tarif(1, 1, 0, 3, 0)));
				add(new Urun(5, "Mocha", 13, new Tarif(1, 1, 0, 1, 2)));
				add(new Urun(6, "Americano", 10, new Tarif(1, 0, 4, 0, 0)));
				add(new Urun(7, "Hot Water", 3, new Tarif(0, 0, 5, 0, 0)));
			}
		};	
	}
	
	public void siparisAl() {

		System.out.println("Lütfen içmek istediðiniz kahvenin numarasýný giriniz.");
		Scanner kullaniciGirisi = new Scanner(System.in);
		try 
		{
			int urunNo = kullaniciGirisi.nextInt();
			this.kahveHazirla(urunNo);
		}
		catch (Exception e) 
		{
			this.hataMesajiGoster();
		}
		finally 
		{
			System.out.println("\n\n");
		}
		
	}
	
	public void kahveHazirla(int urunNo) {
			
		if (urunNo < 1 || urunNo > this.getUrunler().size()) 
		{
			this.hataMesajiGoster();
		}
		else 
		{
			System.out.println("Teþekkürler kahveniz hazýrlanýyor.\n");
			System.out.println(this.getUrunler().get(urunNo - 1).toString());
		}
			
	}
	
	
	public void menuGoster() {
		
		for (Urun urun : this.getUrunler()) {
			System.out.println(urun.getNumara() +". " + urun.getAd() + " (" + urun.getFiyat() + "TL)");
		}
	}

	
	
	public void hataMesajiGoster() {
		
		System.out.println(this.getHataMesaji());
	
	}

	
	public String getHataMesaji() {
		return hataMesaji;
	}

	public ArrayList<Urun> getUrunler() {
		return urunler;
	}

	public void setUrunler(ArrayList<Urun> urunler) {
		this.urunler = urunler;
	}
}
