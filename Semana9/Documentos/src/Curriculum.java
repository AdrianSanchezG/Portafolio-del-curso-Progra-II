public class Curriculum extends DocuXElegir {
    private String docCurri;

    public Curriculum(String curriculum, String cartaPresentacion, String cartaRenuncia,
     String cartaRecomend,String docCurri){
        super(curriculum, cartaPresentacion, cartaRenuncia, cartaRecomend);
        this.docCurri=docCurri;
    }

    public String getDocCurri(){
        return docCurri;
    }

    @Override
    public String mostrarDocumentos(){
        return ""+ curriculum+""+cartaPresentacion
        +""+cartaRenuncia
        +""+cartaRecomend+ "\n"+ docCurri;
    }
}
