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
public class Pelicula extends Video {
    
    public Pelicula() {
    }

    public Pelicula(String tipoVideo, String nombre, int cantidad, int secuelas) {
        super(tipoVideo, nombre, cantidad, secuelas);
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

    @Override
    public int getSecuelas() {
        return secuelas;
    }

    public void setSecuelas(int secuelas) {
        this.secuelas = secuelas;
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
