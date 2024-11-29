class Motor {
    void show() {
        System.out.println("Hii Motor");
    }
}

class Car extends Motor {
    void go() {
        System.out.println("This is Car Class");
    }
}

class InheritanceEx extends Motor {
    void Demonstration(){
    Car c1 = new Car();
    c1.go();

    }
    public static void main(String args[]){
        InheritanceEx i1 = new InheritanceEx();
        i1.Demonstration();
        i1.show();
       
    }
}
