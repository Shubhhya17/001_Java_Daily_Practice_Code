class Student2 {
    Student2(){
        System.out.println("dhoni");
    }
    Student2(int x){
        this("Python");
        System.out.println("Sachin");
    }
    Student2(String s){
        this();
        System.out.println("Rohit");
    }
    public static void main(String args[]){
        Student s1 = new Student(7);
    }
}
