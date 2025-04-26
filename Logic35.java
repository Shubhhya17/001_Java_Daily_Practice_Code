class Logic35{
    public static void main(String args[]){
        int num = 121;
        int or = num;
int reversed = 0;
        while(num != 0){
            int digit = num % 10; // Extracting the last value;
            reversed = reversed * 10 + digit;
            num = num / 10;
        }
        System.out.println((or == reversed) ? "Palindrome" : "Not Palindrome");

    }
}
