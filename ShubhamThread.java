class ShubhamThread extends Thread {
public void run(){
    for(int i = 1; i<=10; i++){
        System.out.println("Shubham Thread");
        try{
            Thread.sleep(1000);
        }
        catch(InterruptedException  e){

        }
    }
}
public static void main(String[] args) {
    ShubhamThread s = new ShubhamThread();
    s.start();
    // s.yield();
    for(int i = 1; i<=10; i++){
        System.out.println("AnithaThread");
    }
}
    
}