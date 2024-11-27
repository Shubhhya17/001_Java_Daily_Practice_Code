abstract class A {
    abstract void m1();
}
class B extends A {
    void m1(){
        System.out.println("M1 in B");
    }
}
class Test01 {
    public static void main(String args[]){
        A a1 = new B();
        a1.m1(); 
    }
}
