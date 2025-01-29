//! Even Or Odd Pragram 
import java.util.Scanner;
public class Logic13 {
    public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int s = sc.nextInt();

        if(s % 2 == 0){
            System.out.println("The "+ s + " is Even Value");
        }else{
            System.out.println("The "+ s + " is Odd Value");
        }
    }
}
