import java.util.*;
class PalindromeOrNot {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int num = sc.nextInt();
        
        int original = num;
        int reverse = 0;

        while(num!=0){
            int digit = num % 10; // for Last Digit
            reverse = reverse * 10 + digit;
            num = num / 10;
        }
        if(original == reverse){
            System.out.println(original + " is a Palindrome");
        }else{
            System.out.println(original + " is a Not Palindrome");
        }


    }
}
