public class Logic27 {
    public static void main(String[] args) {

        int no = 153;
        int t1 = no;
        int leng = 0;

        //* We Got the Lenght of Value */
        while (t1 > 0) {
            leng += 1;
            t1 /= 10;
        }
        //**************************** */ 

        int t2 = no;
        int arm = 0;
        int rem;

        while (t2 != 0) {
            int mul = 1;
            rem = t2 % 10;

            for (int i = 1; i <= leng; i++) {
                mul = mul * rem;
            }
            arm = arm + mul;
            t2 /= 10;
        }



    }
}
