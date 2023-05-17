/*
Realiza un programa en donde exista una clase Jugador que contenga nombre, apellido, posición
y número. Luego otra clase Equipo que contenga una colección de jugadores. Una vez hecho
esto, desde el main recorreremos el equipo mostrando la información de cada jugador.
 */
package guia9ejemplo2;

import java.util.ArrayList;

/**
 *
 * @author user
 */
public class Guia9Ejemplo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Jugador j1 = new Jugador();
        j1.setNombre("Guadalupe");
        j1.setApellido("Fernandez");
        j1.setNúmero(8);
        j1.setPosición("volante");
        Jugador j2 = new Jugador();
        j2.setNombre("Juan");
        j2.setApellido("Alzate");
        j2.setNúmero(11);
        j2.setPosición("Delantero");
        ArrayList<Jugador> Lista = new ArrayList();
        Lista.add(j1);
        Lista.add(j2);
        Equipo e1 = new Equipo();
        e1.setNombre("Talon de Oso");
        e1.setListaJugadores(Lista);
        System.out.println(e1);
    }
    
}
