// 4.Write a java program to print even numbers of an array
//  I/p int[] a={1,2,3,4,5};
//  O/P  2 4
class ArrayEx6 {
    public static void main(String args[]) {
        int[] a = { 10, 21, 35, 40, 53 };
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                System.out.println(a[i]);
            }

        }
    }
}
