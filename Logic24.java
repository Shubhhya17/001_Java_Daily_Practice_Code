// 9.Write a java program to print sum of cubes of a number.
//   I/p int n=123
//   O/p  36
public class Logic24 {
    public static void main(String args[]){
        int num = 234;
        int sum = 0;

        while(num>0){
            int digit = num % 10;
            sum += digit*digit* digit;
            num /= 10;
        }
        System.out.println(sum);
    }
}
