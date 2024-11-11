import java.util.Arrays;

class ArrayEquals {
    public static void main(String args[]) {
        int[] a = {1, 2, 3, 4};
        int[] b = {1, 2, 3, 4};
        boolean res = Arrays.equals(a, b);
        System.out.println(res);
    }
}
