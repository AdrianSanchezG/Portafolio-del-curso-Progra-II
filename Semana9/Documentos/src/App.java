public class App {
    public static void main(String[] args) throws Exception {
        DocuXElegir menu[] = new DocuXElegir [4];

        menu [0]= new Curriculum("Opción de Documento: ","","","","Curriculum");
        menu[1]= new CartaPresentacion("", "Opción de Documento: ",
        "", "", "Carta de Presentación");
        menu[2]= new CartaRenuncia("", "", "Opción de Documento: ", "", "Carta de Renuncia");
        menu[3]= new CartaRecomendacion("", "", "", "Opción de Documento: ", "Carta de Recomendación");

        for(DocuXElegir productos: menu){
            System.out.println(productos.mostrarDocumentos());
            System.out.println();
        }
    }
}
