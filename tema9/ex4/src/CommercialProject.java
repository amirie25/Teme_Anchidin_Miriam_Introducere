public class CommercialProject extends Project {
    private String termenLimita;
    private long fonduriMarketing;
    private int numarEchipe;

    public CommercialProject(String titlu, String obiectiv, long fonduri, Programmer manager, String termenLimita, int numarEchipe) {
        super(titlu, obiectiv, fonduri, manager);
        this.termenLimita = termenLimita;
        this.numarEchipe = numarEchipe;
        this.fonduriMarketing = fonduri / 2;
    }

    @Override
    public double calculeazaRisc() {
        if (getNumarMembri() == 0) return Double.MAX_VALUE;
        return (numarEchipe * 3.0 / getNumarMembri()) / fonduri - fonduriMarketing;
    }
}