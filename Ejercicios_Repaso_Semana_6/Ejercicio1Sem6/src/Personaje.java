public class Personaje extends Vitalidad {
    private String jugador1;
    Armadura armadura;
    
    public Personaje (short valor1, short valor2,
    short valor3, short valor4){
        super (valor1,valor2,valor3,valor4);
    }

    public void setArmadura(Armadura color){
        this.armadura= armadura;
    }
    public Armadura getArmadura (){
        return armadura;
    }
    public String getNombre(){
        return jugador1;
    }
}
