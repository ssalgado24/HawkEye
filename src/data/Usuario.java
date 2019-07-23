
package data;
import java.util.*;

public abstract class Usuario implements Plataforma {
    protected String nombre;
    protected String apellido;
    protected String documento;
    protected String contrasena;
    protected String usuario;
    protected String correoUN;
    protected String eop;

    public String getEop() {
        return eop;
    }

    public void setEop(String eop) {
        this.eop = eop;
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

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getCorreoUN() {
        return correoUN;
    }

    public void setCorreoUN(String correoUN) {
        this.correoUN = correoUN;
    }

    public Usuario(String nombre, String apellido, String documento, String contrasena, String usuario, String correoUN,String eop) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.documento = documento;
        this.contrasena = contrasena;
        this.usuario = usuario;
        this.correoUN = correoUN;
        this.eop=eop;
    }
    
    @Override
    public void elegirOpcion() {
        
    }
    
    
    
    
}
