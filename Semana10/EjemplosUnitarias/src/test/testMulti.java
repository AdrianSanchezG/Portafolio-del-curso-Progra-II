package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import Entidades.Multiplicaciones;
import Entidades.Resta;
import Exceptions.ExcepcionMulti;
import Exceptions.ExcepcionResta;

public class testMulti {
    @Test
    public void testMulti(){
        Multiplicaciones multiplicaciones = new Multiplicaciones();
        try{
            int resultado= multiplicaciones.multiplicar(1);
            resultado= multiplicaciones.multiplicar(2);
            resultado= multiplicaciones.multiplicar(3);
            resultado= multiplicaciones.multiplicar(4);
            assertTrue(false);
        }catch(ExcepcionMulti ex){
            final String mensaje=ex.getLocalizedMessage();
            assertEquals("Limite de multiplicacion alcanzado",mensaje);
        }
    }
    @Test(expected = ExcepcionMulti.class)
    public void testMulti2()throws Exception{
        Multiplicaciones multiplicaciones = new Multiplicaciones();
        int resultado= multiplicaciones.multiplicar(1);
        resultado= multiplicaciones.multiplicar(2);
        resultado= multiplicaciones.multiplicar(3);
        resultado= multiplicaciones.multiplicar(4);
    }
    @Rule
    public ExpectedException thrown= ExpectedException.none();

    @Test
    public void testMulti3() throws Exception{
        thrown.expect(ExcepcionMulti.class);
        Multiplicaciones multiplicaciones = new Multiplicaciones();
        int resultado= multiplicaciones.multiplicar(1);
        resultado= multiplicaciones.multiplicar(2);
        resultado= multiplicaciones.multiplicar(3);
        resultado= multiplicaciones.multiplicar(4);
    }
    @Test()
    public void testMulti4()throws Exception{
        Multiplicaciones multiplicaciones = new Multiplicaciones();
        Object p = 3;
        int resultado = multiplicaciones.multiplicar(p);
        assertEquals(3, resultado);
    }
    @Test (expected = ExcepcionMulti.class)
    public void testMulti5() throws Exception{
        Multiplicaciones multiplicaciones = new Multiplicaciones();
        Object p="Hola";
        int resultado=multiplicaciones.multiplicar(p);
        assertEquals(3, resultado);
    }
    @Test (expected = ExcepcionMulti.class)
    public void testMulti6() throws Exception{
        Multiplicaciones multiplicaciones = new Multiplicaciones();
        Object p=1.0d;
        int resultado=multiplicaciones.multiplicar(p);
        assertEquals(3, resultado);
    }
}
