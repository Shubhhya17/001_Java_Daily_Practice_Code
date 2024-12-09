public class Pract10 {

    void m1() throws Exception{
        System.out.println("I am in m1.");
        Thread.sleep(1000);
        m2();
        Thread.sleep(1000);
        m3();
    }
    void m2() throws Exception{
        System.out.println("I am in m2.");
    }
    void m3() throws Exception{
        System.out.println("I am in m3.");
    }
    public static void main(String args[]) throws Exception{
        Pract10 pn = new Pract10();
        pn.m1();
    }
}
