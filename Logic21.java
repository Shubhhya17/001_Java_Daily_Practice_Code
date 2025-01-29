// 4.Write a java program to print 5 table.

import java.util.*;
public class Logic21 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int num = sc.nextInt();
        int value = 1;
        while(value <= 10){
            int table =  num * value;
            System.out.println(table);
            value++;
        }
    }
}
