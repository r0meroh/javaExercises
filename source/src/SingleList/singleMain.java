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
        Node fourth = new Node("eric", null);
        myList.add(second);
        myList.add(third);
        myList.add(fourth);



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
        System.out.println("last node in list is: " + myList.current.getData());
        System.out.println("it points to: " + myList.current.getNext());



        System.out.println("printing head");
        System.out.println(myList.Head.getData());
        System.out.println("mike points to: " + second.getNext().getData());
        System.out.println("ethan points to: " + third.getNext().getData());

        System.out.println("using stack to reverse list");

        Stack mystack = new Stack();
        mystack.push(myList.Head);
        System.out.println("top of stack before loop: " + mystack.top.getData());
        myList.current = myList.Head.getNext();
        System.out.println(myList.current.getData());
        int x = 2;
        while(x <= myList.size){

            mystack.push(myList.current);

            System.out.println("the top of the stack is : " + mystack.top.getData());

            myList.current = myList.current.getNext();
            System.out.println(x);
            System.out.println("current of the list is now: " + myList.current.getData());
            x++;


        }
        System.out.println("printing stack");
        myList.Head = mystack.top;
        System.out.println("current top is: " + mystack.top.getData());

        for(int y = 1; y <= mystack.sizeOf(); y ++){
            System.out.println("current size of stack is: " + mystack.sizeOf());
            if(mystack.size > 0) {
                System.out.println("current top of stack: ");
                System.out.println(mystack.top.getData());
                myList.current = mystack.pop();
                System.out.println("current node in list is: " + myList.current.getData());
                myList.current.setNext(mystack.top);
                System.out.println("new top is now ");
                System.out.println(mystack.top.getData());
            }



        }




       // System.out.println("printing nodes");
        // myList.printList();


//
//        System.out.println("reversing list");
//        myList.reverseList();
//        myList.printList();






    }
}
