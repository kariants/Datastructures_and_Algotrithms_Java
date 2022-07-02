package Stack;

public class Main {
    public static void main(String[] args) {
        Stack newStack = new Stack(1);

        newStack.push(22);
        newStack.push(33);
        newStack.push(62);
        newStack.push(123);
        newStack.getTop();
        newStack.getHeight();
        newStack.printStack();
        System.out.println("\n");
        newStack.pop();
        newStack.printStack();
        System.out.println("\n");

    }
}
