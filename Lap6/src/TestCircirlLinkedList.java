/**
 * Created by Laheb on 30/03/2021.
 */
public class TestCircirlLinkedList {

    public static void main(String[] args) {
        CirclryLinkedList<Integer> First = new CirclryLinkedList();
        CirclryLinkedList<Integer> Second = new CirclryLinkedList();
        CirclryLinkedList<Integer> Third= new CirclryLinkedList();
        First.addFirst(11);
        First.addLast(22);
        Second.addLast(44);
        Second.addLast(55);


        System.out.println(Third.equals(First,Second));;
        int size = First.size();
        for (int i = 0; i < size; i++) {
            System.out.println(First.first());
            First.rotate(); }
        System.out.println(First.size()); }}