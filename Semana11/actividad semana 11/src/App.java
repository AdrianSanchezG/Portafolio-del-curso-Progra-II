import services.Lector;
import sevices.Escritor;

public class App {
    public static void main(String[] args) throws Exception {
        /*Lectorr lector = new Lectorr("../bin/Archivo.txt");
        lector.leerLineaPorLinea();*/
        /*Escritor escritor = new Escritor("../bin/Archivo.txt");
        escritor.escribirLetraPorLetra("Asi escribe el escritor caracter por caracter");*/
        Escritor escritor = new Escritor("../bin/Archivo.txt");
        escritor.agregarTexto("Nueva linea");
    }
}
