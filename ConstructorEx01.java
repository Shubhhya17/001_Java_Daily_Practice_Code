class SuperEx{
    int sno;
    String sname;
    String sid;

    SuperEx(int sno, String sname, String sid){
        this.sno= sno;
        this.sname=sname;
        this.sid=sid;
    }
}
class ConstructorEx01 extends SuperEx{
    public String a;
    
        public static void main(String args[]){
            ConstructorEx01 ex = new ConstructorEx01();
            System.out.println("Value of a: " + ex.a);
        System.out.println("Value of b: " + ex.b);
        System.out.println("Value of c (a / b): " + ex.c);
    }
    }
}