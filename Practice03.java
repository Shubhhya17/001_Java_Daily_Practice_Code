// .Write a java program to reverse of a number.
//   I/p int n=123
//   O/p  321
class Practice03 {
    public static void main(String args[]){
       int n = 12323;
       int reverse = 0;

       while(n != 0){
        int LastDigit = n % 10;
        reverse = reverse *10 + LastDigit;
        n /= 10;
       }
       System.out.println(reverse);
    }
}
