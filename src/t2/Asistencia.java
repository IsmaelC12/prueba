/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t2;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author USER
 */
public class Asistencia {
    
    private String Fecha;
    private String Hora;
    private List<Estudiante> estudiantesPresentes = new ArrayList<>();

    public Asistencia(String Fecha, String Hora) {
        this.Fecha = Fecha;
        this.Hora = Hora;
    }

    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }

    public String getHora() {
        return Hora;
    }

    public void setHora(String Hora) {
        this.Hora = Hora;
    }

    public List<Estudiante> getEstudiantesPresentes() {
        return estudiantesPresentes;
    }

    public void setEstudiantesPresentes(List<Estudiante> estudiantesPresentes) {
        this.estudiantesPresentes = estudiantesPresentes;
    }
}
