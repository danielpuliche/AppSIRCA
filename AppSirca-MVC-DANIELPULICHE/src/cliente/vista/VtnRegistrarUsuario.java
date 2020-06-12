package cliente.vista;

import cliente.servicios.cliente;
import com.google.gson.Gson;
import java.io.IOException;
import modelo.ClsPeticion;
import modelo.ClsResultado;
import modelo.ClsUsuario;
import utilidades.Utilidades;

public class VtnRegistrarUsuario extends javax.swing.JFrame {
    
    private cliente objCliente;

    public VtnRegistrarUsuario(String login) {
        initComponents();
        jLabelAdmin.setText(login);
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
        jComboBoxGenero = new javax.swing.JComboBox<>();
        jComboBoxRol = new javax.swing.JComboBox<>();
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

        jLabelAdmin.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
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
        jPanelRegistro.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelCabecera.setBackground(new java.awt.Color(204, 0, 0));
        jPanelCabecera.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabelTituloRegistro.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        jLabelTituloRegistro.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTituloRegistro.setText("Registrar Usuario");
        jPanelCabecera.add(jLabelTituloRegistro);

        jPanelRegistro.add(jPanelCabecera, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 2, 306, -1));

        jLabelCodigo.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jLabelCodigo.setForeground(new java.awt.Color(0, 0, 0));
        jLabelCodigo.setText("Código:");
        jPanelRegistro.add(jLabelCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 60, -1, -1));

        jLabelNombres.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jLabelNombres.setForeground(new java.awt.Color(0, 0, 0));
        jLabelNombres.setText("Nombres:");
        jPanelRegistro.add(jLabelNombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 111, -1, 26));

        jLabelApellidos.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jLabelApellidos.setForeground(new java.awt.Color(0, 0, 0));
        jLabelApellidos.setText("Apellidos:");
        jPanelRegistro.add(jLabelApellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 167, -1, 26));

        jLabelGenero.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jLabelGenero.setForeground(new java.awt.Color(0, 0, 0));
        jLabelGenero.setText("Genero:");
        jPanelRegistro.add(jLabelGenero, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 223, 61, 26));

        jLabelRol.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jLabelRol.setForeground(new java.awt.Color(0, 0, 0));
        jLabelRol.setText("Rol:");
        jPanelRegistro.add(jLabelRol, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 277, 61, 26));

        jTextFieldCodigo.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldCodigo.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jTextFieldCodigo.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldCodigo.setMaximumSize(new java.awt.Dimension(6, 26));
        jPanelRegistro.add(jTextFieldCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(117, 57, 160, -1));

        jTextFieldNombres.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldNombres.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jTextFieldNombres.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldNombres.setMaximumSize(new java.awt.Dimension(6, 26));
        jPanelRegistro.add(jTextFieldNombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(117, 111, 160, -1));

        jTextFieldApellidos.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldApellidos.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jTextFieldApellidos.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldApellidos.setMaximumSize(new java.awt.Dimension(6, 26));
        jPanelRegistro.add(jTextFieldApellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(117, 167, 160, -1));

        jLabelErrorCodigo.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        jLabelErrorCodigo.setForeground(new java.awt.Color(255, 0, 0));
        jLabelErrorCodigo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelErrorCodigo.setText("Error");
        jPanelRegistro.add(jLabelErrorCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(117, 89, -1, -1));

        jLabelErrorApellidos.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        jLabelErrorApellidos.setForeground(new java.awt.Color(255, 0, 0));
        jLabelErrorApellidos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelErrorApellidos.setText("Error");
        jPanelRegistro.add(jLabelErrorApellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(117, 199, -1, -1));

        jLabelErrorGenero.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        jLabelErrorGenero.setForeground(new java.awt.Color(255, 0, 0));
        jLabelErrorGenero.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelErrorGenero.setText("Error");
        jPanelRegistro.add(jLabelErrorGenero, new org.netbeans.lib.awtextra.AbsoluteConstraints(117, 255, -1, -1));

        jLabelErrorNombres.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        jLabelErrorNombres.setForeground(new java.awt.Color(255, 0, 0));
        jLabelErrorNombres.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelErrorNombres.setText("Error");
        jPanelRegistro.add(jLabelErrorNombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(117, 143, -1, -1));

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

        jPanelRegistro.add(jPanelRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 309, 306, 80));

        jComboBoxGenero.setBackground(new java.awt.Color(255, 255, 255));
        jComboBoxGenero.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jComboBoxGenero.setForeground(new java.awt.Color(0, 0, 0));
        jComboBoxGenero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Masculino", "Femenino", "Otro" }));
        jComboBoxGenero.setMaximumSize(new java.awt.Dimension(6, 26));
        jComboBoxGenero.setMinimumSize(new java.awt.Dimension(6, 26));
        jComboBoxGenero.setPreferredSize(new java.awt.Dimension(6, 26));
        jPanelRegistro.add(jComboBoxGenero, new org.netbeans.lib.awtextra.AbsoluteConstraints(117, 223, 160, -1));

        jComboBoxRol.setBackground(new java.awt.Color(255, 255, 255));
        jComboBoxRol.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jComboBoxRol.setForeground(new java.awt.Color(0, 0, 0));
        jComboBoxRol.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "No asignado", "Estudiante", "Administrativo", "Docente" }));
        jComboBoxRol.setMaximumSize(new java.awt.Dimension(6, 26));
        jComboBoxRol.setMinimumSize(new java.awt.Dimension(6, 26));
        jComboBoxRol.setPreferredSize(new java.awt.Dimension(6, 26));
        jPanelRegistro.add(jComboBoxRol, new org.netbeans.lib.awtextra.AbsoluteConstraints(117, 277, 160, -1));

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

    private void jButtonRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegresarActionPerformed
        VtnPrincipalAdministrador objVtnPrincipalAdministrador = new VtnPrincipalAdministrador(objCliente, jLabelAdmin.getText());
        objVtnPrincipalAdministrador.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButtonRegresarActionPerformed

    private void jButtonRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegistrarActionPerformed
        
        if(verificarCampos() == true){
            
            try {
            
                this.objCliente.crearConexion();
                Gson gson= new Gson();
                ClsPeticion objPeticion= new ClsPeticion();
                ClsResultado objResultado= new ClsResultado();

                String codigo, nombres, apellidos, genero, rol;
                
                codigo = jTextFieldCodigo.getText();                
                nombres=jTextFieldNombres.getText();
                apellidos=jTextFieldApellidos.getText();
                genero = (String) jComboBoxGenero.getSelectedItem();
                rol = (String) jComboBoxRol.getSelectedItem();

                ClsUsuario objUsuario= new ClsUsuario(codigo, nombres, apellidos, genero, rol);
                String JSONPersona=gson.toJson(objUsuario);

                objPeticion.setAccion("registrarUsuario");
                objPeticion.setArgumentos(JSONPersona);
                String JSONPeticion=gson.toJson(objPeticion);

                String resultado=objCliente.enviarPeticion(JSONPeticion);
                objResultado=gson.fromJson(resultado, ClsResultado.class);

                if(objResultado.getCodigoResultado()==1)
                {
                    utilidades.Utilidades.mensajeExito("Registro exitoso del usuario", "Registro exitoso");
                    this.dispose();
                    VtnPrincipalAdministrador objVtnPrincipalAdministrador = new VtnPrincipalAdministrador(objCliente,jLabelAdmin.getText());
                }
                else
                {
                    utilidades.Utilidades.mensajeAdvertencia("El usuario ya se encuentra registrado en el sistema", "Error en el registro");
                }
            
                this.objCliente.cerrarConexion();
             
            }catch (IOException ex) {

            }
            
        }else{
            Utilidades.mensajeAdvertencia("Hay campos obligatorios sin llenar", "Error");
        }
        
    }//GEN-LAST:event_jButtonRegistrarActionPerformed

    private boolean verificarCampos(){
        
        boolean bandera = true; //true = campos correctos
        
        if (jTextFieldCodigo.getText().equals("")) {
            this.jLabelErrorCodigo.setText("Error, campo vacío");
            this.jLabelErrorCodigo.setVisible(true);
            bandera = false;
        }else{
            this.jLabelErrorCodigo.setVisible(false);
        }
        
        if (jTextFieldNombres.getText().equals("")) {
            this.jLabelErrorNombres.setText("Error, campo vacío");
            this.jLabelErrorNombres.setVisible(true);
            bandera = false;
        }else{
            this.jLabelErrorNombres.setVisible(false);
        }
        
        if (jTextFieldApellidos.getText().equals("")) {
            this.jLabelErrorApellidos.setText("Error, campo vacío");
            this.jLabelErrorApellidos.setVisible(true);
            bandera = false;
        }else{
            this.jLabelErrorApellidos.setVisible(false);
        }
        
        if (jComboBoxGenero.getSelectedIndex() == 0) {
            this.jLabelErrorGenero.setText("Error, seleccione genero");
            this.jLabelErrorGenero.setVisible(true);
            bandera = false;
        }else{
            this.jLabelErrorGenero.setVisible(false);
        }
        
        return bandera;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Barra;
    private javax.swing.JLabel IconoUniversidad;
    private javax.swing.JPanel PanelPrincipal;
    private javax.swing.JButton jButtonRegistrar;
    private javax.swing.JButton jButtonRegresar;
    private javax.swing.JComboBox<String> jComboBoxGenero;
    private javax.swing.JComboBox<String> jComboBoxRol;
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
