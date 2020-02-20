package pitanje;

public class DaNePitanje extends Pitanje {

	private boolean tacanOdgovor;
	
	public DaNePitanje(String tekstPitanja, int brojPoena, boolean tacanOdgovor) {
		super(tekstPitanja, brojPoena);
		this.tacanOdgovor = tacanOdgovor;
	}

	public boolean isTacanOdgovor() {
		return tacanOdgovor;
	}

	public void setTacanOdgovor(boolean tacanOdgovor) {
		this.tacanOdgovor = tacanOdgovor;
	}

	@Override
	public String toString() {
		return super.toString() + "   \nDA    \nNE";
	}
}
