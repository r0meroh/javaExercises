package SingleList;

// node class
public class Node {
    // class variables
    private String data;
    private Node next;
    private Node previous;


    // constructor
    public Node(String dat, Node n){
        this.data = dat;
        this.next = n;
    }

    //accessors:

    // returns contents of node
    public String getData(){
        return this.data;
    }
    // get next node pointer

    public Node getNext() {
        return this.next;
    }
    public Node getPrevious(){
        return this.previous;
    }


    // mutators:

    // assign new data to node
    public void setData(String data) {
        this.data = data;
    }
    // assign new next pointer to node
    public void setNext(Node newNext){
        this.next = newNext;
    }
    public void setPrevious(Node prev){
        this.previous = prev;
    }

}
