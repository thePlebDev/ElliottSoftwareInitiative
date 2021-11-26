package ElliottSoftwareInitiative.stacks;

public class Starting {
    public static void main(String[] args){
        Stack<Integer> arrayStack = new ArrayStack<>(4);

        arrayStack.push(2);
        arrayStack.push(4);
        arrayStack.push(2);
        arrayStack.push(4);
        arrayStack.push(2);
        arrayStack.push(4);



        System.out.println(arrayStack.size());


    }
}
