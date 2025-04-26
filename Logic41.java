class Logic41{
    public static void main(String[] args) {
        

        int n = 193;
        int num = 0;
        int temp = n;
        int sum = 0;
        while(temp > 0 ){
            int digit = temp % 10;
            sum += digit * digit;
            temp /=10;

        }
        System.out.println(sum);
    }
}