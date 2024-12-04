class UserThread extends Thread {
    public void run() {

    }
}
class Test08{
    public static void main(String[] args) {
        UserThread u1 = new UserThread();
        System.out.println(u1.getName());
        System.out.println(u1.isDaemon());
        u1.setDaemon(true);
        System.out.println(u1.isDaemon());
    }
}