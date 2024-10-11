package IndkøbsKurv;

public class Vare {
    private String vare;
    private double pris;

    public Vare(String vare, double pris) {
        this.vare = vare;
        this.pris = pris;
    }

    public String getVare() {
        return this.vare;
    }

    public double getPris() {
        return this.pris;
    }

    public String toString() {
        return vare + " (" + pris + " kr.)";
    }

}
