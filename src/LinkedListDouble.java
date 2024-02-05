public class LinkedListDouble extends  LinkedListSingle{

    private Node tail;
    public LinkedListDouble(){
        super();
        this.tail = null;
    }

    public void addFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode; //If only one node, then it is both head and tail.
            head.setNextNode(tail); // Link head's next to tail
            tail.setPrevNode(head); // Link tail's prev to head
        } else {
            newNode.setNextNode(head); //Link from new node to current head
            head.setPrevNode(newNode); //link from head back to new node
            head = newNode;            //new node is now the head
        }
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        //new node is now the tail.
        if (head == null) {
            head = newNode;
        } else {
            tail.setNextNode(newNode); //link from tail to the new node
            newNode.setPrevNode(tail); //link back from new node to tail

        }
        tail = newNode;
    }

    public void addAtIndex(int data, int index) {
        if (index == 0) {
            addFirst(data);
        } else {
            Node current = head;
            Node newNode = new Node(data);
            int count = 0;

            while (current.getNextNode() != null && count < index - 1) {
                current = current.getNextNode();
                count++;
            }
            newNode.setNextNode(current.getNextNode()); //
            newNode.setPrevNode(current);
            current.setNextNode(newNode);

        }
    }


    public void removeLast() {
        if (head != null) {
            if (head.getNextNode() == null) {
                head = null;
                tail = null;
            } else {
                Node current = head;
                while (current.getNextNode() != null) {
                    current = current.getNextNode();
                }
                tail = current.getPrevNode();
                tail.setNextNode(null); //doesn't work, deletes two elements
            }
        }
    }

    public void removeAtIndex(int index) {
        if (index == 0) {
            removeFirst();

        } else if (index > getSize()) {
            System.out.println("index out of bounds");

        } else {
            Node current = head;
            Node previous = null;
            int count = 0;
            while (current.getNextNode() != null && count < index) {
                previous = current;
                current = current.getNextNode();
                count++; //get to the node before the index
            }
            previous.setNextNode(current.getNextNode()); //not very readable
            current.getNextNode().setPrevNode(previous);

        }
    }

}
