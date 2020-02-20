package test;

import java.util.ArrayList;
import java.util.Random;

import pitanje.Pitanje;

public class OdrzavanjeTesta {

	private Test test;
	private ArrayList<Student> studenti;
	private Random r = new Random();
	
	public OdrzavanjeTesta(Test test) {
		this.test = test;
		studenti = new ArrayList<>();
	}
	
	public void odrziTest() {
		for (Student s : studenti) {
			for (Pitanje p: test.getPitanja()) {
				s.dodajOdgovor(p, r.nextInt(p.getBrojPoena() + 1));
			}
		}
		
		studenti.sort(null);
		for (Student s : studenti) {
			System.out.println(s + ": " + s.brPoenaNaTestu());
		}
	}
	
	public void dodajStudenta(Student s) {
		studenti.add(s);
	}

}
