/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ActiveView;
import Controller.Controller;

/**
 *
 * @author Vaibhav T
 */
public class ManagerModule extends javax.swing.JFrame {
    private Controller controller;
    /**
     * Creates new form Managersmodule
     */
    public ManagerModule() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        employeeModule = new javax.swing.JButton();
        menuManaagementModule = new javax.swing.JButton();
        payrollModule = new javax.swing.JButton();
        reportsModule = new javax.swing.JButton();
        logoutButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Manager Module");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(10, 10, 10, 10, new java.awt.Color(0, 0, 0)));
        jPanel1.setForeground(new java.awt.Color(255, 255, 0));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/restaurant-1233046.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");

        employeeModule.setBackground(new java.awt.Color(0, 0, 0));
        employeeModule.setFont(new java.awt.Font("French Script MT", 1, 24)); // NOI18N
        employeeModule.setForeground(new java.awt.Color(255, 255, 0));
        employeeModule.setText("Employees");
        employeeModule.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 0)));
        employeeModule.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                employeeModuleActionPerformed(evt);
            }
        });

        menuManaagementModule.setBackground(new java.awt.Color(0, 0, 0));
        menuManaagementModule.setFont(new java.awt.Font("French Script MT", 1, 24)); // NOI18N
        menuManaagementModule.setForeground(new java.awt.Color(255, 255, 0));
        menuManaagementModule.setText("Menu Mangement");
        menuManaagementModule.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 0)));
        menuManaagementModule.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuManaagementModuleActionPerformed(evt);
            }
        });

        payrollModule.setBackground(new java.awt.Color(0, 0, 0));
        payrollModule.setFont(new java.awt.Font("French Script MT", 1, 24)); // NOI18N
        payrollModule.setForeground(new java.awt.Color(255, 255, 0));
        payrollModule.setText("Payroll");
        payrollModule.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 0)));
        payrollModule.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                payrollModuleActionPerformed(evt);
            }
        });

        reportsModule.setBackground(new java.awt.Color(0, 0, 0));
        reportsModule.setFont(new java.awt.Font("French Script MT", 1, 24)); // NOI18N
        reportsModule.setForeground(new java.awt.Color(255, 255, 0));
        reportsModule.setText("Reports");
        reportsModule.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 0)));
        reportsModule.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reportsModuleActionPerformed(evt);
            }
        });

        logoutButton.setBackground(new java.awt.Color(0, 0, 0));
        logoutButton.setFont(new java.awt.Font("French Script MT", 1, 24)); // NOI18N
        logoutButton.setForeground(new java.awt.Color(255, 255, 0));
        logoutButton.setText("Logout");
        logoutButton.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 0)));
        logoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(menuManaagementModule, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(82, 82, 82)
                .addComponent(logoutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(129, 129, 129))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(employeeModule, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addComponent(payrollModule, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61)
                .addComponent(reportsModule, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 428, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(reportsModule, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(payrollModule, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(employeeModule, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(menuManaagementModule, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(logoutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(59, 59, 59))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 464, Short.MAX_VALUE))
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

    private void payrollModuleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_payrollModuleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_payrollModuleActionPerformed

    private void employeeModuleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_employeeModuleActionPerformed
        controller.showAddEmployeeForm();
    }//GEN-LAST:event_employeeModuleActionPerformed

    private void reportsModuleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reportsModuleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_reportsModuleActionPerformed

    private void menuManaagementModuleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuManaagementModuleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuManaagementModuleActionPerformed

    private void logoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_logoutButtonActionPerformed

    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton employeeModule;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton logoutButton;
    private javax.swing.JButton menuManaagementModule;
    private javax.swing.JButton payrollModule;
    private javax.swing.JButton reportsModule;
    // End of variables declaration//GEN-END:variables
}
