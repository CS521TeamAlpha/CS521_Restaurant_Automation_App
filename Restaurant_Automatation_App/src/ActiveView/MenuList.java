/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ActiveView;

import java.util.*;
import java.lang.StringBuilder;

/**
 *
 * @author Owner
 */
public class MenuList extends javax.swing.JFrame {
    
    OrderEntryScreen OrderScreen; 
    StringBuilder menuItems = new StringBuilder();
    
    ArrayList<String> seatOne = new ArrayList<>();
    ArrayList<String> seatTwo = new ArrayList<>();
    ArrayList<String> seatThree = new ArrayList<>();
    ArrayList<String> seatFour = new ArrayList<>();
            
    /**
     * Creates new form MenuList
     */
    public MenuList() {
        initComponents();
        
        System.out.println("This should never be called... MenuList.java line 23ish");
    }
    public MenuList(Map<String, String[]> hm, OrderEntryScreen blah) {
        
        OrderScreen = blah;
       
        initComponents();
        
        sidesComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(hm.get("SIDES")));
        entreeComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(hm.get("ENTREES")));
        drinksComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(hm.get("DRINKS")));
        dessertsComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(hm.get("DESSERTS")));
        
        pullOrderArrays(); 
        
    }
    
    public void updateOrderReceipt(){
            
        String seatOneHeader = "Seat 1 \n ****************************************************************** \n";
        String seatOneOrder = ""; 

        for(int i = 0; i < seatOne.size(); i++){
            seatOneOrder += seatOne.get(i) + "\n"; 
        }
        
        
        String seatTwoHeader = "\nSeat 2 \n ****************************************************************** \n";
        String seatTwoOrder = ""; 

        for(int i = 0; i < seatTwo.size(); i++){
            seatTwoOrder += seatTwo.get(i) + "\n"; 
        }

        
        String seatThreeHeader = "\nSeat 3 \n ****************************************************************** \n";
        String seatThreeOrder = ""; 

        for(int i = 0; i < seatThree.size(); i++){
            seatThreeOrder += seatThree.get(i) + "\n"; 
        }

        
        String seatFourHeader = "\nSeat 4 \n ****************************************************************** \n";
        String seatFourOrder = ""; 

        for(int i = 0; i < seatFour.size(); i++){
            seatFourOrder += seatFour.get(i) + "\n"; 
        }
        String combinedReceipt = seatOneHeader + seatOneOrder + seatTwoHeader + seatTwoOrder + seatThreeHeader + seatThreeOrder + seatFourHeader + seatFourOrder; 
        OrderScreen.setText(combinedReceipt);
        
        updateOrderArrays(); 
        
    }
    
    public void updateOrderArrays(){
        
        OrderScreen.setArrays(seatOne, seatTwo, seatThree, seatFour); 
    }
    public void pullOrderArrays(){
        seatOne = OrderScreen.getseatOneArray();
        seatTwo = OrderScreen.getseatTwoArray();
        seatThree = OrderScreen.getseatThreeArray();
        seatFour = OrderScreen.getseatFourArray();
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
        sidesLabel = new javax.swing.JLabel();
        entreeLabel = new javax.swing.JLabel();
        dessertsLabel = new javax.swing.JLabel();
        drinksLabel = new javax.swing.JLabel();
        entreeComboBox = new javax.swing.JComboBox<>();
        sidesComboBox = new javax.swing.JComboBox<>();
        dessertsComboBox = new javax.swing.JComboBox<>();
        drinksComboBox = new javax.swing.JComboBox<>();
        addEntreeButton = new javax.swing.JButton();
        entreeLabel1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        dessertsModifierField = new javax.swing.JTextPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        entreeModifierField = new javax.swing.JTextPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        sidesModifierField = new javax.swing.JTextPane();
        jScrollPane4 = new javax.swing.JScrollPane();
        drinksModifierField = new javax.swing.JTextPane();
        addDessertsButton = new javax.swing.JButton();
        addSidesButton = new javax.swing.JButton();
        addDrinksButton = new javax.swing.JButton();
        exit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setForeground(new java.awt.Color(255, 255, 0));

        sidesLabel.setFont(new java.awt.Font("French Script MT", 1, 24)); // NOI18N
        sidesLabel.setForeground(new java.awt.Color(255, 255, 0));
        sidesLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sidesLabel.setText("Sides");
        sidesLabel.setBorder(new javax.swing.border.MatteBorder(null));

        entreeLabel.setFont(new java.awt.Font("French Script MT", 1, 24)); // NOI18N
        entreeLabel.setForeground(new java.awt.Color(255, 255, 0));
        entreeLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        entreeLabel.setText("Entree");
        entreeLabel.setBorder(new javax.swing.border.MatteBorder(null));

        dessertsLabel.setFont(new java.awt.Font("French Script MT", 1, 24)); // NOI18N
        dessertsLabel.setForeground(new java.awt.Color(255, 255, 0));
        dessertsLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dessertsLabel.setText("Desserts");
        dessertsLabel.setBorder(new javax.swing.border.MatteBorder(null));

        drinksLabel.setFont(new java.awt.Font("French Script MT", 1, 24)); // NOI18N
        drinksLabel.setForeground(new java.awt.Color(255, 255, 0));
        drinksLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        drinksLabel.setText("Drinks");
        drinksLabel.setBorder(new javax.swing.border.MatteBorder(null));

        addEntreeButton.setBackground(new java.awt.Color(255, 255, 0));
        addEntreeButton.setFont(new java.awt.Font("French Script MT", 1, 24)); // NOI18N
        addEntreeButton.setText("add");
        addEntreeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addEntreeButtonActionPerformed(evt);
            }
        });

        entreeLabel1.setFont(new java.awt.Font("French Script MT", 1, 24)); // NOI18N
        entreeLabel1.setForeground(new java.awt.Color(255, 255, 0));
        entreeLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        entreeLabel1.setText("Modifiers");
        entreeLabel1.setBorder(new javax.swing.border.MatteBorder(null));

        jLabel1.setFont(new java.awt.Font("French Script MT", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Modifiers");
        jLabel1.setBorder(new javax.swing.border.MatteBorder(null));

        jLabel2.setFont(new java.awt.Font("French Script MT", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Modifiers");
        jLabel2.setBorder(new javax.swing.border.MatteBorder(null));

        jLabel3.setFont(new java.awt.Font("French Script MT", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Modifiers");
        jLabel3.setBorder(new javax.swing.border.MatteBorder(null));

        dessertsModifierField.setBackground(new java.awt.Color(255, 255, 0));
        dessertsModifierField.setBorder(new javax.swing.border.MatteBorder(null));
        jScrollPane1.setViewportView(dessertsModifierField);

        entreeModifierField.setBackground(new java.awt.Color(255, 255, 0));
        entreeModifierField.setBorder(new javax.swing.border.MatteBorder(null));
        jScrollPane2.setViewportView(entreeModifierField);

        sidesModifierField.setBackground(new java.awt.Color(255, 255, 0));
        sidesModifierField.setBorder(new javax.swing.border.MatteBorder(null));
        jScrollPane3.setViewportView(sidesModifierField);

        drinksModifierField.setBackground(new java.awt.Color(255, 255, 0));
        drinksModifierField.setBorder(new javax.swing.border.MatteBorder(null));
        jScrollPane4.setViewportView(drinksModifierField);

        addDessertsButton.setBackground(new java.awt.Color(255, 255, 0));
        addDessertsButton.setFont(new java.awt.Font("French Script MT", 1, 24)); // NOI18N
        addDessertsButton.setText("add");
        addDessertsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addDessertsButtonActionPerformed(evt);
            }
        });

        addSidesButton.setBackground(new java.awt.Color(255, 255, 0));
        addSidesButton.setFont(new java.awt.Font("French Script MT", 1, 24)); // NOI18N
        addSidesButton.setText("add");
        addSidesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addSidesButtonActionPerformed(evt);
            }
        });

        addDrinksButton.setBackground(new java.awt.Color(255, 255, 0));
        addDrinksButton.setFont(new java.awt.Font("French Script MT", 1, 24)); // NOI18N
        addDrinksButton.setText("add");
        addDrinksButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addDrinksButtonActionPerformed(evt);
            }
        });

        exit.setBackground(new java.awt.Color(255, 255, 0));
        exit.setFont(new java.awt.Font("French Script MT", 1, 24)); // NOI18N
        exit.setText("Exit");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(entreeLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                    .addComponent(addEntreeButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(entreeComboBox, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(entreeLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2))
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(addSidesButton, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(sidesComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sidesLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(256, 256, 256)
                                        .addComponent(drinksComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGap(215, 215, 215)
                                        .addComponent(drinksLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 4, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(addDessertsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(dessertsComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(dessertsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(addDrinksButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(357, 357, 357))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(entreeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sidesLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dessertsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(drinksLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(entreeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sidesComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dessertsComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(drinksComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(entreeLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 223, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addEntreeButton)
                    .addComponent(addSidesButton)
                    .addComponent(addDessertsButton)
                    .addComponent(addDrinksButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void addEntreeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addEntreeButtonActionPerformed
        String s = ""; 
        s += String.valueOf(entreeComboBox.getSelectedItem());
        s += ", " + entreeModifierField.getText(); 
        entreeModifierField.setText(""); 
        
        if(OrderScreen.getActiveSeat() == -1){
            System.out.println("error, active seat did not update correctly. check orderentryscreen.java");
        }
        if(OrderScreen.getActiveSeat() == 1){seatOne.add(s);}
        if(OrderScreen.getActiveSeat() == 2){seatTwo.add(s);}
        if(OrderScreen.getActiveSeat() == 3){seatThree.add(s);}
        if(OrderScreen.getActiveSeat() == 4){seatFour.add(s);}
        updateOrderReceipt(); 
    }//GEN-LAST:event_addEntreeButtonActionPerformed

    private void addDessertsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addDessertsButtonActionPerformed
        String s = ""; 
        s += String.valueOf(dessertsComboBox.getSelectedItem());
        s += ", " + dessertsModifierField.getText();
        dessertsModifierField.setText(""); 
       
        if(OrderScreen.getActiveSeat() == -1){
            System.out.println("error, active seat did not update correctly. check orderentryscreen.java");
        }
        if(OrderScreen.getActiveSeat() == 1){seatOne.add(s);}
        if(OrderScreen.getActiveSeat() == 2){seatTwo.add(s);}
        if(OrderScreen.getActiveSeat() == 3){seatThree.add(s);}
        if(OrderScreen.getActiveSeat() == 4){seatFour.add(s);}
        updateOrderReceipt(); 
    }//GEN-LAST:event_addDessertsButtonActionPerformed

    private void addSidesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addSidesButtonActionPerformed
        String s = ""; 
        s += String.valueOf(sidesComboBox.getSelectedItem());
        s += ", " + sidesModifierField.getText();
        sidesModifierField.setText(""); 
       
        if(OrderScreen.getActiveSeat() == -1){
            System.out.println("error, active seat did not update correctly. check orderentryscreen.java");
        }
        if(OrderScreen.getActiveSeat() == 1){seatOne.add(s);}
        if(OrderScreen.getActiveSeat() == 2){seatTwo.add(s); }
        if(OrderScreen.getActiveSeat() == 3){seatThree.add(s);}
        if(OrderScreen.getActiveSeat() == 4){ seatFour.add(s);}
        updateOrderReceipt(); 
    }//GEN-LAST:event_addSidesButtonActionPerformed

    private void addDrinksButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addDrinksButtonActionPerformed
        String s = ""; 
        s += String.valueOf(drinksComboBox.getSelectedItem());
        s += ", " + drinksModifierField.getText();
        drinksModifierField.setText(""); 

        if(OrderScreen.getActiveSeat() == -1){
            System.out.println("error, active seat did not update correctly. check orderentryscreen.java");
        }
        if(OrderScreen.getActiveSeat() == 1){seatOne.add(s);}
        if(OrderScreen.getActiveSeat() == 2){seatTwo.add(s);}
        if(OrderScreen.getActiveSeat() == 3){seatThree.add(s);}
        if(OrderScreen.getActiveSeat() == 4){seatFour.add(s);}
        updateOrderReceipt(); 
    }//GEN-LAST:event_addDrinksButtonActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        
        this.dispose();
    }//GEN-LAST:event_exitActionPerformed

    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addDessertsButton;
    private javax.swing.JButton addDrinksButton;
    private javax.swing.JButton addEntreeButton;
    private javax.swing.JButton addSidesButton;
    private javax.swing.JComboBox<String> dessertsComboBox;
    private javax.swing.JLabel dessertsLabel;
    private javax.swing.JTextPane dessertsModifierField;
    private javax.swing.JComboBox<String> drinksComboBox;
    private javax.swing.JLabel drinksLabel;
    private javax.swing.JTextPane drinksModifierField;
    private javax.swing.JComboBox<String> entreeComboBox;
    private javax.swing.JLabel entreeLabel;
    private javax.swing.JLabel entreeLabel1;
    private javax.swing.JTextPane entreeModifierField;
    private javax.swing.JButton exit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JComboBox<String> sidesComboBox;
    private javax.swing.JLabel sidesLabel;
    private javax.swing.JTextPane sidesModifierField;
    // End of variables declaration//GEN-END:variables
}
