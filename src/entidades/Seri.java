/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author siviany
 * @param <T>
 */
public class Seri <T> {
    /**
     *
     * @param lista
     * @param nombre
     */
    public void agregarTxt (ArrayList <T> lista, String nombre){
        FileOutputStream fichero = null;
        try{
            fichero = new FileOutputStream (nombre);
            try (ObjectOutputStream conexion = new ObjectOutputStream(fichero)) {
                conexion.writeObject(lista);
                fichero.close();
            }
            }catch(FileNotFoundException ex){
            }catch(IOException ex){
            }
    }
    public Object llamarTxt (String nombre){
        Object temp = null;
        FileInputStream ficheroEntrada = null;
        try{
            ficheroEntrada = new FileInputStream(nombre);
            try (ObjectInputStream conexionEntrada = new ObjectInputStream(ficheroEntrada)) {
            temp = conexionEntrada.readObject();
            }
        }catch(FileNotFoundException ex){
        }catch(IOException | ClassNotFoundException ex){
        }    
        return temp;
    }
}
