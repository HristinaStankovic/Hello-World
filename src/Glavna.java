public class Glavna {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Artikal a = new Pice("Vodka", 1000, 25) ;
		Artikal b = new Pice("Fanta", 100, 0) ;
		Artikal c = new Hrana("Burek", 100, 2) ;
		Artikal d = new Hrana("Smoki", 25, 60) ;
		
		IKupovina kupac = new Korpa();
		
		kupac.dodaj(a);
		kupac.dodaj(c);	
		System.out.println(kupac);		
		kupac.dodaj(b);
		kupac.dodaj(d);		
		System.out.println(kupac);
		
		kupac.dodaj(a);	
		System.out.println(kupac);
	}
}
