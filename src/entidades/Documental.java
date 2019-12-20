/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import interfaz.Interfaz;
import java.io.Serializable;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author siviany
 */
public class Documental extends Video implements Interfaz , Serializable  {

    String categoria;
    public static ArrayList<Documental> listaDocumental = new ArrayList<Documental>();

    public Documental() {
    }

    public Documental(String categoria, String tipoVideo, String nombre, int cantidad) {
        super(tipoVideo, nombre, cantidad);
        this.categoria = categoria;
    }

    @Override
    public String getTipoVideo() {
        return tipoVideo;
    }

    @Override
    public void setTipoVideo(String tipoVideo) {
        this.tipoVideo = tipoVideo;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public int getCantidad() {
        return cantidad;
    }

    @Override
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public ArrayList<Documental> getListaDocumental() {
        return listaDocumental;
    }

    public void setListaDocumental(ArrayList<Documental> listaDocumental) {
        Documental.listaDocumental = listaDocumental;
    }

    @Override
    public void agregarDatosLista(Object x) {
        this.listaDocumental.add((Documental) x);
    }

    @Override
    public void modificarDatosLista(ArrayList<String> lista) {
        for (int i = 0; i < listaDocumental.size(); i++) {
            if (lista.get(1).equalsIgnoreCase(listaDocumental.get(i).getNombre())) {
                listaDocumental.get(i).setTipoVideo((lista.get(0)));
                listaDocumental.get(i).setNombre(lista.get(1));
                listaDocumental.get(i).setCantidad(Integer.parseInt(lista.get(2)));
                listaDocumental.get(i).setCategoria(lista.get(3));
                JOptionPane.showMessageDialog(null, "Documental modificada");
            }
        }
    }

    public void eliminarDatosLista(String codigo) {
        boolean existe = true;
        for (int i = 0; i < listaDocumental.size(); i++) {
            if (codigo.equalsIgnoreCase(listaDocumental.get(i).getNombre())) {
                listaDocumental.remove(i);
                JOptionPane.showMessageDialog(null, "Documental eliminado");
                existe = false;
            }
        }
        if (existe) {
            JOptionPane.showMessageDialog(null, "Documental no existe");
        }
    }
   @Override
    public void setCantidadSuma() {
        this.cantidad = this.cantidad + 1;
    }

    @Override
    public void setCantidadResta() {
        this.cantidad = this.cantidad - 1;
    }

    @Override
    public void eliminarDatosLista(int codigo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}