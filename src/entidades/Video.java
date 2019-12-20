/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author siviany
 */
public class Video implements Serializable  {

    String tipoVideo;
    String nombre;
    int cantidad;

    public Video() {
    }

    public Video(String tipoVideo, String nombre, int cantidad) {
        this.tipoVideo = tipoVideo;
        this.nombre = nombre;
        this.cantidad = cantidad;
    }

    public String getTipoVideo() {
        return tipoVideo;
    }

    public void setTipoVideo(String tipoVideo) {
        this.tipoVideo = tipoVideo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setCantidadSuma() {
        this.cantidad = this.cantidad + 1;
    }

    public void setCantidadResta() {
        this.cantidad = this.cantidad + 1;
    }
}
