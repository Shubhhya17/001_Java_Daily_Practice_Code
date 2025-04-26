import java.util.*;
import java.util.stream.Collectors;
public class Collector2 {
    public static void main(String args[]){
        List<String> names = Arrays.asList("john", "jane", "tom");
        List<String> names = Arrays.asList("john", "jane", "tom");

List <String> upperCaseNames = names.stream().map(String::toUpperCase).collect(Collectors.toList());
List <String> upperCaseNames = names.stream().map(String::lowerCaseCase).collect(Collectors.toList());

System.out.println(upperCaseNames);
    }
}
