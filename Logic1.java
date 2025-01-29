class Logic1 {
public static void main(String args[]){
    int[] arr = {1,2,3,4,5};
    int res = 0;

    for(int element : arr){
        res = res + element;
    }
    System.out.println("Sum of elements " + res);
}    
}
