public class Logic23 {
    public static void main(String args[]) {
        int n = 1253;
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            sum += digit * digit;
            n /= 10;

        }

        System.out.println(sum);

    }
}
