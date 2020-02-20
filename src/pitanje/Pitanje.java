package pitanje;

public abstract class Pitanje {

	protected String tekstPitanja;
	protected int brojPoena;
	
	public Pitanje(String tekstPitanja, int brojPoena) {
		this.tekstPitanja = tekstPitanja;
		this.brojPoena = brojPoena;
	}

	public String getTekstPitanja() {
		return tekstPitanja;
	}

	public void setTekstPitanja(String tekstPitanja) {
		this.tekstPitanja = tekstPitanja;
	}

	public int getBrojPoena() {
		return brojPoena;
	}

	public void setBrojPoena(int brojPoena) {
		this.brojPoena = brojPoena;
	}
	
	@Override
	public String toString() {
		return tekstPitanja;
	}

}
