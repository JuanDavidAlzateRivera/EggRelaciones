/*
• llenarJuego(ArrayList<Jugador>jugadores, Revolver r): este método recibe los jugadores
y el revolver para guardarlos en los atributos del juego.
• ronda(): cada ronda consiste en un jugador que se apunta con el revolver de agua y
aprieta el gatillo. Sí el revolver tira el agua el jugador se moja y se termina el juego, sino se
moja, se pasa al siguiente jugador hasta que uno se moje. Si o si alguien se tiene que
mojar. Al final del juego, se debe mostrar que jugador se mojó.
Pensar la lógica necesaria para realizar esto, usando los atributos de la clase Juego.
 */
package Servicio;

import Entidades.Juego;
import Entidades.Jugador;

/**
 *
 * @author user
 */
public class JuegoServicio {

    RevolverServicio rs = new RevolverServicio();
    JugadorServicio js = new JugadorServicio();

    public Juego LlenarJuego() {

        Juego j = new Juego();

        j.setRevolver(rs.CrearRevolver());
        j.setJugadores(js.crearJugador());

        return j;
    }
    
    public void Ronda(Juego j){
        
        for (Jugador jugador : j.getJugadores()) {
           
            if (js.disparo(jugador, rs.mojar(j.getRevolver()))) {
                rs.SiguienteChorro(j.getRevolver());
            } else {
                System.out.println("El "+ jugador + " Perdio");
                break;
            }
        }
    }
}
