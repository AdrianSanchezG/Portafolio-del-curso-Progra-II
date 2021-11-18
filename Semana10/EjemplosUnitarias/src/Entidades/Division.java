package Entidades;

import Exceptions.ExcepcionDivi;
import Exceptions.ExcepcionResta;

public class Division {
    public int resultado = 0;
    private int divisiones;
    public int dividir(final int a) throws ExcepcionDivi{
        if (this.divisiones>=3){
            throw new ExcepcionDivi("Limite de la resta alcanzado");
        }
        if (resultado<=0){
            this.resultado=a;
        } else {
            this.resultado/=a;
        }
        this.divisiones++;
        return resultado;

    }
    public int dividir(Object parametro) throws ExcepcionDivi{
        if (parametro instanceof Integer){
            Integer p = (Integer)parametro;
            this.resultado/=p;
            return this.resultado;
        }else{
            throw new ExcepcionDivi("Tipo parametro incorrecto");
        }
    }
}
