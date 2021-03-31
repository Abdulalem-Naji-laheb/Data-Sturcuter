/**
 * Created by Laheb on 23/03/2021.
 */
public interface Stack<A> {

        boolean isEmpty();
        int Size();
        A top();
        void push(A element);
        A pop();
    }

