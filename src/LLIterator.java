import java.util.*;

public class LLIterator<T> implements Iterator<T>{
    Node<T> current;

    public LLIterator(LL<T> list){
        this.current = list.getHead();
    }

    public boolean hasNext(){
        return Objects.isNull(this.current);
    }

    public T next(){
        T data = current.getData();
        current = current.getNext();
        return data;
    }

    public void remove(){
        throw new UnsupportedOperationException();
    }
}
