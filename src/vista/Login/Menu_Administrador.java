/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista.Login;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.RenderingHints;
import java.io.File;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.SwingWorker;
import modelo.Persona;
import modelo.Usuario;
import prepis.sSlide;
import vista.CambiarClave;
import vista.Perfiles;
import vista.Tutorias.FrmGenerarInforme;
import vista.Tutorias.FrmTutoriasPrincipal;

/**
 *
 * @author Usuario
 */
public class Menu_Administrador extends javax.swing.JFrame {

    /**
     * Creates new form Menu_Administrador
     */
    //variable global
    private Usuario user;
    private sSlide slide;
    private Boolean estado;

    private FrmGenerarInforme frmGenerarInforme;
    private FrmTutoriasPrincipal frmTutoriasPrincipal;
    private ImageIcon imagen;
    private Persona persona;

    // constructor con parámetros
    public Menu_Administrador(Usuario usuario, Persona persona) {
        initComponents();

        this.user = usuario;
        this.persona = persona;
        txtUsuario.setText(persona.getNombre() + " " + persona.getApellido());
        NombreUsuariot.setText(persona.getNombre() + " " + persona.getApellido());
        mostrarGif();
        ImageIcon icono = new ImageIcon(getClass().getResource("/imagenes/FT.png"));
        FotoAdmin.setIcon(icono);

    }

