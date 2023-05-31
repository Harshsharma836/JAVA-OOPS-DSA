import java.util.Stack;

public class StackProgram {
    public static void main(String[] args) {

        Stack<Integer> newStack = new Stack<>();
        newStack.push(32);
        newStack.push(21);
        newStack.push(12);
        newStack.push(46);

//        while(newStack.empty() != true){
//          //  Integer temp = (Integer) newStack.peek();
//            System.out.println(newStack.peek());
//            newStack.pop();
//        }
        newStack.push(23);
        newStack.push(32);
        newStack.push(21);
        newStack.push(12);
        newStack.push(46);

//        int index = newStack.search(21);
//        System.out.println(index);
//        System.out.println(newStack.get(1));
        System.out.println(newStack.lastElement());
    }
}
