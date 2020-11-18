/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;
import Controller.Controller;
import Model.Database;
import java.util.*;
import java.lang.StringBuilder;

/**
 *
 * @author Vaibhav T
 */
public class OrderEntryScreen extends javax.swing.JFrame {
    
    
    private ArrayList<String> seatOneArray = new ArrayList<>();
    private ArrayList<String> seatTwoArray = new ArrayList<>();
    private ArrayList<String> seatThreeArray = new ArrayList<>();
    private ArrayList<String> seatFourArray = new ArrayList<>();

    private Controller controller;
    StringBuilder order = new StringBuilder();
    private int activeSeat = 0; 
    private String selectedTable; 
    /**
     * Creates new form Orderenteringscreen
     */
    public OrderEntryScreen(Controller c, String t) {
        controller = c;
        selectedTable = t; 
        initComponents();
      
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel6 = new javax.swing.JPanel();
        seatTwo = new javax.swing.JButton();
        seatThree = new javax.swing.JButton();
        seatOne = new javax.swing.JButton();
        seatFour = new javax.swing.JButton();
        sendToKitchen = new javax.swing.JButton();
        payment = new javax.swing.JButton();
        save = new javax.swing.JButton();
        exit = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        Ticket = new javax.swing.JTextPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel6.setBackground(new java.awt.Color(0, 0, 0));
        jPanel6.setForeground(new java.awt.Color(255, 255, 0));

        seatTwo.setBackground(new java.awt.Color(255, 255, 0));
        seatTwo.setFont(new java.awt.Font("French Script MT", 1, 24)); // NOI18N
        seatTwo.setText("Seat Two");
        seatTwo.setBorder(new javax.swing.border.MatteBorder(null));
        seatTwo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seatTwoActionPerformed(evt);
            }
        });

        seatThree.setBackground(new java.awt.Color(255, 255, 0));
        seatThree.setFont(new java.awt.Font("French Script MT", 1, 24)); // NOI18N
        seatThree.setText("Seat Three");
        seatThree.setBorder(new javax.swing.border.MatteBorder(null));
        seatThree.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seatThreeActionPerformed(evt);
            }
        });

        seatOne.setBackground(new java.awt.Color(255, 255, 0));
        seatOne.setFont(new java.awt.Font("French Script MT", 1, 24)); // NOI18N
        seatOne.setText("Seat One");
        seatOne.setBorder(new javax.swing.border.MatteBorder(null));
        seatOne.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seatOneActionPerformed(evt);
            }
        });

        seatFour.setBackground(new java.awt.Color(255, 255, 0));
        seatFour.setFont(new java.awt.Font("French Script MT", 1, 24)); // NOI18N
        seatFour.setText("Seat Four");
        seatFour.setBorder(new javax.swing.border.MatteBorder(null));
        seatFour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seatFourActionPerformed(evt);
            }
        });

        sendToKitchen.setBackground(new java.awt.Color(255, 255, 0));
        sendToKitchen.setFont(new java.awt.Font("French Script MT", 1, 24)); // NOI18N
        sendToKitchen.setText("Send to Kitchen");
        sendToKitchen.setBorder(new javax.swing.border.MatteBorder(null));
        sendToKitchen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendToKitchenActionPerformed(evt);
            }
        });

        payment.setBackground(new java.awt.Color(255, 255, 0));
        payment.setFont(new java.awt.Font("French Script MT", 1, 24)); // NOI18N
        payment.setText("Payment");
        payment.setBorder(new javax.swing.border.MatteBorder(null));

        save.setBackground(new java.awt.Color(255, 255, 0));
        save.setFont(new java.awt.Font("French Script MT", 1, 24)); // NOI18N
        save.setText("Save");
        save.setBorder(new javax.swing.border.MatteBorder(null));

        exit.setBackground(new java.awt.Color(255, 255, 0));
        exit.setFont(new java.awt.Font("French Script MT", 1, 24)); // NOI18N
        exit.setText("Exit");
        exit.setBorder(new javax.swing.border.MatteBorder(null));

        Ticket.setBackground(new java.awt.Color(255, 255, 51));
        Ticket.setBorder(new javax.swing.border.MatteBorder(null));
        jScrollPane2.setViewportView(Ticket);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(save, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(85, 85, 85)
                        .addComponent(sendToKitchen, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(98, 98, 98)
                        .addComponent(payment, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addComponent(seatOne, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(138, 138, 138)
                        .addComponent(seatTwo, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(seatThree, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(131, 131, 131)
                        .addComponent(seatFour, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 908, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(seatTwo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(seatOne, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(seatThree, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(seatFour, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 412, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(save, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sendToKitchen, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(payment, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    public void setArrays(ArrayList<String> a, ArrayList<String> b, ArrayList<String> c, ArrayList<String> d){
        seatOneArray = a;
        seatTwoArray = b;
        seatThreeArray = c;
        seatFourArray = d; 
    }
    public ArrayList<String> getseatOneArray(){
        return seatOneArray;
    }
    public ArrayList<String> getseatTwoArray(){
        return seatTwoArray;
    }
    public ArrayList<String> getseatThreeArray(){
        return seatThreeArray;
    }
    public ArrayList<String> getseatFourArray(){
        return seatFourArray;
    }
    private void seatOneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seatOneActionPerformed
                 
        Map<String, String[]> hm = new HashMap<String, String[]>(); 
        hm = controller.getMenuItems(); 
        
        activeSeat = 1; 
        MenuList menu = new MenuList(hm, this);
        
        
        menu.setVisible(true);
        
        
      
    }//GEN-LAST:event_seatOneActionPerformed

    private void seatTwoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seatTwoActionPerformed
       
        Map<String, String[]> hm = new HashMap<String, String[]>(); 
        hm = controller.getMenuItems(); 
        
        activeSeat = 2; 
        
        MenuList menu = new MenuList(hm, this);
        
        
        menu.setVisible(true);
        
        
        
    }//GEN-LAST:event_seatTwoActionPerformed

    private void seatThreeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seatThreeActionPerformed
       
        Map<String, String[]> hm = new HashMap<String, String[]>(); 
        hm = controller.getMenuItems(); 
        
        activeSeat = 3; 
        MenuList menu = new MenuList(hm, this);
        
        
        menu.setVisible(true);
    }//GEN-LAST:event_seatThreeActionPerformed

    private void seatFourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seatFourActionPerformed
         
        Map<String, String[]> hm = new HashMap<String, String[]>(); 
        hm = controller.getMenuItems(); 
        
        activeSeat = 4; 
        MenuList menu = new MenuList(hm, this);
        
        
        menu.setVisible(true);
    }//GEN-LAST:event_seatFourActionPerformed

    private void sendToKitchenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendToKitchenActionPerformed
        // TODO add your handling code here:
        controller.sendOrderToKitchen(Ticket.getText(), selectedTable);
    }//GEN-LAST:event_sendToKitchenActionPerformed
    public void setText(String s){
        Ticket.setText(s);
    }
    public String getText(){
        return Ticket.getText();
    }
    public int getActiveSeat(){
        if(activeSeat == 0 || activeSeat > 4){
            return -1; 
        }
        return activeSeat; 
    }
    /**
     * @param args the command line arguments
     */
    
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextPane Ticket;
    private javax.swing.JButton exit;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton payment;
    private javax.swing.JButton save;
    private javax.swing.JButton seatFour;
    private javax.swing.JButton seatOne;
    private javax.swing.JButton seatThree;
    private javax.swing.JButton seatTwo;
    private javax.swing.JButton sendToKitchen;
    // End of variables declaration//GEN-END:variables
}
