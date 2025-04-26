public class MainReverseNumber {
    public static void main(String args[]){

    
    int num = 203;

    while(num != 0){
        int digit = num % 10;
        int resevse = resevse * 10 + digit;  
        num /=10;
    }
}
}
