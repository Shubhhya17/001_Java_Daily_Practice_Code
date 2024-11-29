class A{
    void m1(int a , int b){
        System.out.println("A Demo");
    }
}

class Demo07 extends A {
    void m1(int a, int b){
        System.out.println("B Demo");
        
    }
    public static void main(String args[]){
       //Demo Prints
        // Demo07 d1 = new Demo07();
        // d1.m1(1, 2);

        //Class A 
        // A a = new A();
        // a.m1(1,2);
    }
}
