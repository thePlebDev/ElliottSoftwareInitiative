package ElliottSoftwareInitiative.queues;



public class ArrayQueue <E> implements Queue<E>{

    E[] data;
    int front = 0;
    int size =0;

    private static final int CAPACITY = 1000;


    public ArrayQueue(){
        this(CAPACITY);
    }

    public ArrayQueue(int capacity){
        data = (E[]) new Object[capacity];
    }


    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size==0;
    }

    @Override
    public E first() {
        if(isEmpty()) return null;

        return data[front];
    }

    @Override
    public void enqueue(E e) throws IllegalStateException{
        if(size == data.length) throw new IllegalStateException("QUEUE IS FULL");
        int back = (front + size) % data.length;
        data[back] = e;
        size ++;

    }

    @Override
    public E dequeue() {
        if(isEmpty()) return null;
        E answer = data[front];
        data[front] = null;
        front = (front + 1) % data.length;
        size --;
        return answer;



    }
}

















