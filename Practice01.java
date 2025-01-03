// .Write a java program to count digits of a number.
//   I/p int n=123
//   O/p  3
class Practice01{
    public static void main(String args[]){
        int n = 123234;
        int count = 0;

        while(n != 0){
            n /= 10;
            count++;
        }
        System.out.println(" Count VAlue is " + count);
    }
}
