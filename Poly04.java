// class A {
//     final void display() {
//         System.out.println("This is Dislay 1");
//     }
// }

// class Poly04 {
//     void display() {
//         System.out.println("This is Display 2");
//     }

//     public static void main(String args[]) {
//         // A a1 = new A();
//         Poly04 a1 = new Poly04();
//         a1.display();
//     }
// }


class A
{
   static void display()
    {
        System.out.println("Display in A");
    }
}
// class B extends A // It will give an Error 
class B // it is Correct code Becouse Static cant be overide
{
    void display()
    {
        System.out.println("Display in B");
    }
    public static void main(String[] args)
    {
        A a1=new A();
        a1.display();
        
        // ==================================>error
    }
}





