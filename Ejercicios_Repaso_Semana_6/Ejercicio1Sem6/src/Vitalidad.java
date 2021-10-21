public class Vitalidad {
    
    private short puntosMagia;
    private short puntosVida;
    private short puntosFuerza;
    private short puntosAgilidad;

    //se define como public porque todos los constructores son public por definición
    public Vitalidad (short valor1, short valor2, short valor3, short valor4){}


    public int getMagia(){
        return puntosMagia;
    }
    public int getVida(){
        return puntosVida;
    }
    public int getFuerza(){
        return puntosFuerza;
    }
    public int getAgilidad(){
        return puntosAgilidad;
    }
}
