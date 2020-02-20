package fajlovi;

public class Profesor {

	private String imeIPrezime;
	
	
	public Profesor(String imePrezime) {
		imeIPrezime = imePrezime;
	}
	
	public String getImeIPrezime() {
		return imeIPrezime;
	}
	
	@Override
	public String toString() {
		return imeIPrezime;
	}
	
}
