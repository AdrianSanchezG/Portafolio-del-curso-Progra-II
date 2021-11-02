package Services;
import java.util.List;
import java.util.ArrayList;
import Entities.Usuario;
import Entities.Cliente;
import Entities.Roles;


public class RegistroCxC {
    private List<Cliente> clientes;
    public RegistroCxC(){
        this.clientes= new ArrayList<>();
    }
    public void registrar(
        final Usuario usuario, final Cliente cliente) throws Exception {
            if (!usuario.rol.equals(Roles.ADMIN.name())){
                throw new Exception("Solo los administradores pueden registrar CXC");
            }
            if (existe(cliente)!=null){
                final int indice = existe(cliente);
                this.clientes.get(indice).totalAdeudado=cliente.totalAdeudado;
            }else{
                clientes.add(clientes);
            }
        }

        protected void registrarCuenta(Cliente cliente){
            final Integer indice = existe(cliente);
            if(indice !=null){
                this.clientes.get(indice).totalAdeudado = cliente.totalAdeudado;
            } else {
                clientes.add(cliente);
            }
        }

        private Integer existe(Cliente cliente){
            for (int i=0; i<=this.clientes.size(); i++){
                if(this.clientes.get(i).getId()==cliente.getId()){
                    return i;
                }
            }
            return null;
        }
    
}
