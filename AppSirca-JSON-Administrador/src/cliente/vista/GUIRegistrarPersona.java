package cliente.vista;

import cliente.servicios.cliente;
import com.google.gson.Gson;
import java.io.IOException;
import modelo.ClsPersona;
import modelo.ClsPeticion;
import modelo.ClsResultado;

public class GUIRegistrarPersona extends javax.swing.JInternalFrame{

    private cliente objCiente;
    
    
    public GUIRegistrarPersona(cliente objCliente) {
        initComponents();
        
        this.objCiente=objCliente;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldNumeroIdentificacion = new javax.swing.JTextField();
        jTextFieldNombres = new javax.swing.JTextField();
        jTextFieldApellidos = new javax.swing.JTextField();
        jComboBoxTipoIdentificacion = new javax.swing.JComboBox();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jButtonRegistrar = new javax.swing.JButton();
        btnCerrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("Tipo de identificación: ");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(97, 32, -1, -1));

        jLabel3.setText("Número de identificación:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(97, 70, -1, -1));

        jLabel4.setText("Nombres:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(97, 108, -1, -1));

        jLabel5.setText("Apellidos:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(97, 146, -1, -1));
        jPanel1.add(jTextFieldNumeroIdentificacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(242, 67, 168, -1));

        jTextFieldNombres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNombresActionPerformed(evt);
            }
        });
        jPanel1.add(jTextFieldNombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(242, 105, 168, -1));
        jPanel1.add(jTextFieldApellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(242, 143, 168, -1));

        jComboBoxTipoIdentificacion.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "CC", "TI", "CE", "CODIGO" }));
        jPanel1.add(jComboBoxTipoIdentificacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 30, -1, -1));

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Registrar persona");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(163, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(155, 155, 155))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, java.awt.BorderLayout.PAGE_START);

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jButtonRegistrar.setText("Registrar");
        jButtonRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegistrarActionPerformed(evt);
            }
        });

        btnCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/cerrar.png"))); // NOI18N
        btnCerrar.setText("Cerrar");
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(btnCerrar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 243, Short.MAX_VALUE)
                .addComponent(jButtonRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(40, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCerrar))
                .addGap(32, 32, 32))
        );

        getContentPane().add(jPanel3, java.awt.BorderLayout.PAGE_END);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldNombresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNombresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNombresActionPerformed

    private void jButtonRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegistrarActionPerformed
        
        try {
            
            this.objCiente.crearConexion();
            Gson gson= new Gson();
            ClsPeticion objPeticion= new ClsPeticion();
            ClsResultado objResultado= new ClsResultado();
            
            String nombres, apellidos, tipoIdentificacion, numeroIdentificacion;
            
            tipoIdentificacion=(String) jComboBoxTipoIdentificacion.getSelectedItem();
            numeroIdentificacion=jTextFieldNumeroIdentificacion.getText();
            nombres=jTextFieldNombres.getText();
            apellidos=jTextFieldApellidos.getText();
            
            ClsPersona objPersona= new ClsPersona(tipoIdentificacion, numeroIdentificacion, nombres, apellidos);
            String JSONPersona=gson.toJson(objPersona);
            
            objPeticion.setAccion("registrarPersona");
            objPeticion.setArgumentos(JSONPersona);
            String JSONPeticion=gson.toJson(objPeticion);
            
            String resultado=objCiente.enviarPeticion(JSONPeticion);
            objResultado=gson.fromJson(resultado, ClsResultado.class);
            
            if(objResultado.getCodigoResultado()==1)
            {
                utilidades.Utilidades.mensajeExito("Registro exitoso de la persona", "registro exitoso");
            }
            else
            {
                utilidades.Utilidades.mensajeAdvertencia("la persona ya se encuentra registra en el sistema", "error en el registro");
            }
            
            this.objCiente.cerrarConexion();
             
        } catch (IOException ex) {
            
        }
        
       
        
    }//GEN-LAST:event_jButtonRegistrarActionPerformed

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCerrarActionPerformed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton jButtonRegistrar;
    private javax.swing.JComboBox jComboBoxTipoIdentificacion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField jTextFieldApellidos;
    private javax.swing.JTextField jTextFieldNombres;
    private javax.swing.JTextField jTextFieldNumeroIdentificacion;
    // End of variables declaration//GEN-END:variables
}
