package cliente.vista;

import cliente.servicios.cliente;
import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import utilidades.Utilidades;

public class VtnAsignacionMasivaRoles extends javax.swing.JFrame {

    private cliente objCliente;
    private String nombrePerfil;
    
    public VtnAsignacionMasivaRoles(cliente objCliente, String login) {
        initComponents();
        Image icon = Toolkit.getDefaultToolkit().getImage("./src/Recursos/logo.jpg");
        this.setIconImage(icon);
        estiloTablas();
        this.objCliente = objCliente;
        this.nombrePerfil = login;
        jLabelErrorDigiteCodigo.setVisible(false);
        this.jComboBoxPerfil.insertItemAt(this.nombrePerfil, 0);
        this.jComboBoxPerfil.setSelectedIndex(0);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupCriteriosBusquedaRol = new javax.swing.ButtonGroup();
        buttonGroupMenu = new javax.swing.ButtonGroup();
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
        jButtonBuscar = new javax.swing.JButton();
        jTextFieldDigiteCodigo = new javax.swing.JTextField();
        jButtonAsignarRol = new javax.swing.JButton();
        jPanelMenu = new javax.swing.JPanel();
        jToggleButtonGestionarUsuarios = new javax.swing.JToggleButton();
        jToggleButtonAsignacionMasivaRoles = new javax.swing.JToggleButton();
        jToggleButtonAyuda = new javax.swing.JToggleButton();
        jLabelErrorDigiteCodigo = new javax.swing.JLabel();
        jPanelCriterios = new javax.swing.JPanel();
        jPanelCabeceraCriteriosRoles = new javax.swing.JPanel();
        jLabelTituloCriterios = new javax.swing.JLabel();
        jPanelRadioButtons = new javax.swing.JPanel();
        jRadioButtonSinAsignar = new javax.swing.JRadioButton();
        jRadioButtonEstudiante = new javax.swing.JRadioButton();
        jRadioButtonDocente = new javax.swing.JRadioButton();
        jRadioButtonAdministrativo = new javax.swing.JRadioButton();
        jLabelRolPorAsignar = new javax.swing.JLabel();
        jComboBoxRol = new javax.swing.JComboBox<>();
        jScrollPaneTablaAsignacionMasivaRoles = new javax.swing.JScrollPane();
        jTableAsignacionMasivaRoles = new javax.swing.JTable();
        jPanelPaginacion = new javax.swing.JPanel();
        jButtonPagAnterior = new javax.swing.JButton();
        jToggleButtonPag1 = new javax.swing.JToggleButton();
        jToggleButtonPag2 = new javax.swing.JToggleButton();
        jToggleButtonPag3 = new javax.swing.JToggleButton();
        jToggleButtonPag4 = new javax.swing.JToggleButton();
        jToggleButtonPagX = new javax.swing.JToggleButton();
        jToggleButton7 = new javax.swing.JToggleButton();
        jButtonPagSiguiente = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SIRCA - Admin Interface");
        setMaximumSize(new java.awt.Dimension(700, 680));
        setMinimumSize(new java.awt.Dimension(700, 680));
        setResizable(false);

        jPanelInferior.setBackground(new java.awt.Color(255, 255, 255));
        jPanelInferior.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelInferior.setMaximumSize(new java.awt.Dimension(700, 30));
        jPanelInferior.setMinimumSize(new java.awt.Dimension(700, 30));
        jPanelInferior.setPreferredSize(new java.awt.Dimension(700, 30));

        jLabelDesarrolladores.setText("F&P Software Development || www.fypsoftwaredevelopment.com || 2020");
        jPanelInferior.add(jLabelDesarrolladores);

        getContentPane().add(jPanelInferior, java.awt.BorderLayout.PAGE_END);

        jPanelSuperior.setBackground(new java.awt.Color(204, 0, 0));
        jPanelSuperior.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelSuperior.setMaximumSize(new java.awt.Dimension(700, 140));
        jPanelSuperior.setMinimumSize(new java.awt.Dimension(700, 140));
        jPanelSuperior.setPreferredSize(new java.awt.Dimension(700, 140));

        IconoUniversidad.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        IconoUniversidad.setForeground(new java.awt.Color(255, 255, 255));
        IconoUniversidad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/universidad_blanco.png"))); // NOI18N

        jLabelUniversidad.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 30)); // NOI18N
        jLabelUniversidad.setForeground(new java.awt.Color(255, 255, 255));
        jLabelUniversidad.setText("Universidad");

        jLabelDelCauca.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 24)); // NOI18N
        jLabelDelCauca.setForeground(new java.awt.Color(255, 255, 255));
        jLabelDelCauca.setText("del Cauca");

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

        jLabelSIRCA1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 24)); // NOI18N
        jLabelSIRCA1.setForeground(new java.awt.Color(255, 255, 255));
        jLabelSIRCA1.setText("Sistema Integrado de");
        jLabelSIRCA1.setAlignmentY(0.0F);

        jLabelSIRCA2.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 24)); // NOI18N
        jLabelSIRCA2.setForeground(new java.awt.Color(255, 255, 255));
        jLabelSIRCA2.setText("Registro y Control");
        jLabelSIRCA2.setAlignmentY(0.0F);

        jLabelSIRCA3.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 24)); // NOI18N
        jLabelSIRCA3.setForeground(new java.awt.Color(255, 255, 255));
        jLabelSIRCA3.setText("de Acceso");
        jLabelSIRCA3.setAlignmentY(0.0F);

        jLabelPerfil.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        jLabelPerfil.setForeground(new java.awt.Color(255, 255, 255));

        jLabelPerfil2.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        jLabelPerfil2.setForeground(new java.awt.Color(255, 255, 255));
        jLabelPerfil2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/user-32.png"))); // NOI18N

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

        javax.swing.GroupLayout jPanelSuperiorLayout = new javax.swing.GroupLayout(jPanelSuperior);
        jPanelSuperior.setLayout(jPanelSuperiorLayout);
        jPanelSuperiorLayout.setHorizontalGroup(
            jPanelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSuperiorLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(IconoUniversidad)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addGroup(jPanelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabelUniversidad)
                    .addComponent(jLabelDelCauca))
                .addGap(32, 32, 32)
                .addComponent(Barra, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelSuperiorLayout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addGroup(jPanelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jLabelSIRCA1)
                            .addComponent(jLabelSIRCA2)
                            .addComponent(jLabelSIRCA3))
                        .addGap(60, 60, 60))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelSuperiorLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(jPanelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanelSuperiorLayout.createSequentialGroup()
                                .addComponent(jLabelPerfil)
                                .addGap(204, 204, 204))
                            .addGroup(jPanelSuperiorLayout.createSequentialGroup()
                                .addComponent(jLabelPerfil2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBoxPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
        );
        jPanelSuperiorLayout.setVerticalGroup(
            jPanelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSuperiorLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelSIRCA1)
                    .addGroup(jPanelSuperiorLayout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jLabelSIRCA3))
                    .addGroup(jPanelSuperiorLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabelSIRCA2)))
                .addGroup(jPanelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelSuperiorLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelPerfil))
                    .addGroup(jPanelSuperiorLayout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(jPanelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelPerfil2)
                            .addComponent(jComboBoxPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelSuperiorLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(IconoUniversidad)
                    .addComponent(Barra, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelSuperiorLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelUniversidad)
                            .addGroup(jPanelSuperiorLayout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(jLabelDelCauca)))))
                .addGap(24, 24, 24))
        );

        getContentPane().add(jPanelSuperior, java.awt.BorderLayout.PAGE_START);

        jPanelCentral.setBackground(new java.awt.Color(0, 0, 102));
        jPanelCentral.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelCentral.setMaximumSize(new java.awt.Dimension(700, 510));
        jPanelCentral.setMinimumSize(new java.awt.Dimension(700, 510));
        jPanelCentral.setPreferredSize(new java.awt.Dimension(700, 510));

        jButtonBuscar.setBackground(new java.awt.Color(204, 0, 0));
        jButtonBuscar.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        jButtonBuscar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/search-13-24.png"))); // NOI18N
        jButtonBuscar.setText("Buscar");
        jButtonBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonBuscar.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        jTextFieldDigiteCodigo.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jTextFieldDigiteCodigo.setForeground(new java.awt.Color(153, 153, 153));
        jTextFieldDigiteCodigo.setText("Digite Código");
        jTextFieldDigiteCodigo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextFieldDigiteCodigoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextFieldDigiteCodigoFocusLost(evt);
            }
        });

        jButtonAsignarRol.setBackground(new java.awt.Color(204, 0, 0));
        jButtonAsignarRol.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        jButtonAsignarRol.setForeground(new java.awt.Color(255, 255, 255));
        jButtonAsignarRol.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/conference-24.png"))); // NOI18N
        jButtonAsignarRol.setText("Asignar Rol");
        jButtonAsignarRol.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonAsignarRol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAsignarRolActionPerformed(evt);
            }
        });

        jPanelMenu.setBackground(new java.awt.Color(0, 0, 102));

        jToggleButtonGestionarUsuarios.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroupMenu.add(jToggleButtonGestionarUsuarios);
        jToggleButtonGestionarUsuarios.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jToggleButtonGestionarUsuarios.setText("Gestionar Usuarios");
        jToggleButtonGestionarUsuarios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jToggleButtonGestionarUsuarios.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jToggleButtonGestionarUsuarios.setMaximumSize(new java.awt.Dimension(210, 29));
        jToggleButtonGestionarUsuarios.setMinimumSize(new java.awt.Dimension(210, 29));
        jToggleButtonGestionarUsuarios.setPreferredSize(new java.awt.Dimension(210, 29));
        jToggleButtonGestionarUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButtonGestionarUsuariosActionPerformed(evt);
            }
        });
        jPanelMenu.add(jToggleButtonGestionarUsuarios);

        jToggleButtonAsignacionMasivaRoles.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroupMenu.add(jToggleButtonAsignacionMasivaRoles);
        jToggleButtonAsignacionMasivaRoles.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jToggleButtonAsignacionMasivaRoles.setSelected(true);
        jToggleButtonAsignacionMasivaRoles.setText("Asignación Masiva de Roles");
        jToggleButtonAsignacionMasivaRoles.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jToggleButtonAsignacionMasivaRoles.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jToggleButtonAsignacionMasivaRoles.setMaximumSize(new java.awt.Dimension(210, 29));
        jToggleButtonAsignacionMasivaRoles.setMinimumSize(new java.awt.Dimension(210, 29));
        jToggleButtonAsignacionMasivaRoles.setPreferredSize(new java.awt.Dimension(210, 29));
        jToggleButtonAsignacionMasivaRoles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButtonAsignacionMasivaRolesActionPerformed(evt);
            }
        });
        jPanelMenu.add(jToggleButtonAsignacionMasivaRoles);

        jToggleButtonAyuda.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroupMenu.add(jToggleButtonAyuda);
        jToggleButtonAyuda.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jToggleButtonAyuda.setText("Ayuda");
        jToggleButtonAyuda.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jToggleButtonAyuda.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jToggleButtonAyuda.setMaximumSize(new java.awt.Dimension(210, 29));
        jToggleButtonAyuda.setMinimumSize(new java.awt.Dimension(210, 29));
        jToggleButtonAyuda.setPreferredSize(new java.awt.Dimension(210, 29));
        jToggleButtonAyuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButtonAyudaActionPerformed(evt);
            }
        });
        jPanelMenu.add(jToggleButtonAyuda);

        jLabelErrorDigiteCodigo.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        jLabelErrorDigiteCodigo.setForeground(new java.awt.Color(255, 0, 0));
        jLabelErrorDigiteCodigo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelErrorDigiteCodigo.setText("Error");

        jPanelCriterios.setBackground(new java.awt.Color(255, 255, 255));
        jPanelCriterios.setPreferredSize(new java.awt.Dimension(200, 125));
        jPanelCriterios.setLayout(new java.awt.BorderLayout());

        jPanelCabeceraCriteriosRoles.setBackground(new java.awt.Color(204, 0, 0));
        jPanelCabeceraCriteriosRoles.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelCabeceraCriteriosRoles.setPreferredSize(new java.awt.Dimension(200, 30));
        jPanelCabeceraCriteriosRoles.setLayout(new java.awt.GridBagLayout());

        jLabelTituloCriterios.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        jLabelTituloCriterios.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTituloCriterios.setText("Criterios de Búsqueda por Rol");
        jPanelCabeceraCriteriosRoles.add(jLabelTituloCriterios, new java.awt.GridBagConstraints());

        jPanelCriterios.add(jPanelCabeceraCriteriosRoles, java.awt.BorderLayout.PAGE_START);

        jPanelRadioButtons.setBackground(new java.awt.Color(255, 255, 255));
        jPanelRadioButtons.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelRadioButtons.setPreferredSize(new java.awt.Dimension(200, 95));
        jPanelRadioButtons.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jRadioButtonSinAsignar.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroupCriteriosBusquedaRol.add(jRadioButtonSinAsignar);
        jRadioButtonSinAsignar.setSelected(true);
        jRadioButtonSinAsignar.setText("Sin Asignar");
        jRadioButtonSinAsignar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jRadioButtonSinAsignar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanelRadioButtons.add(jRadioButtonSinAsignar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 6, -1, -1));

        jRadioButtonEstudiante.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroupCriteriosBusquedaRol.add(jRadioButtonEstudiante);
        jRadioButtonEstudiante.setText("Estudiante");
        jRadioButtonEstudiante.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanelRadioButtons.add(jRadioButtonEstudiante, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 26, -1, -1));

        jRadioButtonDocente.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroupCriteriosBusquedaRol.add(jRadioButtonDocente);
        jRadioButtonDocente.setText("Docente");
        jRadioButtonDocente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanelRadioButtons.add(jRadioButtonDocente, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 46, -1, -1));

        jRadioButtonAdministrativo.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroupCriteriosBusquedaRol.add(jRadioButtonAdministrativo);
        jRadioButtonAdministrativo.setText("Administrativo");
        jRadioButtonAdministrativo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanelRadioButtons.add(jRadioButtonAdministrativo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 66, -1, -1));

        jPanelCriterios.add(jPanelRadioButtons, java.awt.BorderLayout.LINE_END);

        jLabelRolPorAsignar.setBackground(new java.awt.Color(255, 255, 255));
        jLabelRolPorAsignar.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        jLabelRolPorAsignar.setForeground(new java.awt.Color(255, 255, 255));
        jLabelRolPorAsignar.setText("Rol por asignar:");

        jComboBoxRol.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jComboBoxRol.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sin Asignar", "Estudiante", "Docente", "Administrativo" }));
        jComboBoxRol.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jTableAsignacionMasivaRoles.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jTableAsignacionMasivaRoles.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Selecionar", "Código", "Apellidos", "Nombres", "Género"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Boolean.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                true, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPaneTablaAsignacionMasivaRoles.setViewportView(jTableAsignacionMasivaRoles);
        if (jTableAsignacionMasivaRoles.getColumnModel().getColumnCount() > 0) {
            jTableAsignacionMasivaRoles.getColumnModel().getColumn(0).setMinWidth(0);
            jTableAsignacionMasivaRoles.getColumnModel().getColumn(0).setPreferredWidth(24);
        }

        jPanelPaginacion.setBackground(new java.awt.Color(0, 0, 102));
        jPanelPaginacion.setLayout(new javax.swing.BoxLayout(jPanelPaginacion, javax.swing.BoxLayout.LINE_AXIS));

        jButtonPagAnterior.setBackground(new java.awt.Color(255, 255, 255));
        jButtonPagAnterior.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jButtonPagAnterior.setText("<<");
        jPanelPaginacion.add(jButtonPagAnterior);

        jToggleButtonPag1.setBackground(new java.awt.Color(255, 255, 255));
        jToggleButtonPag1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jToggleButtonPag1.setSelected(true);
        jToggleButtonPag1.setText("1");
        jToggleButtonPag1.setPreferredSize(new java.awt.Dimension(45, 23));
        jToggleButtonPag1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButtonPag1ActionPerformed(evt);
            }
        });
        jPanelPaginacion.add(jToggleButtonPag1);

        jToggleButtonPag2.setBackground(new java.awt.Color(255, 255, 255));
        jToggleButtonPag2.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jToggleButtonPag2.setText("2");
        jToggleButtonPag2.setPreferredSize(new java.awt.Dimension(45, 23));
        jToggleButtonPag2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButtonPag2ActionPerformed(evt);
            }
        });
        jPanelPaginacion.add(jToggleButtonPag2);

        jToggleButtonPag3.setBackground(new java.awt.Color(255, 255, 255));
        jToggleButtonPag3.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jToggleButtonPag3.setText("3");
        jToggleButtonPag3.setPreferredSize(new java.awt.Dimension(45, 23));
        jToggleButtonPag3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButtonPag3ActionPerformed(evt);
            }
        });
        jPanelPaginacion.add(jToggleButtonPag3);

        jToggleButtonPag4.setBackground(new java.awt.Color(255, 255, 255));
        jToggleButtonPag4.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jToggleButtonPag4.setText("4");
        jToggleButtonPag4.setPreferredSize(new java.awt.Dimension(45, 23));
        jToggleButtonPag4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButtonPag4ActionPerformed(evt);
            }
        });
        jPanelPaginacion.add(jToggleButtonPag4);

        jToggleButtonPagX.setBackground(new java.awt.Color(255, 255, 255));
        jToggleButtonPagX.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jToggleButtonPagX.setText("...");
        jToggleButtonPagX.setEnabled(false);
        jToggleButtonPagX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButtonPagXActionPerformed(evt);
            }
        });
        jPanelPaginacion.add(jToggleButtonPagX);

        jToggleButton7.setBackground(new java.awt.Color(255, 255, 255));
        jToggleButton7.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jToggleButton7.setText("50");
        jToggleButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton7ActionPerformed(evt);
            }
        });
        jPanelPaginacion.add(jToggleButton7);

        jButtonPagSiguiente.setBackground(new java.awt.Color(255, 255, 255));
        jButtonPagSiguiente.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jButtonPagSiguiente.setText(">>");
        jPanelPaginacion.add(jButtonPagSiguiente);

        javax.swing.GroupLayout jPanelCentralLayout = new javax.swing.GroupLayout(jPanelCentral);
        jPanelCentral.setLayout(jPanelCentralLayout);
        jPanelCentralLayout.setHorizontalGroup(
            jPanelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelCentralLayout.createSequentialGroup()
                .addGroup(jPanelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButtonBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPaneTablaAsignacionMasivaRoles, javax.swing.GroupLayout.PREFERRED_SIZE, 637, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
            .addGroup(jPanelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelCentralLayout.createSequentialGroup()
                    .addGap(58, 58, 58)
                    .addGroup(jPanelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanelCentralLayout.createSequentialGroup()
                            .addComponent(jLabelRolPorAsignar)
                            .addGap(18, 18, 18)
                            .addComponent(jComboBoxRol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanelCentralLayout.createSequentialGroup()
                            .addComponent(jPanelCriterios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanelCentralLayout.createSequentialGroup()
                                    .addGap(42, 42, 42)
                                    .addComponent(jLabelErrorDigiteCodigo))
                                .addGroup(jPanelCentralLayout.createSequentialGroup()
                                    .addGap(32, 32, 32)
                                    .addComponent(jTextFieldDigiteCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGap(0, 0, Short.MAX_VALUE))
                .addGroup(jPanelCentralLayout.createSequentialGroup()
                    .addGroup(jPanelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanelMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 696, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanelCentralLayout.createSequentialGroup()
                            .addGap(150, 150, 150)
                            .addComponent(jPanelPaginacion, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jButtonAsignarRol, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(4, 4, 4)))
        );
        jPanelCentralLayout.setVerticalGroup(
            jPanelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCentralLayout.createSequentialGroup()
                .addComponent(jPanelMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelCentralLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanelCriterios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelCentralLayout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addGroup(jPanelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldDigiteCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(1, 1, 1)
                        .addComponent(jLabelErrorDigiteCodigo)))
                .addGap(18, 18, 18)
                .addGroup(jPanelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelRolPorAsignar)
                    .addComponent(jComboBoxRol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPaneTablaAsignacionMasivaRoles, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonAsignarRol, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanelPaginacion, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        getContentPane().add(jPanelCentral, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    private void estiloTablas(){
        int rojo = 204;
        int verde = 0;
        int azul = 0;
        float[] colores = Color.RGBtoHSB(rojo, verde, azul, null);
        float red = colores[0];
        float green = colores[1];
        float blue = colores[2];
        jTableAsignacionMasivaRoles.getTableHeader().setPreferredSize(new java.awt.Dimension(0,50));
        jTableAsignacionMasivaRoles.getTableHeader().setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 16));
        jTableAsignacionMasivaRoles.getTableHeader().setForeground(Color.WHITE);
        jTableAsignacionMasivaRoles.getTableHeader().setBackground(Color.getHSBColor(red, green, blue));
        jTableAsignacionMasivaRoles.setRowHeight(25);
        jTableAsignacionMasivaRoles.setValueAt((Object)"Romero Núñez", 1, 1);
        jTableAsignacionMasivaRoles.setValueAt((Object)"Jhon Fredy", 1, 2);   
    }
    
    private void jComboBoxPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxPerfilActionPerformed
        
        switch (jComboBoxPerfil.getSelectedIndex()) {
            
            case 1:
                VtnModificarLogin objVtnModificarLogin = new VtnModificarLogin(this.objCliente, this.nombrePerfil);
                objVtnModificarLogin.setVisible(true);
                this.dispose();
            break;
            case 2:
                VtnModificarContrasenia objVtnModificarContrasenia = new VtnModificarContrasenia(this.objCliente, this.nombrePerfil);
                objVtnModificarContrasenia.setVisible(true);
                this.dispose();
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

    private void jTextFieldDigiteCodigoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldDigiteCodigoFocusGained
        if(jTextFieldDigiteCodigo.getText().equals("Digite Código")){
            this.jTextFieldDigiteCodigo.setText("");
            jTextFieldDigiteCodigo.setForeground(new java.awt.Color(0, 0, 0));
        }
    }//GEN-LAST:event_jTextFieldDigiteCodigoFocusGained

    private void jTextFieldDigiteCodigoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldDigiteCodigoFocusLost
        if(jTextFieldDigiteCodigo.getText().equals("")){
            jTextFieldDigiteCodigo.setForeground(new java.awt.Color(153,153,153));
            jTextFieldDigiteCodigo.setText("Digite Código");
        }
    }//GEN-LAST:event_jTextFieldDigiteCodigoFocusLost

    private void jButtonAsignarRolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAsignarRolActionPerformed

    }//GEN-LAST:event_jButtonAsignarRolActionPerformed

    private void jToggleButtonAsignacionMasivaRolesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButtonAsignacionMasivaRolesActionPerformed
        
    }//GEN-LAST:event_jToggleButtonAsignacionMasivaRolesActionPerformed

    private void jToggleButtonGestionarUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButtonGestionarUsuariosActionPerformed
        VtnPrincipalAdmin objVtnPrincipalAdmin = new VtnPrincipalAdmin(objCliente, nombrePerfil);
        objVtnPrincipalAdmin.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jToggleButtonGestionarUsuariosActionPerformed

    private void jToggleButtonAyudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButtonAyudaActionPerformed
        Utilidades.mensajeError("Página en construcción", "Error");
        jToggleButtonAsignacionMasivaRoles.setSelected(true);
    }//GEN-LAST:event_jToggleButtonAyudaActionPerformed

    private void jToggleButtonPag1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButtonPag1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jToggleButtonPag1ActionPerformed

    private void jToggleButtonPag2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButtonPag2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jToggleButtonPag2ActionPerformed

    private void jToggleButtonPag3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButtonPag3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jToggleButtonPag3ActionPerformed

    private void jToggleButtonPag4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButtonPag4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jToggleButtonPag4ActionPerformed

    private void jToggleButtonPagXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButtonPagXActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jToggleButtonPagXActionPerformed

    private void jToggleButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jToggleButton7ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Barra;
    private javax.swing.JLabel IconoUniversidad;
    private javax.swing.ButtonGroup buttonGroupCriteriosBusquedaRol;
    private javax.swing.ButtonGroup buttonGroupMenu;
    private javax.swing.JButton jButtonAsignarRol;
    private javax.swing.JButton jButtonBuscar;
    private javax.swing.JButton jButtonPagAnterior;
    private javax.swing.JButton jButtonPagSiguiente;
    private javax.swing.JComboBox<String> jComboBoxPerfil;
    private javax.swing.JComboBox<String> jComboBoxRol;
    private javax.swing.JLabel jLabelDelCauca;
    private javax.swing.JLabel jLabelDesarrolladores;
    private javax.swing.JLabel jLabelErrorDigiteCodigo;
    private javax.swing.JLabel jLabelPerfil;
    private javax.swing.JLabel jLabelPerfil2;
    private javax.swing.JLabel jLabelRolPorAsignar;
    private javax.swing.JLabel jLabelSIRCA1;
    private javax.swing.JLabel jLabelSIRCA2;
    private javax.swing.JLabel jLabelSIRCA3;
    private javax.swing.JLabel jLabelTituloCriterios;
    private javax.swing.JLabel jLabelUniversidad;
    private javax.swing.JPanel jPanelCabeceraCriteriosRoles;
    private javax.swing.JPanel jPanelCentral;
    private javax.swing.JPanel jPanelCriterios;
    private javax.swing.JPanel jPanelInferior;
    private javax.swing.JPanel jPanelMenu;
    private javax.swing.JPanel jPanelPaginacion;
    private javax.swing.JPanel jPanelRadioButtons;
    private javax.swing.JPanel jPanelSuperior;
    private javax.swing.JRadioButton jRadioButtonAdministrativo;
    private javax.swing.JRadioButton jRadioButtonDocente;
    private javax.swing.JRadioButton jRadioButtonEstudiante;
    private javax.swing.JRadioButton jRadioButtonSinAsignar;
    private javax.swing.JScrollPane jScrollPaneTablaAsignacionMasivaRoles;
    private javax.swing.JTable jTableAsignacionMasivaRoles;
    private javax.swing.JTextField jTextFieldDigiteCodigo;
    private javax.swing.JToggleButton jToggleButton7;
    private javax.swing.JToggleButton jToggleButtonAsignacionMasivaRoles;
    private javax.swing.JToggleButton jToggleButtonAyuda;
    private javax.swing.JToggleButton jToggleButtonGestionarUsuarios;
    private javax.swing.JToggleButton jToggleButtonPag1;
    private javax.swing.JToggleButton jToggleButtonPag2;
    private javax.swing.JToggleButton jToggleButtonPag3;
    private javax.swing.JToggleButton jToggleButtonPag4;
    private javax.swing.JToggleButton jToggleButtonPagX;
    // End of variables declaration//GEN-END:variables
}
