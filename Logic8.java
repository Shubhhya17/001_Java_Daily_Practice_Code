// public class Logic8 {
//     public static void main(String[] args) {
//         for (int i = 0; i <= 100; i++) {
//             int number = i, reverse = 0;
//             while (number > 0) {
//                 reverse = reverse * 10 + number % 10;
//                 number /= 10;
//             }
//             if (reverse == i) System.out.print(i + " ");
//         }
//     }
// }

class Logic8{
    public static void main(String args[]){
        int num = 111;

        int temp = num; 
        int rev = 0;
        while(num!=0){
            int last = num%10;
            rev = rev * 10 +last;
            num = num /10;

        }
        System.out.println(temp == rev ? "Palindrome" : "Not Palindrome");
    }
}
