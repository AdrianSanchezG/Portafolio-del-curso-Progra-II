
package registro_usuarios;
import java.util.List;
import java.util.ArrayList;
import gui.RegistroUsuarios;
import entidades.Cliente;
import entidades.Cajero;
import entidades.Usuario;

public class Registro_Usuarios {

    public static void main(String[] args) {
        // TODO code application logic here
        Cliente cliente = new Cliente("123", "Adrian", "Sanchez");
        Cajero cajero= new Cajero("456","Mary", "Jane");
        List<Usuario> usuarios=new ArrayList<Usuario>();
        usuarios.add(cliente);
        usuarios.add(cajero);
        RegistroUsuarios registro= new RegistroUsuarios(usuarios);
        registro.show();
    }
    
}
