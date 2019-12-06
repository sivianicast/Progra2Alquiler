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
public class Empleado implements Serializable{
    public int cedula;
    public String nombre;
    public String horario;
    public double salario;
    public String contraseña;
    public String tipoEmpleado;

    public Empleado() {
    }

    public Empleado(int cedula, String nombre, String horario, double salario, String contraseña, String tipoEmpleado) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.horario = horario;
        this.salario = salario;
        this.contraseña = contraseña;
        this.tipoEmpleado = tipoEmpleado;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getTipoEmpleado() {
        return tipoEmpleado;
    }

    public void setTipoEmpleado(String tipoEmpleado) {
        this.tipoEmpleado = tipoEmpleado;
    }
    public void agregarListatxt( String nombre , ArrayList<Object> lista ){
    }
    public void llamarListatxt(String x){
    }  
}
