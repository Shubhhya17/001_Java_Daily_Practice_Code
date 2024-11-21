class A {
    String s1 = "SSrajmouli";
}

class Demo01 extends A {
    String s1 = "Shankar";
    void show(){
        System.out.println(s1);
        System.out.println(super.s1);
    }
public static void main(String args[]){
    Demo01 d = new Demo01();
    d.show();
}    
}
