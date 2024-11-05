// Write a java program to find big number between 4 numbers?
public class GreaterInFourNum {
    public static void main(String [] args){
        int w = 30;
        int x = 40;
        int y = 10;
        int z = 70;

        if((w>x)&&(w>y)&&(w>z)){
            System.out.println(w + " is a Greater Value.");
        }
        else if((x>y)&&(x>z)){
                System.out.println(x + " is a Greater Value");
            }else if(y>z){
                System.out.println(y + " is Grater VAlue");
            }else{
                System.out.println(z + " is Grater VAlue");
                
            }


        
    }
}
