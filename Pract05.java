public class Pract05 {
    void m1() throws Exception{
        System.out.println("m1 called");
        Thread.sleep(2000);
        m2();
    }
    void m2() throws Exception{
        System.out.println("m2 called");
        Thread.sleep(2000);
        m3();
    }
    void m3() throws Exception{
        System.out.println("m3 called");
    }
    public static void main(String args[]) throws Exception{
        Pract05 pn = new Pract05();
        pn.m1();
    }
}
