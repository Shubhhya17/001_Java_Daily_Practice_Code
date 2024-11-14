public class StringRev2 {
    public static void main(String args[]){
        String s = "maswam";
        String rev = "";
        for(int i = s.length()-1; i>=0; i-- ){
            rev +=s.charAt(i);
            System.out.println(rev);
        }
        if(s.equals(rev)){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not a Palindrome");
        }
        
        System.out.println(rev);


    }
}
