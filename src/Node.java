public class Node {
    private int data;
    private Node nextNode;
    private Node prevNode;

    public Node(int data){
        this.data = data;
    }

    public Node getNextNode() {
        return nextNode;
    }
    public Node getPrevNode(){
        return  prevNode;
    }

    public int getData() {
        return data;
    }

    public void setNextNode(Node nextNode) {
        this.nextNode = nextNode;
    }
    public void setPrevNode(Node prevNode){
        this.prevNode = prevNode;
    }
}
