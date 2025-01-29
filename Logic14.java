//Bigger Number in two values 
import java.util.Scanner;

public class Logic14 {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int a = sc.nextInt();
        
        System.out.print("Enter the Number: ");
        int b = sc.nextInt();

        if(a > b ){
            System.out.println("This " + a+ " is the Greater Value");
        }else if(a < b ){
            System.out.println("This " + b+ " is the Greater Value");
        }else{
            System.out.println("The Number are Equals");
        }
}
}
