
package data;

import java.util.Date;

public class Cultural extends Actividad{
    private String lugar;
    private String clasificacion;   

    public Cultural(String nombre, String descripcion, String fechaHora, String recomendaciones, String clasificacion, String lugar,String coordinador) {
        super(nombre, descripcion, fechaHora, recomendaciones);
        this.clasificacion=clasificacion;
        this.lugar=lugar;  
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public String getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }
    
    @Override
    public void elegirOpcion(){
        
    }

    @Override
    public String toString() {
        return "\n " + "Nombre: " + nombre + "// Descripción: " + descripcion + "// Fecha y Hora: " + fechaHora
                + "// Recomendaciones: " + recomendaciones + "// Clasificación: " + clasificacion + "// Lugar: " + lugar;
    }
    
    
}
