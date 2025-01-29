import java.util.*;
public class Logic10 {
   public static void main(String args[]){
    int[] fib = new int[6];
    int n1 = 3;
    fib[0] = n1;
    fib[1] = n1-1+n1;
    for(int i = 2; i<fib.length; i++){
        fib[i] = fib[i-1] + fib[i-2];
    }
    System.out.println(Arrays.toString(fib));
   } 
}
