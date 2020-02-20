class Hrana extends Artikal
{
    private int preostaliRokUpotrebe;

     public Hrana(String n, int c, int pru) {
    	 super(n, c);
         preostaliRokUpotrebe = pru;
     }
     @Override
     public float prodajnaCena()
     {
         if (preostaliRokUpotrebe < 10)
            return (float) (cena*0.60);
         else
            return cena;
     }
     @Override
     public String toString()
     {
         return super.toString()+", rok upotrebe: "+preostaliRokUpotrebe+" dana, Prodajana cena: "+prodajnaCena()+" din";
     }
}
