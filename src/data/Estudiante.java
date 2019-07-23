
package data;

public class Estudiante extends Usuario {
    private String carrera;
    private String facultad;

    public Estudiante(String nombre, String apellido, String documento, String contrasena, String usuario, String eop, String correoUN, String carrera,String facultad) {
        super(nombre, apellido, documento, contrasena, usuario, correoUN,eop);
        this.carrera= carrera;
        this.facultad= facultad;
    }
    

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getFacultad() {
        return facultad;
    }

    public void setFacultad(String facultad) {
        this.facultad = facultad;
    }

    @Override
    public String toString() {
        return "Nombre: "+ nombre + ", Apellido: "+ apellido + ", Documento: "+ documento 
                + ", Usuario: "+ usuario + ", Contraseña: "+ contrasena + ", CorreoUN: "+ correoUN 
                + ", Facultad: " + facultad+ ", Carrera: " + carrera;
    }
        
    
    @Override
    public void elegirOpcion() {
        
    }
}
