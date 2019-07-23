
package data;

import java.util.ArrayList;

public class Amigo extends Usuario {
    private ArrayList<Usuario> listaAmigos=new ArrayList<>();

    public Amigo(String nombre, String apellido, String documento, String contrasena, String usuario, String correoUN, String eop) {
        super(nombre, apellido, documento, contrasena, usuario, correoUN, eop);
    }   

    @Override
    public void elegirOpcion(){
        
    }
}
