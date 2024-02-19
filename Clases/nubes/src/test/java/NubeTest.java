import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import com.stem.*;
import com.stem.Nube.TiposDeNube;
public class NubeTest {
    
    @Test
    public void testUnir(){
        Nube nube1 = new Nube(TiposDeNube.NIMBOS,10,30);
        Nube nube2 = new Nube(TiposDeNube.CIRROS,10,30);
        Nube nube3 = new Nube(TiposDeNube.NIMBOS,20,45);
        assertEquals(60,nube1.unir(nube2));
        assertEquals(-1,nube1.unir(nube3));
    }
        @Test
    public void testCrecer(){
        Nube nube1 = new Nube(TiposDeNube.NIMBOS,10,30);
        assertEquals(45,nube1.crecer());
        // Modifico el tamaño de la nube para probar con diferentes tamaños
        nube1.setTamanio(60);
        assertEquals(90,nube1.crecer());
        nube1.setTamanio(123);
        assertEquals(184.5,nube1.crecer());
        
    }
    @Test
    public void testSubir(){
        Nube nube1 = new Nube(TiposDeNube.NIMBOS,10,30);
        assertEquals(65,nube1.subir(55));
        assertEquals(97.7,nube1.subir(32.7));
        assertEquals(32.7,nube1.subir(-65));
        
    }
    @Test 
    public void testBajar(){
        Nube nube1 = new Nube(TiposDeNube.NIMBOS,200,30);
        assertEquals(190,nube1.bajar(10));
        assertEquals(145,nube1.bajar(45));
        assertEquals(0,nube1.bajar(145));
    }
    @Test
    public void testLlover(){
        Nube nube1 = new Nube(TiposDeNube.NIMBOS,200,30);
       
        nube1.setTamanio(10);
        assertFalse(nube1.llover());   
        nube1.setAltura(10);
        assertFalse(nube1.llover());

        nube1.setTamanio(200);
        assertFalse(nube1.llover());  
        nube1.setAltura(1000);
        assertTrue(nube1.llover());
    }
    @Test
    public void testForma(){
        Nube nube1 = new Nube(TiposDeNube.NIMBOS,200,30);

        
        assertEquals(10,nube1.forma()); 
        nube1.setTamanio(200);  
        assertEquals(200/3.0,nube1.forma()); 
    }
}
