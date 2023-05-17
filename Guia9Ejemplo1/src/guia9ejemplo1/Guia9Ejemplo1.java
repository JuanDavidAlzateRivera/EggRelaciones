/*
Realiza un programa en donde una clase Persona tenga como atributo nombre, apellido y un
objeto de clase Dni. La clase Dni tendrá como atributos la serie (carácter) y número. Prueba
acceder luego a los atributos del dni de la persona creando objetos y jugando desde el main.
 */
package guia9ejemplo1;

/**
 *
 * @author user
 */
public class Guia9Ejemplo1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Dni Doc1 = new Dni();
        Doc1.setNumero(1);
        Doc1.setSerie("cualquiera");
        
        Persona p1 = new Persona();
        p1.setApellido("Alzate");
        p1.setNombre("Juan");
        p1.setDoc(Doc1);
        
        System.out.println(p1.toString());
    }
    
}
