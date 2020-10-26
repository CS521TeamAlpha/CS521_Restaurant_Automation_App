/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Owner
 */
public class MainImage extends javax.swing.JFrame {

    /**
     * Creates new form MainImage
     */
    public MainImage() {
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

        applicationTitleLabel = new javax.swing.JLabel();
        managerLoginButton = new javax.swing.JButton();
        hostessLoginButton = new javax.swing.JButton();
        serverLoginButton = new javax.swing.JButton();
        kitchenLoginButton = new javax.swing.JButton();
        busserLoginButton = new javax.swing.JButton();
        timeCardButton = new javax.swing.JButton();
        backgroundImage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(2310, 1704));
        setPreferredSize(new java.awt.Dimension(2000, 1700));
        getContentPane().setLayout(null);

        applicationTitleLabel.setBackground(new java.awt.Color(51, 51, 0));
        applicationTitleLabel.setFont(new java.awt.Font("Jokerman", 1, 48)); // NOI18N
        applicationTitleLabel.setForeground(new java.awt.Color(255, 255, 0));
        applicationTitleLabel.setText("                                   CS521 Restaurant Automation App");
        getContentPane().add(applicationTitleLabel);
        applicationTitleLabel.setBounds(0, 110, 2270, 150);

        managerLoginButton.setBackground(new java.awt.Color(0, 0, 0));
        managerLoginButton.setFont(new java.awt.Font("French Script MT", 0, 48)); // NOI18N
        managerLoginButton.setForeground(new java.awt.Color(255, 255, 0));
        managerLoginButton.setText("Manager");
        managerLoginButton.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 0)));
        managerLoginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                managerLoginButtonActionPerformed(evt);
            }
        });
        getContentPane().add(managerLoginButton);
        managerLoginButton.setBounds(310, 330, 260, 170);

        hostessLoginButton.setBackground(new java.awt.Color(0, 0, 0));
        hostessLoginButton.setFont(new java.awt.Font("French Script MT", 0, 48)); // NOI18N
        hostessLoginButton.setForeground(new java.awt.Color(255, 255, 0));
        hostessLoginButton.setText("Hostess");
        hostessLoginButton.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 0)));
        getContentPane().add(hostessLoginButton);
        hostessLoginButton.setBounds(680, 330, 260, 170);

        serverLoginButton.setBackground(new java.awt.Color(0, 0, 0));
        serverLoginButton.setFont(new java.awt.Font("French Script MT", 0, 48)); // NOI18N
        serverLoginButton.setForeground(new java.awt.Color(255, 255, 0));
        serverLoginButton.setText("Server");
        serverLoginButton.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 0)));
        getContentPane().add(serverLoginButton);
        serverLoginButton.setBounds(1050, 330, 260, 170);

        kitchenLoginButton.setBackground(new java.awt.Color(0, 0, 0));
        kitchenLoginButton.setFont(new java.awt.Font("French Script MT", 0, 48)); // NOI18N
        kitchenLoginButton.setForeground(new java.awt.Color(255, 255, 0));
        kitchenLoginButton.setText("Kitchen");
        kitchenLoginButton.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 0)));
        getContentPane().add(kitchenLoginButton);
        kitchenLoginButton.setBounds(1410, 330, 260, 170);

        busserLoginButton.setBackground(new java.awt.Color(0, 0, 0));
        busserLoginButton.setFont(new java.awt.Font("French Script MT", 0, 48)); // NOI18N
        busserLoginButton.setForeground(new java.awt.Color(255, 255, 0));
        busserLoginButton.setText("Busser");
        busserLoginButton.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 0)));
        getContentPane().add(busserLoginButton);
        busserLoginButton.setBounds(680, 590, 260, 170);

        timeCardButton.setBackground(new java.awt.Color(0, 0, 0));
        timeCardButton.setFont(new java.awt.Font("French Script MT", 0, 48)); // NOI18N
        timeCardButton.setForeground(new java.awt.Color(255, 255, 0));
        timeCardButton.setText("Time Card");
        timeCardButton.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 0)));
        getContentPane().add(timeCardButton);
        timeCardButton.setBounds(1050, 590, 260, 170);

        backgroundImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/restaurant-1233046.jpg"))); // NOI18N
        backgroundImage.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 0)));
        backgroundImage.setOpaque(true);
        backgroundImage.setPreferredSize(new java.awt.Dimension(2000, 1700));
        getContentPane().add(backgroundImage);
        backgroundImage.setBounds(0, -130, 2270, 1690);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void managerLoginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_managerLoginButtonActionPerformed
        managerLoginButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                
            }
        });
    }//GEN-LAST:event_managerLoginButtonActionPerformed

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
            java.util.logging.Logger.getLogger(MainImage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainImage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainImage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainImage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainImage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel applicationTitleLabel;
    private javax.swing.JLabel backgroundImage;
    private javax.swing.JButton busserLoginButton;
    private javax.swing.JButton hostessLoginButton;
    private javax.swing.JButton kitchenLoginButton;
    private javax.swing.JButton managerLoginButton;
    private javax.swing.JButton serverLoginButton;
    private javax.swing.JButton timeCardButton;
    // End of variables declaration//GEN-END:variables
}
