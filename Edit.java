/*NAME:NG KE RONG*/
/*No.Matrik:271063*/

package internetgui;

import javax.swing.*;
import java.util.*;
import java.io.*;
import java.text.*;

public class Edit extends javax.swing.JFrame {
    

    ArrayList<Internet> internet;
    tmStreamyx wifi1 = new tmStreamyx();
    tmUnifi wifi2 = new tmUnifi();
    Time wifi3 = new Time();
    Celcom wifi4 = new Celcom();
    DecimalFormat formatter;
    
    public Edit() {
        
        initComponents();
        
        formatter = new DecimalFormat("#,###.00");
        internet = new ArrayList<Internet>();
        populateArrayList();
        
        String[] internetArray = new String[internet.size()];
        
        for ( int i = 0; i < internet.size(); i++){
            
            internetArray[i] = internet.get(i).getName() + ", " + internet.get(i).getTelNo() + ", " + internet.get(i).getAddress();
        }
        
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(internetArray));
        
        String[] wifiArray = new String[4];
        
            
        wifiArray[0] = wifi1.getName() + ", RM " + formatter.format(wifi1.getPrice()) + ", " + wifi1.getSpeed() + " mbps";
        wifiArray[1] = wifi2.getName() + ", RM " + formatter.format(wifi2.getPrice()) + ", " + wifi2.getSpeed() + " mbps";
        wifiArray[2] = wifi3.getName() + ", RM " + formatter.format(wifi3.getPrice()) + ", " + wifi3.getSpeed() + " mbps";
        wifiArray[3] = wifi4.getName() + ", RM " + formatter.format(wifi4.getPrice()) + ", " + wifi4.getSpeed() + " mbps";

        
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(wifiArray));
        
        jComboBox2.setSelectedIndex(0);
    }

    public void populateArrayList(){
      
     
        try{
            
            FileInputStream file = new FileInputStream("Internet.dat");
            ObjectInputStream inputFile = new ObjectInputStream(file);
            
            boolean endOfFile = false; 
            
            while (!endOfFile){
                
                try{
                    
                    internet.add((Internet)inputFile.readObject());
                }
                catch (EOFException e){
                    
                   endOfFile = true;
                }
                catch (Exception f){
                    
                    JOptionPane.showMessageDialog(null, f.getMessage());
                }
            }
            
            inputFile.close();
        }
        catch (IOException e){
            
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
    public void saveToFile(){
        
        try{
           
            FileOutputStream file = new FileOutputStream("Internet.dat");
            ObjectOutputStream outputFile = new ObjectOutputStream(file);
            
            for(int i = 0; i < internet.size(); i++){
                
                outputFile.writeObject(internet.get(i));
            }
            
            try(FileWriter Writer = new FileWriter("Internet.txt",false)) {
                
                    Writer.write(String.format(" %-20s%-20s%-20s%-20s%-20s%-20s%n%n","NAME","TEL.NO","ADDRESS","Internet","PRICE(RM)", "SPEED(mbps)"));
                    for(int i = 0; i < internet.size(); i++){
                        Writer.write(String.format(" %-20s%-20s%-20s%-20s%-20.2f%-20d%n%n", internet.get(i).getName(),internet.get(i).getTelNo(),internet.get(i).getAddress(),
                                        internet.get(i).getWifiName(),internet.get(i).getPrice(),internet.get(i).getSpeed()));
                    }
                    Writer.write("Thank you");
                    Writer.write("---------------------------------------------\n");
                    Writer.close();
        }catch(IOException e){
         
        }
            
            outputFile.close();
            
            JOptionPane.showMessageDialog(null, "Successfully saved");
            
        }
        catch (IOException e){
            
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
    public void saveToFileDelete(){
        
        try{
           
            FileOutputStream file = new FileOutputStream("Internet.dat");
            ObjectOutputStream outputFile = new ObjectOutputStream(file);
            
            for(int i = 0; i < internet.size(); i++){
                
                outputFile.writeObject(internet.get(i));
            }
            
            try(FileWriter Writer = new FileWriter("Internet.txt",false)) {
                
                    Writer.write(String.format(" %-20s%-20s%-20s%-20s%-20s%-20s%n%n","NAME","TEL.NO","ADDRESS","Internet","PRICE(RM)", "SPEED(mbps)"));
                    for(int i = 0; i < internet.size(); i++){
                        Writer.write(String.format(" %-20s%-20s%-20s%-20s%-20.2f%-20d%n%n", internet.get(i).getName(),internet.get(i).getTelNo(),internet.get(i).getAddress(),
                                        internet.get(i).getWifiName(),internet.get(i).getPrice(),internet.get(i).getSpeed()));
                    }
                    Writer.write("Thank you");
                    Writer.write("---------------------------------------------\n");
                    Writer.close();
        }catch(IOException e){
         
        }
            
            outputFile.close();
            
            JOptionPane.showMessageDialog(null, "Successfully deleted");
            
        }
        catch (IOException e){
            
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
   
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Internet System Edit Menu");

        jPanel1.setBackground(new java.awt.Color(236, 222, 236));

        jPanel2.setBackground(new java.awt.Color(204, 153, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Edit Internet Data");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(32, 32, 32))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 22)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 0, 204));
        jLabel2.setText("Search");

        jComboBox1.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 22)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 0, 204));
        jLabel3.setText("Name");

        jLabel4.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 22)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 0, 204));
        jLabel4.setText("Tel.No");

        jLabel5.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 22)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(153, 0, 204));
        jLabel5.setText("Address");

        jLabel6.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 22)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(153, 0, 204));
        jLabel6.setText("Choose Internet (if want to change)");

        jComboBox2.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });

        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jTextField2.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        jTextField3.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        jButton1.setBackground(new java.awt.Color(204, 153, 255));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Save");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(204, 153, 255));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Delete");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 22)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(153, 0, 153));
        jLabel7.setText("Internet");

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Monospaced", 0, 20)); // NOI18N
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(224, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(193, 193, 193))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(144, 144, 144)
                        .addComponent(jButton2)
                        .addGap(235, 235, 235))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(141, 141, 141)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jComboBox1, 0, 343, Short.MAX_VALUE)
                            .addComponent(jTextField1)
                            .addComponent(jTextField2)
                            .addComponent(jTextField3)
                            .addComponent(jScrollPane1))
                        .addGap(87, 87, 87))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(28, 28, 28))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        int selectedIndex = jComboBox1.getSelectedIndex();

        internet.remove(selectedIndex);

        saveToFileDelete();
       
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(jTextField1.getText().isEmpty() | jTextField2.getText().isEmpty() | jTextField3.getText().isEmpty()){

            JOptionPane.showMessageDialog(null,"Please enter all fields:");

        }
        else{

            int selectedIndex = jComboBox1.getSelectedIndex();
            internet.get(selectedIndex).setName(jTextField1.getText().trim());
            internet.get(selectedIndex).setTelNo(jTextField2.getText().trim());
            internet.get(selectedIndex).setAddress(jTextField3.getText().trim());

            String getWifiName = null;
            double getPrice = 0;
            int getSpeed = 0;
            
            if(jComboBox2.getSelectedIndex() == 0){
               getWifiName = wifi1.getName();
               getPrice = wifi1.getPrice();
               getSpeed = wifi1.getSpeed();
            }
            else if(jComboBox2.getSelectedIndex() == 1){
                    getWifiName = wifi2.getName();
                    getPrice = wifi2.getPrice();
                    getSpeed = wifi2.getSpeed();
                  }
                  else if(jComboBox2.getSelectedIndex() == 2){
                          getWifiName = wifi3.getName();
                          getPrice = wifi3.getPrice();
                          getSpeed = wifi3.getSpeed();
                        }
                        else if(jComboBox2.getSelectedIndex() == 3){
                                getWifiName = wifi4.getName();
                                getPrice = wifi4.getPrice();
                                getSpeed = wifi4.getSpeed();
                              }
            
            internet.get(selectedIndex).setWifiName(getWifiName);
            internet.get(selectedIndex).setPrice(getPrice);
            internet.get(selectedIndex).setSpeed(getSpeed);
                              

            saveToFile();
            
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        int selectedIndex = jComboBox1.getSelectedIndex();

        jTextField1.setText(internet.get(selectedIndex).getName());
        jTextField2.setText(internet.get(selectedIndex).getTelNo());
        jTextField3.setText(internet.get(selectedIndex).getAddress() + "");
        
        jTextArea1.setText(internet.get(selectedIndex).getWifiName() + "\nRM " + formatter.format(internet.get(selectedIndex).getPrice()) + "\n" + internet.get(selectedIndex).getSpeed() + " mbps");
        
                        
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Edit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Edit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Edit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Edit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Edit().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}
