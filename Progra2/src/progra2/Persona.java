
package progra2;


public class Persona {
    
      private int id;
      String nombre;
      String apellido;
      short edad;
      
      
      
      void saludar(){
          System.out.println("Hola me llamo "+nombre
          + " Y mi ID es "+ id);
      }
      
      protected String imprimir(){
          return "Soy "+ nombre;
      }
      
      void setId(int valor){
          if(id<=0){
              id=valor;
          }
      }
      int getId(){return id;}
      
      
      
      
      
      
}
