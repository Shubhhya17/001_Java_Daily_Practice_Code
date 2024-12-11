import java.util.ArrayList;
import java.util.List;

class CollectionArrayList01 {
    @SuppressWarnings("unchecked")
    public static void main(String args[]){
        @SuppressWarnings("rawtypes")
        List l1 = new ArrayList();
        l1.add(2);
        l1.add(3.2);
        l1.add("Shubham");
        System.out.println(l1);
    }
}
