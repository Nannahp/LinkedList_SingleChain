public class LinkedListCircular extends LinkedListSingle {
    private Node tail;

    public LinkedListCircular(){
        super();
        tail = null;
    }

    //IDK if it even works, apparently it doesn't
    public void addFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
            head.setNextNode(tail); // Link head's next to tail
            tail.setNextNode(head); // Link tail's next to head
        } else {
            newNode.setNextNode(head); //Link from new node to current head
            head = newNode;            //new node is now the head
            tail.setNextNode(head); //links the tail to be the new head
        }
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
            head.setNextNode(tail); // Link head's next to tail
            tail.setNextNode(head); // Link tail's next to head
        } else {
            tail.setNextNode(newNode); //link from tail to the new node
            newNode.setNextNode(head); //link the new tail to the head.
            tail = newNode;            //new node is now the tail.
        }
    }

    public void removeFirst() {
        if (head != null) {
            head = head.getNextNode();
            tail.setNextNode(head);
        }
    }


    public void removeLast() {
        if (head != null) {
            if (head.getNextNode() == null) {
                head = null;
            } else {
                Node current = head;
                while (current.getNextNode() != tail.getNextNode()) {
                    current = current.getNextNode();

                }
                tail = current;
                tail.setNextNode(head);
            }
        }
    }


    public Node getIndex(int index) {
        Node current = head;

        if (index > getSize()) {
            System.out.println("index out of bounds");
            return null;
        } else {
            int count = 0;
            while (current.getNextNode() != tail.getNextNode() && count < index) {
                current = current.getNextNode();
                count++;
            }
            return current;
        }
    }

    public int getSize() {
        int count = 0;
        if (head != null) {
            Node current = head; //Edit: needs to stop after tail, otherwise it will keep going.
            while (current != tail.getNextNode()) {
                current = current.getNextNode();
                count++;
            }
        }
        return count;
    }

    public void printList() {
        Node current = head;
        while (current != tail.getNextNode()) {
            System.out.println(current.getData());
            current = current.getNextNode();
        } // won't f*cking print

    }

}
