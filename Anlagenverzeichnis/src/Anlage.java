
import java.time.LocalDate;



public class Anlage {
    private int ak,nutzungsdauer;
    private double bishND,bishAFA,vorAFA,AFAJahr,buchwert;
    private LocalDate inbetriebnahme;
    private String bezeichung;

    public Anlage(int ak, int nutzungsdauer, double bishND, double bishAFA, double vorAFA, double AFAJahr, double buchwert, LocalDate inbetriebnahme, String bezeichung) {
        this.ak = ak;
        this.nutzungsdauer = nutzungsdauer;
        this.bishND = bishND;
        this.bishAFA = bishAFA;
        this.vorAFA = vorAFA;
        this.AFAJahr = AFAJahr;
        this.buchwert = buchwert;
        this.inbetriebnahme = inbetriebnahme;
        this.bezeichung = bezeichung;
    }

    public void setAk(int ak) {
        this.ak = ak;
    }

    public void setNutzungsdauer(int nutzungsdauer) {
        this.nutzungsdauer = nutzungsdauer;
    }

    public void setBishND(double bishND) {
        this.bishND = bishND;
    }

    public void setBishAFA(double bishAFA) {
        this.bishAFA = bishAFA;
    }

    public void setVorAFA(double vorAFA) {
        this.vorAFA = vorAFA;
    }

    public void setAFAJahr(double AFAJahr) {
        this.AFAJahr = AFAJahr;
    }

    public void setBuchwert(double buchwert) {
        this.buchwert = buchwert;
    }

    public void setInbetriebnahme(LocalDate inbetriebnahme) {
        this.inbetriebnahme = inbetriebnahme;
    }

    public void setBezeichung(String bezeichung) {
        this.bezeichung = bezeichung;
    }

    public int getAk() {
        return ak;
    }

    public int getNutzungsdauer() {
        return nutzungsdauer;
    }

    public double getBishND() {
        return bishND;
    }

    public double getBishAFA() {
        return bishAFA;
    }

    public double getVorAFA() {
        return vorAFA;
    }

    public double getAFAJahr() {
        return AFAJahr;
    }

    public double getBuchwert() {
        return buchwert;
    }

    public LocalDate getInbetriebnahme() {
        return inbetriebnahme;
    }

    public String getBezeichung() {
        return bezeichung;
    }

}


