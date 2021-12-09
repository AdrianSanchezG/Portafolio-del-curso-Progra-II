
package entidades;
import enums.Rol;
public class Cliente extends Usuario{
    public Cliente (){
        super(Rol.CLIENTE);
    }
    public Cliente(String id, String nombre, String apellido){
        super(id,nombre,apellido);
    }
}
