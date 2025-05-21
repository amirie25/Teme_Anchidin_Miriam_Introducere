public class Main {
    public static void main(String[] args) {
        Joc joc1 = new Joc("Echipa A", "Echipa B");
        Joc joc2 = new Joc("Steaua", "Dinamo");

        joc1.simuleaza();
        joc2.simuleaza();

        System.out.println("\nRezultatul jocului 1:\n" + joc1);
        System.out.println("\nRezultatul jocului 2:\n" + joc2);
    }
}