public class Main {

    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        LinkedListSingle list = new LinkedListSingle();

        System.out.println("\nCREATING A SINGLE LIST:");
        list.addLast(1);
        list.addLast(2);
        list.addLast(4);
        list.printList();

        System.out.println(" ");
        System.out.println("ADDING 0 TO THE HEAD OF THE LIST");
        list.addFirst(0);
        list.printList();

        System.out.println(" ");
        System.out.println("ADDING VALUE 3 TO INDEX N# 3");
        list.addAtIndex(3,3);
        list.printList();

        System.out.println(" ");
        System.out.println("REMOVING THE FIRST VALUE");
        list.removeFirst();
        list.printList();

        System.out.println(" ");
        list.addFirst(0); //just added back what we just removed
        System.out.println("REMOVING THE LAST VALUE (original method)");
        list.removeLast();
        list.printList();

        System.out.println("");
        list.addLast(4);
        System.out.println("REMOVING THE LAST VALUE (revamped method) ");
        list.removeLastRevamped();
        list.printList();

        System.out.println(" ");
        System.out.println("REMOVING VALUE AT INDEX 1 (original method)");
        list.removeAtIndex(1);
        list.printList();

        System.out.println("");
        list.addAtIndex(1,1);
        System.out.println("REMOVING VALUE AT INDEX 1 (revamped method)");
        list.removeAtIndexRevamped(1);
        list.printList();

        System.out.println("");
        list.addAtIndex(1,1);
        list.printList();
        System.out.println("GETTING DATA OF INDEX 2:");
        if(list.getIndex(2)!=null){
        System.out.println(list.getIndex(2).getData());
         }


        System.out.println("");
        System.out.println("CHECKING IF THE LIST IF EMPTY");
        System.out.println(list.isEmpty());
        System.out.println("");
        list.printList();
        System.out.println("GETTING SIZE OF THE LIST");
        System.out.println(list.getSize());
        System.out.println("EMPTYING LIST AND CHECKING AGAIN");
        list.removeLastRevamped();
        list.removeLastRevamped();
        list.removeLastRevamped();
        list.removeLastRevamped();
        System.out.println(list.isEmpty());
        System.out.println(list.getSize());


        LinkedListDouble doubleList = new LinkedListDouble();
        System.out.println("\n");
        System.out.println("\nCREATING A DOUBLE LIST:");
        doubleList.addLast(1);
        doubleList.addLast(2);
        doubleList.addLast(4);
        doubleList.printList();

        System.out.println(" ");
        System.out.println("ADDING 0 TO THE HEAD OF THE LIST");
        doubleList.addFirst(0);
        doubleList.printList();

        System.out.println(" ");
        System.out.println("ADDING VALUE 3 TO INDEX N# 3");
        doubleList.addAtIndex(3,3);
        doubleList.printList();

        System.out.println(" ");
        System.out.println("REMOVING THE FIRST VALUE");
        doubleList.removeFirst();
        doubleList.printList();

        System.out.println(" ");
        doubleList.printList();
        doubleList.addFirst(0); //just added back what we just removed
        System.out.println("REMOVING THE LAST VALUE ");
        doubleList.removeLast();
        doubleList.printList();

        System.out.println(" ");
        System.out.println("REMOVING VALUE AT INDEX 1 ");
        doubleList.removeAtIndex(1);
        doubleList.printList();


        System.out.println("");
        doubleList.addAtIndex(1,1);
        doubleList.printList();
        System.out.println("GETTING DATA OF INDEX 2:");
        if(doubleList.getIndex(2)!=null){
            System.out.println(doubleList.getIndex(2).getData());
        }


        System.out.println("");
        System.out.println("CHECKING IF THE LIST IF EMPTY");
        System.out.println(doubleList.isEmpty());
        doubleList.printList();
        System.out.println("GETTING SIZE OF THE LIST");
        System.out.println(doubleList.getSize());
        System.out.println("EMPTYING LIST AND CHECKING AGAIN");
        doubleList.removeLast();
        doubleList.removeLast();
        doubleList.removeLast();
        doubleList.removeLast();
        System.out.println(doubleList.isEmpty());
        System.out.println(doubleList.getSize());



        // CIRCULAR DOES NOT WORK
        LinkedListCircular circularList = new LinkedListCircular();
        System.out.println("\n");
        System.out.println("\nCREATING A CIRCULAR LIST:");
        circularList.addFirst(0);
        circularList.addLast(1);
        circularList.addLast(2);
        circularList.addLast(4);
        circularList.printList();
        System.out.println(circularList.getSize()); //WHY IS IT EMPTY

        System.out.println(" ");
        System.out.println("ADDING 0 TO THE HEAD OF THE LIST");
        circularList.addFirst(0);
        circularList.printList();

        System.out.println(" ");
        System.out.println("ADDING VALUE 3 TO INDEX N# 3");
        circularList.addAtIndex(3,3);
        circularList.printList();

        System.out.println(" ");
        System.out.println("REMOVING THE FIRST VALUE");
        circularList.removeFirst();
        circularList.printList();

        System.out.println(" ");
        circularList.printList();
        circularList.addFirst(0); //just added back what we just removed
        System.out.println("REMOVING THE LAST VALUE ");
        circularList.removeLast();
        circularList.printList();

        System.out.println(" ");
        System.out.println("REMOVING VALUE AT INDEX 1 ");
        circularList.removeAtIndex(1);
        circularList.printList();


        System.out.println("");
        circularList.addAtIndex(1,1);
        circularList.printList();
        System.out.println("GETTING DATA OF INDEX 2:");
        if(circularList.getIndex(2)!=null){
            System.out.println(circularList.getIndex(2).getData());
        }


        System.out.println("");
        System.out.println("CHECKING IF THE LIST IF EMPTY");
        System.out.println(circularList.isEmpty()); //WHY IS IT EMPTY BUT THE HEAD!=NULL?
        circularList.printList();
        System.out.println("GETTING SIZE OF THE LIST");
        System.out.println(circularList.getSize());
        System.out.println("EMPTYING LIST AND CHECKING AGAIN");
        circularList.removeLast();
        circularList.removeLast();
        circularList.removeLast();
        circularList.removeLast();
        System.out.println(circularList.isEmpty());
        System.out.println(circularList.getSize());


    }
}
