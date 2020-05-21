public class Node<E> {
    // node class variables, consisting of an element and a next pointer
    private E element;
    private Node<E> next;

    // default constructor
    public Node(){
        this(null, null);
    }

    // loaded constuctor
    public Node(E elem, Node<E> nood){
        element = elem;
        next = nood;
    }

    // accessors

    public E getElement(){
        return element;
    }

    public Node<E> getNext(){
        return next;
    }

    // mutators

    public void setElement(E newElement){
        element = newElement;
    }

    public void setNext(Node<E> newNext){
        next = newNext;
    }
}
