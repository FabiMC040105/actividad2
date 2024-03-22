import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class ListaTest {

    @Test
    public void testInsertar() {
        Lista<Integer> lista = new Lista<>();
        lista.insertar(1);
        lista.insertar(2);
        lista.insertar(3);
        assertEquals(3, lista.size()); // tamaño= 3
    }

    @Test
    public void testInsertarLista() {
        Lista<Integer> lista1 = new Lista<>();
        lista1.insertar(1);
        lista1.insertar(2);

        Lista<Integer> lista2 = new Lista<>();
        lista2.insertar(3);
        lista2.insertar(4);

        lista1.insertarLista(lista2);
        assertEquals(4, lista1.size()); //  tamaño de la lista1 sea 4
    }

    @Test
    public void testSubLista() {
        Lista<Integer> lista = new Lista<>();
        lista.insertar(1);
        lista.insertar(2);
        lista.insertar(3);
        lista.insertar(4);

        Lista<Integer> sublista = lista.subLista(1, 2);
        assertEquals(2, sublista.size()); //  tamaño de la sublista = 2
        assertEquals(Integer.valueOf(2), sublista.get(0)); //  que el primer elemento de la sublista sea 2
        assertEquals(Integer.valueOf(3), sublista.get(1)); //  que el segundo elemento de la sublista sea 3
    }

    @Test
    public void testInvertir() {
        Lista<Integer> lista = new Lista<>();
        lista.insertar(1);
        lista.insertar(2);
        lista.insertar(3);

        lista.invertir();
        assertEquals(Integer.valueOf(3), lista.get(0)); // Verifica que el primer elemento de la lista invertida sea 3
        assertEquals(Integer.valueOf(2), lista.get(1)); // Verifica que el segundo elemento de la lista invertida sea 2
        assertEquals(Integer.valueOf(1), lista.get(2)); // Verifica que el tercer elemento de la lista invertida sea 1
    }
}

