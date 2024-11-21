class AccessMoodifer {
    static int a = 200;
    void show(){
        int a = 100;
        System.out.println(a); // 100
        System.out.println(AccessMoodifer.a);// 200
    }
    public static void main(String args[]){
        AccessMoodifer d = new AccessMoodifer();
        d.show();
    }
}
