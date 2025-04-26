// Perticular bussiness Logic called as Method.
// ! Or 
// Method are used to reused the Bussiness Logic

// types of method
// *****************
// instance Methods
// Instance Method are declared inside the Claas
// We will Access instance methods with help of class Objects
// Syntax: 
// modifiers returnTypes methodname(datatypes parameters){
    //bussiness Logic
// }


public class Method {
    public void add(){
        int num1 = 200;;
        int num2 = 300;
        int res = num1 + num2;
        System.out.println("Addition is: "+res);
    }
    public void add2(int x , int y){
        int res = x+y;
        System.out.println("Addition is: "+res);
    }

    public int add3(){
        int num1 = 500;
        int num2 = 400;
        int res = num1 + num2;
        return res;
    }
    public int add4(int x, int y) {
        int res = x + y;
        return res;
    }
// ***************************************************

    public void sub(){
        int num1 = 400;
        int num2 = 300;
        int res = num1 - num2;
        System.out.println("Subtraction is: "+res);
    }

public void sub2(int x, int y){
    int res = x - y;
    System.out.println("Subtraction is: "+res);
}

public int sub3(){
    int num1 = 400;
    int num2 = 300;
    int res = num1 - num2;
    return res;
}

public int sub4(int x, int y){
    int res = x - y;
    return res;
}
// *****************************************





//? ############################################
    public static void main(String[] args) {
        Method m = new Method();
//! ________________________________
        m.add();
        m.add2(700, 200);
        m.add3();
        System.out.println("Addition is: "+m.add3());
        m.add4(500, 200);
        System.out.println("Addition is: "+m.add4(100, 200));
// !________________________________________
        m.sub();
        m.sub2(700, 200);
        m.sub3();
        System.out.println("Subtraction is: "+m.sub3());
        int a = m.sub4(900,700);
        System.out.println("Subtraction is: "+a);
// !________________________________________


    }


}
