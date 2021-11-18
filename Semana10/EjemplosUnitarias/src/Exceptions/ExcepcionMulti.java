package Exceptions;

public class ExcepcionMulti extends Exception{
    public ExcepcionMulti(){
        super ("Excepcion multiplicado numeros");
    }
    public ExcepcionMulti(final String mensaje){
        super(mensaje);
    }
}
