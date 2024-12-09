class Poly01 {
   void m1(int a){
        System.out.println("Shubham is Here");
    }
   void m1(float b ){
        System.out.println("Shubham is Not Here");

    }
    public static void main(String args[]){
        Poly01 pn = new Poly01();
        pn.m1(10.0f);
    }
}
