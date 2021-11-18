package Exceptions;

public class ExcepcionDivi extends Exception{
    public ExcepcionDivi (){
        super("Excepcion division numeros");
    }
    public ExcepcionDivi(final String mensaje){
        super (mensaje);
    }
}
