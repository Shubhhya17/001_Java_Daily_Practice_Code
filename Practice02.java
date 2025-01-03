// Write a java program to print sum of the digits of a number.
//   I/p int n=123
//   O/p  6
public class Practice02 {
    public static void main(String args[]){
        int n = 1223483;
        int sum = 0;

        while(n != 0){
            sum += n % 10;
            n /= 10;
        }
        System.out.println(sum);
    }
}
