package cliente.vista;

public class VtnRegistrarUsuario extends javax.swing.JFrame {

    public VtnRegistrarUsuario() {
        initComponents();
        jLabelErrorCodigo.setVisible(false);
        jLabelErrorNombres.setVisible(false);
        jLabelErrorApellidos.setVisible(false);
        jLabelErrorGenero.setVisible(false);
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
        jLabelAdmin = new javax.swing.JLabel();
        jPanelCentral = new javax.swing.JPanel();
        PanelPrincipal = new javax.swing.JPanel();
        jPanelRegistro = new javax.swing.JPanel();
        jPanelCabecera = new javax.swing.JPanel();
        jLabelTituloRegistro = new javax.swing.JLabel();
        jLabelCodigo = new javax.swing.JLabel();
        jLabelNombres = new javax.swing.JLabel();
        jLabelApellidos = new javax.swing.JLabel();
        jLabelGenero = new javax.swing.JLabel();
        jLabelRol = new javax.swing.JLabel();
        jTextFieldCodigo = new javax.swing.JTextField();
        jTextFieldNombres = new javax.swing.JTextField();
        jTextFieldApellidos = new javax.swing.JTextField();
        jLabelErrorCodigo = new javax.swing.JLabel();
        jLabelErrorApellidos = new javax.swing.JLabel();
        jLabelErrorGenero = new javax.swing.JLabel();
        jLabelErrorNombres = new javax.swing.JLabel();
        jPanelRegistrar = new javax.swing.JPanel();
        jButtonRegistrar = new javax.swing.JButton();
        jComboBoxGenero1 = new javax.swing.JComboBox<>();
        jComboBoxRol1 = new javax.swing.JComboBox<>();
        jPanelRegresar = new javax.swing.JPanel();
        jButtonRegresar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(700, 680));
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

        jLabelAdmin.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        jLabelAdmin.setForeground(new java.awt.Color(255, 255, 255));
        jLabelAdmin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/usercircle.png"))); // NOI18N
        jLabelAdmin.setText("Administrador12");

