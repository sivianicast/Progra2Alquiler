/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilidadaes;

import javax.swing.JOptionPane;

/**
 *
 * @author siviany
 */
public abstract class Utilidad {
    public static void noPermiteTexto(java.awt.event.KeyEvent evt){
        char validat = evt.getKeyChar();// validar que un jtex no resiva text
        if (Character.isLetter(validat)) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "No se permite texto, solo numeros");
        }
    }
     
}
