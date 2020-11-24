/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ActiveView;

import Controller.Controller;
import java.awt.event.ActionListener;
import javax.swing.JButton;

/**
 *
 * @author Frums
 */
public class LoginScreen extends javax.swing.JFrame {

    /**
     * Creates new form LoginScreen
     */
    public LoginScreen() {
        initComponents();
        
    }
    public LoginScreen(String moduleClicked, Controller c) {
        initComponents();
        controller = c; 
        this.moduleClicked = moduleClicked; 
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        loginPadInput = new javax.swing.JTextField();
        inputKeyExit = new javax.swing.JButton();
        inputKeyEnter = new javax.swing.JButton();
        inputKeySeven = new javax.swing.JButton();
        inputKeyEight = new javax.swing.JButton();
        inputKeyNine = new javax.swing.JButton();
        inputKeyFour = new javax.swing.JButton();
        inputKeyFive = new javax.swing.JButton();
        inputKeySix = new javax.swing.JButton();
        inputKeyOne = new javax.swing.JButton();
        inputKeyTwo = new javax.swing.JButton();
        inputKeyThree = new javax.swing.JButton();
        inputKeyBackSpace = new javax.swing.JButton();
        inputKeyZero = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setForeground(new java.awt.Color(255, 255, 0));
        setMinimumSize(new java.awt.Dimension(450, 450));
        setResizable(false);
        setSize(new java.awt.Dimension(750, 550));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 0));
        jLabel2.setText("Enter Employee ID:");
        jLabel2.setPreferredSize(new java.awt.Dimension(141, 59));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 190, -1));

        loginPadInput.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        loginPadInput.setBorder(new javax.swing.border.MatteBorder(null));
        loginPadInput.setPreferredSize(new java.awt.Dimension(141, 59));
        loginPadInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginPadInputActionPerformed(evt);
            }
        });
        getContentPane().add(loginPadInput, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 10, 230, -1));

        inputKeyExit.setBackground(new java.awt.Color(0, 0, 0));
        inputKeyExit.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        inputKeyExit.setForeground(new java.awt.Color(255, 255, 0));
        inputKeyExit.setText("Exit");
        inputKeyExit.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 0)));
        inputKeyExit.setPreferredSize(new java.awt.Dimension(100, 100));
        inputKeyExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputKeyExitActionPerformed(evt);
            }
        });
        getContentPane().add(inputKeyExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 540, -1, -1));

        inputKeyEnter.setBackground(new java.awt.Color(0, 0, 0));
        inputKeyEnter.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        inputKeyEnter.setForeground(new java.awt.Color(255, 255, 0));
        inputKeyEnter.setText("Enter");
        inputKeyEnter.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 0)));
        inputKeyEnter.setPreferredSize(new java.awt.Dimension(100, 100));
        inputKeyEnter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputKeyEnterActionPerformed(evt);
            }
        });
        getContentPane().add(inputKeyEnter, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 430, -1, -1));

        inputKeySeven.setBackground(new java.awt.Color(0, 0, 0));
        inputKeySeven.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        inputKeySeven.setForeground(new java.awt.Color(255, 255, 0));
        inputKeySeven.setText("7");
        inputKeySeven.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 0)));
        inputKeySeven.setPreferredSize(new java.awt.Dimension(100, 100));
        inputKeySeven.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputKeySevenActionPerformed(evt);
            }
        });
        getContentPane().add(inputKeySeven, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, -1));

        inputKeyEight.setBackground(new java.awt.Color(0, 0, 0));
        inputKeyEight.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        inputKeyEight.setForeground(new java.awt.Color(255, 255, 0));
        inputKeyEight.setText("8");
        inputKeyEight.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 0)));
        inputKeyEight.setPreferredSize(new java.awt.Dimension(100, 100));
        inputKeyEight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputKeyEightActionPerformed(evt);
            }
        });
        getContentPane().add(inputKeyEight, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 100, -1, -1));

        inputKeyNine.setBackground(new java.awt.Color(0, 0, 0));
        inputKeyNine.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        inputKeyNine.setForeground(new java.awt.Color(255, 255, 0));
        inputKeyNine.setText("9");
        inputKeyNine.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 0)));
        inputKeyNine.setPreferredSize(new java.awt.Dimension(100, 100));
        inputKeyNine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputKeyNineActionPerformed(evt);
            }
        });
        getContentPane().add(inputKeyNine, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 100, -1, -1));

        inputKeyFour.setBackground(new java.awt.Color(0, 0, 0));
        inputKeyFour.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        inputKeyFour.setForeground(new java.awt.Color(255, 255, 0));
        inputKeyFour.setText("4");
        inputKeyFour.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 0)));
        inputKeyFour.setPreferredSize(new java.awt.Dimension(100, 100));
        inputKeyFour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputKeyFourActionPerformed(evt);
            }
        });
        getContentPane().add(inputKeyFour, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, -1, -1));

        inputKeyFive.setBackground(new java.awt.Color(0, 0, 0));
        inputKeyFive.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        inputKeyFive.setForeground(new java.awt.Color(255, 255, 0));
        inputKeyFive.setText("5");
        inputKeyFive.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 0)));
        inputKeyFive.setPreferredSize(new java.awt.Dimension(100, 100));
        inputKeyFive.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputKeyFiveActionPerformed(evt);
            }
        });
        getContentPane().add(inputKeyFive, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 210, -1, -1));

        inputKeySix.setBackground(new java.awt.Color(0, 0, 0));
        inputKeySix.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        inputKeySix.setForeground(new java.awt.Color(255, 255, 0));
        inputKeySix.setText("6");
        inputKeySix.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 0)));
        inputKeySix.setPreferredSize(new java.awt.Dimension(100, 100));
        inputKeySix.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputKeySixActionPerformed(evt);
            }
        });
        getContentPane().add(inputKeySix, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 210, -1, -1));

        inputKeyOne.setBackground(new java.awt.Color(0, 0, 0));
        inputKeyOne.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        inputKeyOne.setForeground(new java.awt.Color(255, 255, 0));
        inputKeyOne.setText("1");
        inputKeyOne.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 0)));
        inputKeyOne.setPreferredSize(new java.awt.Dimension(100, 100));
        inputKeyOne.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputKeyOneActionPerformed(evt);
            }
        });
        getContentPane().add(inputKeyOne, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, -1, -1));

        inputKeyTwo.setBackground(new java.awt.Color(0, 0, 0));
        inputKeyTwo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        inputKeyTwo.setForeground(new java.awt.Color(255, 255, 0));
        inputKeyTwo.setText("2");
        inputKeyTwo.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 0)));
        inputKeyTwo.setPreferredSize(new java.awt.Dimension(100, 100));
        inputKeyTwo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputKeyTwoActionPerformed(evt);
            }
        });
        getContentPane().add(inputKeyTwo, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 320, -1, -1));

        inputKeyThree.setBackground(new java.awt.Color(0, 0, 0));
        inputKeyThree.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        inputKeyThree.setForeground(new java.awt.Color(255, 255, 0));
        inputKeyThree.setText("3");
        inputKeyThree.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 0)));
        inputKeyThree.setPreferredSize(new java.awt.Dimension(100, 100));
        inputKeyThree.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputKeyThreeActionPerformed(evt);
            }
        });
        getContentPane().add(inputKeyThree, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 320, -1, -1));

        inputKeyBackSpace.setBackground(new java.awt.Color(0, 0, 0));
        inputKeyBackSpace.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        inputKeyBackSpace.setForeground(new java.awt.Color(255, 255, 0));
        inputKeyBackSpace.setText("Backspace");
        inputKeyBackSpace.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 0)));
        inputKeyBackSpace.setPreferredSize(new java.awt.Dimension(100, 100));
        inputKeyBackSpace.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputKeyBackSpaceActionPerformed(evt);
            }
        });
        getContentPane().add(inputKeyBackSpace, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 430, -1, -1));

        inputKeyZero.setBackground(new java.awt.Color(0, 0, 0));
        inputKeyZero.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        inputKeyZero.setForeground(new java.awt.Color(255, 255, 0));
        inputKeyZero.setText("0");
        inputKeyZero.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 0)));
        inputKeyZero.setPreferredSize(new java.awt.Dimension(100, 100));
        inputKeyZero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputKeyZeroActionPerformed(evt);
            }
        });
        getContentPane().add(inputKeyZero, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 430, -1, -1));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setAutoscrolls(true);
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 460, 650));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void loginPadInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginPadInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_loginPadInputActionPerformed

    private void inputKeyExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputKeyExitActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_inputKeyExitActionPerformed

    private void inputKeyEnterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputKeyEnterActionPerformed
        // TODO add your handling code here:
        controller.login(moduleClicked, loginPadInput.getText());
        controller.hideLoginScreen(); 
        
    }//GEN-LAST:event_inputKeyEnterActionPerformed

    private void inputKeySevenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputKeySevenActionPerformed
        // TODO add your handling code here:
        String currentText = loginPadInput.getText(); 
        loginPadInput.setText(currentText + "7");
    }//GEN-LAST:event_inputKeySevenActionPerformed

    private void inputKeyEightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputKeyEightActionPerformed
        // TODO add your handling code here:
        String currentText = loginPadInput.getText(); 
        loginPadInput.setText(currentText + "8");
    }//GEN-LAST:event_inputKeyEightActionPerformed

    private void inputKeyNineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputKeyNineActionPerformed
        // TODO add your handling code here:
        String currentText = loginPadInput.getText(); 
        loginPadInput.setText(currentText + "9");
    }//GEN-LAST:event_inputKeyNineActionPerformed

    private void inputKeyFourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputKeyFourActionPerformed
        // TODO add your handling code here:
        String currentText = loginPadInput.getText(); 
        loginPadInput.setText(currentText + "4");
    }//GEN-LAST:event_inputKeyFourActionPerformed

    private void inputKeyFiveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputKeyFiveActionPerformed
        // TODO add your handling code here:
        String currentText = loginPadInput.getText(); 
        loginPadInput.setText(currentText + "5");
    }//GEN-LAST:event_inputKeyFiveActionPerformed

    private void inputKeySixActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputKeySixActionPerformed
        // TODO add your handling code here:
        String currentText = loginPadInput.getText(); 
        loginPadInput.setText(currentText + "6");
    }//GEN-LAST:event_inputKeySixActionPerformed

    private void inputKeyOneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputKeyOneActionPerformed
        // TODO add your handling code here:
        String currentText = loginPadInput.getText(); 
        loginPadInput.setText(currentText + "1");
    }//GEN-LAST:event_inputKeyOneActionPerformed

    private void inputKeyTwoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputKeyTwoActionPerformed
        // TODO add your handling code here:
        String currentText = loginPadInput.getText(); 
        loginPadInput.setText(currentText + "2");
    }//GEN-LAST:event_inputKeyTwoActionPerformed

    private void inputKeyThreeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputKeyThreeActionPerformed
        // TODO add your handling code here:
        String currentText = loginPadInput.getText(); 
        loginPadInput.setText(currentText + "3");
    }//GEN-LAST:event_inputKeyThreeActionPerformed

    private void inputKeyBackSpaceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputKeyBackSpaceActionPerformed
        // TODO add your handling code here:
        String currentText = loginPadInput.getText(); 
        
        loginPadInput.setText(removeLastChar(currentText));
        
    }//GEN-LAST:event_inputKeyBackSpaceActionPerformed

    private void inputKeyZeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputKeyZeroActionPerformed
        // TODO add your handling code here:
        String currentText = loginPadInput.getText(); 
        loginPadInput.setText(currentText + "0");
    }//GEN-LAST:event_inputKeyZeroActionPerformed

    public JButton getButton(){
    
        return inputKeyOne; 
    }
    public String removeLastChar(String s) {
        //copy pasta from https://www.baeldung.com/java-remove-last-character-of-string :)
        return (s == null || s.length() == 0)
          ? null 
          : (s.substring(0, s.length() - 1));
    }
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
            java.util.logging.Logger.getLogger(LoginScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginScreen().setVisible(true);
            }
        });
    }
public void showLogin(){
   new LoginScreen().setVisible(true);
   
}
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton inputKeyBackSpace;
    private javax.swing.JButton inputKeyEight;
    private javax.swing.JButton inputKeyEnter;
    private javax.swing.JButton inputKeyExit;
    private javax.swing.JButton inputKeyFive;
    private javax.swing.JButton inputKeyFour;
    private javax.swing.JButton inputKeyNine;
    private javax.swing.JButton inputKeyOne;
    private javax.swing.JButton inputKeySeven;
    private javax.swing.JButton inputKeySix;
    private javax.swing.JButton inputKeyThree;
    private javax.swing.JButton inputKeyTwo;
    private javax.swing.JButton inputKeyZero;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField loginPadInput;
    // End of variables declaration//GEN-END:variables
    private String moduleClicked; 
    private Controller controller; 
    
}