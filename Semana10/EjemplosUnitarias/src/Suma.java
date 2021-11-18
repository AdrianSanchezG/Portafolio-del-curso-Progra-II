
public class Suma {
    public int resultado=0;
    private int sumas;
    public int sumar(final int a)throws ExepcionSuma{
        if(this.sumas>=3){
            throw new ExepcionSuma("Limite de suma a");
        }
        if(resultado<=0){
            this.resultado=a;
        }else{
            this.resultado+=a;
        }
this.sumas++;
return resultado;

    }

}
