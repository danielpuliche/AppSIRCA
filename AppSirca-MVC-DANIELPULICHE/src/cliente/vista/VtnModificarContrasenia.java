package cliente.vista;

import cliente.servicios.cliente;
import com.google.gson.Gson;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import modelo.ClsPeticion;
import modelo.ClsResultado;
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
        jLabelErrorContraseniaActual.setVisible(false);
        jLabelErrorNuevaContrasenia.setVisible(false);
        jLabelErrorConfirmarNuevaContrasenia.setVisible(false);
        jLabelInvisibilidadContraseniaActual.setVisible(false);
        jLabelInvisibilidadNuevaContrasenia.setVisible(false);
        jLabelInvisibilidadConfirmarNuevaContrasenia.setVisible(false);
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
        jLabelPerfil2 = new javax.swing.JLabel();
        jComboBoxPerfil = new javax.swing.JComboBox<>();
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
        jLabelInvisibilidadContraseniaActual = new javax.swing.JLabel();
        jLabelVisibilidadContraseniaActual = new javax.swing.JLabel();
        jPanelVisibilidadNuevaContrasenia = new javax.swing.JPanel();
        jLabelInvisibilidadNuevaContrasenia = new javax.swing.JLabel();
        jLabelVisibilidadNuevaContrasenia = new javax.swing.JLabel();
        jPanelVisibilidadConfirmarNuevaContrasenia = new javax.swing.JPanel();
        jLabelInvisibilidadConfirmarNuevaContrasenia = new javax.swing.JLabel();
        jLabelVisibilidadConfirmarNuevaContrasenia = new javax.swing.JLabel();
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

        jLabelPerfil2.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        jLabelPerfil2.setForeground(new java.awt.Color(255, 255, 255));
        jLabelPerfil2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/user-32.png"))); // NOI18N
        jPanelSuperior.add(jLabelPerfil2, new org.netbeans.lib.awtextra.AbsoluteConstraints(522, 105, -1, -1));

        jComboBoxPerfil.setBackground(new java.awt.Color(204, 0, 0));
        jComboBoxPerfil.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jComboBoxPerfil.setForeground(new java.awt.Color(255, 255, 255));
        jComboBoxPerfil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Modificar Login", "Modificar Contraseña", "Cerrar Sesión" }));
        jComboBoxPerfil.setSelectedIndex(-1);
        jComboBoxPerfil.setBorder(null);
        jComboBoxPerfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxPerfilActionPerformed(evt);
            }
        });
        jPanelSuperior.add(jComboBoxPerfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(557, 112, 140, 25));

        getContentPane().add(jPanelSuperior, java.awt.BorderLayout.PAGE_START);

        jPanelCentral.setBackground(new java.awt.Color(0, 0, 102));
        jPanelCentral.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelCentral.setMaximumSize(new java.awt.Dimension(700, 510));
        jPanelCentral.setMinimumSize(new java.awt.Dimension(700, 510));

        PanelPrincipal.setBackground(new java.awt.Color(0, 0, 102));
        PanelPrincipal.setLayout(new java.awt.GridBagLayout());

        jPanelInterior.setBackground(new java.awt.Color(255, 255, 255));
        jPanelInterior.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelInterior.setMaximumSize(new java.awt.Dimension(310, 360));
        jPanelInterior.setMinimumSize(new java.awt.Dimension(0, 0));
        jPanelInterior.setLayout(new java.awt.BorderLayout());

        jPanelCabecera.setBackground(new java.awt.Color(204, 0, 0));
        jPanelCabecera.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelCabecera.setPreferredSize(new java.awt.Dimension(194, 39));

        jLabelTituloModificarLogin.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        jLabelTituloModificarLogin.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTituloModificarLogin.setText("Modificar Contraseña");
        jPanelCabecera.add(jLabelTituloModificarLogin);

        jPanelInterior.add(jPanelCabecera, java.awt.BorderLayout.PAGE_START);

        jPanelInteriorPrincipal.setBackground(new java.awt.Color(255, 255, 255));

        jLabelContraseniaActual.setBackground(new java.awt.Color(255, 255, 255));
        jLabelContraseniaActual.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jLabelContraseniaActual.setText("Contraseña Actual:");

        jLabelObligatorio1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 36)); // NOI18N
        jLabelObligatorio1.setForeground(new java.awt.Color(255, 0, 0));
        jLabelObligatorio1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelObligatorio1.setText("*");

        jLabelErrorContraseniaActual.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        jLabelErrorContraseniaActual.setForeground(new java.awt.Color(255, 0, 0));
        jLabelErrorContraseniaActual.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelErrorContraseniaActual.setText("Error");

        jLabelNuevaContrasenia.setBackground(new java.awt.Color(255, 255, 255));
        jLabelNuevaContrasenia.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jLabelNuevaContrasenia.setText("Nueva Contraseña:");

        jLabelErrorNuevaContrasenia.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        jLabelErrorNuevaContrasenia.setForeground(new java.awt.Color(255, 0, 0));
        jLabelErrorNuevaContrasenia.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelErrorNuevaContrasenia.setText("Error");

        jLabelConfirmarNuevaContrasenia.setBackground(new java.awt.Color(255, 255, 255));
        jLabelConfirmarNuevaContrasenia.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jLabelConfirmarNuevaContrasenia.setText("Confirmar Nueva Contraseña:");

        jLabelErrorConfirmarNuevaContrasenia.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        jLabelErrorConfirmarNuevaContrasenia.setForeground(new java.awt.Color(255, 0, 0));
        jLabelErrorConfirmarNuevaContrasenia.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelErrorConfirmarNuevaContrasenia.setText("Error");

        jButtonGuardar.setBackground(new java.awt.Color(204, 0, 0));
        jButtonGuardar.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        jButtonGuardar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/save-32.png"))); // NOI18N
        jButtonGuardar.setText("Guardar");
        jButtonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGuardarActionPerformed(evt);
            }
        });

        jPasswordFieldContraseniaActual.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N

        jPasswordFieldNuevaContrasenia.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N

        jPasswordFieldConfirmarNuevaContrasenia.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N

        jLabelObligatorio2.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 36)); // NOI18N
        jLabelObligatorio2.setForeground(new java.awt.Color(255, 0, 0));
        jLabelObligatorio2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelObligatorio2.setText("*");

        jLabelObligatorio3.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 36)); // NOI18N
        jLabelObligatorio3.setForeground(new java.awt.Color(255, 0, 0));
        jLabelObligatorio3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelObligatorio3.setText("*");

        jLabelCamposObligatorios.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        jLabelCamposObligatorios.setForeground(new java.awt.Color(255, 0, 0));
        jLabelCamposObligatorios.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelCamposObligatorios.setText("* Campos Obligatorios");

        jPanelVisibilidadContraseniaActual.setBackground(new java.awt.Color(255, 255, 255));
        jPanelVisibilidadContraseniaActual.setLayout(new java.awt.CardLayout());

        jLabelInvisibilidadContraseniaActual.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/eye_slash_visible_hide_hidden_show_icon_145987.png"))); // NOI18N
        jLabelInvisibilidadContraseniaActual.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabelInvisibilidadContraseniaActualMousePressed(evt);
            }
        });
        jPanelVisibilidadContraseniaActual.add(jLabelInvisibilidadContraseniaActual, "card2");

        jLabelVisibilidadContraseniaActual.setBackground(new java.awt.Color(255, 255, 255));
        jLabelVisibilidadContraseniaActual.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/eye_visible_hide_hidden_show_icon_145988.png"))); // NOI18N
        jLabelVisibilidadContraseniaActual.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabelVisibilidadContraseniaActualMousePressed(evt);
            }
        });
        jPanelVisibilidadContraseniaActual.add(jLabelVisibilidadContraseniaActual, "card3");

        jPanelVisibilidadNuevaContrasenia.setBackground(new java.awt.Color(255, 255, 255));
        jPanelVisibilidadNuevaContrasenia.setLayout(new java.awt.CardLayout());

        jLabelInvisibilidadNuevaContrasenia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/eye_slash_visible_hide_hidden_show_icon_145987.png"))); // NOI18N
        jLabelInvisibilidadNuevaContrasenia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabelInvisibilidadNuevaContraseniaMousePressed(evt);
            }
        });
        jPanelVisibilidadNuevaContrasenia.add(jLabelInvisibilidadNuevaContrasenia, "card2");

        jLabelVisibilidadNuevaContrasenia.setBackground(new java.awt.Color(255, 255, 255));
        jLabelVisibilidadNuevaContrasenia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/eye_visible_hide_hidden_show_icon_145988.png"))); // NOI18N
        jLabelVisibilidadNuevaContrasenia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabelVisibilidadNuevaContraseniaMousePressed(evt);
            }
        });
        jPanelVisibilidadNuevaContrasenia.add(jLabelVisibilidadNuevaContrasenia, "card1");

        jPanelVisibilidadConfirmarNuevaContrasenia.setBackground(new java.awt.Color(255, 255, 255));
        jPanelVisibilidadConfirmarNuevaContrasenia.setLayout(new java.awt.CardLayout());

        jLabelInvisibilidadConfirmarNuevaContrasenia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/eye_slash_visible_hide_hidden_show_icon_145987.png"))); // NOI18N
        jLabelInvisibilidadConfirmarNuevaContrasenia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabelInvisibilidadConfirmarNuevaContraseniaMousePressed(evt);
            }
        });
        jPanelVisibilidadConfirmarNuevaContrasenia.add(jLabelInvisibilidadConfirmarNuevaContrasenia, "card2");

        jLabelVisibilidadConfirmarNuevaContrasenia.setBackground(new java.awt.Color(255, 255, 255));
        jLabelVisibilidadConfirmarNuevaContrasenia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/eye_visible_hide_hidden_show_icon_145988.png"))); // NOI18N
        jLabelVisibilidadConfirmarNuevaContrasenia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabelVisibilidadConfirmarNuevaContraseniaMousePressed(evt);
            }
        });
        jPanelVisibilidadConfirmarNuevaContrasenia.add(jLabelVisibilidadConfirmarNuevaContrasenia, "card1");

        javax.swing.GroupLayout jPanelInteriorPrincipalLayout = new javax.swing.GroupLayout(jPanelInteriorPrincipal);
        jPanelInteriorPrincipal.setLayout(jPanelInteriorPrincipalLayout);
        jPanelInteriorPrincipalLayout.setHorizontalGroup(
            jPanelInteriorPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelInteriorPrincipalLayout.createSequentialGroup()
                .addGroup(jPanelInteriorPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelInteriorPrincipalLayout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jLabelContraseniaActual))
                    .addGroup(jPanelInteriorPrincipalLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabelObligatorio1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addGroup(jPanelInteriorPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelErrorContraseniaActual)
                            .addGroup(jPanelInteriorPrincipalLayout.createSequentialGroup()
                                .addComponent(jPasswordFieldContraseniaActual, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jPanelVisibilidadContraseniaActual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanelInteriorPrincipalLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabelObligatorio2, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addGroup(jPanelInteriorPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelErrorNuevaContrasenia)
                            .addComponent(jLabelNuevaContrasenia)
                            .addGroup(jPanelInteriorPrincipalLayout.createSequentialGroup()
                                .addComponent(jPasswordFieldNuevaContrasenia, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jPanelVisibilidadNuevaContrasenia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelInteriorPrincipalLayout.createSequentialGroup()
                .addGroup(jPanelInteriorPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelInteriorPrincipalLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabelObligatorio3, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addGroup(jPanelInteriorPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelInteriorPrincipalLayout.createSequentialGroup()
                                .addComponent(jPasswordFieldConfirmarNuevaContrasenia, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jPanelVisibilidadConfirmarNuevaContrasenia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabelErrorConfirmarNuevaContrasenia)))
                    .addGroup(jPanelInteriorPrincipalLayout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jLabelConfirmarNuevaContrasenia, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addGroup(jPanelInteriorPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelCamposObligatorios, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29))
        );
        jPanelInteriorPrincipalLayout.setVerticalGroup(
            jPanelInteriorPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelInteriorPrincipalLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabelContraseniaActual)
                .addGap(6, 6, 6)
                .addGroup(jPanelInteriorPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelObligatorio1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelInteriorPrincipalLayout.createSequentialGroup()
                        .addGroup(jPanelInteriorPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPasswordFieldContraseniaActual, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanelVisibilidadContraseniaActual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelErrorContraseniaActual)))
                .addGap(7, 7, 7)
                .addComponent(jLabelNuevaContrasenia)
                .addGap(6, 6, 6)
                .addGroup(jPanelInteriorPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelObligatorio2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelInteriorPrincipalLayout.createSequentialGroup()
                        .addGroup(jPanelInteriorPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPasswordFieldNuevaContrasenia, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanelVisibilidadNuevaContrasenia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelErrorNuevaContrasenia)))
                .addGap(7, 7, 7)
                .addGroup(jPanelInteriorPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelConfirmarNuevaContrasenia)
                    .addComponent(jLabelCamposObligatorios))
                .addGap(6, 6, 6)
                .addGroup(jPanelInteriorPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelObligatorio3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelInteriorPrincipalLayout.createSequentialGroup()
                        .addGroup(jPanelInteriorPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPasswordFieldConfirmarNuevaContrasenia, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanelVisibilidadConfirmarNuevaContrasenia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelErrorConfirmarNuevaContrasenia))
                    .addComponent(jButtonGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27))
        );

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

    private void jButtonRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegresarActionPerformed
        VtnPrincipalAdministrador objVtnPrincipalAdministrador = new VtnPrincipalAdministrador(this.objCliente, this.nombrePerfil);
        objVtnPrincipalAdministrador.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButtonRegresarActionPerformed

    private void jComboBoxPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxPerfilActionPerformed
        switch (jComboBoxPerfil.getSelectedIndex()) {
            case 1:
                VtnModificarLogin objVtnModificarLogin = new VtnModificarLogin(this.objCliente, this.nombrePerfil);
                objVtnModificarLogin.setVisible(true);
                this.dispose();
            break;
            case 2:
                this.jComboBoxPerfil.setSelectedIndex(0);
            break;
            case 3:
                VtnIniciarSesion objVtnIniciarSesion = new VtnIniciarSesion(this.objCliente);
                objVtnIniciarSesion.setVisible(true);
                this.dispose();
            break;
            default:
            break;
        }
    }//GEN-LAST:event_jComboBoxPerfilActionPerformed

    private void jButtonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGuardarActionPerformed
        
        jLabelErrorContraseniaActual.setVisible(false);
        jLabelErrorNuevaContrasenia.setVisible(false);
        jLabelErrorConfirmarNuevaContrasenia.setVisible(false);
        
        boolean comprobacion1 = verificarCamposVacios();
        boolean comprobacion2 = verificarContraseniaNueva();
        if(comprobacion1 == true && comprobacion2 == true){
            try {
                objCliente.crearConexion();
                Gson objConvertidor = new Gson();
                ClsPeticion objPeticion = new ClsPeticion();
                String argumentos = this.nombrePerfil+","+jPasswordFieldNuevaContrasenia;
                objPeticion.setAccion("modificarContrasenia");
                objPeticion.setArgumentos(argumentos);
                String JSON = objConvertidor.toJson(objPeticion);
                String respuestaJSON = objCliente.enviarPeticion(JSON);
                ClsResultado objResultado = objConvertidor.fromJson(respuestaJSON, ClsResultado.class);
                objCliente.cerrarConexion();
                if(objResultado.getCodigoResultado() == 1)
                {
                    //MOSTRAR EMERGENTE DE EXITO
                    VtnPrincipalAdministrador objVtnPrincipalAdministrador = new VtnPrincipalAdministrador(this.objCliente,nombrePerfil);
                    objVtnPrincipalAdministrador.setVisible(true);
                    this.dispose();
                }
                else
                {
                    Utilidades.mensajeAdvertencia("Administrador no encontrado", "Atención");
                }

            } catch (IOException ex) {
                Logger.getLogger(VtnIniciarSesion.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else{
            Utilidades.mensajeAdvertencia("Ha ocurrido un error en el formulario", "Error");
        }
    }//GEN-LAST:event_jButtonGuardarActionPerformed

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
    
    private boolean verificarCamposVacios() {
        boolean banderaFinal = true;
        boolean bandera1 = true;
        boolean bandera2 = true;
        boolean bandera3 = true;
        if(this.jPasswordFieldContraseniaActual.getText().equals(""))
        {
            mostrarError(jLabelErrorContraseniaActual, "Error. Digite su contraseña actual");
            bandera1=false;
        }
        if(this.jPasswordFieldNuevaContrasenia.getText().equals(""))
        {
            mostrarError(jLabelErrorNuevaContrasenia, "Error. Digite su nueva contraseña");
            bandera2=false;
        }
        if(this.jPasswordFieldConfirmarNuevaContrasenia.getText().equals(""))
        {
            mostrarError(jLabelErrorConfirmarNuevaContrasenia, "Error. Digite su nueva contraseña");
            bandera3=false;
        }
        if(bandera1==false || bandera2==false || bandera3==false)
        {
            banderaFinal=false;
        }
        return banderaFinal;
    }
    
    private boolean verificarContraseniaNueva(){
        boolean banderaFinal = true;
        if(jPasswordFieldNuevaContrasenia.getText().equals(jPasswordFieldConfirmarNuevaContrasenia.getText()))
        {
            banderaFinal = true;
        }
        else
        {
            banderaFinal = false;
            mostrarError(jLabelErrorNuevaContrasenia, "Error. Contraseñas no coincidentes");
            mostrarError(jLabelErrorConfirmarNuevaContrasenia, "Error. Contraseñas no coincidentes");
        }
        return banderaFinal;
    }
    
    private void mostrarError(JLabel notificacion, String error){
            notificacion.setText(error);
            notificacion.setVisible(true);
    }
    
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
