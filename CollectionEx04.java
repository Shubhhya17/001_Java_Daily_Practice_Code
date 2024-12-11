import java.util.*;
public class CollectionEx04 {
    @SuppressWarnings("unchecked")
    public static void main(String args[]) {
        Stack al = new Stack();
        al.push(100);
        al.push(200);

        al.peek();
        al.push(300);
        System.out.println(al);
        al.pop();
        System.out.println(al);

    }
}
