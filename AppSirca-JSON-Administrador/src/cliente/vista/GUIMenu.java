package cliente.vista;

import cliente.servicios.cliente;
import utilidades.Utilidades;
import java.awt.Image;
import java.awt.Toolkit;

public class GUIMenu extends javax.swing.JFrame {

    private cliente objCliente;

    public GUIMenu(cliente objCliente, String login) {
        initComponents();
        //Poner el icono de la aplicación
        Image icon = Toolkit.getDefaultToolkit().getImage("./src/recursos/logo.png");
        this.setIconImage(icon);
        this.objCliente=objCliente;
        ponerUsuarioLogueado(login);
        fijarPrivilegios();
    }

    private void ponerUsuarioLogueado(String login) {
       
        this.mnuUsuarioLogueado.setText(login);
       
    }

    private void fijarPrivilegios() {
        /*
        Empleados empleado = Utilidades.empleadoSesion;
        if (empleado != null) {
            if (empleado.getCargo().equals("A")) {
                //Admin
            } else {
                //Empleado normal
                mnuConfiguracion.setVisible(false);
                mnuInformes.setVisible(false);
            }
        }
         */
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dskEscritorio = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnuOpciones = new javax.swing.JMenu();
        mnuIngresoVehiculos = new javax.swing.JMenuItem();
        mnuRegistrarPersona = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        mnuSalir = new javax.swing.JMenuItem();
        mnuAyuda = new javax.swing.JMenu();
        mnuAcercaDe = new javax.swing.JMenuItem();
        mnuUsuarioLogueado = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Administración de Parqueadero");

        mnuOpciones.setText("Opciones");

        mnuIngresoVehiculos.setText("Consultar personas");
        mnuIngresoVehiculos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuIngresoVehiculosActionPerformed(evt);
            }
        });
        mnuOpciones.add(mnuIngresoVehiculos);

        mnuRegistrarPersona.setText("Registrar persona");
        mnuRegistrarPersona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuRegistrarPersonaActionPerformed(evt);
            }
        });
        mnuOpciones.add(mnuRegistrarPersona);
        mnuOpciones.add(jSeparator1);

        mnuSalir.setText("Salir");
        mnuSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuSalirActionPerformed(evt);
            }
        });
        mnuOpciones.add(mnuSalir);

        jMenuBar1.add(mnuOpciones);

        mnuAyuda.setText("Ayuda");

        mnuAcercaDe.setText("Acerca de");
        mnuAcercaDe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuAcercaDeActionPerformed(evt);
            }
        });
        mnuAyuda.add(mnuAcercaDe);

        jMenuBar1.add(mnuAyuda);

        mnuUsuarioLogueado.setBackground(java.awt.Color.magenta);
        mnuUsuarioLogueado.setForeground(java.awt.SystemColor.activeCaption);
        mnuUsuarioLogueado.setText("Usuario_logueado");
        mnuUsuarioLogueado.setEnabled(false);
        jMenuBar1.add(mnuUsuarioLogueado);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dskEscritorio, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1033, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 102, Short.MAX_VALUE)
                .addComponent(dskEscritorio, javax.swing.GroupLayout.PREFERRED_SIZE, 843, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnuIngresoVehiculosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuIngresoVehiculosActionPerformed
        GUIConsultaDePersonas ins = new GUIConsultaDePersonas(objCliente);
        ins.setMaximizable(true);

        dskEscritorio.add(ins);
        ins.show();
    }//GEN-LAST:event_mnuIngresoVehiculosActionPerformed

    private void mnuSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuSalirActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_mnuSalirActionPerformed

    private void mnuAcercaDeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuAcercaDeActionPerformed
        // TODO add your handling code here:
        String str = "Parqueadero Tulcán \n"
                + "Version 0.1 -  Enero 20 de 2020 \n"
                + "Universidad del Cauca";
        Utilidades.mensajeExito(str, "Acerca De");
    }//GEN-LAST:event_mnuAcercaDeActionPerformed

    private void mnuRegistrarPersonaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuRegistrarPersonaActionPerformed
        
        GUIRegistrarPersona VTNIngresarPersona= new GUIRegistrarPersona(this.objCliente);
        dskEscritorio.add(VTNIngresarPersona);
        VTNIngresarPersona.setVisible(true);
        
    }//GEN-LAST:event_mnuRegistrarPersonaActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane dskEscritorio;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JMenuItem mnuAcercaDe;
    private javax.swing.JMenu mnuAyuda;
    private javax.swing.JMenuItem mnuIngresoVehiculos;
    private javax.swing.JMenu mnuOpciones;
    private javax.swing.JMenuItem mnuRegistrarPersona;
    private javax.swing.JMenuItem mnuSalir;
    private javax.swing.JMenu mnuUsuarioLogueado;
    // End of variables declaration//GEN-END:variables

}
