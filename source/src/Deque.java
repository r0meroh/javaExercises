
import java.util.NoSuchElementException;
public class Deque<T> implements DequeADT {
    private class Node<T> {
        public Node<T> left, right;
        private final T x;

        public Node(T x) {
            this.x = x;
        }


        public void attachRight(Node<T> y) {
            this.right = y;
            y.left = this;
        }
    }

    private Node<T> head, tail;
    private int size;



}
