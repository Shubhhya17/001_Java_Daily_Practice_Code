class Logic5 {
    public static void main(String args[]){
        int[] arr = {101,201,301,401,501};
        int i=0;
        for(int element:arr){
            int rev = 0;
            while(element !=0){
                int rem = element%10;
                rev=rev*10+rem;
                element=element/10;
            }
            arr[i++] = rev;   
        }
        z
    }    
}
