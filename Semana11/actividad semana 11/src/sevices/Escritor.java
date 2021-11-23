package sevices;

import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;

public class Escritor extends Lectorr {
    public Escritor (String nombre){
        super(nombre);
    }
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
