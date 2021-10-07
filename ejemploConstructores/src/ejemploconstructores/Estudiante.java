
package ejemploconstructores;

//A Estudiante se le amarra Persona por así decirlo con ponerle "extends".
public class Estudiante extends Persona {

    private int nota;

    public Estudiante() {}
    
    public Estudiante(int id, String nombre, String apellido){
        
        //"super" = es un constructor para que la información sea llevada al ansestro.
        super(id,nombre,apellido);
        
    }
    
    public void setNota(int value) {
        this.nota = value;
    }
    public int getNota() {
        return this.nota;
    }

}
