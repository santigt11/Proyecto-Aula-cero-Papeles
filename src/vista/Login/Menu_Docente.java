/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista.Login;

import java.awt.BorderLayout;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import modelo.Persona;

import vista.Tutorias.FrmGenerarInforme;
import modelo.Usuario;
import vista.CambiarClave;
import vista.Perfiles;

/**
 *
 * @author Usuario
 */
public class Menu_Docente extends javax.swing.JFrame {

    /**
     * Creates new form Menu_Docente
     */
    //variable global
    Usuario user;

    // constructor con parametros 
    public Menu_Docente(Usuario usuario,Persona persona) {
        initComponents();
        this.user = usuario;
        txtUsuario.setText(persona.getNombre()+""+persona.getApellido());
        jnombreUser.setText(persona.getNombre()+""+persona.getApellido());
           ImageIcon icono = new ImageIcon(getClass().getResource("/imagenes/FT.png"));
        FotoAdmin.setIcon(icono);
    }

    //constructor
    public Menu_Docente() {
        initComponents();
    }
       private void mostrarPerfiles(Usuario usuario, Persona persona) {
        Perfiles ventanaPerfil = new Perfiles(usuario, persona);

        // Hacer visible la ventana de perfil
        ventanaPerfil.setVisible(true);

    }

    private void mostrarClave(Usuario usuario, Persona persona) {
    CambiarClave VcambioClave = new CambiarClave(usuario, persona);
    VcambioClave.setVisible(true);
}


