package SingleList;
// single linked list class
public class Slist {

    protected Node Head; // "head" node
    protected Node current;
    protected Node prev;
    protected Node tempo;
    protected long size; // possible amount of nodes in the list

    // constructor for empty list
    public Slist(){
        Head = null;
        current = null;
        size = 0;
    }

    // more methods to go here

    public void add(Node n){

        if(size == 0) {
            Head = n;
            prev = null;
            current = n;
            size ++;

        }else{
            size ++;

            tempo = current;
            current.setNext(n);
            n.setPrevious(tempo);
            current = n;


        }

    }

    public void printList(){
        for(int x = 1; x <= size; x ++){

                System.out.println(Head.getData());
                Head = Head.getNext();

        }
    }

    public void reverseList(){

        Head = current;
        System.out.println("the current head node is " + Head.getData());
        for(int x = 1; x <= size; x ++){

            current.setNext(current.getPrevious());






            System.out.println("current node is : " + current.getData());

            //System.out.println("the current   next is  " + current.getNext().getData());
            current = current.getPrevious();
           // System.out.println("the current prev is " + current.getPrevious().getData());
            System.out.println("done with " + x + " node");

        }
    }



}
