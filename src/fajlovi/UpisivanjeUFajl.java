package fajlovi;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class UpisivanjeUFajl {
	public static final String putanja="studenti.txt";
	
	public static void main(String[] args) throws IOException {
		
		List<Student> studenti = new ArrayList<>();
		Student s1=new Student("41/2008", "Pera1 Peric1");
		
		studenti.add(s1);
		studenti.add(new Student("51/2008", "Pera2 Peric2"));
		studenti.add(new Student("141/2008", "Pera3 Peric3"));
		studenti.add(new Student("55/2008", "Pera4 Peric4"));
		studenti.add(new Student("72/2008", "Pera5 Peric5"));
		File f=new File(putanja);
		
		// drugi parametar u FileWriter konstruktoru (boolean) oznacava da se u  
		// datoteci najpre brise prethodni sadrzaj, pa upisuje novi, ili se 
		// nadovezuje tekst na vec postojeci (u nasem slucaju najpre brisemo postojeci sadrzaj)
		PrintWriter writer = new PrintWriter(new FileWriter(f, false));
		
		for(Student s : studenti) {
			writer.println(s.toString());
		}
		
		System.out.println("Podaci su upisani u datoteku.");
		
		writer.close();
		
	}

}
