/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class EmailValidation extends javax.swing.JFrame {

    /**
     * Creates new form EmailValidation
     */
    public EmailValidation() {
        initComponents();
    }
    
    private void reset(){
    
     txtEmail.setText(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panBack = new javax.swing.JPanel();
        lvlEmailValid = new javax.swing.JLabel();
        panLeft = new javax.swing.JPanel();
        lvlEmail = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        btnRese = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panBack.setBackground(new java.awt.Color(255, 255, 255));

        lvlEmailValid.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lvlEmailValid.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lvlEmailValid.setText("Email Validation");

        panLeft.setBackground(new java.awt.Color(102, 102, 255));

        javax.swing.GroupLayout panLeftLayout = new javax.swing.GroupLayout(panLeft);
        panLeft.setLayout(panLeftLayout);
        panLeftLayout.setHorizontalGroup(
            panLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 228, Short.MAX_VALUE)
        );
        panLeftLayout.setVerticalGroup(
            panLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        lvlEmail.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lvlEmail.setText("Email");

        txtEmail.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jButton2.setBackground(new java.awt.Color(102, 102, 255));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Check");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });

        btnRese.setBackground(new java.awt.Color(102, 102, 255));
        btnRese.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnRese.setForeground(new java.awt.Color(255, 255, 255));
        btnRese.setText("Reset");
        btnRese.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnReseMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panBackLayout = new javax.swing.GroupLayout(panBack);
        panBack.setLayout(panBackLayout);
        panBackLayout.setHorizontalGroup(
            panBackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panBackLayout.createSequentialGroup()
                .addComponent(panLeft, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(panBackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panBackLayout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(panBackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtEmail, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panBackLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                                .addComponent(lvlEmailValid, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lvlEmail, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(panBackLayout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnRese, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(71, 71, 71))
        );
        panBackLayout.setVerticalGroup(
            panBackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panBackLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(lvlEmailValid, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70)
                .addComponent(lvlEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 99, Short.MAX_VALUE)
                .addGroup(panBackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                    .addComponent(btnRese, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(87, 87, 87))
            .addComponent(panLeft, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getContentPane().add(panBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 590, 480));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        // TODO add your handling code here:
        String email = txtEmail.getText().trim();
        String pattern = "^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$";
        if (email.matches(pattern)) {
            JOptionPane.showMessageDialog(rootPane, "Email is Valid");
        } else {
            JOptionPane.showMessageDialog(rootPane, "Email is Invalid");
        }
                
    }//GEN-LAST:event_jButton2MouseClicked

    private void btnReseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReseMouseClicked
        // TODO add your handling code here:
        reset();
    }//GEN-LAST:event_btnReseMouseClicked

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
            java.util.logging.Logger.getLogger(EmailValidation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EmailValidation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EmailValidation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EmailValidation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EmailValidation().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRese;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel lvlEmail;
    private javax.swing.JLabel lvlEmailValid;
    private javax.swing.JPanel panBack;
    private javax.swing.JPanel panLeft;
    private javax.swing.JTextField txtEmail;
    // End of variables declaration//GEN-END:variables
}