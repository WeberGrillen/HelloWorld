package IndkøbsKurv;

public class Main{
    public static void main(String [] args) {
        Vare mælk = new Vare("Mælk",10);
        Vare smør = new Vare("Smør",10);
        Vare brød = new Vare("Børd",15);

        Indkøbskurv kurv = new Indkøbskurv();
        kurv.tilføjOrdrelinje(new Ordrelinje(mælk, 2));
        kurv.tilføjOrdrelinje(new Ordrelinje(smør,3));


        System.out.println(kurv);
    }
}
