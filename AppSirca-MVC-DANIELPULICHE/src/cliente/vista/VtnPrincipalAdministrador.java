package cliente.vista;

import cliente.servicios.cliente;
import java.awt.Image;
import java.awt.Toolkit;

public class VtnPrincipalAdministrador extends javax.swing.JFrame {

    private cliente objCliente;
    private String admin;
    
    public VtnPrincipalAdministrador(cliente objCliente, String login) {
        initComponents();
        jLabelErrorDigiteCodigo.setVisible(false);
        Image icon = Toolkit.getDefaultToolkit().getImage("./src/recursos/logo.png");
        this.setIconImage(icon);
        this.objCliente = objCliente;
        this.admin = login;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupCriteriosBusqueda = new javax.swing.ButtonGroup();
        buttonGroupMenu = new javax.swing.ButtonGroup();
        jPanelSuperior = new javax.swing.JPanel();
        IconoUniversidad = new javax.swing.JLabel();
        jLabelUniversidad = new javax.swing.JLabel();
        jLabelDelCauca = new javax.swing.JLabel();
        Barra = new javax.swing.JPanel();
        jLabelSIRCA1 = new javax.swing.JLabel();
        jLabelSIRCA2 = new javax.swing.JLabel();
        jLabelSIRCA3 = new javax.swing.JLabel();
        jComboBoxPerfil = new javax.swing.JComboBox<>();
        jLabelPerfil = new javax.swing.JLabel();
        jPanelInferior = new javax.swing.JPanel();
        jLabelDesarrolladores = new javax.swing.JLabel();
        jPanelCentral = new javax.swing.JPanel();
        jPanelCriterios = new javax.swing.JPanel();
        jPanelCabeceraCriterios = new javax.swing.JPanel();
        jLabelTituloCriterios = new javax.swing.JLabel();
        jRadioButtonTodos = new javax.swing.JRadioButton();
        jRadioButtonDentro = new javax.swing.JRadioButton();
        jRadioButtonFuera = new javax.swing.JRadioButton();
        jScrollPaneParaTabla = new javax.swing.JScrollPane();
        jTableUsuarios = new javax.swing.JTable();
        jButtonBuscar = new javax.swing.JButton();
        jTextFieldDigiteCodigo = new javax.swing.JTextField();
        jButtonRegistrarUsuario = new javax.swing.JButton();
        jPanelMenu = new javax.swing.JPanel();
        jToggleButtonGestionarUsuarios = new javax.swing.JToggleButton();
        jToggleButtonAsignacionMasivaRoles = new javax.swing.JToggleButton();
        jToggleButtonAyuda = new javax.swing.JToggleButton();
        jLabelErrorDigiteCodigo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(700, 680));
        setMinimumSize(new java.awt.Dimension(700, 680));
        setResizable(false);

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

        jLabelPerfil.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        jLabelPerfil.setForeground(new java.awt.Color(255, 255, 255));
        jLabelPerfil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/user-32.png"))); // NOI18N
        jPanelSuperior.add(jLabelPerfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(522, 105, -1, -1));

        getContentPane().add(jPanelSuperior, java.awt.BorderLayout.PAGE_START);

        jPanelInferior.setBackground(new java.awt.Color(255, 255, 255));
        jPanelInferior.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelInferior.setMaximumSize(new java.awt.Dimension(700, 30));
        jPanelInferior.setMinimumSize(new java.awt.Dimension(700, 30));
        jPanelInferior.setPreferredSize(new java.awt.Dimension(700, 30));

        jLabelDesarrolladores.setForeground(new java.awt.Color(0, 0, 0));
        jLabelDesarrolladores.setText("F&P Software Development || www.fypsoftwaredevelopment.com || 2020");
        jPanelInferior.add(jLabelDesarrolladores);

        getContentPane().add(jPanelInferior, java.awt.BorderLayout.PAGE_END);

