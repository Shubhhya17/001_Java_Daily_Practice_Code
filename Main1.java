// // // Write a java program to print even numbers in left side and odd numbers in right side.

// // // I/p int[] a={1,2,3,4,5,6,,7,8,10}
// // // o/p  2,4,6,8,10,9,7,5,3,1

// // class New{
// //         int b = 10;
// // }
// // class Practice07 {
      
// //         public static void main(String[] args){
// //          int a = 10;
// //          System.out.println(a++);
// //         }
        
        
           
// // }
//  class NormalMethodExample {
//         int d = 10;
        
//         public int addNumbers(int a, int b) {
//             return a + b;
//         }
    
//         public static void main(String[] args) {
//             // Create an object of the class to call the method
//             NormalMethodExample example = new NormalMethodExample();
//         int d = 20;
//             int result = example.addNumbers(10, 20);
//             int result1 = example.addNumbers(20, 20);
//                 this.a;
    
//             // Print the result
//             System.out.println("The sum is: " + result);
//             System.out.println("The sum is: " + result1);
//         }
//     }
    


class Parent {
        Parent() {
            System.out.println("Parent class constructor called");
        }
    }   
    class Child extends Parent {
        Child() {
            super(); // Calls the parent class constructor
            System.out.println("Child class constructor called");
        }
    }  
    public class Main {
        public static void main(String[] args) {
            Child child = new Child();
        }
    }
    













    class Animal {
        void sound() {
            System.out.println("Animal makes a sound");
        }
    }
    
    class Dog extends Animal {
        void sound() {
            System.out.println("Dog barks");
        }
    }
    
    class Cat extends Animal {
        void sound() {
            System.out.println("Cat meows");
        }
    }
    
    public class Main {
        public static void main(String[] args) {
            Animal animal = new Dog();
            animal.sound();
    
            animal = new Cat();
            animal.sound();
        }
    }

    class A
{
    void add(int a,int b)
    {
        System.out.println("welcome to java");
    }
    void add(int c, String b)
    {
        System.out.println("welcome to python");
    }
    public static void main(String[] args)
    {
        A a1=new A();
        a1.add(1,"shubh");==========================>welcome to java
        
    }
}








class A
{
	void add(int a )
	{
		System.out.println("Virat kohli");
	}
	
}
class B extends A
{
	void add(int a)
	{
        
		System.out.println("Sachin Tendulkar");
	}
	public static void main(String[] args)
	{
		B b1=new B();
		b1.add();==========================================>scahin Tendulakar
	}

}