package pitanje;

import java.util.ArrayList;

public class MultipleChoicePitanje extends Pitanje {

	private ArrayList<String> odgovori;
	private int tacanOdgovor;
	
	public MultipleChoicePitanje(String tekstPitanja, int brojPoena,
			ArrayList<String> odgovori, int tacanOdgovor) {
		super(tekstPitanja, brojPoena);
		this.odgovori = odgovori;
		this.tacanOdgovor = tacanOdgovor;
	}

	public ArrayList<String> getOdgovori() {
		return odgovori;
	}

	public void setOdgovori(ArrayList<String> odgovori) {
		this.odgovori = odgovori;
	}

	public int getTacanOdgovor() {
		return tacanOdgovor;
	}

	public void setTacanOdgovor(int tacanOdgovor) {
		this.tacanOdgovor = tacanOdgovor;
	}

	@Override
	public String toString() {
		return super.toString() + "\n" + String.join("\n ", odgovori);
	}
	
}
