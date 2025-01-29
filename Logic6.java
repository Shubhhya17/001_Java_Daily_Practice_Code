import java.util.*;
public class Logic6 {
    public static void main(String args[]){
        int[] arr = {1,10,2,20,3,30,4,40,5,50};

        int[] new_arr = new int[arr.length/2];

        for(int i = 0; i<new_arr.length; i++){
            new_arr[i] = arr[i] + arr[arr.length-1-i];
        }
        System.out.println(Arrays.toString(new_arr));
    }
}
