/**
 * Created by Laheb on 30/03/2021.
 */
public class CirclryLinkedList<T> {
    private Node<T> tail = null;
    private int size = 0;



    public boolean isEmpty() {
        return size == 0;
    }
    ///First q
    
    public int size() {
        int Size = 0;
        if (tail != null){
            Node<T> first = tail.getNext();
            while (true){
                if (first == tail){
                    Size++;
                    break; }
                first = first.getNext();
                Size++; } }
        return Size; }


 //// Second q
    
    

    public T first() {
        if (isEmpty()) return null;
        return tail.getNext().getData(); }
   
   
    public T last() {
        if (isEmpty()) return null;
        return tail.getData(); }
   
   
    public void addFirst(T Data) {
        if (size == 0) {
            tail = new Node<T>(Data, null);
            tail.setNext(tail);
        } else {
            Node<T> newest = new Node<T>(Data, tail.getNext());
            tail.setNext(newest); }
        size++; }
    
    
    
    public void addLast(T Data){
        addFirst(Data);
        tail = tail.getNext(); }
  
  
    public T removeFirst(){
        if (isEmpty())return null;
        Node<T> deleted = tail.getNext();
        if(deleted == tail)
            tail = null;
        else{
            tail.setNext(deleted.getNext()); }
        size--;
        return deleted.getData(); }


    public boolean equals(CirclryLinkedList<T> first, CirclryLinkedList<T> second)
    {
        Node<T> firstNode = first.tail.getNext();
        Node<T> secondNode = second.tail.getNext();
        boolean sameSize = first.size() == second.size();
        if (sameSize){ for (int i = 0; i < first.size; i++) {
            T fEle = firstNode.getData();
            T sEle = secondNode.getData();
            if (fEle != sEle){return false;}
            firstNode = firstNode.getNext();
            secondNode = secondNode.getNext(); }}else {return false;}return true; }



    public void rotate(){
        if(tail != null)
            tail = tail.getNext(); }


   
    private static class Node<T> {
        T Data;
        Node<T> next;
        public Node(T Data, Node<T> next) {
            this.Data = Data;
            this.next = next; }
        public T getData() {
            return Data;
        }
        public void setElement(T Data) {
            this.Data = Data;
        }
       
        public Node<T> getNext() {
            return next;
        }
       
       
        public void setNext(Node<T> next) {
            this.next = next;
       
        }
    }
}

