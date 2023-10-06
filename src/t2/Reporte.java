/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t2;

/**
 *
 * @author USER
 */
public class Reporte {
    
    private String mostrarAsistencia;
    private String mostrarInforme;

    public Reporte(String mostrarAsistencia, String mostrarInforme) {
        this.mostrarAsistencia = mostrarAsistencia;
        this.mostrarInforme = mostrarInforme;
    }

    public String getMostrarAsistencia() {
        return mostrarAsistencia;
    }

    public void setMostrarAsistencia(String mostrarAsistencia) {
        this.mostrarAsistencia = mostrarAsistencia;
    }

    public String getMostrarInforme() {
        return mostrarInforme;
    }

    public void setMostrarInforme(String mostrarInforme) {
        this.mostrarInforme = mostrarInforme;
    }
    
}
