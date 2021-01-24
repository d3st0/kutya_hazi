package kutyak;

/**
 *
 * @author Balogh Tibor
 */

public class kutyac {
    private String fajta;
    private String neme;
    private String kora;
    private String neve;

    public kutyac(String sor) {
        String[] dog = sor.split(";");
        this.fajta = dog[0];
        this.neme = dog[1];
        this.kora = dog[2];
        this.neve = dog[3];
    }

    public String getfajta() {
        return fajta;
    }

    public String getneme() {
        return neme;
    }

    public String getkora() {
        return kora;
    }

    public String getneve() {
        return neve;
    }

}
