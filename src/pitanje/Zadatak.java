package pitanje;

public class Zadatak extends ATekstualnoPitanje {

	private boolean zahtevaUpotrebuKalkulatora;
	
	public Zadatak(String tekstPitanja, int brojPoena, int brojLinija, boolean upotrebaKalkulatora) {
		super(tekstPitanja, brojPoena, brojLinija);
		this.zahtevaUpotrebuKalkulatora = upotrebaKalkulatora;
	}

	public boolean isZahtevaUpotrebuKalkulatora() {
		return zahtevaUpotrebuKalkulatora;
	}

	public void setZahtevaUpotrebuKalkulatora(boolean zahtevaUpotrebuKalkulatora) {
		this.zahtevaUpotrebuKalkulatora = zahtevaUpotrebuKalkulatora;
	}

	@Override
	public String toString() {
		
		return super.toString() + 
				(zahtevaUpotrebuKalkulatora? "\n (zadatak zahteva upotrebu kalkulatora)" : "");
	}
}
