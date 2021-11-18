import Exceptions.ExcepcionResta;

public class Resta {
    public int resultado=0;
    private int restas;
    public int restar(final int a)throws ExcepcionResta{
        if (this.restas>=3){
            throw new ExcepcionResta("Limite de la resta a");
        }
        if (resultado<=0){
            this.resultado=a;
        } else {
            this.resultado-=a;
        }
        this.restas++;
        return resultado;
    }
}
