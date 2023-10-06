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
public class Aula {
    
    private int capacidadMaxima = 10;
    private String claseEnSesion;
    private String horario;
    private List<Estudiante> listaEstudiantesPresentes = new ArrayList<>();
    
    public Aula(String claseEnSesion, String horario) {
        this.claseEnSesion = claseEnSesion;
        this.horario = horario;
    }

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public String getClaseEnSesion() {
        return claseEnSesion;
    }

    public void setClaseEnSesion(String claseEnSesion) {
        this.claseEnSesion = claseEnSesion;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public List<Estudiante> getListaEstudiantesPresentes() {
        return listaEstudiantesPresentes;
    }

    public void setListaEstudiantesPresentes(List<Estudiante> 
                                         listaEstudiantesPresentes) {
        this.listaEstudiantesPresentes = listaEstudiantesPresentes;
    }
  
}
