
import java.io.BufferedReader;
import java.io.FileReader;


public class AnlagenverzeichnisGUI extends javax.swing.JFrame {

    private AnlageModel model=new AnlageModel();
   
    public AnlagenverzeichnisGUI() {
        initComponents();
        befülle();
        jTable1.setModel(model);
        jTable1.setDefaultRenderer(Object.class, new AnlageTableRenderer());
        load();
    }
    public void befülle(){
       for(int i=2010;i<=2020;i++) cbJahr.addItem(""+i);
    }

    
    private void load(){
        try (BufferedReader br = new BufferedReader(new FileReader(".\\anlagenverzeichnis.csv"))) {
           
            String line = null;
            br.readLine();
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(";");
                System.out.println(Integer.parseInt(parts[1].replace(".","")));
                System.out.println(Double.parseDouble(parts[2].replace(",",".")));
                        model.add(new Anlage(Integer.parseInt(parts[1].replace(".","")),Double.parseDouble(parts[3].replace(",",".")), Double.parseDouble(parts[2].replace(",",".")), parts[0]));
                    }
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        model.setBisherigeND(Integer.parseInt(cbJahr.getSelectedItem().toString()));
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        cbJahr = new javax.swing.JComboBox<>();
        btUpdate = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Year");

        btUpdate.setText("Update Table");
        btUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btUpdateActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbJahr, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btUpdate)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 748, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbJahr, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 275, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btUpdateActionPerformed
     int i=Integer.parseInt(cbJahr.getSelectedItem().toString());


     model.setBisherigeND(i);

    


     model.setBisherigeND(i);

    }//GEN-LAST:event_btUpdateActionPerformed

   
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AnlagenverzeichnisGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btUpdate;
    private javax.swing.JComboBox<String> cbJahr;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
