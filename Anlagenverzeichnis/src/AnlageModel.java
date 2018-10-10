
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;



public class AnlageModel extends AbstractTableModel{
    private ArrayList<Anlage> list=new ArrayList();
    private static final String[] COLNAMES = {"Bezeichnung","AK","Inbetriebnahme","ND","bish. ND","AfA bisher","Wert vor ...","AfA d. J.","BW 31.12"};

    @Override
    public String getColumnName(int i) {
        return COLNAMES[i];
    }
    
    @Override
    public int getRowCount() {
        return list.size();
    }

    @Override
    public int getColumnCount() {
        return COLNAMES.length;
    }

    @Override
    public Object getValueAt(int i, int i1) {
        Anlage a = list.get(i);
            switch(i1){
                case 0:return a.getBezeichung();
                case 1:return a.getAk();
                case 2:return a.getInbetriebnahme();
                case 3:return a.getNutzungsdauer();
                case 4:return a.getBishND();
                case 5:return a.getBishAFA();
                case 6:return a.getVorAFA();
                case 7:return a.getAFAJahr();
                case 8:return a.getBuchwert();
                default:return "Empty";
            }
    }
    
    public void add(Anlage a){
        list.add(a);
        fireTableRowsInserted(list.size()-1, list.size()-1);
    }
    public void setBisherige(int i){
        for (Anlage anlage : list) {
         anlage.setBishND((double)i-anlage.getInbetriebnahme());
         anlage
        }
        fireTableDataChanged();
            
        }
    


}
