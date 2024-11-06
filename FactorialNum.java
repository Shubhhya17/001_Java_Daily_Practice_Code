class FactorialNum {
    public static void main(String args[]) {
        int n = 6;
        int factorial = 1;

        for(int i = 1; i <= n; i++) {
            factorial *= i;
        }

        System.out.println("Factorial of " + n + " is: " + factorial);
    }
}

