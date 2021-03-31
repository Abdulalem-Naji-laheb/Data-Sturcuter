/**
 * Created by Laheb on 28/02/2021.
 */
public class Test {
    public static void main(String[] args) {

        SinglyLinkedList<String> first = new SinglyLinkedList<>();
        SinglyLinkedList<String> Second = new SinglyLinkedList<>();
        first.addLast("Ahmed");
        first.addLast("Ali");
        first.addLast("Laheb");

        System.out.println(first.print());
        first.reverse();
        System.out.println(first.print());

    }
    }
