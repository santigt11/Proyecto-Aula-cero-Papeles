package vista;

import controlador.AsignaturaControl;
import controlador.TDA.listas.Exception.EmptyException;
import java.awt.Color;
import javax.swing.JOptionPane;

public class FrmAsignatura extends javax.swing.JFrame {
    
    int xMouse, yMouse;
    
    private AsignaturaControl asignaturaControl = new AsignaturaControl();
    private controlador.Academico.AsignaturaArchivos control = new controlador.Academico.AsignaturaArchivos();
    
    public Boolean verificar() {
        return (!txtNombreAsg.getText().trim().isEmpty()
                && !txtCodigoAsg.getText().trim().isEmpty()
                && !spnHorasAsg.getValue().toString().trim().isEmpty());
    }

    private void guardar() throws EmptyException {
        if (verificar()) {
            if(control.buscarCodigo(txtCodigoAsg.getText()) == false){
                asignaturaControl.getAsignatura().setNombre(txtNombreAsg.getText());
                asignaturaControl.getAsignatura().setCodigo(txtCodigoAsg.getText());
                asignaturaControl.getAsignatura().setTotalHoras((Integer) spnHorasAsg.getValue());
                
                if (asignaturaControl.guardar()) {
                    control.persist(asignaturaControl.getAsignatura());
                    JOptionPane.showMessageDialog(null, "Asignatura guardada");
                    limpiar();
                    asignaturaControl.setAsignatura(null);
                } else {
                    JOptionPane.showMessageDialog(null, "No se pudo guardar, hubo un error");
                }
            }else {
                JOptionPane.showMessageDialog(null, "El codigo de la asignatura ya existe");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Falta llenar campos", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private void limpiar() {
        txtNombreAsg.setText("");
        txtCodigoAsg.setText("");
        spnHorasAsg.setValue(0);
        asignaturaControl.setAsignatura(null);
    }

    /**
     * Creates new form FrmAsignatura
     */
    public FrmAsignatura() {
        initComponents();
        this.setLocationRelativeTo(null);
        limpiar();
        this.setDefaultCloseOperation(HIDE_ON_CLOSE);
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btCrearAsignatura = new javax.swing.JButton();
        txtCodigoAsg = new javax.swing.JTextField();
        txtNombreAsg = new javax.swing.JTextField();
        spnHorasAsg = new javax.swing.JSpinner();
        plSlide = new javax.swing.JPanel();
        plClose = new javax.swing.JPanel();
        X = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setForeground(new java.awt.Color(0, 0, 0));
        setUndecorated(true);
        setResizable(false);
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                formMouseEntered(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Nueva Asignatura");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Nombre:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Codigo:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("Total de Horas:");

        btCrearAsignatura.setText("Crear Asignatura");
        btCrearAsignatura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCrearAsignaturaActionPerformed(evt);
            }
        });

        plSlide.setBackground(new java.awt.Color(255, 255, 255));
        plSlide.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                plSlideMouseDragged(evt);
            }
        });
        plSlide.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                plSlideMouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                plSlideMousePressed(evt);
            }
        });

        plClose.setBackground(new java.awt.Color(255, 255, 255));
        plClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                plCloseMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                plCloseMouseExited(evt);
            }
        });

        X.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        X.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        X.setText("X");
        X.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        X.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        X.setPreferredSize(new java.awt.Dimension(20, 20));
        X.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                XMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                XMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                XMouseExited(evt);
            }
        });

        javax.swing.GroupLayout plCloseLayout = new javax.swing.GroupLayout(plClose);
        plClose.setLayout(plCloseLayout);
        plCloseLayout.setHorizontalGroup(
            plCloseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, plCloseLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(X, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        plCloseLayout.setVerticalGroup(
            plCloseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, plCloseLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(X, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout plSlideLayout = new javax.swing.GroupLayout(plSlide);
        plSlide.setLayout(plSlideLayout);
        plSlideLayout.setHorizontalGroup(
            plSlideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, plSlideLayout.createSequentialGroup()
                .addGap(0, 350, Short.MAX_VALUE)
                .addComponent(plClose, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        plSlideLayout.setVerticalGroup(
            plSlideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(plClose, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(plSlide, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(34, 34, 34)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel3)
                        .addComponent(jLabel2)
                        .addComponent(jLabel4))
                    .addGap(18, 18, 18)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtCodigoAsg, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtNombreAsg, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btCrearAsignatura)
                                .addComponent(spnHorasAsg, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addGap(0, 0, Short.MAX_VALUE)))
                    .addGap(258, 258, 258)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(plSlide, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(219, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(32, 32, 32)
                    .addComponent(jLabel1)
                    .addGap(18, 18, 18)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(txtNombreAsg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(txtCodigoAsg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(spnHorasAsg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4))
                    .addGap(18, 18, 18)
                    .addComponent(btCrearAsignatura)
                    .addContainerGap(14, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 371, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btCrearAsignaturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCrearAsignaturaActionPerformed
        try {
            guardar();
        } catch (EmptyException ex) {
            System.out.println(ex.getMessage());
        }
    }//GEN-LAST:event_btCrearAsignaturaActionPerformed

    private void plSlideMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_plSlideMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_plSlideMousePressed

    private void plSlideMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_plSlideMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_plSlideMouseDragged

    private void XMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_XMouseClicked
        dispose();
    }//GEN-LAST:event_XMouseClicked

    private void XMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_XMouseEntered
        plClose.setBackground(Color.red);
    }//GEN-LAST:event_XMouseEntered

    private void XMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_XMouseExited
        plClose.setBackground(Color.white);
    }//GEN-LAST:event_XMouseExited

    private void plCloseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_plCloseMouseEntered
        
    }//GEN-LAST:event_plCloseMouseEntered

    private void plCloseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_plCloseMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_plCloseMouseExited

    private void plSlideMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_plSlideMouseEntered
        plClose.setBackground(Color.white);
    }//GEN-LAST:event_plSlideMouseEntered

    private void formMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseEntered
        plClose.setBackground(Color.white);
    }//GEN-LAST:event_formMouseEntered

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
            java.util.logging.Logger.getLogger(FrmAsignatura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmAsignatura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmAsignatura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmAsignatura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmAsignatura().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel X;
    private javax.swing.JButton btCrearAsignatura;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel plClose;
    private javax.swing.JPanel plSlide;
    private javax.swing.JSpinner spnHorasAsg;
    private javax.swing.JTextField txtCodigoAsg;
    private javax.swing.JTextField txtNombreAsg;
    // End of variables declaration//GEN-END:variables
}
