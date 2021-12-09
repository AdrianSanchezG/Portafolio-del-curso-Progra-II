
package entidades;
import enums.Rol;
public class Cajero extends Usuario {
    public Cajero(){
        super(Rol.CAJERO);
    }
    public Cajero(String id, String nombre, String apellido){
        super(id,nombre,apellido);
    }
}
