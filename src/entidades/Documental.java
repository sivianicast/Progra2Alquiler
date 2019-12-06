/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import static entidades.Video.listaVideos;
import java.util.ArrayList;

/**
 *
 * @author siviany
 */
public class Documental extends Video {

    public Documental() {
    }

    public Documental(String tipoVideo, String nombre, int cantidad, String categoria) {
        super(tipoVideo, nombre, cantidad, categoria);
    }

    @Override
    public String getTipoVideo() {
        return tipoVideo;
    }

    @Override
    public void setTipoVideo(String tipoVideo) {
        this.tipoVideo = tipoVideo;
    }

    @Override
    public String getCategoria() {
        return categoria;
    }

    @Override
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
    
     @Override
     public ArrayList<Video> getListaVideos() {
        return listaVideos;
    }
    @Override
    public void setListaVideos(Object x){
        listaVideos.add((Video)x);
    } 
}
