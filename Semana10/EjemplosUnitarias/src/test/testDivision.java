package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import Entidades.Division;
import Entidades.Resta;
import Exceptions.ExcepcionDivi;
import Exceptions.ExcepcionResta;

public class testDivision {
    @Test
    public void testDivi(){
        Division division = new Division();
        try{
            int resultado= division.dividir(1);
            resultado= division.dividir(2);
            resultado= division.dividir(3);
            resultado= division.dividir(4);
            assertTrue(false);
        }catch(ExcepcionDivi ex){
            final String mensaje=ex.getLocalizedMessage();
            assertEquals("Limite de restas alcanzado",mensaje);
        }
    }
    @Test(expected = ExcepcionDivi.class)
    public void testDivi2()throws Exception{
        Division division = new Division();
        int resultado= division.dividir(1);
            resultado= division.dividir(2);
            resultado= division.dividir(3);
            resultado= division.dividir(4);
    }
    @Rule
    public ExpectedException thrown= ExpectedException.none();

    @Test
    public void testDivi3() throws Exception{
        thrown.expect(ExcepcionDivi.class);
        Division division = new Division();
        int resultado= division.dividir(1);
            resultado= division.dividir(2);
            resultado= division.dividir(3);
            resultado= division.dividir(4);
    }
    @Test()
    public void testDivi4()throws Exception{
        Division division = new Division();
        Object p = 3;
        int resultado = division.dividir(p);
        assertEquals(3, resultado);
    }
    @Test (expected = ExcepcionDivi.class)
    public void testDivi5() throws Exception{
        Division division = new Division();
        Object p="Hola";
        int resultado=division.dividir(p);
        assertEquals(3, resultado);
    }
    @Test (expected = ExcepcionDivi.class)
    public void testDivi6() throws Exception{
        Division division = new Division();
        Object p=1.0d;
        int resultado=division.dividir(p);
        assertEquals(3, resultado);
    }
}
