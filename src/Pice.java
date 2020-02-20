class Pice extends Artikal
{
    private float prAlkohola;

    public Pice(String n, int c, float pra) {
    	super(n, c);
        prAlkohola = pra;
    }  
   
    public  float prodajnaCena()
    {
        return cena*(1+prAlkohola/100);
    }
    @Override
    public String toString()
    {
        return super.toString()+", % alkohola: "+prAlkohola+", Prodajana cena: "+prodajnaCena()+" din";
    }
}
