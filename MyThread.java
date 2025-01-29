public class MyThread extends Thread {
        public void run() {
            int Thread = 100;
            System.out.println(Thread);
        System.out.println("Thread is running!");
    }

    public static void main(String[] args) {
        MyThread t = new MyThread();
        t.start(); 
    }
}
