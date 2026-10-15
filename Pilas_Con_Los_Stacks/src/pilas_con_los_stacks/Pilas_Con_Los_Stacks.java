/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pilas_con_los_stacks;

/**
 *
 * @author Erick López
 */
public class Pilas_Con_Los_Stacks {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Creamos una pila de caracteres enteros
        Pila<Integer> pila = new Pila<>();


        
        System.out.println("La pila esta vacia? " + pila.empty());

        // Agregamos los elementos con los push
        pila.push(10);
        pila.push(20);
        pila.push(30);
        

        System.out.println("Elemento en la cima: " + pila.peek());

        // Extraer un elemento
        System.out.println("Elemento extraido: " + pila.pop());

        // Consultar la nueva cima
        System.out.println("Nueva cima: " + pila.peek());

        // Comprobar el estado de la pila
        System.out.println("La pila esta vacia? " + pila.empty());

        // Extraer los elementos restantes
        System.out.println("Extraido: " + pila.pop());
        System.out.println("Extraido: " + pila.pop());

        // Comprobar si quedó vacía
        System.out.println("La pila esta vacia? " + pila.empty());
    }
}
