package Entidades;

import Exceptions.ExcepcionResta;

public class Resta {
    public int resultado = 0;
    private int restas;
    public int restar(final int a) throws ExcepcionResta{
        if (this.restas>=3){
            throw new ExcepcionResta("Limite de la resta alcanzado");
        }
        if (resultado<=0){
            this.resultado=a;
        } else {
            this.resultado-=a;
        }
        this.restas++;
        return resultado;

    }

    public int restar(Object parametro) throws ExcepcionResta{
        if (parametro instanceof Integer){
            Integer p = (Integer)parametro;
            this.resultado-=p;
            return this.resultado;
        }else{
            throw new ExcepcionResta("Tipo parametro incorrecto");
        }
    }
}
