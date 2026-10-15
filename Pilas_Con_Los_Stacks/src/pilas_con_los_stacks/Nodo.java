package pilas_con_los_stacks;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Erick López
 */
public class Nodo <T>{
    private T dato;
    private Nodo<T> Siguiente;        

    public Nodo(T dato, Nodo<T> Siguiente) {
        this.dato = dato;
        this.Siguiente = Siguiente;
    }

    public T getDato() {
        return dato;
    }

    public void setDato(T dato) {
        this.dato = dato;
    }

    public Nodo<T> getSiguiente() {
        return Siguiente;
    }

    public void setSiguiente(Nodo<T> Siguiente) {
        this.Siguiente = Siguiente;
    }
    
}

