import java.util.ArrayList;

/**
 * Created by Laheb on 30/03/2021.
 */
public class DoublyLinkedList<T> {
    private Node<T> header;
    private Node<T> trailer;
    private int size = 0;
   
   
    public DoublyLinkedList() {
        header = new Node<T>(null, null, null);
        trailer = new Node<T>(null, header, null);
        header.setNext(trailer); }
    public boolean isEmpty() {
        return size == 0;
    }
    // Question R-3.11
   
    public int size() {
        int sizeNode = 0;
        if (header.getNext() != trailer){
            Node<T> first = header.getNext();
            Node<T> last = trailer.getPrev();
            while (true){
                if (first == last){
                    sizeNode++;
                    break; }
                first = first.next;
                sizeNode++;
            } }return sizeNode;
    }
    
    // First Question from part 2
    
    
    public boolean equals(DoublyLinkedList<T> first, DoublyLinkedList<T> second){
        Node<T> firstNode = first.header.getNext();
        Node<T> secondNode = second.header.getNext();
        if (first.size() == second.size()){
            for (int i = 0; i < first.size; i++) {
                T fEle = firstNode.getElement();
                T sEle = secondNode.getElement();
                if (fEle != sEle){return false;}
                firstNode = firstNode.getNext();
                secondNode = secondNode.getNext();
            } }else {return false;}
        return true;
    }
    
    
    // Second Question from part 2
    
    
    public DoublyLinkedList<T> clone(){
        DoublyLinkedList<T> cur = new DoublyLinkedList<>();
        Node<T> curNode = header.next;
        for (int i = 0; i < size(); i++) {
            cur.addLast(curNode.getElement());
            curNode = curNode.getNext(); }return cur;
    }
    
    public T first() {
        if (isEmpty()) return null;
        return header.getNext().getElement();
    }
    
    public T last() {
        ArrayList<String> d = new ArrayList<>();
        if (isEmpty()) return null;
        return trailer.getPrev().getElement();
    }
    
    private void addBetween(T element, Node<T> p, Node<T> s) {
        Node<T> newest = new Node<T>(element, p, s);
        p.setNext(newest);
        s.setPrev(newest);size++;
    }
    
    public void addFirst(T element) {
        addBetween(element, header, header.getNext());
    }
    
    public void addLast(T element) {
        addBetween(element, trailer.getPrev(), trailer);
    }
    
    private T remove(Node<T> x) {
        if (isEmpty()) return null;
        Node<T> p = x.getPrev();
        Node<T> s = x.getNext();
        p.setNext(s);s.setPrev(p);
        size--;return x.getElement();
    }
    
    public T removeFirst() {
        if (isEmpty()) return null;
        return remove(header.getNext());
    }
    
    public T removeLast() {
        if (isEmpty()) return null;
        return remove(trailer.getPrev()); }
   
    private static class Node<T> {
        private T element;
        private Node<T> prev;
        private Node<T> next;
      
        public Node(T element, Node<T> prev, Node<T> next) {
            this.element = element;
            this.prev = prev;
            this.next = next; }
      
        public T getElement() {
            return element;
        }
        
        public void setElement(T element) {
            this.element = element; }
       
       
        public Node<T> getPrev() {
            return prev; }
       
       
        public void setPrev(Node<T> prev) {
            this.prev = prev; }
        
        public Node<T> getNext() {
            return next; }
       
       
        public void setNext(Node<T> next) {
            this.next = next; 
        }
    }
}
