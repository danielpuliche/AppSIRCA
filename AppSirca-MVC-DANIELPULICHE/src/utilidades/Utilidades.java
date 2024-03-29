package utilidades;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Utilidades {

    /**
     * Genera un emergente de aventencia
     *
     * @param mns mensaje dentro de la ventana
     * @param titulo título de la ventana
     */
    public static void mensajeAdvertencia(String mns, String titulo) {
        JOptionPane.showMessageDialog(null, mns, titulo, JOptionPane.DEFAULT_OPTION, new ImageIcon("./src/recursos/warning.png"));
    }

    /**
     * Genera un emergente de error
     *
     * @param mns mensaje dentro de la ventana
     * @param titulo título de la ventana
     */
    public static void mensajeError(String mns, String titulo) {
        JOptionPane.showMessageDialog(null, mns, titulo, JOptionPane.DEFAULT_OPTION, new ImageIcon("./src/recursos/error.png"));
    }

    /**
     * Genera un emergente de exito
     *
     * @param mns mensaje dentro de la ventana
     * @param titulo título de la ventana
     */
    public static void mensajeExito(String mns, String titulo) {
        JOptionPane.showMessageDialog(null, mns, titulo, JOptionPane.DEFAULT_OPTION, new ImageIcon("./src/recursos/exito.png"));
    }

    /**
     * Genera un emergente de confirmación con los botones Si ó No
     *
     * @param mns mensaje dentro de la ventana
     * @param titulo título de la ventana
     * @return Si ó No
     */
    public static int mensajeConfirmacion(String mns, String titulo) {
        return JOptionPane.showConfirmDialog(null, mns, titulo, JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE , new ImageIcon("./src/recursos/information_info.png"));
    }

}
