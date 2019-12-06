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
public class EmpleadoVentas extends Empleado implements Interfaz , Serializable  {
    public int numeroVentas;
    public static ArrayList<EmpleadoVentas> listaEmpleadosVentas = new ArrayList<EmpleadoVentas>();

    public ArrayList<EmpleadoVentas> getListaEmpleadosVentas() {
        return listaEmpleadosVentas;
    }

    public void setListaEmpleadosVentas(ArrayList<EmpleadoVentas> listaClientes) {
        listaEmpleadosVentas = listaClientes;
    }
    public EmpleadoVentas() {
    }

    public EmpleadoVentas(int numeroVentas) {
        this.numeroVentas = numeroVentas;
    }

    public EmpleadoVentas(int numeroVentas, int cedula, String nombre, String horario, double salario, String contraseña, String tipoEmpleado) {
        super(cedula, nombre, horario, salario, contraseña, tipoEmpleado);
        this.numeroVentas = numeroVentas;
    }

    public int getNumeroVentas() {
        return numeroVentas;
    }

    public void setNumeroVentas(int numeroVentas) {
        this.numeroVentas = numeroVentas;
    }

    @Override
    public void setTipoEmpleado(String tipoEmpleado) {
        super.setTipoEmpleado(tipoEmpleado); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getTipoEmpleado() {
        return super.getTipoEmpleado(); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public void setContraseña(String contraseña) {
        super.setContraseña(contraseña); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getContraseña() {
        return super.getContraseña(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setSalario(double salario) {
        super.setSalario(salario); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double getSalario() {
        return super.getSalario(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setHorario(String horario) {
        super.setHorario(horario); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getHorario() {
        return super.getHorario(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setNombre(String nombre) {
        super.setNombre(nombre); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getNombre() {
        return super.getNombre(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setCedula(int cedula) {
        super.setCedula(cedula); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getCedula() {
        return super.getCedula(); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public void agregarDatosLista(Object x) {
        listaEmpleadosVentas.add((EmpleadoVentas)x);
        }

    @Override
    public void modificarDatosLista(ArrayList<String> lista) {
          for (int i = 0; i < listaEmpleadosVentas.size(); i++) {
            if (Integer.parseInt(lista.get(1)) == (listaEmpleadosVentas.get(i).getCedula())) {
                listaEmpleadosVentas.get(i).setTipoEmpleado((lista.get(0)));
                listaEmpleadosVentas.get(i).setCedula(Integer.parseInt(lista.get(1)));
                listaEmpleadosVentas.get(i).setNombre(lista.get(2));
                listaEmpleadosVentas.get(i).setHorario(lista.get(3));
                listaEmpleadosVentas.get(i).setSalario(Double.parseDouble(lista.get(4)));
                listaEmpleadosVentas.get(i).setContraseña(lista.get(5));
                listaEmpleadosVentas.get(i).setNumeroVentas(Integer.parseInt(lista.get(6)));
                JOptionPane.showMessageDialog(null, "Cliente modificado");
            }
        }
    }

    @Override
    public void eliminarDatosLista(int codigo) {
            boolean existe = true;
        for (int i = 0; i < listaEmpleadosVentas.size(); i++) {
            if (codigo == listaEmpleadosVentas.get(i).getCedula()) {
                listaEmpleadosVentas.remove(i);
                JOptionPane.showMessageDialog(null, "Cliente eliminado");
                existe = false;
            }
        }
        if (existe) {
            JOptionPane.showMessageDialog(null, "Cliente no existe");
        }
    }
    @Override
    public void agregarListatxt( String nombre , ArrayList<Object> lista ){
       }
    @Override
    public void llamarListatxt(String x){
    }    
}
