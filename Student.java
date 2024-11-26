class Student {
      Student(){
        System.out.println("Virat");
      }  
      Student(int x){
        this();
        System.out.println("Dhoni");
      }
      Student(String s )
      {
        this(7);
        System.out.println("Sachin");
      }
      public static void main(String[] args) {
        Student s1 = new Student("Java");
      }
}