    public Menu_Administrador() {
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

    protected void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D) g.create();
        int width = getWidth();
        int height = getHeight();
        int arc = 20; // Modifica este valor para cambiar el radio del borde

        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setColor(getBackground());
        g2d.fillRoundRect(0, 0, width, height, arc, arc);
        g2d.setColor(getForeground());
        g2d.drawRoundRect(0, 0, width - 1, height - 1, arc, arc);
        g2d.dispose();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        circleComponent1 = new com.jgoodies.animation.components.CircleComponent();
        PanelPrincipalAdministrador = new javax.swing.JPanel();
        PanelUsuarioO = new javax.swing.JPanel();
        btnPerfilUser = new javax.swing.JLabel();
        cambiarClave = new javax.swing.JLabel();
        btnCerrarSesion = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        buttonIcon2 = new org.edisoncor.gui.button.ButtonIcon();
        AdminDocentes = new org.edisoncor.gui.button.ButtonIcon();
        AdminEstudiante = new org.edisoncor.gui.button.ButtonIcon();
        AdminMatricula = new org.edisoncor.gui.button.ButtonIcon();
        AdminPeriodo = new org.edisoncor.gui.button.ButtonIcon();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel12 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        FotoAdmin = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        NombreUsuariot = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 51, 51));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setText("Exit");
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 550, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 62, 0, 0));
        jPanel2.getAccessibleContext().setAccessibleName("");
        jPanel2.getAccessibleContext().setAccessibleDescription("");

        getContentPane().add(circleComponent1, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 120, -1, -1));

        PanelPrincipalAdministrador.setBackground(new java.awt.Color(255, 250, 205));

        PanelUsuarioO.setBackground(new java.awt.Color(102, 51, 0));

        btnPerfilUser.setFont(new java.awt.Font("Franklin Gothic Book", 1, 16)); // NOI18N
        btnPerfilUser.setForeground(new java.awt.Color(255, 255, 255));
        btnPerfilUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8-usuario-37.png"))); // NOI18N
        btnPerfilUser.setText("Perfil");
        btnPerfilUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPerfilUserMouseClicked(evt);
            }
        });

        cambiarClave.setFont(new java.awt.Font("Franklin Gothic Book", 1, 16)); // NOI18N
        cambiarClave.setForeground(new java.awt.Color(255, 255, 255));
        cambiarClave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8-contraseña-39.png"))); // NOI18N
        cambiarClave.setText("Cambiar Clave");
        cambiarClave.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cambiarClaveMouseClicked(evt);
            }
        });

        btnCerrarSesion.setFont(new java.awt.Font("Franklin Gothic Book", 1, 16)); // NOI18N
        btnCerrarSesion.setForeground(new java.awt.Color(255, 255, 255));
        btnCerrarSesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8-cerrar-sesión-39.png"))); // NOI18N
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
                    .addComponent(cambiarClave)
                    .addComponent(btnPerfilUser))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        PanelUsuarioOLayout.setVerticalGroup(
            PanelUsuarioOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelUsuarioOLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(btnPerfilUser)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(cambiarClave)
                .addGap(28, 28, 28)
                .addComponent(btnCerrarSesion)
                .addGap(56, 56, 56))
        );

        javax.swing.GroupLayout PanelPrincipalAdministradorLayout = new javax.swing.GroupLayout(PanelPrincipalAdministrador);
        PanelPrincipalAdministrador.setLayout(PanelPrincipalAdministradorLayout);
        PanelPrincipalAdministradorLayout.setHorizontalGroup(
            PanelPrincipalAdministradorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelPrincipalAdministradorLayout.createSequentialGroup()
                .addContainerGap(837, Short.MAX_VALUE)
                .addComponent(PanelUsuarioO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        PanelPrincipalAdministradorLayout.setVerticalGroup(
            PanelPrincipalAdministradorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelPrincipalAdministradorLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(PanelUsuarioO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(316, Short.MAX_VALUE))
        );

        getContentPane().add(PanelPrincipalAdministrador, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 80, 1057, 587));

        jPanel3.setBackground(new java.awt.Color(102, 51, 0));
        jPanel3.setForeground(new java.awt.Color(255, 255, 255));

        buttonIcon2.setBackground(new java.awt.Color(255, 250, 205));
        buttonIcon2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/5526535.png"))); // NOI18N
        buttonIcon2.setText("buttonIcon2");
        buttonIcon2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonIcon2ActionPerformed(evt);
            }
        });

        AdminDocentes.setBackground(new java.awt.Color(255, 250, 205));
        AdminDocentes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/docente.png"))); // NOI18N
        AdminDocentes.setText("buttonIcon2");

        AdminEstudiante.setBackground(new java.awt.Color(255, 250, 205));
        AdminEstudiante.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/estudiantes.png"))); // NOI18N
        AdminEstudiante.setText("buttonIcon2");
        AdminEstudiante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdminEstudianteActionPerformed(evt);
            }
        });

        AdminMatricula.setBackground(new java.awt.Color(255, 250, 205));
        AdminMatricula.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/matricula.png"))); // NOI18N
        AdminMatricula.setText("buttonIcon2");
        AdminMatricula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdminMatriculaActionPerformed(evt);
            }
        });

        AdminPeriodo.setBackground(new java.awt.Color(255, 250, 205));
        AdminPeriodo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/periodo.png"))); // NOI18N
        AdminPeriodo.setText("buttonIcon2");
        AdminPeriodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdminPeriodoActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Franklin Gothic Book", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 250, 205));
        jLabel1.setText("ADMINISTRAR ");

        jLabel2.setFont(new java.awt.Font("Franklin Gothic Book", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 250, 205));
        jLabel2.setText("USUARIOS");

        jLabel3.setFont(new java.awt.Font("Franklin Gothic Book", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 250, 205));
        jLabel3.setText("ADMINISTRAR ");

        jLabel4.setFont(new java.awt.Font("Franklin Gothic Book", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 250, 205));
        jLabel4.setText("MATRICULAS");

        jLabel5.setFont(new java.awt.Font("Franklin Gothic Book", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 250, 205));
        jLabel5.setText("ADMINISTRAR ");

        jLabel6.setFont(new java.awt.Font("Franklin Gothic Book", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 250, 205));
        jLabel6.setText("ESTUDIANTES");

        jLabel7.setFont(new java.awt.Font("Franklin Gothic Book", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 250, 205));
        jLabel7.setText("PERIODO ACADEMICO");

        jLabel8.setFont(new java.awt.Font("Franklin Gothic Book", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 250, 205));
        jLabel8.setText("ADMINISTRAR ");

        jLabel9.setFont(new java.awt.Font("Franklin Gothic Book", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 250, 205));
        jLabel9.setText("ADMINISTRAR ");

        jLabel10.setFont(new java.awt.Font("Franklin Gothic Book", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 250, 205));
        jLabel10.setText("ASIGNATURAS ");

        jSeparator1.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel12.setBackground(new java.awt.Color(255, 250, 205));
        jLabel12.setFont(new java.awt.Font("Segoe UI Historic", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 250, 205));
        jLabel12.setText("SEAES");

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/image(4)(1).png"))); // NOI18N

        txtUsuario.setBackground(new java.awt.Color(47, 30, 30));
        txtUsuario.setFont(new java.awt.Font("Franklin Gothic Book", 1, 14)); // NOI18N
        txtUsuario.setForeground(new java.awt.Color(255, 255, 255));
        txtUsuario.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtUsuario.setEnabled(false);

        jSeparator3.setForeground(new java.awt.Color(255, 255, 255));

        jSeparator2.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator2.setForeground(new java.awt.Color(255, 255, 255));

        FotoAdmin.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(buttonIcon2, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel10)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(AdminMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(AdminPeriodo, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(AdminDocentes, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(AdminEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)))
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                    .addGap(9, 9, 9)
                                    .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(txtUsuario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(FotoAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(FotoAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18))
                    .addComponent(AdminDocentes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6)
                        .addGap(48, 48, 48)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addGap(19, 19, 19))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(AdminEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(AdminMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(AdminPeriodo, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel10))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(buttonIcon2, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(55, 55, 55))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 260, 650));

        jPanel4.setBackground(new java.awt.Color(58, 39, 34));

        NombreUsuariot.setFont(new java.awt.Font("Franklin Gothic Book", 1, 14)); // NOI18N
        NombreUsuariot.setForeground(new java.awt.Color(255, 255, 255));
        NombreUsuariot.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/USU-removebg-preview(1).png"))); // NOI18N
        NombreUsuariot.setToolTipText("");
        NombreUsuariot.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        NombreUsuariot.setEnabled(false);
        NombreUsuariot.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NombreUsuariotMouseClicked(evt);
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 738, Short.MAX_VALUE)
                .addComponent(NombreUsuariot, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(NombreUsuariot, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 20, 1060, 60));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AdminPeriodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdminPeriodoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AdminPeriodoActionPerformed

    private void BtnMatriculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnMatriculaActionPerformed

    }//GEN-LAST:event_BtnMatriculaActionPerformed

    private void AdminMatriculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdminMatriculaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AdminMatriculaActionPerformed


    private void AdminEstudianteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdminEstudianteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AdminEstudianteActionPerformed

    private void buttonIcon2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonIcon2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonIcon2ActionPerformed

    private void NombreUsuariotMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NombreUsuariotMouseClicked
        // TODO add your handling code here:
        //JPanelXDerecha(PanelPerfil.getX(), PanelPerfil.getX() + 100, 10, 1, PanelPerfil);
        // Cambiar la visibilidad del panel al hacer clic en el nombre de usuario
        if (PanelUsuarioO.isVisible()) {
            PanelUsuarioO.setVisible(false); // Si el panel está visible, ocultarlo
        } else {
            PanelUsuarioO.setVisible(true); // Si el panel está oculto, mostrarlo
        }
    }//GEN-LAST:event_NombreUsuariotMouseClicked

    private void btnCerrarSesionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCerrarSesionMouseClicked
        // TODO add your handling code here:
        Acceso login = new Acceso();
        login.setVisible(true); // Mostrar la ventana de inicio de sesión
        dispose();
    }//GEN-LAST:event_btnCerrarSesionMouseClicked

    private void cambiarClaveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cambiarClaveMouseClicked
        // TODO add your handling code here:
        mostrarClave(user, persona);

    }//GEN-LAST:event_cambiarClaveMouseClicked

    private void btnPerfilUserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPerfilUserMouseClicked
        // TODO add your handling code here:
        mostrarPerfiles(user, persona);

    }//GEN-LAST:event_btnPerfilUserMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
 /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

            }
        });
        SwingUtilities.invokeLater(() -> new Menu_Administrador().mostrarGif());
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private org.edisoncor.gui.button.ButtonIcon AdminDocentes;
    private org.edisoncor.gui.button.ButtonIcon AdminEstudiante;
    private org.edisoncor.gui.button.ButtonIcon AdminMatricula;
    private org.edisoncor.gui.button.ButtonIcon AdminPeriodo;
    private javax.swing.JLabel FotoAdmin;
    private javax.swing.JLabel NombreUsuariot;
    private javax.swing.JPanel PanelPrincipalAdministrador;
    private javax.swing.JPanel PanelUsuarioO;
    private javax.swing.JLabel btnCerrarSesion;
    private javax.swing.JLabel btnPerfilUser;
    private org.edisoncor.gui.button.ButtonIcon buttonIcon2;
    private javax.swing.JLabel cambiarClave;
    private com.jgoodies.animation.components.CircleComponent circleComponent1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel txtUsuario;
    // End of variables declaration//GEN-END:variables

}
