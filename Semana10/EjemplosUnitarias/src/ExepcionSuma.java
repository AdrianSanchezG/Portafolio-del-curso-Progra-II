public class ExepcionSuma extends Exception {
    public ExepcionSuma (){
        super("Excepcion sumado numeros");
    }
    public ExepcionSuma (final String mensaje){
        super (mensaje);
    }
}
