package IndkøbsKurv;
import java.util.ArrayList;

public class Indkøbskurv {

    private ArrayList<Ordrelinje> kruv;

    // Constructor
    public Indkøbskurv() {
        kruv = new ArrayList<>();
    }

    // Metode til at tilføje ordreliste
    public void tilføjOrdrelinje(Ordrelinje ordrelinje) {
        kruv.add(ordrelinje);
    }

    // Metode til at få samlet pris af alle odrelinjerne
    public double getSamletPris() {
        double totalPris = 0;
        for (Ordrelinje ordrelinje : kruv) {
            totalPris += ordrelinje.getTotalPris();
        }
        return totalPris;
    }
    // Override toString for at vise alle varer i kurven
    @Override
    public String toString() {
        StringBuilder kurvInfo = new StringBuilder("Indkøbskurv:\n");
        for (Ordrelinje ordrelinje : kruv) {
            kurvInfo.append(ordrelinje.toString()).append("\n"); // Tilføjer hver ordrelinjes tekstrepræsentation til kurvInfo
        }
        kurvInfo.append("Samlet pris: ").append(getSamletPris()).append(" kr");  // Tilføjer den samlede pris til kurvInfo
        return kurvInfo.toString();
    }


}
