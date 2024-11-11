// 3.Write a java program to add 1st and last element of an array.
//  I/p int[] a={1,2,3,4,5};
//  O/P  6
class ArrayEx5 {
   public static void main(String args[]){
    int[] a = {12,23,44,54};
    int  y = a[0];
    int z = a[a.length-1];

    System.out.println(y);
    System.out.println(z);
    int res = y + z;
    
    System.out.println(res);
   } 
}
