public class Programmer {
    private String nume;
    private int varsta;

    public Programmer(String nume, int varsta) {
        this.nume = nume;
        this.varsta = varsta;
    }

    public String getNume() {
        return nume;
    }

    public int getVarsta() {
        return varsta;
    }

    @Override
    public String toString() {
        return nume + " (" + varsta + " ani)";
    }
}