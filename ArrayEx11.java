// Copying the value from a to b veriable
class ArrayEx11 {
    public static void main(String args[]){

        int[] a = {10,20,30};
       
        int[] b = new int[a.length];
        for(int i=0; i<a.length; i++){
            b[i] = a[i];
        }
        for(int j = 0; j<b.length; j++){
        
            System.out.println(b[j]);
        }
    }
}
