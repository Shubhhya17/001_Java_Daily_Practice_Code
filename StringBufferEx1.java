public class StringBufferEx1 {
    public static void main(String args[]){

        //! By default capacity is 16 Check 

        
        // StringBuffer sb = new StringBuffer();
        // System.out.println(sb.capacity());

        // sb .append("Hellodfddddddddddddddd");
      
        StringBuffer sb = new StringBuffer("Shubham Pawar");
        // System.out.println(sb.length());

        StringBuffer s = new StringBuffer("Shubham");
        StringBuffer p = new StringBuffer("Pawar");

        System.out.println(s.equals(p));
        System.out.println(s==p);





    }
}
