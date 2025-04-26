public class StaticMethod2 {

    public static void cube(){
        int x = 5;
        int y = x * x * x;
        System.out.println("Cube of a number: "+y);
    }
    public static void cube2(int x){
        int y = x * x * x;
        System.out.println("Cube of a Number: "+y);
    }
    public static int cube3(){
        int x = 7;
        int y = x * x * x;
        return y;
    }
    public static int cube4(int x){
        int y = x * x * x;
        return y ; 
    }

    public static void main(String args[]){
        cube();
        cube2(6);
        int res1 =cube3();
        System.out.println("Cube is "+ res1);
        int res2 = cube4(10);
        System.out.println("Cube of "+ res2);

    }
}
