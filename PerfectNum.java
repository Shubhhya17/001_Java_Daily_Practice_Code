class PerfectNum {
    public static void main(String[] args) {
        int num = 6;
        int on = num;
        int sum = 0;

        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                sum = sum + i;
            }

        }
        if (sum == on) {
            System.out.println(num + " Perfect Number");
        } else {
            System.out.println(num + " Not Perfect Number");
        }

    }
}
