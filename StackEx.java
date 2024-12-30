import java.util.Stack;
public class StackEx {
    @SuppressWarnings("unchecked")
    public static void main(String args[]){
        Stack s1 = new Stack();

        s1.push("Shubham");
        s1.push("Aniruda");
        s1.push("Sahil");
        System.out.println(s1);
        s1.pop();
        System.out.println(s1);
        // s1.peek();
        System.out.println(s1.peek());
    }
}
