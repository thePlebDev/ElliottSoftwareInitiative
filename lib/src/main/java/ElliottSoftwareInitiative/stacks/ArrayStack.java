package ElliottSoftwareInitiative.stacks;

public class ArrayStack <E> implements Stack<E> {

    private E[] data;
    private int t = -1;
    private static final int CAPACITY = 1000;

    public ArrayStack(){
        this(CAPACITY);
    }

    public ArrayStack(int capacity){
        data = (E[]) new Object[capacity];
    }

    @Override
    public int size() {
        return (t+1);
    }

    @Override
    public boolean isEmpty() {
        return t == -1;
    }

    @Override
    public E top() {
        if(isEmpty()) return null;
        return data[t];
    }

    @Override
    public void push(E e) throws IllegalStateException{
        if(size() == data.length) throw new IllegalStateException("STACK IS FULL");
        data[++t] = e;
    }

    @Override
    public E pop() {
        if(isEmpty()) return null;
        E answer = data[t];
        data[t] = null;
        t --;
        return answer;
    }
}
