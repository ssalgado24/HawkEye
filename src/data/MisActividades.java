
package data;

import java.util.ArrayList;

public class MisActividades extends Actividad {
    private ArrayList<Actividad> listaActividad= new ArrayList<>();

    public MisActividades(String nombre, String recomendaciones, String descripcion, String fechaHora) {
        super(nombre, recomendaciones, descripcion, fechaHora);
    }
    
    @Override
    public void elegirOpcion(){
        
    }
}
