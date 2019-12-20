/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto2alquiler;

import entidades.Alquiler;
import entidades.Cliente;
import entidades.Documental;
import entidades.EmpleadoAdmin;
import entidades.EmpleadoVentas;
import entidades.Pelicula;
import entidades.Seri;
import entidades.Serie;
import java.io.File;
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
        Seri x1 = new Seri();
        File archivo = new File("lista.txt");
        if (archivo.exists()) {
            Cliente.listaClientes = (ArrayList<Cliente>) x1.llamarTxt("lista.txt");
        }
        File archivo1 = new File("administradores.txt");
        if (archivo.exists()) {
            EmpleadoAdmin.listaEmpleadosAdmin = (ArrayList<EmpleadoAdmin>) x1.llamarTxt("administradores.txt");
        }
        File archivo2 = new File("vendedores.txt");
        if (archivo.exists()) {
            EmpleadoVentas.listaEmpleadosVentas = (ArrayList<EmpleadoVentas>) x1.llamarTxt("vendedores.txt");
        }
        File archivo3 = new File("peliculas.txt");
        if (archivo.exists()) {
            Pelicula.listaPeliculas = (ArrayList<Pelicula>) x1.llamarTxt("peliculas.txt");
        }
        File archivo4 = new File("series.txt");
        if (archivo.exists()) {
            Serie.listaSeries = (ArrayList<Serie>) x1.llamarTxt("series.txt");
        }
        File archivo5 = new File("documentales.txt");
        if (archivo.exists()) {
            Documental.listaDocumental = (ArrayList<Documental>) x1.llamarTxt("documentales.txt");
        }
        File archivo6 = new File("alquiler.txt");
        if (archivo.exists()) {
            Alquiler.listaAquiler = (ArrayList<Alquiler>) x1.llamarTxt("alquiler.txt");
        }

        Principal principal = new Principal();
        principal.setVisible(true);
    }
}
