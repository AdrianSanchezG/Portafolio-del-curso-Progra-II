public class Postre extends Productos {
    private String pastelChoco;
    private String pieLimon;

    public Postre (String comida, String bebida, String postre,
     String pastelChoco, String pieLimon){
        super(comida, bebida, postre);
        this.pastelChoco=pastelChoco;
        this.pieLimon=pieLimon;
    }
    
    public String getPatelChoco(){
        return pastelChoco;
    }
    public String getPieLimon(){
        return pieLimon;
    }

    @Override
    public String mostrarMenu(){
        return ""+comida+ ""+ bebida + ""
        + postre+ pastelChoco+ "\n"+pieLimon;
    }
}
