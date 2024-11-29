class Demo04 {
    void m1(int a, String b) {
        System.out.println("this is First M1");
    }

    void m1(String a, int b) {
        System.out.println("This is Second M2");
    }

    public static void main(String shubh[]) {
        Demo04 d1 = new Demo04();
        d1.m1(100, "Shubh");
    }
}
