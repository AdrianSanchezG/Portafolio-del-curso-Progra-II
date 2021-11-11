public class CartaPresentacion extends DocuXElegir {
    private String cartaPresen;

    public CartaPresentacion(String curriculum, String cartaPresentacion, String cartaRenuncia,
     String cartaRecomend,String cartaPresen){
        super(curriculum, cartaPresentacion, cartaRenuncia, cartaRecomend);
        this.cartaPresen=cartaPresen;
    }

    public String getCartaPresen(){
        return cartaPresen;
    }

    @Override
    public String mostrarDocumentos(){
        return ""+ curriculum+""+cartaPresentacion
        +""+cartaRenuncia
        +""+cartaRecomend+ "\n"+ cartaPresen;
    }
}
