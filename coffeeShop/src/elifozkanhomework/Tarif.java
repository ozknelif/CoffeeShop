package elifozkanhomework;

public class Tarif {

	private int espresso;
	private int milkFoam;
	private int hotWater;
	private int steamedMilk;
	private int hotChocolate;
	
	
	public Tarif(int espresso, int milkFoam, int hotWater, int steamedMilk, int hotChocolate) {
		this.espresso = espresso;
		this.milkFoam = milkFoam;
		this.hotWater = hotWater;
		this.steamedMilk = steamedMilk;
		this.hotChocolate = hotChocolate;
	}
	
	
	public int getEspresso() {
		return espresso;
	}
	public void setEspresso(int espresso) {
		this.espresso = espresso;
	}
	
	public int getMilkFoam() {
		return milkFoam;
	}
	public void setMilkFoam(int milkFoam) {
		this.milkFoam = milkFoam;
	}
	
	public int getHotWater() {
		return hotWater;
	}
	public void setHotWater(int hotWater) {
		this.hotWater = hotWater;
	}
	
	public int getSteamedMilk() {
		return steamedMilk;
	}
	public void setSteamedMilk(int steamedMilk) {
		this.steamedMilk = steamedMilk;
	}
	
	public int getHotChocolate() {
		return hotChocolate;
	}
	public void setHotChocolate(int hotChocolate) {
		this.hotChocolate = hotChocolate;
	}


	@Override
	public String toString() {
		String tarifMesaji = "";
		boolean urunEklendi = false;
		if (this.getEspresso() > 0) {
			tarifMesaji += this.getEspresso() + " doz espresso ";
			urunEklendi = true;
		}
		if (this.getMilkFoam() > 0) {
			if (urunEklendi) {
				tarifMesaji += "ve ";
			}
			tarifMesaji += this.getMilkFoam() + " doz s�t k�p��� ";
			urunEklendi = true;
		}
			
		if (this.getSteamedMilk() > 0) {
			if (urunEklendi) {
				tarifMesaji += "ve ";
			}
			tarifMesaji += this.getSteamedMilk() + " doz s�cak s�t ";
			urunEklendi = true;
		}
		if (this.getHotChocolate() > 0) {
			if (urunEklendi) {
				tarifMesaji += "ve ";
			}
			tarifMesaji += this.getHotChocolate() + " doz s�cak �ikolata ";
			urunEklendi = true;
		}
		if (this.getHotWater() > 0) {
			if (urunEklendi) {
				tarifMesaji += "ve ";
			}
			tarifMesaji += this.getHotWater() + " doz s�cak su ";
			
		}
		
		return "Bu i�ece�imiz " + tarifMesaji + "i�ermektedir. Afiyet olsun.";
	}
	
	
	
}
