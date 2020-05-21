import javax.xml.soap.Node;
import java.util.Queue;



public class queue  {

    protected int size;




   public void enqueue(E elem){
       Node<E> node = new Node<E>();
       node.setElement(elem);
       node.setNext(null);

       if(size == 0){
           head = node;
       }else{
           tail.setNext(node);
           tail = node;
           size ++;
       }
   }

   public int size(){
       return size;
   }

   public boolean isEmpty(){
       if(size == 0){
           return true;
       }else
           return false;
   }


//   public void dequeue() throws EmptyQueueException{
//       if (size == 0){
//           throw new EmptyQueueException("queue is empty");
//           E temp = head.getElement();
//           head = head.getNext();
//           size --;
//           if(size == 0){
//               tail = null;
//
//           }
//           return temp;
//       }
//   }

}
