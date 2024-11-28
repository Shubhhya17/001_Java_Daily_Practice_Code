class Student {
    private int sno;
    private String sname;
    public void setsno(int sno){
        this.sno = sno;
    }
    public void setsname(String sname){
        this.sname = sname;
    }
    public void getSno(){
        System.out.println(sno);
    }
    public void getSname(){
        System.out.println(sname);
    }
     class Teacher{
        public static void main(String[] args) {
            Student s1 = new Student();
            s1.setsno(200);
            s1.setsname("Shubham");
            s1.getSno();
            s1.getSname();

        }
    }
}