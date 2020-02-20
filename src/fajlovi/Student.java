package fajlovi;

public class Student {
	
	private String brojIndeksa;
	private String imePrezime;
	
	public Student(String brojIndeksa, String imePrezime) {
		this.brojIndeksa = brojIndeksa;
		this.imePrezime = imePrezime;
	}
	
	@Override
	public String toString() {
		return imePrezime+" "+brojIndeksa;
	}

}
