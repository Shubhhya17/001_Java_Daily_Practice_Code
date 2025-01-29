// number is prime or not
public class Logic28 {
    public static void main(String args[]){

        int no = 12;
        int temp = 0;

        for(int i = 2; i<=no-1; i++){
            if(no % i == 0){
                temp++;

            }
        }
            if(temp > 0){
                System.out.println("Not a  number.");
            }
            else{
                System.out.println(" Prime number.");

            }
        


    }
}
