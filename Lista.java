
import java.util.Iterator;

public class Lista<T> implements Iterable<T> {
    private Nodo<T> cabeza;

    // Constructor de la lista
    public Lista() {
        this.cabeza = null;
    }

    // Método para insertar un elemento al final de la lista
    public void insertar(T valor) {
        Nodo<T> nuevoNodo = new Nodo<>(valor);
        if (cabeza == null) {
            cabeza = nuevoNodo;
        } else {
            Nodo<T> actual = cabeza;
            while (actual.siguiente != null) {
                actual = actual.siguiente;
            }
            actual.siguiente = nuevoNodo;
        }
    }

    // Método para insertar una lista al final de la lista original
    public void insertarLista(Lista<T> lista) {
        if (lista.cabeza != null) {
            if (cabeza == null) {
                cabeza = lista.cabeza;
            } else {
                Nodo<T> actual = cabeza;
                while (actual.siguiente != null) {
                    actual = actual.siguiente;
                }
                actual.siguiente = lista.cabeza;
            }
        }
    }

    // Método para obtener una sublista desde la posición inicial con el tamaño indicado
    public Lista<T> subLista(int inicio, int tamaño) {
        Lista<T> nuevaLista = new Lista<>();
        Nodo<T> actual = cabeza;
        int contador = 0;
        while (actual != null && contador < inicio + tamaño) {
            if (contador >= inicio) {
                nuevaLista.insertar(actual.valor);
            }
            actual = actual.siguiente;
            contador++;
        }
        return nuevaLista;
    }

    // Método para invertir la lista
    public void invertir() {
        Nodo<T> previo = null;
        Nodo<T> actual = cabeza;
        Nodo<T> siguiente = null;
        while (actual != null) {
            siguiente = actual.siguiente;
            actual.siguiente = previo;
            previo = actual;
            actual = siguiente;
        }
        cabeza = previo;
    }

    // Implementación del iterador para la lista
    @Override
    public Iterator<T> iterator() {
        return new ListaIterator();
    }

    // Clase interna para el nodo de la lista
    private static class Nodo<T> {
        T valor;
        Nodo<T> siguiente;

        Nodo(T valor) {
            this.valor = valor;
            this.siguiente = null;
        }
    }

    // Clase interna para el iterador de la lista
    private class ListaIterator implements Iterator<T> {
        private Nodo<T> actual = cabeza;

        @Override
        public boolean hasNext() {
            return actual != null;
        }

        @Override
        public T next() {
            T valor = actual.valor;
            actual = actual.siguiente;
            return valor;
        }
    }
}