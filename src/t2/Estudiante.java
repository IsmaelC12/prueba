/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t2;

/**
 *
 * @author USER
 */
public class Estudiante {
    
    private String nombre;
    private String apellido;
    private int id;
    
    public Estudiante(String nombre, 
                      String apellido, 
                      int numeroIdentificacion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.id = numeroIdentificacion;
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

    public int getNumeroIdentificacion() {
        return id;
    }

    public void setNumeroIdentificacion(int numeroIdentificacion) {
        this.id = numeroIdentificacion;
    }
    
}
