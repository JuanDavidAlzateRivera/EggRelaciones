/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import Enum.CartaNum;
import Enum.CartaSimbolo;

/**
 *
 * @author user
 */
public class Carta {

   
    private CartaNum num;
    private CartaSimbolo simbolo;

    public Carta() {
    }

    public Carta(CartaNum num, CartaSimbolo simbolo) {
        this.num = num;
        this.simbolo = simbolo;
    }

    public CartaNum getNum() {
        return num;
    }

    public void setNum(CartaNum num) {
        this.num = num;
    }

    public CartaSimbolo getSimbolo() {
        return simbolo;
    }

    public void setSimbolo(CartaSimbolo simbolo) {
        this.simbolo = simbolo;
    }

    @Override
    public String toString() {
        return num+" de "+ simbolo;
    }

}
