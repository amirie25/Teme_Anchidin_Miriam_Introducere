import java.util.ArrayList;
import java.util.List;

public abstract class Project implements Risky {
    protected String titlu;
    protected String obiectiv;
    protected long fonduri;
    protected Programmer manager;
    protected List<Programmer> membri;

    public Project(String titlu, String obiectiv, long fonduri, Programmer manager) {
        this.titlu = titlu;
        this.obiectiv = obiectiv;
        this.fonduri = fonduri;
        this.manager = manager;
        this.membri = new ArrayList<>();
    }

    public void adaugaMembru(Programmer membru) {
        this.membri.add(membru);
    }

    public int getNumarMembri() {
        return membri.size();
    }

    public long getFonduri() {
        return fonduri;
    }

    public String getTitlu() {
        return titlu;
    }

    @Override
    public String toString() {
        return "Proiect: " + titlu + "\n" +
                "Tip: " + this.getClass().getSimpleName() + "\n" +
                "Obiectiv: " + obiectiv + "\n" +
                "Fonduri: " + fonduri + "\n" +
                "Manager: " + manager + "\n" +
                "Număr membri: " + getNumarMembri() + "\n" +
                "Risc: " + calculeazaRisc();
    }
}