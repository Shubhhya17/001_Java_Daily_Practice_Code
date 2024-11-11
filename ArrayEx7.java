/*5.Write a java program to count even numbers of an array. 
I/p int[] a={1,2,3,4,5};
O/P  2*/

class ArrayEx7 {
    public static void main(String args[]) {
        int count = 0;
        int[] arr = { 10, 12, 13, 14, 15 };
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                count++;
            }
        }
        System.out.println(count);
    }
}
