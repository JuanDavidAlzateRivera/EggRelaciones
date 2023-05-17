/*
• barajar(): cambia de posición todas las cartas aleatoriamente.
• siguienteCarta(): devuelve la siguiente carta que está en la baraja, cuando no haya más o
se haya llegado al final, se indica al usuario que no hay más cartas.
• cartasDisponibles(): indica el número de cartas que aún se puede repartir.
• darCartas(): dado un número de cartas que nos pidan, le devolveremos ese número de
cartas. En caso de que haya menos cartas que las pedidas, no devolveremos nada, pero
debemos indicárselo al usuario.
• cartasMonton(): mostramos aquellas cartas que ya han salido, si no ha salido ninguna
indicárselo al usuario
• mostrarBaraja(): muestra todas las cartas hasta el final. Es decir, si se saca una carta y
luego se llama al método, este no mostrara esa primera carta.
 */
package Servicio;

import Entidades.Baraja;
import Entidades.Carta;
import Enum.CartaNum;
import Enum.CartaSimbolo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class BarajaServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Baraja crearBaraja() {
        Baraja b = new Baraja();
        ArrayList<Carta> baraja = new ArrayList();
        CartaNum[] num = CartaNum.values();
        CartaSimbolo[] simbolo = CartaSimbolo.values();

        for (int i = 0; i < 4; i++) {

            for (int j = 0; j < 10; j++) {
                Carta c = new Carta();
                c.setNum(num[j]);
                c.setSimbolo(simbolo[i]);
                baraja.add(c);
            }
        }
        b.setBaraja(baraja);
        return b;
    }

    public void barajar(Baraja b) {

        ArrayList<Carta> c = b.getBaraja();
        Collections.shuffle(c);
        b.setBaraja(c);
    }

    public void SiguienteCarta(Baraja b) {

        if (b.getBaraja().size() == 0) {
            System.out.println("No hay cartas");
        } else {
            System.out.println(b.getBaraja().get(0));
        }
    }

    public void CartasDisponibles(Baraja b) {

        System.out.println("Quedan " + b.getBaraja().size() + " Cartas");
    }

    public void DarCartas(Baraja b) {

        System.out.println("Cuantas cartas quiere");
        int dar = leer.nextInt();
        ArrayList<Carta> c = b.getBaraja();
        ArrayList<Carta> m = b.getMonton();
        if (b.getBaraja().size() >= dar) {
            for (int i = 0; i < dar; i++) {
                m.add(c.get(0));
                c.remove(0);
            }
            b.setBaraja(c);
            b.setMonton(m);
        } else {
            System.out.println("No hay suficientes cartas...");
        }
    }

    public void cartasMonton(Baraja b) {
int n = 1;
        if (b.getMonton().size() > 0) {
            for (Carta aux : b.getMonton()) {
                System.out.println(n+" - "+aux);
                n++;
            }
        } else {
            System.out.println("No se han repartido cartas");
        }
    }

    public void MostrarBaraja(Baraja b) {
        int n = 1;
        if (b.getBaraja().size() > 0) {
            for (Carta aux : b.getBaraja()) {
                System.out.println(n+" - "+aux);
                n++;
            }
        } else {
            System.out.println("No quedan cartas");
        }
    }

    public void menu(Baraja b) {

        int opcion = 0;

        do {
            System.out.println("Que opcion quiere:\n"
                    + "1. Barajar.\n"
                    + "2. Siguiente Carta.\n"
                    + "3. Cartas Disponibles. \n"
                    + "4. Dar Cartas.\n"
                    + "5. Mostrar Cartas que salieron.\n"
                    + "6. Mostrar cartas que quedan en la baraja.");
            opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    barajar(b);
                    break;
                case 2:
                    SiguienteCarta(b);
                    break;
                case 3:
                    CartasDisponibles(b);
                    break;
                case 4:
                    DarCartas(b);
                    break;
                case 5:
                    cartasMonton(b);
                    break;
                case 6:
                    MostrarBaraja(b);
                    break;
            }
        } while (opcion > 0 && opcion < 7);
    }
}
