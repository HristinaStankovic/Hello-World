package pitanje;

public abstract class ATekstualnoPitanje extends Pitanje {

	protected int brojLinija;
	
	public ATekstualnoPitanje(String tekstPitanja, int brojPoena, int brojLinija) {
		super(tekstPitanja, brojPoena);
		this.brojLinija = brojLinija;
	}

	public int getBrojLinija() {
		return brojLinija;
	}

	public void setBrojLinija(int brojLinija) {
		this.brojLinija = brojLinija;
	}

	@Override
	public String toString() {
		StringBuilder s = new StringBuilder();
		for (int i = 0; i < brojLinija; i++) {
			s.append("\n____________________________");
		}
		return super.toString() + s.toString();
	}
	
}
