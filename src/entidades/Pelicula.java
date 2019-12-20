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
public class Pelicula extends Video implements Interfaz , Serializable {

    int secuelas;
    public static ArrayList<Pelicula> listaPeliculas = new ArrayList<Pelicula>();
    public int getCantidad;

    public Pelicula() {
    }

    public Pelicula(int secuelas, String tipoVideo, String nombre, int cantidad) {
        super(tipoVideo, nombre, cantidad);
        this.secuelas = secuelas;
    }

    public Pelicula(int duraccionPelicula) {
        this.secuelas = duraccionPelicula;
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

    @Override
    public String getTipoVideo() {
        return tipoVideo;
    }

    @Override
    public void setTipoVideo(String tipoVideo) {
        this.tipoVideo = tipoVideo;
    }

    public int getSecuelas() {
        return secuelas;
    }

    public void setSecuelas(int secuelas) {
        this.secuelas = secuelas;
    }

    public ArrayList<Pelicula> getListaPeliculas() {
        return listaPeliculas;
    }

    public void setListaPeliculas(ArrayList<Pelicula> listaPeliculas) {
        Pelicula.listaPeliculas = listaPeliculas;
    }
    

    @Override
    public void agregarDatosLista(Object x) {
        this.listaPeliculas.add((Pelicula) x);
    }

    @Override
    public void modificarDatosLista(ArrayList<String> lista) {
        for (int i = 0; i < listaPeliculas.size(); i++) {
            if (lista.get(1).equalsIgnoreCase(listaPeliculas.get(i).getNombre())) {
                listaPeliculas.get(i).setTipoVideo((lista.get(0)));
                listaPeliculas.get(i).setNombre(lista.get(1));
                listaPeliculas.get(i).setCantidad(Integer.parseInt(lista.get(2)));
                listaPeliculas.get(i).setSecuelas(Integer.parseInt(lista.get(3)));
                JOptionPane.showMessageDialog(null, "Pelicula modificada");
            }
        }
    }

    public void eliminarDatosLista(String codigo) {
        boolean existe = true;
        for (int i = 0; i < listaPeliculas.size(); i++) {
            if (codigo.equalsIgnoreCase(listaPeliculas.get(i).getNombre())) {
                listaPeliculas.remove(i);
                JOptionPane.showMessageDialog(null, "Pelicula eliminada");
                existe = false;
            }
        }
        if (existe) {
            JOptionPane.showMessageDialog(null, "Pelicula no existe");
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
