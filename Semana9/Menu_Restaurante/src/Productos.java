public class Productos {
    
    protected String comida;
    protected String bebida;
    protected String postre;

    public Productos (String comida, String bebida, String postre){
        this.comida=comida;
        this.bebida=bebida;
        this.postre=postre;
    }

    public String getComida (){
        return comida;
    }
    public String getBebida (){
        return bebida;
    }
    public String getPostre (){
        return postre;
    }
    
    public String mostrarMenu(){
        return ""+comida+ ""+ bebida + ""
        + postre;
    }
}
