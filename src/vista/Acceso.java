/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

import control.Acceso.ControlPersona;
import control.Acceso.ControlUsuario;
import controlador.DAO.Implements.ControlPersona;
import controlador.DAO.Implements.ControlUsuario;
import java.awt.Graphics;
import java.awt.Image;
import static java.lang.reflect.Array.set;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import modelo.Rol;

/**
 *
 * @author Usuario
 */
public class Acceso extends javax.swing.JFrame {

    /**
     * Creates new form Acceso
     */
    
    public Acceso() {
      
        initComponents();
        
    }
    private ControlPersona controlPersona=new ControlPersona();
    private ControlUsuario controlUsuario=new ControlUsuario();

    
    public Boolean verificar() {
        return (!txtNombreUsuario.getText().trim().isEmpty()
                && !txtContraseña.getText().trim().isEmpty());          
    }
    public void guardar(){
        if (verificar()) {
        String nombreUsuario = txtNombreUsuario.getText();
        String contraseña = txtContraseña.getText();

        ControlUsuario controlUsuario = new ControlUsuario();
        Rol usuarioRol = controlUsuario.autenticarse(nombreUsuario, contraseña);

        if (usuarioRol != null) {
            JOptionPane.showMessageDialog(null, "¡Inicio de sesión exitoso como " + usuarioRol + "!");
            
            limpiar();
        } else {
            JOptionPane.showMessageDialog(null, "Credenciales incorrectas",
                    "Error", JOptionPane.ERROR_MESSAGE);
        }
    } else {
        JOptionPane.showMessageDialog(null, "Falta llenar campos",
                "Error", JOptionPane.ERROR_MESSAGE);
    }
    }

    private void limpiar() {
        txtContraseña.setText("");
        txtNombreUsuario.setText("");
       
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
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        txtNombreUsuario = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnIniciar = new javax.swing.JButton();
        jCheckBox1 = new javax.swing.JCheckBox();
        btnRecuperarClave = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtContraseña = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/photo4987874516348807274.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 440, 470));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 6, 433, 475));

        jPanel3.setBackground(new java.awt.Color(153, 153, 153));
        jPanel3.setDoubleBuffered(false);
        jPanel3.setEnabled(false);
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(989, 423, -1, -1));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtNombreUsuario.setBackground(new java.awt.Color(255, 255, 204));
        txtNombreUsuario.setActionCommand("<Not Set>");
        txtNombreUsuario.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtNombreUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreUsuarioActionPerformed(evt);
            }
        });
        jPanel2.add(txtNombreUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 180, 290, 30));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Nombre del Usuario:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 150, -1, -1));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Contraseña:");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 230, -1, -1));

        jLabel3.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 0));
        jLabel3.setText("INICIAR SESÍON");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 80, -1, -1));

        btnIniciar.setBackground(new java.awt.Color(50, 40, 0));
        btnIniciar.setFont(new java.awt.Font("Bookman Old Style", 1, 14)); // NOI18N
        btnIniciar.setForeground(new java.awt.Color(255, 255, 255));
        btnIniciar.setText("Iniciar Sesion");
        btnIniciar.setToolTipText("");
        btnIniciar.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarActionPerformed(evt);
            }
        });
        jPanel2.add(btnIniciar, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 350, 199, 34));

        jCheckBox1.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jCheckBox1.setForeground(new java.awt.Color(0, 0, 0));
        jCheckBox1.setText("Recuérdame");
        jPanel2.add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 300, -1, -1));

        btnRecuperarClave.setBackground(new java.awt.Color(102, 102, 102));
        btnRecuperarClave.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnRecuperarClave.setForeground(new java.awt.Color(204, 204, 204));
        btnRecuperarClave.setText("Recuperar Contraseña");
        btnRecuperarClave.setBorder(null);
        jPanel2.add(btnRecuperarClave, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 410, 160, 23));
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(111, 51, -1, 133));
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, 220, 110));

        txtContraseña.setBackground(new java.awt.Color(255, 255, 204));
        txtContraseña.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.add(txtContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 258, 290, 30));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 0, 470, 480));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreUsuarioActionPerformed

    private void btnIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarActionPerformed
if (!txtNombreUsuario.getText().isEmpty() && !String.valueOf(txtContraseña.getPassword()).isEmpty()) {
            Rol rolUsuario = controlUsuario.autenticarse(txtNombreUsuario.getText(), String.valueOf(txtContraseña.getPassword()));
            if (rolUsuario != null) {
                if (rolUsuario == Rol.ADMINISTRADOR) {
                    //   rol de administrador
                    JOptionPane.showMessageDialog(this, "¡Inicio de sesión exitoso como ADMINISTRADOR!");
                } else if (rolUsuario == Rol.DOCENTE) {
                    // Acción para el rol de docente
                    JOptionPane.showMessageDialog(this, "¡Inicio de sesión exitoso como DOCENTE!");
                } else if (rolUsuario == Rol.ESTUDIANTE) {
                    // rol de estudiante
                    JOptionPane.showMessageDialog(this, "¡Inicio de sesión exitoso como ESTUDIANTE!");
                }
                limpiar();
            } else {
                JOptionPane.showMessageDialog(this, "Usuario o clave incorrectos");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Falta ingresar usuario o clave");
        }

    }//GEN-LAST:event_btnIniciarActionPerformed

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
            java.util.logging.Logger.getLogger(Acceso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Acceso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Acceso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Acceso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Acceso().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIniciar;
    private javax.swing.JButton btnRecuperarClave;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPasswordField txtContraseña;
    private javax.swing.JTextField txtNombreUsuario;
    // End of variables declaration//GEN-END:variables


}

