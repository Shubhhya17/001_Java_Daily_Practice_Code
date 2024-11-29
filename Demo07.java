class A{
    void m1(int a , int b){
        System.out.println("A Demo");
    }
}

class Demo07 {
    void m1(int a, int b){
        System.out.println("B Demo");
        
    }
    public static void main(String args[]){
        Demo07 d1 = new Demo07();
        d1.m1(1, 2);
    }
}
