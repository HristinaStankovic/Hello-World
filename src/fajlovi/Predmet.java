package fajlovi;

public class Predmet {
	
	private String naziv;
	private int espb;
	
	public Predmet(String naziv, int espb) {
		
		this.naziv = naziv;
		this.espb = espb;
		
	}
	
	public int getEspb() {
		return espb;
	}
	
	public String getNaziv() {
		return naziv;
	}
	
	@Override
	public String toString() {
		return naziv+"["+espb+"]";
	}

}
