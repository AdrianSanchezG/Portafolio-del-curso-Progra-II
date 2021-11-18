package Exceptions;

public class ExcepcionResta extends Exception{
    public ExcepcionResta (){
        super("Excepcion resta numeros");
    }
    public ExcepcionResta(final String mensaje){
        super (mensaje);
    }
}
