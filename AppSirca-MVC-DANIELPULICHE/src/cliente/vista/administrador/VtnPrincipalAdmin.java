package cliente.vista.administrador;

import cliente.servicios.cliente;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultCellEditor;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import modelo.DTO.ClsPeticionDTO;
import modelo.DTO.ClsRegistroDTO;
import modelo.DTO.ClsResultadoDTO;
import modelo.DTO.ClsUsuarioDTO;
import utilidades.Utilidades;

public class VtnPrincipalAdmin extends javax.swing.JFrame {

    private cliente objCliente;
    private String nombrePerfil;
    private String codigoParaAsignarRol;
    private String rolNuevo;
    
    public VtnPrincipalAdmin(cliente objCliente, String login) {
        initComponents();
        Image icon = Toolkit.getDefaultToolkit().getImage("./src/Recursos/logo.png");
        this.setIconImage(icon);
        estiloTablas();
        this.objCliente = objCliente;
        this.nombrePerfil = login;
        ocultarErrores();
        this.jComboBoxPerfil.insertItemAt(this.nombrePerfil, 0);
        this.jComboBoxPerfil.setSelectedIndex(0);
        listarUsuarios();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupCriteriosBusqueda = new javax.swing.ButtonGroup();
        buttonGroupMenu = new javax.swing.ButtonGroup();
        buttonGroupPaginacion = new javax.swing.ButtonGroup();
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
        jPanelRadios = new javax.swing.JPanel();
        jRadioButtonTodos = new javax.swing.JRadioButton();
        jRadioButtonDentro = new javax.swing.JRadioButton();
        jRadioButtonFuera = new javax.swing.JRadioButton();
        jTextFieldDigiteCodigo = new javax.swing.JTextField();
        jButtonRegistrarUsuario = new javax.swing.JButton();
        jPanelMenu = new javax.swing.JPanel();
        jToggleButtonGestionarUsuarios = new javax.swing.JToggleButton();
        jToggleButtonAsignacionMasivaRoles = new javax.swing.JToggleButton();
        jToggleButtonAyuda = new javax.swing.JToggleButton();
        jLabelErrorDigiteCodigo = new javax.swing.JLabel();
        jPanelContenedorTablas = new javax.swing.JPanel();
        jScrollPaneTablaUsuariosFuera = new javax.swing.JScrollPane();
        jTableUsuariosFuera = new javax.swing.JTable();
        jScrollPaneTablaUsuariosTodos = new javax.swing.JScrollPane();
        jTableUsuariosTodos = new javax.swing.JTable();
        jScrollPaneTablaUsuariosDentro = new javax.swing.JScrollPane();
        jTableUsuariosDentro = new javax.swing.JTable();
        jButtonBuscar = new javax.swing.JButton();
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
        jPanelSuperior.setPreferredSize(new java.awt.Dimension(880, 140));
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

        jPanelSuperior.add(Barra, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 30, 2, 85));

