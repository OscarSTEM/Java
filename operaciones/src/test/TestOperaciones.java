import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import com.stem.*;

import java.util.ArrayList;

public class OperacionesTest {

    @Test
    public void testSuma() {
        Operaciones operaciones = new Operaciones();
        assertEquals(5, operaciones.suma(2, 3));
    }

    @Test
    public void testResta() {
        Operaciones operaciones = new Operaciones();
        assertEquals(2, operaciones.resta(5, 3));
    }

    @Test
    public void testMultiplicacion(){
        Operaciones operaciones = new Operaciones();
        assertEquals(8,operaciones.multiplicacion(2, 4));
    }

    @Test
    public void testEsMayor(){
        Operaciones operaciones = new Operaciones();
        assertTrue(operaciones.esMayor(1, 2));
        assertTrue(operaciones.esMayor(5, 10));
        assertFalse(operaciones.esMayor(5, 5));
        assertFalse(operaciones.esMayor(10,5));

    }

    @Test
    public void testSumaLista() {
        Operaciones operaciones = new Operaciones();
        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(1);
        lista.add(2);
        lista.add(3);
        assertEquals(6, operaciones.sumaLista(lista));
    }
    
    @Test
    public void testTruncar5() {
        Operaciones operaciones = new Operaciones();
        assertEquals("Hello", operaciones.truncar5("Hello, World!"));
        assertEquals("Java-", operaciones.truncar5("Java"));
        assertEquals("-----", operaciones.truncar5(""));
    }

    @Test
    public void testBuscarNumeroEnLista() {
        Operaciones operaciones = new Operaciones();
        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(5);
        lista.add(7);
        lista.add(8);
        lista.add(5);
        lista.add(6);
        lista.add(5);
        lista.add(3);

        assertEquals(1, operaciones.buscarNumeroEnLista(7,lista));
        assertEquals(0, operaciones.buscarNumeroEnLista(5,lista));
        assertEquals(-1, operaciones.buscarNumeroEnLista(2,lista));
    }

    @Test
    public void testBuscarTodasLasOcurrencias() {
        Operaciones operaciones = new Operaciones();
        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(5);
        lista.add(7);
        lista.add(8);
        lista.add(5);
        lista.add(6);
        lista.add(5);
        lista.add(3);



        assertThat( operaciones.buscarTodasLasOcurrencias(7,lista),containsInRelativeOrder(1));
        assertThat(operaciones.buscarTodasLasOcurrencias(2,lista),containsInRelativeOrder());
        assertTrue(operaciones.buscarTodasLasOcurrencias(2,lista).isEmpty());
        //assertEquals(0,3,5, operaciones.buscarTodasLasOcurrencias(5,lista));
        //assertEquals(-1, operaciones.buscarTodasLasOcurrencias(2,lista));
        assertThat(operaciones.buscarTodasLasOcurrencias(5,lista), hasSize(3));

        assertThat(operaciones.buscarTodasLasOcurrencias(2,lista), empty()); //Con Hamcrest
        assertThat(operaciones.buscarTodasLasOcurrencias(2,lista).isEmpty()); //Con jUnit
    }
}