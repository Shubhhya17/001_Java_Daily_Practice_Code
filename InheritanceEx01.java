class SuperEx{
    int a = 10;
    int b = 20;
    int c = a/b;
}
public class InheritanceEx01 extends SuperEx {
    public static void main(String args[]){
        SuperEx ex = new SuperEx();
        // InheritanceEx01 ex = new InheritanceEx01();
        System.out.println("Hello");
        System.out.println(ex.c);
    }
}
