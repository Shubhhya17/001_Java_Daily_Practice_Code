class ThisEx {
    int x = 7;

    void m1() {
        int x = 9;
        System.out.println(this.x);
    }

    public static void main(String args[]) {
        ThisEx ex = new ThisEx();
        ex.m1();
    }
}
