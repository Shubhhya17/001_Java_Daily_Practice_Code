public class Pract04 {
public static void main(String args[]){
    try {
        int a = 10 ;
        int b = 0;
        System.out.println(a/b);
    }catch(ArithmeticException e){
        System.out.println(e);

    }finally{
        System.out.println("This is Closing tag");
    }
}
    
}