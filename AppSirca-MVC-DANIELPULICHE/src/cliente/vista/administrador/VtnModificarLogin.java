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
import javax.swing.JTextField;
import modelo.DTO.ClsPeticionDTO;
import modelo.DTO.ClsResultadoDTO;
import utilidades.Utilidades;

public class VtnModificarLogin extends javax.swing.JFrame {
    
    private String nombrePerfil;
    private cliente objCliente;

    public VtnModificarLogin(cliente objCliente, String nombrePerfil) {
        initComponents();
        Image icon = Toolkit.getDefaultToolkit().getImage("./src/Recursos/logo.png");
        this.setIconImage(icon);
        this.objCliente = objCliente;
        this.nombrePerfil = nombrePerfil;
        ocultarErrores();
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
        jLabelLoginActual = new javax.swing.JLabel();
        jLabelObligatorioActual = new javax.swing.JLabel();
        jLabelErrorLoginActual = new javax.swing.JLabel();
        jLabelNuevoLogin = new javax.swing.JLabel();
        jLabelErrorNuevoLogin = new javax.swing.JLabel();
        jLabelConfirmarNuevoLogin = new javax.swing.JLabel();
        jLabelErrorConfirmarNuevoLogin = new javax.swing.JLabel();
        jButtonGuardar = new javax.swing.JButton();
        jLabelObligatorioNuevo = new javax.swing.JLabel();
        jLabelObligatorioConfirmar = new javax.swing.JLabel();
        jLabelCamposObligatorios = new javax.swing.JLabel();
        jTextFieldLoginActual = new javax.swing.JTextField();
        jTextFieldNuevoLogin = new javax.swing.JTextField();
        jTextFieldConfirmarNuevoLogin = new javax.swing.JTextField();
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
        PanelPrincipal.setPreferredSize(new java.awt.Dimension(700, 342));
        PanelPrincipal.setLayout(new java.awt.GridBagLayout());

        jPanelInterior.setBackground(new java.awt.Color(255, 255, 255));
        jPanelInterior.setMaximumSize(new java.awt.Dimension(310, 360));
        jPanelInterior.setMinimumSize(new java.awt.Dimension(310, 360));
        jPanelInterior.setPreferredSize(new java.awt.Dimension(440, 330));
        jPanelInterior.setLayout(new java.awt.BorderLayout());

        jPanelCabecera.setBackground(new java.awt.Color(204, 0, 0));
        jPanelCabecera.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelCabecera.setPreferredSize(new java.awt.Dimension(145, 40));

        jLabelTituloModificarLogin.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        jLabelTituloModificarLogin.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTituloModificarLogin.setText("Modificar Login");
        jPanelCabecera.add(jLabelTituloModificarLogin);

        jPanelInterior.add(jPanelCabecera, java.awt.BorderLayout.PAGE_START);

        jPanelInteriorPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        jPanelInteriorPrincipal.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelInteriorPrincipal.setPreferredSize(new java.awt.Dimension(440, 290));
        jPanelInteriorPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelLoginActual.setBackground(new java.awt.Color(255, 255, 255));
        jLabelLoginActual.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jLabelLoginActual.setForeground(new java.awt.Color(0, 0, 0));
        jLabelLoginActual.setText("Login Actual:");
        jPanelInteriorPrincipal.add(jLabelLoginActual, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, -1));

