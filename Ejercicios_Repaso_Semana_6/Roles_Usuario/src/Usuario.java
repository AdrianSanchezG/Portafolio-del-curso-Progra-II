public class Usuario {
    public String apellido;
    public String correo;
    public String telefono;
    public Rol rolDeUsuario;
    public Usuario (int ID){
        this.id=ID;
    } 
    public int getId(){return this.id;}
}
