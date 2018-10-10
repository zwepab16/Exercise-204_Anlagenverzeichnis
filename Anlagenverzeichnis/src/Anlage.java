


public class Anlage {
    private int ak,nutzungsdauer;
    private double bishND,bishAFA,vorAFA,AFAJahr,buchwert;
    private double inbetriebnahme;
    private String bezeichung;

    public Anlage(int ak, int nutzungsdauer, Double inbetriebnahme, String bezeichung) {
        this.ak = ak;
        this.nutzungsdauer = nutzungsdauer;
        this.inbetriebnahme = inbetriebnahme;
        this.bezeichung = bezeichung;
    }
    public void berechne(){
        
        bishAFA=ak/nutzungsdauer*bishND;
        AFAJahr=ak/nutzungsdauer;   
        vorAFA=ak-bishAFA;
    }

    public void setBishND(double bishND) {
        this.bishND = bishND;
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

    public double getInbetriebnahme() {
        return inbetriebnahme;
    }

    public String getBezeichung() {
        return bezeichung;
    }

}


