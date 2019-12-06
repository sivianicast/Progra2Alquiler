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
public class EmpleadoAdmin extends Empleado implements Interfaz , Serializable {
    public int numeroReportes;
    public  static ArrayList<EmpleadoAdmin> listaEmpleadosAdmin = new ArrayList<EmpleadoAdmin>();
    public EmpleadoAdmin(){
    
    }
    public EmpleadoAdmin(int numeroVentas, int cedula, String nombre, String horario, double salario, String contraseña, String tipoEmpleado) {
        super(cedula, nombre, horario, salario, contraseña, tipoEmpleado);
        this.numeroReportes = numeroVentas;
    }
    public EmpleadoAdmin(int numeroReportes) {
        this.numeroReportes = numeroReportes;
    }
    
    
    public ArrayList<EmpleadoAdmin> getListaEmpleadosAdmin() {
        return this.listaEmpleadosAdmin;
    }

    public void setListaEmpleadosAdmin(ArrayList<EmpleadoAdmin> listaEmpleadosAdmin) {
        listaEmpleadosAdmin = listaEmpleadosAdmin;
    }
    
    public int getNumeroReportes() {
        return numeroReportes;
    }

    public void setNumeroReportes(int numeroReportes) {
        this.numeroReportes = numeroReportes;
    }

    @Override
    public int getCedula() {
        return cedula;
    }

    @Override
    public void setCedula(int cedula) {
        this.cedula = cedula;
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
    public String getHorario() {
        return horario;
    }

    @Override
    public void setHorario(String horario) {
        this.horario = horario;
    }

    @Override
    public double getSalario() {
        return salario;
    }

    @Override
    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String getContraseña() {
        return contraseña;
    }

    @Override
    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    @Override
    public void agregarDatosLista(Object x) {
        listaEmpleadosAdmin.add((EmpleadoAdmin)x);
    }

    @Override
    public void modificarDatosLista(ArrayList<String> lista) {
       for (int i = 0; i < listaEmpleadosAdmin.size(); i++) {
            if (Integer.parseInt(lista.get(1)) == (listaEmpleadosAdmin.get(i).getCedula())) {
                listaEmpleadosAdmin.get(i).setTipoEmpleado((lista.get(0)));
                listaEmpleadosAdmin.get(i).setCedula(Integer.parseInt(lista.get(1)));
                listaEmpleadosAdmin.get(i).setNombre(lista.get(2));
                listaEmpleadosAdmin.get(i).setHorario(lista.get(3));
                listaEmpleadosAdmin.get(i).setSalario(Double.parseDouble(lista.get(4)));
                listaEmpleadosAdmin.get(i).setContraseña(lista.get(5));
                listaEmpleadosAdmin.get(i).setNumeroReportes(Integer.parseInt(lista.get(6)));
                JOptionPane.showMessageDialog(null, "Cliente modificado");
            }
        }
    }

    @Override
    public void eliminarDatosLista(int codigo) {
         boolean existe = true;
        for (int i = 0; i < listaEmpleadosAdmin.size(); i++) {
            if (codigo == listaEmpleadosAdmin.get(i).getCedula()) {
                listaEmpleadosAdmin.remove(i);
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
