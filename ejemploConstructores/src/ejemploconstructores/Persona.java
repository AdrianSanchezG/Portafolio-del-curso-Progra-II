
package ejemploconstructores;


public class Persona {
    private int id;
    String nombre;
    String apellido;
    int edad;
    
    //"protected" = quiere decir que no podrá ser accedido por ninguna clase que no pertenezca a la misma carpeta.
    protected String me;
    
    public Persona (){ }
    
    public Persona (int id){
        //this = sirve para hacer referencia a la propia clase
        this.id=id;
        
    }
    public void setId (int id){
        if(id<=0){
            this.id=id;
        }
    }
    
    public Persona (int id, String nombre, String apellido){
        this.id=id;
        this.nombre= nombre;
        this.apellido=apellido;
        
    }
    
    //"@Override = es para sobrescribir un metodo de mi ansestro
    @Override
    public String toString(){
        String me= "ID: " + Integer.toString(this.id);
        me += ", Nombre: " + this.nombre;
        me += ", Apellido: " + this.apellido;
        me += ", Edad: " + Integer.toString(this.edad);
        
        return me;
    }
    
    
}
