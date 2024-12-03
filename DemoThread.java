interface I1{

}
class DemoThread implements Runnable,I1{
    public void run(){
        System.out.println("Thread is running");
    }
    public static void main(String[] args) {
        DemoThread dt=new DemoThread();
        Thread t=new Thread(dt);
        t.start();
    }
}