    private void mostrarGif() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1122, 670);

        // Crea un JLabel y carga el GIF
        ImageIcon gifIcon = new ImageIcon("src/imagenes/GIFMENU.gif"); // Reemplaza con la ruta de tu archivo GIF
        JLabel backgroundLabel = new JLabel(gifIcon);

        // Establece el layout del JFrame como BorderLayout
        setLayout(new BorderLayout());

        // Agrega el JLabel al fondo del JFrame
        getContentPane().add(backgroundLabel, BorderLayout.CENTER);

        // Hacer visible el JFrame
        setVisible(true);
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        TutoriasAgendadas = new org.edisoncor.gui.button.ButtonIcon();
        HorarioDocente = new org.edisoncor.gui.button.ButtonIcon();
        GenerarNuevaTuto = new org.edisoncor.gui.button.ButtonIcon();
        GenerarInformes = new org.edisoncor.gui.button.ButtonIcon();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel12 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        txtUsuario = new javax.swing.JLabel();
        FotoAdmin = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jnombreUser = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        PanelPrincipalDocente = new javax.swing.JPanel();
        PanelUsuarioO = new javax.swing.JPanel();
        bntPerfilUser = new javax.swing.JLabel();
        btnCambiarClave = new javax.swing.JLabel();
        btnCerrarSesion = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(102, 51, 0));

        TutoriasAgendadas.setBackground(new java.awt.Color(255, 250, 205));
        TutoriasAgendadas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/5116083.png"))); // NOI18N
        TutoriasAgendadas.setText("buttonIcon2");

        HorarioDocente.setBackground(new java.awt.Color(255, 250, 205));
        HorarioDocente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/images-removebg-preview(1).png"))); // NOI18N
        HorarioDocente.setText("buttonIcon2");
        HorarioDocente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HorarioDocenteActionPerformed(evt);
            }
        });

        GenerarNuevaTuto.setBackground(new java.awt.Color(255, 250, 205));
        GenerarNuevaTuto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Screenshot_2024-02-13_171755-removebg-preview(1).png"))); // NOI18N
        GenerarNuevaTuto.setText("buttonIcon2");
        GenerarNuevaTuto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GenerarNuevaTutoActionPerformed(evt);
            }
        });

        GenerarInformes.setBackground(new java.awt.Color(255, 250, 205));
        GenerarInformes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Screenshot_2024-02-13_172007-removebg-preview(1).png"))); // NOI18N
        GenerarInformes.setText("buttonIcon2");
        GenerarInformes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GenerarInformesActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Franklin Gothic Book", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 250, 205));
        jLabel1.setText("TUTORIAS ");

        jLabel2.setFont(new java.awt.Font("Franklin Gothic Book", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 250, 205));
        jLabel2.setText("AGENDADAS");

        jLabel3.setFont(new java.awt.Font("Franklin Gothic Book", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 250, 205));
        jLabel3.setText("GENERAR  NUEVA");

        jLabel4.setFont(new java.awt.Font("Franklin Gothic Book", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 250, 205));
        jLabel4.setText("TUTORIA");

        jLabel6.setFont(new java.awt.Font("Franklin Gothic Book", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 250, 205));
        jLabel6.setText("HORARIO");

        jLabel7.setFont(new java.awt.Font("Franklin Gothic Book", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 250, 205));
        jLabel7.setText("INFORMES");

        jLabel8.setFont(new java.awt.Font("Franklin Gothic Book", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 250, 205));
        jLabel8.setText("GENERAR ");

        jSeparator1.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel12.setBackground(new java.awt.Color(255, 250, 205));
        jLabel12.setFont(new java.awt.Font("Segoe UI Historic", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 250, 205));
        jLabel12.setText("SEAES");

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/image(4)(1).png"))); // NOI18N

        jSeparator2.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator2.setForeground(new java.awt.Color(255, 255, 255));

        txtUsuario.setBackground(new java.awt.Color(47, 30, 30));
        txtUsuario.setForeground(new java.awt.Color(255, 255, 255));
        txtUsuario.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        FotoAdmin.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addComponent(GenerarNuevaTuto, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(0, 0, Short.MAX_VALUE))))
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(HorarioDocente, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                .addComponent(TutoriasAgendadas, javax.swing.GroupLayout.PREFERRED_SIZE, 80, Short.MAX_VALUE))
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addGap(10, 10, 10)
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel1)))
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addComponent(GenerarInformes, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel8)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addGap(6, 6, 6)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(FotoAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(FotoAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addGap(12, 12, 12))
                    .addComponent(TutoriasAgendadas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(jLabel6)
                        .addGap(79, 79, 79)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addGap(19, 19, 19))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(HorarioDocente, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(GenerarNuevaTuto, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(GenerarInformes, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(25, 25, 25))
        );

        jPanel4.setBackground(new java.awt.Color(58, 39, 34));

        jnombreUser.setFont(new java.awt.Font("Franklin Gothic Book", 1, 14)); // NOI18N
        jnombreUser.setForeground(new java.awt.Color(255, 255, 255));
        jnombreUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/USU-removebg-preview(1).png"))); // NOI18N
        jnombreUser.setToolTipText("");
        jnombreUser.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jnombreUser.setEnabled(false);
        jnombreUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jnombreUserMouseClicked(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font("Franklin Gothic Book", 1, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/casa.png"))); // NOI18N
        jLabel20.setText("HOME");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 773, Short.MAX_VALUE)
                .addComponent(jnombreUser, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jnombreUser, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        PanelPrincipalDocente.setBackground(new java.awt.Color(255, 250, 205));

        PanelUsuarioO.setBackground(new java.awt.Color(102, 51, 0));

        bntPerfilUser.setFont(new java.awt.Font("Franklin Gothic Book", 1, 16)); // NOI18N
        bntPerfilUser.setForeground(new java.awt.Color(255, 255, 255));
        bntPerfilUser.setText("Perfil");
        bntPerfilUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bntPerfilUserMouseClicked(evt);
            }
        });

        btnCambiarClave.setFont(new java.awt.Font("Franklin Gothic Book", 1, 16)); // NOI18N
        btnCambiarClave.setForeground(new java.awt.Color(255, 255, 255));
        btnCambiarClave.setText("Cambiar Clave");
        btnCambiarClave.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCambiarClaveMouseClicked(evt);
            }
        });

        btnCerrarSesion.setFont(new java.awt.Font("Franklin Gothic Book", 1, 16)); // NOI18N
        btnCerrarSesion.setForeground(new java.awt.Color(255, 255, 255));
        btnCerrarSesion.setText("Cerrar Sesion");
        btnCerrarSesion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCerrarSesionMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout PanelUsuarioOLayout = new javax.swing.GroupLayout(PanelUsuarioO);
        PanelUsuarioO.setLayout(PanelUsuarioOLayout);
        PanelUsuarioOLayout.setHorizontalGroup(
            PanelUsuarioOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelUsuarioOLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(PanelUsuarioOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCerrarSesion)
                    .addComponent(btnCambiarClave)
                    .addComponent(bntPerfilUser))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        PanelUsuarioOLayout.setVerticalGroup(
            PanelUsuarioOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelUsuarioOLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(bntPerfilUser)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(btnCambiarClave)
                .addGap(28, 28, 28)
                .addComponent(btnCerrarSesion)
                .addGap(56, 56, 56))
        );

        javax.swing.GroupLayout PanelPrincipalDocenteLayout = new javax.swing.GroupLayout(PanelPrincipalDocente);
        PanelPrincipalDocente.setLayout(PanelPrincipalDocenteLayout);
        PanelPrincipalDocenteLayout.setHorizontalGroup(
            PanelPrincipalDocenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelPrincipalDocenteLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(PanelUsuarioO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );
        PanelPrincipalDocenteLayout.setVerticalGroup(
            PanelPrincipalDocenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelPrincipalDocenteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PanelUsuarioO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PanelPrincipalDocente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(PanelPrincipalDocente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(46, 46, 46))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void HorarioDocenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HorarioDocenteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_HorarioDocenteActionPerformed

    private void GenerarNuevaTutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GenerarNuevaTutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_GenerarNuevaTutoActionPerformed

    private void GenerarInformesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GenerarInformesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_GenerarInformesActionPerformed

    private void btnCerrarSesionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCerrarSesionMouseClicked
        // TODO add your handling code here:
        Acceso login=new Acceso();
        login.setVisible(true); // Mostrar la ventana de inicio de sesión
        dispose();
    }//GEN-LAST:event_btnCerrarSesionMouseClicked

    private void btnCambiarClaveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCambiarClaveMouseClicked

        // TODO add your handling code here:
    }//GEN-LAST:event_btnCambiarClaveMouseClicked

    private void jnombreUserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jnombreUserMouseClicked
        // TODO add your handling code here:
         if (PanelUsuarioO.isVisible()) {
        PanelUsuarioO.setVisible(false); // Si el panel está visible, ocultarlo
    } else {
        PanelUsuarioO.setVisible(true); // Si el panel está oculto, mostrarlo
    } 
    }//GEN-LAST:event_jnombreUserMouseClicked

    private void bntPerfilUserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bntPerfilUserMouseClicked
        // TODO add your handling code here:
        Perfiles ventanaPerfil = new Perfiles();
    
    // Hacer visible la ventana de perfil
    ventanaPerfil.setVisible(true);
    }//GEN-LAST:event_bntPerfilUserMouseClicked

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
            java.util.logging.Logger.getLogger(Menu_Docente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu_Docente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu_Docente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu_Docente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu_Docente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel FotoAdmin;
    private org.edisoncor.gui.button.ButtonIcon GenerarInformes;
    private org.edisoncor.gui.button.ButtonIcon GenerarNuevaTuto;
    private org.edisoncor.gui.button.ButtonIcon HorarioDocente;
    private javax.swing.JPanel PanelPrincipalDocente;
    private javax.swing.JPanel PanelUsuarioO;
    private org.edisoncor.gui.button.ButtonIcon TutoriasAgendadas;
    private javax.swing.JLabel bntPerfilUser;
    private javax.swing.JLabel btnCambiarClave;
    private javax.swing.JLabel btnCerrarSesion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel jnombreUser;
    private javax.swing.JLabel txtUsuario;
    // End of variables declaration//GEN-END:variables
}
