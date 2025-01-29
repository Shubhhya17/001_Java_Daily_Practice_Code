// 12.Write a java program to print factorial of a number.
//   I/p int n=5
//   O/p  120
public class Logic26 {
    public static void main(String args[]){
        int num = 5;
        int fact = 1;
        for(int i = 1; i<=num; i++){
            fact *= i;
        }
        System.out.println(fact);
    }
}
