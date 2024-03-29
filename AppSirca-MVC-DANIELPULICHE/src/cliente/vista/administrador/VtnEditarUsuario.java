package cliente.vista.administrador;

import cliente.servicios.cliente;
import com.google.gson.Gson;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.io.IOException;
import javax.swing.JLabel;
import javax.swing.JTextField;
import modelo.DTO.ClsPeticionDTO;
import modelo.DTO.ClsResultadoDTO;
import modelo.DTO.ClsUsuarioDTO;
import utilidades.Utilidades;

public class VtnEditarUsuario extends javax.swing.JFrame {

    private cliente objCliente;
    private String nombrePerfil;
    private ClsUsuarioDTO objUsuarioSeleccionado;
    
    public VtnEditarUsuario(cliente objCliente, String login, ClsUsuarioDTO objUsuarioSeleccionado) {
        initComponents();
        Image icon = Toolkit.getDefaultToolkit().getImage("./src/Recursos/logo.png");
        this.setIconImage(icon);
        this.objCliente = objCliente;
        this.nombrePerfil = login;
        ocultarErrores();
        this.objUsuarioSeleccionado = objUsuarioSeleccionado;
        this.jComboBoxPerfil.insertItemAt(this.nombrePerfil, 0);
        this.jComboBoxPerfil.setSelectedIndex(0);
        imprimirDatosDeUsuario();
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
        jLabelTituloIniciarSesion1 = new javax.swing.JLabel();
        jPanelInteriorPrincipal = new javax.swing.JPanel();
        jPanelRegistrar = new javax.swing.JPanel();
        jButtonGuardar = new javax.swing.JButton();
        jLabelCodigo = new javax.swing.JLabel();
        jLabelNombres = new javax.swing.JLabel();
        jLabelApellidos = new javax.swing.JLabel();
        jLabelGenero = new javax.swing.JLabel();
        jLabelRol = new javax.swing.JLabel();
        jComboBoxRol = new javax.swing.JComboBox<>();
        jLabelErrorGenero = new javax.swing.JLabel();
        jComboBoxGenero = new javax.swing.JComboBox<>();
        jLabelErrorApellidos = new javax.swing.JLabel();
        jTextFieldApellidos = new javax.swing.JTextField();
        jLabelErrorNombres = new javax.swing.JLabel();
        jTextFieldNombres = new javax.swing.JTextField();
        jLabelErrorCodigo = new javax.swing.JLabel();
        jTextFieldCodigo = new javax.swing.JTextField();
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
        jPanelSuperior.add(jLabelPerfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(498, 141, -1, -1));

        jLabelPerfil2.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        jLabelPerfil2.setForeground(new java.awt.Color(255, 255, 255));
        jLabelPerfil2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/user-32.png"))); // NOI18N
        jPanelSuperior.add(jLabelPerfil2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 105, -1, -1));

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

        getContentPane().add(jPanelSuperior, java.awt.BorderLayout.PAGE_START);

        jPanelCentral.setBackground(new java.awt.Color(0, 0, 102));
        jPanelCentral.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelCentral.setMaximumSize(new java.awt.Dimension(700, 510));
        jPanelCentral.setMinimumSize(new java.awt.Dimension(700, 510));

        PanelPrincipal.setBackground(new java.awt.Color(0, 0, 102));
        PanelPrincipal.setLayout(new java.awt.GridBagLayout());

        jPanelInterior.setBackground(new java.awt.Color(255, 255, 255));
        jPanelInterior.setMaximumSize(new java.awt.Dimension(340, 400));
        jPanelInterior.setMinimumSize(new java.awt.Dimension(340, 400));
        jPanelInterior.setPreferredSize(new java.awt.Dimension(340, 400));
        jPanelInterior.setLayout(new java.awt.BorderLayout());

        jPanelCabecera.setBackground(new java.awt.Color(204, 0, 0));
        jPanelCabecera.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelCabecera.setPreferredSize(new java.awt.Dimension(400, 45));

        jLabelTituloIniciarSesion1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        jLabelTituloIniciarSesion1.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTituloIniciarSesion1.setText("Editar Usuario");
        jPanelCabecera.add(jLabelTituloIniciarSesion1);

        jPanelInterior.add(jPanelCabecera, java.awt.BorderLayout.PAGE_START);

        jPanelInteriorPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        jPanelInteriorPrincipal.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelInteriorPrincipal.setMaximumSize(new java.awt.Dimension(410, 335));
        jPanelInteriorPrincipal.setMinimumSize(new java.awt.Dimension(410, 335));
        jPanelInteriorPrincipal.setPreferredSize(new java.awt.Dimension(410, 335));
        jPanelInteriorPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelRegistrar.setBackground(new java.awt.Color(255, 255, 255));
        jPanelRegistrar.setLayout(new java.awt.GridBagLayout());

        jButtonGuardar.setBackground(new java.awt.Color(204, 0, 0));
        jButtonGuardar.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        jButtonGuardar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/save-24.png"))); // NOI18N
        jButtonGuardar.setText("Guardar");
        jButtonGuardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonGuardar.setPreferredSize(new java.awt.Dimension(120, 40));
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
        jPanelRegistrar.add(jButtonGuardar, new java.awt.GridBagConstraints());

        jPanelInteriorPrincipal.add(jPanelRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 278, 340, 77));

        jLabelCodigo.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jLabelCodigo.setForeground(new java.awt.Color(0, 0, 0));
        jLabelCodigo.setText("Código:");
        jPanelInteriorPrincipal.add(jLabelCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 26, -1, -1));

        jLabelNombres.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jLabelNombres.setForeground(new java.awt.Color(0, 0, 0));
        jLabelNombres.setText("Nombres:");
        jPanelInteriorPrincipal.add(jLabelNombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, -1));

        jLabelApellidos.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jLabelApellidos.setForeground(new java.awt.Color(0, 0, 0));
        jLabelApellidos.setText("Apellidos:");
        jPanelInteriorPrincipal.add(jLabelApellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 136, -1, -1));

        jLabelGenero.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jLabelGenero.setForeground(new java.awt.Color(0, 0, 0));
        jLabelGenero.setText("Género:");
        jPanelInteriorPrincipal.add(jLabelGenero, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 192, -1, -1));

        jLabelRol.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jLabelRol.setForeground(new java.awt.Color(0, 0, 0));
        jLabelRol.setText("Rol:");
        jPanelInteriorPrincipal.add(jLabelRol, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 246, -1, -1));

        jComboBoxRol.setBackground(new java.awt.Color(255, 255, 255));
        jComboBoxRol.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jComboBoxRol.setForeground(new java.awt.Color(0, 0, 0));
        jComboBoxRol.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "No asignado", "Estudiante", "Administrativo", "Docente" }));
        jComboBoxRol.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jComboBoxRol.setMaximumSize(new java.awt.Dimension(6, 26));
        jComboBoxRol.setMinimumSize(new java.awt.Dimension(6, 26));
        jComboBoxRol.setPreferredSize(new java.awt.Dimension(6, 26));
        jPanelInteriorPrincipal.add(jComboBoxRol, new org.netbeans.lib.awtextra.AbsoluteConstraints(146, 246, 160, -1));

        jLabelErrorGenero.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        jLabelErrorGenero.setForeground(new java.awt.Color(255, 0, 0));
        jLabelErrorGenero.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelErrorGenero.setText("Error");
        jPanelInteriorPrincipal.add(jLabelErrorGenero, new org.netbeans.lib.awtextra.AbsoluteConstraints(145, 216, -1, -1));

        jComboBoxGenero.setBackground(new java.awt.Color(255, 255, 255));
        jComboBoxGenero.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jComboBoxGenero.setForeground(new java.awt.Color(0, 0, 0));
        jComboBoxGenero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Masculino", "Femenino", "Otro" }));
        jComboBoxGenero.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jComboBoxGenero.setMaximumSize(new java.awt.Dimension(6, 26));
        jComboBoxGenero.setMinimumSize(new java.awt.Dimension(6, 26));
        jComboBoxGenero.setPreferredSize(new java.awt.Dimension(6, 26));
        jPanelInteriorPrincipal.add(jComboBoxGenero, new org.netbeans.lib.awtextra.AbsoluteConstraints(146, 192, 160, -1));

        jLabelErrorApellidos.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        jLabelErrorApellidos.setForeground(new java.awt.Color(255, 0, 0));
        jLabelErrorApellidos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelErrorApellidos.setText("Error");
        jPanelInteriorPrincipal.add(jLabelErrorApellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(145, 160, -1, -1));

        jTextFieldApellidos.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldApellidos.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jTextFieldApellidos.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldApellidos.setMaximumSize(new java.awt.Dimension(6, 26));
        jTextFieldApellidos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldApellidosKeyPressed(evt);
            }
        });
        jPanelInteriorPrincipal.add(jTextFieldApellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(146, 136, 160, -1));

        jLabelErrorNombres.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        jLabelErrorNombres.setForeground(new java.awt.Color(255, 0, 0));
        jLabelErrorNombres.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelErrorNombres.setText("Error");
        jPanelInteriorPrincipal.add(jLabelErrorNombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(145, 104, -1, -1));

        jTextFieldNombres.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldNombres.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jTextFieldNombres.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldNombres.setMaximumSize(new java.awt.Dimension(6, 26));
        jTextFieldNombres.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldNombresKeyPressed(evt);
            }
        });
        jPanelInteriorPrincipal.add(jTextFieldNombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(146, 80, 160, -1));

        jLabelErrorCodigo.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        jLabelErrorCodigo.setForeground(new java.awt.Color(255, 0, 0));
        jLabelErrorCodigo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelErrorCodigo.setText("Error");
        jPanelInteriorPrincipal.add(jLabelErrorCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(145, 50, -1, -1));

        jTextFieldCodigo.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldCodigo.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jTextFieldCodigo.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldCodigo.setMaximumSize(new java.awt.Dimension(6, 26));
        jTextFieldCodigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldCodigoKeyPressed(evt);
            }
        });
        jPanelInteriorPrincipal.add(jTextFieldCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(146, 26, 160, -1));

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
    
    // Imprimir DATOS ACTUALES
    private void imprimirDatosDeUsuario(){
        
        String codigoUsuarioSeleccionado = objUsuarioSeleccionado.getCodigo();
        String apellidosUsuarioSeleccionado = objUsuarioSeleccionado.getApellidos();
        String nombresUsuarioSeleccionado = objUsuarioSeleccionado.getNombres();
        String rolUsuarioSeleccionado = objUsuarioSeleccionado.obtenerRol(objUsuarioSeleccionado.getRol());             //SE HACE DE ESTA FORMA PARA
        String generoUsuarioSeleccionado = objUsuarioSeleccionado.obtenerGenero(objUsuarioSeleccionado.getGenero());    //NO IMPORTAR CLASES DEL MODELO
        
        this.jTextFieldCodigo.setText(codigoUsuarioSeleccionado);
        this.jTextFieldApellidos.setText(apellidosUsuarioSeleccionado);
        this.jTextFieldNombres.setText(nombresUsuarioSeleccionado);
        
        switch(generoUsuarioSeleccionado){
            case "Masculino":
                this.jComboBoxGenero.setSelectedIndex(1);
            break;
            case "Femenino":
                this.jComboBoxGenero.setSelectedIndex(2);
            break;
            case "Otro":
                this.jComboBoxGenero.setSelectedIndex(3);
            break;
            default:
            break;
        }
        
        switch(rolUsuarioSeleccionado){
            case "No asignado":
                this.jComboBoxRol.setSelectedIndex(0);
            break;
            case "Estudiante":
                this.jComboBoxRol.setSelectedIndex(1);
            break;
            case "Administrativo":
                this.jComboBoxRol.setSelectedIndex(2);
            break;
            case "Docente":
                this.jComboBoxRol.setSelectedIndex(3);
            break;
            default:
            break;
        }
        
    }
            
    // Subflujo REGRESAR
    private void jButtonRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegresarActionPerformed
        
        boolean bandera = camposConCambios();
        
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
    
    // Campos MODIFICADOS?
    private boolean camposConCambios(){
        boolean bandera = false;
        
        if(!this.jTextFieldCodigo.getText().equals(objUsuarioSeleccionado.getCodigo()))
            bandera = true;
        
        if(!this.jTextFieldNombres.getText().equals(objUsuarioSeleccionado.getNombres()))
            bandera = true;
                
        if(!this.jTextFieldApellidos.getText().equals(objUsuarioSeleccionado.getApellidos()))
            bandera = true;
        
        if(this.jComboBoxGenero.getSelectedItem() != objUsuarioSeleccionado.obtenerGenero(objUsuarioSeleccionado.getGenero()))
            bandera = true;
        
        if(this.jComboBoxRol.getSelectedItem() != objUsuarioSeleccionado.obtenerRol(objUsuarioSeleccionado.getRol()))
            bandera = true;
        
        return bandera;
    }
    
    // Funcion principal GUARDAR
    private void jButtonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGuardarActionPerformed
        
        ocultarErrores();
        
        boolean cantidadCaracteresCodigo = validarCantidadDeCaracteresCodigo();
        boolean camposValidos = verificarCamposValidos();
        boolean camposVacios = verificarCamposVacios();
        
        if(camposVacios == false && camposValidos == false && cantidadCaracteresCodigo == false){
            
            if(Utilidades.mensajeConfirmacion("¿Estás seguro de que quieres guardar los cambios efectuados?", "Advertencia") == 0){
                try {

                    //Iniciar conexión servidor

                    this.objCliente.crearConexion();
                    Gson gson= new Gson();
                    ClsPeticionDTO objPeticion= new ClsPeticionDTO();
                    ClsResultadoDTO objResultado= new ClsResultadoDTO();

                    String codigoOriginal = this.objUsuarioSeleccionado.getCodigo();
                    String codigoEditado = this.jTextFieldCodigo.getText();
                    String nombresEditado = this.jTextFieldNombres.getText();
                    String apellidosEditado = this.jTextFieldApellidos.getText();
                    String generoEditado = (String) this.jComboBoxGenero.getSelectedItem();
                    String rolEditado = (String) this.jComboBoxRol.getSelectedItem();

                    ClsUsuarioDTO objUsuarioEditado = new ClsUsuarioDTO(codigoEditado, apellidosEditado, nombresEditado, generoEditado, rolEditado);

                    String datosUsuario = codigoOriginal+"/"+gson.toJson(objUsuarioEditado);

                    objPeticion.setAccion("editarUsuario");
                    objPeticion.setArgumentos(datosUsuario);
                    String JSONPeticion=gson.toJson(objPeticion);

                    String resultado=objCliente.enviarPeticion(JSONPeticion);
                    objResultado=gson.fromJson(resultado, ClsResultadoDTO.class);

                    this.objCliente.cerrarConexion();

                    //Fin Conexión Servidor
                    if(objResultado.getCodigoResultado()==1){
                        utilidades.Utilidades.mensajeExito("Actualización de datos exitosa", "Cambios exitosos");
                        VtnPrincipalAdmin objVtnPrincipalAdmin = new VtnPrincipalAdmin(objCliente, nombrePerfil);
                        objVtnPrincipalAdmin.setVisible(true);
                        this.dispose();
                    }else{
                        utilidades.Utilidades.mensajeError("El código ya se encuentra en uso", "Error");
                        mostrarError(jLabelErrorCodigo, "Código en uso, ingresar uno nuevo",jTextFieldCodigo);
                    }

                }catch (IOException ex) {
                    Utilidades.mensajeError("Error al editar usuario. Intentelo de nuevo más tarde", "Error");
                }
            }

        }else{
            if(camposVacios == true)
                Utilidades.mensajeAdvertencia("Hay campos obligatorios sin rellenar", "Error");
            else if(camposValidos == true)
                Utilidades.mensajeAdvertencia("Hay campos no válidos", "Error");
            else if(cantidadCaracteresCodigo == true)
                Utilidades.mensajeAdvertencia("Número de caracteres no válido", "Error");
        }
    }//GEN-LAST:event_jButtonGuardarActionPerformed
    
    
    
    // VALIDACION DE CAMPOS inicio =============================================
    private boolean verificarCamposVacios() {
        
        boolean bandera = false; // false = campos no vacios
        
        if(this.jTextFieldCodigo.getText().equals(""))
        {
            mostrarError(jLabelErrorCodigo, "Rellenar este campo",jTextFieldCodigo);
            bandera=true;
        }
        
        if(this.jTextFieldNombres.getText().equals(""))
        {
            mostrarError(jLabelErrorNombres, "Rellenar este campo",jTextFieldNombres);
            bandera=true;
        }
        
        if(this.jTextFieldApellidos.getText().equals(""))
        {
            mostrarError(jLabelErrorApellidos, "Rellenar este campo",jTextFieldApellidos);
            bandera=true;
        }
        
        if(jComboBoxGenero.getSelectedIndex()==0)
        {
            jLabelErrorGenero.setText("Seleccionar genero");
            jLabelErrorGenero.setVisible(true);
            jComboBoxGenero.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
            bandera=true;
        }
        
        return bandera;
    }
    
    private void ocultarErrores(){
        jLabelErrorCodigo.setVisible(false);
        jLabelErrorNombres.setVisible(false);
        jLabelErrorApellidos.setVisible(false);
        jLabelErrorGenero.setVisible(false);
        jTextFieldCodigo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTextFieldNombres.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTextFieldApellidos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0))); 
        jComboBoxGenero.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jComboBoxRol.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
    }
    
    private boolean verificarCamposValidos(){
        
        boolean bandera = false; // false = campos validos        
                
        if(verificarCaracteresValidos(jTextFieldNombres) == true)
        {
            mostrarError(jLabelErrorNombres, "Carácter ingresado no válido",jTextFieldNombres);
            bandera=true;
        }else
            jLabelErrorNombres.setVisible(false);
        
        if(verificarCaracteresValidos(jTextFieldApellidos) == true)
        {
            mostrarError(jLabelErrorApellidos, "Carácter ingresado no válido",jTextFieldApellidos);
            bandera=true;
        }else
            jLabelErrorApellidos.setVisible(false);
        
        if(verificarCaracteresCodigo(jTextFieldCodigo) == true){
            mostrarError(jLabelErrorCodigo, "Carácter ingresado no válido",jTextFieldCodigo);
            bandera=true;
        } 
        
        return bandera;
    }
    
    private boolean verificarCaracteresValidos(JTextField campo) {
        
        char[] caracteresValidos = {'a','á','b','c','d','e','é','f','g','h','i','í','j','k','l','m','n','ñ','o','ó','p','r','s','t',
                                    'u','ú','v','w','x','y','z',' '};    ///FALTAN POR AGREGAR
                                      
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
    
    private boolean verificarCaracteresCodigo(JTextField campo) {
        
        char[] caracteresValidos = {'1','2','3','4','5','6','7','8','9','0'};
        boolean bandera=false; // false = caracteres validos             
        char[] caracteresEnCampo = campo.getText().toCharArray();

        for(int i=0; i<caracteresEnCampo.length; i++){

            String caracterCampo = String.valueOf(caracteresEnCampo[i]);
            boolean banderaInterna = false; // false = caracter incorrecto

            for(int j=0;j<caracteresValidos.length;j++){

                String caracterValido = String.valueOf(caracteresValidos[j]);

                if(caracterCampo.equalsIgnoreCase(caracterValido))
                {
                    banderaInterna=true;
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
        
    private void mostrarError(JLabel notificacion, String error, JTextField campo){
        notificacion.setText(error);
        notificacion.setVisible(true);
        campo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
    }
     
    private boolean validarCantidadDeCaracteresCodigo(){
        
        boolean bandera = false; // false = cantidad de caracteres correcta
        
        if(jTextFieldCodigo.getText().length() != 8){ 
            bandera = true;
            mostrarError(jLabelErrorCodigo, "El código debe poseer 8 digitos",jTextFieldCodigo);            
        }else{
            this.jLabelErrorCodigo.setVisible(false);
        }
               
        return bandera;
    }
    // VALIDACION DE CAMPOS final ==============================================
    
    
    
    // ComboBox PERFIL
    private void jComboBoxPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxPerfilActionPerformed

        boolean bandera = camposConCambios();
        
        switch (jComboBoxPerfil.getSelectedIndex()) {

            case 1:
        
                if(bandera == false){
                    VtnModificarLogin objVtnModificarLogin = new VtnModificarLogin(this.objCliente, this.nombrePerfil);
                    objVtnModificarLogin.setVisible(true);
                    this.dispose();
                }else{
                    if(Utilidades.mensajeConfirmacion("Los cambios no guardados se perderan", "Confirmar retorno") == 0){
                        VtnModificarLogin objVtnModificarLogin = new VtnModificarLogin(this.objCliente, this.nombrePerfil);
                        objVtnModificarLogin.setVisible(true);
                        this.dispose();
                    }
                }
                
            break;
            case 2:
        
                if(bandera == false){
                    VtnModificarContrasenia objVtnModificarContrasenia = new VtnModificarContrasenia(this.objCliente, this.nombrePerfil);
                    objVtnModificarContrasenia.setVisible(true);
                    this.dispose();
                }else{
                    if(Utilidades.mensajeConfirmacion("Los cambios no guardados se perderan", "Confirmar retorno") == 0){
                        VtnModificarContrasenia objVtnModificarContrasenia = new VtnModificarContrasenia(this.objCliente, this.nombrePerfil);
                        objVtnModificarContrasenia.setVisible(true);
                        this.dispose();
                    }
                }
                
            break;
            case 3:
                
                if(bandera == false){
                    VtnIniciarSesion objVtnIniciarSesion = new VtnIniciarSesion(this.objCliente);
                    objVtnIniciarSesion.setVisible(true);
                    this.dispose();
                }else{
                    if(Utilidades.mensajeConfirmacion("Los cambios no guardados se perderan", "Confirmar retorno") == 0){
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

    
    
    // Eventos ENTER inicio ====================================================
    private void jTextFieldCodigoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldCodigoKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            jButtonGuardarActionPerformed(null);
        }
    }//GEN-LAST:event_jTextFieldCodigoKeyPressed

    private void jTextFieldNombresKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldNombresKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            jButtonGuardarActionPerformed(null);
        }
    }//GEN-LAST:event_jTextFieldNombresKeyPressed

    private void jTextFieldApellidosKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldApellidosKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            jButtonGuardarActionPerformed(null);
        }
    }//GEN-LAST:event_jTextFieldApellidosKeyPressed

    private void jButtonGuardarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButtonGuardarKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            jButtonGuardarActionPerformed(null);
        }
    }//GEN-LAST:event_jButtonGuardarKeyPressed
    // Eventos ENTER final =====================================================
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Barra;
    private javax.swing.JLabel IconoUniversidad;
    private javax.swing.JPanel PanelPrincipal;
    private javax.swing.JButton jButtonGuardar;
    private javax.swing.JButton jButtonRegresar;
    private javax.swing.JComboBox<String> jComboBoxGenero;
    private javax.swing.JComboBox<String> jComboBoxPerfil;
    private javax.swing.JComboBox<String> jComboBoxRol;
    private javax.swing.JLabel jLabelApellidos;
    private javax.swing.JLabel jLabelCodigo;
    private javax.swing.JLabel jLabelDelCauca;
    private javax.swing.JLabel jLabelDesarrolladores;
    private javax.swing.JLabel jLabelErrorApellidos;
    private javax.swing.JLabel jLabelErrorCodigo;
    private javax.swing.JLabel jLabelErrorGenero;
    private javax.swing.JLabel jLabelErrorNombres;
    private javax.swing.JLabel jLabelGenero;
    private javax.swing.JLabel jLabelNombres;
    private javax.swing.JLabel jLabelPerfil;
    private javax.swing.JLabel jLabelPerfil2;
    private javax.swing.JLabel jLabelRol;
    private javax.swing.JLabel jLabelSIRCA1;
    private javax.swing.JLabel jLabelSIRCA2;
    private javax.swing.JLabel jLabelSIRCA3;
    private javax.swing.JLabel jLabelTituloIniciarSesion1;
    private javax.swing.JLabel jLabelUniversidad;
    private javax.swing.JPanel jPanelCabecera;
    private javax.swing.JPanel jPanelCentral;
    private javax.swing.JPanel jPanelInferior;
    private javax.swing.JPanel jPanelInterior;
    private javax.swing.JPanel jPanelInteriorPrincipal;
    private javax.swing.JPanel jPanelRegistrar;
    private javax.swing.JPanel jPanelRegresar;
    private javax.swing.JPanel jPanelSuperior;
    private javax.swing.JTextField jTextFieldApellidos;
    private javax.swing.JTextField jTextFieldCodigo;
    private javax.swing.JTextField jTextFieldNombres;
    // End of variables declaration//GEN-END:variables
}
