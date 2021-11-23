package Test;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import java.io.FileReader;
import java.io.IOException;
import javax.annotation.processing.Filer;
import java.io.FileNotFoundException;
import java.io.File;
import java.io.BufferedReader;

public class testEscritor {
    public Escritor (String nombre){
        super(nombre);
    }

    @Test
    public void escribirLetraPorLetra(String texto)throws Exception{
        try{
            FileWriter miEscritor = new FileWriter(this.nombreArchivo);
            for(int i=0; 1<=texto.length()-1;1++){
                miEscritor.write(texto.charAt(i));
            }
            miEscritor.close();
        }catch(FileNotFoundException notFoundException){
            throw new FileNotFoundException("No se encontro el archivo");
        }catch (IOException ioException){
            throw new IOException("Error desconocido de entrada salida: "+ ioException.getMessage());
        }catch (Exception ex){
            throw new Exception("Error desconocido: "+ex.getMessage());
        }finally{
            this.leerLineaPorLinea();
        }
    }

    @Test
    public void escribirLinea(String texto) throws Exception{
        try{
            FileWriter miEscritor = new FileWriter(this.nombreArchivo);
            BufferedWriter bufferedWriter = new BufferedWriter(miEscritor);
            bufferedWriter.write(texto);
            bufferedWriter.flush();
            miEscritor.close();
        }catch(FileNotFoundException notFoundException){
            throw new FileNotFoundException("No se encontro el archivo");
        }catch(IOException ioException){
            throw new IOException("Error desconocido de entrada salida: "+ ioException.getMessage());
        }catch (Exception ex){
            throw new Exception("Error desconocido: "+ex.getMessage());
        }finally{
            this.leerLineaPorLinea();
        }
    }

    @Test
    public void agregarTexto (String texto) throws Exception{
        try{
            FileWriter miEscritor = new FileWriter(this.nombreArchivo, true);
            BufferedWriter bufferedWriter = new BufferedWriter(miEscritor);
            bufferedWriter.write(System.lineSeparator()+texto);
            bufferedWriter.close();
            miEscritor.close();
        }catch(FileNotFoundException notFoundException){
            throw new FileNotFoundException("No se encontro el archivo");
        }catch(IOException ioException){
            throw new IOException("Error desconocido de entrada salida: "+ ioException.getMessage());
        }catch (Exception ex){
            throw new Exception("Error desconocido: "+ex.getMessage());
        }finally{
            this.leerLineaPorLinea();
        }
    }
}
