class B{
    int a = 6;
}
class Ab extends B{
    int a = 10;
    void Display(){
        System.out.println(a);
    }
    public static void main(String args[]){
        Ab b1 = new Ab();
        b1.Display();
    }
}
