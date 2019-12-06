/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.util.ArrayList;

/**
 *
 * @author siviany
 */
public class Serie extends Video {
    
    public Serie() {
    }

    public Serie(String tipoVideo, int cantidad, String nombre, int numeroTemporadas) {
        super(tipoVideo, cantidad, nombre, numeroTemporadas);
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
    public int getNumeroTemporadas() {
        return numeroTemporadas;
    }

    @Override
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
    @Override
     public ArrayList<Video> getListaVideos() {
        return listaVideos;
    }
    @Override
    public void setListaVideos(Object x){
        listaVideos.add((Video)x);
    }  
}
