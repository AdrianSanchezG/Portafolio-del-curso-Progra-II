public class Bebidas extends Productos{
    private String coca;
    private String te;
    private String cheve;

    public Bebidas (String comida, String bebida, String postre,
     String coca, String te, String cheve){
        super(comida, bebida, postre);
        this.coca=coca;
        this.te=te;
        this.cheve=cheve;
    }  

    public String getCoca(){
        return coca;
    }
    public String getTe(){
        return te;
    }
    public String getCheve(){
        return cheve;
    }

    @Override
    public String mostrarMenu(){
        return ""+comida+ ""+ bebida + ""
        + postre+  coca+ "\n"+ te+ "\n"+ cheve;
    }
}
