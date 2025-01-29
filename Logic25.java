// 10.Write a java program to add 1st and last digits of a number.
//   I/p int n=1234
//   O/p 5

public class Logic25 {
    public static void main(String[] args) {
        int num = 2312329;
        int last = num % 10;

        int first = num;
        while(first >= 10){
            first /=10;
        }
        int sum = first + last;
        System.out.println(sum);
       

        
    }
}
