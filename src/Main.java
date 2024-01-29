public class Main {

    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        LinkedListSingle list = new LinkedListSingle();

        System.out.println("\nCREATING A LIST:");
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
        System.out.println("GETTING DATA OF INDEX 2:");
        if(list.getIndex(2)!=null){
        System.out.println(list.getIndex(2).getData());
         }


        System.out.println("");
        System.out.println("CHECKING IF THE LIST IF EMPTY");
        System.out.println(list.isEmpty());
        System.out.println("GETTING SIZE OF THE LIST");
        System.out.println(list.getSize());
        System.out.println("EMPTYING LIST AND CHECKING AGAIN");
        list.removeLastRevamped();
        list.removeLastRevamped();
        list.removeLastRevamped();
        list.removeLastRevamped();
        System.out.println(list.isEmpty());
        System.out.println(list.getSize());

    }
}
