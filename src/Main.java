public class Main {
    public static void main(String[] args) {
        Pkw p = new Pkw(8, 120);

        System.out.println("Sitze: " + p.getAnzahlSitze() + "\n"
                + "Geschwindigkeit: " + p.getGeschwindigkeit());

        System.out.println(p.geschwindigkeit);
    }
}