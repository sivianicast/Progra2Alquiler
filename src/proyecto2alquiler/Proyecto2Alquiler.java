/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto2alquiler;

import entidades.Cliente;
import entidades.Seri;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import presentacion.Principal;

/**
 *
 * @author siviany
 */
public class Proyecto2Alquiler {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        Seri x = new Seri(); 
         cliente.listaClientes = (ArrayList<Cliente>) x.llamarTxt("lista.txt"); 
//        Cliente cliente = new Cliente(1,"jose","castro","san",8512);
//        cliente.agregarDatosLista(cliente);
//        cliente.verDatosLista();
        Principal principal = new Principal();
        principal.setVisible(true);
//        x.agregarTxt(cliente.listaClientes,"lista.txt");
//        JOptionPane.showMessageDialog(null,"paso");
    }
}
