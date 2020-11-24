/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ActiveView;
import Controller.Controller;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.JOptionPane;
/**
 *
 * @author Owner
 */
public class TableManagement extends javax.swing.JFrame {

    private String tableSelected;
    private String serverSelected;
    private Controller controller;
    
    private String assignedServer;
    private String tableStatus;
    private String moduleClicked = ""; 
    

    /**
     * Creates new form TableManagement
     */
    public TableManagement() {
        initComponents();
    }
    public TableManagement(String tableSelected, Controller c){
        initComponents();
        controller = c;
        this.tableSelected = tableSelected;
        
        String[] args = { "Person A", "PersonB", "Person C" };
        
        args = controller.getServerList(); 
        
        selectServer.setModel(new javax.swing.DefaultComboBoxModel<>(args));
        
        //selectServer.setSelectedIndex(1);
        
    }
    public TableManagement(String tableSelected, Controller c, String assignedServer, String tableStatus){
        initComponents();
        controller = c;
        this.tableSelected = tableSelected;
        this.assignedServer = assignedServer; 
        this.tableStatus = tableStatus; 
        
        String[] args = { "Person A", "PersonB", "Person C" };
        
        args = controller.getServerList(); 
        
        selectServer.setModel(new javax.swing.DefaultComboBoxModel<>(args));
        
        String [] statusList = new String[] { "Ready", "Dirty", "New Arrival", "Order In", "Order Ready" };
        
        TableManagement.setModel(new javax.swing.DefaultComboBoxModel<>(statusList));
        
        
        //System.out.println("Server: " + assignedServer + " Table status: " + tableStatus); 
        
        selectServer.setSelectedIndex(getServerIndex(assignedServer, args));
        TableManagement.setSelectedIndex(getStatusIndex(tableStatus, statusList));

        
    }
    
