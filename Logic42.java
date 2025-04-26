public class Logic42 {
    public static void main(String[] args) {
        //Factorial of a number
        // 5! = 5*4*3*2*1 = 120
    int no = 5;
    int fact = 1;

    for(int i =1; i<=no; i++){
        fact *= i;
    }
    System.out.println("Factorial of "+no+" is: "+fact);
}
}
