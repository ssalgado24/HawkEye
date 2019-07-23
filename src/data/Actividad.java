/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.util.Date;

/**
 *
 * @author Samuel
 */
public abstract class Actividad implements Plataforma{
    protected String nombre;
    protected String recomendaciones;
    protected String descripcion;
    protected String fechaHora;

    public Actividad(String nombre, String descripcion, String fechaHora,String recomendaciones) {
        this.nombre = nombre;
        this.recomendaciones = recomendaciones;
        this.descripcion = descripcion;
        this.fechaHora = fechaHora;
    }        

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRecomendaciones() {
        return recomendaciones;
    }

    public void setRecomendaciones(String recomendaciones) {
        this.recomendaciones = recomendaciones;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(String fechaHora) {
        this.fechaHora = fechaHora;
    }
    
    
    
}
