package cliente.vista;

import cliente.servicios.cliente;
import com.google.gson.Gson;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.ClsPeticion;
import modelo.ClsResultado;
import utilidades.Utilidades;

public class VtnIniciarSesion extends javax.swing.JFrame {
    
    private cliente objCliente;

    public VtnIniciarSesion(cliente objCliente) {
        initComponents();
        jLabelErrorLogin.setVisible(false);
        jLabelErrorContrasenia.setVisible(false);
        this.objCliente=objCliente;
        setLocationRelativeTo(null);
        Image icon = Toolkit.getDefaultToolkit().getImage("./src/recursos/logo.png");
        this.setIconImage(icon);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelSuperior = new javax.swing.JPanel();
        IconoUniversidad = new javax.swing.JLabel();
        jLabelUniversidad = new javax.swing.JLabel();
        jLabelDelCauca = new javax.swing.JLabel();
        Barra = new javax.swing.JPanel();
        jLabelSIRCA1 = new javax.swing.JLabel();
        jLabelSIRCA2 = new javax.swing.JLabel();
        jLabelSIRCA3 = new javax.swing.JLabel();
        jPanelInferior = new javax.swing.JPanel();
        jLabelDesarrolladores = new javax.swing.JLabel();
        jPanelCentral = new javax.swing.JPanel();
        jPanelInterior = new javax.swing.JPanel();
        jPanelPrincipalInterior = new javax.swing.JPanel();
        jButtonIngresar = new javax.swing.JButton();
        jLabelIconoUser = new javax.swing.JLabel();
        jTextFieldLogin = new javax.swing.JTextField();
        jLabelRecuperarContrasenia = new javax.swing.JLabel();
        jLabelIconoContraseña = new javax.swing.JLabel();
        jLabelErrorLogin = new javax.swing.JLabel();
        jLabelErrorContrasenia = new javax.swing.JLabel();
        jPasswordFieldContraseña = new javax.swing.JPasswordField();
        jPanelSuperiorInterior = new javax.swing.JPanel();
        jLabelIniciarSesion = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SIRCA - Unicauca");
        setMinimumSize(new java.awt.Dimension(700, 680));
        setResizable(false);

        jPanelSuperior.setBackground(new java.awt.Color(204, 0, 0));
        jPanelSuperior.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
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

        getContentPane().add(jPanelSuperior, java.awt.BorderLayout.PAGE_START);

        jPanelInferior.setBackground(new java.awt.Color(255, 255, 255));
        jPanelInferior.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelInferior.setPreferredSize(new java.awt.Dimension(700, 30));

        jLabelDesarrolladores.setForeground(new java.awt.Color(0, 0, 0));
        jLabelDesarrolladores.setText("F&P Software Development || www.fypsoftwaredevelopment.com || 2020");
        jPanelInferior.add(jLabelDesarrolladores);

        getContentPane().add(jPanelInferior, java.awt.BorderLayout.PAGE_END);

        jPanelCentral.setBackground(new java.awt.Color(0, 0, 102));
        jPanelCentral.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jPanelInterior.setBackground(new java.awt.Color(255, 255, 255));
        jPanelInterior.setPreferredSize(new java.awt.Dimension(400, 400));
        jPanelInterior.setLayout(new java.awt.BorderLayout());

        jPanelPrincipalInterior.setBackground(new java.awt.Color(255, 255, 255));
        jPanelPrincipalInterior.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jButtonIngresar.setBackground(new java.awt.Color(204, 0, 0));
        jButtonIngresar.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        jButtonIngresar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonIngresar.setText("Ingresar");
        jButtonIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonIngresarActionPerformed(evt);
            }
        });

        jLabelIconoUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/user-rojo-32.png"))); // NOI18N

        jTextFieldLogin.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldLogin.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        jTextFieldLogin.setForeground(new java.awt.Color(102, 102, 102));
        jTextFieldLogin.setText("Digite su login");
        jTextFieldLogin.setToolTipText("");
        jTextFieldLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jTextFieldLogin.setName(""); // NOI18N
        jTextFieldLogin.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                focusGainedLogin(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                focusLostLogin(evt);
            }
        });

        jLabelRecuperarContrasenia.setFont(new java.awt.Font("Yu Gothic UI Semibold", 2, 12)); // NOI18N
        jLabelRecuperarContrasenia.setForeground(new java.awt.Color(0, 102, 255));
        jLabelRecuperarContrasenia.setText("¿Has olvidado tu login o contraseña?");

        jLabelIconoContraseña.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/lock-7-32.png"))); // NOI18N

        jLabelErrorLogin.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        jLabelErrorLogin.setForeground(new java.awt.Color(255, 0, 0));
        jLabelErrorLogin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelErrorLogin.setText("Error");

        jLabelErrorContrasenia.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        jLabelErrorContrasenia.setForeground(new java.awt.Color(255, 0, 0));
        jLabelErrorContrasenia.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelErrorContrasenia.setText("Error");

        jPasswordFieldContraseña.setBackground(new java.awt.Color(255, 255, 255));
        jPasswordFieldContraseña.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jPasswordFieldContraseña.setForeground(new java.awt.Color(102, 102, 102));
        jPasswordFieldContraseña.setText("Password");
        jPasswordFieldContraseña.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                focusGainedPassword(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                focusLostPassword(evt);
            }
        });
        jPasswordFieldContraseña.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                keyPressedEvent(evt);
            }
        });

        javax.swing.GroupLayout jPanelPrincipalInteriorLayout = new javax.swing.GroupLayout(jPanelPrincipalInterior);
        jPanelPrincipalInterior.setLayout(jPanelPrincipalInteriorLayout);
        jPanelPrincipalInteriorLayout.setHorizontalGroup(
            jPanelPrincipalInteriorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelPrincipalInteriorLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButtonIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(135, 135, 135))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelPrincipalInteriorLayout.createSequentialGroup()
                .addContainerGap(106, Short.MAX_VALUE)
                .addComponent(jLabelRecuperarContrasenia, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(88, 88, 88))
            .addGroup(jPanelPrincipalInteriorLayout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(jPanelPrincipalInteriorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelIconoUser)
                    .addComponent(jLabelIconoContraseña))
                .addGap(37, 37, 37)
                .addGroup(jPanelPrincipalInteriorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextFieldLogin, javax.swing.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE)
                    .addComponent(jLabelErrorContrasenia)
                    .addComponent(jLabelErrorLogin)
                    .addComponent(jPasswordFieldContraseña))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelPrincipalInteriorLayout.setVerticalGroup(
            jPanelPrincipalInteriorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelPrincipalInteriorLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanelPrincipalInteriorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jTextFieldLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelIconoUser))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelErrorLogin)
                .addGap(35, 35, 35)
                .addGroup(jPanelPrincipalInteriorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabelIconoContraseña, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPasswordFieldContraseña))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelErrorContrasenia)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(jLabelRecuperarContrasenia)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
        );

        jPanelInterior.add(jPanelPrincipalInterior, java.awt.BorderLayout.CENTER);

        jPanelSuperiorInterior.setBackground(new java.awt.Color(204, 0, 0));
        jPanelSuperiorInterior.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelSuperiorInterior.setPreferredSize(new java.awt.Dimension(400, 45));

        jLabelIniciarSesion.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        jLabelIniciarSesion.setForeground(new java.awt.Color(255, 255, 255));
        jLabelIniciarSesion.setText("Iniciar sesión");
        jPanelSuperiorInterior.add(jLabelIniciarSesion);

        jPanelInterior.add(jPanelSuperiorInterior, java.awt.BorderLayout.PAGE_START);

        javax.swing.GroupLayout jPanelCentralLayout = new javax.swing.GroupLayout(jPanelCentral);
        jPanelCentral.setLayout(jPanelCentralLayout);
        jPanelCentralLayout.setHorizontalGroup(
            jPanelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCentralLayout.createSequentialGroup()
                .addGap(155, 155, 155)
                .addComponent(jPanelInterior, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(141, Short.MAX_VALUE))
        );
        jPanelCentralLayout.setVerticalGroup(
            jPanelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelCentralLayout.createSequentialGroup()
                .addContainerGap(81, Short.MAX_VALUE)
                .addComponent(jPanelInterior, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(87, 87, 87))
        );

        getContentPane().add(jPanelCentral, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void keyPressedEvent(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_keyPressedEvent
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            jButtonIngresarActionPerformed(null);
        }
    }//GEN-LAST:event_keyPressedEvent

    private void focusLostPassword(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_focusLostPassword
        if(jPasswordFieldContraseña.getText().equals("")){
            jPasswordFieldContraseña.setForeground(new java.awt.Color(102,102,102));
            jPasswordFieldContraseña.setText("Password");
        }
    }//GEN-LAST:event_focusLostPassword

    private void focusGainedPassword(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_focusGainedPassword
        if(jPasswordFieldContraseña.getText().equals("Password")){
            this.jPasswordFieldContraseña.setText("");
            jPasswordFieldContraseña.setForeground(new java.awt.Color(0, 0, 0));
        }
    }//GEN-LAST:event_focusGainedPassword

    private void focusLostLogin(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_focusLostLogin
        if(jTextFieldLogin.getText().equals("")){
            jTextFieldLogin.setForeground(new java.awt.Color(102,102,102));
            jTextFieldLogin.setText("Digite su login");
        }
    }//GEN-LAST:event_focusLostLogin

    private void focusGainedLogin(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_focusGainedLogin
        if(jTextFieldLogin.getText().equals("Digite su login")){
            this.jTextFieldLogin.setText("");
            jTextFieldLogin.setForeground(new java.awt.Color(0, 0, 0));
        }
    }//GEN-LAST:event_focusGainedLogin

    private void jButtonIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonIngresarActionPerformed

        if(verificarCampos() == true){
            try {
                objCliente.crearConexion();
                Gson objConvertidor= new Gson();
                ClsPeticion objPeticion= new ClsPeticion();
                String argumentos=jTextFieldLogin.getText()+","+jPasswordFieldContraseña.getText();
                objPeticion.setAccion("ingresarAlSistema");
                objPeticion.setArgumentos(argumentos);
                String JSON = objConvertidor.toJson(objPeticion);
                String respuestaJSON=objCliente.enviarPeticion(JSON);
                ClsResultado objResultado= objConvertidor.fromJson(respuestaJSON, ClsResultado.class);
                objCliente.cerrarConexion();
                if(objResultado.getCodigoResultado()==1)
                {
                    VtnPrincipalAdministrador objVtnPrincipalAdministrador = new VtnPrincipalAdministrador(this.objCliente,jTextFieldLogin.getText());
                    objVtnPrincipalAdministrador.setVisible(true);
                    this.dispose();
                }
                else
                {
                    Utilidades.mensajeAdvertencia("Usuario o contraseña incorrecta", "Atención");
                }

            } catch (IOException ex) {
                Logger.getLogger(VtnIniciarSesion.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else{
            Utilidades.mensajeAdvertencia("Hay campos obligatorios sin llenar", "Error");
        }

    }//GEN-LAST:event_jButtonIngresarActionPerformed

    private boolean verificarCampos(){
        
        boolean bandera = true; //true = campos correctos
        
        if(this.jTextFieldLogin.getText().equals("Digite su login")){
            this.jLabelErrorLogin.setText("Error, campo vacío");
            this.jLabelErrorLogin.setVisible(true);
            bandera = false;
        }else{
            this.jLabelErrorLogin.setVisible(false);
        }
        
        if(this.jPasswordFieldContraseña.getText().equals("Password")){
            this.jLabelErrorContrasenia.setText("Error, digite su contraseña");
            this.jLabelErrorContrasenia.setVisible(true);
            bandera = false;
        }else{
            this.jLabelErrorContrasenia.setVisible(false);
        }
        
        return bandera;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Barra;
    private javax.swing.JLabel IconoUniversidad;
    private javax.swing.JButton jButtonIngresar;
    private javax.swing.JLabel jLabelDelCauca;
    private javax.swing.JLabel jLabelDesarrolladores;
    private javax.swing.JLabel jLabelErrorContrasenia;
    private javax.swing.JLabel jLabelErrorLogin;
    private javax.swing.JLabel jLabelIconoContraseña;
    private javax.swing.JLabel jLabelIconoUser;
    private javax.swing.JLabel jLabelIniciarSesion;
    private javax.swing.JLabel jLabelRecuperarContrasenia;
    private javax.swing.JLabel jLabelSIRCA1;
    private javax.swing.JLabel jLabelSIRCA2;
    private javax.swing.JLabel jLabelSIRCA3;
    private javax.swing.JLabel jLabelUniversidad;
    private javax.swing.JPanel jPanelCentral;
    private javax.swing.JPanel jPanelInferior;
    private javax.swing.JPanel jPanelInterior;
    private javax.swing.JPanel jPanelPrincipalInterior;
    private javax.swing.JPanel jPanelSuperior;
    private javax.swing.JPanel jPanelSuperiorInterior;
    private javax.swing.JPasswordField jPasswordFieldContraseña;
    private javax.swing.JTextField jTextFieldLogin;
    // End of variables declaration//GEN-END:variables
}
