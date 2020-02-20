abstract class Artikal
{
    protected String naziv;
    protected int cena;

    public Artikal(String n, int c) {
        naziv = n;
        cena = c;
    }
    public abstract float prodajnaCena();
      
    @Override
    public String toString()
    {
        return "Naziv: "+naziv + " Cena: " + cena + " din";
    }
}
