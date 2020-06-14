package cliente.vista;

import java.awt.Color;

public class VtnModelo extends javax.swing.JFrame {

    public VtnModelo() {
        initComponents();
        estiloTablas();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupCriteriosBusqueda = new javax.swing.ButtonGroup();
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
        jPanelCriterios = new javax.swing.JPanel();
        jPanelCabeceraCriterios = new javax.swing.JPanel();
        jLabelTituloCriterios = new javax.swing.JLabel();
        jRadioButtonTodos = new javax.swing.JRadioButton();
        jRadioButtonDentro = new javax.swing.JRadioButton();
        jRadioButtonFuera = new javax.swing.JRadioButton();
        jButtonBuscar = new javax.swing.JButton();
        jTextFieldDigiteCodigo = new javax.swing.JTextField();
        jButtonRegistrarUsuario = new javax.swing.JButton();
        jPanelMenu = new javax.swing.JPanel();
        jToggleButtonGestionarUsuarios = new javax.swing.JToggleButton();
        jToggleButtonAsignacionMasivaRoles = new javax.swing.JToggleButton();
        jToggleButtonAyuda = new javax.swing.JToggleButton();
        jLabelErrorDigiteCodigo = new javax.swing.JLabel();
        jPanelContenedorTablas = new javax.swing.JPanel();
        jScrollPaneTablaUsuariosTodos = new javax.swing.JScrollPane();
        jTableUsuariosTodos = new javax.swing.JTable();
        jScrollPaneTablaUsuariosDentro = new javax.swing.JScrollPane();
        jTableUsuariosDentro = new javax.swing.JTable();
        jScrollPaneTablaUsuariosFuera = new javax.swing.JScrollPane();
        jTableUsuariosFuera = new javax.swing.JTable();

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
        jPanelSuperior.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        IconoUniversidad.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        IconoUniversidad.setForeground(new java.awt.Color(255, 255, 255));
        IconoUniversidad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/universidad_blanco.png"))); // NOI18N
        jPanelSuperior.add(IconoUniversidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 27, -1, -1));

