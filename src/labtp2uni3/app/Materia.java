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
public class Materia {
    
    private int idMateria;
    private String nombre;
    private int year;

    public Materia(int idMateria, String nombre, int year) {
        this.idMateria = idMateria;
        this.nombre = nombre;
        this.year = year;
    }

      public static HashSet<Materia> listaMaterias = new HashSet<>();

    
    public int getIdMateria() {
        return idMateria;
    }

    public void setIdMateria(int idMateria) {
        this.idMateria = idMateria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Materia{" + "idMateria=" + idMateria + ", nombre=" + nombre + ", year=" + year + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + this.idMateria;
        hash = 67 * hash + Objects.hashCode(this.nombre);
        hash = 67 * hash + this.year;
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
        final Materia other = (Materia) obj;
        if (this.idMateria != other.idMateria) {
            return false;
        }
        if (this.year != other.year) {
            return false;
        }
        return Objects.equals(this.nombre, other.nombre);
    }
    
    
    public void cargarMaterias(Materia materia){
        
        if (listaMaterias.add(materia)== true) {
            
            JOptionPane.showMessageDialog(null, "Materia Cargada");
  
            
        } else {
            
            JOptionPane.showMessageDialog(null, "Materia " + "''"+ materia.getNombre() + "''"+ " ya fue cargada");
        }
    }
    
    
    


    
}
