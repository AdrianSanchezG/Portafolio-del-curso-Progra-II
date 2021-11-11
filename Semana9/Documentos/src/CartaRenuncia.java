public class CartaRenuncia extends DocuXElegir{
    private String cartaRenun;

    public CartaRenuncia(String curriculum, String cartaPresentacion, String cartaRenuncia,
     String cartaRecomend,String cartaRenun){
        super(curriculum, cartaPresentacion, cartaRenuncia, cartaRecomend);
        this.cartaRenun=cartaRenun;
    }

    public String getCartaRenun(){
        return cartaRenun;
    }

    @Override
    public String mostrarDocumentos(){
        return ""+ curriculum+""+cartaPresentacion
        +""+cartaRenuncia
        +""+cartaRecomend+ "\n"+ cartaRenun;
    }
}
