//! 3.Write a java program to reverse of a number.
//!   I/p int n=123
//!   O/p  321

public class Logic20 {

    public static void main(String args[]) {
        int num = 123;
        int reverse = 0;
            while (num != 0) {
            int digit = num % 10;
            reverse = reverse * 10 + digit;
            num /= 10;
        }
        System.out.println(reverse);
    }
}
