public class CartaRecomendacion extends DocuXElegir {
    private String cartaRecomenda;

    public CartaRecomendacion(String curriculum, String cartaPresentacion, String cartaRenuncia,
     String cartaRecomend,String cartaRecomenda){
        super(curriculum, cartaPresentacion, cartaRenuncia, cartaRecomend);
        this.cartaRecomenda=cartaRecomenda;
    }

    public String getCartaRecomenda(){
        return cartaRecomenda;
    }

    @Override
    public String mostrarDocumentos(){
        return ""+ curriculum+""+cartaPresentacion
        +""+cartaRenuncia
        +""+cartaRecomend+ "\n"+ cartaRecomenda;
    }
}
