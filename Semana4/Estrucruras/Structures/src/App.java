public class App {
    public static void main(String[] args) throws Exception {
        /*Node firstNode = new Node("H",
         new Node("E", 
         new Node("L", 
         new Node("L", 
         new Node("O")))));*/

        /*Node secondeNode = new Node("E");
        Node thirdNode = new Node("L");
        Node fourthNode = new Node("L");
        Node fiftNode = new Node("O"); */

        /*firstNode.next = secondeNode;
        secondeNode.next = thirdNode;
        thirdNode.next = fourthNode;
        fourthNode.next = fiftNode; */

        //firstNode.getNext(firstNode);
        DNode one = new DNode("B",
                    new DNode ("A",
                    new DNode("C")));
        one.goFoward(one);
        one.goBackwards(one);
    }
}
