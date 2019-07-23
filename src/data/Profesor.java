
package data;

public class Profesor extends Usuario {
    private String materia;
    private String area;

    public Profesor(String nombre, String apellido, String documento, String contrasena, String usuario, String correoUN, String eop,String materia, String area) {
        super(nombre, apellido, documento, contrasena, usuario, correoUN,eop);
        this.area = area;
        this.materia = materia;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Apellido: " + apellido + ", Documento: " + documento
                + ", Usuario: " + usuario + ", Contraseña: " + contrasena + ", CorreoUN: " + correoUN
                + ", Area: " + area + ", Materia: " + materia;
    }

    @Override
    public void elegirOpcion() {
        
    }

}
