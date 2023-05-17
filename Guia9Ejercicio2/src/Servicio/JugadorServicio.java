/*
• disparo(Revolver r): el método, recibe el revolver de agua y llama a los métodos de
mojar() y siguienteChorro() de Revolver. El jugador se apunta, aprieta el gatillo y si el
revolver tira el agua, el jugador se moja. El atributo mojado pasa a false y el método
devuelve true, sino false.
 */
package Servicio;

import Entidades.Jugador;
import Entidades.Revolver;
import java.util.ArrayList;

/**
 *
 * @author user
 */
public class JugadorServicio {
    ArrayList<Jugador>jugador = new ArrayList();
    RevolverServicio rs = new RevolverServicio();
    
    
    public ArrayList<Jugador>crearJugador(){
        
        for (int i = 1; i < 7; i++) {
            Jugador j = new Jugador();
            j.setId(i);
           j.setNombre("Jugador");
           jugador.add(j);
            
        }
        
        return jugador;
    }
    
    
    public boolean disparo(Jugador j, boolean mojar) {
        
        if (mojar) {
            j.setMojado(false);
            
        } else {
            j.setMojado(true);
           
            
        }
        return j.isMojado();
    }
    
}
