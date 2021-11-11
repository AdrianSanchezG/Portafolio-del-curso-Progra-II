public class App {
    public static void main(String[] args) throws Exception {
        Productos menu[] = new Productos [3];

        menu [0]= new Comidas("Menú de Comidas:", "", "", "Hamburguesa", "Casado", "Pizza");
        menu[1]= new Bebidas("", "Menú de Bebidas", "", "\nCoca", "Té", "Cheve");
        menu[2]= new Postre("", "", "Menú de Postres: ", "\nPastel de Chocolate", "Pie de Limón");

        for(Productos productos: menu){
            System.out.println(productos.mostrarMenu());
            System.out.println();
        }
    }
}
