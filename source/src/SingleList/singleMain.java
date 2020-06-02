package SingleList;

public class singleMain {

    public static void main(String[] args){
        Slist myList = new Slist();

        Node first = new Node("Hugo", null);

        myList.add(first);
        System.out.println("first node is: ");
        System.out.print(first.getData() + "\n");
        System.out.println(first.getData() + " points to: " + first.getNext());

        Node second = new Node("mike", null);
        Node third = new Node("ethan" , null);

        myList.add(second);
        myList.add(third);


        System.out.println("The second node is: ");
        //first.setNext(second);
        System.out.print(second.getData() + "\n");
        System.out.println(second.getData() + " points to " + second.getNext());
        System.out.println("second node previous points to : " + second.getPrevious().getData());

        System.out.println("the size of the list is: ");
        System.out.println(myList.size);
        System.out.println("The head of the list is currently: ");
        System.out.println(myList.Head.getData());
        System.out.println(first.getData() + " points to " + first.getNext().getData());
        System.out.println("the previous pointer of this node is: " + myList.Head.getPrevious());



        System.out.println("printing head");
        System.out.println(myList.Head.getData());

        System.out.println("using stack to reverse list");
        Stack mystack = new Stack();

        for(int x = 1; x <= myList.size; x ++){
            System.out.println(myList.Head.getData());
            mystack.push(myList.Head);


            if(myList.Head.getNext() != null)
                myList.Head = myList.Head.getNext();

        }
        System.out.println("printing stack");
        myList.Head = mystack.top;
        myList.current = myList.Head;
        for(int y = 1; y <= mystack.sizeOf(); y ++){
            myList.current.setNext(mystack.top);
            System.out.println(mystack.top.getData());
            myList.current = mystack.pop();
        }




        System.out.println("printing nodes");
        myList.printList();


//
//        System.out.println("reversing list");
//        myList.reverseList();
//        myList.printList();






    }
}
