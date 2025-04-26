// write a java program to check year is leap or not
public class Logic45 {
   public static void main(String args[]){
    int num = 2024; 
    
    if (num % 4 == 0) { 
        if (num % 100 == 0) {
            System.out.println("Not a leap year");
        } else {
            System.out.println("Leap year");
        }
    } 