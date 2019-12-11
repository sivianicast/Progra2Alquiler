/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import interfaz.Interfaz;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.function.UnaryOperator;
import javax.swing.JOptionPane;
import presentacion.MenuCliente;

/**
 *
 * @author siviany
 */
public class Cliente implements Interfaz ,Serializable {
    public int cedula;
    public String nombre;
    public String aprellido;
    public String direccion;
    public int telefono;
    public static ArrayList<Cliente> listaClientes = new ArrayList<Cliente>();
    public Cliente() {
    }
    public Cliente(int cedula, String nombre, String aprellido, String direccion, int telefono) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.aprellido = aprellido;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public ArrayList<Cliente> getListaClientes() {
        return listaClientes;
    }

    public void setListaClientes(ArrayList<Cliente> listaClientes) {
        this.listaClientes = listaClientes;
    }
    
    public int getCedula() {
        return cedula;
    }
    public void setCedula(int cedula) {
        this.cedula = cedula;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getAprellido() {
        return aprellido;
    }
    public void setAprellido(String aprellido) {
        this.aprellido = aprellido;
    }
    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public int getTelefono() {
        return telefono;
    }
    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
    @Override
    public void modificarDatosLista(ArrayList <String> lista) {
        for (int i = 0; i < listaClientes.size(); i++) {
            if (Integer.parseInt(lista.get(0)) == (listaClientes.get(i).getCedula())) {
                listaClientes.get(i).setCedula(Integer.parseInt(lista.get(0)));
                listaClientes.get(i).setNombre((String)lista.get(1));
                listaClientes.get(i).setAprellido((String)lista.get(2));
                listaClientes.get(i).setDireccion((String)lista.get(3));
                listaClientes.get(i).setTelefono(Integer.parseInt(lista.get(4)) );
                JOptionPane.showMessageDialog(null, "Cliente modificado");
            }
        }
    }
    @Override
    public void eliminarDatosLista(int codigo) {
        boolean existe = true;
        for (int i = 0; i < listaClientes.size(); i++) {
            if (codigo == listaClientes.get(i).getCedula()) {
                listaClientes.remove(i);
                JOptionPane.showMessageDialog(null, "Cliente eliminado");
                existe = false;
            }
        }
        if (existe) {
            JOptionPane.showMessageDialog(null, "Cliente no existe");
        }
    }
    @Override
    public void agregarDatosLista(Object x) {
        listaClientes.add((Cliente) x);
    }
    
}
