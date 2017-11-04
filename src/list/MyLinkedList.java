package list;
import java.util.Iterator;
import java.util.NoSuchElementException;

public abstract class MyLinkedList<E> implements ILinkedList<E>{
    public Node<E> first;
    public Node<E> last;
    public int length=0;

    public MyLinkedList() {
        first = new Node<E>(null);
        first = last;
    }
    private Node<E> getNode(int index) {
        Node<E> tmp = first;
        for (int i = 0; i < index; i++)
            tmp = tmp.getNextNode();
        return tmp;
    }

    @Override
    public void add(E element){
        if (length == 0){
            first = new Node<E>(element);
            first = last;
            length++;
        }
        else{
            last.setNextNode(new Node<E>(element));
            last=last.getNextNode();
            length++;
        }
    }

    @Override
    public void add(int index, E element){
        if (index==0)
        if (index==length) add(element);
        else{
            Node<E>tmp = first;
            Node<E>prev = first;
            for(int i=0;i<index;i++){
                prev = tmp;
                tmp=tmp.getNextNode();
            }
            Node<E> newNode = new Node<E>(element,tmp); //устанавливаем хвост "следующим"
            prev.setNextNode(newNode);
            if (index==0) first = newNode;
            length++;
        }
    }

    @Override
    public void clear(){
        for (Node<E> node = first; node != null; node = node.getNextNode() ) {
            node.setElement(null);
            //x.next = null;
        }
        first = last = null;
        length = 0;
    }

    @Override
    public E get(int index){ //пересмотреть
        Node<E> tmp = first;
        for(int i=0;i<index;i++){
            tmp=tmp.getNextNode();
        }
        return tmp.getElement();
    }

    @Override
    public int indexOf(E element) {
        int i = 0;
        for (Node<E> tmp = first; tmp != null; tmp = tmp.getNextNode()) {
            if(tmp.getElement() == element) return i;
                i++;
        }
        return -1;
    }

    @Override
    public E remove(int index) {
        E value;
        if(index == 0) {
            Node<E>tmp=first.getNextNode();
            value = first.getElement();
            first.setElement(null);
            first = tmp;
        }
        Node<E> prev = getNode(index-1);
        value = prev.getNextNode().getElement();
        prev.setNextNode(prev.getNextNode().getNextNode());
        prev.setNextNode(null);
        length--;
        return value;
    }

    @Override
    public E set(int index, E element) {
        Node<E> node = getNode(index);
        E value = node.getElement();
        node.setElement(element);
        return value;
    }

    @Override
    public int size() {
        return length;
    }

    @Override
    public E[] toArray(){
        Object[] result = new Object[length];
        int i = 0;
        for (Node<E> node = first; node != null; node = node.getNextNode()) {
            result[i] = node.getElement();
        }
        return (E[])result;
    }

    
}
