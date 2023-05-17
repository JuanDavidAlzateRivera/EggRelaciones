/*
• llenarRevolver(): le pone los valores de posición actual y de posición del agua. Los valores
deben ser aleatorios.
• mojar(): devuelve true si la posición del agua coincide con la posición actual
• siguienteChorro(): cambia a la siguiente posición del tambor
• toString(): muestra información del revolver (posición actual y donde está el agua)
 */
package Servicio;

import Entidades.Revolver;

/**
 *
 * @author user
 */
public class RevolverServicio {

    public Revolver CrearRevolver() {
        Revolver r1 = new Revolver();
        llenarRevolver(r1);
        return r1;
    }

    public void llenarRevolver(Revolver r1) {
        r1.setPosicionActual((int) (Math.random() * 6 + 1));
        r1.setPosicionAgua((int) (Math.random() * 6 + 1));

    }

    public boolean mojar(Revolver r1) {

        return r1.getPosicionActual() == r1.getPosicionAgua();

    }

    public void SiguienteChorro(Revolver r1) {

        if (r1.getPosicionActual() == 6) {
            r1.setPosicionActual(1);
        } else {
            r1.setPosicionActual(r1.getPosicionActual() + 1);
        }
    }

}
