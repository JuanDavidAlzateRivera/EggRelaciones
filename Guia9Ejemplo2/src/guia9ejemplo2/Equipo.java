/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia9ejemplo2;

import java.util.ArrayList;

/**
 *
 * @author user
 */
public class Equipo {
    private String nombre;
    private ArrayList<Jugador> ListaJugadores;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Jugador> getListaJugadores() {
        return ListaJugadores;
    }

    public void setListaJugadores(ArrayList<Jugador> ListaJugadores) {
        this.ListaJugadores = ListaJugadores;
    }

    @Override
    public String toString() {
        return "Equipo{" + "nombre=" + nombre + ", ListaJugadores=" + ListaJugadores + '}';
    }

  
    
}
