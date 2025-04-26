class Car{
    String Model;
    Car(String m ){
        Model = m;
        System.out.println("This is Car Class" + m);
    }
}

public class ConstructorEx06 {
    public static void main(String args[]){

        Car c = new Car(" Shubham");
    }
}