        jPanelCentral.setBackground(new java.awt.Color(0, 0, 102));
        jPanelCentral.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelCentral.setMaximumSize(new java.awt.Dimension(700, 510));
        jPanelCentral.setMinimumSize(new java.awt.Dimension(700, 510));
        jPanelCentral.setPreferredSize(new java.awt.Dimension(700, 510));
        jPanelCentral.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        jRadioButtonTodos.setForeground(new java.awt.Color(0, 0, 0));
        jRadioButtonTodos.setText("Todos");
        jRadioButtonTodos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jRadioButtonTodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonTodosActionPerformed(evt);
            }
        });

        jRadioButtonDentro.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroupCriteriosBusqueda.add(jRadioButtonDentro);
        jRadioButtonDentro.setForeground(new java.awt.Color(0, 0, 0));
        jRadioButtonDentro.setText("Dentro de la instalación");
        jRadioButtonDentro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonDentroActionPerformed(evt);
            }
        });

        jRadioButtonFuera.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroupCriteriosBusqueda.add(jRadioButtonFuera);
        jRadioButtonFuera.setForeground(new java.awt.Color(0, 0, 0));
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
            .addComponent(jPanelCabeceraCriterios, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(jPanelCriteriosLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanelCriteriosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButtonTodos)
                    .addComponent(jRadioButtonDentro)
                    .addComponent(jRadioButtonFuera)))
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

        jPanelCentral.add(jPanelCriterios, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 59, -1, -1));

        jTableUsuarios.setBackground(new java.awt.Color(255, 255, 255));
        jTableUsuarios.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jTableUsuarios.setForeground(new java.awt.Color(0, 0, 0));
        jTableUsuarios.setModel(new javax.swing.table.DefaultTableModel(
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

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPaneParaTabla.setViewportView(jTableUsuarios);

        jPanelCentral.add(jScrollPaneParaTabla, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 184, 585, 272));

        jButtonBuscar.setBackground(new java.awt.Color(204, 0, 0));
        jButtonBuscar.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        jButtonBuscar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/search-13-16.png"))); // NOI18N
        jButtonBuscar.setText("Buscar");
        jPanelCentral.add(jButtonBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(554, 97, 110, 30));

        jTextFieldDigiteCodigo.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldDigiteCodigo.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jTextFieldDigiteCodigo.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldDigiteCodigo.setText("Digite Código");
        jTextFieldDigiteCodigo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextFieldDigiteCodigoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextFieldDigiteCodigoFocusLost(evt);
            }
        });
        jPanelCentral.add(jTextFieldDigiteCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(306, 97, 230, 30));

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
        jPanelCentral.add(jButtonRegistrarUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(522, 467, -1, 30));

        jPanelMenu.setBackground(new java.awt.Color(0, 0, 102));

        jToggleButtonGestionarUsuarios.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroupMenu.add(jToggleButtonGestionarUsuarios);
        jToggleButtonGestionarUsuarios.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jToggleButtonGestionarUsuarios.setForeground(new java.awt.Color(0, 0, 0));
        jToggleButtonGestionarUsuarios.setSelected(true);
        jToggleButtonGestionarUsuarios.setText("Gestionar Usuarios");
        jToggleButtonGestionarUsuarios.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jToggleButtonGestionarUsuarios.setMaximumSize(new java.awt.Dimension(210, 29));
        jToggleButtonGestionarUsuarios.setMinimumSize(new java.awt.Dimension(210, 29));
        jToggleButtonGestionarUsuarios.setPreferredSize(new java.awt.Dimension(210, 29));
        jPanelMenu.add(jToggleButtonGestionarUsuarios);

        jToggleButtonAsignacionMasivaRoles.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroupMenu.add(jToggleButtonAsignacionMasivaRoles);
        jToggleButtonAsignacionMasivaRoles.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jToggleButtonAsignacionMasivaRoles.setForeground(new java.awt.Color(0, 0, 0));
        jToggleButtonAsignacionMasivaRoles.setText("Asignación Masiva de Roles");
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
        jToggleButtonAyuda.setForeground(new java.awt.Color(0, 0, 0));
        jToggleButtonAyuda.setText("Ayuda");
        jToggleButtonAyuda.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jToggleButtonAyuda.setMaximumSize(new java.awt.Dimension(210, 29));
        jToggleButtonAyuda.setMinimumSize(new java.awt.Dimension(210, 29));
        jToggleButtonAyuda.setPreferredSize(new java.awt.Dimension(210, 29));
        jPanelMenu.add(jToggleButtonAyuda);

        jPanelCentral.add(jPanelMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 2, 696, -1));

        jLabelErrorDigiteCodigo.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        jLabelErrorDigiteCodigo.setForeground(new java.awt.Color(255, 0, 0));
        jLabelErrorDigiteCodigo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelErrorDigiteCodigo.setText("Error");
        jPanelCentral.add(jLabelErrorDigiteCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(306, 128, -1, -1));

        getContentPane().add(jPanelCentral, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButtonTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonTodosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButtonTodosActionPerformed

    private void jRadioButtonDentroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonDentroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButtonDentroActionPerformed

    private void jRadioButtonFueraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonFueraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButtonFueraActionPerformed

    private void jToggleButtonAsignacionMasivaRolesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButtonAsignacionMasivaRolesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jToggleButtonAsignacionMasivaRolesActionPerformed

    private void jButtonRegistrarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegistrarUsuarioActionPerformed
        VtnRegistrarUsuario ObjVtnRegistrarUsuario = new VtnRegistrarUsuario(admin);
        ObjVtnRegistrarUsuario.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButtonRegistrarUsuarioActionPerformed

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

    private void jComboBoxPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxPerfilActionPerformed

        //Ajustar al trabajo
        
//        switch (jComboBoxPerfil.getSelectedIndex()) {
//            case 1:
//            VtnModificarLogin objVtnModificarLogin = new VtnModificarLogin();
//            objVtnModificarLogin.setVisible(true);
//            this.dispose();
//            break;
//            case 2:
//            VtnModificarContrasenia objVtnModificarContrasenia = new VtnModificarContrasenia();
//            objVtnModificarContrasenia.setVisible(true);
//            this.dispose();
//            break;
//            case 3:
//            VtnIngresarAlSistema objVtnIngresarSistema = new VtnIngresarAlSistema();
//            objVtnIngresarSistema.setVisible(true);
//            this.dispose();
//            break;
//            default:
//            break;
//        }
        
    }//GEN-LAST:event_jComboBoxPerfilActionPerformed

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
    private javax.swing.JLabel jLabelSIRCA1;
    private javax.swing.JLabel jLabelSIRCA2;
    private javax.swing.JLabel jLabelSIRCA3;
    private javax.swing.JLabel jLabelTituloCriterios;
    private javax.swing.JLabel jLabelUniversidad;
    private javax.swing.JPanel jPanelCabeceraCriterios;
    private javax.swing.JPanel jPanelCentral;
    private javax.swing.JPanel jPanelCriterios;
    private javax.swing.JPanel jPanelInferior;
    private javax.swing.JPanel jPanelMenu;
    private javax.swing.JPanel jPanelSuperior;
    private javax.swing.JRadioButton jRadioButtonDentro;
    private javax.swing.JRadioButton jRadioButtonFuera;
    private javax.swing.JRadioButton jRadioButtonTodos;
    private javax.swing.JScrollPane jScrollPaneParaTabla;
    private javax.swing.JTable jTableUsuarios;
    private javax.swing.JTextField jTextFieldDigiteCodigo;
    private javax.swing.JToggleButton jToggleButtonAsignacionMasivaRoles;
    private javax.swing.JToggleButton jToggleButtonAyuda;
    private javax.swing.JToggleButton jToggleButtonGestionarUsuarios;
    // End of variables declaration//GEN-END:variables
}