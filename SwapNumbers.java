import java.util.Scanner;

public class SwapNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter first number: ");
        int a = scanner.nextInt();
        
        System.out.print("Enter second number: ");
        int b = scanner.nextInt();
        
        int temp = a;
        a = b;
        b = temp;

        System.out.println("After swapping using third variable:");
        System.out.println("First number: " + a);
        System.out.println("Second number: " + b);

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("After swapping without third variable:");
        System.out.println("First number: " + a);
        System.out.println("Second number: " + b);

    
    }
}