        jLabelObligatorioActual.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 36)); // NOI18N
        jLabelObligatorioActual.setForeground(new java.awt.Color(255, 0, 0));
        jLabelObligatorioActual.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelObligatorioActual.setText("*");
        jPanelInteriorPrincipal.add(jLabelObligatorioActual, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, 40));

        jLabelErrorLoginActual.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        jLabelErrorLoginActual.setForeground(new java.awt.Color(255, 0, 0));
        jLabelErrorLoginActual.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelErrorLoginActual.setText("Error");
        jPanelInteriorPrincipal.add(jLabelErrorLoginActual, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, -1, -1));

        jLabelNuevoLogin.setBackground(new java.awt.Color(255, 255, 255));
        jLabelNuevoLogin.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jLabelNuevoLogin.setForeground(new java.awt.Color(0, 0, 0));
        jLabelNuevoLogin.setText("Nuevo Login:");
        jPanelInteriorPrincipal.add(jLabelNuevoLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, -1, -1));

        jLabelErrorNuevoLogin.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        jLabelErrorNuevoLogin.setForeground(new java.awt.Color(255, 0, 0));
        jLabelErrorNuevoLogin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelErrorNuevoLogin.setText("Error");
        jPanelInteriorPrincipal.add(jLabelErrorNuevoLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, -1, -1));

        jLabelConfirmarNuevoLogin.setBackground(new java.awt.Color(255, 255, 255));
        jLabelConfirmarNuevoLogin.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jLabelConfirmarNuevoLogin.setForeground(new java.awt.Color(0, 0, 0));
        jLabelConfirmarNuevoLogin.setText("Confirmar Nuevo Login:");
        jPanelInteriorPrincipal.add(jLabelConfirmarNuevoLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 199, -1));

        jLabelErrorConfirmarNuevoLogin.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        jLabelErrorConfirmarNuevoLogin.setForeground(new java.awt.Color(255, 0, 0));
        jLabelErrorConfirmarNuevoLogin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelErrorConfirmarNuevoLogin.setText("Error");
        jPanelInteriorPrincipal.add(jLabelErrorConfirmarNuevoLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, -1, -1));

        jButtonGuardar.setBackground(new java.awt.Color(204, 0, 0));
        jButtonGuardar.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        jButtonGuardar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/save-32.png"))); // NOI18N
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

        jLabelObligatorioNuevo.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 36)); // NOI18N
        jLabelObligatorioNuevo.setForeground(new java.awt.Color(255, 0, 0));
        jLabelObligatorioNuevo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelObligatorioNuevo.setText("*");
        jPanelInteriorPrincipal.add(jLabelObligatorioNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, 40));

        jLabelObligatorioConfirmar.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 36)); // NOI18N
        jLabelObligatorioConfirmar.setForeground(new java.awt.Color(255, 0, 0));
        jLabelObligatorioConfirmar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelObligatorioConfirmar.setText("*");
        jPanelInteriorPrincipal.add(jLabelObligatorioConfirmar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, 40));

        jLabelCamposObligatorios.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jLabelCamposObligatorios.setForeground(new java.awt.Color(255, 0, 0));
        jLabelCamposObligatorios.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelCamposObligatorios.setText("* Campos Obligatorios");
        jPanelInteriorPrincipal.add(jLabelCamposObligatorios, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 190, -1, -1));

        jTextFieldLoginActual.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldLoginActual.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jTextFieldLoginActual.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldLoginActual.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldLoginActualKeyPressed(evt);
            }
        });
        jPanelInteriorPrincipal.add(jTextFieldLoginActual, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 42, 200, 26));

        jTextFieldNuevoLogin.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldNuevoLogin.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jTextFieldNuevoLogin.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldNuevoLogin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldNuevoLoginKeyPressed(evt);
            }
        });
        jPanelInteriorPrincipal.add(jTextFieldNuevoLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 132, 200, 26));

        jTextFieldConfirmarNuevoLogin.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldConfirmarNuevoLogin.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jTextFieldConfirmarNuevoLogin.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldConfirmarNuevoLogin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldConfirmarNuevoLoginKeyPressed(evt);
            }
        });
        jPanelInteriorPrincipal.add(jTextFieldConfirmarNuevoLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 222, 200, 26));

        jPanelInterior.add(jPanelInteriorPrincipal, java.awt.BorderLayout.LINE_END);

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
            .addComponent(PanelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
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

    // SubFlujo REGRESAR
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

    // Función principal GUARDAR
    private void jButtonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGuardarActionPerformed
        
        ocultarErrores();
    
        boolean confirmarLogin = verificarLoginNuevo(); 
        boolean camposValidos = verificarCamposValidos();
        boolean cantidadCaracteres = validarCantidadDeCaracteresCampos();
        boolean camposVacios = verificarCamposVacios();
        
        if(camposVacios == false && confirmarLogin == false && camposValidos == false && cantidadCaracteres == false){
            
            if(Utilidades.mensajeConfirmacion("¿Estás seguro de que quieres guardar los cambios realizados?", "Advertencia") == 0){
                try {

                    //Iniciar conexión servidor

                    objCliente.crearConexion();

                    Gson objConvertidor = new Gson();
                    ClsPeticionDTO objPeticion = new ClsPeticionDTO();

                    String argumentos = jTextFieldLoginActual.getText()+","+jTextFieldNuevoLogin.getText();
                    objPeticion.setAccion("modificarLogin");
                    objPeticion.setArgumentos(argumentos);
                    String JSON = objConvertidor.toJson(objPeticion);

                    String respuestaJSON = objCliente.enviarPeticion(JSON);
                    ClsResultadoDTO objResultado = objConvertidor.fromJson(respuestaJSON, ClsResultadoDTO.class);

                    objCliente.cerrarConexion();

                    //Cerrar conexión supervisor

                    if(objResultado.getCodigoResultado() == 1)
                    {
                        Utilidades.mensajeExito("Cambio de login exitoso", "Acción realizada con éxito");
                        this.nombrePerfil = jTextFieldNuevoLogin.getText();
                        VtnPrincipalAdmin objVtnPrincipalAdmin = new VtnPrincipalAdmin(this.objCliente,nombrePerfil);
                        objVtnPrincipalAdmin.setVisible(true);
                        this.dispose();
                    }
                    else
                    {
                        mostrarError(jLabelErrorLoginActual,"El login ingresado es incorrecto",jTextFieldLoginActual);
                        Utilidades.mensajeAdvertencia("Administrador no encontrado", "Atención");
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
            else if(confirmarLogin == true)
                Utilidades.mensajeAdvertencia("Confirmación del nuevo login no coincide", "Confirmación fallida");
        }
    }//GEN-LAST:event_jButtonGuardarActionPerformed

    
    
    // Eventos ENTER inicio ====================================================
    private void jTextFieldLoginActualKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldLoginActualKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            jButtonGuardarActionPerformed(null);
        }
    }//GEN-LAST:event_jTextFieldLoginActualKeyPressed

    private void jTextFieldNuevoLoginKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldNuevoLoginKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            jButtonGuardarActionPerformed(null);
        }
    }//GEN-LAST:event_jTextFieldNuevoLoginKeyPressed

    private void jTextFieldConfirmarNuevoLoginKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldConfirmarNuevoLoginKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            jButtonGuardarActionPerformed(null);
        }
    }//GEN-LAST:event_jTextFieldConfirmarNuevoLoginKeyPressed

    private void jButtonGuardarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButtonGuardarKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            jButtonGuardarActionPerformed(null);
        }
    }//GEN-LAST:event_jButtonGuardarKeyPressed
    // Eventos ENTER final =====================================================
    
    //Funcion para ocultar notificaciones de error
    private void ocultarErrores(){
        jLabelErrorLoginActual.setVisible(false);
        jLabelErrorNuevoLogin.setVisible(false);
        jLabelErrorConfirmarNuevoLogin.setVisible(false);
        jTextFieldLoginActual.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTextFieldNuevoLogin.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTextFieldConfirmarNuevoLogin.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
    }
    
    // ComboBos PERFIL
    private void jComboBoxPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxPerfilActionPerformed

        switch (jComboBoxPerfil.getSelectedIndex()) {

            case 1:
                this.jComboBoxPerfil.setSelectedIndex(0);
            break;
            case 2:
                if(camposEscritos() == false){
                    VtnModificarContrasenia objVtnModificarContrasenia = new VtnModificarContrasenia(this.objCliente, this.nombrePerfil);
                    objVtnModificarContrasenia.setVisible(true);
                    this.dispose();
                }else{
                    if(Utilidades.mensajeConfirmacion("Los cambios no guardados se perderan", "Confirmar redirección") == 0){
                        VtnModificarContrasenia objVtnModificarContrasenia = new VtnModificarContrasenia(this.objCliente, this.nombrePerfil);
                        objVtnModificarContrasenia.setVisible(true);
                        this.dispose();
                    }
                }            
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
    
    
    
    // Validación de los CAMPOS inicio =========================================
    private boolean verificarCamposVacios() {
        
        boolean bandera = false;
        
        if(this.jTextFieldLoginActual.getText().equals(""))
        {
            mostrarError(jLabelErrorLoginActual, "Rellenar este campo",jTextFieldLoginActual);
            bandera=true;
        }
        
        if(this.jTextFieldNuevoLogin.getText().equals(""))
        {
            mostrarError(jLabelErrorNuevoLogin, "Rellenar este campo",jTextFieldNuevoLogin);
            bandera=true;
        }
        
        if(this.jTextFieldConfirmarNuevoLogin.getText().equals(""))
        {
            mostrarError(jLabelErrorConfirmarNuevoLogin, "Rellenar este campo",jTextFieldConfirmarNuevoLogin);
            bandera=true;
        }
                
        return bandera;
    }
    
    private boolean verificarCamposValidos(){
        
        boolean bandera = false; // false = campos validos        
                
        if(verificarCaracteresValidos(jTextFieldLoginActual) == true)
        {
            mostrarError(jLabelErrorLoginActual, "Carácter ingresado no válido",jTextFieldLoginActual);
            bandera=true;
        }
       
        if(verificarCaracteresValidos(jTextFieldNuevoLogin) == true)
        {
            mostrarError(jLabelErrorNuevoLogin, "Carácter ingresado no válido",jTextFieldNuevoLogin);
            bandera=true;
        }
        
        if(verificarCaracteresValidos(jTextFieldConfirmarNuevoLogin) == true)
        {
            mostrarError(jLabelErrorConfirmarNuevoLogin, "Carácter ingresado no válido",jTextFieldConfirmarNuevoLogin);
            bandera=true;
        }
        
        return bandera;
    }
    
    private boolean validarCantidadDeCaracteresCampos(){
        
        boolean bandera = false; // false = valido
        
        if(validarCantidadDeCaracteresLogin(jTextFieldLoginActual, jLabelErrorLoginActual) == true)
            bandera = true;
        if(validarCantidadDeCaracteresLogin(jTextFieldNuevoLogin, jLabelErrorNuevoLogin) == true)
            bandera = true;
        if(validarCantidadDeCaracteresLogin(jTextFieldConfirmarNuevoLogin, jLabelErrorConfirmarNuevoLogin) == true)
            bandera = true;
        
        return bandera;
    }
    
    private boolean validarCantidadDeCaracteresLogin(JTextField login, JLabel error){
        
        boolean bandera = false; // false = correcto
        
        if(login.getText().length() < 8 || login.getText().length() > 15){ 
            bandera = true;
            mostrarError(error, "El login debe poseer entre 8 y 15 caracteres",login);            
        }
       
        return bandera;
    }
    
    private boolean verificarLoginNuevo(){
        
        boolean bandera = false;  // false = valido
        
        if(!jTextFieldNuevoLogin.getText().equals(jTextFieldConfirmarNuevoLogin.getText()))
        {
            bandera = true;
            mostrarError(jLabelErrorConfirmarNuevoLogin, "El login ingresado no coincide",jTextFieldConfirmarNuevoLogin);
        }
        return bandera;
    }
    
    private boolean verificarCaracteresValidos(JTextField campo) {
        
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
    
    private void mostrarError(JLabel notificacion, String error,JTextField campo){
            notificacion.setText(error);
            notificacion.setVisible(true);
            campo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
    }
    // Validación de los CAMPOS final ==========================================
    
    
    
    // Validación SUBFLUJOS
    private boolean camposEscritos(){
        
        boolean bandera = false;
        
        if(!this.jTextFieldLoginActual.getText().equals(""))
            bandera = true;
        
        if(!this.jTextFieldNuevoLogin.getText().equals(""))
            bandera = true;
                
        if(!this.jTextFieldConfirmarNuevoLogin.getText().equals(""))
            bandera = true;
       
        return bandera;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Barra;
    private javax.swing.JLabel IconoUniversidad;
    private javax.swing.JPanel PanelPrincipal;
    private javax.swing.JButton jButtonGuardar;
    private javax.swing.JButton jButtonRegresar;
    private javax.swing.JComboBox<String> jComboBoxPerfil;
    private javax.swing.JLabel jLabelCamposObligatorios;
    private javax.swing.JLabel jLabelConfirmarNuevoLogin;
    private javax.swing.JLabel jLabelDelCauca;
    private javax.swing.JLabel jLabelDesarrolladores;
    private javax.swing.JLabel jLabelErrorConfirmarNuevoLogin;
    private javax.swing.JLabel jLabelErrorLoginActual;
    private javax.swing.JLabel jLabelErrorNuevoLogin;
    private javax.swing.JLabel jLabelLoginActual;
    private javax.swing.JLabel jLabelNuevoLogin;
    private javax.swing.JLabel jLabelObligatorioActual;
    private javax.swing.JLabel jLabelObligatorioConfirmar;
    private javax.swing.JLabel jLabelObligatorioNuevo;
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
    private javax.swing.JTextField jTextFieldConfirmarNuevoLogin;
    private javax.swing.JTextField jTextFieldLoginActual;
    private javax.swing.JTextField jTextFieldNuevoLogin;
    // End of variables declaration//GEN-END:variables
}
