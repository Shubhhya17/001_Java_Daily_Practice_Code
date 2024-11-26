abstract class A{
abstract void m1();
 void m2(){
    System.out.println("bye bye");
}
}
class B extends A{
    void m1(){
        System.out.println("m1 Logic from B to A");
    }
}

class Test {
 public static void main(String args[]){
    A a1 = new B();
    a1.m1();
    a1.m2();
 }   
}
