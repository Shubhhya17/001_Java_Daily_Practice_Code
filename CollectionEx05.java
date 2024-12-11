import java.util.LinkedList;
import java.util.List;

public class CollectionEx05 {
    public static void main(String args[]){
        List<Integer> al = new LinkedList<>();
        al.add(10);
        al.add(20);
        al.add(30);
        System.out.println(al);
        al.remove(2);
        System.out.println(al);
    }
}
