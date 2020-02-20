package test;

import java.util.HashMap;

import pitanje.Pitanje;

public class Student implements Comparable<Student> {
	private String ime;
	private String brIndeksa;
	private HashMap<Pitanje, Integer> odgovori;

	public Student(String ime, String brIndeksa) {
		this.brIndeksa= brIndeksa;
		this.ime = ime;
		this.odgovori = new HashMap<>();
	}

	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	public String getBrIndeksa() {
		return brIndeksa;
	}

	public void setBrIndeksa(String brIndeksa) {
		this.brIndeksa = brIndeksa;
	}
	
	@Override
	public int compareTo(Student o) {
		if (o == null)
			return -1;
		if (brPoenaNaTestu() > o.brPoenaNaTestu())
			return -1;
		if (brPoenaNaTestu() < o.brPoenaNaTestu())
			return 1;
		return 0;
	}
	
	public int brPoenaNaTestu() {
		int br = 0;
		for (Pitanje p : odgovori.keySet()) {
			br += odgovori.get(p);
		}
		return br;
	}
	
	public void dodajOdgovor(Pitanje pitanje, int brPoena) {
		odgovori.put(pitanje, brPoena);
	}
	
	public int getBrPoena(Pitanje pitanje) {
		if (odgovori.containsKey(pitanje))
			return odgovori.get(pitanje);
		else
			return 0;
	}
	
	@Override
	public String toString() {
		return ime + "\t\t" + brIndeksa;
	}
}
