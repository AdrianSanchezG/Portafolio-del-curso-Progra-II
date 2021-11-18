import Exceptions.ExcepcionMulti;

public class Multiplicacion {
    public int resultado=0;
    private int multiplicaciones;
    public int multiplicar(final int a)throws ExcepcionMulti{
        if (this.multiplicaciones>=3){
            throw new ExcepcionMulti("Limite de la resta a");
        }
        if (resultado<=0){
            this.resultado=a;
        } else {
            this.resultado*=a;
        }
        this.multiplicaciones++;
        return resultado;
    }
}
