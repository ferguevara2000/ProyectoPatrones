package Interfaz;

import PatronStrategy.Contexto;
import PatronStrategy.Persona;
import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame {

    public Login() {
        initComponents();
        setLocationRelativeTo(null);
    }

    private void registro() {
        Registro reg = new Registro();
        reg.setVisible(true);
        this.dispose();
    }

    private void login() {
        String user = jTxtUsuario.getText();
        String pass = jTxtPass.getText();
        InterfazChat chat = new InterfazChat(user);
        Contexto contexto = new Contexto(new Persona());
        Boolean valido = contexto.validarUser(user, pass);
        if (valido) {
            chat.setVisible(true);
            this.dispose();
        }else{
            JOptionPane.showMessageDialog(this, "Usuario o Contraseña Incorrectos");
            jTxtPass.setText(null);
            jTxtUsuario.setText(null);
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTxtUsuario = new javax.swing.JTextField();
        jTxtPass = new javax.swing.JPasswordField();
        jBtnIngreso = new javax.swing.JButton();
        jBtnRegistro = new javax.swing.JButton();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTxtUsuario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jTxtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 140, 310, 40));

        jTxtPass.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jTxtPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 240, 310, 30));

        jBtnIngreso.setBackground(new java.awt.Color(0, 0, 0));
        jBtnIngreso.setForeground(new java.awt.Color(255, 255, 255));
        jBtnIngreso.setText("Ingresar");
        jBtnIngreso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnIngresoActionPerformed(evt);
            }
        });
        getContentPane().add(jBtnIngreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 300, 110, 40));

        jBtnRegistro.setBackground(new java.awt.Color(0, 0, 0));
        jBtnRegistro.setForeground(new java.awt.Color(255, 255, 255));
        jBtnRegistro.setText("Registrarse");
        jBtnRegistro.setBorder(null);
        jBtnRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnRegistroActionPerformed(evt);
            }
        });
        getContentPane().add(jBtnRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 300, 110, 40));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Login.jpg"))); // NOI18N
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnIngresoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnIngresoActionPerformed
        login();
    }//GEN-LAST:event_jBtnIngresoActionPerformed

    private void jBtnRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnRegistroActionPerformed
        registro();
    }//GEN-LAST:event_jBtnRegistroActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel fondo;
    private javax.swing.JButton jBtnIngreso;
    private javax.swing.JButton jBtnRegistro;
    private javax.swing.JPasswordField jTxtPass;
    private javax.swing.JTextField jTxtUsuario;
    // End of variables declaration//GEN-END:variables
}
