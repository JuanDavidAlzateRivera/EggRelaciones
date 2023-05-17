/*
• llenarRevolver(): le pone los valores de posición actual y de posición del agua. Los valores
deben ser aleatorios.
• mojar(): devuelve true si la posición del agua coincide con la posición actual
• siguienteChorro(): cambia a la siguiente posición del tambor
• toString(): muestra información del revolver (posición actual y donde está el agua)
 */
package Entidades;

/**
 *
 * @author user
 */
public class Revolver {

    private int PosicionActual;
    private int PosicionAgua;

    public Revolver() {
    }

    public Revolver(int PosicionActual, int PosicionAgua) {
        this.PosicionActual = PosicionActual;
        this.PosicionAgua = PosicionAgua;
    }

    
    
    public int getPosicionActual() {
        return PosicionActual;
    }

    public void setPosicionActual(int PosicionActual) {
        this.PosicionActual = PosicionActual;
    }

    public int getPosicionAgua() {
        return PosicionAgua;
    }

    public void setPosicionAgua(int PosicionAgua) {
        this.PosicionAgua = PosicionAgua;
    }

    @Override
    public String toString() {
        return "Posicion Actual: "+PosicionActual+ " Posicion del Agua: "+PosicionAgua;
    }
   

}
