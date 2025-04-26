public class InstaceMethod11 {
    public void m1(){
        System.out.println("M1");
    }
    public void m2(){
        m1();
    }
    public static void main(String args[]){
        InstaceMethod11 obj1 = new InstaceMethod11();
        obj1.m2();
    }
}
