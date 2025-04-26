class logic39 {
    public static void main (String args[]){

        int num = 121;
        int org = num;
        int reversed = 0;

        while (num != 0){
            int digit = num%10;
            reversed = reversed * 10 + digit;
            num = num/10;
        }

        if( reversed == org){
            System.out.println(" number is palindrom");
        }
        else{
            System.out.println("number not a palindrom"); 
        }
    }
}
