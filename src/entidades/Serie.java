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
public class Serie extends Video implements Interfaz , Serializable  {

    int numeroTemporadas;
    public static ArrayList<Serie> listaSeries = new ArrayList<Serie>();

    public Serie() {
    }

    public Serie(int numeroTemporadas, String tipoVideo, String nombre, int cantidad) {
        super(tipoVideo, nombre, cantidad);
        this.numeroTemporadas = numeroTemporadas;
    }

    @Override
    public String getTipoVideo() {
        return tipoVideo;
    }

    @Override
    public void setTipoVideo(String tipoVideo) {
        this.tipoVideo = tipoVideo;
    }

    public int getNumeroTemporadas() {
        return numeroTemporadas;
    }

    public void setNumeroTemporadas(int numeroTemporadas) {
        this.numeroTemporadas = numeroTemporadas;
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

    public ArrayList<Serie> getListaSeries() {
        return listaSeries;
    }

    public void setListaSeries(ArrayList<Serie> listaSeries) {
        Serie.listaSeries = listaSeries;
    }

    @Override
    public void agregarDatosLista(Object x) {
        this.listaSeries.add((Serie) x);
    }

    @Override
    public void modificarDatosLista(ArrayList<String> lista) {
        for (int i = 0; i < listaSeries.size(); i++) {
            if (lista.get(1).equalsIgnoreCase(listaSeries.get(i).getNombre())) {
                listaSeries.get(i).setTipoVideo((lista.get(0)));
                listaSeries.get(i).setNombre(lista.get(1));
                listaSeries.get(i).setCantidad(Integer.parseInt(lista.get(2)));
                listaSeries.get(i).setNumeroTemporadas(Integer.parseInt(lista.get(3)));
                JOptionPane.showMessageDialog(null, "Serie modificada");
            }
        }
    }

    
    public void eliminarDatosLista(String codigo) {
        boolean existe = true;
        for (int i = 0; i < listaSeries.size(); i++) {
            if (codigo.equalsIgnoreCase(listaSeries.get(i).getNombre())) {
                listaSeries.remove(i);
                JOptionPane.showMessageDialog(null, "Serie eliminada");
                existe = false;
            }
        }
        if (existe) {
            JOptionPane.showMessageDialog(null, "Serie no existe");
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
