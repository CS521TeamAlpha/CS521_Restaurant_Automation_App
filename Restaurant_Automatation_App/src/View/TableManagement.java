/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;
import Controller.Controller;
/**
 *
 * @author Owner
 */
public class TableManagement extends javax.swing.JFrame {

    private String tableSelected;
    private String serverSelected;
    private Controller controller;
    

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
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        TableManagement = new javax.swing.JComboBox<>();
        updateTableStatus = new javax.swing.JButton();
        exit = new javax.swing.JButton();
        selectServer = new javax.swing.JComboBox<>();
        updateServer = new javax.swing.JButton();
        enterOrder = new javax.swing.JButton();

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/restaurant3.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        jLabel1.setOpaque(true);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/restaurant3.jpg"))); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

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
        exit.setFont(new java.awt.Font("French Script MT", 1, 24)); // NOI18N
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
        enterOrder.setFont(new java.awt.Font("French Script MT", 1, 24)); // NOI18N
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
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(122, 122, 122))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(TableManagement, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(updateTableStatus))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(selectServer, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(updateServer, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(enterOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 28, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(updateTableStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(TableManagement))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(selectServer)
                    .addComponent(updateServer))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(enterOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(144, 144, 144)
                .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
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
   
        controller.updateTableStatus(tableSelected, status); 
    }//GEN-LAST:event_updateTableStatusActionPerformed

    private void selectServerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectServerActionPerformed
      
    }//GEN-LAST:event_selectServerActionPerformed

    private void updateServerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateServerActionPerformed
       String tableServer = selectServer.getSelectedItem().toString();
        controller.updateServer(tableSelected, tableServer);
    }//GEN-LAST:event_updateServerActionPerformed

    private void enterOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterOrderActionPerformed
      controller.enterOrder();
    }//GEN-LAST:event_enterOrderActionPerformed

    /**
     * @param args the command line arguments
     */
   


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> TableManagement;
    private javax.swing.JButton enterOrder;
    private javax.swing.JButton exit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> selectServer;
    private javax.swing.JButton updateServer;
    private javax.swing.JButton updateTableStatus;
    // End of variables declaration//GEN-END:variables
}
