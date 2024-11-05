class NumberDigit {
    public static void main(String args[]){
        int num = 123;
        int cd =0;
        while(num>0){
            int rem = num % 10;
            cd = cd+1;
            num = num/10;

        }
        System.out.println(cd);
    }
}
