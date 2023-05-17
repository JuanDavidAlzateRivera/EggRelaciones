/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;


/**
 *
 * @author user
 */
public class Persona {

    private String nombre;
    private String apellido;
    private double edad;
    private double documento;
    private Perro apodo;

    public Persona() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public double getEdad() {
        return edad;
    }

    public void setEdad(double edad) {
        this.edad = edad;
    }

    public double getDocumento() {
        return documento;
    }

    public void setDocumento(double documento) {
        this.documento = documento;
    }

    public Perro getApodo() {
        return apodo;
    }

    public void setApodo(Perro apodo) {
        this.apodo = apodo;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", documento=" + documento + ", apodo=" + apodo + '}';
    }

    public void MostrarInfo() {
        System.out.println("Nombre completo de la persona : " + this.getNombre() +" "+ this.getApellido() + "\n"
                + "Edad de la persona: " + this.edad + "\n"
                + "Documento de la persona: " + this.documento);
        System.out.println(Persona.this.apodo);
        
    }

}
