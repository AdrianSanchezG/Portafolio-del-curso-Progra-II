package Entidades;
import Exceptions.ExcepcionMulti;

public class Multiplicaciones {
    public int resultado = 0;
    private int multiplicaciones;
    public int multiplicar(final int a) throws ExcepcionMulti{
        if (this.multiplicaciones>=3){
            throw new ExcepcionMulti("Limite de la resta alcanzado");
        }
        if (resultado<=0){
            this.resultado=a;
        } else {
            this.resultado*=a;
        }
        this.multiplicaciones++;
        return resultado;
    }

    public int multiplicar(Object parametro) throws ExcepcionMulti{
        if (parametro instanceof Integer){
            Integer p = (Integer)parametro;
            this.resultado*=p;
            return this.resultado;
        }else{
            throw new ExcepcionMulti("Tipo parametro incorrecto");
        }
    }
}
