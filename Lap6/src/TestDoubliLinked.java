/**
 * Created by Laheb on 30/03/2021.
 */
public class TestDoubliLinked {
    public static void main(String[] args) {
        DoublyLinkedList<String> D1 = new DoublyLinkedList<>();
        DoublyLinkedList<String> D2 = new DoublyLinkedList<>();
        DoublyLinkedList<String> D3 = new DoublyLinkedList<>();

        D1.addLast("ALi");

        D1.addLast("ahmed");

        D1.addLast("salh");

        D1.addLast("Khald");

        D2 = D1.clone();

        D1.addLast("semo");

        D1.addLast("laheb");

        D1.addLast("hsen");



        System.out.println(D3.equals(D1,D2));
        int size = D2.size();
        System.out.println(size);
        for (int i = 0; i < size; i++) {
            System.out.println(D2.removeLast());
        }
    }
}
