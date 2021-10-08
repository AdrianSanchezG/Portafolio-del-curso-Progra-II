

public class Node {
    private Node next;
    private String value;
    public Node (final String value){
        this.value = value;
    }

    public Node (final String value, final Node node){
        this.value = value;
        this.next = node;

    }
    public String getValue (){
        return this.value;
    }

    public void getNext(final Node node){
        System.out.print(node.getValue());
        if(this.next != null){
            this.getNext(node.next);
        } 
    }
}
