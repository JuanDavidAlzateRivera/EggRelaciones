/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia9ejemplo1;

/**
 *
 * @author user
 */
public class Dni {
    private String Serie;
    private int Numero;

    public String getSerie() {
        return Serie;
    }

    public void setSerie(String Serie) {
        this.Serie = Serie;
    }

    public int getNumero() {
        return Numero;
    }

    public void setNumero(int Numero) {
        this.Numero = Numero;
    }

    @Override
    public String toString() {
        return "Dni{" + "Serie=" + Serie + ", Numero=" + Numero + '}';
    }
    
    
}
