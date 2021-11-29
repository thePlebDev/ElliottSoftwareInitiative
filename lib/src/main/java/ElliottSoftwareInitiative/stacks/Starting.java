package ElliottSoftwareInitiative.stacks;

import ElliottSoftwareInitiative.stacks.ArrayStack;
import ElliottSoftwareInitiative.stacks.Stack;

public class Starting {

    public static void main(String[] args){
        Stack<Integer> arrayStack= new ArrayStack<>(3); // program to an interface, not an implementation

        System.out.println(arrayStack.size());

    }
}
