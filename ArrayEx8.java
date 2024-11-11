// 6.Write a java program to print sum of the elements array elements.
//  I/p int[] a={1,2,3,4,5};
//  O/P  15
class ArrayEx8 {
    public static void main(String args[]) {
        int[] arr = { 10, 20, 30, 40};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {

            // sum += arr[i];
            sum = sum + arr[i];
        }
        System.out.println(sum);
    }

}
