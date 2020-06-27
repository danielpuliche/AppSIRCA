package cliente.vista.administrador;

import cliente.servicios.cliente;
import com.google.gson.Gson;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.io.IOException;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import modelo.DTO.ClsPeticionDTO;
import modelo.DTO.ClsResultadoDTO;
import utilidades.Utilidades;

public class VtnIniciarSesion extends javax.swing.JFrame {
    
    private cliente objCliente;

    public VtnIniciarSesion(cliente objCliente) {
        initComponents();
        Image icon = Toolkit.getDefaultToolkit().getImage("./src/Recursos/logo.png");
        this.setIconImage(icon);
        ocultarErrores();
        this.objCliente=objCliente;
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
        jPanelVisibilidadContrasenia = new javax.swing.JPanel();
        jLabelVisibilidadContrasenia = new javax.swing.JLabel();
        jLabelInvisibilidadContrasenia = new javax.swing.JLabel();
        jButtonIngresar = new javax.swing.JButton();
        jLabelIconoUser = new javax.swing.JLabel();
        jTextFieldLogin = new javax.swing.JTextField();
        jLabelRecuperarContrasenia = new javax.swing.JLabel();
        jLabelIconoContraseña = new javax.swing.JLabel();
        jLabelErrorLogin = new javax.swing.JLabel();
        jLabelErrorContrasenia = new javax.swing.JLabel();
        jPasswordFieldContrasenia = new javax.swing.JPasswordField();
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
        jPanelSuperior.add(jLabelSIRCA1, new org.netbeans.lib.awtextra.AbsoluteConstraints(405, 26, -1, -1));

        jLabelSIRCA2.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 24)); // NOI18N
        jLabelSIRCA2.setForeground(new java.awt.Color(255, 255, 255));
        jLabelSIRCA2.setText("Registro y Control");
        jLabelSIRCA2.setAlignmentY(0.0F);
        jPanelSuperior.add(jLabelSIRCA2, new org.netbeans.lib.awtextra.AbsoluteConstraints(423, 51, -1, -1));

        jLabelSIRCA3.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 24)); // NOI18N
        jLabelSIRCA3.setForeground(new java.awt.Color(255, 255, 255));
        jLabelSIRCA3.setText("de Acceso");
        jLabelSIRCA3.setAlignmentY(0.0F);
        jPanelSuperior.add(jLabelSIRCA3, new org.netbeans.lib.awtextra.AbsoluteConstraints(467, 76, -1, -1));

        getContentPane().add(jPanelSuperior, java.awt.BorderLayout.PAGE_START);

        jPanelInferior.setBackground(new java.awt.Color(255, 255, 255));
        jPanelInferior.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelInferior.setPreferredSize(new java.awt.Dimension(700, 30));

        jLabelDesarrolladores.setBackground(new java.awt.Color(255, 255, 255));
        jLabelDesarrolladores.setForeground(new java.awt.Color(0, 0, 0));
        jLabelDesarrolladores.setText("F&P Software Development || www.fypsoftwaredevelopment.com || 2020");
        jPanelInferior.add(jLabelDesarrolladores);

        getContentPane().add(jPanelInferior, java.awt.BorderLayout.PAGE_END);

        jPanelCentral.setBackground(new java.awt.Color(0, 0, 102));
        jPanelCentral.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelCentral.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelInterior.setBackground(new java.awt.Color(255, 255, 255));
        jPanelInterior.setPreferredSize(new java.awt.Dimension(400, 400));
        jPanelInterior.setLayout(new java.awt.BorderLayout());

        jPanelPrincipalInterior.setBackground(new java.awt.Color(255, 255, 255));
        jPanelPrincipalInterior.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelPrincipalInterior.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelVisibilidadContrasenia.setBackground(new java.awt.Color(255, 255, 255));
        jPanelVisibilidadContrasenia.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanelVisibilidadContrasenia.setLayout(new java.awt.CardLayout());

        jLabelVisibilidadContrasenia.setBackground(new java.awt.Color(255, 255, 255));
        jLabelVisibilidadContrasenia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/eye_visible_hide_hidden_show_icon_145988.png"))); // NOI18N
        jLabelVisibilidadContrasenia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabelVisibilidadContraseniaMousePressed(evt);
            }
        });
        jPanelVisibilidadContrasenia.add(jLabelVisibilidadContrasenia, "card3");

        jLabelInvisibilidadContrasenia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/eye_slash_visible_hide_hidden_show_icon_145987.png"))); // NOI18N
        jLabelInvisibilidadContrasenia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabelInvisibilidadContraseniaMousePressed(evt);
            }
        });
        jPanelVisibilidadContrasenia.add(jLabelInvisibilidadContrasenia, "card2");

        jPanelPrincipalInterior.add(jPanelVisibilidadContrasenia, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 129, -1, -1));

        jButtonIngresar.setBackground(new java.awt.Color(204, 0, 0));
        jButtonIngresar.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        jButtonIngresar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonIngresar.setText("Ingresar");
        jButtonIngresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonIngresarActionPerformed(evt);
            }
        });
        jButtonIngresar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButtonIngresarKeyPressed(evt);
            }
        });
        jPanelPrincipalInterior.add(jButtonIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(151, 238, 112, 41));

        jLabelIconoUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/user-rojo-32.png"))); // NOI18N
        jPanelPrincipalInterior.add(jLabelIconoUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(53, 40, -1, -1));

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
        jTextFieldLogin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldLoginKeyPressed(evt);
            }
        });
        jPanelPrincipalInterior.add(jTextFieldLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(122, 40, 215, 32));

        jLabelRecuperarContrasenia.setFont(new java.awt.Font("Yu Gothic UI Semibold", 2, 12)); // NOI18N
        jLabelRecuperarContrasenia.setForeground(new java.awt.Color(0, 102, 255));
        jLabelRecuperarContrasenia.setText("¿Has olvidado tu login o contraseña?");
        jPanelPrincipalInterior.add(jLabelRecuperarContrasenia, new org.netbeans.lib.awtextra.AbsoluteConstraints(108, 210, 202, -1));

        jLabelIconoContraseña.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/lock-7-32.png"))); // NOI18N
        jPanelPrincipalInterior.add(jLabelIconoContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(53, 129, -1, -1));

        jLabelErrorLogin.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        jLabelErrorLogin.setForeground(new java.awt.Color(255, 0, 0));
        jLabelErrorLogin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelErrorLogin.setText("Error");
        jPanelPrincipalInterior.add(jLabelErrorLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(122, 78, -1, -1));

        jLabelErrorContrasenia.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 12)); // NOI18N
        jLabelErrorContrasenia.setForeground(new java.awt.Color(255, 0, 0));
        jLabelErrorContrasenia.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelErrorContrasenia.setText("Error");
        jPanelPrincipalInterior.add(jLabelErrorContrasenia, new org.netbeans.lib.awtextra.AbsoluteConstraints(122, 167, -1, -1));

        jPasswordFieldContrasenia.setBackground(new java.awt.Color(255, 255, 255));
        jPasswordFieldContrasenia.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jPasswordFieldContrasenia.setForeground(new java.awt.Color(102, 102, 102));
        jPasswordFieldContrasenia.setText("Digite su contraseña");
        jPasswordFieldContrasenia.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                focusGainedPassword(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                focusLostPassword(evt);
            }
        });
        jPasswordFieldContrasenia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                keyPressedEvent(evt);
            }
        });
        jPanelPrincipalInterior.add(jPasswordFieldContrasenia, new org.netbeans.lib.awtextra.AbsoluteConstraints(122, 129, 215, 32));

        jPanelInterior.add(jPanelPrincipalInterior, java.awt.BorderLayout.CENTER);

        jPanelSuperiorInterior.setBackground(new java.awt.Color(204, 0, 0));
        jPanelSuperiorInterior.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelSuperiorInterior.setPreferredSize(new java.awt.Dimension(400, 45));

        jLabelIniciarSesion.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        jLabelIniciarSesion.setForeground(new java.awt.Color(255, 255, 255));
        jLabelIniciarSesion.setText("Iniciar sesión");
        jPanelSuperiorInterior.add(jLabelIniciarSesion);

        jPanelInterior.add(jPanelSuperiorInterior, java.awt.BorderLayout.PAGE_START);

        jPanelCentral.add(jPanelInterior, new org.netbeans.lib.awtextra.AbsoluteConstraints(157, 83, -1, 338));

        getContentPane().add(jPanelCentral, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    // Evento ENTER    
    private void keyPressedEvent(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_keyPressedEvent
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            jButtonIngresarActionPerformed(null);
        }
    }//GEN-LAST:event_keyPressedEvent

    
    
    // Eventos FOCUS inicio ==============================================================
    private void focusLostPassword(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_focusLostPassword
        if(jPasswordFieldContrasenia.getText().equals("")){
            jPasswordFieldContrasenia.setForeground(new java.awt.Color(102,102,102));
            jPasswordFieldContrasenia.setText("Digite su contraseña");
        }
    }//GEN-LAST:event_focusLostPassword

    private void focusGainedPassword(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_focusGainedPassword
        if(jPasswordFieldContrasenia.getText().equals("Digite su contraseña")){
            this.jPasswordFieldContrasenia.setText("");
            jPasswordFieldContrasenia.setForeground(new java.awt.Color(0, 0, 0));
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
    // Eventos FOCUS final ===============================================================
    
    
    
    // Botón INGRESAR, función principal
    private void jButtonIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonIngresarActionPerformed
        
        ocultarErrores();
        boolean loginValido = validarCantidadDeCaracteresLogin();
        boolean contraseniaValida = validarCantidadDeCaracteresPassword();
        boolean camposValidos = verificarCamposValidos();
        boolean camposVacios = camposVacios();
        
        
        if(camposVacios == false && camposValidos == false && contraseniaValida == false && loginValido == false){
            
            try {
                Gson objConvertidor = new Gson();
                ClsPeticionDTO objPeticion = new ClsPeticionDTO();
                
                objCliente.crearConexion();
                
                String argumentos = jTextFieldLogin.getText()+","+jPasswordFieldContrasenia.getText();
                objPeticion.setArgumentos(argumentos);
                objPeticion.setAccion("ingresarAlSistema");
                
                String JSON = objConvertidor.toJson(objPeticion);
                String respuestaJSON = objCliente.enviarPeticion(JSON);
                ClsResultadoDTO objResultado = objConvertidor.fromJson(respuestaJSON, ClsResultadoDTO.class);
                
                objCliente.cerrarConexion();
                
                if(objResultado.getCodigoResultado() == 1)
                {
                    VtnPrincipalAdmin objVtnPrincipalAdmin = new VtnPrincipalAdmin(this.objCliente, jTextFieldLogin.getText());
                    objVtnPrincipalAdmin.setVisible(true);
                    this.dispose();
                }
                else
                {
                    Utilidades.mensajeAdvertencia("Login o contraseña incorrectos", "Error");
                }

            } catch (IOException ex) {
                Utilidades.mensajeError("Fallo en conexión", "Error");
            }
            
        }else{
            if (camposVacios == true)
                Utilidades.mensajeAdvertencia("Hay campos obligatorios sin rellenar", "Error");
            else if (camposValidos == true)
                Utilidades.mensajeAdvertencia("Caracter(es) ingresado(s) no válido(s)", "Error");
            else 
                Utilidades.mensajeAdvertencia("Hay campos no válidos", "Error");
        }

    }//GEN-LAST:event_jButtonIngresarActionPerformed
    
    // Evento ENTER
    private void jTextFieldLoginKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldLoginKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            jButtonIngresarActionPerformed(null);
        }
    }//GEN-LAST:event_jTextFieldLoginKeyPressed

    // Evento ENTER
    private void jButtonIngresarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButtonIngresarKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            jButtonIngresarActionPerformed(null);
        }
    }//GEN-LAST:event_jButtonIngresarKeyPressed

        
        
    // Eventos VISIBILIDAD CONTRASEÑA inicio ===============================================
    private void jLabelVisibilidadContraseniaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelVisibilidadContraseniaMousePressed
        this.jPasswordFieldContrasenia.setEchoChar((char)0);
        this.jLabelVisibilidadContrasenia.setVisible(false);
        this.jLabelInvisibilidadContrasenia.setVisible(true);
        focusGainedPassword(null);
    }//GEN-LAST:event_jLabelVisibilidadContraseniaMousePressed

    private void jLabelInvisibilidadContraseniaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelInvisibilidadContraseniaMousePressed
        this.jPasswordFieldContrasenia.setEchoChar('*');
        this.jLabelInvisibilidadContrasenia.setVisible(false);
        this.jLabelVisibilidadContrasenia.setVisible(true);
        focusLostPassword(null);
    }//GEN-LAST:event_jLabelInvisibilidadContraseniaMousePressed
    // Eventos VISIBILIDAD CONTRASEÑA final ================================================
    
    
    
    // VALIDACION de campos inicio =========================================================
    private boolean camposVacios(){
        
        boolean bandera = false; //false = campos correctos
        
        switch (this.jTextFieldLogin.getText()) {
            case "Digite su login":
                mostrarError(jLabelErrorLogin, "Rellene este campo",jTextFieldLogin);
                bandera = true;
                break;
            case "":
                mostrarError(jLabelErrorLogin, "Rellene este campo",jTextFieldLogin);
                bandera = true;
                break;
            default:
                break;
        }
        
        switch (this.jPasswordFieldContrasenia.getText()) {
            case "Digite su contraseña":
                mostrarError(jLabelErrorContrasenia, "Rellene este campo", jPasswordFieldContrasenia);
                bandera = true;
                break;
            case "":
                mostrarError(jLabelErrorContrasenia, "Rellene este campo", jPasswordFieldContrasenia);
                bandera = true;
                break;
            default:
                break;
        }
        
        return bandera;
    }    
    
    private void ocultarErrores(){
        this.jLabelErrorLogin.setVisible(false);
        this.jLabelErrorContrasenia.setVisible(false);
        jTextFieldLogin.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPasswordFieldContrasenia.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
    }
    
    private boolean verificarCamposValidos(){
        
        boolean bandera = false; // false = campos validos        
                
        if(verificarCaracteresValidosLogin(jTextFieldLogin) == true)
        {   
            mostrarError(jLabelErrorLogin, "Carácter ingresado no válido",jTextFieldLogin);
            bandera=true;
        }        
        
        if(verificarCaracteresValidosPassword(jPasswordFieldContrasenia) == true)
        {
            mostrarError(jLabelErrorContrasenia, "Carácter ingresado no válido",jPasswordFieldContrasenia);
            bandera=true;
        }
               
        return bandera;
    }
    
    private boolean verificarCaracteresValidosLogin(JTextField campo) {
        
        char[] caracteresValidos = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','ñ','o','p','r','s','t',
                                    'u','v','w','x','y','z','0','1','2','3','4','5','6','7','8','9'};    ///FALTAN POR AGREGAR
                                      
        boolean bandera = false; // false = validos
        char[] caracteresEnCampo = campo.getText().toCharArray();
        
        for(int i=0; i<caracteresEnCampo.length; i++){
            
            String caracterCampo = String.valueOf(caracteresEnCampo[i]);
            boolean banderaInterna = false; // caracter incorrecto
            
            for(int j=0; j<caracteresValidos.length; j++){
                
                String caracterValido = String.valueOf(caracteresValidos[j]);
                
                if(caracterCampo.equalsIgnoreCase(caracterValido))
                {
                    banderaInterna = true;
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
    
    private boolean validarCantidadDeCaracteresLogin(){
        
        boolean bandera = false; // false = correcto
        
        if(jTextFieldLogin.getText().length() > 15){ 
            bandera = true;
            mostrarError(jLabelErrorLogin, "El login debe poseer máximo 15 digitos",jTextFieldLogin);            
        }
               
        return bandera;
    }
    
    private boolean verificarCaracteresValidosPassword(JPasswordField campo) {
        
        char[] caracteresValidos = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','ñ','o','p','r','s','t',
                                    'u','v','w','x','y','z','0','1','2','3','4','5','6','7','8','9'};    ///FALTAN POR AGREGAR
                                      
        boolean bandera = false; // false = validos
        char[] caracteresEnCampo = campo.getText().toCharArray();
        
        for(int i=0; i<caracteresEnCampo.length; i++){
            
            String caracterCampo = String.valueOf(caracteresEnCampo[i]);
            boolean banderaInterna = false; // caracter incorrecto
            
            for(int j=0; j<caracteresValidos.length; j++){
                
                String caracterValido = String.valueOf(caracteresValidos[j]);
                
                if(caracterCampo.equalsIgnoreCase(caracterValido))
                {
                    banderaInterna = true;
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
    
    private boolean validarCantidadDeCaracteresPassword(){
        
        boolean bandera = false; // false = correcto
        
        if(jPasswordFieldContrasenia.getText().length() > 15){ 
            bandera = true;
            mostrarError(jLabelErrorContrasenia, "La contraseña debe poseer másimo 15 digitos",jPasswordFieldContrasenia);            
        }
               
        return bandera;
    }
    
    private void mostrarError(JLabel notificacion, String error, JTextField field){
            field.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
            notificacion.setText(error);
            notificacion.setVisible(true);
    }
    // VALIDACIÓN de campos final ===========================================================
     
    
    
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
    private javax.swing.JLabel jLabelInvisibilidadContrasenia;
    private javax.swing.JLabel jLabelRecuperarContrasenia;
    private javax.swing.JLabel jLabelSIRCA1;
    private javax.swing.JLabel jLabelSIRCA2;
    private javax.swing.JLabel jLabelSIRCA3;
    private javax.swing.JLabel jLabelUniversidad;
    private javax.swing.JLabel jLabelVisibilidadContrasenia;
    private javax.swing.JPanel jPanelCentral;
    private javax.swing.JPanel jPanelInferior;
    private javax.swing.JPanel jPanelInterior;
    private javax.swing.JPanel jPanelPrincipalInterior;
    private javax.swing.JPanel jPanelSuperior;
    private javax.swing.JPanel jPanelSuperiorInterior;
    private javax.swing.JPanel jPanelVisibilidadContrasenia;
    private javax.swing.JPasswordField jPasswordFieldContrasenia;
    private javax.swing.JTextField jTextFieldLogin;
    // End of variables declaration//GEN-END:variables
}
