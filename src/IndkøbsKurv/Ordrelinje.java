package IndkøbsKurv;


public class Ordrelinje {
    private Vare vare;  // Referance til Vare
    private int antal;  // Antal af vare

    // Constructor
    public Ordrelinje(Vare vare, int antal){
        this.vare = vare;
        this.antal = antal;
    }

    // Metode til at returnere den samlede pris for de købte varer
    public double getTotalPris() {
        return vare.getPris() * antal;
    }

    public String toString() {
        return antal + " X " + vare.getVare() + " = " + getTotalPris() + " kr.";
    }
}
