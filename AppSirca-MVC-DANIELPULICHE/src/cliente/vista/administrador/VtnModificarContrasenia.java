package cliente.vista.administrador;

import cliente.servicios.cliente;
import com.google.gson.Gson;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import modelo.DTO.ClsPeticionDTO;
import modelo.DTO.ClsResultadoDTO;
import utilidades.Utilidades;

public class VtnModificarContrasenia extends javax.swing.JFrame {
    
    private String nombrePerfil;
    private cliente objCliente;

    public VtnModificarContrasenia(cliente objCliente, String nombrePerfil) {
        initComponents();
        Image icon = Toolkit.getDefaultToolkit().getImage("./src/Recursos/logo.png");
        this.setIconImage(icon);
        this.objCliente = objCliente;
        this.nombrePerfil = nombrePerfil;
        ocultarErrores();
        inicializarBotonesVisualizar();
        this.jComboBoxPerfil.insertItemAt(this.nombrePerfil, 0);
        this.jComboBoxPerfil.setSelectedIndex(0);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelInferior = new javax.swing.JPanel();
        jLabelDesarrolladores = new javax.swing.JLabel();
        jPanelSuperior = new javax.swing.JPanel();
        IconoUniversidad = new javax.swing.JLabel();
        jLabelUniversidad = new javax.swing.JLabel();
        jLabelDelCauca = new javax.swing.JLabel();
        Barra = new javax.swing.JPanel();
        jLabelSIRCA1 = new javax.swing.JLabel();
        jLabelSIRCA2 = new javax.swing.JLabel();
        jLabelSIRCA3 = new javax.swing.JLabel();
        jLabelPerfil = new javax.swing.JLabel();
        jComboBoxPerfil = new javax.swing.JComboBox<>();
        jLabelPerfil2 = new javax.swing.JLabel();
        jPanelCentral = new javax.swing.JPanel();
        PanelPrincipal = new javax.swing.JPanel();
        jPanelInterior = new javax.swing.JPanel();
        jPanelCabecera = new javax.swing.JPanel();
        jLabelTituloModificarLogin = new javax.swing.JLabel();
        jPanelInteriorPrincipal = new javax.swing.JPanel();
        jLabelContraseniaActual = new javax.swing.JLabel();
        jLabelObligatorio1 = new javax.swing.JLabel();
        jLabelErrorContraseniaActual = new javax.swing.JLabel();
        jLabelNuevaContrasenia = new javax.swing.JLabel();
        jLabelErrorNuevaContrasenia = new javax.swing.JLabel();
        jLabelConfirmarNuevaContrasenia = new javax.swing.JLabel();
        jLabelErrorConfirmarNuevaContrasenia = new javax.swing.JLabel();
        jButtonGuardar = new javax.swing.JButton();
        jPasswordFieldContraseniaActual = new javax.swing.JPasswordField();
        jPasswordFieldNuevaContrasenia = new javax.swing.JPasswordField();
        jPasswordFieldConfirmarNuevaContrasenia = new javax.swing.JPasswordField();
        jLabelObligatorio2 = new javax.swing.JLabel();
        jLabelObligatorio3 = new javax.swing.JLabel();
        jLabelCamposObligatorios = new javax.swing.JLabel();
        jPanelVisibilidadContraseniaActual = new javax.swing.JPanel();
        jLabelVisibilidadContraseniaActual = new javax.swing.JLabel();
        jLabelInvisibilidadContraseniaActual = new javax.swing.JLabel();
        jPanelVisibilidadNuevaContrasenia = new javax.swing.JPanel();
        jLabelVisibilidadNuevaContrasenia = new javax.swing.JLabel();
        jLabelInvisibilidadNuevaContrasenia = new javax.swing.JLabel();
        jPanelVisibilidadConfirmarNuevaContrasenia = new javax.swing.JPanel();
        jLabelVisibilidadConfirmarNuevaContrasenia = new javax.swing.JLabel();
        jLabelInvisibilidadConfirmarNuevaContrasenia = new javax.swing.JLabel();
        jPanelRegresar = new javax.swing.JPanel();
        jButtonRegresar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SIRCA - Admin Interface");
        setMinimumSize(new java.awt.Dimension(700, 680));
        setResizable(false);

        jPanelInferior.setBackground(new java.awt.Color(255, 255, 255));
        jPanelInferior.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelInferior.setMaximumSize(new java.awt.Dimension(700, 30));
        jPanelInferior.setMinimumSize(new java.awt.Dimension(700, 30));
        jPanelInferior.setPreferredSize(new java.awt.Dimension(700, 30));

        jLabelDesarrolladores.setBackground(new java.awt.Color(255, 255, 255));
        jLabelDesarrolladores.setForeground(new java.awt.Color(0, 0, 0));
        jLabelDesarrolladores.setText("F&P Software Development || www.fypsoftwaredevelopment.com || 2020");
        jPanelInferior.add(jLabelDesarrolladores);

        getContentPane().add(jPanelInferior, java.awt.BorderLayout.PAGE_END);

        jPanelSuperior.setBackground(new java.awt.Color(204, 0, 0));
        jPanelSuperior.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelSuperior.setMaximumSize(new java.awt.Dimension(700, 140));
        jPanelSuperior.setMinimumSize(new java.awt.Dimension(700, 140));
        jPanelSuperior.setPreferredSize(new java.awt.Dimension(700, 140));
        jPanelSuperior.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        IconoUniversidad.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        IconoUniversidad.setForeground(new java.awt.Color(255, 255, 255));
        IconoUniversidad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/universidad_blanco.png"))); // NOI18N
        jPanelSuperior.add(IconoUniversidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 29, -1, -1));

