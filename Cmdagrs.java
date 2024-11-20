import java.util.Arrays;

class Cmdagrs {

    void show(int... a) {
        System.err.println(a);
        System.err.println(Arrays.toString(a));
    }

    public static void main(String[] args) {
        Cmdagrs s = new Cmdagrs(); 
        s.show(1, 2, 3, 4);
    }
}
