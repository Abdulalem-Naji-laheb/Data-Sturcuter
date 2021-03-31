/**
 * Created by Laheb on 30/03/2021.
 */
public class JosephTrick<A> {
    public <A> A Josephus(CircularalyLinkedQueue<A> q, int k )
    {
        if (q.isEmpty())
        {
            return null ;
        }
        while(q.Size()>1)
        {

            for (int i = 0; i <k ; i++)
                q.enqueue(q.dequeue());
            A e = q.dequeue();
            System.out.println("    " +e+"  is out .");
        }
        return q.dequeue();
    }

}
