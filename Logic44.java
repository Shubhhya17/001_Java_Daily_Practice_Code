public class Logic44 {
    public static void main(String args[]) {
        int a = 10;
        int b = 20;

        System.out.println("Before Swapping" + a + b);
        a = a+ b;
        b = a- b;
        a = b-a;

        
        System.out.print("After Swapping"+ a + b);
    }
}
