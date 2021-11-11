public class Comidas extends Productos {
    private String hamburguesa;
    private String casado;
    private String pizza;

    public Comidas (String comida, String bebida, String postre,
     String hamburguesa, String casado, String pizza){
        super(comida, bebida, postre);
        this.hamburguesa=hamburguesa;
        this.casado=casado;
        this.pizza=pizza;
    } 
    
    public String getHamburguesa(){
        return hamburguesa;
    }
    public String getCasado(){
        return casado;
    }
    public String getPizza(){
        return pizza;
    }

    @Override
    public String mostrarMenu(){
        return ""+comida+ ""+ bebida + ""
        + postre+  "\n"+hamburguesa+ "\n"+ casado+ "\n"+ pizza;
    }
}
