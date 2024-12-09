class Poly_Calculate {
    void add(int a, int b) {
        System.out.println("Addition of a and b : " + a + b);

    }

    void add(int a, int b, int c) {
        System.out.println("Addition of a , b and c:" + (a + b + c));
    }

    void add(int a, int b, int c, int d) {
        System.out.println("Addition of a , b ,c d: " + (a + b + c + d));
    }

    public static void main(String args[]) {
        Poly_Calculate pc = new Poly_Calculate();
        pc.add(1, 2, 4, 10);
    }
}
