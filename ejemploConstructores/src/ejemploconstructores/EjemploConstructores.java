
package ejemploconstructores;


public class EjemploConstructores {


    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Hola mundo");
        
        //Para llamar la clase y asignarle un nuevo "nombre".
//        Persona miPersona=new Persona(); 
        
        Estudiante miEstudiante =new Estudiante(1,"Adrián","Sánchez");

        miEstudiante.edad=19;
        
        //cuando una variable está protegida para llamarla hay que utilizar ".setVariable".
        miEstudiante.setNota(90);
        
        //"sout" = para poner rápido "System.out.println("");"
        System.out.println(miEstudiante.toString());
    }
    
}
