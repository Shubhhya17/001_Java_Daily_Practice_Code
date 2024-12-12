import java.util.*;
public class CollectionEx08 {

    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
    Map<Integer,String> a = new TreeMap();

    a.put(400, "Shubham");
    a.put(100, "Harsha");
    a.put(200, "Navdeep");

    System.out.println(a);
    
    Set<Map.Entry<Integer, String>> kv = a.entrySet();
    System.out.println(kv);
    System.out.println(a);
    
    }
}