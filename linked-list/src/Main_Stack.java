public class Main_Stack {
    public static void main(String[] args) {
        MyStack<Integer> stack = new MyStack<>();

        // push
        stack.push(1);
        stack.push(2);
        stack.push(3);

        // pop
        Integer popItem = stack.pop();
        System.out.println("popItem = " + popItem);

        // peak
        System.out.println("peekItem = " + stack.peek());

        // exception
        stack.pop();
        stack.pop();
        stack.pop();
    }
}
