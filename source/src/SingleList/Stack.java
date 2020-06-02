package SingleList;

import java.util.EmptyStackException;

public class Stack implements NodeStack {
    protected Node top;
    protected int size;

    public Stack(){
        top = null;
        size = 0;
    }

    public int sizeOf(){ return size;}

    public boolean isEmpty() {
        if (top ==  null) {
            return true;
        } else {
            return false;
        }
    }

    public void push(Node element){
        top = element;
        size ++;
    }

    public Node pop(){
        if(isEmpty() == true)
            throw new EmptyStackException();
         Node temp = top.getNext();
         top = top.getNext();
        size --;
        return temp;
    }
}
