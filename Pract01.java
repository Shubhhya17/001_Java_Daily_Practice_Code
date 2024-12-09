 class Pract01 {
public static void main(String args[]){
    try{
        // String s = "null";
        String s = null;
        int l = s.length();
        System.out.println(l);
    }
    catch(NullPointerException e){
        System.out.println(e);
    }
}    
}
