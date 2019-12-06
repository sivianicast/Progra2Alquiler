/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto2alquiler;

import entidades.Cliente;
import entidades.EmpleadoAdmin;
import entidades.EmpleadoVentas;
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
        EmpleadoAdmin admin = new EmpleadoAdmin();
        EmpleadoVentas ventas = new EmpleadoVentas();
        Seri x1 = new Seri();
        Cliente.listaClientes = (ArrayList<Cliente>) x1.llamarTxt("lista.txt");
        admin.listaEmpleadosAdmin = (ArrayList<EmpleadoAdmin>) x1.llamarTxt("administradores.txt");
        ventas.listaEmpleadosVentas = (ArrayList<EmpleadoVentas>) x1.llamarTxt("vendedores.txt");
        Principal principal = new Principal();
        principal.setVisible(true);
    }
}
