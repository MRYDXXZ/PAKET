/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.gui.logindanregist;

import static com.gui.logindanregist.register.email;
import static com.gui.logindanregist.register.nama;
import static com.gui.logindanregist.register.username;
import static com.gui.logindanregist.register.password;
import java.awt.Color;
import javax.swing.JOptionPane;
/**
 *
 * @author ASUS
 */
public class profil extends menu{

    /**
     * Creates new form profil
     */
    public profil() {
        initComponents();
         Color bg = new Color(128, 128, 128);
           getContentPane().setBackground(bg);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtusernameprofil = new javax.swing.JLabel();
        txtemailprofil = new javax.swing.JLabel();
        btnubahpassword = new javax.swing.JButton();
        btnubahprofil = new javax.swing.JButton();
        txtnamaprofil = new javax.swing.JLabel();
        namaprofil = new javax.swing.JLabel();
        usernameprofil = new javax.swing.JLabel();
        emailprofil = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtusernameprofil.setBackground(new java.awt.Color(204, 0, 0));
        txtusernameprofil.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                txtusernameprofilAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        txtemailprofil.setBackground(new java.awt.Color(204, 0, 0));
        txtemailprofil.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                txtemailprofilAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        btnubahpassword.setBackground(new java.awt.Color(102, 0, 0));
        btnubahpassword.setForeground(new java.awt.Color(255, 255, 255));
        btnubahpassword.setText("ubah password");
        btnubahpassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnubahpasswordActionPerformed(evt);
            }
        });

        btnubahprofil.setBackground(new java.awt.Color(102, 0, 0));
        btnubahprofil.setForeground(new java.awt.Color(255, 255, 255));
        btnubahprofil.setText("ubah profil");
        btnubahprofil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnubahprofilActionPerformed(evt);
            }
        });

        txtnamaprofil.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                txtnamaprofilAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        namaprofil.setFont(new java.awt.Font("Humnst777 BT", 0, 14)); // NOI18N
        namaprofil.setText("Nama :");

        usernameprofil.setFont(new java.awt.Font("Humnst777 BT", 0, 14)); // NOI18N
        usernameprofil.setText("Username :");

        emailprofil.setFont(new java.awt.Font("Humnst777 BT", 0, 14)); // NOI18N
        emailprofil.setText("Email :");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(emailprofil)
                            .addComponent(namaprofil))
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtemailprofil, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtnamaprofil, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnubahprofil)
                            .addComponent(usernameprofil))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(btnubahpassword))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtusernameprofil, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(namaprofil)
                        .addGap(28, 28, 28)
                        .addComponent(emailprofil))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtnamaprofil, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtemailprofil, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(usernameprofil)
                    .addComponent(txtusernameprofil, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnubahpassword)
                    .addComponent(btnubahprofil))
                .addContainerGap(72, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtusernameprofilAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_txtusernameprofilAncestorAdded
        // TODO add your handling code here:
        txtusernameprofil.setText(username);
    }//GEN-LAST:event_txtusernameprofilAncestorAdded

    private void txtemailprofilAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_txtemailprofilAncestorAdded
        // TODO add your handling code here:
        txtemailprofil.setText(email);
    }//GEN-LAST:event_txtemailprofilAncestorAdded

    private void btnubahpasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnubahpasswordActionPerformed
        // TODO add your handling code here:
        email = JOptionPane.showInputDialog(this, "Masukkan email qanda ");
        
        if ((email.equals(register.email))) {
            
            password = JOptionPane.showInputDialog(this, "masukkan password baru !");
        } else {
            JOptionPane.showMessageDialog(this, "password salah, pastikan sudah memasukkan isi dengan benar", "warning !", JOptionPane.WARNING_MESSAGE);
        }
       
    }//GEN-LAST:event_btnubahpasswordActionPerformed

    private void btnubahprofilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnubahprofilActionPerformed
        // TODO add your handling code here:
        dispose();
        
        ubah_profil ubahData = new ubah_profil();
        ubahData.setVisible(true);
        ubahData.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnubahprofilActionPerformed

    private void txtnamaprofilAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_txtnamaprofilAncestorAdded
        // TODO add your handling code here:
        txtnamaprofil.setText(nama);
    }//GEN-LAST:event_txtnamaprofilAncestorAdded

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
            java.util.logging.Logger.getLogger(profil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(profil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(profil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(profil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new profil().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnubahpassword;
    private javax.swing.JButton btnubahprofil;
    private javax.swing.JLabel emailprofil;
    private javax.swing.JLabel namaprofil;
    private javax.swing.JLabel txtemailprofil;
    private javax.swing.JLabel txtnamaprofil;
    private javax.swing.JLabel txtusernameprofil;
    private javax.swing.JLabel usernameprofil;
    // End of variables declaration//GEN-END:variables
}
