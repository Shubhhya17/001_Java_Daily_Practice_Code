// Write a java program to count number of digits of a number.(123)==>3

public class CountDigitNum {
    public static void main(String[] args){
        int num = 123;
        int cd  = 0;

        while (num>0) {
            int rem = num%10;
            cd = cd+1;
            num = num /10;
        }
        System.err.println(cd);
    }
}