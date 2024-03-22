
public class Main {
    public static void main(String[] args) {
        // Prueba de inserción de elementos
        Lista<Integer> lista = new Lista<>();
        lista.insertar(1);
        lista.insertar(2);
        lista.insertar(3);
        System.out.println("Elementos de la lista:");cd
        for (Integer elemento : lista) {
            System.out.println(elemento);
        }

        // Prueba de inserción de una lista
        Lista<Integer> lista1 = new Lista<>();
        lista1.insertar(4);
        lista1.insertar(5);
        lista1.insertar(6);

        Lista<Integer> lista2 = new Lista<>();
        lista2.insertar(7);
        lista2.insertar(8);
        lista2.insertar(9);

        lista1.insertarLista(lista2);
        System.out.println("Elementos de la lista1 después de insertar lista2:");
        for (Integer elemento : lista1) {
            System.out.println(elemento);
        }

        // Prueba de creación de una sublista
        Lista<Integer> sublista = lista1.subLista(1, 2);
        System.out.println("Elementos de la sublista:");
        for (Integer elemento : sublista) {
            System.out.println(elemento);
        }

        // Prueba de inversión de la lista
        lista1.invertir();
        System.out.println("Elementos de la lista1 después de invertir:");
        for (Integer elemento : lista1) {
            System.out.println(elemento);
        }
    }
}