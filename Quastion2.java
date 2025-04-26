// int arr[] = {10,5,6,20,30}
// find first min, second min, first max, second max element

public class Quastion2 {
    public static void main(String args[]){
        int arr[] = {10,5,6,20,30};
        int min = arr[0];
        // int SecondMin = 0 ;
        for(int i= 0; i<=arr.length-1; i++){
            if(arr[i]<min){
                min = arr[i];
                
            }
        }
        System.out.println("min is "+min);
        // System.out.println("min is "+min);
        
        
        int max = arr[0];
        for(int i = 0; i<=arr.length-1; i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println("max is "+max);
        
    }
}
