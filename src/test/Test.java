package test;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Date;

import pitanje.Pitanje;
import pitanje.Zadatak;

public class Test {
	
	private ArrayList<Pitanje> pitanja;
	private String kreator;
	private String oblast;
	private String predmet;
	private String institucija;
	private Date datumKreiranja;
	
	public Test(String kreator, String oblast, String predmet, String institucija) {
		this.kreator = kreator;
		this.oblast = oblast;
		this.predmet = predmet;
		this.institucija = institucija;
		this.datumKreiranja = new Date();
		pitanja = new ArrayList<>();
	}
	
	public int getMaksimalanBrojPoena() {
		int m = 0;
		if (pitanja != null) {
			for (Pitanje p : pitanja) {
				m += p.getBrojPoena();
			}
		}
		return m;
	}

	public void dodajPitanje(Pitanje p) {
		pitanja.add(p);
	}
	
	public ArrayList<Pitanje> getPitanja() {
		return pitanja;
	}

	public void setPitanja(ArrayList<Pitanje> pitanja) {
		this.pitanja = pitanja;
	}

	public String getKreator() {
		return kreator;
	}

	public void setKreator(String kreator) {
		this.kreator = kreator;
	}

	public String getOblast() {
		return oblast;
	}

	public void setOblast(String oblast) {
		this.oblast = oblast;
	}

	public String getPredmet() {
		return predmet;
	}

	public void setPredmet(String predmet) {
		this.predmet = predmet;
	}

	public String getInstitucija() {
		return institucija;
	}

	public void setInstitucija(String institucija) {
		this.institucija = institucija;
	}

	public Date getDatumKreiranja() {
		return datumKreiranja;
	}

	public void setDatumKreiranja(Date datumKreiranja) {
		this.datumKreiranja = datumKreiranja;
	}

	public void ispisTesta(String nazivFajla) {
		try {
			PrintWriter pw = new PrintWriter(nazivFajla, "UTF-8");
			// todo: simpledateformat
			pw.println("Datum: " + datumKreiranja);
			pw.println(institucija);
			pw.println(predmet + ": " + oblast);
			for (int i = 0; i < pitanja.size(); i++) {
				pw.print((i+1) + ". " + pitanja.get(i));
				pw.println();
			}
			pw.close();
			System.out.println("Fajl " + nazivFajla + " je uspesno sacuvan.");
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
	
	public boolean validan() {
		for (int i = 0; i < pitanja.size() - 1; i++)
			for (int j = i + 1; j < pitanja.size(); j++)
				if (pitanja.get(i).getTekstPitanja().equals(pitanja.get(j).getTekstPitanja()))
					return false;
		int brPitanja = 0;
		int brZadataka = 0;
		for (Pitanje p : pitanja) {
			if (p instanceof Zadatak)
				brZadataka ++;
			else
				brPitanja ++;
		}
		return brPitanja == brZadataka;
	}
	
}
