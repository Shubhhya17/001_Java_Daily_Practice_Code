public class Pract06 {
    void principle() {
        try{
        System.out.println("Principle is Important");
        Thread.sleep(2000);
        Teacher();
    }catch(Exception e){
        System.out.println(e);
    }
}
    void Teacher(){
        System.out.println("Teacher is Important");
        Student();
    }
    void Student(){
        System.out.println("Student is Important");
    }


    public static void main(String args[]){
        Pract06 pn = new Pract06();
        pn.principle();

    }
}
