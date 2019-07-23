
package data;

import java.util.Date;

public class Deportiva extends Actividad {
    private String deporte;
    private String escenarioDeportivo;
    private String coordinador;

    public Deportiva(String nombre, String descripcion, String fechaHora, String recomendaciones,String deporte, String escenarioDeportivo, String coordinador) {
        super(nombre, descripcion, fechaHora, recomendaciones);
        this.deporte = deporte;
        this.escenarioDeportivo = escenarioDeportivo;
        this.coordinador = coordinador;
    }   

    public String getDeporte() {
        return deporte;
    }

    public void setDeporte(String deporte) {
        this.deporte = deporte;
    }

    public String getEscenarioDeportivo() {
        return escenarioDeportivo;
    }

    public void setEscenarioDeportivo(String escenarioDeportivo) {
        this.escenarioDeportivo = escenarioDeportivo;
    }

    public String getCoordinador() {
        return coordinador;
    }

    public void setCoordinador(String coordinador) {
        this.coordinador = coordinador;
    }
    
    @Override
    public void elegirOpcion(){
        
    }

    @Override
    public String toString() {
        return "\n " + "Nombre: " + nombre + "// Descripción: " + descripcion + "// Fecha y Hora: " + fechaHora
                + "// Recomendaciones: " + recomendaciones + "// Deporte: " + deporte + "// Escenario" + escenarioDeportivo
                + "// Coordinador " + coordinador;
    }
    
    
}