    public TableManagement(String tableSelected, Controller c, String assignedServer, String tableStatus, String s){
        initComponents();
        controller = c;
        this.tableSelected = tableSelected;
        this.assignedServer = assignedServer; 
        this.tableStatus = tableStatus; 
        
        String[] args = { "Person A", "PersonB", "Person C" };
        
        args = controller.getServerList(); 
        
        selectServer.setModel(new javax.swing.DefaultComboBoxModel<>(args));
        
        String [] statusList = new String[] { "Ready", "Dirty", "New Arrival", "Order In", "Order Ready" };
        
        TableManagement.setModel(new javax.swing.DefaultComboBoxModel<>(statusList));
        
        
        //System.out.println("Server: " + assignedServer + " Table status: " + tableStatus); 
        
        selectServer.setSelectedIndex(getServerIndex(assignedServer, args));
        TableManagement.setSelectedIndex(getStatusIndex(tableStatus, statusList));
        moduleClicked = s; 
        
    }
    
    
    private int getServerIndex(String name, String[] serverList){
        int index = Arrays.asList(serverList).indexOf(name);
        if(index == -1){
            return 0; 
        }
        return index;
    }
    private int getStatusIndex(String status, String[] statusList){
        for(int i = 0; i < statusList.length; i++){
            if(status.toUpperCase().equals(statusList[i].toUpperCase())){
                return i; 
            } 
        }
        return 0; 
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        TableManagement = new javax.swing.JComboBox<>();
        updateTableStatus = new javax.swing.JButton();
        exit = new javax.swing.JButton();
        selectServer = new javax.swing.JComboBox<>();
        updateServer = new javax.swing.JButton();
        enterOrder = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/restaurant-1233046.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 0)));
        jPanel1.setOpaque(false);

        TableManagement.setBackground(new java.awt.Color(255, 255, 0));
        TableManagement.setFont(new java.awt.Font("French Script MT", 1, 24)); // NOI18N
        TableManagement.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ready", "Dirty", "New Arrival", "Order In", "Order Ready" }));
        TableManagement.setBorder(new javax.swing.border.MatteBorder(null));
        TableManagement.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TableManagementActionPerformed(evt);
            }
        });

        updateTableStatus.setBackground(new java.awt.Color(0, 0, 0));
        updateTableStatus.setFont(new java.awt.Font("French Script MT", 1, 24)); // NOI18N
        updateTableStatus.setForeground(new java.awt.Color(255, 255, 0));
        updateTableStatus.setText("Update Table Status");
        updateTableStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateTableStatusActionPerformed(evt);
            }
        });

        exit.setBackground(new java.awt.Color(0, 0, 0));
        exit.setFont(new java.awt.Font("French Script MT", 1, 48)); // NOI18N
        exit.setForeground(new java.awt.Color(255, 255, 0));
        exit.setText("Exit");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });

        selectServer.setBackground(new java.awt.Color(255, 255, 0));
        selectServer.setFont(new java.awt.Font("French Script MT", 1, 24)); // NOI18N
        selectServer.setBorder(new javax.swing.border.MatteBorder(null));
        selectServer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectServerActionPerformed(evt);
            }
        });

        updateServer.setBackground(new java.awt.Color(0, 0, 0));
        updateServer.setFont(new java.awt.Font("French Script MT", 1, 24)); // NOI18N
        updateServer.setForeground(new java.awt.Color(255, 255, 0));
        updateServer.setText("Update Server");
        updateServer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateServerActionPerformed(evt);
            }
        });

        enterOrder.setBackground(new java.awt.Color(0, 0, 0));
        enterOrder.setFont(new java.awt.Font("French Script MT", 1, 40)); // NOI18N
        enterOrder.setForeground(new java.awt.Color(255, 255, 0));
        enterOrder.setText("Enter Order");
        enterOrder.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 0)));
        enterOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterOrderActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TableManagement, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(updateTableStatus, javax.swing.GroupLayout.DEFAULT_SIZE, 456, Short.MAX_VALUE)
                    .addComponent(enterOrder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(updateServer, javax.swing.GroupLayout.DEFAULT_SIZE, 444, Short.MAX_VALUE)
                    .addComponent(selectServer, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(exit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(updateTableStatus, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                    .addComponent(updateServer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(TableManagement, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
                    .addComponent(selectServer))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 179, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(enterOrder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(exit, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 948, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 657, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void TableManagementActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TableManagementActionPerformed
       
    }//GEN-LAST:event_TableManagementActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
       this.hide();
    }//GEN-LAST:event_exitActionPerformed

    private void updateTableStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateTableStatusActionPerformed
        // TODO add your handling code here:
        String status = TableManagement.getSelectedItem().toString();
        if(moduleClicked.equals("busser")){
            if(status.equals("Ready")){
                controller.updateTableStatus(tableSelected, status); 
            }
            else{
                //show message
                JOptionPane.showMessageDialog(null, "Busser is not allowed to make that change. Please try again from another module", "InfoBox: " + "Error Message", JOptionPane.INFORMATION_MESSAGE);
            }
        }else{
            controller.updateTableStatus(tableSelected, status); 
        }
        
    }//GEN-LAST:event_updateTableStatusActionPerformed

    private void selectServerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectServerActionPerformed
      
    }//GEN-LAST:event_selectServerActionPerformed

    private void updateServerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateServerActionPerformed
        String tableServer = selectServer.getSelectedItem().toString();
        
        if(moduleClicked.equals("busser")){
            JOptionPane.showMessageDialog(null, "Busser is not allowed to make that change. Please try again from another module", "InfoBox: " + "Error Message", JOptionPane.INFORMATION_MESSAGE);
        }else{
            controller.updateServer(tableSelected, tableServer);
        }
    }//GEN-LAST:event_updateServerActionPerformed

    private void enterOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterOrderActionPerformed
        
        if(moduleClicked.equals("server")){
            
            controller.enterOrder(tableSelected);
        
        }
        else{
            JOptionPane.showMessageDialog(null, moduleClicked + ": Access Denied. Please try again from another module", "InfoBox: " + "Error Message", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_enterOrderActionPerformed

    /**
     * @param args the command line arguments
     */
   


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> TableManagement;
    private javax.swing.JButton enterOrder;
    private javax.swing.JButton exit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> selectServer;
    private javax.swing.JButton updateServer;
    private javax.swing.JButton updateTableStatus;
    // End of variables declaration//GEN-END:variables
}
