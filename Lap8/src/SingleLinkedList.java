/**
 * Created by Laheb on 30/03/2021.
 */
public class SingleLinkedList<T> implements Queue<T> {

    SingleLinkedList<T> list = new SingleLinkedList<T>();
    private Node<T> head = null;
    private Node<T> tail = null;
    private int size = 0;

    public T first() {
        if (isEmpty()) return null;
        return head.getElement();

    }

    public T Last() {
        if (isEmpty()) return null;
        return tail.getElement();
    }

    public void Add_first(T New_element) {
        head = new Node<T>(New_element, head);
        if (size == 0)
            tail = head;
        size++;
    }

    public void Add_Last(T New_element) {
        Node<T> newest = new Node<T>(New_element, null);
        if (isEmpty())
            head = newest;
        else
            tail.setNext(newest);
        tail = newest;
        size++;
    }

    public T remveFirst() {
        if (isEmpty())
            return null;
        T deleted = head.getElement();
        head = head.getNext();
        size--;
        if (size == 0)
            tail = null;
        return deleted;
    }


    private static class Node<T> {
        private T Element;
        private Node<T> next;

        public Node(T Element, Node<T> next) {
            this.Element = Element;
            this.next = next;
        }

        public T getElement() {
            return Element;
        }

        public void setElement(T element) {
            Element = element;
        }

        public Node<T> getNext() {
            return next;
        }

        public void setNext(Node<T> next) {
            this.next = next;
        }
    }

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public int Size() {
        return list.Size();
    }

    @Override
    public T First() {
        return list.first();
    }

    @Override
    public void enqueue(T element) {
        list.Add_Last(element);
    }

    @Override
    public T dequeue() {
        return list.remveFirst();
    }
}
