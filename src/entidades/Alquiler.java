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
public class Alquiler implements Serializable {
    public int Codigo;
    public String TipoVideo;
    public String NombreVideo;
    public String EmpleadoVentas;
    public String cliente;
    public static ArrayList<Alquiler> listaAquiler = new ArrayList<Alquiler>(); 

    public Alquiler() {
    }

    public Alquiler(int Codigo, String TipoVideo, String NombreVideo, String EmpleadoVentas, String cliente) {
        this.Codigo = Codigo;
        this.TipoVideo = TipoVideo;
        this.NombreVideo = NombreVideo;
        this.EmpleadoVentas = EmpleadoVentas;
        this.cliente = cliente;
    }

    public ArrayList<Alquiler> getListaAquiler() {
        return listaAquiler;
    }

    public void setListaAquiler(ArrayList<Alquiler> listaAquiler) {
        Alquiler.listaAquiler = listaAquiler;
    }

    public int getCodigo() {
        return Codigo;
    }

    public void setCodigo(int Codigo) {
        this.Codigo = Codigo;
    }

    public String getTipoVideo() {
        return TipoVideo;
    }

    public void setTipoVideo(String TipoVideo) {
        this.TipoVideo = TipoVideo;
    }

    public String getNombreVideo() {
        return NombreVideo;
    }

    public void setNombreVideo(String NombreVideo) {
        this.NombreVideo = NombreVideo;
    }

    public String getEmpleadoVentas() {
        return EmpleadoVentas;
    }

    public void setEmpleadoVentas(String EmpleadoVentas) {
        this.EmpleadoVentas = EmpleadoVentas;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public void agregarDatosLista(Object x) {
       listaAquiler.add((Alquiler) x);
    }

     public void eliminarDatosLista(int codigo) {
        boolean existe = true;
        for (int i = 0; i < listaAquiler.size(); i++) {
            if (codigo == listaAquiler.get(i).getCodigo()) {
                listaAquiler.remove(i);
                JOptionPane.showMessageDialog(null, "Alquiler Eliminado");
                existe = false;
            }
        }
        if (existe) {
            JOptionPane.showMessageDialog(null, "Alquiler no existe");
        }
    }
}
