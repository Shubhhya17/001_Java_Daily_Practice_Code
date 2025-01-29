// public class Logic33 {
//     public static void main(String args[]) {
//         int arr[] = {1, 2, 4, 4, 5, 6}; // Input array
//         int min = arr[0]; // Assume the first element is the minimum

//         // Loop through the array to find the minimum
//         for (int i = 1; i < arr.length; i++) {
//             if (arr[i] < min) {
//                 min = arr[i]; // Update min if a smaller element is found
//             }
//         }

//         System.out.println("Minimum number: " + min);
//     }
// }

class Logic33{
    public static void main(String args[]){
        int arr[] = {43,23,54,43};
        int min = arr[0];

        for(int i = 1; i<arr.length; i++){
            if(arr[i]> min){
                min = arr[i];
            }
        }
        System.out.println(min);
    }
}
