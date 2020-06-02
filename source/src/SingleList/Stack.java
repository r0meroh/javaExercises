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
        if(size > 0) {
            Node previousNode = top;
            top = element;
            top.setNext(previousNode);
        }else{
            top = element;
        }

//        if(size > 0){
//            element.setNext(top);
//        }
//        top = element;

        size ++;
    }

//    public void getTop(){
//        if(size < 0 ){
//            top
//        }
//    }

    public Node pop(){

        Node temp = top;
        top = temp.getNext();
        if(size > 0)
            size --;

        return temp;
    }
}
