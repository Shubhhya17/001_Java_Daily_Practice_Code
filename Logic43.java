public class Logic43 {
    public static void main(String args[]) {

        int n = 235;
        int lastDigit = n % 10;

        int firstDigit = n;
        while (firstDigit >= 10) {
            firstDigit = firstDigit / 10;

            int sum = firstDigit + lastDigit;
            System.out.println(sum);
        }
    }
}
