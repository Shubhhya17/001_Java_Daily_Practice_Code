class ArrayEx {
    public static void main(String args[]) {
        int[] a = new int[4];
        a[0] = 2;
        a[1] = 3;
        a[2] = 4;
        a[3] = 5;
        System.out.println(a); // Memory Addrs

        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);// Value
        }
    }
}
