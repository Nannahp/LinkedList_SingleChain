public class LinkedListSingle {
    private Node head;

    //Creating our own Linked List - Single chain
    //I've created the methods in the order given in the assignment, but afterward updated some methods
    //where it made sense. The updated methods are at the bottom :)

    public void addFirst(int data) {
        if (head == null) {
            head = new Node(data);
        } else {
            Node newHead = new Node(data);
            newHead.setNextNode(head);
            head = newHead;
        }
    }

    public void addLast(int data) {
        if (head == null) {
            head = new Node(data);
        } else {
            Node current = head;
            while (current.getNextNode() != null) {
                current = current.getNextNode();
            }
            current.setNextNode(new Node(data));
        }
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
            //Basically putting the new node in between the current node and the current node's next node.
            //Set the new node by giving it the current node's next node
            newNode.setNextNode(current.getNextNode());
            //Update the current node's next node to be the new node.
            current.setNextNode(newNode);

        }
    }


    public void removeFirst() {
        if (head != null) {
            head = head.getNextNode();
        }
    }


    public void removeLast() {
        // Only do something if the list has one or more elements
        if (head != null) {
            //If the list only has one element then set it to null
            if (head.getNextNode() == null) {
                head = null;
            } else {
                Node current = head;
                Node previous = null;
                // We need the keep the second-to-last node to set its next reference to null.
                while (current.getNextNode() != null) {
                    previous = current;
                    current = current.getNextNode();

                }
                previous.setNextNode(null);
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
            //the node before index needs to set the next node to be the index's next node
            while (current.getNextNode() != null && count < index) {
                previous = current;
                current = current.getNextNode();
                count++;
            }
            previous.setNextNode(current.getNextNode());

        }
    }

    public Node getIndex(int index) {
        Node current = head;

        if (index > getSize()) {
            System.out.println("index out of bounds");
            return null;
        } else {
            int count = 0;
            while (current.getNextNode() != null && count < index) {
                current = current.getNextNode();
                count++;
            }
            return current;
        }
    }

    public boolean isEmpty() {
        if (head == null) {
            return true;
        } else return false;
    }

    public int getSize() {
        int count = 0;
        if (head != null) {
            Node current = head;
            while (current.getNextNode() != null) {
                current = current.getNextNode();
                count++;
            }
        }
        return count;
    }

    ///////////////////////////////////////UPDATED/////////////////////////////////////7

    public void removeLastRevamped() {
        if (head != null) {
            if (head.getNextNode() == null) {
                head = null;
            } else {
                Node node = getIndex(getSize() - 1);
                node.setNextNode(null);
            }
        }

    }

    public void removeAtIndexRevamped(int index){
            if (index == 0) {
                removeFirst();
            } else if(index == getSize()){
                removeLastRevamped();

            } else if (index > getSize()) {
                System.out.println("index out of bounds");

            } else {
                Node current = getIndex(index);
                Node previous = getIndex(index-1);
                previous.setNextNode(current.getNextNode());
        }
    }

    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.println(current.getData());
            current = current.getNextNode();
        }

    }
}
