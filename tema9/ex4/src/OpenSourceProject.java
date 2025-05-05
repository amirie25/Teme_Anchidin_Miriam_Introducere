public class OpenSourceProject extends Project {
    private String listaEmail;

    public OpenSourceProject(String titlu, String obiectiv, long fonduri, Programmer manager, String listaEmail) {
        super(titlu, obiectiv, fonduri, manager);
        this.listaEmail = listaEmail;
    }

    @Override
    public double calculeazaRisc() {
        if (fonduri == 0) return Double.MAX_VALUE;
        return (double) getNumarMembri() / fonduri;
    }
}