class Emp{
    Emp(int a){
        System.out.println("Pavan");
    }
}
class Student1 extends Emp{
    Student1(){
        super(67);
        System.out.println("Mahesh");
    }
    public static void main(String[] args) {
        Student1 s1 = new Student1();
    }
}
