package org.kodluyoruz;


public class BlockingQueue <T> implements Queue<T> {
    private Node<T> head;
    private Node<T> tail;

    public BlockingQueue(){
        head = null;
        tail = null;
    }
    public boolean isFull(){
        if(head != null){
            return true;
        }
        else{
            return false;
        }
    }
    @Override
    synchronized public void add(T value){
        Node <T> node = new Node<T>(value);
        if (isFull()){
            // liste dolu
            tail.setNextNode(node);
            tail = node;
        }
        else{
            //liste bos
            head = node;
            tail = node;

        }
        System.out.println("Inserted: "+value.toString());

    }

    @Override
    synchronized public T peek() {
        System.out.println("Peek: "+this.head.getValue());

        return head != null ? head.getValue() : null;
    }

    public void  print(){
        Node<T> point = head;
        while (point != null){
            System.out.println(point.getValue()+" ");
            point = point.getNextNode();

        }
    }

    @Override
    synchronized public T poll(){
        if(isFull()){
            if(head == tail){
                head = null;
                tail = null;
            }
            else {
                Node<T> point = head.getNextNode();
                head.setNextNode(null);
                head = point;
                System.out.println("Poll: "+point.getValue());
                return (T) point.getValue();


            }
        }
        return null;

    }




}
