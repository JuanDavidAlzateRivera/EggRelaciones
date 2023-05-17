/*
Realizar un programa para que una Persona pueda adoptar un Perro. Vamos a contar de dos
clases. Perro, que tendrá como atributos: nombre, raza, edad y tamaño; y la clase Persona con
atributos: nombre, apellido, edad, documento y Perro.
Ahora deberemos en el main crear dos Personas y dos Perros. Después, vamos a tener que
pensar la lógica necesaria para asignarle a cada Persona un Perro y por ultimo, mostrar desde
la clase Persona, la información del Perro y de la Persona.
 */
package guia9ejercicio1;

import Entidades.Perro;
import Entidades.Persona;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author user
 */
public class Guia9Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
  
        Perro P1 = new Perro();
        Perro P2 = new Perro();
       
        P1.setNombre("Magico");
        P1.setRaza("Criollo");
        P1.setEdad(4);
        P1.setTamaño("Grande");
        
        P2.setNombre("Kiara");
        P2.setRaza("PitBull");
        P2.setEdad(4);
        P2.setTamaño("Mediano");

        Persona p1 = new Persona();
        Persona p2 = new Persona();

        p1.setNombre("Juan David");
        p1.setApellido("Alzate Rivera");
        p1.setEdad(30);
        p1.setDocumento(1020452476);
        p1.setApodo(P2);
       
        p2.setNombre("Lina Marcela");
        p2.setApellido("Alvarez Muñoz");
        p2.setEdad(35);
        p2.setDocumento(1020412802);
        p2.setApodo(P1);
        System.out.println("El Perro que le corresponde a " + p1.getNombre() + " es: " + P2.getNombre());
        System.out.println("El perro que le corresponde a " + p2.getNombre() + " es: " + P1.getNombre());
        System.out.println("------------------------------------------------------------");
        
        System.out.println("INFORMACION COMPLETA DE LA PERSONA CON SU RESPECTIVO PERRO:\n"
                + "---------------------------------------------------------------------------");
        p1.MostrarInfo(); 
        p2.MostrarInfo();
    }    
}
