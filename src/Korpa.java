import java.util.ArrayList;

public class Korpa implements IKupovina {

	private ArrayList<Artikal> la;
	
	public Korpa() {
		super();
		// TODO Auto-generated constructor stub
		la = new ArrayList<Artikal>();
	}
	@Override
	public void dodaj(Artikal a) {
		// TODO Auto-generated method stub
		la.add(a);
	}
	@Override
	public float ukupnaCena() {
		// TODO Auto-generated method stub
		
		float cena = 0;
		
		for(Artikal pom : la)
			cena += pom.prodajnaCena();
		if (cena>2000){
			System.out.println("Dodatni Popust");
			return (float) (cena*0.8);
		}else
			return cena;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String ispis="SADRZAJ KORPE\n";
		for(Artikal pom : la)
			ispis += "\t"+pom.toString()+"\n";
		ispis+="--------------------\n\tZA UPLATU= "+ukupnaCena()+" din";
		return ispis;
	}
}
