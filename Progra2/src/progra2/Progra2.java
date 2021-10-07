
package progra2;

import java.util.Set;


public class Progra2 {

    public static void main(String[] args) {
        // TODO code application logic here
        
      int var=1;
      Estudiante estudiante=new Estudiante(); 
      estudiante.setId(1);
      estudiante.nombre="Sara";
      estudiante.apellido="Doe";
      estudiante.nota=100.00d;
      estudiante.edad=21;
      estudiante.saludar();
//      System.out.println(estudiante.imprimir());
Persona persona = new Persona ();
persona.setId(3);
        

      verIdPersona(persona);
      verIdPersona(estudiante);
    }
    
      static void verIdPersona (Persona persona){
          System.out.println(persona.getId());
          if (persona instanceof Estudiante){
          System.out.println(((Estudiante)persona).nota);
          }
      }
    

    
    
}
