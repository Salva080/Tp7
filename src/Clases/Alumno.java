/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author salva
 */
import java.util.HashSet;
import javax.swing.JOptionPane;

public class Alumno {

    private int legajo;

    private String apellido;

    private String nombre;
    
    private HashSet <Materia> materias = new HashSet<>();

    public Alumno(int legajo, String apellido, String nombre) {
        this.legajo = legajo;
        this.apellido = apellido;
        this.nombre = nombre;
    }


    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString(){
        return apellido+", "+nombre;
    } 

    public void agregarMateria(Materia m){
        if(materias.add(m) == true){
            JOptionPane.showMessageDialog(null,"Alumno Inscripto");
        }else{
            JOptionPane.showMessageDialog(null,"Alumno ya inscripto en la materia");
        }
    }
    
    public int cantidadDeMaterias(){
        return materias.size();
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 41 * hash + this.legajo;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Alumno other = (Alumno) obj;
        if (this.legajo != other.legajo) {
            return false;
        }
        return true;
    }
    
    
}