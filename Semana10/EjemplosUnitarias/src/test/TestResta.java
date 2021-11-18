package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import Entidades.Resta;
import Exceptions.ExcepcionResta;

public class TestResta {
    @Test
    public void testResta(){
        Resta resta = new Resta();
        try{
            int resultado= resta.restar(1);
            resultado= resta.restar(2);
            resultado= resta.restar(3);
            resultado= resta.restar(4);
            assertTrue(false);
        }catch(ExcepcionResta ex){
            final String mensaje=ex.getLocalizedMessage();
            assertEquals("Limite de restas alcanzado",mensaje);
        }
    }
    @Test(expected = ExcepcionResta.class)
    public void testResta2()throws Exception{
        Resta resta= new Resta();
        int resultado = resta.restar(1);
        resultado= resta.restar(2);
        resultado= resta.restar(3);
        resultado= resta.restar(4);
    }

    @Rule
    public ExpectedException thrown= ExpectedException.none();

    @Test
    public void testResta3() throws Exception{
        thrown.expect(ExcepcionResta.class);
        Resta resta= new Resta();
        int resultado = resta.restar(1);
        resultado= resta.restar(2);
        resultado= resta.restar(3);
        resultado= resta.restar(4);
    }

    @Test()
    public void testResta4()throws Exception{
        Resta resta= new Resta();
        Object p = 3;
        int resultado = resta.restar(p);
        assertEquals(3, resultado);
    }
    @Test (expected = ExcepcionResta.class)
    public void testResta5() throws Exception{
        Resta resta= new Resta();
        Object p="Hola";
        int resultado=resta.restar(p);
        assertEquals(3, resultado);
    }
    @Test (expected = ExcepcionResta.class)
    public void testResta6() throws Exception{
        Resta resta= new Resta();
        Object p=1.0d;
        int resultado=resta.restar(p);
        assertEquals(3, resultado);
    }
}
