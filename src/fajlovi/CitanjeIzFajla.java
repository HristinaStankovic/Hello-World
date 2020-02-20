package fajlovi;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class CitanjeIzFajla {
	
	
	public static void main(String[] args) throws IOException {
		
		ArrayList<Profesor> profesori = new ArrayList<>();
		ArrayList<Predmet> predmeti = new ArrayList<>();
		File f=new File("predmeti.txt");
		BufferedReader reader = new BufferedReader(new FileReader(f));
		
		String red = "";
		// u svakoj iteraciji while petlje, red ce sadrzati po jedan red iz datoteke
		// while ce zavrsiti sa radom nakon sto procitamo poslednji red iz datoteke
		while((red = reader.readLine())!=null) {
			
			// sece prosledjeni string (red) na 'tokene' koji su razdvojeni ';'
			StringTokenizer st = new StringTokenizer(red, ";");
			
//			// u svakoj iteraciji token sadrzi naredni token iz reda
//			while(st.hasMoreTokens()) {
//				String token = st.nextToken();
//			}
			
			String imePredmeta = st.nextToken();
			int espb = Integer.parseInt(st.nextToken());
			String imeProfesora = st.nextToken();
			
			profesori.add(new Profesor(imeProfesora));
			predmeti.add(new Predmet(imePredmeta, espb));
			
		}
		
		// zatvaramo reader
		reader.close();
		
		// ispisujemo sve profesore koje smo ucitali iz fajla
		System.out.println("PROFESORI:");
		for(Profesor p : profesori) {
			System.out.println(p.toString());
		}
		
		System.out.println("\nPREDMETI");
		for(Predmet p : predmeti) {
			System.out.println(p.toString());
		}
		
	}

}