        jLabelUniversidad.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 30)); // NOI18N
        jLabelUniversidad.setForeground(new java.awt.Color(255, 255, 255));
        jLabelUniversidad.setText("Universidad");
        jPanelSuperior.add(jLabelUniversidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 40, -1, -1));

        jLabelDelCauca.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 24)); // NOI18N
        jLabelDelCauca.setForeground(new java.awt.Color(255, 255, 255));
        jLabelDelCauca.setText("del Cauca");
        jPanelSuperior.add(jLabelDelCauca, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 70, -1, -1));

        Barra.setBackground(new java.awt.Color(255, 255, 255));
        Barra.setPreferredSize(new java.awt.Dimension(4, 100));

        javax.swing.GroupLayout BarraLayout = new javax.swing.GroupLayout(Barra);
        Barra.setLayout(BarraLayout);
        BarraLayout.setHorizontalGroup(
            BarraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );
        BarraLayout.setVerticalGroup(
            BarraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 85, Short.MAX_VALUE)
        );

        jPanelSuperior.add(Barra, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 29, 2, 85));

        jLabelSIRCA1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 24)); // NOI18N
        jLabelSIRCA1.setForeground(new java.awt.Color(255, 255, 255));
        jLabelSIRCA1.setText("Sistema Integrado de");
        jLabelSIRCA1.setAlignmentY(0.0F);
        jPanelSuperior.add(jLabelSIRCA1, new org.netbeans.lib.awtextra.AbsoluteConstraints(405, 19, -1, -1));

        jLabelSIRCA2.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 24)); // NOI18N
        jLabelSIRCA2.setForeground(new java.awt.Color(255, 255, 255));
        jLabelSIRCA2.setText("Registro y Control");
        jLabelSIRCA2.setAlignmentY(0.0F);
        jPanelSuperior.add(jLabelSIRCA2, new org.netbeans.lib.awtextra.AbsoluteConstraints(423, 44, -1, -1));

        jLabelSIRCA3.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 24)); // NOI18N
        jLabelSIRCA3.setForeground(new java.awt.Color(255, 255, 255));
        jLabelSIRCA3.setText("de Acceso");
        jLabelSIRCA3.setAlignmentY(0.0F);
        jPanelSuperior.add(jLabelSIRCA3, new org.netbeans.lib.awtextra.AbsoluteConstraints(467, 69, -1, -1));

        jLabelPerfil.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        jLabelPerfil.setForeground(new java.awt.Color(255, 255, 255));
        jPanelSuperior.add(jLabelPerfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(494, 141, -1, -1));

        jComboBoxPerfil.setBackground(new java.awt.Color(204, 0, 0));
        jComboBoxPerfil.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jComboBoxPerfil.setForeground(new java.awt.Color(255, 255, 255));
        jComboBoxPerfil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Modificar Login", "Modificar Contraseña", "Cerrar Sesión" }));
        jComboBoxPerfil.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jComboBoxPerfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxPerfilActionPerformed(evt);
            }
        });
        jPanelSuperior.add(jComboBoxPerfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 108, 160, -1));

        jLabelPerfil2.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        jLabelPerfil2.setForeground(new java.awt.Color(255, 255, 255));
        jLabelPerfil2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/user-32.png"))); // NOI18N
        jPanelSuperior.add(jLabelPerfil2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 105, -1, -1));

        getContentPane().add(jPanelSuperior, java.awt.BorderLayout.PAGE_START);

        jPanelCentral.setBackground(new java.awt.Color(0, 0, 102));
        jPanelCentral.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelCentral.setMaximumSize(new java.awt.Dimension(700, 510));
        jPanelCentral.setMinimumSize(new java.awt.Dimension(700, 510));

        PanelPrincipal.setBackground(new java.awt.Color(0, 0, 102));
        PanelPrincipal.setLayout(new java.awt.GridBagLayout());

        jPanelInterior.setBackground(new java.awt.Color(255, 255, 255));
        jPanelInterior.setMaximumSize(new java.awt.Dimension(310, 360));
        jPanelInterior.setMinimumSize(new java.awt.Dimension(0, 0));
        jPanelInterior.setPreferredSize(new java.awt.Dimension(440, 330));
        jPanelInterior.setLayout(new java.awt.BorderLayout());

        jPanelCabecera.setBackground(new java.awt.Color(204, 0, 0));
        jPanelCabecera.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelCabecera.setPreferredSize(new java.awt.Dimension(145, 40));

        jLabelTituloModificarLogin.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        jLabelTituloModificarLogin.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTituloModificarLogin.setText("Modificar Contraseña");
        jPanelCabecera.add(jLabelTituloModificarLogin);

        jPanelInterior.add(jPanelCabecera, java.awt.BorderLayout.PAGE_START);

        jPanelInteriorPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        jPanelInteriorPrincipal.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelInteriorPrincipal.setPreferredSize(new java.awt.Dimension(440, 290));
        jPanelInteriorPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelContraseniaActual.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jLabelContraseniaActual.setForeground(new java.awt.Color(0, 0, 0));
        jLabelContraseniaActual.setText("Contraseña Actual:");
        jPanelInteriorPrincipal.add(jLabelContraseniaActual, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, -1));

        jLabelObligatorio1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 36)); // NOI18N
        jLabelObligatorio1.setForeground(new java.awt.Color(255, 0, 0));
        jLabelObligatorio1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelObligatorio1.setText("*");
        jPanelInteriorPrincipal.add(jLabelObligatorio1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, 40));

        jLabelErrorContraseniaActual.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        jLabelErrorContraseniaActual.setForeground(new java.awt.Color(255, 0, 0));
        jLabelErrorContraseniaActual.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelErrorContraseniaActual.setText("Error");
        jPanelInteriorPrincipal.add(jLabelErrorContraseniaActual, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, -1, -1));

        jLabelNuevaContrasenia.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jLabelNuevaContrasenia.setForeground(new java.awt.Color(0, 0, 0));
        jLabelNuevaContrasenia.setText("Nueva Contraseña:");
        jPanelInteriorPrincipal.add(jLabelNuevaContrasenia, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, -1, -1));

        jLabelErrorNuevaContrasenia.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        jLabelErrorNuevaContrasenia.setForeground(new java.awt.Color(255, 0, 0));
        jLabelErrorNuevaContrasenia.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelErrorNuevaContrasenia.setText("Error");
        jPanelInteriorPrincipal.add(jLabelErrorNuevaContrasenia, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, -1, -1));

        jLabelConfirmarNuevaContrasenia.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jLabelConfirmarNuevaContrasenia.setForeground(new java.awt.Color(0, 0, 0));
        jLabelConfirmarNuevaContrasenia.setText("Confirmar Nueva Contraseña:");
        jPanelInteriorPrincipal.add(jLabelConfirmarNuevaContrasenia, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, -1, -1));

        jLabelErrorConfirmarNuevaContrasenia.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        jLabelErrorConfirmarNuevaContrasenia.setForeground(new java.awt.Color(255, 0, 0));
        jLabelErrorConfirmarNuevaContrasenia.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelErrorConfirmarNuevaContrasenia.setText("Error");
        jPanelInteriorPrincipal.add(jLabelErrorConfirmarNuevaContrasenia, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, -1, -1));

        jButtonGuardar.setBackground(new java.awt.Color(204, 0, 0));
        jButtonGuardar.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        jButtonGuardar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/save-32.png"))); // NOI18N
        jButtonGuardar.setText("Guardar");
        jButtonGuardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGuardarActionPerformed(evt);
            }
        });
        jButtonGuardar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButtonGuardarKeyPressed(evt);
            }
        });
        jPanelInteriorPrincipal.add(jButtonGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(272, 217, 140, 50));

        jPasswordFieldContraseniaActual.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jPasswordFieldContraseniaActual.setForeground(new java.awt.Color(0, 0, 0));
        jPasswordFieldContraseniaActual.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jPasswordFieldContraseniaActualKeyPressed(evt);
            }
        });
        jPanelInteriorPrincipal.add(jPasswordFieldContraseniaActual, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 42, 180, 26));

        jPasswordFieldNuevaContrasenia.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jPasswordFieldNuevaContrasenia.setForeground(new java.awt.Color(0, 0, 0));
        jPasswordFieldNuevaContrasenia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jPasswordFieldNuevaContraseniaKeyPressed(evt);
            }
        });
        jPanelInteriorPrincipal.add(jPasswordFieldNuevaContrasenia, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 132, 180, 26));

        jPasswordFieldConfirmarNuevaContrasenia.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jPasswordFieldConfirmarNuevaContrasenia.setForeground(new java.awt.Color(0, 0, 0));
        jPasswordFieldConfirmarNuevaContrasenia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jPasswordFieldConfirmarNuevaContraseniaKeyPressed(evt);
            }
        });
        jPanelInteriorPrincipal.add(jPasswordFieldConfirmarNuevaContrasenia, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 222, 180, 26));

        jLabelObligatorio2.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 36)); // NOI18N
        jLabelObligatorio2.setForeground(new java.awt.Color(255, 0, 0));
        jLabelObligatorio2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelObligatorio2.setText("*");
        jPanelInteriorPrincipal.add(jLabelObligatorio2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, 40));

        jLabelObligatorio3.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 36)); // NOI18N
        jLabelObligatorio3.setForeground(new java.awt.Color(255, 0, 0));
        jLabelObligatorio3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelObligatorio3.setText("*");
        jPanelInteriorPrincipal.add(jLabelObligatorio3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, 40));

        jLabelCamposObligatorios.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jLabelCamposObligatorios.setForeground(new java.awt.Color(255, 0, 0));
        jLabelCamposObligatorios.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelCamposObligatorios.setText("* Campos Obligatorios");
        jPanelInteriorPrincipal.add(jLabelCamposObligatorios, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 190, -1, -1));

        jPanelVisibilidadContraseniaActual.setBackground(new java.awt.Color(255, 255, 255));
        jPanelVisibilidadContraseniaActual.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanelVisibilidadContraseniaActual.setLayout(new java.awt.CardLayout());

        jLabelVisibilidadContraseniaActual.setBackground(new java.awt.Color(255, 255, 255));
        jLabelVisibilidadContraseniaActual.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/eye_visible_hide_hidden_show_icon_145988.png"))); // NOI18N
        jLabelVisibilidadContraseniaActual.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabelVisibilidadContraseniaActualMousePressed(evt);
            }
        });
        jPanelVisibilidadContraseniaActual.add(jLabelVisibilidadContraseniaActual, "card3");

        jLabelInvisibilidadContraseniaActual.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/eye_slash_visible_hide_hidden_show_icon_145987.png"))); // NOI18N
        jLabelInvisibilidadContraseniaActual.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabelInvisibilidadContraseniaActualMousePressed(evt);
            }
        });
        jPanelVisibilidadContraseniaActual.add(jLabelInvisibilidadContraseniaActual, "card2");

        jPanelInteriorPrincipal.add(jPanelVisibilidadContraseniaActual, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 40, -1, -1));

        jPanelVisibilidadNuevaContrasenia.setBackground(new java.awt.Color(255, 255, 255));
        jPanelVisibilidadNuevaContrasenia.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanelVisibilidadNuevaContrasenia.setLayout(new java.awt.CardLayout());

        jLabelVisibilidadNuevaContrasenia.setBackground(new java.awt.Color(255, 255, 255));
        jLabelVisibilidadNuevaContrasenia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/eye_visible_hide_hidden_show_icon_145988.png"))); // NOI18N
        jLabelVisibilidadNuevaContrasenia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabelVisibilidadNuevaContraseniaMousePressed(evt);
            }
        });
        jPanelVisibilidadNuevaContrasenia.add(jLabelVisibilidadNuevaContrasenia, "card1");

        jLabelInvisibilidadNuevaContrasenia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/eye_slash_visible_hide_hidden_show_icon_145987.png"))); // NOI18N
        jLabelInvisibilidadNuevaContrasenia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabelInvisibilidadNuevaContraseniaMousePressed(evt);
            }
        });
        jPanelVisibilidadNuevaContrasenia.add(jLabelInvisibilidadNuevaContrasenia, "card2");

        jPanelInteriorPrincipal.add(jPanelVisibilidadNuevaContrasenia, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 130, -1, -1));

        jPanelVisibilidadConfirmarNuevaContrasenia.setBackground(new java.awt.Color(255, 255, 255));
        jPanelVisibilidadConfirmarNuevaContrasenia.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanelVisibilidadConfirmarNuevaContrasenia.setLayout(new java.awt.CardLayout());

        jLabelVisibilidadConfirmarNuevaContrasenia.setBackground(new java.awt.Color(255, 255, 255));
        jLabelVisibilidadConfirmarNuevaContrasenia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/eye_visible_hide_hidden_show_icon_145988.png"))); // NOI18N
        jLabelVisibilidadConfirmarNuevaContrasenia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabelVisibilidadConfirmarNuevaContraseniaMousePressed(evt);
            }
        });
        jPanelVisibilidadConfirmarNuevaContrasenia.add(jLabelVisibilidadConfirmarNuevaContrasenia, "card1");

        jLabelInvisibilidadConfirmarNuevaContrasenia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/eye_slash_visible_hide_hidden_show_icon_145987.png"))); // NOI18N
        jLabelInvisibilidadConfirmarNuevaContrasenia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabelInvisibilidadConfirmarNuevaContraseniaMousePressed(evt);
            }
        });
        jPanelVisibilidadConfirmarNuevaContrasenia.add(jLabelInvisibilidadConfirmarNuevaContrasenia, "card2");

        jPanelInteriorPrincipal.add(jPanelVisibilidadConfirmarNuevaContrasenia, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 220, -1, -1));

        jPanelInterior.add(jPanelInteriorPrincipal, java.awt.BorderLayout.CENTER);

        PanelPrincipal.add(jPanelInterior, new java.awt.GridBagConstraints());

        jPanelRegresar.setBackground(new java.awt.Color(0, 0, 102));
        jPanelRegresar.setMaximumSize(new java.awt.Dimension(700, 50));
        jPanelRegresar.setMinimumSize(new java.awt.Dimension(700, 50));
        jPanelRegresar.setPreferredSize(new java.awt.Dimension(700, 50));
        jPanelRegresar.setLayout(new java.awt.GridBagLayout());

        jButtonRegresar.setBackground(new java.awt.Color(0, 0, 102));
        jButtonRegresar.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        jButtonRegresar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonRegresar.setText("< Regresar");
        jButtonRegresar.setBorderPainted(false);
        jButtonRegresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegresarActionPerformed(evt);
            }
        });
        jPanelRegresar.add(jButtonRegresar, new java.awt.GridBagConstraints());

        javax.swing.GroupLayout jPanelCentralLayout = new javax.swing.GroupLayout(jPanelCentral);
        jPanelCentral.setLayout(jPanelCentralLayout);
        jPanelCentralLayout.setHorizontalGroup(
            jPanelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelRegresar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(PanelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanelCentralLayout.setVerticalGroup(
            jPanelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCentralLayout.createSequentialGroup()
                .addComponent(PanelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(jPanelCentral, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    // Subflujo REGRESAR
    private void jButtonRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegresarActionPerformed
        
        boolean bandera = camposEscritos();
        
        if(bandera == false){
            VtnPrincipalAdmin objVtnPrincipalAdmin = new VtnPrincipalAdmin(this.objCliente, this.nombrePerfil);
            objVtnPrincipalAdmin.setVisible(true);
            this.dispose();
        }else{
            if(Utilidades.mensajeConfirmacion("Los cambios no guardados se perderan", "Confirmar retorno") == 0){
                VtnPrincipalAdmin objVtnPrincipalAdmin = new VtnPrincipalAdmin(this.objCliente, this.nombrePerfil);
                objVtnPrincipalAdmin.setVisible(true);
                this.dispose();
            }
        } 
        
    }//GEN-LAST:event_jButtonRegresarActionPerformed

    //Funcion para ocultar notificaciones de error
    private void ocultarErrores(){
        jLabelErrorContraseniaActual.setVisible(false);
        jLabelErrorNuevaContrasenia.setVisible(false);
        jLabelErrorConfirmarNuevaContrasenia.setVisible(false);
        jPasswordFieldContraseniaActual.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPasswordFieldNuevaContrasenia.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPasswordFieldConfirmarNuevaContrasenia.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
    }
    
    //Funcion para inicializar los botones de visualizacion
    private void inicializarBotonesVisualizar(){
        jLabelInvisibilidadContraseniaActual.setVisible(false);
        jLabelInvisibilidadNuevaContrasenia.setVisible(false);
        jLabelInvisibilidadConfirmarNuevaContrasenia.setVisible(false);
        jLabelVisibilidadContraseniaActual.setVisible(true);
        jLabelVisibilidadNuevaContrasenia.setVisible(true);
        jLabelVisibilidadConfirmarNuevaContrasenia.setVisible(true);
    }
    
    // Validacion SUBFLUJOS
    private boolean camposEscritos(){
        boolean bandera = false;
        
        if(!this.jPasswordFieldContraseniaActual.getText().equals(""))
            bandera = true;
        
        if(!this.jPasswordFieldNuevaContrasenia.getText().equals(""))
            bandera = true;
                
        if(!this.jPasswordFieldConfirmarNuevaContrasenia.getText().equals(""))
            bandera = true;
       
        return bandera;
    }
    
    // Función principal GUARDAR
    private void jButtonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGuardarActionPerformed
        
        ocultarErrores();
        
        boolean confirmarContrasenia = verificarContraseniaNueva();
        boolean camposValidos = verificarCamposValidos();  
        boolean cantidadCaracteres = validarCantidadDeCaracteresCampos();      
        boolean camposVacios = verificarCamposVacios();
        
        if(camposVacios == false && confirmarContrasenia == false && camposValidos == false && cantidadCaracteres == false){
        
            if(Utilidades.mensajeConfirmacion("¿Estás seguro de que quieres guardar los cambios realizados?", "Advertencia") == 0){
                try {

                    //Iniciar conexión servidor

                    objCliente.crearConexion();

                    Gson objConvertidor = new Gson();
                    ClsPeticionDTO objPeticion = new ClsPeticionDTO();

                    String argumentos = jPasswordFieldContraseniaActual.getText()+","+jPasswordFieldNuevaContrasenia.getText();
                    objPeticion.setAccion("modificarContraseña");
                    objPeticion.setArgumentos(argumentos);
                    String JSON = objConvertidor.toJson(objPeticion);

                    String respuestaJSON = objCliente.enviarPeticion(JSON);
                    ClsResultadoDTO objResultado = objConvertidor.fromJson(respuestaJSON, ClsResultadoDTO.class);

                    objCliente.cerrarConexion();

                    //Cerrar conexión supervisor

                    if(objResultado.getCodigoResultado() == 1)
                    {
                        Utilidades.mensajeExito("Cambio de contraseña exitoso", "Acción realizada con éxito");
                        VtnPrincipalAdmin objVtnPrincipalAdmin = new VtnPrincipalAdmin(this.objCliente,nombrePerfil);
                        objVtnPrincipalAdmin.setVisible(true);
                        this.dispose();
                    }
                    else
                    {
                        mostrarError(jLabelErrorContraseniaActual,"La contraseña ingresada es incorrecta",jPasswordFieldContraseniaActual);
                        Utilidades.mensajeAdvertencia("Contraseña no válida", "Atención");
                    }

                } catch (IOException ex) {
                    Logger.getLogger(VtnIniciarSesion.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }else{
            
            if(camposVacios == true)
                Utilidades.mensajeAdvertencia("Hay campos obligatorios sin rellenar", "Error");
            else if(cantidadCaracteres == true)
                Utilidades.mensajeAdvertencia("Número de caracteres no válido", "Error");
            else if(camposValidos == true)
                Utilidades.mensajeAdvertencia("Caracteres ingresados no válidos", "Error");
            else if(confirmarContrasenia == true)
                Utilidades.mensajeAdvertencia("Confirmación de la nueva contraseña no coincide", "Confirmación fallida");
        }
    }//GEN-LAST:event_jButtonGuardarActionPerformed
    
    
    
    // Eventos VISIBILIDAD inicio ==============================================
    private void jLabelVisibilidadContraseniaActualMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelVisibilidadContraseniaActualMousePressed
        this.jPasswordFieldContraseniaActual.setEchoChar((char)0);
        this.jLabelVisibilidadContraseniaActual.setVisible(false);
        this.jLabelInvisibilidadContraseniaActual.setVisible(true);
    }//GEN-LAST:event_jLabelVisibilidadContraseniaActualMousePressed

    private void jLabelInvisibilidadContraseniaActualMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelInvisibilidadContraseniaActualMousePressed
        this.jPasswordFieldContraseniaActual.setEchoChar('*');
        this.jLabelInvisibilidadContraseniaActual.setVisible(false);
        this.jLabelVisibilidadContraseniaActual.setVisible(true);
    }//GEN-LAST:event_jLabelInvisibilidadContraseniaActualMousePressed

    private void jLabelInvisibilidadNuevaContraseniaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelInvisibilidadNuevaContraseniaMousePressed
        this.jPasswordFieldNuevaContrasenia.setEchoChar('*');
        this.jLabelInvisibilidadNuevaContrasenia.setVisible(false);
        this.jLabelVisibilidadNuevaContrasenia.setVisible(true);
    }//GEN-LAST:event_jLabelInvisibilidadNuevaContraseniaMousePressed

    private void jLabelVisibilidadNuevaContraseniaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelVisibilidadNuevaContraseniaMousePressed
        this.jPasswordFieldNuevaContrasenia.setEchoChar((char)0);
        this.jLabelVisibilidadNuevaContrasenia.setVisible(false);
        this.jLabelInvisibilidadNuevaContrasenia.setVisible(true);
    }//GEN-LAST:event_jLabelVisibilidadNuevaContraseniaMousePressed

    private void jLabelInvisibilidadConfirmarNuevaContraseniaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelInvisibilidadConfirmarNuevaContraseniaMousePressed
        this.jPasswordFieldConfirmarNuevaContrasenia.setEchoChar('*');
        this.jLabelInvisibilidadConfirmarNuevaContrasenia.setVisible(false);
        this.jLabelVisibilidadConfirmarNuevaContrasenia.setVisible(true);
    }//GEN-LAST:event_jLabelInvisibilidadConfirmarNuevaContraseniaMousePressed

    private void jLabelVisibilidadConfirmarNuevaContraseniaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelVisibilidadConfirmarNuevaContraseniaMousePressed
        this.jPasswordFieldConfirmarNuevaContrasenia.setEchoChar((char)0);
        this.jLabelVisibilidadConfirmarNuevaContrasenia.setVisible(false);
        this.jLabelInvisibilidadConfirmarNuevaContrasenia.setVisible(true);
    }//GEN-LAST:event_jLabelVisibilidadConfirmarNuevaContraseniaMousePressed
    // Eventos VISIBILIDAD final ===============================================
    
    
    
    // Evento ENTER inicio =====================================================
    private void jPasswordFieldContraseniaActualKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPasswordFieldContraseniaActualKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            jButtonGuardarActionPerformed(null);
        }
    }//GEN-LAST:event_jPasswordFieldContraseniaActualKeyPressed

    private void jPasswordFieldNuevaContraseniaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPasswordFieldNuevaContraseniaKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            jButtonGuardarActionPerformed(null);
        }
    }//GEN-LAST:event_jPasswordFieldNuevaContraseniaKeyPressed

    private void jPasswordFieldConfirmarNuevaContraseniaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPasswordFieldConfirmarNuevaContraseniaKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            jButtonGuardarActionPerformed(null);
        }
    }//GEN-LAST:event_jPasswordFieldConfirmarNuevaContraseniaKeyPressed

    private void jButtonGuardarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButtonGuardarKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            jButtonGuardarActionPerformed(null);
        }
    }//GEN-LAST:event_jButtonGuardarKeyPressed
    // Evento ENTER final ======================================================
    
    
    
    // ComboBox PERFIL
    private void jComboBoxPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxPerfilActionPerformed

        switch (jComboBoxPerfil.getSelectedIndex()) {

            case 1:
                
                if(camposEscritos() == false){
                    VtnModificarLogin objVtnModificarLogin = new VtnModificarLogin(this.objCliente, this.nombrePerfil);
                    objVtnModificarLogin.setVisible(true);
                    this.dispose();
                }else{
                    if(Utilidades.mensajeConfirmacion("Los cambios no guardados se perderan", "Confirmar redirección") == 0){
                        VtnModificarLogin objVtnModificarLogin = new VtnModificarLogin(this.objCliente, this.nombrePerfil);
                        objVtnModificarLogin.setVisible(true);
                        this.dispose();
                    }
                } 
                
            break;
            case 2:
                this.jComboBoxPerfil.setSelectedIndex(0);
            break;
            case 3:
                
                if(camposEscritos() == false){
                    VtnIniciarSesion objVtnIniciarSesion = new VtnIniciarSesion(this.objCliente);
                    objVtnIniciarSesion.setVisible(true);
                    this.dispose();
                }else{
                    if(Utilidades.mensajeConfirmacion("Los cambios no guardados se perderan", "Confirmar redirección") == 0){
                        VtnIniciarSesion objVtnIniciarSesion = new VtnIniciarSesion(this.objCliente);
                        objVtnIniciarSesion.setVisible(true);
                        this.dispose();
                    }
                } 
                
                
            break;
            default:

            break;

        }
        
        this.jComboBoxPerfil.setSelectedIndex(0);
    }//GEN-LAST:event_jComboBoxPerfilActionPerformed
    
    
    
    // VALIDACIÓN campos inicio ================================================
    private boolean verificarCamposVacios() {
        
        boolean bandera = false;
        
        if(this.jPasswordFieldContraseniaActual.getText().equals(""))
        {
            mostrarError(jLabelErrorContraseniaActual, "Rellenar este campo", jPasswordFieldContraseniaActual);
            bandera = true;
        }
        if(this.jPasswordFieldNuevaContrasenia.getText().equals(""))
        {
            mostrarError(jLabelErrorNuevaContrasenia, "Rellenar este campo",jPasswordFieldNuevaContrasenia);
            bandera = true;
        }
        if(this.jPasswordFieldConfirmarNuevaContrasenia.getText().equals(""))
        {
            mostrarError(jLabelErrorConfirmarNuevaContrasenia, "Rellenar este campo",jPasswordFieldConfirmarNuevaContrasenia);
            bandera = true;
        }
        
        return bandera;
    }
    
    private boolean verificarContraseniaNueva(){
        
        boolean bandera = false;
        
        if(!jPasswordFieldNuevaContrasenia.getText().equals(jPasswordFieldConfirmarNuevaContrasenia.getText()))
        {
            bandera = true;
            mostrarError(jLabelErrorConfirmarNuevaContrasenia, "La contraseña ingresada no coincide",jPasswordFieldConfirmarNuevaContrasenia);
        }
        return bandera;
    }
    
    private boolean verificarCaracteresValidos(JPasswordField campo) {
        
        char[] caracteresValidos = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','ñ','o','p','r','s','t',
                                    'u','v','w','x','y','z','0','1','2','3','4','5','6','7','8','9'};    ///FALTAN POR AGREGAR
                                      
        boolean bandera = false; // false = validos
        char[] caracteresEnCampo = campo.getText().toCharArray();
        
        for(int i=0; i<caracteresEnCampo.length; i++){
            
            String caracterCampo = String.valueOf(caracteresEnCampo[i]);
            boolean banderaInterna = false; // caracter incorrecto
            
            for(int j=0; j<caracteresValidos.length; j++){
                
                String caracterValido = String.valueOf(caracteresValidos[j]);
                
                if(caracterCampo.equalsIgnoreCase(caracterValido))
                {
                    banderaInterna = true;
                    break;
                }
            }
            
            if(banderaInterna == false){
                bandera = true;
                break;
            }
        }
        return bandera;
    }
    
    private boolean verificarCamposValidos(){
        
        boolean bandera = false; // false = campos validos        
                
        if(verificarCaracteresValidos(jPasswordFieldContraseniaActual) == true)
        {
            mostrarError(jLabelErrorContraseniaActual, "Carácter ingresado no válido",jPasswordFieldContraseniaActual);
            bandera=true;
        }
        
        if(verificarCaracteresValidos(jPasswordFieldNuevaContrasenia) == true)
        {
            mostrarError(jLabelErrorNuevaContrasenia, "Carácter ingresado no válido", jPasswordFieldNuevaContrasenia);
            bandera=true;
        }
        
        if(verificarCaracteresValidos(jPasswordFieldConfirmarNuevaContrasenia) == true)
        {
            mostrarError(jLabelErrorConfirmarNuevaContrasenia, "Carácter ingresado no válido",jPasswordFieldConfirmarNuevaContrasenia);
            bandera=true;
        }
        
        return bandera;
    }
    
    private boolean validarCantidadDeCaracteresCampos(){
        
        boolean bandera = false; // false = valido
        
        if(validarCantidadDeCaracteresContrasenia(jPasswordFieldContraseniaActual, jLabelErrorContraseniaActual) == true)
            bandera = true;
        if(validarCantidadDeCaracteresContrasenia(jPasswordFieldNuevaContrasenia, jLabelErrorNuevaContrasenia) == true)
            bandera = true;
        if(validarCantidadDeCaracteresContrasenia(jPasswordFieldConfirmarNuevaContrasenia, jLabelErrorConfirmarNuevaContrasenia) == true)
            bandera = true;
        
        return bandera;
    }
    
    private boolean validarCantidadDeCaracteresContrasenia(JPasswordField contrasenia, JLabel error){
        
        boolean bandera = false; // false = correcto
        
        if(contrasenia.getText().length() < 8 || contrasenia.getText().length() > 15){ 
            bandera = true;
            mostrarError(error, "La contraseña debe poseer entre 8 y 15 caracteres",contrasenia);            
        }
       
        return bandera;
    }
    
    //FALTA VALIDAR QUE LA CONTRASEÑA SEA LA CORRECTA
    
    private void mostrarError(JLabel notificacion, String error, JPasswordField campo){
            notificacion.setText(error);
            notificacion.setVisible(true);
            campo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
    }
    // VALIDACIÓN campos final =================================================
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Barra;
    private javax.swing.JLabel IconoUniversidad;
    private javax.swing.JPanel PanelPrincipal;
    private javax.swing.JButton jButtonGuardar;
    private javax.swing.JButton jButtonRegresar;
    private javax.swing.JComboBox<String> jComboBoxPerfil;
    private javax.swing.JLabel jLabelCamposObligatorios;
    private javax.swing.JLabel jLabelConfirmarNuevaContrasenia;
    private javax.swing.JLabel jLabelContraseniaActual;
    private javax.swing.JLabel jLabelDelCauca;
    private javax.swing.JLabel jLabelDesarrolladores;
    private javax.swing.JLabel jLabelErrorConfirmarNuevaContrasenia;
    private javax.swing.JLabel jLabelErrorContraseniaActual;
    private javax.swing.JLabel jLabelErrorNuevaContrasenia;
    private javax.swing.JLabel jLabelInvisibilidadConfirmarNuevaContrasenia;
    private javax.swing.JLabel jLabelInvisibilidadContraseniaActual;
    private javax.swing.JLabel jLabelInvisibilidadNuevaContrasenia;
    private javax.swing.JLabel jLabelNuevaContrasenia;
    private javax.swing.JLabel jLabelObligatorio1;
    private javax.swing.JLabel jLabelObligatorio2;
    private javax.swing.JLabel jLabelObligatorio3;
    private javax.swing.JLabel jLabelPerfil;
    private javax.swing.JLabel jLabelPerfil2;
    private javax.swing.JLabel jLabelSIRCA1;
    private javax.swing.JLabel jLabelSIRCA2;
    private javax.swing.JLabel jLabelSIRCA3;
    private javax.swing.JLabel jLabelTituloModificarLogin;
    private javax.swing.JLabel jLabelUniversidad;
    private javax.swing.JLabel jLabelVisibilidadConfirmarNuevaContrasenia;
    private javax.swing.JLabel jLabelVisibilidadContraseniaActual;
    private javax.swing.JLabel jLabelVisibilidadNuevaContrasenia;
    private javax.swing.JPanel jPanelCabecera;
    private javax.swing.JPanel jPanelCentral;
    private javax.swing.JPanel jPanelInferior;
    private javax.swing.JPanel jPanelInterior;
    private javax.swing.JPanel jPanelInteriorPrincipal;
    private javax.swing.JPanel jPanelRegresar;
    private javax.swing.JPanel jPanelSuperior;
    private javax.swing.JPanel jPanelVisibilidadConfirmarNuevaContrasenia;
    private javax.swing.JPanel jPanelVisibilidadContraseniaActual;
    private javax.swing.JPanel jPanelVisibilidadNuevaContrasenia;
    private javax.swing.JPasswordField jPasswordFieldConfirmarNuevaContrasenia;
    private javax.swing.JPasswordField jPasswordFieldContraseniaActual;
    private javax.swing.JPasswordField jPasswordFieldNuevaContrasenia;
    // End of variables declaration//GEN-END:variables
}
