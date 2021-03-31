/**
 * Created by Laheb on 28/02/2021.
 */
public class SinglyLinkedList<E> {
    
    private Node<E> head = null;
    private Node<E> tail = null;
    private int size = 0;
    public boolean isEmpty() {
        return size == 0;
    }
   
   
    public E First() {
        if (isEmpty()) return null;
        return head.getData(); }
    
    
    public E Last() {
        if (isEmpty()) return null;
        return tail.getData(); }
   
   
   
    public void addFirst(E data) {
        head = new Node<E>(data, head);
        if (size == 0)
            tail = head;
        size++; }
   
   
   
   
   
    public void addLast(E data){
        Node<E> newest = new Node<E>(data,null);
        if(isEmpty()){
            head = newest; }
        else{
            tail.setNext(newest); }
        tail = newest;
        size++;
    }
    
    
    
    
    
    public E removeFirst(){
        if (isEmpty())return null;
        E deleted = head.getData();
        head = head.getNext();
        size--;//constantt
        if(size == 0)
            tail = null;
        return deleted; }
   
   
   
    public String print(){
        Node<E> i = head;
        String all = "";
        while (i != null)
        { all = all + i.getData().toString() + "\n";
            i = i.getNext(); }
    
        return all; }
   
   
   
    // q .R-3.6
    public String findsecocd(){
        Node<E> cur = head.next; // get the second node.
        String data = "";
        while (cur != null){
            data += cur.getData().toString() + "\n";
            cur = cur.getNext(); }
        return data; }
  
  
  
  
    // q .R-3.9
    public int size() {
        Node<E> cur = head; 
        int size;
        for (size = 0; cur != null; cur = cur.next) {
            size++; }
        return size;
    
    }
  
  
  
  
    // q .R-3.12
    public void rotate(){
        SinglyLinkedList<E> rotate = new SinglyLinkedList<>();
        int i = size;
        while (i != size / 2){
            rotate.addFirst(removeFirst());
            i--; }
        head = rotate.head; }
   
   
    // q .C-3.25
    public SinglyLinkedList<E> constantt(SinglyLinkedList<E> m, SinglyLinkedList<E> l){
        SinglyLinkedList<E> margeList = new SinglyLinkedList<>();
        Node<E> First = m.head;
        Node<E> second = l.head;
        while (second != null){
            if (First != null ){
                Node<E> curNode = First;
                margeList.addLast(curNode.data);
                First = curNode.next;
            }else {
                margeList.addLast(second.data);
                second = second.next; } }
       
        return margeList; }
    
    
    // q .C-3.28
   
   
    public void reverse(){
        SinglyLinkedList<E> re = new SinglyLinkedList<>();
        int i = size;
        while (size != 0){
            re.addFirst(removeFirst());
            i--; }
        head = re.head; }
  
    
    
    private static class Node<E> {
        private E data;
        private Node<E> next;
      
      
        public Node(E data, Node<E> next) {
            this.data = data;
            this.next = next;
        }
       
       
        public E getData() {
            return data;
        }
       
        public void setData(E data) {
            this.data = data;
        }
       
       
        public Node<E> getNext() {
            return next;
        }
        
        
        public void setNext(Node<E> next) {
            this.next = next;
        }
    }


}
