


public class Anlage {
    private int ak;
    Double nutzungsdauer;
    private double bishND,bishAFA,vorAFA,AFAJahr,buchwert;
    private double inbetriebnahme;
    private String bezeichung;

    public Anlage(int ak, Double nutzungsdauer, Double inbetriebnahme, String bezeichung) {
        this.ak = ak;
        this.nutzungsdauer = nutzungsdauer;
        this.inbetriebnahme = inbetriebnahme;
        this.bezeichung = bezeichung;
      AFAJahr=  ak/nutzungsdauer;
       
    }
    public void berechne(){
      
          if(bishND>=nutzungsdauer){
          
              buchwert=0;
              bishAFA=ak;
              AFAJahr=0;
             
              if(bishND>=nutzungsdauer-1){
                   vorAFA=0;
              }
              
          }else{
       
          bishAFA=ak/nutzungsdauer*bishND;
        
          
        buchwert=ak-bishAFA-AFAJahr;
         vorAFA=buchwert+AFAJahr;
         
      
          }
          
        
    }
    

    public void setBishND(double bishND) {  
            this.bishND = bishND;
    }
   

    public int getAk() {
        return ak;
    }

    public Double getNutzungsdauer() {
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


