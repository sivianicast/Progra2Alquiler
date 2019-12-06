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
public class Video {
    String tipoVideo;
    String nombre;
    int cantidad;
    String categoria;
    int secuelas;
    int numeroTemporadas;
    public static ArrayList<Video> listaVideos = new ArrayList<>();
    
    public Video() {
    }

    public Video(String tipoVideo, String nombre, int cantidad, String categoria) {
        this.tipoVideo = tipoVideo;
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.categoria = categoria;
    }

    public Video(String tipoVideo, String nombre, int cantidad, int secuelas) {
        this.tipoVideo = tipoVideo;
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.secuelas = secuelas;
    }
    public Video(String tipoVideo, int cantidad, String nombre,  int numeroTemporadas) {
        this.tipoVideo = tipoVideo;
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.numeroTemporadas = numeroTemporadas;
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

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getSecuelas() {
        return secuelas;
    }

    public void setSecuelas(int secuelas) {
        this.secuelas = secuelas;
    }

    public int getNumeroTemporadas() {
        return numeroTemporadas;
    }

    public void setNumeroTemporadas(int numeroTemporadas) {
        this.numeroTemporadas = numeroTemporadas;
    }

    public ArrayList<Video> getListaVideos() {
        return listaVideos;
    }
    public void setListaVideos(Object x){
        listaVideos.add((Video)x);
    }  
}
