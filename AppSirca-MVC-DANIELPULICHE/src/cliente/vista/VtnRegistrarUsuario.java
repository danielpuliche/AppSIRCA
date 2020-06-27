package cliente.vista;

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

public class VtnRegistrarUsuario extends javax.swing.JFrame {

    private String nombrePerfil;
    private cliente objCliente;
    
    public VtnRegistrarUsuario(cliente objCliente, String nombrePerfil) {
        initComponents();  
        Image icon = Toolkit.getDefaultToolkit().getImage("./src/Recursos/logo.jpg");
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
        jLabelTituloIniciarSesion1 = new javax.swing.JLabel();
        jPanelInteriorPrincipal = new javax.swing.JPanel();
        jPanelRegistrar = new javax.swing.JPanel();
        jButtonRegistrar = new javax.swing.JButton();
        jLabelObligatorio = new javax.swing.JLabel();
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
        jAsteriskCodigo = new javax.swing.JLabel();
        jAsteriskNombres = new javax.swing.JLabel();
        jAsteriskApellidos = new javax.swing.JLabel();
        jAsteriskGenero = new javax.swing.JLabel();
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
        jPanelSuperior.add(jLabelPerfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(498, 141, -1, -1));

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
        jPanelInterior.setMaximumSize(new java.awt.Dimension(340, 400));
        jPanelInterior.setMinimumSize(new java.awt.Dimension(340, 400));
        jPanelInterior.setPreferredSize(new java.awt.Dimension(340, 400));
        jPanelInterior.setLayout(new java.awt.BorderLayout());

        jPanelCabecera.setBackground(new java.awt.Color(204, 0, 0));
        jPanelCabecera.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelCabecera.setPreferredSize(new java.awt.Dimension(400, 45));

        jLabelTituloIniciarSesion1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        jLabelTituloIniciarSesion1.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTituloIniciarSesion1.setText("Registrar Usuario");
        jPanelCabecera.add(jLabelTituloIniciarSesion1);

        jPanelInterior.add(jPanelCabecera, java.awt.BorderLayout.PAGE_START);

        jPanelInteriorPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        jPanelInteriorPrincipal.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelInteriorPrincipal.setMaximumSize(new java.awt.Dimension(410, 335));
        jPanelInteriorPrincipal.setMinimumSize(new java.awt.Dimension(410, 335));
        jPanelInteriorPrincipal.setPreferredSize(new java.awt.Dimension(410, 335));
        jPanelInteriorPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelRegistrar.setBackground(new java.awt.Color(255, 255, 255));
        jPanelRegistrar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jButtonRegistrar.setBackground(new java.awt.Color(204, 0, 0));
        jButtonRegistrar.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        jButtonRegistrar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonRegistrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/save-as-24.png"))); // NOI18N
        jButtonRegistrar.setText("Registrar");
        jButtonRegistrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonRegistrar.setPreferredSize(new java.awt.Dimension(90, 30));
        jButtonRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegistrarActionPerformed(evt);
            }
        });
        jButtonRegistrar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButtonRegistrarKeyPressed(evt);
            }
        });

        jLabelObligatorio.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        jLabelObligatorio.setForeground(new java.awt.Color(255, 0, 0));
        jLabelObligatorio.setText("* Campos obligatorios");

        javax.swing.GroupLayout jPanelRegistrarLayout = new javax.swing.GroupLayout(jPanelRegistrar);
        jPanelRegistrar.setLayout(jPanelRegistrarLayout);
        jPanelRegistrarLayout.setHorizontalGroup(
            jPanelRegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelRegistrarLayout.createSequentialGroup()
                .addGap(99, 99, 99)
                .addGroup(jPanelRegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelRegistrarLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jButtonRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabelObligatorio))
                .addGap(98, 98, 98))
        );
        jPanelRegistrarLayout.setVerticalGroup(
            jPanelRegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelRegistrarLayout.createSequentialGroup()
                .addComponent(jLabelObligatorio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanelInteriorPrincipal.add(jPanelRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 278, 340, 77));

        jLabelCodigo.setBackground(new java.awt.Color(255, 255, 255));
        jLabelCodigo.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jLabelCodigo.setText("Código:");
        jPanelInteriorPrincipal.add(jLabelCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 26, -1, -1));

        jLabelNombres.setBackground(new java.awt.Color(255, 255, 255));
        jLabelNombres.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jLabelNombres.setText("Nombres:");
        jPanelInteriorPrincipal.add(jLabelNombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, -1));

        jLabelApellidos.setBackground(new java.awt.Color(255, 255, 255));
        jLabelApellidos.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jLabelApellidos.setText("Apellidos:");
        jPanelInteriorPrincipal.add(jLabelApellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 136, -1, -1));

        jLabelGenero.setBackground(new java.awt.Color(255, 255, 255));
        jLabelGenero.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jLabelGenero.setText("Género:");
        jPanelInteriorPrincipal.add(jLabelGenero, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 192, -1, -1));

        jLabelRol.setBackground(new java.awt.Color(255, 255, 255));
        jLabelRol.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jLabelRol.setText("Rol:");
        jPanelInteriorPrincipal.add(jLabelRol, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 246, -1, -1));

        jComboBoxRol.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
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

        jComboBoxGenero.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
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

        jTextFieldApellidos.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
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

        jTextFieldNombres.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
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

        jTextFieldCodigo.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jTextFieldCodigo.setMaximumSize(new java.awt.Dimension(6, 26));
        jTextFieldCodigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldCodigoKeyPressed(evt);
            }
        });
        jPanelInteriorPrincipal.add(jTextFieldCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(146, 26, 160, -1));

        jAsteriskCodigo.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jAsteriskCodigo.setForeground(new java.awt.Color(255, 0, 0));
        jAsteriskCodigo.setText("*");
        jPanelInteriorPrincipal.add(jAsteriskCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, -1, -1));

        jAsteriskNombres.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jAsteriskNombres.setForeground(new java.awt.Color(255, 0, 0));
        jAsteriskNombres.setText("*");
        jPanelInteriorPrincipal.add(jAsteriskNombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 90, -1, 20));

        jAsteriskApellidos.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jAsteriskApellidos.setForeground(new java.awt.Color(255, 0, 0));
        jAsteriskApellidos.setText("*");
        jPanelInteriorPrincipal.add(jAsteriskApellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 130, -1, -1));

        jAsteriskGenero.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jAsteriskGenero.setForeground(new java.awt.Color(255, 0, 0));
        jAsteriskGenero.setText("*");
        jPanelInteriorPrincipal.add(jAsteriskGenero, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 190, -1, 40));

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
    
    // VALIDACION subflujos
    private boolean camposEscritos(){
        boolean bandera = false; // false = Campos vacios
        
        if(!this.jTextFieldCodigo.getText().equals(""))
            bandera = true;
        
        if(!this.jTextFieldNombres.getText().equals(""))
            bandera = true;
                
        if(!this.jTextFieldApellidos.getText().equals(""))
            bandera = true;
        
        if(jComboBoxGenero.getSelectedIndex()!=0)
            bandera = true;
        
        if(jComboBoxRol.getSelectedIndex()!=0)
            bandera = true;
        
        return bandera;
    }
    
    //Funcion para ocultar notificaciones de error
    private void ocultarErrores(){
        jLabelErrorCodigo.setVisible(false);
        jLabelErrorNombres.setVisible(false);
        jLabelErrorApellidos.setVisible(false);
        jLabelErrorGenero.setVisible(false);
    }
    
    // Función principal REGISTRAR
    private void jButtonRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegistrarActionPerformed
        
        ocultarErrores();
        
        boolean cantidadCaracteresCodigo = validarCantidadDeCaracteresCodigo();
        boolean camposValidos = verificarCamposValidos();
        boolean camposVacios = verificarCamposVacios();
        
        if(camposVacios == false && camposValidos == false && cantidadCaracteresCodigo == false){
            
            if(Utilidades.mensajeConfirmacion("¿Estás seguro de que quieres guardar los datos ingresados?", "Confirmar registro") == 0){
                
                try {

                    //Iniciar conexión servidor

                    this.objCliente.crearConexion();
                    Gson gson= new Gson();
                    ClsPeticionDTO objPeticion= new ClsPeticionDTO();
                    ClsResultadoDTO objResultado= new ClsResultadoDTO();

                    String codigo;
                    String apellidos;
                    String nombres;
                    String genero;
                    String rol;

                    codigo = jTextFieldCodigo.getText();                
                    apellidos = jTextFieldApellidos.getText();
                    nombres = jTextFieldNombres.getText();
                    genero = (String) jComboBoxGenero.getSelectedItem();
                    rol = (String) jComboBoxRol.getSelectedItem();

                    ClsUsuarioDTO objUsuario = new ClsUsuarioDTO(codigo, apellidos, nombres, genero, rol);
                    Gson convertidor = new Gson();
                    String datosUsuario = convertidor.toJson(objUsuario);

                    objPeticion.setAccion("registrarUsuario");
                    objPeticion.setArgumentos(datosUsuario);
                    String JSONPeticion=gson.toJson(objPeticion);

                    String resultado=objCliente.enviarPeticion(JSONPeticion);
                    objResultado=gson.fromJson(resultado, ClsResultadoDTO.class);

                    this.objCliente.cerrarConexion();

                    //Fin Conexión Servidor

                    if(objResultado.getCodigoResultado()==1){
                        utilidades.Utilidades.mensajeExito("Registro de usuario exitoso", "Registro exitoso");
                        VtnPrincipalAdmin objVtnPrincipalAdmin = new VtnPrincipalAdmin(objCliente, nombrePerfil);
                        objVtnPrincipalAdmin.setVisible(true);
                        this.dispose();
                    }else{
                        utilidades.Utilidades.mensajeAdvertencia("El código " +jTextFieldCodigo.getText()+ " se encuentra en uso. \nPor favor ingresar nuevo código", "Error en el registro");
                    }

                }catch (IOException ex) {
                    Utilidades.mensajeError("Error en el registro. Intentelo de nuevo más tarde", "Error");
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
    }//GEN-LAST:event_jButtonRegistrarActionPerformed
    
    
    
    // VALIDACION campos inicio ================================================
    private boolean verificarCamposVacios() {
        
        boolean bandera = false; // false = campos no vacios
        
        if(this.jTextFieldCodigo.getText().equals(""))
        {
            mostrarError(jLabelErrorCodigo, "Rellenar este campo");
            bandera=true;
        }
        
        if(this.jTextFieldNombres.getText().equals(""))
        {
            mostrarError(jLabelErrorNombres, "Rellenar este campo");
            bandera=true;
        }
        
        if(this.jTextFieldApellidos.getText().equals(""))
        {
            mostrarError(jLabelErrorApellidos, "Rellenar este campo");
            bandera=true;
        }
        
        if(jComboBoxGenero.getSelectedIndex()==0)
        {
            mostrarError(jLabelErrorGenero, "Seleccionar genero");
            bandera=true;
        }
        
        return bandera;
    }
    
    private boolean verificarCamposValidos(){
        
        boolean bandera = false; // false = campos validos        
                
        if(verificarCaracteresValidos(jTextFieldNombres) == true)
        {
            mostrarError(jLabelErrorNombres, "Carácter ingresado no válido");
            bandera=true;
        }else
            jLabelErrorNombres.setVisible(false);
        
        if(verificarCaracteresValidos(jTextFieldApellidos) == true)
        {
            mostrarError(jLabelErrorApellidos, "Carácter ingresado no válido");
            bandera=true;
        }else
            jLabelErrorApellidos.setVisible(false);
        
        if(verificarCaracteresCodigo(jTextFieldCodigo) == true){
            mostrarError(jLabelErrorCodigo, "Carácter ingresado no válido");
            bandera=true;
        } 
        
        return bandera;
    }
    
    private boolean verificarCaracteresValidos(JTextField campo) {
        
        char[] caracteresNoValidos = {'!','#','$','%','&','/','(',')','=','?','¿',
                                      '@','*',';',',',':','.','-','_','1','2','3',    ///FALTAN POR AGREGAR
                                      '4','5','6','7','8','9','0'};
        
        boolean bandera=false;
        
        char[] letrasEnCampo = campo.getText().toCharArray();
        
        for(int j=0;j<caracteresNoValidos.length;j++){
            String letraNoValida = String.valueOf(caracteresNoValidos[j]);
            for(int i=0;i<letrasEnCampo.length;i++){
                String letraCampo = String.valueOf(letrasEnCampo[i]);
                if(letraCampo.equalsIgnoreCase(letraNoValida))
                {
                    bandera=true;
                }
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
        
    private void mostrarError(JLabel notificacion, String error){
        notificacion.setText(error);
        notificacion.setVisible(true);
    }
     
    private boolean validarCantidadDeCaracteresCodigo(){
        
        boolean bandera = false; // false = correcto
        
        if(jTextFieldCodigo.getText().length() != 8){ 
            bandera = true;
            mostrarError(jLabelErrorCodigo, "El código debe poseer 8 digitos");            
        }
               
        return bandera;
    }
    // VALIDACIÓN campos final =================================================
    
    
    
    // Eventos ENTER inicio ====================================================
    private void jTextFieldCodigoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldCodigoKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            jButtonRegistrarActionPerformed(null);
        }
    }//GEN-LAST:event_jTextFieldCodigoKeyPressed

    private void jTextFieldNombresKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldNombresKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            jButtonRegistrarActionPerformed(null);
        }
    }//GEN-LAST:event_jTextFieldNombresKeyPressed

    private void jTextFieldApellidosKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldApellidosKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            jButtonRegistrarActionPerformed(null);
        }
    }//GEN-LAST:event_jTextFieldApellidosKeyPressed

    private void jButtonRegistrarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButtonRegistrarKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            jButtonRegistrarActionPerformed(null);
        }
    }//GEN-LAST:event_jButtonRegistrarKeyPressed
    // Eventos ENTER final =====================================================
    
    
    
    // COmboBox PERFIL
    private void jComboBoxPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxPerfilActionPerformed
        
        boolean bandera = camposEscritos();
        
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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Barra;
    private javax.swing.JLabel IconoUniversidad;
    private javax.swing.JPanel PanelPrincipal;
    private javax.swing.JLabel jAsteriskApellidos;
    private javax.swing.JLabel jAsteriskCodigo;
    private javax.swing.JLabel jAsteriskGenero;
    private javax.swing.JLabel jAsteriskNombres;
    private javax.swing.JButton jButtonRegistrar;
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
    private javax.swing.JLabel jLabelObligatorio;
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