        jLabelSIRCA1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 24)); // NOI18N
        jLabelSIRCA1.setForeground(new java.awt.Color(255, 255, 255));
        jLabelSIRCA1.setText("Sistema Integrado de");
        jLabelSIRCA1.setAlignmentY(0.0F);
        jPanelSuperior.add(jLabelSIRCA1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 30, -1, -1));

        jLabelSIRCA2.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 24)); // NOI18N
        jLabelSIRCA2.setForeground(new java.awt.Color(255, 255, 255));
        jLabelSIRCA2.setText("Registro y Control");
        jLabelSIRCA2.setAlignmentY(0.0F);
        jPanelSuperior.add(jLabelSIRCA2, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 55, -1, -1));

        jLabelSIRCA3.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 24)); // NOI18N
        jLabelSIRCA3.setForeground(new java.awt.Color(255, 255, 255));
        jLabelSIRCA3.setText("de Acceso");
        jLabelSIRCA3.setAlignmentY(0.0F);
        jPanelSuperior.add(jLabelSIRCA3, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 80, -1, -1));

        jLabelPerfil.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        jLabelPerfil.setForeground(new java.awt.Color(255, 255, 255));
        jPanelSuperior.add(jLabelPerfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(694, 141, -1, -1));

        jLabelPerfil2.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        jLabelPerfil2.setForeground(new java.awt.Color(255, 255, 255));
        jLabelPerfil2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/user-32.png"))); // NOI18N
        jPanelSuperior.add(jLabelPerfil2, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 105, -1, -1));

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
        jPanelSuperior.add(jComboBoxPerfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(726, 108, 170, -1));

        getContentPane().add(jPanelSuperior, java.awt.BorderLayout.PAGE_START);

        jPanelCentral.setBackground(new java.awt.Color(0, 0, 102));
        jPanelCentral.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelCentral.setMaximumSize(new java.awt.Dimension(700, 510));
        jPanelCentral.setMinimumSize(new java.awt.Dimension(700, 510));
        jPanelCentral.setPreferredSize(new java.awt.Dimension(900, 510));

        jPanelCriterios.setBackground(new java.awt.Color(255, 255, 255));
        jPanelCriterios.setPreferredSize(new java.awt.Dimension(160, 100));
        jPanelCriterios.setLayout(new java.awt.BorderLayout());

        jPanelCabeceraCriterios.setBackground(new java.awt.Color(204, 0, 0));
        jPanelCabeceraCriterios.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelCabeceraCriterios.setPreferredSize(new java.awt.Dimension(150, 30));
        jPanelCabeceraCriterios.setLayout(new java.awt.GridBagLayout());

        jLabelTituloCriterios.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        jLabelTituloCriterios.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTituloCriterios.setText("Criterios de Búsqueda");
        jPanelCabeceraCriterios.add(jLabelTituloCriterios, new java.awt.GridBagConstraints());

        jPanelCriterios.add(jPanelCabeceraCriterios, java.awt.BorderLayout.PAGE_START);

        jPanelRadios.setBackground(new java.awt.Color(255, 255, 255));
        jPanelRadios.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelRadios.setPreferredSize(new java.awt.Dimension(160, 70));

        jRadioButtonTodos.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroupCriteriosBusqueda.add(jRadioButtonTodos);
        jRadioButtonTodos.setSelected(true);
        jRadioButtonTodos.setText("Todos");
        jRadioButtonTodos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jRadioButtonTodos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jRadioButtonTodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonTodosActionPerformed(evt);
            }
        });

        jRadioButtonDentro.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroupCriteriosBusqueda.add(jRadioButtonDentro);
        jRadioButtonDentro.setText("Dentro de la instalación");
        jRadioButtonDentro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jRadioButtonDentro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonDentroActionPerformed(evt);
            }
        });

        jRadioButtonFuera.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroupCriteriosBusqueda.add(jRadioButtonFuera);
        jRadioButtonFuera.setText("Fuera de la instalación");
        jRadioButtonFuera.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jRadioButtonFuera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonFueraActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelRadiosLayout = new javax.swing.GroupLayout(jPanelRadios);
        jPanelRadios.setLayout(jPanelRadiosLayout);
        jPanelRadiosLayout.setHorizontalGroup(
            jPanelRadiosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelRadiosLayout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addGroup(jPanelRadiosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButtonFuera)
                    .addComponent(jRadioButtonTodos)
                    .addComponent(jRadioButtonDentro)))
        );
        jPanelRadiosLayout.setVerticalGroup(
            jPanelRadiosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelRadiosLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jRadioButtonFuera))
            .addGroup(jPanelRadiosLayout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addComponent(jRadioButtonTodos))
            .addGroup(jPanelRadiosLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jRadioButtonDentro))
        );

        jPanelCriterios.add(jPanelRadios, java.awt.BorderLayout.CENTER);

        jTextFieldDigiteCodigo.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jTextFieldDigiteCodigo.setForeground(new java.awt.Color(102, 102, 102));
        jTextFieldDigiteCodigo.setText("Digite Código");
        jTextFieldDigiteCodigo.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jTextFieldDigiteCodigo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextFieldDigiteCodigoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextFieldDigiteCodigoFocusLost(evt);
            }
        });
        jTextFieldDigiteCodigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldDigiteCodigoKeyPressed(evt);
            }
        });

        jButtonRegistrarUsuario.setBackground(new java.awt.Color(204, 0, 0));
        jButtonRegistrarUsuario.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        jButtonRegistrarUsuario.setForeground(new java.awt.Color(255, 255, 255));
        jButtonRegistrarUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/add.png"))); // NOI18N
        jButtonRegistrarUsuario.setText("Registrar Usuario");
        jButtonRegistrarUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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
        jToggleButtonGestionarUsuarios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jToggleButtonGestionarUsuarios.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jToggleButtonGestionarUsuarios.setMaximumSize(new java.awt.Dimension(210, 29));
        jToggleButtonGestionarUsuarios.setMinimumSize(new java.awt.Dimension(210, 29));
        jToggleButtonGestionarUsuarios.setPreferredSize(new java.awt.Dimension(270, 29));
        jPanelMenu.add(jToggleButtonGestionarUsuarios);

        jToggleButtonAsignacionMasivaRoles.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroupMenu.add(jToggleButtonAsignacionMasivaRoles);
        jToggleButtonAsignacionMasivaRoles.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jToggleButtonAsignacionMasivaRoles.setText("Asignación Masiva de Roles");
        jToggleButtonAsignacionMasivaRoles.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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
        jToggleButtonAyuda.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jToggleButtonAyuda.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jToggleButtonAyuda.setMaximumSize(new java.awt.Dimension(210, 29));
        jToggleButtonAyuda.setMinimumSize(new java.awt.Dimension(210, 29));
        jToggleButtonAyuda.setPreferredSize(new java.awt.Dimension(270, 29));
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

        jPanelContenedorTablas.setBackground(new java.awt.Color(255, 255, 255));
        jPanelContenedorTablas.setLayout(new java.awt.CardLayout());

        jScrollPaneTablaUsuariosFuera.setMaximumSize(new java.awt.Dimension(585, 272));
        jScrollPaneTablaUsuariosFuera.setMinimumSize(new java.awt.Dimension(585, 272));
        jScrollPaneTablaUsuariosFuera.setPreferredSize(new java.awt.Dimension(585, 272));

        jTableUsuariosFuera.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jTableUsuariosFuera.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Código", "Apellidos", "Nombres", "Genero", "Rol", "<html>Fecha de <br> Salida</html>", "<html>Hora de <br> Salida</html>", "Editar", "Eliminar"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, true, true
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

        jScrollPaneTablaUsuariosTodos.setMaximumSize(new java.awt.Dimension(585, 272));
        jScrollPaneTablaUsuariosTodos.setMinimumSize(new java.awt.Dimension(585, 272));
        jScrollPaneTablaUsuariosTodos.setPreferredSize(new java.awt.Dimension(585, 272));

        jTableUsuariosTodos.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jTableUsuariosTodos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Código", "Apellidos", "Nombres", "Genero", "Rol", "Editar", "Eliminar"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableUsuariosTodos.setGridColor(new java.awt.Color(204, 204, 204));
        jTableUsuariosTodos.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jTableUsuariosTodosMouseMoved(evt);
            }
        });
        jTableUsuariosTodos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableUsuariosTodosMouseClicked(evt);
            }
        });
        jScrollPaneTablaUsuariosTodos.setViewportView(jTableUsuariosTodos);
        if (jTableUsuariosTodos.getColumnModel().getColumnCount() > 0) {
            jTableUsuariosTodos.getColumnModel().getColumn(0).setResizable(false);
            jTableUsuariosTodos.getColumnModel().getColumn(1).setResizable(false);
            jTableUsuariosTodos.getColumnModel().getColumn(2).setResizable(false);
            jTableUsuariosTodos.getColumnModel().getColumn(3).setResizable(false);
            jTableUsuariosTodos.getColumnModel().getColumn(4).setResizable(false);
            jTableUsuariosTodos.getColumnModel().getColumn(5).setResizable(false);
            jTableUsuariosTodos.getColumnModel().getColumn(5).setPreferredWidth(10);
            jTableUsuariosTodos.getColumnModel().getColumn(6).setResizable(false);
            jTableUsuariosTodos.getColumnModel().getColumn(6).setPreferredWidth(10);
        }

        jPanelContenedorTablas.add(jScrollPaneTablaUsuariosTodos, "card2");

        jScrollPaneTablaUsuariosDentro.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPaneTablaUsuariosDentro.setMaximumSize(new java.awt.Dimension(585, 272));
        jScrollPaneTablaUsuariosDentro.setMinimumSize(new java.awt.Dimension(585, 272));
        jScrollPaneTablaUsuariosDentro.setPreferredSize(new java.awt.Dimension(585, 272));

        jTableUsuariosDentro.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jTableUsuariosDentro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Código", "Apellidos", "Nombres", "Genero", "Rol", "<html>Fecha de <br> Ingreso</html>", "<html>Hora de <br> Ingreso</html>", "Editar", "Eliminar"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, true, true
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

        jButtonBuscar.setBackground(new java.awt.Color(204, 0, 0));
        jButtonBuscar.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        jButtonBuscar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/search-13-24.png"))); // NOI18N
        jButtonBuscar.setText("Buscar");
        jButtonBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonBuscar.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jButtonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarActionPerformed(evt);
            }
        });

        jPanelPaginacion.setBackground(new java.awt.Color(0, 0, 102));
        jPanelPaginacion.setLayout(new javax.swing.BoxLayout(jPanelPaginacion, javax.swing.BoxLayout.LINE_AXIS));

        jButtonPagAnterior.setBackground(new java.awt.Color(255, 255, 255));
        jButtonPagAnterior.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jButtonPagAnterior.setText("<<");
        jPanelPaginacion.add(jButtonPagAnterior);

        jToggleButtonPag1.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroupPaginacion.add(jToggleButtonPag1);
        jToggleButtonPag1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jToggleButtonPag1.setSelected(true);
        jToggleButtonPag1.setText("1");
        jToggleButtonPag1.setPreferredSize(new java.awt.Dimension(45, 23));
        jPanelPaginacion.add(jToggleButtonPag1);

        jToggleButtonPag2.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroupPaginacion.add(jToggleButtonPag2);
        jToggleButtonPag2.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jToggleButtonPag2.setText("2");
        jToggleButtonPag2.setPreferredSize(new java.awt.Dimension(45, 23));
        jPanelPaginacion.add(jToggleButtonPag2);

        jToggleButtonPag3.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroupPaginacion.add(jToggleButtonPag3);
        jToggleButtonPag3.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jToggleButtonPag3.setText("3");
        jToggleButtonPag3.setPreferredSize(new java.awt.Dimension(45, 23));
        jPanelPaginacion.add(jToggleButtonPag3);

        jToggleButtonPag4.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroupPaginacion.add(jToggleButtonPag4);
        jToggleButtonPag4.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jToggleButtonPag4.setText("4");
        jToggleButtonPag4.setPreferredSize(new java.awt.Dimension(45, 23));
        jPanelPaginacion.add(jToggleButtonPag4);

        jToggleButtonPagX.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroupPaginacion.add(jToggleButtonPagX);
        jToggleButtonPagX.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jToggleButtonPagX.setText("...");
        jToggleButtonPagX.setEnabled(false);
        jPanelPaginacion.add(jToggleButtonPagX);

        jToggleButton7.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroupPaginacion.add(jToggleButton7);
        jToggleButton7.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jToggleButton7.setText("50");
        jPanelPaginacion.add(jToggleButton7);

        jButtonPagSiguiente.setBackground(new java.awt.Color(255, 255, 255));
        jButtonPagSiguiente.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jButtonPagSiguiente.setText(">>");
        jPanelPaginacion.add(jButtonPagSiguiente);

        javax.swing.GroupLayout jPanelCentralLayout = new javax.swing.GroupLayout(jPanelCentral);
        jPanelCentral.setLayout(jPanelCentralLayout);
        jPanelCentralLayout.setHorizontalGroup(
            jPanelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 896, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(jPanelCentralLayout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(jPanelCriterios, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addGroup(jPanelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldDigiteCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelErrorDigiteCodigo))
                .addGap(156, 156, 156)
                .addComponent(jButtonBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanelCentralLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jPanelContenedorTablas, javax.swing.GroupLayout.PREFERRED_SIZE, 820, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanelCentralLayout.createSequentialGroup()
                .addGap(238, 238, 238)
                .addComponent(jPanelPaginacion, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(90, 90, 90)
                .addComponent(jButtonRegistrarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanelCentralLayout.setVerticalGroup(
            jPanelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCentralLayout.createSequentialGroup()
                .addComponent(jPanelMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelCentralLayout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(jTextFieldDigiteCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(jLabelErrorDigiteCodigo))
                    .addGroup(jPanelCentralLayout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(jButtonBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelCentralLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanelCriterios, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(13, 13, 13)
                .addComponent(jPanelContenedorTablas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(jPanelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelPaginacion, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelCentralLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jButtonRegistrarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        getContentPane().add(jPanelCentral, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    // Estilo TABLAS
    private void estiloTablas(){
        int rojo = 204;
        int verde = 0;
        int azul = 0;
        float[] colores = Color.RGBtoHSB(rojo, verde, azul, null);
        float red = colores[0];
        float green = colores[1];
        float blue = colores[2];
        this.jRadioButtonTodos.setSelected(true);
        
        jScrollPaneTablaUsuariosTodos.setVisible(true);
        jScrollPaneTablaUsuariosDentro.setVisible(false);
        jScrollPaneTablaUsuariosFuera.setVisible(false);
        
        jTableUsuariosTodos.getTableHeader().setPreferredSize(new java.awt.Dimension(0,50));
        jTableUsuariosTodos.getTableHeader().setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 16));
        jTableUsuariosTodos.getTableHeader().setForeground(Color.WHITE);
        jTableUsuariosTodos.getTableHeader().setBackground(Color.getHSBColor(red, green, blue));
        jTableUsuariosTodos.setRowHeight(25);
        jTableUsuariosTodos.setDefaultRenderer(Object.class, new Render());
        setJComboBoxRol(jTableUsuariosTodos.getColumnModel().getColumn(4));
        
        jTableUsuariosDentro.getTableHeader().setPreferredSize(new java.awt.Dimension(0,50));
        jTableUsuariosDentro.getTableHeader().setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 16));
        jTableUsuariosDentro.getTableHeader().setForeground(Color.WHITE);
        jTableUsuariosDentro.getTableHeader().setBackground(Color.getHSBColor(red, green, blue));
        jTableUsuariosDentro.setRowHeight(25);
        jTableUsuariosDentro.setDefaultRenderer(Object.class, new Render());
        setJComboBoxRol(jTableUsuariosDentro.getColumnModel().getColumn(4));
        
        jTableUsuariosFuera.getTableHeader().setPreferredSize(new java.awt.Dimension(0,50));
        jTableUsuariosFuera.getTableHeader().setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 16));
        jTableUsuariosFuera.getTableHeader().setForeground(Color.WHITE);
        jTableUsuariosFuera.getTableHeader().setBackground(Color.getHSBColor(red, green, blue));
        jTableUsuariosFuera.setRowHeight(25);
        jTableUsuariosFuera.setDefaultRenderer(Object.class, new Render());
        setJComboBoxRol(jTableUsuariosFuera.getColumnModel().getColumn(4));
    }
     
    // LISTAR usuarios
    private void listarUsuarios(){
        
        if(jRadioButtonTodos.isSelected()){
            
            try {
                
                //CONEXION SERVIDOR
                
                Gson objConvertidor = new Gson();
                ClsPeticionDTO objPeticion = new ClsPeticionDTO();
                
                objCliente.crearConexion();
                
                String argumentos = "";
                objPeticion.setArgumentos(argumentos);
                objPeticion.setAccion("listarTodosLosUsuarios");
                
                String JSON = objConvertidor.toJson(objPeticion);
                String respuestaJSON = objCliente.enviarPeticion(JSON);
                ClsResultadoDTO objResultado = objConvertidor.fromJson(respuestaJSON, ClsResultadoDTO.class);
                
                objCliente.cerrarConexion();
                
                //FIN CONEXION
                
                if(objResultado.getCodigoResultado() == 1)
                {
                    llenarTablas(objResultado, objConvertidor, jTableUsuariosTodos);
                }
                else
                {
                    Utilidades.mensajeAdvertencia("No hay usuarios registrados", "Error");
                    limpiarTabla(jTableUsuariosTodos);
                }

            } catch (IOException ex) {
                Logger.getLogger(VtnIniciarSesion.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }else if(jRadioButtonDentro.isSelected()){
            
            try {
                
                //CONEXION SERVIDOR
                
                Gson objConvertidor = new Gson();
                ClsPeticionDTO objPeticion = new ClsPeticionDTO();
                
                objCliente.crearConexion();
                
                String argumentos = "";
                objPeticion.setArgumentos(argumentos);
                objPeticion.setAccion("listarUsuariosDentro");
                
                String JSON = objConvertidor.toJson(objPeticion);
                String respuestaJSON = objCliente.enviarPeticion(JSON);
                ClsResultadoDTO objResultado = objConvertidor.fromJson(respuestaJSON, ClsResultadoDTO.class);
                
                objCliente.cerrarConexion();
                
                //FIN CONEXION
                
                if(objResultado.getCodigoResultado() == 1)
                    llenarTablas(objResultado, objConvertidor, jTableUsuariosDentro);
                else{
                    Utilidades.mensajeAdvertencia("No hay usuarios dentro de la institucion", "Error");
                    limpiarTabla(jTableUsuariosDentro);
                }

            } catch (IOException ex) {
                Logger.getLogger(VtnIniciarSesion.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }else if(jRadioButtonFuera.isSelected()){
            
            try {
                
                //CONEXION SERVIDOR
                
                Gson objConvertidor = new Gson();
                ClsPeticionDTO objPeticion = new ClsPeticionDTO();
                
                objCliente.crearConexion();
                
                String argumentos = "";
                objPeticion.setArgumentos(argumentos);
                objPeticion.setAccion("listarUsuariosFuera");
                
                String JSON = objConvertidor.toJson(objPeticion);
                String respuestaJSON = objCliente.enviarPeticion(JSON);
                ClsResultadoDTO objResultado = objConvertidor.fromJson(respuestaJSON, ClsResultadoDTO.class);
                
                objCliente.cerrarConexion();
                
                //FIN CONEXION
                
                if(objResultado.getCodigoResultado() == 1)
                {
                    llenarTablas(objResultado, objConvertidor, jTableUsuariosFuera);
                }
                else
                {
                    Utilidades.mensajeAdvertencia("No hay usuarios fuera de la institucion", "Error");
                    limpiarTabla(jTableUsuariosFuera);
                }

            } catch (IOException ex) {
                Logger.getLogger(VtnIniciarSesion.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        
    }
    
    // VALIDACION campos inicio ================================================
    private boolean verificarCamposVacios() {
        
        boolean bandera = false; // false = campos no vacios
        
        if(this.jTextFieldDigiteCodigo.getText().equals("") || this.jTextFieldDigiteCodigo.getText().equals("Digite Código"))
        {
            mostrarError(jLabelErrorDigiteCodigo, "Rellenar este campo",jTextFieldDigiteCodigo);
            bandera=true;
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
                mostrarError(jLabelErrorDigiteCodigo, "Caracter ingresado no válido",jTextFieldDigiteCodigo);
                break;
            }
        }       
               
        return bandera;
    }
    
    private boolean validarCantidadDeCaracteresCodigo(){
        
        boolean bandera = false; // false = correcto
        
        if(jTextFieldDigiteCodigo.getText().length() > 8){ 
            bandera = true;
            mostrarError(jLabelErrorDigiteCodigo, "Los codigos poseen máximo 8 digitos",jTextFieldDigiteCodigo);            
        }
               
        return bandera;
    }
    
    private void mostrarError(JLabel notificacion, String error, JTextField campo){
        notificacion.setText(error);
        notificacion.setVisible(true);
        campo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
    }
    
     private void ocultarErrores(){
        jLabelErrorDigiteCodigo.setVisible(false);
        jTextFieldDigiteCodigo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
    }
    // VALIDACIÓN campos final =================================================
    
     
     
    // Llenar columna con COMBOBOX ROL
    public void setJComboBoxRol(TableColumn columna){

        JComboBox jComboBoxRol = new JComboBox();
        jComboBoxRol.addItem("No asignado"); 
        jComboBoxRol.addItem("Estudiante");
        jComboBoxRol.addItem("Administrativo");
        jComboBoxRol.addItem("Docente");
        
        columna.setCellEditor(new DefaultCellEditor(jComboBoxRol));
        DefaultTableCellRenderer renderer = new DefaultTableCellRenderer();
        renderer.setToolTipText("Seleccionar Rol");
        columna.setCellRenderer(renderer);
        
        jComboBoxRol.addMouseListener(new MouseAdapter() {
            
            @Override
            public void mousePressed(MouseEvent evt) {
                
                JComboBox comboBoxRol = (JComboBox) evt.getSource();
                int row = comboBoxRol.getY()/jTableUsuariosTodos.getRowHeight();
                codigoParaAsignarRol = jTableUsuariosTodos.getValueAt(row, 0).toString();
            }
        });
        
        
        jComboBoxRol.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {              
                
                JComboBox comboBoxRol = (JComboBox) evt.getSource();
                
                switch(comboBoxRol.getSelectedIndex()){
                    case 0:
                        rolNuevo = "No asignado";
                    break;
                    case 1:
                        rolNuevo = "Estudiante";
                    break;
                    case 2:
                        rolNuevo = "Administrativo";
                    break;
                    case 3:
                        rolNuevo = "Docente";
                    break;
                
                }
                
                if(codigoParaAsignarRol==null){
                    
                }else
                    asignarRol(codigoParaAsignarRol, rolNuevo);
                                
                codigoParaAsignarRol=null;
                                    
            }
        });
             
    }  
    
    // Funcion ASIGNAR ROL
    private void asignarRol(String codigoEstudiante, String nuevoRol){
        
        ClsResultadoDTO objResultado = new ClsResultadoDTO();
        Gson objConvertidor = new Gson();
        
        if(Utilidades.mensajeConfirmacion("¿Estás seguro de que quieres guardar los cambios? \nNo será posible recuperar los datos anteriores", "Advertencia") == 0){
            
            try{
                //CONEXION SERVIDOR

                ClsPeticionDTO objPeticion = new ClsPeticionDTO();

                objCliente.crearConexion();

                String argumentos = codigoEstudiante + "," + nuevoRol;
                objPeticion.setArgumentos(argumentos);
                objPeticion.setAccion("asignarRol");

                String JSON = objConvertidor.toJson(objPeticion);
                String respuestaJSON = objCliente.enviarPeticion(JSON);
                objResultado = objConvertidor.fromJson(respuestaJSON, ClsResultadoDTO.class);

                objCliente.cerrarConexion();

                //FIN CONEXION
            }catch(IOException ex){
                Utilidades.mensajeError("Error al asignar el rol. Intentelo de nuevo más tarde", "Error");
            }
            
            if(objResultado.getCodigoResultado() == 1){
                Utilidades.mensajeExito("Asignación de rol exitosa", "Acción realizada con éxito");
                limpiarTabla(jTableUsuariosTodos);
                listarUsuarios();
            }else{
                Utilidades.mensajeError("Usuario no encontrado", "Error");
            }
            
        }else{
            limpiarTabla(jTableUsuariosTodos);
            listarUsuarios();
        }
    }
    
    
    
    // Radio buttons CRITERIOS inicio ==========================================
    private void jRadioButtonTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonTodosActionPerformed
        
        if(jRadioButtonTodos.isSelected())
        {
            jScrollPaneTablaUsuariosTodos.setVisible(true);
            jScrollPaneTablaUsuariosDentro.setVisible(false);
            jScrollPaneTablaUsuariosFuera.setVisible(false);
            listarUsuarios();
        }
        
    }//GEN-LAST:event_jRadioButtonTodosActionPerformed

    private void jRadioButtonDentroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonDentroActionPerformed
        
        if(jRadioButtonDentro.isSelected())
        {
            jScrollPaneTablaUsuariosTodos.setVisible(false);
            jScrollPaneTablaUsuariosDentro.setVisible(true);
            jScrollPaneTablaUsuariosFuera.setVisible(false);
            listarUsuarios();
        }
        
    }//GEN-LAST:event_jRadioButtonDentroActionPerformed

    private void jRadioButtonFueraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonFueraActionPerformed
        
        if(jRadioButtonFuera.isSelected())
        {
            jScrollPaneTablaUsuariosTodos.setVisible(false);
            jScrollPaneTablaUsuariosDentro.setVisible(false);
            jScrollPaneTablaUsuariosFuera.setVisible(true);
            listarUsuarios();
        }
        
    }//GEN-LAST:event_jRadioButtonFueraActionPerformed
    // Radio buttons CRITERIOS final ===========================================
    
    
    
    // Eventos FOCUS inicio ====================================================
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
    // Eventos focus final =====================================================
    
    
    
    // Boton REGISTRAR
    private void jButtonRegistrarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegistrarUsuarioActionPerformed
        VtnRegistrarUsuario objVtnRegistrarUsuario = new VtnRegistrarUsuario(this.objCliente ,nombrePerfil);
        objVtnRegistrarUsuario.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButtonRegistrarUsuarioActionPerformed

    //Funcion que reconoce que fila esta clickeando el administrador 
    //y ordena EDITAR o ELIMINAR
    //segun la opcion que haya elegido el administrador
    private void jTableUsuariosTodosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableUsuariosTodosMouseClicked
        
        int column = jTableUsuariosTodos.getColumnModel().getColumnIndexAtX(evt.getX());
        int row = evt.getY()/jTableUsuariosTodos.getRowHeight();
        
        if(row < jTableUsuariosTodos.getRowCount() && row >= 0 && column < jTableUsuariosTodos.getColumnCount() && column >= 0){
            Object value = jTableUsuariosTodos.getValueAt(row, column);
            
            if(value instanceof JButton){
                
                ((JButton)value).doClick();
                JButton boton = (JButton) value;
                
                String codigoUsuario = jTableUsuariosTodos.getValueAt(row, 0).toString();
                String apellidosUsuario = jTableUsuariosTodos.getValueAt(row, 1).toString();
                String nombresUsuario = jTableUsuariosTodos.getValueAt(row, 2).toString();
                String generoUsuario = jTableUsuariosTodos.getValueAt(row, 3).toString();
                String rolUsuario = jTableUsuariosTodos.getValueAt(row, 4).toString();
                
                ClsUsuarioDTO objUsuarioSeleccionado = new ClsUsuarioDTO(codigoUsuario, apellidosUsuario, nombresUsuario, generoUsuario, rolUsuario);
                
                if(boton.getName().equals("Eliminar")){
                    try{  
                        if(Utilidades.mensajeConfirmacion("¿Estás seguro de que quieres eliminar al usuario " + nombresUsuario + " " 
                            + apellidosUsuario + " con código " + codigoUsuario + " ?\nNo será posible recuperar sus datos", "Confirmación") == 0){
                            eliminarUsuario(codigoUsuario);
                        }
                    }catch(Exception ex){
                        Utilidades.mensajeError("Error al eliminar usuario. Intentelo de nuevo más tarde", "Error");
                    }  
                }else if(boton.getName().equals("Editar")){
                    try{
                        editarUsuario(objUsuarioSeleccionado);
                    }catch(Exception ex){
                        Utilidades.mensajeError("Error al editar usuario. Intentelo de nuevo más tarde", "Error");
                    }  
                }
            }
        }
    }//GEN-LAST:event_jTableUsuariosTodosMouseClicked

    
    // Cambio a ventana ASIGNACION MASIVA DE ROLES
    private void jToggleButtonAsignacionMasivaRolesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButtonAsignacionMasivaRolesActionPerformed
        VtnAsignacionMasivaRoles objVtnAsignacionMasivaRoles = new VtnAsignacionMasivaRoles(objCliente,nombrePerfil);
        objVtnAsignacionMasivaRoles.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jToggleButtonAsignacionMasivaRolesActionPerformed

    // NO HACE NADA - NO HAY VENTANA
    private void jToggleButtonAyudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButtonAyudaActionPerformed
        Utilidades.mensajeError("Página en construcción", "Error");
        jToggleButtonGestionarUsuarios.setSelected(true);
    }//GEN-LAST:event_jToggleButtonAyudaActionPerformed

    // Mano click
    private void jTableUsuariosTodosMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableUsuariosTodosMouseMoved
        if(jTableUsuariosTodos.columnAtPoint(evt.getPoint())>=4)
        {
            jTableUsuariosTodos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        }
        else 
        {
            jTableUsuariosTodos.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        }
    }//GEN-LAST:event_jTableUsuariosTodosMouseMoved
    
    // ComboBox PERFIL
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

    // Funcion BUSCAR USUARIO
    private void jButtonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarActionPerformed
        
        limpiarTabla(jTableUsuariosTodos);
        limpiarTabla(jTableUsuariosFuera);
        limpiarTabla(jTableUsuariosDentro);
        
        ClsResultadoDTO objResultado = new ClsResultadoDTO();
        Gson objConvertidor = new Gson();
        
        ocultarErrores();
        
        boolean cantidadCaracteresCodigo = validarCantidadDeCaracteresCodigo();
        boolean camposValidos = verificarCaracteresCodigo(jTextFieldDigiteCodigo);
        boolean camposVacios = verificarCamposVacios();
        
        if(camposVacios == false && camposValidos == false && cantidadCaracteresCodigo == false){
        
            try{
                //CONEXION SERVIDOR

                ClsPeticionDTO objPeticion = new ClsPeticionDTO();

                objCliente.crearConexion();

                String argumentos = this.jTextFieldDigiteCodigo.getText();
                objPeticion.setArgumentos(argumentos);
                objPeticion.setAccion("buscarUsuarios");

                String JSON = objConvertidor.toJson(objPeticion);
                String respuestaJSON = objCliente.enviarPeticion(JSON);
                objResultado = objConvertidor.fromJson(respuestaJSON, ClsResultadoDTO.class);

                objCliente.cerrarConexion();

                //FIN CONEXION
            }catch(IOException ex){
                Utilidades.mensajeError("Error al buscar el usuario. Intentelo más tarde", "Error");
            }
        
            if(objResultado.getCodigoResultado() == 1){
                llenarTablas(objResultado, objConvertidor, jTableUsuariosTodos);                
            }else{
                Utilidades.mensajeError("No se encontraron coincidencias", "Error");
            }
        
        }else{
            if(camposVacios == true){
                Utilidades.mensajeAdvertencia("El campo busqueda esta vacío", "Error");
            }else if(camposValidos == true)
                Utilidades.mensajeAdvertencia("Caracter ingresado no válido", "Error");
            else if(cantidadCaracteresCodigo == true)
                Utilidades.mensajeAdvertencia("Número de caracteres no válido", "Error");
        }
            
        
    }//GEN-LAST:event_jButtonBuscarActionPerformed
    
    // LLENAR TABLAS
    private void llenarTablas(ClsResultadoDTO objResultado, Gson objConvertidor, JTable tabla){
        
        if (this.jRadioButtonTodos.isSelected()){ 
            String listaJSON = objResultado.getJSONResultado();
            java.lang.reflect.Type listType = new TypeToken<ArrayList<ClsUsuarioDTO>>(){}.getType();
            ArrayList<ClsUsuarioDTO> listaUsuarios = objConvertidor.fromJson(listaJSON, listType);
            
            limpiarTabla(tabla);

            for (int i = 0; i < listaUsuarios.size(); i++) {
                ClsUsuarioDTO objUsuarioPorListar = listaUsuarios.get(i);

                String rol = "";
                switch(objUsuarioPorListar.getRol()){
                    case Administrativo:
                        rol = "Administrativo";
                    break;
                    case Docente:
                        rol = "Docente";
                    break;
                    case Estudiante:
                        rol = "Estudiante";
                    break;                
                    case No_Asignado:
                        rol = "No asignado";
                    break;
                    default:

                    break;
                }    

                JButton JButtonEliminarUsuario = new JButton();
                JButtonEliminarUsuario.setName("Eliminar");
                JButtonEliminarUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/trash-2-24.png")));

                JButton JButtonEditarUsuario = new JButton();
                JButtonEditarUsuario.setName("Editar");
                JButtonEditarUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/edit-24.png")));

                Object [] fila= { objUsuarioPorListar.getCodigo(),objUsuarioPorListar.getApellidos(),objUsuarioPorListar.getNombres(),
                    objUsuarioPorListar.getGenero()+"",rol,JButtonEditarUsuario,JButtonEliminarUsuario};

                DefaultTableModel model = (DefaultTableModel) tabla.getModel();
                model.addRow(fila);

            }
            
        }else if(this.jRadioButtonDentro.isSelected()){
            
            String listaJSON = objResultado.getJSONResultado();
            java.lang.reflect.Type listType = new TypeToken<ArrayList<ClsUsuarioDTO>>(){}.getType();
            ArrayList<ClsUsuarioDTO> listaUsuarios = objConvertidor.fromJson(listaJSON, listType);
            
            limpiarTabla(tabla);

            for (int i = 0; i < listaUsuarios.size(); i++) {
                ClsUsuarioDTO objUsuarioPorListar = listaUsuarios.get(i);
                ArrayList<ClsRegistroDTO> listaRegistrosUsuario = listaUsuarios.get(i).getRegistros();
                ClsRegistroDTO objRegistroPorListar = listaRegistrosUsuario.get(listaRegistrosUsuario.size()-1);

                String rol = "";
                switch(objUsuarioPorListar.getRol()){
                    case Administrativo:
                        rol = "Administrativo";
                    break;
                    case Docente:
                        rol = "Docente";
                    break;
                    case Estudiante:
                        rol = "Estudiante";
                    break;                
                    case No_Asignado:
                        rol = "No asignado";
                    break;
                    default:

                    break;
                }    

                JButton JButtonEliminarUsuario = new JButton();
                JButtonEliminarUsuario.setName("Eliminar");
                JButtonEliminarUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/trash-2-24.png")));

                JButton JButtonEditarUsuario = new JButton();
                JButtonEditarUsuario.setName("Editar");
                JButtonEditarUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/edit-24.png")));

                Object [] fila= { objUsuarioPorListar.getCodigo(),objUsuarioPorListar.getApellidos(),objUsuarioPorListar.getNombres(),
                    objUsuarioPorListar.getGenero()+"",rol,objRegistroPorListar.getFecha()+"",objRegistroPorListar.getHora()+"",JButtonEditarUsuario,
                    JButtonEliminarUsuario};

                DefaultTableModel model = (DefaultTableModel) tabla.getModel();
                model.addRow(fila);

            }
            
        } else if(this.jRadioButtonFuera.isSelected()){
            
            String listaJSON = objResultado.getJSONResultado();
            java.lang.reflect.Type listType = new TypeToken<ArrayList<ClsUsuarioDTO>>(){}.getType();
            ArrayList<ClsUsuarioDTO> listaUsuarios = objConvertidor.fromJson(listaJSON, listType);
            
            limpiarTabla(tabla);

            for (int i = 0; i < listaUsuarios.size(); i++) {
                ClsUsuarioDTO objUsuarioPorListar = listaUsuarios.get(i);
                ArrayList<ClsRegistroDTO> listaRegistrosUsuario = listaUsuarios.get(i).getRegistros();
                ClsRegistroDTO objRegistroPorListar = listaRegistrosUsuario.get(listaRegistrosUsuario.size()-1);

                String rol = "";
                switch(objUsuarioPorListar.getRol()){
                    case Administrativo:
                        rol = "Administrativo";
                    break;
                    case Docente:
                        rol = "Docente";
                    break;
                    case Estudiante:
                        rol = "Estudiante";
                    break;                
                    case No_Asignado:
                        rol = "No asignado";
                    break;
                    default:

                    break;
                }    

                JButton JButtonEliminarUsuario = new JButton();
                JButtonEliminarUsuario.setName("Eliminar");
                JButtonEliminarUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/trash-2-24.png")));

                JButton JButtonEditarUsuario = new JButton();
                JButtonEditarUsuario.setName("Editar");
                JButtonEditarUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/edit-24.png")));

                Object [] fila= { objUsuarioPorListar.getCodigo(),objUsuarioPorListar.getApellidos(),objUsuarioPorListar.getNombres(),
                    objUsuarioPorListar.getGenero()+"",rol,objRegistroPorListar.getFecha()+"",objRegistroPorListar.getHora()+"",JButtonEditarUsuario,
                    JButtonEliminarUsuario};

                DefaultTableModel model = (DefaultTableModel) tabla.getModel();
                model.addRow(fila);

            }
            
        }    
        
    }
    
    // Evento ENTER
    private void jTextFieldDigiteCodigoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldDigiteCodigoKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            jButtonBuscarActionPerformed(null);
        }
    }//GEN-LAST:event_jTextFieldDigiteCodigoKeyPressed
   
    // Función ELIMINAR USUARIO
    private void eliminarUsuario(String codigo) throws Exception{
        
        //CONEXION SERVIDOR

        Gson objConvertidor = new Gson();
        ClsPeticionDTO objPeticion = new ClsPeticionDTO();

        objCliente.crearConexion();

        String argumentos = codigo;
        objPeticion.setArgumentos(argumentos);
        objPeticion.setAccion("eliminarUsuario");

        String JSON = objConvertidor.toJson(objPeticion);
        String respuestaJSON = objCliente.enviarPeticion(JSON);
        ClsResultadoDTO objResultado = objConvertidor.fromJson(respuestaJSON, ClsResultadoDTO.class);

        objCliente.cerrarConexion();

        //FIN CONEXION

        if(objResultado.getCodigoResultado() == 1){
            Utilidades.mensajeExito("Usuario eliminado de forma exitosa", "Eliminación exitosa");
            listarUsuarios();            
        }else{
            Utilidades.mensajeError("No fue posible eliminar al usuario", "Error");
        }        
        
    }
    
    // Ventana EDITAR USUARIO
    private void editarUsuario(ClsUsuarioDTO objUsuarioSeleccionado) throws Exception{        
        VtnEditarUsuario objVtnEditarUsuario = new VtnEditarUsuario(this.objCliente, this.nombrePerfil, objUsuarioSeleccionado);
        objVtnEditarUsuario.setVisible(true);
        this.dispose();
    }
    
    //LIMPIAR tabla
    public void limpiarTabla(javax.swing.JTable tabla){
        
        DefaultTableModel modelo = (DefaultTableModel) tabla.getModel();
        int filas = tabla.getRowCount();
        for (int i = 0;filas>i; i++) {
            modelo.removeRow(0);
        }        
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Barra;
    private javax.swing.JLabel IconoUniversidad;
    private javax.swing.ButtonGroup buttonGroupCriteriosBusqueda;
    private javax.swing.ButtonGroup buttonGroupMenu;
    private javax.swing.ButtonGroup buttonGroupPaginacion;
    private javax.swing.JButton jButtonBuscar;
    private javax.swing.JButton jButtonPagAnterior;
    private javax.swing.JButton jButtonPagSiguiente;
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
    private javax.swing.JPanel jPanelPaginacion;
    private javax.swing.JPanel jPanelRadios;
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
