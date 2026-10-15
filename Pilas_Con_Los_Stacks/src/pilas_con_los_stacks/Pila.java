package pilas_con_los_stacks;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Erick López
 */

public class Pila<T> {

    private Nodo<T> cima;
    private int nElementos;

    // Hacemos uncConstructor de pila
    public Pila() {
        cima = null;
        nElementos = 0;
    }

    // Este metodo agrega un elemento al tope
    public void push(T elemento) {
        Nodo<T> nuevo = new Nodo<>(elemento, cima);
        cima = nuevo;
        nElementos++;
    }

    // Extrae y retorna el elemento del tope
    public T pop() {
        if (empty()) {
            throw new IllegalStateException("La pila esta vacía.");
        }

        T elemento = cima.getDato();
        cima = cima.getSiguiente();
        nElementos--;

        return elemento;
    }

    // Consultamos el elemento del tope sin extraerlo
    public T peek() {
        if (empty()) {
            throw new IllegalStateException("La pila esta vacía.");
        }

        return cima.getDato();
    }

    //Metodo donde veriificamos si la pila está vacía
    public boolean empty() {
        return nElementos == 0;
    }
}
