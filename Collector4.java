import java.util.Arrays;
import java.util.Stream;
public class Collector4 {
    public static void main(String args[]){
        String[] names = {"john", "jane", "Tom"};

        Stream<String> nameStream = Arrays.stream(names);
        nameStream.forEach(System.out.println);
        }    
}
