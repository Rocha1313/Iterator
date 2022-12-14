import java.util.*;
public class LL<T> implements Iterable<T> {
    private Node<T> head, tail;

    public void add(T data){
        Node<T> node = new Node<>(data, null);
        if(Objects.isNull(head)){
            tail = head = node;
            return;
        }
        tail.setNext(node);
        tail = node;
    }

    public Node<T> getHead(){
        return this.head;
    }

    public Node<T> getTail(){
        return this.tail;
    }

    @Override
    public Iterator<T> iterator(){
        return new LLIterator<T>(this);
    }
}
