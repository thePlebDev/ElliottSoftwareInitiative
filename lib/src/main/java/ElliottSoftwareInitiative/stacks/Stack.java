package ElliottSoftwareInitiative.stacks;

public interface Stack<E> {

    //accessor methods
    int size();
    boolean isEmpty();
    E top();

    //update methods
    void push(E e);
    E pop();

}
