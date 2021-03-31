/**
 * Created by Laheb on 30/03/2021.
 */
public class CircularalyLinkedQueue<A> implements Queue<A> {

    SingleLinkedList<T> list = new SingleLinkedList<T>();

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public int Size() {
        return list.Size();
    }

    @Override
    public A First() {
        return (A) list.first();
    }

    @Override
    public void enqueue(A element) {
        list.Add_Last((T) element);
    }

    @Override
    public A dequeue() {
        return (A) list.remveFirst();
    }

    private class T {
    }
}
