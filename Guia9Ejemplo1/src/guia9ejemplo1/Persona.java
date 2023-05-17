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
public class Persona {
    private String Nombre;
    private String Apellido;
    private Dni Doc;

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public Dni getDoc() {
        return Doc;
    }

    public void setDoc(Dni Doc) {
        this.Doc = Doc;
    }

    @Override
    public String toString() {
        return "Persona{" + "Nombre=" + Nombre + ", Apellido=" + Apellido + ", Doc=" + Doc + '}';
    }

    
}