        javax.swing.GroupLayout jPanelSuperiorLayout = new javax.swing.GroupLayout(jPanelSuperior);
        jPanelSuperior.setLayout(jPanelSuperiorLayout);
        jPanelSuperiorLayout.setHorizontalGroup(
            jPanelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSuperiorLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(IconoUniversidad)
                .addGap(47, 47, 47)
                .addGroup(jPanelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabelUniversidad)
                    .addComponent(jLabelDelCauca))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelAdmin)
                        .addContainerGap())))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelAdmin))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelSuperiorLayout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
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

        jPanelCentral.setBackground(new java.awt.Color(0, 0, 153));
        jPanelCentral.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelCentral.setMaximumSize(new java.awt.Dimension(700, 510));
        jPanelCentral.setMinimumSize(new java.awt.Dimension(700, 510));

        PanelPrincipal.setBackground(new java.awt.Color(0, 0, 153));
        PanelPrincipal.setLayout(new java.awt.GridBagLayout());

        jPanelRegistro.setBackground(new java.awt.Color(255, 255, 255));
        jPanelRegistro.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelRegistro.setMaximumSize(new java.awt.Dimension(310, 360));
        jPanelRegistro.setMinimumSize(new java.awt.Dimension(310, 360));

        jPanelCabecera.setBackground(new java.awt.Color(204, 0, 0));
        jPanelCabecera.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabelTituloRegistro.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        jLabelTituloRegistro.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTituloRegistro.setText("Registrar Usuario");
        jPanelCabecera.add(jLabelTituloRegistro);

        jLabelCodigo.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jLabelCodigo.setForeground(new java.awt.Color(0, 0, 0));
        jLabelCodigo.setText("Código:");

        jLabelNombres.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jLabelNombres.setForeground(new java.awt.Color(0, 0, 0));
        jLabelNombres.setText("Nombres:");

        jLabelApellidos.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jLabelApellidos.setForeground(new java.awt.Color(0, 0, 0));
        jLabelApellidos.setText("Apellidos:");

        jLabelGenero.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jLabelGenero.setForeground(new java.awt.Color(0, 0, 0));
        jLabelGenero.setText("Genero:");

        jLabelRol.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jLabelRol.setForeground(new java.awt.Color(0, 0, 0));
        jLabelRol.setText("Rol:");

        jTextFieldCodigo.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldCodigo.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jTextFieldCodigo.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldCodigo.setMaximumSize(new java.awt.Dimension(6, 26));

        jTextFieldNombres.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldNombres.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jTextFieldNombres.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldNombres.setMaximumSize(new java.awt.Dimension(6, 26));
        jTextFieldNombres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNombresActionPerformed(evt);
            }
        });

        jTextFieldApellidos.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldApellidos.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jTextFieldApellidos.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldApellidos.setMaximumSize(new java.awt.Dimension(6, 26));

        jLabelErrorCodigo.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        jLabelErrorCodigo.setForeground(new java.awt.Color(255, 0, 0));
        jLabelErrorCodigo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelErrorCodigo.setText("Error");

        jLabelErrorApellidos.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        jLabelErrorApellidos.setForeground(new java.awt.Color(255, 0, 0));
        jLabelErrorApellidos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelErrorApellidos.setText("Error");

        jLabelErrorGenero.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        jLabelErrorGenero.setForeground(new java.awt.Color(255, 0, 0));
        jLabelErrorGenero.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelErrorGenero.setText("Error");

        jLabelErrorNombres.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        jLabelErrorNombres.setForeground(new java.awt.Color(255, 0, 0));
        jLabelErrorNombres.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelErrorNombres.setText("Error");

        jPanelRegistrar.setBackground(new java.awt.Color(255, 255, 255));
        jPanelRegistrar.setLayout(new java.awt.GridBagLayout());

        jButtonRegistrar.setBackground(new java.awt.Color(204, 0, 0));
        jButtonRegistrar.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        jButtonRegistrar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonRegistrar.setText("Registrar");
        jButtonRegistrar.setPreferredSize(new java.awt.Dimension(90, 30));
        jButtonRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegistrarActionPerformed(evt);
            }
        });
        jPanelRegistrar.add(jButtonRegistrar, new java.awt.GridBagConstraints());

        jComboBoxGenero1.setBackground(new java.awt.Color(255, 255, 255));
        jComboBoxGenero1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jComboBoxGenero1.setForeground(new java.awt.Color(0, 0, 0));
        jComboBoxGenero1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Masculino", "Femenino", "Otro" }));
        jComboBoxGenero1.setMaximumSize(new java.awt.Dimension(6, 26));
        jComboBoxGenero1.setMinimumSize(new java.awt.Dimension(6, 26));
        jComboBoxGenero1.setPreferredSize(new java.awt.Dimension(6, 26));

        jComboBoxRol1.setBackground(new java.awt.Color(255, 255, 255));
        jComboBoxRol1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jComboBoxRol1.setForeground(new java.awt.Color(0, 0, 0));
        jComboBoxRol1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "No asignado", "Estudiante", "Administrativo", "Docente" }));
        jComboBoxRol1.setMaximumSize(new java.awt.Dimension(6, 26));
        jComboBoxRol1.setMinimumSize(new java.awt.Dimension(6, 26));
        jComboBoxRol1.setPreferredSize(new java.awt.Dimension(6, 26));
        jComboBoxRol1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxRol1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelRegistroLayout = new javax.swing.GroupLayout(jPanelRegistro);
        jPanelRegistro.setLayout(jPanelRegistroLayout);
        jPanelRegistroLayout.setHorizontalGroup(
            jPanelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelCabecera, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanelRegistrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanelRegistroLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabelApellidos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelNombres)
                    .addComponent(jLabelCodigo)
                    .addComponent(jLabelRol, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelGenero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(29, 29, 29)
                .addGroup(jPanelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextFieldNombres, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                    .addComponent(jTextFieldCodigo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                    .addComponent(jTextFieldApellidos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jComboBoxGenero1, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jComboBoxRol1, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelErrorCodigo)
                    .addComponent(jLabelErrorNombres)
                    .addComponent(jLabelErrorApellidos)
                    .addComponent(jLabelErrorGenero))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        jPanelRegistroLayout.setVerticalGroup(
            jPanelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelRegistroLayout.createSequentialGroup()
                .addComponent(jPanelCabecera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addGroup(jPanelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldCodigo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelCodigo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelErrorCodigo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldNombres, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelNombres, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelErrorNombres)
                .addGap(8, 8, 8)
                .addGroup(jPanelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldApellidos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelErrorApellidos)
                .addGap(8, 8, 8)
                .addGroup(jPanelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxGenero1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelErrorGenero)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelRol, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxRol1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanelRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        PanelPrincipal.add(jPanelRegistro, new java.awt.GridBagConstraints());

        jPanelRegresar.setBackground(new java.awt.Color(0, 0, 153));
        jPanelRegresar.setMaximumSize(new java.awt.Dimension(700, 50));
        jPanelRegresar.setMinimumSize(new java.awt.Dimension(700, 50));
        jPanelRegresar.setPreferredSize(new java.awt.Dimension(700, 50));
        jPanelRegresar.setLayout(new java.awt.GridBagLayout());

        jButtonRegresar.setBackground(new java.awt.Color(0, 0, 153));
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

    private void jTextFieldNombresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNombresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNombresActionPerformed

    private void jButtonRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegistrarActionPerformed
    }//GEN-LAST:event_jButtonRegistrarActionPerformed

    private void jButtonRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegresarActionPerformed
        //VtnPrincipalAdministrador objVtnPrincipalAdministrador = new VtnPrincipalAdministrador();
        //objVtnPrincipalAdministrador.setVisible(true);
        //this.dispose();
    }//GEN-LAST:event_jButtonRegresarActionPerformed

    private void jComboBoxRol1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxRol1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxRol1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Barra;
    private javax.swing.JLabel IconoUniversidad;
    private javax.swing.JPanel PanelPrincipal;
    private javax.swing.JButton jButtonRegistrar;
    private javax.swing.JButton jButtonRegresar;
    private javax.swing.JComboBox<String> jComboBoxGenero1;
    private javax.swing.JComboBox<String> jComboBoxRol1;
    private javax.swing.JLabel jLabelAdmin;
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
    private javax.swing.JLabel jLabelRol;
    private javax.swing.JLabel jLabelSIRCA1;
    private javax.swing.JLabel jLabelSIRCA2;
    private javax.swing.JLabel jLabelSIRCA3;
    private javax.swing.JLabel jLabelTituloRegistro;
    private javax.swing.JLabel jLabelUniversidad;
    private javax.swing.JPanel jPanelCabecera;
    private javax.swing.JPanel jPanelCentral;
    private javax.swing.JPanel jPanelInferior;
    private javax.swing.JPanel jPanelRegistrar;
    private javax.swing.JPanel jPanelRegistro;
    private javax.swing.JPanel jPanelRegresar;
    private javax.swing.JPanel jPanelSuperior;
    private javax.swing.JTextField jTextFieldApellidos;
    private javax.swing.JTextField jTextFieldCodigo;
    private javax.swing.JTextField jTextFieldNombres;
    // End of variables declaration//GEN-END:variables
}
