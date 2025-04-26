import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
public class Collection3 {
    public static void main(String args[]){
        List<Integer> numbers = Arrays.asList(5,3,6,0,9);

List<Integer> sortedNumbers = numbers.stream().sorted().collect(Collectors.toList());

System.out.println(sortedNumbers);

    }
}
