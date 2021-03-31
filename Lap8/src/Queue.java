/**
 * Created by Laheb on 30/03/2021.
 */
public interface Queue<T> {
    boolean isEmpty();
    int Size();
    T First();
    void enqueue(T element);
    T dequeue();
}
