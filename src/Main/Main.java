/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

/**
 *
 * @author David
 */
public class Main {

     public static void main(String[] args) {
        java.util.Scanner Lectura = new java.util.Scanner(System.in);
        System.out.println("Nombre ");
        String Nombre = Lectura.next();
        Cliente c = new Cliente(Nombre);
        String dato = c.getnombre();
        System.out.println(dato);
    /**
     * @param args the command line arguments
     */
  
     }
}

