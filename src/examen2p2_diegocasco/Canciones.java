/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2p2_diegocasco;

import java.util.ArrayList;

/**
 *
 * @author dcasc
 */
public class Canciones {
    private String nombre;
    private String categoria;
    ArrayList <Character> cancion = new ArrayList();

    public Canciones(String nombre, String categoria) {
        this.nombre = nombre;
        this.categoria = categoria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public ArrayList<Character> getCancion() {
        return cancion;
    }

    public void setCancion(ArrayList<Character> cancion) {
        this.cancion = cancion;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
}
