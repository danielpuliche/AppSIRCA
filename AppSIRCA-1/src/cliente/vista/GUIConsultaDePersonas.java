package cliente.vista;

import cliente.servicios.cliente;
import com.google.gson.Gson;
import static java.awt.Frame.MAXIMIZED_BOTH;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.ClsPersona;
import modelo.ClsPeticion;
import modelo.ClsResultado;
import utilidades.Utilidades;


public class GUIConsultaDePersonas extends javax.swing.JInternalFrame {
     private cliente objCliente;

    /**
     * Constructor
     */
    public GUIConsultaDePersonas(cliente objCliente) {
        initComponents();
        this.setSize(790, 580);
         this.objCliente=objCliente;
      
    }
    


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        pnlNorte = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtNumero = new javax.swing.JFormattedTextField();
        btnBuscar = new javax.swing.JButton();
        jComboBoxTipoIdentificacion = new javax.swing.JComboBox();
        pnlSur = new javax.swing.JPanel();
        btnCerrar = new javax.swing.JButton();
        tabPrincipal = new javax.swing.JTabbedPane();
        pnlPestaniaDatosVehiculo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtNombres = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtApellidos = new javax.swing.JTextField();
        pnlPestaniaMapa = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        cboZona = new javax.swing.JComboBox<String>();
        jLabel6 = new javax.swing.JLabel();
        cboPuesto = new javax.swing.JComboBox<String>();
        btnAsignar = new javax.swing.JButton();

        setClosable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Consultar personas");
        setPreferredSize(new java.awt.Dimension(790, 580));

        pnlNorte.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnlNorte.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setText("Tipo de identificación: ");
        pnlNorte.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 27, -1, -1));
        pnlNorte.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(275, 34, -1, -1));
        pnlNorte.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(584, 31, -1, -1));

        jLabel3.setText("Número:");
        pnlNorte.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 30, -1, -1));

        txtNumero.setFont(new java.awt.Font("DejaVu Sans", 1, 24)); // NOI18N
        txtNumero.setPreferredSize(new java.awt.Dimension(200, 60));
        txtNumero.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNumeroKeyPressed(evt);
            }
        });
        pnlNorte.add(txtNumero, new org.netbeans.lib.awtextra.AbsoluteConstraints(378, 3, 200, 60));

        btnBuscar.setFont(new java.awt.Font("DejaVu Sans", 0, 16)); // NOI18N
        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/buscar.png"))); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.setIconTextGap(2);
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        pnlNorte.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(623, 22, -1, -1));

        jComboBoxTipoIdentificacion.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "CC", "TI", "CE", "CODIGO" }));
        pnlNorte.add(jComboBoxTipoIdentificacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, -1, -1));

        getContentPane().add(pnlNorte, java.awt.BorderLayout.NORTH);

        pnlSur.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/cerrar.png"))); // NOI18N
        btnCerrar.setText("Cerrar");
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });
        pnlSur.add(btnCerrar);

        getContentPane().add(pnlSur, java.awt.BorderLayout.SOUTH);

        pnlPestaniaDatosVehiculo.setLayout(new java.awt.GridLayout(3, 2));

        jLabel1.setText("Nombres:");
        pnlPestaniaDatosVehiculo.add(jLabel1);
        pnlPestaniaDatosVehiculo.add(txtNombres);

        jLabel2.setText("Apellidos:");
        pnlPestaniaDatosVehiculo.add(jLabel2);
        pnlPestaniaDatosVehiculo.add(txtApellidos);

        tabPrincipal.addTab("Datos persona", pnlPestaniaDatosVehiculo);

        pnlPestaniaMapa.setLayout(new java.awt.BorderLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Asignar vehículo"));

        jLabel5.setText("Zona:");
        jPanel1.add(jLabel5);

        cboZona.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Ipet", "Ingenierias A", "Ingenierias B" }));
        jPanel1.add(cboZona);

        jLabel6.setText("Puesto:");
        jPanel1.add(jLabel6);

        cboPuesto.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4" }));
        jPanel1.add(cboPuesto);

        btnAsignar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/aplicar.png"))); // NOI18N
        btnAsignar.setText("Asignar");
        btnAsignar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAsignarActionPerformed(evt);
            }
        });
        jPanel1.add(btnAsignar);

        pnlPestaniaMapa.add(jPanel1, java.awt.BorderLayout.SOUTH);

        tabPrincipal.addTab("Mapa", pnlPestaniaMapa);

        getContentPane().add(tabPrincipal, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void txtNumeroKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumeroKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            btnBuscar.requestFocus();
            btnBuscarActionPerformed(null);
        }
    }//GEN-LAST:event_txtNumeroKeyPressed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        
         try {
            objCliente.crearConexion();
            Gson objConvertidor= new Gson();
            ClsPeticion objPeticion= new ClsPeticion();
            String argumentos;
            
            argumentos=jComboBoxTipoIdentificacion.getSelectedItem()+","+txtNumero.getText();
            
            
            objPeticion.setAccion("consultarPersona");
            objPeticion.setArgumentos(argumentos);
            String JSON = objConvertidor.toJson(objPeticion);
            String respuestaJSON=objCliente.enviarPeticion(JSON);
            ClsResultado objResultado= objConvertidor.fromJson(respuestaJSON, ClsResultado.class); 
            objCliente.cerrarConexion();
        
            if(objResultado.getCodigoResultado()==1)
            {
                ClsPersona objPersona= objConvertidor.fromJson(objResultado.getJSONResultado(), ClsPersona.class); 
                txtNombres.setText(objPersona.getNombres());
                txtApellidos.setText(objPersona.getApellidos());
            }
            else
            {
                txtNumero.requestFocus();
                txtNombres.setText("");
                txtApellidos.setText("");
                Utilidades.mensajeAdvertencia("Usuario no encontrado", "Atención");
            }
         } catch (IOException ex) {
             Logger.getLogger(GUIConsultaDePersonas.class.getName()).log(Level.SEVERE, null, ex);
         }
            
        
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnAsignarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAsignarActionPerformed

    }//GEN-LAST:event_btnAsignarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAsignar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCerrar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cboPuesto;
    private javax.swing.JComboBox<String> cboZona;
    private javax.swing.JComboBox jComboBoxTipoIdentificacion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel pnlNorte;
    private javax.swing.JPanel pnlPestaniaDatosVehiculo;
    private javax.swing.JPanel pnlPestaniaMapa;
    private javax.swing.JPanel pnlSur;
    private javax.swing.JTabbedPane tabPrincipal;
    private javax.swing.JTextField txtApellidos;
    private javax.swing.JTextField txtNombres;
    private javax.swing.JFormattedTextField txtNumero;
    // End of variables declaration//GEN-END:variables
}
