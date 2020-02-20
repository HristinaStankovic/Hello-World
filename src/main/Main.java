package main;
import java.util.ArrayList;

import pitanje.DaNePitanje;
import pitanje.MultipleChoicePitanje;
import pitanje.TekstualnoPitanje;
import pitanje.Zadatak;
import test.OdrzavanjeTesta;
import test.Student;
import test.Test;

public class Main {

	public static void main(String[] args) {
		ArrayList<String> odgovori = new ArrayList<>();
		odgovori.add("a - odgovor");
		odgovori.add("b - odgovor");
		odgovori.add("c - odgovor");
		DaNePitanje daNe = new DaNePitanje("Da ne pitanje", 2, true);
		
		MultipleChoicePitanje mc = new MultipleChoicePitanje("Koji od ovih?", 3, odgovori, 2);
		TekstualnoPitanje tp = new TekstualnoPitanje("Neko duze pitanje", 4, 4);
		Zadatak z1 = new Zadatak("Zadatak 1", 3, 3, false);
		Zadatak z2 = new Zadatak("Zadatak 2", 4, 5, true);
		Zadatak z3 = new Zadatak("Zadatak 3", 6, 7, true);
		
		Test t = new Test("ja", "nasl.", "oop", "raf");
		t.dodajPitanje(daNe);
		t.dodajPitanje(mc);
		t.dodajPitanje(z1);
		t.dodajPitanje(z2);
		t.dodajPitanje(z3);
		t.dodajPitanje(tp);
		
		t.ispisTesta("test1.txt");
		
		OdrzavanjeTesta o = new OdrzavanjeTesta(t);
		o.dodajStudenta(new Student("pera peric", "24/03"));
		o.dodajStudenta(new Student("mika mikic", "24/08"));
		o.dodajStudenta(new Student("arsa arsic", "24/09"));
		o.odrziTest();
	}

}
