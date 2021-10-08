

public class DNode {
    private DNode after;
    private String value;
    private DNode before;
    public DNode (final String value){
        this.value = value;
    }
    public DNode (final String value, final DNode after){
        this.value = value;
        this.after = after;
    }
    public DNode (final String value, final DNode before, final DNode after){
        this.value = value;
        this.before = before;
        this.after = after;
    }

    public String getValue (){return this.value;}

    public void goFoward (final DNode node){ //para ir hacia delante
        System.out.println(node.getValue());
        if(node.after != null){
            this.goFoward(node.after);
        }
    }

    public void goBackwards (final DNode node){ //para ir hacia atrás
        System.out.println(node.getValue());
        if (node.before != null){
            this.goBackwards(node.before);
        }
    }
}
