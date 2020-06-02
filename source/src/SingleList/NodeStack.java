package SingleList;

import java.util.EmptyStackException;

public interface NodeStack {

    public int sizeOf();

    public boolean isEmpty();

    public void push(Node element);

    public Node pop()
        throws EmptyStackException;
}
