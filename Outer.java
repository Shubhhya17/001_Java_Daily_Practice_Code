class Outer {
    void m1() {
        System.out.println("m1 is in Outer class");
    }
    class Inner{
        void m2(){
            System.out.println("m2 is in Outer class");
        }
    }
    public static void main(String args[]){
        Outer o1 = new Outer();
        o1.m1();

        Outer.Inner i1 = o1.new Inner();
        i1.m2();
    }
}
