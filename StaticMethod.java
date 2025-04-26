// static methods are decleared inside the class with static modifier
// We will access  




public class StaticMethod {
    
    public static void square1(){
        int x = 10;
        int y = x * x;
        System.out.println("Square of a Number is : "+y);
    }
    public static void square2(int x){
        int y = x * x;
        System.out.println("Square of a number is: "+y);
    }
    public static int square3(){
        int x = 5;
        int y = x * x;
        return y;
    }
    public static int square4(int x){
        
        int y = x * x; 
        return y;
    }



    public static void main(String args[]){
        square1();
        square2(12);
        int res = square3();
        System.out.println("Square of a numebr :"+res);

        int res2 = square4(15);
            System.out.println(" Squre:"+res2);
        

    }
}