        jLabelUniversidad.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 30)); // NOI18N
        jLabelUniversidad.setForeground(new java.awt.Color(255, 255, 255));
        jLabelUniversidad.setText("Universidad");
        jPanelSuperior.add(jLabelUniversidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 40, -1, -1));

        jLabelDelCauca.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 24)); // NOI18N
        jLabelDelCauca.setForeground(new java.awt.Color(255, 255, 255));
        jLabelDelCauca.setText("del Cauca");
        jPanelSuperior.add(jLabelDelCauca, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 70, -1, -1));

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

        jPanelSuperior.add(Barra, new org.netbeans.lib.awtextra.AbsoluteConstraints(422, 32, 2, 85));

        jLabelSIRCA1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 24)); // NOI18N
        jLabelSIRCA1.setForeground(new java.awt.Color(255, 255, 255));
        jLabelSIRCA1.setText("Sistema Integrado de");
        jLabelSIRCA1.setAlignmentY(0.0F);
        jPanelSuperior.add(jLabelSIRCA1, new org.netbeans.lib.awtextra.AbsoluteConstraints(499, 19, -1, -1));

        jLabelSIRCA2.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 24)); // NOI18N
        jLabelSIRCA2.setForeground(new java.awt.Color(255, 255, 255));
        jLabelSIRCA2.setText("Registro y Control");
        jLabelSIRCA2.setAlignmentY(0.0F);
        jPanelSuperior.add(jLabelSIRCA2, new org.netbeans.lib.awtextra.AbsoluteConstraints(517, 44, -1, -1));

        jLabelSIRCA3.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 24)); // NOI18N
        jLabelSIRCA3.setForeground(new java.awt.Color(255, 255, 255));
        jLabelSIRCA3.setText("de Acceso");
        jLabelSIRCA3.setAlignmentY(0.0F);
        jPanelSuperior.add(jLabelSIRCA3, new org.netbeans.lib.awtextra.AbsoluteConstraints(561, 69, -1, -1));

        jLabelPerfil.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        jLabelPerfil.setForeground(new java.awt.Color(255, 255, 255));
        jPanelSuperior.add(jLabelPerfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(694, 141, -1, -1));

        jLabelPerfil2.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        jLabelPerfil2.setForeground(new java.awt.Color(255, 255, 255));
        jLabelPerfil2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/user-32.png"))); // NOI18N
        jPanelSuperior.add(jLabelPerfil2, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 110, -1, -1));

        jComboBoxPerfil.setBackground(new java.awt.Color(204, 0, 0));
        jComboBoxPerfil.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jComboBoxPerfil.setForeground(new java.awt.Color(255, 255, 255));
        jComboBoxPerfil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administrador12", "Modificar Login", "Modificar Contraseña", "Cerrar Sesión" }));
        jComboBoxPerfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxPerfilActionPerformed(evt);
            }
        });
        jPanelSuperior.add(jComboBoxPerfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 110, -1, -1));

        getContentPane().add(jPanelSuperior, java.awt.BorderLayout.PAGE_START);

        jPanelCentral.setBackground(new java.awt.Color(0, 0, 102));
        jPanelCentral.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelCentral.setMaximumSize(new java.awt.Dimension(700, 510));
        jPanelCentral.setMinimumSize(new java.awt.Dimension(700, 510));
        jPanelCentral.setPreferredSize(new java.awt.Dimension(700, 510));

        jPanelCriterios.setBackground(new java.awt.Color(255, 255, 255));
        jPanelCriterios.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jPanelCabeceraCriterios.setBackground(new java.awt.Color(204, 0, 0));
        jPanelCabeceraCriterios.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabelTituloCriterios.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        jLabelTituloCriterios.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTituloCriterios.setText("Criterios de Búsqueda");
        jPanelCabeceraCriterios.add(jLabelTituloCriterios);

        jRadioButtonTodos.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroupCriteriosBusqueda.add(jRadioButtonTodos);
        jRadioButtonTodos.setSelected(true);
        jRadioButtonTodos.setText("Todos");
        jRadioButtonTodos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jRadioButtonTodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonTodosActionPerformed(evt);
            }
        });

        jRadioButtonDentro.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroupCriteriosBusqueda.add(jRadioButtonDentro);
        jRadioButtonDentro.setText("Dentro de la instalación");
        jRadioButtonDentro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonDentroActionPerformed(evt);
            }
        });

        jRadioButtonFuera.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroupCriteriosBusqueda.add(jRadioButtonFuera);
        jRadioButtonFuera.setText("Fuera de la instalación");
        jRadioButtonFuera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonFueraActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelCriteriosLayout = new javax.swing.GroupLayout(jPanelCriterios);
        jPanelCriterios.setLayout(jPanelCriteriosLayout);
        jPanelCriteriosLayout.setHorizontalGroup(
            jPanelCriteriosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelCabeceraCriterios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelCriteriosLayout.createSequentialGroup()
                .addContainerGap(41, Short.MAX_VALUE)
                .addGroup(jPanelCriteriosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButtonTodos)
                    .addComponent(jRadioButtonDentro)
                    .addComponent(jRadioButtonFuera))
                .addGap(48, 48, 48))
        );
        jPanelCriteriosLayout.setVerticalGroup(
            jPanelCriteriosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCriteriosLayout.createSequentialGroup()
                .addComponent(jPanelCabeceraCriterios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jRadioButtonTodos)
                .addGap(0, 0, 0)
                .addComponent(jRadioButtonDentro)
                .addGap(0, 0, 0)
                .addComponent(jRadioButtonFuera))
        );

        jButtonBuscar.setBackground(new java.awt.Color(204, 0, 0));
        jButtonBuscar.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        jButtonBuscar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/search-13-16.png"))); // NOI18N
        jButtonBuscar.setText("Buscar");

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

        jButtonRegistrarUsuario.setBackground(new java.awt.Color(204, 0, 0));
        jButtonRegistrarUsuario.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        jButtonRegistrarUsuario.setForeground(new java.awt.Color(255, 255, 255));
        jButtonRegistrarUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/add.png"))); // NOI18N
        jButtonRegistrarUsuario.setText("Registrar Usuario");
        jButtonRegistrarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegistrarUsuarioActionPerformed(evt);
            }
        });

        jPanelMenu.setBackground(new java.awt.Color(0, 0, 102));

        jToggleButtonGestionarUsuarios.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroupMenu.add(jToggleButtonGestionarUsuarios);
        jToggleButtonGestionarUsuarios.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jToggleButtonGestionarUsuarios.setSelected(true);
        jToggleButtonGestionarUsuarios.setText("Gestionar Usuarios");
        jToggleButtonGestionarUsuarios.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jToggleButtonGestionarUsuarios.setMaximumSize(new java.awt.Dimension(210, 29));
        jToggleButtonGestionarUsuarios.setMinimumSize(new java.awt.Dimension(210, 29));
        jToggleButtonGestionarUsuarios.setPreferredSize(new java.awt.Dimension(270, 29));
        jToggleButtonGestionarUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButtonGestionarUsuariosActionPerformed(evt);
            }
        });
        jPanelMenu.add(jToggleButtonGestionarUsuarios);

        jToggleButtonAsignacionMasivaRoles.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroupMenu.add(jToggleButtonAsignacionMasivaRoles);
        jToggleButtonAsignacionMasivaRoles.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jToggleButtonAsignacionMasivaRoles.setText("Asignación Masiva de Roles");
        jToggleButtonAsignacionMasivaRoles.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jToggleButtonAsignacionMasivaRoles.setMaximumSize(new java.awt.Dimension(210, 29));
        jToggleButtonAsignacionMasivaRoles.setMinimumSize(new java.awt.Dimension(210, 29));
        jToggleButtonAsignacionMasivaRoles.setPreferredSize(new java.awt.Dimension(270, 29));
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
        jToggleButtonAyuda.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jToggleButtonAyuda.setMaximumSize(new java.awt.Dimension(210, 29));
        jToggleButtonAyuda.setMinimumSize(new java.awt.Dimension(210, 29));
        jToggleButtonAyuda.setPreferredSize(new java.awt.Dimension(270, 29));
        jPanelMenu.add(jToggleButtonAyuda);

        jLabelErrorDigiteCodigo.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        jLabelErrorDigiteCodigo.setForeground(new java.awt.Color(255, 0, 0));
        jLabelErrorDigiteCodigo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelErrorDigiteCodigo.setText("Error");

        jPanelContenedorTablas.setLayout(new java.awt.CardLayout());

        jScrollPaneTablaUsuariosTodos.setMaximumSize(new java.awt.Dimension(585, 272));
        jScrollPaneTablaUsuariosTodos.setMinimumSize(new java.awt.Dimension(585, 272));
        jScrollPaneTablaUsuariosTodos.setPreferredSize(new java.awt.Dimension(585, 272));

        jTableUsuariosTodos.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jTableUsuariosTodos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Código", "Apellidos", "Nombres", "Rol", "Genero", "Opciones"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                true, true, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableUsuariosTodos.setGridColor(new java.awt.Color(204, 204, 204));
        jScrollPaneTablaUsuariosTodos.setViewportView(jTableUsuariosTodos);
        if (jTableUsuariosTodos.getColumnModel().getColumnCount() > 0) {
            jTableUsuariosTodos.getColumnModel().getColumn(3).setResizable(false);
            jTableUsuariosTodos.getColumnModel().getColumn(4).setResizable(false);
            jTableUsuariosTodos.getColumnModel().getColumn(5).setResizable(false);
        }

        jPanelContenedorTablas.add(jScrollPaneTablaUsuariosTodos, "card2");

        jScrollPaneTablaUsuariosDentro.setMaximumSize(new java.awt.Dimension(585, 272));
        jScrollPaneTablaUsuariosDentro.setMinimumSize(new java.awt.Dimension(585, 272));
        jScrollPaneTablaUsuariosDentro.setPreferredSize(new java.awt.Dimension(585, 272));

        jTableUsuariosDentro.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jTableUsuariosDentro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Código", "Apellidos", "Nombres", "Rol", "Genero", "<html>Fecha de <br> Ingreso</html>", "<html>Hora de <br> Ingreso</html>", "Opciones"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPaneTablaUsuariosDentro.setViewportView(jTableUsuariosDentro);

        jPanelContenedorTablas.add(jScrollPaneTablaUsuariosDentro, "card2");

        jScrollPaneTablaUsuariosFuera.setMaximumSize(new java.awt.Dimension(585, 272));
        jScrollPaneTablaUsuariosFuera.setMinimumSize(new java.awt.Dimension(585, 272));
        jScrollPaneTablaUsuariosFuera.setPreferredSize(new java.awt.Dimension(585, 272));

        jTableUsuariosFuera.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jTableUsuariosFuera.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Código", "Apellidos", "Nombres", "Rol", "Genero", "<html>Fecha de <br> Salida</html>", "<html>Hora de <br> Salida</html>", "Opciones"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPaneTablaUsuariosFuera.setViewportView(jTableUsuariosFuera);

        jPanelContenedorTablas.add(jScrollPaneTablaUsuariosFuera, "card2");

        javax.swing.GroupLayout jPanelCentralLayout = new javax.swing.GroupLayout(jPanelCentral);
        jPanelCentral.setLayout(jPanelCentralLayout);
        jPanelCentralLayout.setHorizontalGroup(
            jPanelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanelCentralLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButtonRegistrarUsuario)
                    .addGroup(jPanelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jPanelContenedorTablas, javax.swing.GroupLayout.PREFERRED_SIZE, 808, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelCentralLayout.createSequentialGroup()
                            .addComponent(jPanelCriterios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanelCentralLayout.createSequentialGroup()
                                    .addComponent(jTextFieldDigiteCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(85, 85, 85)
                                    .addComponent(jButtonBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jLabelErrorDigiteCodigo)))))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        jPanelCentralLayout.setVerticalGroup(
            jPanelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCentralLayout.createSequentialGroup()
                .addComponent(jPanelMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelCriterios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelCentralLayout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(jPanelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldDigiteCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelErrorDigiteCodigo)))
                .addGap(18, 18, 18)
                .addComponent(jPanelContenedorTablas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonRegistrarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
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
        jScrollPaneTablaUsuariosTodos.setVisible(true);
        jScrollPaneTablaUsuariosDentro.setVisible(false);
        jScrollPaneTablaUsuariosFuera.setVisible(false);
        jTableUsuariosTodos.getTableHeader().setPreferredSize(new java.awt.Dimension(0,50));
        jTableUsuariosTodos.getTableHeader().setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 16));
        jTableUsuariosTodos.getTableHeader().setForeground(Color.WHITE);
        jTableUsuariosTodos.getTableHeader().setBackground(Color.getHSBColor(red, green, blue));
        jTableUsuariosTodos.setRowHeight(25);
        jTableUsuariosDentro.getTableHeader().setPreferredSize(new java.awt.Dimension(0,50));
        jTableUsuariosDentro.getTableHeader().setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 16));
        jTableUsuariosDentro.getTableHeader().setForeground(Color.WHITE);
        jTableUsuariosDentro.getTableHeader().setBackground(Color.getHSBColor(red, green, blue));
        jTableUsuariosDentro.setRowHeight(25);
        jTableUsuariosFuera.getTableHeader().setPreferredSize(new java.awt.Dimension(0,50));
        jTableUsuariosFuera.getTableHeader().setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 16));
        jTableUsuariosFuera.getTableHeader().setForeground(Color.WHITE);
        jTableUsuariosFuera.getTableHeader().setBackground(Color.getHSBColor(red, green, blue));
        jTableUsuariosFuera.setRowHeight(25);
    }
    
    private void jComboBoxPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxPerfilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxPerfilActionPerformed

    private void jRadioButtonTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonTodosActionPerformed
        if(jRadioButtonTodos.isSelected())
        {
            jScrollPaneTablaUsuariosTodos.setVisible(true);
            jScrollPaneTablaUsuariosDentro.setVisible(false);
            jScrollPaneTablaUsuariosFuera.setVisible(false);
        }
    }//GEN-LAST:event_jRadioButtonTodosActionPerformed

    private void jRadioButtonDentroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonDentroActionPerformed
        if(jRadioButtonDentro.isSelected())
        {
            jScrollPaneTablaUsuariosTodos.setVisible(false);
            jScrollPaneTablaUsuariosDentro.setVisible(true);
            jScrollPaneTablaUsuariosFuera.setVisible(false);
        }
    }//GEN-LAST:event_jRadioButtonDentroActionPerformed

    private void jRadioButtonFueraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonFueraActionPerformed
        if(jRadioButtonFuera.isSelected())
        {
            jScrollPaneTablaUsuariosTodos.setVisible(false);
            jScrollPaneTablaUsuariosDentro.setVisible(false);
            jScrollPaneTablaUsuariosFuera.setVisible(true);
        }
    }//GEN-LAST:event_jRadioButtonFueraActionPerformed

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

    private void jButtonRegistrarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegistrarUsuarioActionPerformed

    }//GEN-LAST:event_jButtonRegistrarUsuarioActionPerformed

    private void jToggleButtonAsignacionMasivaRolesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButtonAsignacionMasivaRolesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jToggleButtonAsignacionMasivaRolesActionPerformed

    private void jToggleButtonGestionarUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButtonGestionarUsuariosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jToggleButtonGestionarUsuariosActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Barra;
    private javax.swing.JLabel IconoUniversidad;
    private javax.swing.ButtonGroup buttonGroupCriteriosBusqueda;
    private javax.swing.ButtonGroup buttonGroupMenu;
    private javax.swing.JButton jButtonBuscar;
    private javax.swing.JButton jButtonRegistrarUsuario;
    private javax.swing.JComboBox<String> jComboBoxPerfil;
    private javax.swing.JLabel jLabelDelCauca;
    private javax.swing.JLabel jLabelDesarrolladores;
    private javax.swing.JLabel jLabelErrorDigiteCodigo;
    private javax.swing.JLabel jLabelPerfil;
    private javax.swing.JLabel jLabelPerfil2;
    private javax.swing.JLabel jLabelSIRCA1;
    private javax.swing.JLabel jLabelSIRCA2;
    private javax.swing.JLabel jLabelSIRCA3;
    private javax.swing.JLabel jLabelTituloCriterios;
    private javax.swing.JLabel jLabelUniversidad;
    private javax.swing.JPanel jPanelCabeceraCriterios;
    private javax.swing.JPanel jPanelCentral;
    private javax.swing.JPanel jPanelContenedorTablas;
    private javax.swing.JPanel jPanelCriterios;
    private javax.swing.JPanel jPanelInferior;
    private javax.swing.JPanel jPanelMenu;
    private javax.swing.JPanel jPanelSuperior;
    private javax.swing.JRadioButton jRadioButtonDentro;
    private javax.swing.JRadioButton jRadioButtonFuera;
    private javax.swing.JRadioButton jRadioButtonTodos;
    private javax.swing.JScrollPane jScrollPaneTablaUsuariosDentro;
    private javax.swing.JScrollPane jScrollPaneTablaUsuariosFuera;
    private javax.swing.JScrollPane jScrollPaneTablaUsuariosTodos;
    private javax.swing.JTable jTableUsuariosDentro;
    private javax.swing.JTable jTableUsuariosFuera;
    private javax.swing.JTable jTableUsuariosTodos;
    private javax.swing.JTextField jTextFieldDigiteCodigo;
    private javax.swing.JToggleButton jToggleButtonAsignacionMasivaRoles;
    private javax.swing.JToggleButton jToggleButtonAyuda;
    private javax.swing.JToggleButton jToggleButtonGestionarUsuarios;
    // End of variables declaration//GEN-END:variables
}
