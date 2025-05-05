import java.util.ArrayList;
import java.util.List;

public class InvestmentCompany {
    private List<Project> proiecte = new ArrayList<>();

    public void adaugaProiect(Project p) {
        proiecte.add(p);
    }

    public Project getBestInvestment() {
        if (proiecte.isEmpty()) return null;
        Project celMaiBun = proiecte.get(0);
        for (Project p : proiecte) {
            if (p.calculeazaRisc() < celMaiBun.calculeazaRisc()) {
                celMaiBun = p;
            }
        }
        return celMaiBun;
    }

    public static void main(String[] args) {
        Programmer manager = new Programmer("Ana", 45);
        Programmer p1 = new Programmer("Bogdan", 30);
        Programmer p2 = new Programmer("Carmen", 28);

        InvestmentCompany companie = new InvestmentCompany();

        CommercialProject comercial = new CommercialProject("ShopApp", "Vanzare produse", 100000, manager, "2025-12-01", 4);
        comercial.adaugaMembru(p1);
        comercial.adaugaMembru(p2);

        MilitaryProject militar = new MilitaryProject("SecureComm", "Comunicare criptata", 150000, manager, "2025-09-01", "topsecret123");
        militar.adaugaMembru(p1);

        OpenSourceProject open = new OpenSourceProject("FreeIDE", "Editor de cod", 60000, manager, "opensource@lista.ro");
        open.adaugaMembru(p1);
        open.adaugaMembru(p2);

        companie.adaugaProiect(comercial);
        companie.adaugaProiect(militar);
        companie.adaugaProiect(open);

        Project investitie = companie.getBestInvestment();
        System.out.println("Cel mai puțin riscant proiect este:\n" + investitie);
    }
}