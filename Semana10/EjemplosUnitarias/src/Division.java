import Exceptions.ExcepcionDivi;

public class Division {
    public int resultado=0;
    private int divisiones;
    public int dividir(final int a)throws ExcepcionDivi{
        if (this.divisiones>=3){
            throw new ExcepcionDivi("Limite de la resta a");
        }
        if (resultado<=0){
            this.resultado=a;
        } else {
            this.resultado/=a;
        }
        this.divisiones++;
        return resultado;
    }
}
