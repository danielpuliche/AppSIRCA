package cliente.vista;

public class VtnModificarLogin extends javax.swing.JFrame {

    public VtnModificarLogin() {
        initComponents();
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
        jPanelPrincipal = new javax.swing.JPanel();
        jPanelRegistro = new javax.swing.JPanel();
        jPanelCabecera = new javax.swing.JPanel();
        jLabelTituloRegistro = new javax.swing.JLabel();
        jLabelCodigo = new javax.swing.JLabel();
        jLabelNombres = new javax.swing.JLabel();
        jLabelApellidos = new javax.swing.JLabel();
        jTextFieldCodigo = new javax.swing.JTextField();
        jTextFieldNombres = new javax.swing.JTextField();
        jTextFieldApellidos = new javax.swing.JTextField();
        jLabelErrorCodigo = new javax.swing.JLabel();
        jLabelErrorApellidos = new javax.swing.JLabel();
        jLabelErrorNombres = new javax.swing.JLabel();
        jLabelErrorCodigo1 = new javax.swing.JLabel();
        jLabelErrorCodigo2 = new javax.swing.JLabel();
        jLabelErrorCodigo3 = new javax.swing.JLabel();
        jButtonGuardar = new javax.swing.JButton();
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

        jPanelPrincipal.setBackground(new java.awt.Color(0, 0, 153));
        jPanelPrincipal.setLayout(new java.awt.GridBagLayout());

        jPanelRegistro.setBackground(new java.awt.Color(255, 255, 255));
        jPanelRegistro.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelRegistro.setMaximumSize(new java.awt.Dimension(310, 360));
        jPanelRegistro.setMinimumSize(new java.awt.Dimension(310, 360));

        jPanelCabecera.setBackground(new java.awt.Color(204, 0, 0));
        jPanelCabecera.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabelTituloRegistro.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        jLabelTituloRegistro.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTituloRegistro.setText("Modificar Login");
        jPanelCabecera.add(jLabelTituloRegistro);

        jLabelCodigo.setBackground(new java.awt.Color(255, 255, 255));
        jLabelCodigo.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jLabelCodigo.setForeground(new java.awt.Color(0, 0, 0));
        jLabelCodigo.setText("Login Actual:");

        jLabelNombres.setBackground(new java.awt.Color(255, 255, 255));
        jLabelNombres.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jLabelNombres.setForeground(new java.awt.Color(0, 0, 0));
        jLabelNombres.setText("Nuevo Login:");

        jLabelApellidos.setBackground(new java.awt.Color(255, 255, 255));
        jLabelApellidos.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jLabelApellidos.setForeground(new java.awt.Color(0, 0, 0));
        jLabelApellidos.setText("Confirmar Nuevo Login:");

        jTextFieldCodigo.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldCodigo.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jTextFieldCodigo.setForeground(new java.awt.Color(102, 102, 102));
        jTextFieldCodigo.setMaximumSize(new java.awt.Dimension(6, 26));

        jTextFieldNombres.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldNombres.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jTextFieldNombres.setForeground(new java.awt.Color(102, 102, 102));
        jTextFieldNombres.setMaximumSize(new java.awt.Dimension(6, 26));
        jTextFieldNombres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNombresActionPerformed(evt);
            }
        });

        jTextFieldApellidos.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldApellidos.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jTextFieldApellidos.setForeground(new java.awt.Color(102, 102, 102));
        jTextFieldApellidos.setMaximumSize(new java.awt.Dimension(6, 26));
        jTextFieldApellidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldApellidosActionPerformed(evt);
            }
        });

        jLabelErrorCodigo.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        jLabelErrorCodigo.setForeground(new java.awt.Color(255, 0, 0));
        jLabelErrorCodigo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelErrorCodigo.setText("Error");

        jLabelErrorApellidos.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        jLabelErrorApellidos.setForeground(new java.awt.Color(255, 0, 0));
        jLabelErrorApellidos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelErrorApellidos.setText("Error");

        jLabelErrorNombres.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        jLabelErrorNombres.setForeground(new java.awt.Color(255, 0, 0));
        jLabelErrorNombres.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelErrorNombres.setText("Error");

        jLabelErrorCodigo1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 36)); // NOI18N
        jLabelErrorCodigo1.setForeground(new java.awt.Color(255, 0, 0));
        jLabelErrorCodigo1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelErrorCodigo1.setText("*");

        jLabelErrorCodigo2.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 36)); // NOI18N
        jLabelErrorCodigo2.setForeground(new java.awt.Color(255, 0, 0));
        jLabelErrorCodigo2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelErrorCodigo2.setText("*");

        jLabelErrorCodigo3.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 36)); // NOI18N
        jLabelErrorCodigo3.setForeground(new java.awt.Color(255, 0, 0));
        jLabelErrorCodigo3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelErrorCodigo3.setText("*");

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

        javax.swing.GroupLayout jPanelRegistroLayout = new javax.swing.GroupLayout(jPanelRegistro);
        jPanelRegistro.setLayout(jPanelRegistroLayout);
        jPanelRegistroLayout.setHorizontalGroup(
            jPanelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelCabecera, javax.swing.GroupLayout.DEFAULT_SIZE, 481, Short.MAX_VALUE)
            .addGroup(jPanelRegistroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabelErrorCodigo1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabelErrorCodigo2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabelErrorCodigo3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabelNombres)
                    .addComponent(jLabelApellidos, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE)
                    .addComponent(jLabelCodigo)
                    .addComponent(jTextFieldApellidos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextFieldNombres, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextFieldCodigo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelErrorCodigo)
                    .addComponent(jLabelErrorNombres)
                    .addComponent(jLabelErrorApellidos))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );
        jPanelRegistroLayout.setVerticalGroup(
            jPanelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelRegistroLayout.createSequentialGroup()
                .addComponent(jPanelCabecera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jLabelCodigo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelRegistroLayout.createSequentialGroup()
                        .addComponent(jTextFieldCodigo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelErrorCodigo))
                    .addComponent(jLabelErrorCodigo1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addComponent(jLabelNombres)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelRegistroLayout.createSequentialGroup()
                        .addComponent(jTextFieldNombres, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelErrorNombres))
                    .addComponent(jLabelErrorCodigo3))
                .addGap(7, 7, 7)
                .addComponent(jLabelApellidos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelErrorCodigo2)
                    .addGroup(jPanelRegistroLayout.createSequentialGroup()
                        .addComponent(jTextFieldApellidos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelRegistroLayout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(jButtonGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabelErrorApellidos))))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        jPanelPrincipal.add(jPanelRegistro, new java.awt.GridBagConstraints());

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
            .addComponent(jPanelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanelCentralLayout.setVerticalGroup(
            jPanelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCentralLayout.createSequentialGroup()
                .addComponent(jPanelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(jPanelCentral, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegresarActionPerformed
        //VtnPrincipalAdministrador objVtnPrincipalAdministrador = new VtnPrincipalAdministrador();
        //objVtnPrincipalAdministrador.setVisible(true);
        //this.dispose();
    }//GEN-LAST:event_jButtonRegresarActionPerformed

    private void jTextFieldNombresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNombresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNombresActionPerformed

    private void jTextFieldApellidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldApellidosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldApellidosActionPerformed

    private void jButtonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGuardarActionPerformed

    }//GEN-LAST:event_jButtonGuardarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Barra;
    private javax.swing.JLabel IconoUniversidad;
    private javax.swing.JButton jButtonGuardar;
    private javax.swing.JButton jButtonRegresar;
    private javax.swing.JLabel jLabelAdmin;
    private javax.swing.JLabel jLabelApellidos;
    private javax.swing.JLabel jLabelCodigo;
    private javax.swing.JLabel jLabelDelCauca;
    private javax.swing.JLabel jLabelDesarrolladores;
    private javax.swing.JLabel jLabelErrorApellidos;
    private javax.swing.JLabel jLabelErrorCodigo;
    private javax.swing.JLabel jLabelErrorCodigo1;
    private javax.swing.JLabel jLabelErrorCodigo2;
    private javax.swing.JLabel jLabelErrorCodigo3;
    private javax.swing.JLabel jLabelErrorNombres;
    private javax.swing.JLabel jLabelNombres;
    private javax.swing.JLabel jLabelSIRCA1;
    private javax.swing.JLabel jLabelSIRCA2;
    private javax.swing.JLabel jLabelSIRCA3;
    private javax.swing.JLabel jLabelTituloRegistro;
    private javax.swing.JLabel jLabelUniversidad;
    private javax.swing.JPanel jPanelCabecera;
    private javax.swing.JPanel jPanelCentral;
    private javax.swing.JPanel jPanelInferior;
    private javax.swing.JPanel jPanelPrincipal;
    private javax.swing.JPanel jPanelRegistro;
    private javax.swing.JPanel jPanelRegresar;
    private javax.swing.JPanel jPanelSuperior;
    private javax.swing.JTextField jTextFieldApellidos;
    private javax.swing.JTextField jTextFieldCodigo;
    private javax.swing.JTextField jTextFieldNombres;
    // End of variables declaration//GEN-END:variables
}
