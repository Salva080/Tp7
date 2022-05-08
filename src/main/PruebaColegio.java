/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import Clases.Alumno;
import Clases.Materia;

/**
 *
 * @author salva
 */
public class PruebaColegio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Materia ingles = new Materia(01,"Ingles",1);
        Materia mate = new Materia(02,"Matematicas",1);
        Materia lab = new Materia(03,"Laboratorio",1);
        
        Alumno a1 = new Alumno(1001,"Lopez","Martin");
        Alumno a2 = new Alumno(1002,"Martinez","Brenda");
        
        a1.agregarMateria(mate);
        a1.agregarMateria(ingles);
        a1.agregarMateria(lab);
        
        a2.agregarMateria(mate);
        a2.agregarMateria(ingles);
        a2.agregarMateria(lab);
        
        a2.agregarMateria(lab);
        
        System.out.println("Materias donde esta inscripto Lopez son: " + a1.cantidadDeMaterias());
        System.out.println("Materias donde esta inscripto Martinez son: " + a2.cantidadDeMaterias());
    }
    
}
