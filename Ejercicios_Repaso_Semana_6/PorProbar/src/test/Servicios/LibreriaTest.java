package test.Servicios;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.beans.Transient;

import org.junit.Test;
import Entidades.Libro;
import Servicios.Libreria;

public class LibreriaTest {
    @Test
    public void testPrestarLibroQueNoSeHaPrestado(){
        Libro miLibro = new Libro ("Moby Dick", "Mreman Melville");
        Libreria miLibreria = new Libreria();
        try{
            miLibreria.prestar(miLibro);
            assertTrue(true);
        }catch(Exception ex){
            fail();
        }
    }

    @Test
    public void testPrestarLibroPrestado(){
        Libro miLibro = new Libro ("Moby Dick", "Mreman Melville");
        miLibro.setPrestado(true);
        Libreria miLibreria = new Libreria();
        try{
            miLibreria.prestar(miLibro);
            fail();
        }catch(Exception ex){
            assertTrue(true);
        }
    }



    @Test
    public void testDevolver (){
        Libro miLibro = new Libro ("Moby Dick", "Mreman Melville");
        Libreria miLibreria = new Libreria();
        try{
            miLibreria.prestar(miLibro);
            assertTrue(true);
        }catch(Exception ex){
            fail();
        }
    }
}
