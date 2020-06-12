package cliente.vista;

import java.awt.Image;
import java.awt.Toolkit;

public class VtnModificarContrasenia extends javax.swing.JFrame {

    public VtnModificarContrasenia() {
        initComponents();
        Image icon = Toolkit.getDefaultToolkit().getImage("./src/Recursos/logo.png");
        this.setIconImage(icon);
        jLabelErrorContraseniaActual.setVisible(false);
        jLabelErrorNuevaContrasenia.setVisible(false);
        jLabelErrorConfirmarNuevaContrasenia.setVisible(false);
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
        jButtonVisibilidadContraseniaActual = new javax.swing.JButton();
        jButtonVisibilidadNuevaContrasenia = new javax.swing.JButton();
        jButtonVisibilidadConfirmarNuevaContrasenia = new javax.swing.JButton();
        jLabelObligatorio2 = new javax.swing.JLabel();
        jLabelObligatorio3 = new javax.swing.JLabel();
        jLabelCamposObligatorios = new javax.swing.JLabel();
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

        jLabelPerfil2.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        jLabelPerfil2.setForeground(new java.awt.Color(255, 255, 255));
        jLabelPerfil2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/user-32.png"))); // NOI18N
        jPanelSuperior.add(jLabelPerfil2, new org.netbeans.lib.awtextra.AbsoluteConstraints(522, 105, -1, -1));

        jComboBoxPerfil.setBackground(new java.awt.Color(204, 0, 0));
        jComboBoxPerfil.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jComboBoxPerfil.setForeground(new java.awt.Color(255, 255, 255));
        jComboBoxPerfil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administrador12", "Modificar Login", "Modificar Contraseña", "Cerrar Sesión" }));
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
        jPanelInterior.setMinimumSize(new java.awt.Dimension(310, 360));
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
        jLabelContraseniaActual.setForeground(new java.awt.Color(0, 0, 0));
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
        jLabelNuevaContrasenia.setForeground(new java.awt.Color(0, 0, 0));
        jLabelNuevaContrasenia.setText("Nueva Contraseña:");

        jLabelErrorNuevaContrasenia.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        jLabelErrorNuevaContrasenia.setForeground(new java.awt.Color(255, 0, 0));
        jLabelErrorNuevaContrasenia.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelErrorNuevaContrasenia.setText("Error");

        jLabelConfirmarNuevaContrasenia.setBackground(new java.awt.Color(255, 255, 255));
        jLabelConfirmarNuevaContrasenia.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jLabelConfirmarNuevaContrasenia.setForeground(new java.awt.Color(0, 0, 0));
        jLabelConfirmarNuevaContrasenia.setText("Confirmar Nueva Contraseña:");

        jLabelErrorConfirmarNuevaContrasenia.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        jLabelErrorConfirmarNuevaContrasenia.setForeground(new java.awt.Color(255, 0, 0));
        jLabelErrorConfirmarNuevaContrasenia.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelErrorConfirmarNuevaContrasenia.setText("Error");

        jButtonGuardar.setBackground(new java.awt.Color(204, 0, 0));
        jButtonGuardar.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        jButtonGuardar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/lock-7-32.png"))); // NOI18N
        jButtonGuardar.setText("Guardar");
        jButtonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGuardarActionPerformed(evt);
            }
        });

        jPasswordFieldContraseniaActual.setBackground(new java.awt.Color(255, 255, 255));
        jPasswordFieldContraseniaActual.setForeground(new java.awt.Color(0, 0, 0));

        jPasswordFieldNuevaContrasenia.setBackground(new java.awt.Color(255, 255, 255));
        jPasswordFieldNuevaContrasenia.setForeground(new java.awt.Color(0, 0, 0));

        jPasswordFieldConfirmarNuevaContrasenia.setBackground(new java.awt.Color(255, 255, 255));
        jPasswordFieldConfirmarNuevaContrasenia.setForeground(new java.awt.Color(0, 0, 0));

        jButtonVisibilidadContraseniaActual.setBackground(new java.awt.Color(255, 255, 255));
        jButtonVisibilidadContraseniaActual.setForeground(new java.awt.Color(255, 255, 255));
        jButtonVisibilidadContraseniaActual.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/visible-24.png"))); // NOI18N
        jButtonVisibilidadContraseniaActual.setBorder(null);
        jButtonVisibilidadContraseniaActual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVisibilidadContraseniaActualActionPerformed(evt);
            }
        });

        jButtonVisibilidadNuevaContrasenia.setBackground(new java.awt.Color(255, 255, 255));
        jButtonVisibilidadNuevaContrasenia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/visible-24.png"))); // NOI18N
        jButtonVisibilidadNuevaContrasenia.setBorder(null);
        jButtonVisibilidadNuevaContrasenia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVisibilidadNuevaContraseniaActionPerformed(evt);
            }
        });

        jButtonVisibilidadConfirmarNuevaContrasenia.setBackground(new java.awt.Color(255, 255, 255));
        jButtonVisibilidadConfirmarNuevaContrasenia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/visible-24.png"))); // NOI18N
        jButtonVisibilidadConfirmarNuevaContrasenia.setBorder(null);
        jButtonVisibilidadConfirmarNuevaContrasenia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVisibilidadConfirmarNuevaContraseniaActionPerformed(evt);
            }
        });

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
                            .addComponent(jPasswordFieldContraseniaActual, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelErrorContraseniaActual))
                        .addGap(6, 6, 6)
                        .addComponent(jButtonVisibilidadContraseniaActual, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelInteriorPrincipalLayout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jLabelNuevaContrasenia))
                    .addGroup(jPanelInteriorPrincipalLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabelObligatorio2, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addGroup(jPanelInteriorPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPasswordFieldNuevaContrasenia, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelErrorNuevaContrasenia))
                        .addGap(6, 6, 6)
                        .addComponent(jButtonVisibilidadNuevaContrasenia, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelInteriorPrincipalLayout.createSequentialGroup()
                .addGroup(jPanelInteriorPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelInteriorPrincipalLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabelObligatorio3, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addGroup(jPanelInteriorPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPasswordFieldConfirmarNuevaContrasenia, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelErrorConfirmarNuevaContrasenia))
                        .addGap(6, 6, 6)
                        .addComponent(jButtonVisibilidadConfirmarNuevaContrasenia, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelInteriorPrincipalLayout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jLabelConfirmarNuevaContrasenia, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(jPanelInteriorPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)
                    .addComponent(jLabelCamposObligatorios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18))
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
                        .addComponent(jPasswordFieldContraseniaActual, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(jLabelErrorContraseniaActual))
                    .addComponent(jButtonVisibilidadContraseniaActual, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addComponent(jLabelNuevaContrasenia)
                .addGap(6, 6, 6)
                .addGroup(jPanelInteriorPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelObligatorio2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelInteriorPrincipalLayout.createSequentialGroup()
                        .addComponent(jPasswordFieldNuevaContrasenia, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(jLabelErrorNuevaContrasenia))
                    .addComponent(jButtonVisibilidadNuevaContrasenia, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(jPanelInteriorPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelConfirmarNuevaContrasenia)
                    .addComponent(jLabelCamposObligatorios))
                .addGap(6, 6, 6)
                .addGroup(jPanelInteriorPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelObligatorio3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelInteriorPrincipalLayout.createSequentialGroup()
                        .addComponent(jPasswordFieldConfirmarNuevaContrasenia, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(jLabelErrorConfirmarNuevaContrasenia))
                    .addComponent(jButtonVisibilidadConfirmarNuevaContrasenia, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
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

        //Ajustar para este trabajo

//        VtnPrincipalAdministrador objVtnPrincipalAdministrador = new VtnPrincipalAdministrador();
//        objVtnPrincipalAdministrador.setVisible(true);
//        this.dispose();
    }//GEN-LAST:event_jButtonRegresarActionPerformed

    private void jComboBoxPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxPerfilActionPerformed
        
        //Ajustar para este trabajo
        
//        switch (jComboBoxPerfil.getSelectedIndex()) {
//            case 1:
//                VtnModificarLogin objVtnModificarLogin = new VtnModificarLogin();
//                objVtnModificarLogin.setVisible(true);
//                this.dispose();
//                break;
//            case 2:
//                VtnModificarContrasenia objVtnModificarContrasenia = new VtnModificarContrasenia();
//                objVtnModificarContrasenia.setVisible(true);
//                this.dispose();
//                break;
//            case 3:
//                VtnIngresarAlSistema objVtnIngresarSistema = new VtnIngresarAlSistema();
//                objVtnIngresarSistema.setVisible(true);
//                this.dispose();
//                break;
//            default:
//                break;
//        }
    }//GEN-LAST:event_jComboBoxPerfilActionPerformed

    private void jButtonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGuardarActionPerformed

    }//GEN-LAST:event_jButtonGuardarActionPerformed

    private void jButtonVisibilidadContraseniaActualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVisibilidadContraseniaActualActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonVisibilidadContraseniaActualActionPerformed

    private void jButtonVisibilidadNuevaContraseniaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVisibilidadNuevaContraseniaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonVisibilidadNuevaContraseniaActionPerformed

    private void jButtonVisibilidadConfirmarNuevaContraseniaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVisibilidadConfirmarNuevaContraseniaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonVisibilidadConfirmarNuevaContraseniaActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Barra;
    private javax.swing.JLabel IconoUniversidad;
    private javax.swing.JPanel PanelPrincipal;
    private javax.swing.JButton jButtonGuardar;
    private javax.swing.JButton jButtonRegresar;
    private javax.swing.JButton jButtonVisibilidadConfirmarNuevaContrasenia;
    private javax.swing.JButton jButtonVisibilidadContraseniaActual;
    private javax.swing.JButton jButtonVisibilidadNuevaContrasenia;
    private javax.swing.JComboBox<String> jComboBoxPerfil;
    private javax.swing.JLabel jLabelCamposObligatorios;
    private javax.swing.JLabel jLabelConfirmarNuevaContrasenia;
    private javax.swing.JLabel jLabelContraseniaActual;
    private javax.swing.JLabel jLabelDelCauca;
    private javax.swing.JLabel jLabelDesarrolladores;
    private javax.swing.JLabel jLabelErrorConfirmarNuevaContrasenia;
    private javax.swing.JLabel jLabelErrorContraseniaActual;
    private javax.swing.JLabel jLabelErrorNuevaContrasenia;
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
    private javax.swing.JPanel jPanelCabecera;
    private javax.swing.JPanel jPanelCentral;
    private javax.swing.JPanel jPanelInferior;
    private javax.swing.JPanel jPanelInterior;
    private javax.swing.JPanel jPanelInteriorPrincipal;
    private javax.swing.JPanel jPanelRegresar;
    private javax.swing.JPanel jPanelSuperior;
    private javax.swing.JPasswordField jPasswordFieldConfirmarNuevaContrasenia;
    private javax.swing.JPasswordField jPasswordFieldContraseniaActual;
    private javax.swing.JPasswordField jPasswordFieldNuevaContrasenia;
    // End of variables declaration//GEN-END:variables
}
