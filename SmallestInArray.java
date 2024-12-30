public class SmallestInArray {
    public static void main(String[] args) {
        int[] a = {12, 34, 45, 65, 67};

        // Assume the first element is the smallest
        int smallest = a[0];

        // Iterate through the array to find the smallest number
        for (int i = 1; i < a.length; i++) {
            if (a[i] < smallest) {
                smallest = a[i];
            }
        }

        System.out.println("The smallest number in the array is: " + smallest);
    }
}
