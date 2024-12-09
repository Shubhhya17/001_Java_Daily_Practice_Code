class Poly02 {
void add(int a , String b){
    System.out.println("This is First BLock");
}    
void add(String b, int a){
    System.out.println("This is String Block");
}
public static void main(String args[]){
    Poly02 pn = new Poly02();
    pn.add( 10, "shubh");
}
}
