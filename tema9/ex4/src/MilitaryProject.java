public class MilitaryProject extends Project {
    private String termenLimita;
    private String parola;

    public MilitaryProject(String titlu, String obiectiv, long fonduri, Programmer manager, String termenLimita, String parola) {
        super(titlu, obiectiv, fonduri, manager);
        this.termenLimita = termenLimita;
        this.parola = parola;
    }

    @Override
    public double calculeazaRisc() {
        if (fonduri == 0 || parola.length() == 0) return Double.MAX_VALUE;
        return (double) getNumarMembri() / parola.length() / fonduri;
    }
}