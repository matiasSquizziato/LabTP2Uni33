/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labtp2uni3.app;

import java.util.HashSet;
import java.util.Objects;
import javax.swing.JOptionPane;

/**
 *
 * @author matiSqui
 */
public class Alumno {
    
    private int legajo;
    private String nombre;
    private String apellido;

     public static HashSet<Alumno> listaAlumnos = new HashSet<>();
    
    public Alumno(int legajo, String nombre, String apellido) {
        this.legajo = legajo;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    @Override
    public String toString() {
        return "Legajo: " + legajo + ", "+nombre + ", "+ apellido;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 29 * hash + this.legajo;
        hash = 29 * hash + Objects.hashCode(this.nombre);
        hash = 29 * hash + Objects.hashCode(this.apellido);
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
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        return Objects.equals(this.apellido, other.apellido);
    }
    
    
    public String getNombreCompleto(){
        
        return nombre + "" + apellido;        
    }
    
    public void agregarAlumnos(Alumno alumnoNuevo){
        
        
      
        
        if (listaAlumnos.add(alumnoNuevo) == true) {
            
            JOptionPane.showMessageDialog(null, "Alumno cargado");
            
        } else {
            
             JOptionPane.showMessageDialog(null, "Alumno" + alumnoNuevo.getApellido() + " ya fue cargado");
        }
            
    }
  
//    public void agregarMaterias(Materia Mate){
//        
//        if (materias.add(Mate) == true) {
//            
//            JOptionPane.showMessageDialog(null,"El alumno se inscribio correctamente");
//            
//        } else {
//            
//            JOptionPane.showMessageDialog(null, "El alumno ya se encuentra Inscripto");
//        }
//        
//    }
//    
   
    
}
