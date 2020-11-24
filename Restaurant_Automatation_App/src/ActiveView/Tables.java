/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ActiveView;

import Controller.*;
import java.awt.*;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
//import javafx.scene.text.Text;

/**
 *
 * @author Owner
 */
public class Tables extends javax.swing.JPanel {
    private String tableSelected; 
    private String TOOL_TIP_TEXT_KEY = "Blah blah";
    private String moduleClicked = ""; 
   
    /**
     * Creates new form Tables
     */
    public Tables() {
        initComponents();
       
    }    
    public Tables(Controller c) {
        initComponents();
        controller = c; 
    }
    public Tables(Controller c, String s) {
        initComponents();
        controller = c; 
        moduleClicked = s; 
    }
    
    public void setTableServer(String selectedTable, String server){
        
        
        switch(selectedTable.toUpperCase()) {
            case "ONE":
                tableOneServer.setText(server);
                break;
            case "TWO":
                tableTwoServer.setText(server);
                break;
            case "THREE":
               tableThreeServer.setText(server);
                break;
            case "FOUR":
              tableFourServer.setText(server);
                break;
            case "FIVE":
              tableFiveServer.setText(server);
                break;
            case "SIX":
               tableSixServer.setText(server);
                break;
            case "SEVEN":
                tableSevenServer.setText(server);
                break;
            case "EIGHT":
               tableEightServer.setText(server);
                break;
            case "NINE":
                tableNineServer.setText(server);
                break;
            default:
              // code block
                System.out.println("Tables: Something has gone terribly wrong in the set color method, please contact support");
        }  
    }
    public void setTableColor(String selectedTable, Color c){
        
        
        switch(selectedTable.toUpperCase()) {
            case "ONE":
                tableOne.setBackground(c);
                break;
            case "TWO":
                tableTwo.setBackground(c);
                break;
            case "THREE":
                tableThree.setBackground(c);
                break;
            case "FOUR":
                tableFour.setBackground(c);
                break;
            case "FIVE":
                tableFive.setBackground(c);
                break;
            case "SIX":
                tableSix.setBackground(c);
                break;
            case "SEVEN":
                tableSeven.setBackground(c);
                break;
            case "EIGHT":
                tableEight.setBackground(c);
                break;
            case "NINE":
                tableNine.setBackground(c);
                break;
            default:
              // code block
                System.out.println("Tables: Something has gone terribly wrong in the set color method, please contact support");
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

        tableNineServer = new javax.swing.JLabel();
        tableOneServer = new javax.swing.JLabel();
        tableSixServer = new javax.swing.JLabel();
        tableFiveServer = new javax.swing.JLabel();
        tableTwoServer = new javax.swing.JLabel();
        tableThreeServer = new javax.swing.JLabel();
        tableFourServer = new javax.swing.JLabel();
        tableSevenServer = new javax.swing.JLabel();
        tableEightServer = new javax.swing.JLabel();
        applicationTitleLabel = new javax.swing.JLabel();
        tableOne = new javax.swing.JButton();
        tableTwo = new javax.swing.JButton();
        tableThree = new javax.swing.JButton();
        tableSix = new javax.swing.JButton();
        tableFive = new javax.swing.JButton();
        tableFour = new javax.swing.JButton();
        tableSeven = new javax.swing.JButton();
        tableEight = new javax.swing.JButton();
        tableNine = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(100, 100));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tableNineServer.setBackground(new java.awt.Color(0, 0, 0));
        tableNineServer.setForeground(new java.awt.Color(255, 255, 0));
        tableNineServer.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 0)));
        tableNineServer.setOpaque(true);
        add(tableNineServer, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 740, 180, 30));

        tableOneServer.setBackground(new java.awt.Color(0, 0, 0));
        tableOneServer.setForeground(new java.awt.Color(255, 255, 0));
        tableOneServer.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 0)));
        tableOneServer.setOpaque(true);
        add(tableOneServer, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 240, 180, 30));

        tableSixServer.setBackground(new java.awt.Color(0, 0, 0));
        tableSixServer.setForeground(new java.awt.Color(255, 255, 0));
        tableSixServer.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 0)));
        tableSixServer.setOpaque(true);
        add(tableSixServer, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 490, 180, 30));

        tableFiveServer.setBackground(new java.awt.Color(0, 0, 0));
        tableFiveServer.setForeground(new java.awt.Color(255, 255, 0));
        tableFiveServer.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 0)));
        tableFiveServer.setOpaque(true);
        add(tableFiveServer, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 490, 180, 30));

        tableTwoServer.setBackground(new java.awt.Color(0, 0, 0));
        tableTwoServer.setForeground(new java.awt.Color(255, 255, 0));
        tableTwoServer.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 0)));
        tableTwoServer.setOpaque(true);
        add(tableTwoServer, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 240, 180, 30));

        tableThreeServer.setBackground(new java.awt.Color(0, 0, 0));
        tableThreeServer.setForeground(new java.awt.Color(255, 255, 0));
        tableThreeServer.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 0)));
        tableThreeServer.setOpaque(true);
        add(tableThreeServer, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 240, 180, 30));

        tableFourServer.setBackground(new java.awt.Color(0, 0, 0));
        tableFourServer.setForeground(new java.awt.Color(255, 255, 0));
        tableFourServer.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 0)));
        tableFourServer.setOpaque(true);
        add(tableFourServer, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 490, 180, 30));

        tableSevenServer.setBackground(new java.awt.Color(0, 0, 0));
        tableSevenServer.setForeground(new java.awt.Color(255, 255, 0));
        tableSevenServer.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 0)));
        tableSevenServer.setOpaque(true);
        add(tableSevenServer, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 740, 180, 30));

        tableEightServer.setBackground(new java.awt.Color(0, 0, 0));
        tableEightServer.setForeground(new java.awt.Color(255, 255, 0));
        tableEightServer.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 0)));
        tableEightServer.setOpaque(true);
        add(tableEightServer, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 740, 180, 30));

        applicationTitleLabel.setBackground(new java.awt.Color(51, 51, 0));
        applicationTitleLabel.setFont(new java.awt.Font("Jokerman", 1, 48)); // NOI18N
        applicationTitleLabel.setForeground(new java.awt.Color(255, 255, 0));
        applicationTitleLabel.setText("  CS521 Restaurant Automation App");
        add(applicationTitleLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 850, -1, -1));

        tableOne.setBackground(new java.awt.Color(0, 204, 0));
        tableOne.setText("Table 1");
        tableOne.setBorder(javax.swing.BorderFactory.createMatteBorder(10, 10, 10, 10, new java.awt.Color(0, 0, 0)));
        tableOne.setPreferredSize(new java.awt.Dimension(300, 300));
        tableOne.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tableOneActionPerformed(evt);
            }
        });
        add(tableOne, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 40, 200, 200));

        tableTwo.setBackground(new java.awt.Color(0, 204, 0));
        tableTwo.setText("Table 2");
        tableTwo.setBorder(javax.swing.BorderFactory.createMatteBorder(10, 10, 10, 10, new java.awt.Color(0, 0, 0)));
        tableTwo.setPreferredSize(new java.awt.Dimension(300, 300));
        tableTwo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tableTwoActionPerformed(evt);
            }
        });
        add(tableTwo, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 40, 200, 200));

        tableThree.setBackground(new java.awt.Color(0, 204, 0));
        tableThree.setText("Table 3");
        tableThree.setBorder(javax.swing.BorderFactory.createMatteBorder(10, 10, 10, 10, new java.awt.Color(0, 0, 0)));
        tableThree.setPreferredSize(new java.awt.Dimension(300, 300));
        tableThree.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tableThreeActionPerformed(evt);
            }
        });
        add(tableThree, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 40, 200, 200));

        tableSix.setBackground(new java.awt.Color(0, 204, 0));
        tableSix.setText("Table 6");
        tableSix.setBorder(javax.swing.BorderFactory.createMatteBorder(10, 10, 10, 10, new java.awt.Color(0, 0, 0)));
        tableSix.setPreferredSize(new java.awt.Dimension(300, 300));
        tableSix.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tableSixActionPerformed(evt);
            }
        });
        add(tableSix, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 290, 200, 200));

        tableFive.setBackground(new java.awt.Color(0, 204, 0));
        tableFive.setText("Table 5");
        tableFive.setBorder(javax.swing.BorderFactory.createMatteBorder(10, 10, 10, 10, new java.awt.Color(0, 0, 0)));
        tableFive.setPreferredSize(new java.awt.Dimension(300, 300));
        tableFive.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tableFiveActionPerformed(evt);
            }
        });
        add(tableFive, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 290, 200, 200));

        tableFour.setBackground(new java.awt.Color(0, 204, 0));
        tableFour.setText("Table 4");
        tableFour.setBorder(javax.swing.BorderFactory.createMatteBorder(10, 10, 10, 10, new java.awt.Color(0, 0, 0)));
        tableFour.setPreferredSize(new java.awt.Dimension(300, 300));
        tableFour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tableFourActionPerformed(evt);
            }
        });
        add(tableFour, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 290, 200, 200));

        tableSeven.setBackground(new java.awt.Color(0, 204, 0));
        tableSeven.setText("Table 7");
        tableSeven.setBorder(javax.swing.BorderFactory.createMatteBorder(10, 10, 10, 10, new java.awt.Color(0, 0, 0)));
        tableSeven.setPreferredSize(new java.awt.Dimension(300, 300));
        tableSeven.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tableSevenActionPerformed(evt);
            }
        });
        add(tableSeven, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 540, 200, 200));

        tableEight.setBackground(new java.awt.Color(0, 204, 0));
        tableEight.setText("Table 8");
        tableEight.setBorder(javax.swing.BorderFactory.createMatteBorder(10, 10, 10, 10, new java.awt.Color(0, 0, 0)));
        tableEight.setPreferredSize(new java.awt.Dimension(300, 300));
        tableEight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tableEightActionPerformed(evt);
            }
        });
        add(tableEight, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 540, 200, 200));

        tableNine.setBackground(new java.awt.Color(0, 204, 0));
        tableNine.setText("Table 9");
        tableNine.setBorder(javax.swing.BorderFactory.createMatteBorder(10, 10, 10, 10, new java.awt.Color(0, 0, 0)));
        tableNine.setPreferredSize(new java.awt.Dimension(300, 300));
        tableNine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tableNineActionPerformed(evt);
            }
        });
        add(tableNine, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 540, 200, 200));

        jLabel1.setBackground(new java.awt.Color(51, 204, 0));
        jLabel1.setFont(new java.awt.Font("French Script MT", 0, 36)); // NOI18N
        jLabel1.setText("      Ready");
        jLabel1.setBorder(javax.swing.BorderFactory.createMatteBorder(10, 10, 10, 10, new java.awt.Color(0, 0, 0)));
        jLabel1.setOpaque(true);
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 780, 200, 50));

        jLabel2.setBackground(new java.awt.Color(204, 0, 204));
        jLabel2.setFont(new java.awt.Font("French Script MT", 0, 36)); // NOI18N
        jLabel2.setText("   Order Ready");
        jLabel2.setBorder(javax.swing.BorderFactory.createMatteBorder(10, 10, 10, 10, new java.awt.Color(0, 0, 0)));
        jLabel2.setOpaque(true);
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 780, 200, 50));

        jLabel4.setBackground(new java.awt.Color(0, 51, 204));
        jLabel4.setFont(new java.awt.Font("French Script MT", 0, 36)); // NOI18N
        jLabel4.setText("    Order In");
        jLabel4.setBorder(javax.swing.BorderFactory.createMatteBorder(10, 10, 10, 10, new java.awt.Color(0, 0, 0)));
        jLabel4.setOpaque(true);
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 840, 200, 50));

        jLabel5.setBackground(new java.awt.Color(255, 255, 51));
        jLabel5.setFont(new java.awt.Font("French Script MT", 0, 36)); // NOI18N
        jLabel5.setText("  New Arrival");
        jLabel5.setBorder(javax.swing.BorderFactory.createMatteBorder(10, 10, 10, 10, new java.awt.Color(0, 0, 0)));
        jLabel5.setOpaque(true);
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 780, 200, 50));

        jLabel6.setBackground(new java.awt.Color(255, 51, 51));
        jLabel6.setFont(new java.awt.Font("French Script MT", 0, 36)); // NOI18N
        jLabel6.setText("      Dirty");
        jLabel6.setBorder(javax.swing.BorderFactory.createMatteBorder(10, 10, 10, 10, new java.awt.Color(0, 0, 0)));
        jLabel6.setOpaque(true);
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 840, 200, 50));

        jLabel7.setBackground(new java.awt.Color(0, 0, 0));
        jLabel7.setForeground(new java.awt.Color(255, 255, 0));
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/restaurant3.jpg"))); // NOI18N
        jLabel7.setText("Exit");
        jLabel7.setOpaque(true);
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1480, 950));
    }// </editor-fold>//GEN-END:initComponents

    private void tableOneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tableOneActionPerformed
        if(moduleClicked.equals("kitchen")){
            controller.showKitchenOrderScreen("One"); 
        }else if(moduleClicked.equals("busser")){
            controller.showTableManagmentScreen("One", "busser"); 
        }else if(moduleClicked.equals("server")){
        
            controller.showTableManagmentScreen("One", "server"); 
        }
        else{
            controller.showTableManagmentScreen("One");
        }
        
    }//GEN-LAST:event_tableOneActionPerformed

    private void tableTwoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tableTwoActionPerformed
        if(moduleClicked.equals("kitchen")){
            controller.showKitchenOrderScreen("Two"); 
        }else if(moduleClicked.equals("busser")){
            controller.showTableManagmentScreen("Two", "busser"); 
        }else{
        controller.showTableManagmentScreen("Two");
        }
    }//GEN-LAST:event_tableTwoActionPerformed

    private void tableThreeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tableThreeActionPerformed
        if(moduleClicked.equals("kitchen")){
            controller.showKitchenOrderScreen("Three"); 
        }else if(moduleClicked.equals("busser")){
            controller.showTableManagmentScreen("Three", "busser"); 
        }else{
            controller.showTableManagmentScreen("Three");
        }
    }//GEN-LAST:event_tableThreeActionPerformed

    private void tableFourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tableFourActionPerformed
        if(moduleClicked.equals("kitchen")){
            controller.showKitchenOrderScreen("Four"); 
        }else if(moduleClicked.equals("busser")){
            controller.showTableManagmentScreen("Four", "busser"); 
        }else{
            controller.showTableManagmentScreen("Four");
        }
    }//GEN-LAST:event_tableFourActionPerformed

    private void tableFiveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tableFiveActionPerformed
        if(moduleClicked.equals("kitchen")){
            controller.showKitchenOrderScreen("Five"); 
        }else if(moduleClicked.equals("busser")){
            controller.showTableManagmentScreen("Five", "busser"); 
        }else{
            controller.showTableManagmentScreen("Five");
        }
    }//GEN-LAST:event_tableFiveActionPerformed

    private void tableSixActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tableSixActionPerformed
        if(moduleClicked.equals("kitchen")){
            controller.showKitchenOrderScreen("Six"); 
        }else if(moduleClicked.equals("busser")){
            controller.showTableManagmentScreen("Six", "busser"); 
        }else{
            controller.showTableManagmentScreen("Six");
        }
    }//GEN-LAST:event_tableSixActionPerformed

    private void tableSevenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tableSevenActionPerformed
        if(moduleClicked.equals("kitchen")){
            controller.showKitchenOrderScreen("Seven"); 
        }else if(moduleClicked.equals("busser")){
            controller.showTableManagmentScreen("Seven", "busser"); 
        }else{
        
            controller.showTableManagmentScreen("Seven");
        }
    }//GEN-LAST:event_tableSevenActionPerformed

    private void tableEightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tableEightActionPerformed
        if(moduleClicked.equals("kitchen")){
            controller.showKitchenOrderScreen("Eight"); 
        }else if(moduleClicked.equals("busser")){
            controller.showTableManagmentScreen("Eight", "busser"); 
        }else{
        
            controller.showTableManagmentScreen("Eight");
        }
    }//GEN-LAST:event_tableEightActionPerformed

    private void tableNineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tableNineActionPerformed
        if(moduleClicked.equals("kitchen")){
            controller.showKitchenOrderScreen("Nine"); 
        }else if(moduleClicked.equals("busser")){
            controller.showTableManagmentScreen("Nine", "busser"); 
        }else{
            controller.showTableManagmentScreen("Nine");
        }
    }//GEN-LAST:event_tableNineActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel applicationTitleLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JButton tableEight;
    public javax.swing.JLabel tableEightServer;
    private javax.swing.JButton tableFive;
    public javax.swing.JLabel tableFiveServer;
    private javax.swing.JButton tableFour;
    public javax.swing.JLabel tableFourServer;
    private javax.swing.JButton tableNine;
    public javax.swing.JLabel tableNineServer;
    private javax.swing.JButton tableOne;
    public javax.swing.JLabel tableOneServer;
    private javax.swing.JButton tableSeven;
    public javax.swing.JLabel tableSevenServer;
    private javax.swing.JButton tableSix;
    public javax.swing.JLabel tableSixServer;
    private javax.swing.JButton tableThree;
    public javax.swing.JLabel tableThreeServer;
    private javax.swing.JButton tableTwo;
    public javax.swing.JLabel tableTwoServer;
    // End of variables declaration//GEN-END:variables
    Controller controller; 

   
}
