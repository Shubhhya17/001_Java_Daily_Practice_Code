//!3.Write a java program to check big number among 3 numbers.

import java.util.Scanner;

public class Logic15 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the First Value: ");
        int a = sc.nextInt();
        System.out.print("Enter the Second Value: ");
        int b = sc.nextInt();
        System.out.print("Enter the Third Value: ");
        int c = sc.nextInt();

        if(a> b && a > c){
            System.out.println(a + " is the Greater Value");
        }else if(b>c){
            System.out.println(b+ " is the Greater Value");
        }else if(a == b && b == c){
            System.out.println("All Value are Same.");
        }else{
            System.out.println(c+ " is the Grater Value");
        }
    }
}
