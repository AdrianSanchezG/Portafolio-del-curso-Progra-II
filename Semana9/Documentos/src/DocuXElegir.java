public class DocuXElegir {
    protected String curriculum;
    protected String cartaPresentacion;
    protected String cartaRenuncia;
    protected String cartaRecomend;

    public DocuXElegir(String curriculum, String cartaPresentacion, String cartaRenuncia, String cartaRecomend){
        this.curriculum=curriculum;
        this.cartaPresentacion= cartaPresentacion;
        this.cartaRenuncia=cartaRenuncia;
        this.cartaRecomend=cartaRecomend;
    }

    public String getCurriculum(){
        return curriculum;
    }
    public String getCartaPresentacion(){
        return cartaPresentacion;
    }
    public String getCartaRenuncia(){
        return cartaRenuncia;
    }
    public String getCartaRecomend(){
        return cartaRecomend;
    }

    public String mostrarDocumentos(){
        return ""+ curriculum+""+cartaPresentacion
        +""+cartaRenuncia+""+cartaRecomend;
    }

}
