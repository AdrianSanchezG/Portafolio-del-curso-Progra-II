
package servicios;

import entidades.Cajero;
import entidades.Cliente;
import entidades.Usuario;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

import java.util.stream.Collectors;

public class Registro {
    List<Usuario> usuarios = new ArrayList<Usuario>();
    public Registro(){}
    public void agregar(Cliente cliente){
        this.usuarios.add(cliente);
    }
    public void agregar(Cajero cajero){
        this.usuarios.add(cajero);
    }
    public Usuario buscar(final String valor){
        return
                usuarios.stream().filter(u->(u.getNombre().contains(valor)||
                        u.getApellido().contains(valor)||
                        u.getIdentificacion().contains(valor))).findFirst().orElse(null);
    }
    
    public List<Usuario> verTodos(){return this.usuarios;}
    public List<Usuario> verClientes(){
        return this.usuarios
                .stream()
                .filter(u->u instanceof Cliente)
                .collect(Collectors.toList());
    }
    public List<Usuario> verCajeros(){
        return this.usuarios
                .stream()
                .filter(u->u instanceof Cajero)
                .collect(Collectors.toList());
    }
    
    public boolean modificar(final Usuario usuario){
        final AtomicBoolean modificado = new AtomicBoolean(false);
        this.usuarios.forEach(u->{
            if(u.getIdentificacion().equalsIgnoreCase(usuario.getIdentificacion())){
                u.setApellido(usuario.getApellido());
                u.setNombre(usuario.getNombre());
                modificado.set(true);
            }
        });
        return modificado.get();
    }
    
    public boolean eliminar(final Usuario usuario){
        final int elementos=this.usuarios.size();
        this.usuarios=
                this.usuarios
                .stream()
                .filter(u->
                !u.getIdentificacion()
                .equalsIgnoreCase(usuario.getIdentificacion()))
                .collect(Collectors.toList());
        return this.usuarios.size()!=elementos;
    }
}
