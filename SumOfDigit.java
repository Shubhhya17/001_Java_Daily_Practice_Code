// Write a java program to print sum of digits of a number.(123)===>6
class SumOfDigit{
    public static void main(String [] args){
        int num = 123;
        int sum = 0;

        while(num>0){
            int rem = num % 10;
            sum=sum+rem;
            num = num /10;
        }
        System.out.println(sum);
    }
}