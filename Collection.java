import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class Collection {
    public static void main(String args[]){
        List<String> names = Arrays.asList("John", "Jane", "Doe", "Smith");

List<String> filterNames = names.stream().fiter(name -> name.startsWith("J")).collect(Collectors.toList());
System.out.println(filterNames);
    }
}
