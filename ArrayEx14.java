// Target Sum Values 
class ArrayEx14 {
    public static void main(String args[]) {
        int[] a = {2,3,4,5,6,1,2,7};
        int target = 7;
        for(int i = 0; i<a.length; i++){
            for(int j = i+1; j<=a.length-1; j++){
                if(a[i] + a[j] == target){
                    System.out.println(a[i]+ " " +a[j]);
                }
            }
        }  
    }
}
