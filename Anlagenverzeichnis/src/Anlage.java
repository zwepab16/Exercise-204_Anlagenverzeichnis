


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
    

    public void setBishND(double bishND) {
        if(bishND<=0){
            this.bishND = 0;
        }
        else{
            this.bishND = bishND;
        }
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
        return ak/nutzungsdauer*bishND;
    }

    public double getVorAFA() {
        return ak-bishAFA;
    }

    public double getAFAJahr() {
        return ak/nutzungsdauer;
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


