
package entidades;

import enums.Rol;

public abstract class Usuario extends Persona{
    private Rol rol;
    public Usuario(Rol rolDeUsuario){
        this.rol=rolDeUsuario;
    }
    public Usuario (String id, String nombre, String apellido){
        this.identificacion=id;
        this.nombre=nombre;
        this.apellido=apellido;
    }
    public Rol getRol(){return this.rol;}
}
