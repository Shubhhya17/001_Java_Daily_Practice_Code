//SingleLevel Inheritance
// 1 sub class is derived from 1 super class 

class Mingle{
    int amount = 1;
}
class SingeInheritance extends Mingle{
    int Secmout = 2;

    public static void main(String args[]){
        SingeInheritance s1 = new SingeInheritance();
        System.out.println(s1.amount);
        System.out.println(s1.Secmout);

        Mingle m1 = new Mingle();
        System.out.println(m1.amount);
       
        
    }
}
